# PATCHES.md — 1.0.0 порт

## Подготовка декомпилята (скрипты в tools/decomp-fix/)
* fixpkg.py — классы из дефолтного пакета перенесены в `net.minecraft.client`; ссылки `.xx` -> `xx`.
* Классы `do` и `if` (ключевые слова Java) переименованы в `do_` / `if_`.
* autofix.py — декомпилятор не мог писать полные имена классов дефолтного пакета, поэтому
  `c.a()` перекрывалось одноимённым полем. В местах ошибок подставлены `net.minecraft.client.X.`;
  raw-типы в for-each обёрнуты в `(Iterable<T>)(Iterable)`.
* bridges2.py + вручную (agz, ahj, da, ji, jr) — добавлены потерянные bridge-методы
  (compareTo/compare/рендереры). Помечены `PATCH(bridge)`.
* Удалены AWT-лаунчеры ahy, nm, wp, ep, sj; MinecraftApplet заменён заглушкой.

* throwsfix.py — декомпилятор потерял `throws` почти везде (≈600 ошибок «unreported exception»):
  скрипт добавляет `throws` в окружающий метод и поднимает его по иерархии переопределений.
* Восстановлено вручную: Minecraft.a(String) (папка игры), ki.b(lp) (булевы опции),
  os.a(...) (ComponentStronghold.placeDoor), rx.a(an,Writer) (заглушка, Snooper не нужен).
* ahm (SoundManager) переписан поверх web/Sfx (window.Sounds); ng (скачивание ресурсов) — заглушка.
* Из Minecraft удалены AWT-лаунчеры; x() сделан public (WebMinecraft.runOneFrame).
* WorldStore: явные хуки changed() в as (RegionFile), e (level.dat), vx (NBT), ew (map/idcounts),
  gy, ki (options.txt), w (rename/delete) + резервное сканирование по (размер, mtime).
* WebTexturePack переведён на afs; WebMinecraft.saveWorldNow() = ry.a(true, null).
* Шимы: GL11 (+glFlush/glScaled/glGetInteger/glCopyTexSubImage2D/glTexGen*), GL13, ARBMultitexture,
  BufferUtils, PixelFormat, Cursor, GLU.gluUnProject, ImageIO.write (скачивание PNG), Clipboard.

## Состояние
Весь исходный код компилируется javac без ошибок (с заглушками org.teavm.* только для проверки).
Не проверено в браузере: сборка TeaVM, рендер, звук.

## TODO
* Ресурсы 1.0.0: в клиентском zip лежат terrain.png, font.txt, pack.png и др. — собрать assets.akrile.
* Мультиплеер: протокол 1.0.0 (version 22) — подключить RtcSocket в abp/ri/pn (сейчас netshim.Socket всегда отказывает);
  хост-режим на net.minecraft.server.MinecraftServer из серверного jar (классы сервера в отдельный пакет).
* Список текстур-паков (adk) должен включать TexturePackStore.list().
* glTexGen (портал Края), мультитекстура, Snooper (rx) — заглушки.

## Headless-проверка (tools/smoke)
* smoke.py <секунды> <папка сайта> — открывает сборку в headless Chromium (SwiftShader), печатает консоль и краш-лог.
* trace-exceptions.py — ловит исключения через CDP и переводит JS-стек в строки Java по mc100.js.map.
Найдено и исправлено: `index.html` грузил alpha126.js; TeaVM генерировал `d--0.0` из `-0.0F` (k.java);
`.lang` декодировался как картинка; Class.getResourceAsStream -> ResourceIO.
* Главный путь игры выполняется в JS-колбэке (rAF), не в зелёном потоке TeaVM: Thread.sleep/yield там падают
  ("thread is null"). Ограничитель FPS (adt), yield в кадре (Minecraft, xw) и ожидание потока статистики (jq)
  заменены на web/Threads (no-op). Фоновые потоки (сеть, статистика) остаются на настоящем Thread.
* shadow.py — тихие ошибки затенения: голое `c.b()` в декомпиляте означает КЛАСС c, но javac выбирал одноимённое
  ПОЛЕ (Minecraft.c = PlayerController) и код компилировался. Все `X.` где X — и класс, и поле экземпляра
  (в т.ч. унаследованное), заменены на полное имя (3 места, в т.ч. Minecraft.x(): `c.b()` -> AABB-пул).
  Случаи со статическими полями (311) проверены эвристикой на конфликт членов: реальных нет.
* GLRaw.copyTexSubImage2D: канвас alpha:false (RGB), текстура RGBA -> прямой copyTexSubImage2D невалиден (панорама меню
  рисовалась кубом 256x256 в углу). Копирование через blitFramebuffer во временный FBO.
* Рефлексия: TeaVM не умеет Constructor.newInstance без регистрации (мобы, тайл-сущности, пакеты, карты).
  Сгенерирована фабрика Reflect (genreflect.py), 9 мест вызова переведены на неё.
* netshim/RandomAccessFile: региональные файлы (as.java) работают в памяти; на ФС пишутся при close() и
  WorldStore.flush() -> RandomAccessFile.syncAll(). RandomAccessFile TeaVM поверх виртуальной ФС падал.
* tools/smoke/click-through.py — сценарий кликов ("click x y;wait s;shot name") для проверки меню/создания мира.

## Архитектура запуска (изменено)
* Игра идёт в зелёном потоке TeaVM "Game" (WebEntryPoint), между кадрами — Frames.next() (@Async rAF).
  Причина: любой метод, способный приостановиться (Thread.sleep/wait, контендные synchronized, Thread.start),
  TeaVM компилирует в корутину; вне потока он падает с "thread is null" (так падал ll.a() при сохранении мира,
  файловый поток ll/FileIO использует sleep).
* Экран генерации мира: Minecraft.e() (Building terrain) вызывает Frames.yieldIfDue() — кадр отдаётся браузеру
  каждые ~30 мс, прогресс xw.a(int) виден. Перед f.r() ("Simulating world") — Frames.next().
* Скины/плащи с s3.amazonaws.com не качаются (cw.run() пуст) — сервис закрыт и CORS; остаётся /mob/char.png.
* lb: кнопка "Open texture pack folder" отключена (file:// запрещён браузером).
* tools/smoke/BiomeTest.java.txt + JvmRes.java.txt — запуск генератора биомов на настоящей JVM для сравнения с TeaVM
  (на JVM для seed 1: ids 0:2403 2:6075 3:513 5:6927 6:647 7:455 11:99 12:1925; spawnBiomeHits=7574).

## Открыто
* "Unable to find spawn biome" в браузере (на JVM спавн-биом находится) и NPE `a is null` — разобрать после сборки.

## Диагностика (этап: мир создаётся, но рендер/биомы неверны)
* hs.b(): `this.c.getWidth()` падал (компонент-родитель null) -> центр берётся из Display (краш "reading 'dg'": dg = Canvas.getWidth).
* SelfTest (запуск в WebEntryPoint после init) печатает в консоль строки `SELFTEST ...`; эталон с JVM —
  tools/smoke/selftest-jvm-reference.txt. Расхождение укажет на TeaVM-специфичную арифметику.
* assets.akrile пересобран со звуками из Alpha-архива (`--sounds=`): 142 файла; в Alpha-наборе нет 42 из 88 имён
  звуков 1.0.0 (волки, жители, эндермены, еда, ...) — добавить через tools/add-sounds.mjs из оригинальных ресурсов 1.0.0.
* tools/smoke/gl-call-log.py — запись WebGL-вызовов в headless Chromium (кадр мира: ~417 draw, по одному на quad).
* Замечено: каждый кадр вызывается texImage2D 16x16 (утечка текстур?) — проверить.

## Результаты SelfTest (TeaVM vs JVM)
* Совпадают побитно: 64-битный LCG (long), слои биомов (гистограмма seed 1), время суток, float/int-касты, sr.a.
* НЕ совпадают: java.util.Random TeaVM (seed 1: nextInt(100) = 1, а на JVM 85) — миры отличались бы от настоящих.
  Заменено на web/JRandom (точная копия OpenJDK; сверено на JVM, 200k значений; расходится только nextGaussian
  на ~3% из-за Math.log vs StrictMath.log — последний бит). `new Random(` -> `new JRandom(` (55 мест).
* Math.round(-2.5): TeaVM -3, Java -2 -> web/JMath.round (21 место).
* JSBody: TeaVM переименовывает параметры скрипта в b..f и подставляет в текст; локальные `var v/f` затирали параметры
  (Fxaa.create: h стал WebGLShader -> "framebuffer incomplete: Attachment has no width or height").
  ПРАВИЛО: в @JSBody не использовать однобуквенные локальные имена (a..h). Исправлено в Fxaa, Screenshots.
* vh.a(): при null печатает `SPAWNDBG ...` (размеры, null/вне диапазона/в списке) для разбора "Unable to find spawn biome".

## Итоги прогона сборки с JRandom/FXAA-фиксом
* FXAA теперь включается (`FXAA: enabled (854x480)`).
* "Unable to find spawn biome" / "Placed stronghold in INVALID biome" — штатное поведение ванили для seed, у которого
  вокруг (0,0) океан: на JVM случайный seed даёт 3249 из 3249 клеток океана (tools/smoke/SeedTest.java.txt). Не баг.
* Генерация мира на JVM корректна (tools/smoke/WorldTest.java.txt, seed 1): трава (id 2), листва (id 18), skylight 15.
  Чёрные листва/трава/небо в браузере => проблема рендера/TeaVM, не логики мира. Проверяем: карты цвета биомов
  (SELFTEST colormaps), яркость/свет/время в DBG-строке.
* Камера: новый мир всегда стартует от первого лица (A.E = 0) — пользователь видел F5 при старте.
* "Белая голова": игрок отрисован в виде от третьего лица, текстура модели (fallback /mob/char.png) не накладывается.
