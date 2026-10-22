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
