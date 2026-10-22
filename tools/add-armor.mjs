#!/usr/bin/env node
// Добавляет текстуры брони в web/assets.akrile (armor/cloth_1.png ... armor/gold_2.png).
//
//   node tools/add-armor.mjs <папка>
//
// <папка> — либо папка, внутри которой лежит подпапка armor/ (например, распакованный jar игры или
// .minecraft/bin/minecraft.jar -> armor/*.png), либо сама папка с PNG-файлами брони.
// Существующие armor/*.png в архиве заменяются. Без этих файлов броня на игроке не рисуется
// (Armor.java грузит /armor/<материал>_1.png и _2.png).
//
// Заглушки для проверки: python3 tools/gen-armor-placeholders.py <папка> && node tools/add-armor.mjs <папка>
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const archivePath = path.join(root, 'web', 'assets.akrile');
let src = process.argv[2];
if (!src || !fs.existsSync(src)) { console.error('usage: node tools/add-armor.mjs <folder with armor/*.png>'); process.exit(1); }
if (fs.existsSync(path.join(src, 'armor'))) src = path.join(src, 'armor');

const NAMES = ['cloth', 'chain', 'iron', 'diamond', 'gold'].flatMap(m => [`${m}_1.png`, `${m}_2.png`]);
const found = NAMES.filter(n => fs.existsSync(path.join(src, n)));
if (!found.length) { console.error('No armor PNGs (cloth_1.png, iron_2.png, ...) found in', src); process.exit(2); }
const missing = NAMES.filter(n => !found.includes(n));

const { default: Akrile } = await import(path.join(root, 'web', 'akrile.js'));
await Akrile.ready;

const zip = await Akrile.loadAsync(fs.readFileSync(archivePath));
for (const n of found) zip.file('armor/' + n, fs.readFileSync(path.join(src, n)));
fs.copyFileSync(archivePath, archivePath + '.bak');
fs.writeFileSync(archivePath, await zip.generateAsync({ type: 'uint8array' }));
console.log(`Added ${found.length} armor textures to ${path.relative(process.cwd(), archivePath)}; backup: assets.akrile.bak`);
if (missing.length) console.warn('Not found (armor of this kind will not render):', missing.join(', '));
