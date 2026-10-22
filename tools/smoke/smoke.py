import sys,time,threading,functools,http.server,socketserver
ROOT=sys.argv[2] if len(sys.argv)>2 else '/tmp/art'
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8124),functools.partial(Q,directory=ROOT))
threading.Thread(target=srv.serve_forever,daemon=True).start()
from playwright.sync_api import sync_playwright
secs=int(sys.argv[1]) if len(sys.argv)>1 else 25
logs=[]
with sync_playwright() as p:
    b=p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
    pg=b.new_page(viewport={'width':854,'height':480})
    pg.on("console",lambda m: logs.append("[%s] %s"%(m.type,m.text)))
    pg.on("pageerror",lambda e: logs.append("[PAGEERROR] %s"%e))
    pg.goto("http://127.0.0.1:8124/index.html")
    time.sleep(secs)
    pg.screenshot(path="/tmp/shot.png")
    txt=pg.evaluate("""()=>{const r=[];document.querySelectorAll('textarea,pre').forEach(e=>r.push((e.id||e.tagName)+': '+(e.value||e.textContent)));return r.join('\\n---\\n')}""")
    print(txt[:7000]); b.close()
print("\n".join(l[:500] for l in logs[:60]))
