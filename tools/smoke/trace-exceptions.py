import re,sys,time,threading,functools,http.server,socketserver
sys.path.insert(0,'/tmp'); from smap import SM
ROOT='/tmp/art'; sm=SM(ROOT+'/mc100.js.map')
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8125),functools.partial(Q,directory=ROOT))
threading.Thread(target=srv.serve_forever,daemon=True).start()
from playwright.sync_api import sync_playwright
pauses=[]
with sync_playwright() as p:
    b=p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
    ctx=b.new_context(viewport={'width':854,'height':480}); pg=ctx.new_page()
    cdp=ctx.new_cdp_session(pg); cdp.send("Debugger.enable"); cdp.send("Debugger.setPauseOnExceptions",{"state":"all"})
    def on_paused(ev):
        fr=[]
        for f in ev['callFrames'][:14]:
            u=f.get('url','')
            if u.endswith('mc100.js') or u==''  :
                loc=f['location']; fr.append((f['functionName'],sm.lookup(loc['lineNumber'],loc['columnNumber'])))
            else: fr.append((f['functionName'],u.split('/')[-1]+':%d'%(f['location']['lineNumber']+1)))
        d=ev.get('data',{}) or {}
        desc=d.get('description','') if isinstance(d,dict) else str(d)
        mapped=[]
        for m in re.finditer(r'at (\S+) \(\S*mc100\.js:(\d+):(\d+)\)',desc):
            mapped.append((m.group(1),sm.lookup(int(m.group(2))-1,int(m.group(3))-1)))
        pauses.append(('JSSTACK' ,mapped+[('--','--')]+fr))
        try: cdp.send("Debugger.resume")
        except Exception: pass
    cdp.on("Debugger.paused",on_paused)
    pg.goto("http://127.0.0.1:8125/index.html"); time.sleep(int(sys.argv[1]) if len(sys.argv)>1 else 20)
    b.close()
print(len(pauses),"exception pauses")
for d,fr in pauses[:int(sys.argv[2]) if len(sys.argv)>2 else 6]:
    print("EXC:",d)
    for f in fr: print("   ",f)
