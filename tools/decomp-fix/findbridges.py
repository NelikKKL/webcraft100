import re,glob,os,sys,collections
D='/home/claude/wc/src/main/java/net/minecraft/client/'
classes={}
hdr=re.compile(r'^(?:public |abstract |final )*(?:class|interface) (\w+)(?:<[^>]*>)?(?: extends ([\w., ]+?))?(?: implements ([\w., ]+?))? ?\{',re.M)
meth=re.compile(r'^   ((?:public |protected |private |static |final |abstract |synchronized |native )*)([\w.<>\[\], ?]+?) (\w+)\(([^)]*)\)\s*(?:throws [\w., ]+)?\s*[{;]',re.M)
for f in glob.glob(D+'*.java'):
    n=os.path.basename(f)[:-5]; s=open(f,encoding='utf8').read()
    m=hdr.search(s)
    if not m: continue
    sup=[]
    if m.group(2): sup+= [x.strip().split('.')[-1] for x in m.group(2).split(',')]
    if m.group(3): sup+= [x.strip().split('.')[-1] for x in m.group(3).split(',')]
    ms=[]
    for mm in meth.finditer(s):
        mods,ret,name,params=mm.groups()
        if name in ('if','for','while','switch','catch','synchronized'): continue
        ps=[]
        if params.strip():
            for p in params.split(','):
                p=p.strip(); t=p.rsplit(' ',1)[0].replace('final ','').strip(); ps.append(t)
        ms.append((mods.strip(),ret.strip(),name,tuple(ps),mm.start()))
    classes[n]=(sup,ms,s)
def supers(c,seen=None):
    out=[]
    for s in classes.get(c,([],))[0]:
        out.append(s); out+=supers(s)
    return out
def issub(t,s):
    return t!=s and s in supers(t)
res=[]
for c,(sup,ms,s) in classes.items():
    anc=supers(c)
    mysigs={(m[2],m[3]) for m in ms}
    ancsigs={(m2[2],m2[3]) for a in anc if a in classes for m2 in classes[a][1]}
    for (mods,ret,name,ps,pos) in ms:
        if 'static' in mods or 'private' in mods: continue
        for a in anc:
            if a not in classes: continue
            for (amods,aret,aname,aps,apos) in classes[a][1]:
                if aname!=name or len(aps)!=len(ps) or aps==ps or 'static' in amods or 'private' in amods: continue
                ok=True; diff=False
                for x,y in zip(ps,aps):
                    if x==y: continue
                    if issub(x,y): diff=True
                    else: ok=False;break
                if ok and diff and (name,aps) not in mysigs and (name,ps) not in ancsigs and (ret==aret or issub(ret,aret)):
                    # is some other ancestor of c (between) already defining aps? skip if any class in anc chain before 'a' defines (name,aps) overriding... keep simple
                    res.append((c,mods,ret,name,ps,a,amods,aret,aps))
seen=set()
for r in res:
    k=(r[0],r[3],r[8])
    if k in seen: continue
    seen.add(k); print(r)
print(len(seen))
