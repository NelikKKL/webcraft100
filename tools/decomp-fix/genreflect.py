import re,os
D='/home/claude/webcraft100/src/main/java/net/minecraft/client/'
classes=sorted(f[:-5] for f in os.listdir(D) if f.endswith('.java') and not f.startswith('Web') and f not in('Reflect.java','Minecraft.java','MinecraftApplet.java'))
world=[];empty=[];string=[]
for c in classes:
    s=open(D+c+'.java',encoding='utf-8').read()
    m=re.search(r'^(?:public\s+)?(abstract\s+)?(?:final\s+)?(class|interface|enum)\s+'+re.escape(c)+r'\b',s,re.M)
    if not m or m.group(2)!='class' or m.group(1): continue
    ctors=re.findall(r'^   (public\s+|protected\s+|private\s+)?'+re.escape(c)+r'\(([^)]*)\)\s*(?:throws [\w, .]+)?\{',s,re.M)
    sigs=set()
    for vis,args in ctors:
        if vis.strip()=='private': continue
        types=tuple(a.strip().rsplit(' ',1)[0] for a in args.split(',') if a.strip()); sigs.add(types)
    if not ctors: sigs.add(())          # неявный конструктор
    if ('ry',) in sigs: world.append(c)
    if () in sigs: empty.append(c)
    if ('String',) in sigs: string.append(c)
out=['package net.minecraft.client;','',
'/**',' * PATCH(1.0.0): замена java.lang.reflect.Constructor.newInstance. TeaVM не поддерживает рефлексию без явной',
' * регистрации, поэтому фабрика сгенерирована (tools/decomp-fix/genreflect.py) по всем конструкторам игры.',' */',
'public final class Reflect {','   private Reflect() {}','']
def gen(name,params,cases,call):
    out.append('   public static Object %s(Class var0%s) {'%(name,params))
    for c in cases: out.append('      if (var0 == %s.class) return %s;'%(c,call%c))
    out.append('      throw new RuntimeException("Reflect.%s: no constructor for " + var0);'%name)
    out.append('   }'); out.append('')
gen('newWorld',', ry var1',world,'new %s(var1)')
gen('newEmpty','',empty,'new %s()')
gen('newString',', String var1',string,'new %s(var1)')
out.append('}')
open(D+'Reflect.java','w',encoding='utf-8').write('\n'.join(out)+'\n')
print(len(world),len(empty),len(string))
