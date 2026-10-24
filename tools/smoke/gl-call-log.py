import sys,time,json,threading,functools,http.server,socketserver
class Q(http.server.SimpleHTTPRequestHandler):
    def log_message(self,*a): pass
socketserver.TCPServer.allow_reuse_address=True
srv=socketserver.TCPServer(("127.0.0.1",8152),functools.partial(Q,directory='/tmp/art')); threading.Thread(target=srv.serve_forever,daemon=True).start()
INIT = """
(function(){
  window.__gl=[]; window.__uname=new WeakMap(); window.__frames=0; window.__cnt={};
  const orig=HTMLCanvasElement.prototype.getContext;
  HTMLCanvasElement.prototype.getContext=function(type,opts){
    const ctx=orig.call(this,type,opts); if(!ctx||type!=='webgl2'||ctx.__wrapped) return ctx; ctx.__wrapped=true;
    const proto=Object.getPrototypeOf(ctx);
    const skip=new Set(['getError','getParameter','getExtension','getSupportedExtensions','isEnabled','getShaderParameter','getProgramParameter','checkFramebufferStatus','getShaderInfoLog','getProgramInfoLog','getAttribLocation','createBuffer','createTexture','createVertexArray','createShader','createProgram']);
    for(const k of Object.getOwnPropertyNames(proto)){
      const d=Object.getOwnPropertyDescriptor(proto,k); if(!d||typeof d.value!=='function'||skip.has(k)||k==='constructor') continue;
      const f=d.value;
      ctx[k]=function(){
        const r=f.apply(ctx,arguments);
        if(k==='getUniformLocation'&&r) window.__uname.set(r,arguments[1]);
        let a=[];
        for(let i=0;i<arguments.length&&i<6;i++){const v=arguments[i]; a.push(v&&typeof v==='object'?(window.__uname.get(v)||v.constructor.name+(v.length!==undefined?('['+v.length+']'+(v.length<=16?JSON.stringify(Array.from(v)):'')):'')):v);}
        const L=window.__gl; L.push(k+'('+a.join(',')+')'); if(L.length>12000) L.splice(0,6000);
        if(k==='clear') window.__frames++;
        if(k==='texImage2D'||k==='createTexture'||k==='deleteTexture'){const key=k+'('+Array.prototype.slice.call(arguments,0,6).filter(v=>typeof v==='number').join(',')+')'; window.__cnt[key]=(window.__cnt[key]||0)+1;}
        return r;
      };
    }
    return ctx;
  };
})();
"""
from playwright.sync_api import sync_playwright
with sync_playwright() as p:
    b=p.chromium.launch(args=["--use-angle=swiftshader","--use-gl=angle","--enable-unsafe-swiftshader","--ignore-gpu-blocklist"])
    pg=b.new_page(viewport={'width':854,'height':480}); pg.add_init_script(INIT)
    pg.goto("http://127.0.0.1:8152/index.html"); time.sleep(12)
    for (x,y,w) in [(427,236,2),(583,395,1),(583,395,3),(266,443,0)]:
        pg.mouse.move(x,y); time.sleep(2); pg.mouse.down(); time.sleep(1); pg.mouse.up(); time.sleep(3+w)
    time.sleep(int(sys.argv[1]))
    log=pg.evaluate("()=>window.__gl.slice(-2500)")
    open('/tmp/gllog.txt','w').write('\n'.join(log))
    print('frames',pg.evaluate("()=>window.__frames")); print(json.dumps(pg.evaluate("()=>window.__cnt"),indent=0))
    b.close()
