import asyncio,sys,time,json,functools,http.server,socketserver,threading
sys.path.insert(0,'/tmp'); from smap import SM
ROOT='/tmp/art'; sm=SM(ROOT+'/mc100.js.map')
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8131),functools.partial(Q,directory=ROOT)); threading.Thread(target=srv.serve_forever,daemon=True).start()
from playwright.async_api import async_playwright
FN="function(){var o={};function pick(v,d){var r={};for(var k in v){var w=v[k];if(w===null||typeof w==='function')continue;if(typeof w==='string'||typeof w==='number'||typeof w==='boolean')r[k]=w;else if(d>0&&typeof w==='object'&&!Array.isArray(w))r[k]=pick(w,d-1);}return r;}return JSON.stringify(pick(this,3)).slice(0,2500);}"
async def main():
    out=[]
    async with async_playwright() as p:
        b=await p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
        ctx=await b.new_context(viewport={'width':854,'height':480}); pg=await ctx.new_page()
        cdp=await ctx.new_cdp_session(pg); await cdp.send("Debugger.enable"); await cdp.send("Debugger.setPauseOnExceptions",{"state":"all"})
        async def handle(ev):
            d=ev.get('data') or {}; info=''
            try:
                if d.get('objectId'):
                    r=await cdp.send("Runtime.callFunctionOn",{"objectId":d['objectId'],"functionDeclaration":FN,"returnByValue":True}); info=r.get('result',{}).get('value','')
            except Exception as e: info='ERR '+str(e)
            desc=d.get('description','')
            import re
            fr=[(m.group(1),sm.lookup(int(m.group(2))-1,int(m.group(3))-1)) for m in re.finditer(r'at (\S+) \(\S*mc100\.js:(\d+):(\d+)\)',desc)]
            out.append((info,fr[:7]))
            try: await cdp.send("Debugger.resume")
            except Exception: pass
        logs=[]; pg.on('console',lambda m: logs.append(m.type+': '+m.text[:160])); pg.on('pageerror',lambda e: logs.append('PAGEERR '+str(e)[:200]))
        cdp.on("Debugger.paused",lambda ev: asyncio.ensure_future(handle(ev)))
        await pg.goto("http://127.0.0.1:8131/index.html"); await asyncio.sleep(14)
        for (x,y,w) in [(427,236,2),(583,395,1),(583,395,3),(266,443,int(sys.argv[1]))]:
            await pg.mouse.move(x,y); await asyncio.sleep(2); await pg.mouse.down(); await asyncio.sleep(1); await pg.mouse.up(); await asyncio.sleep(w+3)
        await b.close()
    print(len(out),'pauses'); print('\n'.join(logs[:14]))
    seen={}
    for info,fr in out:
        key=tuple(f[1] for f in fr[:4] if f[1])
        seen.setdefault(key,0); seen[key]+=1
    for k,v in seen.items(): print(v,'x',k)
asyncio.run(main())
