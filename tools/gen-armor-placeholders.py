#!/usr/bin/env python3
"""Генерирует ЗАГЛУШКИ текстур брони (armor/<материал>_1.png и _2.png, 64x32) в раскладке
оригинальной Alpha 1.2.6: те же UV, что у скина Steve (голова 0,0 / тело 16,16 / рука 40,16 /
нога 0,16). _1 — шлем, нагрудник (тело+руки), ботинки; _2 — поножи.

Это НЕ оригинальные текстуры Mojang — только чтобы броня была видна, пока оригиналы не добавлены:
    node tools/add-armor.mjs <папка с armor/*.png из jar игры>

    python3 tools/gen-armor-placeholders.py <выходная папка>
    node tools/add-armor.mjs <выходная папка>
"""
import os, random, sys
from PIL import Image

MATERIALS = {            # (база RGB, тип узора)
    "cloth":   ((139, 90, 43),   "cloth"),
    "chain":   ((150, 150, 158), "chain"),
    "iron":    ((216, 216, 216), "plain"),
    "gold":    ((247, 205, 41),  "plain"),
    "diamond": ((51, 235, 203),  "plain"),
}

def boxes(w, h, d, u, v):
    """Прямоугольники граней бокса w x h x d с текстурным началом (u, v): top, bottom, right, front, left, back."""
    return {
        "top": (u + d, v, w, d), "bottom": (u + d + w, v, w, d),
        "right": (u, v + d, d, h), "front": (u + d, v + d, w, h),
        "left": (u + d + w, v + d, d, h), "back": (u + d + w + d, v + d, w, h),
    }

def clip(rect, y0=None):
    x, y, w, h = rect
    if y0 is not None and y < y0:
        h -= y0 - y; y = y0
    return (x, y, w, h) if h > 0 else None

def paint(img, rect, base, kind, rnd):
    x, y, w, h = rect
    px = img.load()
    for j in range(h):
        for i in range(w):
            k = 1.0 + rnd.uniform(-0.07, 0.07)
            if i in (0, w - 1) or j in (0, h - 1):
                k *= 0.78                       # тёмная кромка — грани читаются
            elif j == 1 or i == 1:
                k *= 1.08                       # лёгкий блик
            if kind == "chain" and (i + j) % 2 == 0:
                k *= 0.72                       # «кольчужная» сетка
            if kind == "cloth" and i % 3 == 0:
                k *= 0.9                        # шов
            px[x + i, y + j] = tuple(max(0, min(255, int(c * k))) for c in base) + (255,)

def make(name, base, kind, part):
    rnd = random.Random(f"{name}:{part}")        # детерминированно между запусками
    img = Image.new("RGBA", (64, 32), (0, 0, 0, 0))
    head, body = boxes(8, 8, 8, 0, 0), boxes(8, 12, 4, 16, 16)
    arm, leg = boxes(4, 12, 4, 40, 16), boxes(4, 12, 4, 0, 16)
    sides = ("right", "front", "left", "back")
    if part == 1:     # шлем + нагрудник (тело и руки целиком) + ботинки (низ ног)
        rects = list(head.values()) + list(body.values()) + list(arm.values())
        rects += [clip(leg[f], 27) for f in sides] + [leg["bottom"]]
    else:             # поножи: пояс (низ тела) + ноги до уровня ботинок
        rects = [clip(body[f], 28) for f in sides] + [body["bottom"]]
        rects += [leg["top"]] + [(leg[f][0], leg[f][1], leg[f][2], 9) for f in sides]
    for r in rects:
        if r:
            paint(img, r, base, kind, rnd)
    return img

if __name__ == "__main__":
    out = os.path.join(sys.argv[1] if len(sys.argv) > 1 else "armor-placeholders", "armor")
    os.makedirs(out, exist_ok=True)
    for name, (base, kind) in MATERIALS.items():
        for part in (1, 2):
            make(name, base, kind, part).save(os.path.join(out, f"{name}_{part}.png"))
    print("written to", out)
