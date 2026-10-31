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
* ~~Список текстур-паков (adk) должен включать TexturePackStore.list()~~ — сделано (см. ниже).
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

## Мультитекстура (корень "всё без текстур": чёрный мир, белый HUD)
* 1.0.0 безусловно использует текстурный юнит 1 для лайтмапа (adx.a/b, adt.a/b, acq, cv, ...): на нём делаются
  glDisable(GL_TEXTURE_2D), glBindTexture, glTexParameteri, glMatrixMode(GL_TEXTURE)+glScalef/glTranslatef, glTexCoordPointer.
  Заглушка glActiveTexture ничего не запоминала, поэтому glDisable(3553) "для юнита 1" выключал текстуры у юнита 0:
  весь кадр (2688 draw'ов) шёл с uUseTexture=0 (чёрная листва, белый прицел/панель).
* GL13.activeUnit/clientUnit отслеживаются; GL11 игнорирует текстурные вызовы и матрицу GL_TEXTURE на юните != 0.
  TODO: эмуляция лайтмапа (освещение сущностей по яркости).
* Найдено через tools/smoke/gl-frame-analysis.py (анализ состояний одного кадра).
* Открыто: в конце кадра рисуются символы текста со смещением y = -552275456 (мусор в y строки) — выяснить, что за текст.
* DBG показал: вид от 1-го лица, свет 15/15, яркость 1.0, время 0; игрок появился в (158.5, 66.6, -15.5) над океаном.

## Исправления: лайтмап, потерянные bridge-методы рендереров

1. **Потерянные bridge-методы (PATCH(bridge2))** — `tools/decomp-fix/bridges2.py` добавлял мосты только там, где javac
   ругался на нереализованный *абстрактный* метод. Переопределения неабстрактных методов `acq` (RenderLiving)
   с более узким типом параметра (`a(vi,…)`, `a(hm,int,float)`, …) молча не вызывались: игра исполняла версию из `acq`.
   Следствия: игрок рисовался без `y - yOffset` (модель поднята на 1.62 и в мире, и в инвентаре), у овцы не работал
   `shouldRenderPass` (всегда «острижена»), не работали броня, глаза паука, заряд крипера и т.д.
   Сгенерировано 51 мост в 20 классах рендереров (скрипт: tools/decomp-fix/findbridges.py + applybridges.py).
2. **Лайтмап (текстурный юнит 1)** — раньше `glMultiTexCoord2f`/`glTexCoordPointer(ShortBuffer)` на юните 1 игнорировались,
   поэтому яркость вершин не применялась (в пещерах светло, ночью не темнее). Теперь:
   - вершинный формат снапшота 12 -> 14 float (добавлен `aLight`, location=4, из 2 short тесселятора или `glMultiTexCoord2f`);
   - шейдер: `uLightmap` (юнит 1) + `uUseLightmap`, ручная билинейная выборка через `texelFetch`
     (позиция в тексель-пространстве = v/16, как у матрицы текстуры юнита 1 `(x+8)/256`), множитель на цвет до тумана;
   - `GLState`: `lightEnabled`, `lightTexId`, `lightU/V`; `GL11.glEnable/glDisable(3553)`, `glBindTexture`,
     `glDisableClientState(32888)` на юните 1 теперь меняют это состояние.

## Текстур-паки (zip) подключены к игре
* `web/extras.js` и `TexturePackStore` уже умели читать zip, но игра их не вызывала: `adk` (TexturePackList) сканировал
  несуществующую папку texturepacks, а кнопка в `lb` была заглушкой. Теперь `adk.a()` берёт список из
  `TexturePackStore.list()` (+ стандартный пак первым), кнопка в `lb` (ванильный текст "Open texture pack folder") вызывает `openFilePicker()`,
  drag&drop .zip на окно работает из extras.js. Выбор пака хранится в options (`skin:`), сами паки — в IndexedDB.

## Производительность (PATCH(perf))
* `aij` (Timer): догон пропущенных тиков ограничен ~3 за кадр (было до 10). Раньше долгий кадр (генерация чанков) давал
  несколько тиков подряд, каждый из которых снова грузил чанки (activeChunkSet, радиус 7) — спираль лагов.
* `web/ChunkPreloader` + `mv`: чанки вокруг игрока подгружаются заранее по одному-трём за кадр (бюджет ~6 мс), от
  ближних к дальним; «заселение» (деревья, руды, озёра) на время подгрузки откладывается в очередь и выполняется по
  одному чанку. Если чанк понадобился раньше (рендер/мировой тик), он создаётся обычным путём.
  Радиус подгрузки: max(9, дальность прорисовки + 2), не больше 13.
* `GLBridge.drawArrays` (immediate-режим, GL_QUADS): один `drawElements` с общим индексным буфером вместо
  `drawArrays(TRIANGLE_FAN, 4)` на каждый квад (частицы, текст GUI, предметы).
* `JRandom`: шаг 48-битного LCG на двух 24-битных int + double вместо `long` (в TeaVM long эмулируется).
  Сверено с java.util.Random на JVM: 3.6M значений (nextInt/nextInt(bound)/nextDouble/nextFloat/nextLong/nextBytes/setSeed),
  расхождений 0 (tools/smoke/JRandomCheck.java.txt).
* Не сделано (нужен профайлер в браузере): слои биомов `jx` тоже считают на long (64-бит LCG), сырая загрузка вершин
  тесселятора (ByteBuffer -> float[]) в GLBridge.fillSnapshot, DrawRecord раскрывает квады в 6 вершин вместо индексов.

## Перенесено из старого порта (другая версия игры)
* `ry.f()` (случайные тики, радиус 7): чанки, которых нет в памяти, пропускаются (`x().c(x,z)`), а не генерируются
  синхронно через `this.c(x,z)`. Недостающие догружает `ChunkPreloader`. Побочный эффект: незагруженные чанки не тикают.
* Уже были в этом шиме и совпадают со старым списком: GPU-кэш DrawRecord, квады -> треугольники, applyUniforms только
  по изменениям, кэш GL-состояния, scratch-массивы immediate-режима, Mat4 без аллокаций, display lists по id,
  `glGetError` выключен, TeaVM ADVANCED.
* Не перенесено: `bw.chunksReady()`/лимит ~8 мс на пересборку секций (в 1.0.0 пересборка near-секций обязана пройти
  в том же кадре, иначе дыры в мире; покрыто радиусом подгрузки), лимит по времени для очереди света
  (в 1.0.0 `ry.F()` — пустая заглушка, свет считается сразу при setBlock).

## Исправления: предметы в руке, крылья куриц, звуки, переход цвета биомов
* **bridge3 (потерянные bridge-методы с ДРУГИМ именем).** `findbridges.py`/bridge2 искал только переопределения с тем же именем.
  Но обфускатор давал сужающему переопределению своё имя (`a`), а bridge сохранял имя базового метода (`b`/`c`), и декомпилятор его выбросил.
  - `RenderLiving.b(nq,float)` = renderEquippedItems, `a(nq,float)` = preRender (масштаб). В `zr` (игрок) и `ch` bridge'и были перепутаны,
    в `aae`, `ado`, `bh`, `la` bridge стоял на `a`, а нужен на `b`. Итог: предмет в руке/шлем/плащ игрока (3-е лицо и модель в инвентаре),
    блок в руках эндермена, тыква снеговика и т.п. не рисовались. Теперь `zr.a(vi,float)` вызывается через `b(nq,float)`.
  - `RenderLiving.c(nq,float)` = handleRotationFloat (по умолчанию `ticksExisted + partial`). У `dp` (курица), `acb` (волк, хвост), `aic` (кальмар)
    не было bridge → вместо угла крыла подставлялось время жизни → крылья крутились всегда.
* **Звуки.** `tools/add-eagler-sounds.mjs <папка sounds из Eaglercraft 1.5.2>` добавляет в assets.akrile 97 файлов / 43 имени
  (погода, damage.*, волки, жители, эндермены, блейзы, магма-кубы, чешуйницы, еда, сундуки, нотный блок, поршни и т.д.).
  Проверено: все имена звуков, встречающиеся в коде (`"random.*"`, `"mob.*"` ... + `step.*`, `note.*`), покрыты файлами.
* **Переход биомов.** Логика слоёв температуры/влажности на JVM даёт градиент (~30 блоков на границе биомов), но в браузере он не виден.
  `sr.a/b` (цвет травы и листвы) теперь усредняют цвет по 3x3 соседним колонкам (`PATCH(biome-blend)`) — граница не бывает резче 3 блоков.
