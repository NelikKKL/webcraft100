import re, sys, os, glob
PKG = "net.minecraft.client"
pat = re.compile(r'(?<![\w\)\]\.\"\'])\.(?=[A-Za-z_])')
def code_mask(s):
    m = bytearray(b'\x01'*len(s)); i=0; n=len(s)
    while i<n:
        c=s[i]
        if c=='"' or c=="'":
            j=i+1
            while j<n and s[j]!=c:
                j += 2 if s[j]=='\\' else 1
            for k in range(i,min(j+1,n)): m[k]=0
            i=j+1
        elif s.startswith('//',i):
            j=s.find('\n',i); j=n if j<0 else j
            for k in range(i,j): m[k]=0
            i=j
        elif s.startswith('/*',i):
            j=s.find('*/',i); j=n if j<0 else j+2
            for k in range(i,j): m[k]=0
            i=j
        else: i+=1
    return m
cnt=0
for f in glob.glob('*.java'):
    s=open(f,encoding='utf-8',errors='replace').read()
    m=code_mask(s)
    out=[];last=0
    for mt in pat.finditer(s):
        p=mt.start()
        if m[p]:
            out.append(s[last:p]); last=p+1; cnt+=1
    out.append(s[last:]); s=''.join(out)
    if not s.startswith('package '):
        s='package %s;\n\n'%PKG+s
    open(f,'w',encoding='utf-8').write(s)
print("dots removed:",cnt)
