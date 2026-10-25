import sys,time,threading,functools,http.server,socketserver
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8172),functools.partial(Q,directory='/tmp/art')); threading.Thread(target=srv.serve_forever,daemon=True).start()
from playwright.sync_api import sync_playwright
logs=[]
with sync_playwright() as p:
    b=p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
    pg=b.new_page(viewport={'width':854,'height':480})
    pg.on("console",lambda m: logs.append("[%s] %s"%(m.type,m.text[:300])))
    pg.on("pageerror",lambda e: logs.append("[PAGEERROR] %s"%str(e)[:300]))
    pg.goto("http://127.0.0.1:8172/index.html"); time.sleep(12)
    for (x,y,w) in [(427,236,2),(583,395,1),(583,395,3),(266,443,0)]:
        pg.mouse.move(x,y); time.sleep(2); pg.mouse.down(); time.sleep(1); pg.mouse.up(); time.sleep(3+w)
    n=int(sys.argv[1]) if len(sys.argv)>1 else 10
    time.sleep(150)
    for i in range(n):
        time.sleep(10)
        try:
            t=pg.evaluate("()=>{const e=document.getElementById('crash-log');return e?(e.value||e.textContent):''}")
        except Exception as e: t='EVALERR '+str(e)[:100]
        print(i*10+10,'s crash:',repr(t[:1800]) if t else '-'); 
        if t and not t.startswith('EVALERR'): break
    try: pg.screenshot(path='/tmp/poll.png',timeout=200000)
    except Exception as e: print('shot failed')
    b.close()
import collections
c=collections.Counter(l[:200] for l in logs)
for k,v in c.most_common(60):
    if any(t in k for t in ('DBG','SPAWN','stronghold','error','Error','WorldStore')): print(v,k)
