import sys,time,threading,functools,http.server,socketserver
ROOT='/tmp/art'
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8126),functools.partial(Q,directory=ROOT))
threading.Thread(target=srv.serve_forever,daemon=True).start()
from playwright.sync_api import sync_playwright
logs=[]
steps=[l.split() for l in sys.argv[1].split(';')]   # "click x y" / "wait s" / "shot name" / "type text" / "key K"
with sync_playwright() as p:
    b=p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
    pg=b.new_page(viewport={'width':854,'height':480})
    pg.on("console",lambda m: logs.append("[%s] %s"%(m.type,m.text)))
    pg.on("pageerror",lambda e: logs.append("[PAGEERROR] %s"%e))
    pg.goto("http://127.0.0.1:8126/index.html"); time.sleep(12)
    for st in steps:
        if st[0]=='click': pg.mouse.move(int(st[1]),int(st[2])); time.sleep(2); pg.mouse.down(); time.sleep(1); pg.mouse.up(); time.sleep(3)
        elif st[0]=='wait': time.sleep(float(st[1]))
        elif st[0]=='shot': pg.screenshot(path='/tmp/%s.png'%st[1])
        elif st[0]=='type': pg.keyboard.type(' '.join(st[1:]),delay=80); time.sleep(.5)
        elif st[0]=='key': pg.keyboard.press(st[1]); time.sleep(.5)
    txt=pg.evaluate("()=>{const e=document.getElementById('crash-log');return e?(e.value||e.textContent):''}")
    b.close()
print("CRASHLOG:",txt[:1500])
print("\n".join(l[:300] for l in logs if 'copyTexSub' not in l)[-3000:])
