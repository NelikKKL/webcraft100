import re
src=open('/home/claude/tools/findbridges.py').read().split("seen=set()")[0]
exec(src)
done=set(); added=[]
for (c,mods,ret,name,ps,a,amods,aret,aps) in res:
    if a!='acq' or 'ia' in aps: continue
    k=(c,name,aps)
    if k in done: continue
    done.add(k)
    path=D+c+'.java'; s=open(path,encoding='utf8').read()
    if 'PATCH(bridge2)' in s and re.search(r'\b%s\(%s\)'%(name,', '.join('%s v%d'%(t,i) for i,t in enumerate(aps))),s): continue
    acc='protected' if 'protected' in amods else 'public'
    params=', '.join('%s v%d'%(t,i) for i,t in enumerate(aps))
    args=', '.join('v%d'%i if t==u else '(%s)v%d'%(u,i) for i,(t,u) in enumerate(zip(aps,ps)))
    call='this.%s(%s)'%(name,args)
    body=('return '+call if aret!='void' else call)+';'
    add='\n   // PATCH(bridge2): потерянный bridge-метод (иначе вызывается версия из acq, а не переопределённая)\n   %s %s %s(%s) { %s }\n'%(acc,aret,name,params,body)
    k2=s.rstrip().rfind('}')
    open(path,'w',encoding='utf8').write(s[:k2]+add+'}\n')
    added.append((c,name,aps))
for x in added: print(x)
print(len(added))
