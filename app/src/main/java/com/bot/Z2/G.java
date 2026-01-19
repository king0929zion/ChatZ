package Z2;

import a3.C0813b;
import a3.C0817f;
import a3.C0818g;
import com.bot.core.model.McpServer;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9965c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0818g f9966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f9967f;

    public /* synthetic */ G(C0818g c0818g, InterfaceC1193a interfaceC1193a, int i6) {
        this.f9965c = i6;
        this.f9966e = c0818g;
        this.f9967f = interfaceC1193a;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        McpServer mcpServer = (McpServer) obj;
        switch (this.f9965c) {
            case 0:
                AbstractC1276k.f(mcpServer, "server");
                C0818g c0818g = this.f9966e;
                c0818g.getClass();
                AbstractC1888A.y(androidx.lifecycle.O.i(c0818g), null, new C0813b(c0818g, null, mcpServer), 3);
                this.f9967f.b();
                break;
            default:
                AbstractC1276k.f(mcpServer, "updated");
                C0818g c0818g2 = this.f9966e;
                c0818g2.getClass();
                AbstractC1888A.y(androidx.lifecycle.O.i(c0818g2), null, new C0817f(c0818g2, null, mcpServer), 3);
                this.f9967f.b();
                break;
        }
        return X3.y.a;
    }
}
