package P2;

import Q.InterfaceC0471u1;
import Q.V1;
import Q.t3;
import T.C0626q;
import Z2.AbstractC0783w;
import a3.C0818g;
import b0.C0873f;
import com.bot.core.model.McpServer;
import java.util.List;
import l4.InterfaceC1193a;
import n.InterfaceC1351z;

/* renamed from: P2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0343a0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4820c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4823g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4824h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4825i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4826j;

    public /* synthetic */ C0343a0(L2.b bVar, List list, int i6, I0.S0 s02, l4.c cVar, InterfaceC1193a interfaceC1193a, int i7) {
        this.f4820c = 0;
        this.f4822f = bVar;
        this.f4823g = list;
        this.f4821e = i6;
        this.f4824h = s02;
        this.f4825i = cVar;
        this.f4826j = interfaceC1193a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f4820c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(24577);
                V.g((L2.b) this.f4822f, (List) this.f4823g, this.f4821e, (I0.S0) this.f4824h, (l4.c) this.f4825i, (InterfaceC1193a) this.f4826j, (C0626q) obj, J4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                Q.E0.a((Q.N) this.f4822f, (InterfaceC0471u1) this.f4823g, (V1) this.f4824h, (t3) this.f4825i, (C0873f) this.f4826j, (C0626q) obj, T.r.J(this.f4821e | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC0783w.m((String) this.f4822f, (McpServer) this.f4823g, (C0818g) this.f4824h, (InterfaceC1193a) this.f4826j, (l4.c) this.f4825i, (C0626q) obj, T.r.J(this.f4821e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                n.C0.a((n.y0) this.f4822f, (n.u0) this.f4823g, this.f4824h, this.f4825i, (InterfaceC1351z) this.f4826j, (C0626q) obj, T.r.J(this.f4821e | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0343a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i6, int i7) {
        this.f4820c = i7;
        this.f4822f = obj;
        this.f4823g = obj2;
        this.f4824h = obj3;
        this.f4825i = obj4;
        this.f4826j = obj5;
        this.f4821e = i6;
    }

    public /* synthetic */ C0343a0(String str, McpServer mcpServer, C0818g c0818g, InterfaceC1193a interfaceC1193a, l4.c cVar, int i6) {
        this.f4820c = 2;
        this.f4822f = str;
        this.f4823g = mcpServer;
        this.f4824h = c0818g;
        this.f4826j = interfaceC1193a;
        this.f4825i = cVar;
        this.f4821e = i6;
    }
}
