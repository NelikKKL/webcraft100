#!/usr/bin/env node
// Собирает web/assets.akrile для Minecraft 1.0.0 из папки с ресурсами клиентского jar
// (всё, что не .java/.class: terrain.png, gui/, mob/, font.txt, lang/, ...).
//
//   node tools/build-assets-100.mjs <папка с распакованным jar> [выходной файл] [--sounds=<assets.akrile от Alpha-порта>]
//   --sounds: добавляет в архив все sound/**, music/**, streaming/** из указанного .akrile (в jar звуков нет).
//
// Звуки в jar не входят (оригинал докачивал их с s3): добавляются отдельно через add-sounds.mjs.
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const src = process.argv[2];
const extra = process.argv.slice(3).filter(a => a.startsWith('--sounds='));
const posArgs = process.argv.slice(3).filter(a => !a.startsWith('--'));
const out = posArgs[0] || path.join(root, 'web', 'assets.akrile');
if (!src || !fs.existsSync(src)) { console.error('usage: node tools/build-assets-100.mjs <resources dir> [out]'); process.exit(1); }

const { default: Akrile } = await import(path.join(root, 'web', 'akrile.js'));
await Akrile.ready;

const SKIP = /\.(java|class|MF|SF|RSA|DSA)$/i;
function* walk(dir) {
  for (const e of fs.readdirSync(dir, { withFileTypes: true })) {
    const p = path.join(dir, e.name);
    if (e.isDirectory()) { if (e.name !== 'META-INF') yield* walk(p); } else yield p;
  }
}
const zip = new Akrile();
let n = 0, bytes = 0;
for (const f of walk(src)) {
  if (SKIP.test(f)) continue;
  const rel = path.relative(src, f).split(path.sep).join('/');
  const data = fs.readFileSync(f);
  zip.file(rel, data); n++; bytes += data.length;
}
let nSnd = 0;
for (const a of extra) {
  const other = await Akrile.loadAsync(fs.readFileSync(a.slice('--sounds='.length)));
  for (const name of Object.keys(other.files)) {
    if (!/^(sound|newsound|music|newmusic|streaming)\//.test(name) || name.endsWith('/')) continue;
    if (zip.file(name)) continue;
    zip.file(name, await other.file(name).async('uint8array')); nSnd++;
  }
}
if (nSnd) console.log(`+ ${nSnd} sound files merged`);
fs.writeFileSync(out, await zip.generateAsync({ type: 'uint8array' }));
console.log(`${n} files, ${(bytes / 1024).toFixed(0)} KiB -> ${out} (${(fs.statSync(out).size / 1024).toFixed(0)} KiB)`);
