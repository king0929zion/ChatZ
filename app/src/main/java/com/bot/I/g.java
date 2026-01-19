package I;

import android.view.ActionMode;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.CoreNodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import i1.AbstractC1087g;
import i4.AbstractC1117a;
import java.util.concurrent.ThreadPoolExecutor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2080c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2083g;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i6) {
        this.f2080c = i6;
        this.f2081e = obj;
        this.f2082f = obj2;
        this.f2083g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2080c) {
            case 0:
                i iVar = (i) this.f2081e;
                e eVar = (e) this.f2082f;
                f fVar = (f) this.f2083g;
                ActionMode startActionMode = iVar.a.startActionMode(new q(eVar), 1);
                AbstractC1276k.b(iVar.f2092h, startActionMode);
                if (startActionMode == null) {
                    fVar.close();
                    return;
                }
                return;
            case 1:
                CoreNodeRenderer.lambda$render$0((HtmlWriter) this.f2081e, (Heading) this.f2082f, (NodeRendererContext) this.f2083g);
                return;
            default:
                L1.e eVar2 = (L1.e) this.f2081e;
                AbstractC1117a abstractC1117a = (AbstractC1117a) this.f2082f;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f2083g;
                try {
                    y1.s i6 = AbstractC1087g.i(eVar2.a);
                    if (i6 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    y1.r rVar = (y1.r) ((y1.i) i6.f3795b);
                    synchronized (rVar.f15996d) {
                        rVar.f15998f = threadPoolExecutor;
                    }
                    ((y1.i) i6.f3795b).a(new y1.l(abstractC1117a, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC1117a.r(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
