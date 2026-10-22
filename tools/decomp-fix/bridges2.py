import re,sys,subprocess
exec(open('/home/claude/autofix.py').read().split("tot=0")[0])
PRIM={'int','long','float','double','boolean','byte','short','char'}
meth=re.compile(r'^\s*(?:(?:public|protected|private|final|synchronized|static)\s+)*([\w.<>\[\]]+)\s+(\w+)\(([^)]*)\)\s*(?:throws [\w, .]+)?\s*\{',re.M)
def methods(s):
    return [(m.group(1),m.group(2),[x.strip().rsplit(' ',1)[0] for x in m.group(3).split(',')] if m.group(3).strip() else []) for m in meth.finditer(s)]
def abs_ret(sup,name,n):
    if sup in('Comparable','Comparator'): return 'int'
    try: s=open(D+sup+'.java',encoding='utf-8').read()
    except: return None
    for m in re.finditer(r'(?:abstract |public |protected )*([\w.<>\[\]]+)\s+'+name+r'\(([^)]*)\)\s*(?:throws [\w, .]+)?;',s):
        if (len(m.group(2).split(',')) if m.group(2).strip() else 0)==n: return m.group(1)
    return None
pat=re.compile(r'src/main/java/net/minecraft/client/(\w+)\.java:\d+: error: (\w+) is not abstract and does not override abstract method (\w+)\(([^)]*)\) in (\w+)')
for rnd in range(10):
    err=compile_(); added=0; skipped=[]
    seen=set()
    for m in pat.finditer(err):
        cls,name,sup=m.group(1),m.group(3),m.group(5)
        pt=[t.strip() for t in m.group(4).split(',')] if m.group(4).strip() else []
        if (cls,name) in seen: continue
        seen.add((cls,name))
        p=D+cls+'.java'; s=open(p,encoding='utf-8').read(); cands=methods(s)
        ret=abs_ret(sup,name,len(pt))
        def ok(c,strict):
            if len(c[2])!=len(pt) or (c[2]==pt and (len(pt)>0 or c[1]==name)): return False
            if not all((a==b) if (a in PRIM or b in PRIM) else True for a,b in zip(pt,c[2])): return False
            if ret and ret in PRIM and c[0]!=ret: return False
            return (c[1]==name) if strict else True
        found=[c for c in cands if ok(c,True)] or [c for c in cands if ok(c,False)]
        if len(found)!=1: skipped.append((cls,name,pt,len(found))); continue
        r,real_name,real=found[0]; r=ret or r
        args=['v%d'%i if a==b else '(%s)v%d'%(b,i) for i,(a,b) in enumerate(zip(pt,real))]
        call='this.%s(%s)'%(real_name,', '.join(args))
        body=('return '+call if r!='void' else call)+';'
        add='\n   // PATCH(bridge): bridge-метод, потерянный декомпилятором\n   public %s %s(%s) { %s }\n'%(r,name,', '.join('%s v%d'%(a,i) for i,a in enumerate(pt)),body)
        k=s.rstrip().rfind('}'); open(p,'w',encoding='utf-8').write(s[:k]+add+'}\n'); added+=1
    print('round',rnd,'added',added,'skipped',skipped[:6])
    if not added: break
