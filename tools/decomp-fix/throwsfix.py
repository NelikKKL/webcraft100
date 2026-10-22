import re,os,subprocess,glob,sys,collections
ROOT='/home/claude/webcraft100'; D=ROOT+'/src/main/java/net/minecraft/client/'
FQ={'IOException':'java.io.IOException','FileNotFoundException':'java.io.FileNotFoundException','InterruptedException':'InterruptedException',
    'SocketException':'java.net.SocketException','UnknownHostException':'java.net.UnknownHostException','ConnectException':'net.minecraft.client.netshim.ConnectException',
    'EOFException':'java.io.EOFException','ClassNotFoundException':'ClassNotFoundException','Exception':'Exception','Throwable':'Throwable',
    'InstantiationException':'InstantiationException','IllegalAccessException':'IllegalAccessException','MalformedURLException':'java.net.MalformedURLException',
    'URISyntaxException':'java.net.URISyntaxException','SocketTimeoutException':'java.net.SocketTimeoutException','UnsupportedEncodingException':'java.io.UnsupportedEncodingException'}
KW={'if','for','while','switch','catch','synchronized','else','try','return','new','do','finally'}
def compile_():
    srcs=subprocess.check_output("find src -name '*.java'",shell=True,cwd=ROOT).decode().split()+glob.glob('/tmp/stubs/**/*.java',recursive=True)
    open('/tmp/all.txt','w').write('\n'.join(srcs))
    r=subprocess.run(['java','-m','jdk.compiler/com.sun.tools.javac.Main','--limit-modules','java.base,java.logging','-proc:none','-XDshould-stop.ifError=FLOW','-XDcompilePolicy=simple','-Xmaxerrs','100000','-d','/tmp/out','@/tmp/all.txt'],cwd=ROOT,capture_output=True,text=True)
    return r.stderr
STR=re.compile(r'"(\\.|[^"\\])*"|\'(\\.|[^\'\\])*\'')
def clean(l): return re.sub(r'//.*','',STR.sub('""',l))
METH=re.compile(r'^(\s*)((?:(?:public|protected|private|static|final|abstract|synchronized|native)\s+)*)(?:<[^>]+>\s+)?(?:([\w$.<>\[\],? ]+?)\s+)?(\w+)\s*\(([^()]*)\)\s*(throws\s+[\w$., ]+?)?\s*([{;])\s*$')
def is_header(line,cls):
    m=METH.match(line)
    if not m: return None
    name=m.group(4); ret=m.group(3)
    if name in KW: return None
    if ret is None and name!=cls: return None
    if ret and ret.strip() in KW|{'else','new','return'}: return None
    return m
def add_throws(line,exc):
    m=METH.match(line); fq=FQ.get(exc,exc)
    th=m.group(6)
    if th:
        names=[x.strip() for x in th[len('throws'):].split(',')]
        if exc in [n.split('.')[-1] for n in names] : return line
        return line.replace(th,th.rstrip()+', '+fq,1)
    close=line.rindex(')')
    return line[:close+1]+' throws '+fq+line[close+1:]
def enclosing(S,ln,cls):
    # ln: 1-based error line; find nearest preceding method header containing it
    for h in range(ln-1,-1,-1):
        m=is_header(S[h],cls)
        if not m or m.group(7)!=('{'): continue
        bal=0
        for k in range(h,ln-1):
            c=clean(S[k]); bal+=c.count('{')-c.count('}')
        if bal>=1: return h
    return None
def run(maxit=40):
    for it in range(maxit):
        err=compile_(); L=err.split('\n'); edits=collections.defaultdict(lambda: collections.defaultdict(set)); skipped=[]
        for i,l in enumerate(L):
            m=re.match(r'src/main/java/net/minecraft/client/(\w+)\.java:(\d+): error: unreported exception ([\w.]+); must be caught',l)
            if m: edits[m.group(1)][int(m.group(2))].add(m.group(3)); continue
            m=re.match(r'src/main/java/net/minecraft/client/(\w+)\.java:\d+: error: (\w+)\(([^)]*)\) in (\w+) cannot override (\w+)\(([^)]*)\) in (\w+)',l)
            if m and i+1<len(L):
                mm=re.search(r'overridden method does not throw ([\w.]+)','\n'.join(L[i+1:i+5]))
                if mm: edits[m.group(7)][('decl',m.group(5),m.group(6))].add(mm.group(1))
        if not edits: print('iter',it,'no more throws errors'); return err
        changed=0
        for cls,items in edits.items():
            p=D+cls+'.java'; S=open(p,encoding='utf-8').read().split('\n')
            for key,excs in items.items():
                if isinstance(key,tuple):
                    want=[x.strip().split('<')[0] for x in key[2].split(',') if x.strip()]
                    for h,line in enumerate(S):
                        m=is_header(line,cls)
                        if not m or m.group(4)!=key[1]: continue
                        have=[x.strip().rsplit(' ',1)[0].split('<')[0] for x in m.group(5).split(',') if x.strip()]
                        if have==want:
                            for e in excs:
                                n=add_throws(S[h],e)
                                if n!=S[h]: S[h]=n; changed+=1
                            break
                else:
                    h=enclosing(S,key,cls)
                    if h is None: skipped.append((cls,key,excs)); continue
                    for e in excs:
                        n=add_throws(S[h],e)
                        if n!=S[h]: S[h]=n; changed+=1
            open(p,'w',encoding='utf-8').write('\n'.join(S))
        print('iter',it,'edits',changed,'skipped',skipped[:3])
        if not changed: return err
    return err
if __name__=='__main__':
    err=run(int(sys.argv[1]) if len(sys.argv)>1 else 40)
    L=[l for l in err.split('\n') if ': error:' in l]
    print('remaining errors',len(L))
    for l in L[:25]: print(l[:160].replace('src/main/java/net/minecraft/client/',''))
