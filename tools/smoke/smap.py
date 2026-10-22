import json,bisect
B64='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'
M={c:i for i,c in enumerate(B64)}
def vlq(s):
    out=[];shift=val=0
    for ch in s:
        d=M[ch];val|=(d&31)<<shift
        if d&32: shift+=5
        else:
            out.append(-(val>>1) if val&1 else val>>1);val=shift=0
    return out
class SM:
    def __init__(s,path):
        j=json.load(open(path)); s.src=j['sources']; s.names=j.get('names',[]); s.lines=[]
        sf=sl=sc=nm=0
        for line in j['mappings'].split(';'):
            col=0; segs=[]
            for seg in line.split(',') if line else []:
                v=vlq(seg); col+=v[0]
                if len(v)>=4:
                    sf+=v[1]; sl+=v[2]; sc+=v[3]
                    segs.append((col,sf,sl,sc))
            s.lines.append(segs)
    def lookup(s,line,col):
        if line>=len(s.lines): return None
        segs=s.lines[line]; cols=[x[0] for x in segs]
        i=bisect.bisect_right(cols,col)-1
        if i<0: return None
        _,f,l,c=segs[i]; return '%s:%d'%(s.src[f],l+1)
