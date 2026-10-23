import re,os,sys,collections
D='/home/claude/webcraft100/src/main/java/net/minecraft/client/'
FQ='net.minecraft.client.'
classes={f[:-5] for f in os.listdir(D) if f.endswith('.java')}
STR=re.compile(r'"(\\.|[^"\\])*"|\'(\\.|[^\'\\])*\'')
FIELD=re.compile(r'^   (?=\S)(?:(public|protected|private)\s+)?(static\s+)?(?:final\s+)?(?:volatile\s+)?(?:transient\s+)?[\w$.<>\[\],? ]+?\s+(\w+)\s*(?:=|;)',re.M)
info={}
for c in classes:
    s=open(D+c+'.java',encoding='utf-8').read()
    m=re.search(r'\b(?:class|interface)\s+'+re.escape(c)+r'\b(?:\s*<[^>]*>)?(?:\s+extends\s+(\w+))?',s)
    sup=m.group(1) if m and m.group(1) in classes else None
    fields={}
    # только члены верхнего уровня класса: отступ ровно 3 пробела
    for fm in FIELD.finditer(s):
        line=fm.group(0)
        if '(' in line.split('=')[0]: continue
        fields[fm.group(3)]=bool(fm.group(2))
    info[c]=(sup,fields)
def eff(c):
    inst=set();stat=set();seen=set()
    while c and c in info and c not in seen:
        seen.add(c); sup,f=info[c]
        for n,st in f.items(): (stat if st else inst).add(n)
        c=sup
    return inst,stat
SKIP={'WebMinecraft','WebEntryPoint'}
def process(c,apply):
    if c in SKIP: return 0,[]
    p=D+c+'.java'; s=open(p,encoding='utf-8').read()
    inst,stat=eff(c)
    shadow_i=inst&classes; shadow_s=stat&classes
    if not shadow_i and not shadow_s: return 0,[]
    out=[];n=0;amb=[]
    for ln,line in enumerate(s.split('\n'),1):
        code=STR.sub(lambda m:'"'*len(m.group(0)),line)
        code=re.sub(r'//.*','',code)
        def rep(m):
            nonlocal n
            x=m.group(1)
            if x==c: return m.group(0)
            if x in shadow_i and x not in shadow_s:
                n+=1; return FQ+x+'.'
            if x in shadow_s:
                amb.append((ln,x,line.strip()[:110]))
            return m.group(0)
        # применяем замены по позициям кода, а не строки (строки заменены на кавычки одинаковой длины)
        res=[];last=0
        for m in re.finditer(r'(?<![\w.$])([A-Za-z_]\w{0,3})\.(?=[A-Za-z_])',code):
            x=m.group(1)
            if x in classes and x!=c and (x in shadow_i or x in shadow_s):
                if x in shadow_i and x not in shadow_s:
                    res.append(line[last:m.start()]); res.append(FQ+x+'.'); last=m.end(); n+=1
                else: amb.append((ln,x,line.strip()[:110]))
        res.append(line[last:]); out.append(''.join(res))
    if apply and n: open(p,'w',encoding='utf-8').write('\n'.join(out))
    return n,amb
if __name__=='__main__':
    apply=len(sys.argv)>1 and sys.argv[1]=='apply'
    tot=0;allamb=[]
    for c in sorted(classes):
        n,amb=process(c,apply); tot+=n
        for a in amb: allamb.append((c,)+a)
    print('qualified',tot,'ambiguous',len(allamb))
    for a in allamb[:60]: print(a)
