import time,functools,http.server,socketserver,threading
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8160),functools.partial(Q,directory='/tmp/art')); threading.Thread(target=srv.serve_forever,daemon=True).start()
from playwright.sync_api import sync_playwright
with sync_playwright() as p:
    b=p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
    pg=b.new_page(); logs=[]
    pg.on('console',lambda m: logs.append(m.text))
    pg.goto("http://127.0.0.1:8160/index.html"); time.sleep(16)
    b.close()
print('\n'.join(l for l in logs if 'SELFTEST' in l or 'error' in l.lower()))
