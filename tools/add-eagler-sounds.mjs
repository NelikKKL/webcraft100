#!/usr/bin/env node
// Добавляет в web/assets.akrile звуки 1.0.0, которых там не было (волки, жители, эндермены, блейзы,
// еда, сундуки, погода, нотный блок, поршни ...), из набора Eaglercraft 1.5.2 (resources/sounds).
//   node tools/add-eagler-sounds.mjs <папка sounds> [--dry]
// Файлы кладутся как sound/<путь>N.mp3 — движок (web/extras.js, classify) строит имя звука
// по пути без цифр в конце: sound/mob/wolf/bark1.mp3 -> "mob.wolf.bark".
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const archivePath = path.join(root, 'web', 'assets.akrile');
const src = process.argv[2], dry = process.argv.includes('--dry');
if (!src || !fs.existsSync(src)) { console.error('usage: node tools/add-eagler-sounds.mjs <sounds folder> [--dry]'); process.exit(1); }

// [имя звука в игре, папка набора, регулярка файлов]
const R = [];
const add = (name, dir, re) => R.push([name, dir, re]);
add('ambient.weather.rain', 'ambient/weather', /^rain\d*\.mp3$/);
add('ambient.weather.thunder', 'ambient/weather', /^thunder\d*\.mp3$/);
add('damage.fallbig', 'damage', /^fallbig\d*\.mp3$/);
add('damage.fallsmall', 'damage', /^fallsmall\d*\.mp3$/);
add('damage.hurtflesh', 'damage', /^hurtflesh\d*\.mp3$/);
add('mob.blaze.breathe', 'mob/blaze', /^breathe\d*\.mp3$/);
add('mob.blaze.death', 'mob/blaze', /^death\d*\.mp3$/);
add('mob.blaze.hit', 'mob/blaze', /^hit\d*\.mp3$/);
for (const n of ['death', 'hit', 'idle', 'portal']) add(`mob.endermen.${n}`, 'mob/endermen', new RegExp(`^${n}\\d*\\.mp3$`));
add('mob.magmacube.big', 'mob/magmacube', /^big\d*\.mp3$/);
add('mob.magmacube.small', 'mob/magmacube', /^small\d*\.mp3$/);
for (const n of ['hit', 'kill', 'say', 'step']) add(`mob.silverfish.${n}`, 'mob/silverfish', new RegExp(`^${n}\\d*\\.mp3$`));
add('mob.villager.default', 'mob/villager', /^default\d*\.mp3$/);
add('mob.villager.defaultdeath', 'mob/villager', /^defaultdeath\d*\.mp3$/);
add('mob.villager.defaulthurt', 'mob/villager', /^defaulthurt\d*\.mp3$/);
for (const n of ['bark', 'death', 'growl', 'hurt', 'panting', 'shake', 'whine']) add(`mob.wolf.${n}`, 'mob/wolf', new RegExp(`^${n}\\d*\\.mp3$`));
add('random.bowhit', 'random', /^bowhit\d*\.mp3$/);
add('random.break', 'random', /^break\d*\.mp3$/);
add('random.burp', 'random', /^burp\d*\.mp3$/);
add('random.chestclosed', 'random', /^chestclosed\d*\.mp3$/);
add('random.chestopen', 'random', /^chestopen\d*\.mp3$/);
add('random.drink', 'random', /^drink\d*\.mp3$/);
add('random.eat', 'random', /^eat\d*\.mp3$/);
add('random.orb', 'random', /^orb\d*\.mp3$/);
for (const n of ['harp', 'bd', 'snare', 'hat', 'bassattack']) add(`note.${n}`, 'note', new RegExp(`^${n}\\d*\\.mp3$`));
add('tile.piston.in', 'tile/piston', /^in\d*\.mp3$/);
add('tile.piston.out', 'tile/piston', /^out\d*\.mp3$/);

const plan = [], missing = [];
for (const [name, dir, re] of R) {
  const d = path.join(src, dir);
  const files = fs.existsSync(d) ? fs.readdirSync(d).filter(f => re.test(f)).sort((a, b) => a.localeCompare(b, 'en', { numeric: true })) : [];
  if (!files.length) { missing.push(name); continue; }
  files.forEach((f, i) => plan.push({ from: path.join(d, f), to: `sound/${name.replace(/\./g, '/')}${i + 1}.mp3`, name }));
}
console.log(`names: ${new Set(plan.map(p => p.name)).size}, files: ${plan.length}, missing in set: ${missing.join(', ') || 'none'}`);
if (dry) process.exit(0);

const { default: Akrile } = await import(path.join(root, 'web', 'akrile.js'));
await Akrile.ready;
const zip = await Akrile.loadAsync(fs.readFileSync(archivePath));
let bytes = 0;
for (const p of plan) { const data = fs.readFileSync(p.from); zip.file(p.to, data); bytes += data.length; }
fs.copyFileSync(archivePath, archivePath + '.bak');
fs.writeFileSync(archivePath, await zip.generateAsync({ type: 'uint8array' }));
console.log(`added ${plan.length} files (${(bytes / 1024).toFixed(0)} KB); backup: assets.akrile.bak`);
