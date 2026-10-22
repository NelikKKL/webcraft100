import re,os,subprocess,sys,collections
ROOT='/home/claude/webcraft100'
D=ROOT+'/src/main/java/net/minecraft/client/'
classes={f[:-5] for f in os.listdir(D) if f.endswith('.java')}
FQ='net.minecraft.client.'
def compile_():
    srcs=subprocess.check_output("find src -name '*.java'",shell=True,cwd=ROOT).decode().split()
    open('/tmp/all.txt','w').write('\n'.join(srcs))
    r=subprocess.run(['java','-m','jdk.compiler/com.sun.tools.javac.Main','-proc:none','-Xmaxerrs','50000','-Xmaxwarns','0','-d','/tmp/out','@/tmp/all.txt'],cwd=ROOT,capture_output=True,text=True)
    return r.stderr
def parse(err):
    L=err.split('\n'); out=[]
    i=0
    while i<len(L):
        m=re.match(r'src/main/java/net/minecraft/client/([A-Za-z0-9_]+\.java):(\d+): error: (.*)',L[i])
        if m and i+2<len(L):
            out.append((m.group(1),int(m.group(2)),m.group(3),L[i+1],len(L[i+2])-len(L[i+2].lstrip()) if L[i+2].strip().startswith('^') else -1))
        i+=1
    return out
qual_kinds=('cannot be dereferenced','incomparable types','bad operand types','cannot be applied to given types','no suitable method','incompatible types')
def qualify_line(line,col=None):
    def rep(m):
        n=m.group(1)
        return FQ+n+'.' if n in classes and not n.startswith('var') else m.group(0)
    return re.sub(r'(?<![\w.$])([A-Za-z_]\w{0,3})\.(?=[A-Za-z_])',rep,line)
def match_paren(s,i):
    d=0
    for j in range(i,len(s)):
        if s[j]=='(': d+=1
        elif s[j]==')':
            d-=1
            if d==0: return j
    return -1
def fix_for(line,T):
    m=re.search(r'for\(\s*'+re.escape(T)+r' (\w+) : ',line)
    if not m: return line
    op=line.index('(',m.start()); cl=match_paren(line,op)
    if cl<0: return line
    expr=line[m.end():cl]
    if expr.startswith('(Iterable<'): return line
    return line[:m.end()]+'(Iterable<%s>)(Iterable)(%s)'%(T,expr)+line[cl:]
tot=0
for it in range(int(sys.argv[1]) if len(sys.argv)>1 else 6):
    err=compile_(); errs=parse(err)
    game=[e for e in errs if 'org.teavm' not in e[2] and not e[2].startswith('package ')]
    print('iter',it,'errors',len(game)); 
    if not game: break
    files=collections.defaultdict(lambda: collections.defaultdict(set))
    for f,ln,msg,src,col in game: files[f][ln].add(msg)
    changed=0
    for f,lines in files.items():
        p=D+f; S=open(p,encoding='utf-8').read().split('\n')
        for ln,msgs in lines.items():
            old=S[ln-1]; new=old
            for msg in msgs:
                mo=re.match(r'incompatible types: Object cannot be converted to (\w+)',msg)
                if mo and 'for(' in new: new=fix_for(new,mo.group(1))
                elif any(k in msg for k in qual_kinds) and 'Object cannot' not in msg: new=qualify_line(new)
            if new!=old: S[ln-1]=new; changed+=1
        open(p,'w',encoding='utf-8').write('\n'.join(S))
    print(' lines changed',changed); tot+=changed
    if not changed: break
