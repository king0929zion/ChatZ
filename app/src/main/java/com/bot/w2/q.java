package W2;

import T.C0626q;
import X2.C0692g;
import X2.L;
import X2.Y;
import X3.y;
import Y3.C;
import Z2.AbstractC0783w;
import a3.C0808F;
import a3.w;
import androidx.lifecycle.U;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9003c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f9004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f9005f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U f9006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f9007h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9009j;

    public /* synthetic */ q(L l3, w wVar, C0692g c0692g, Y y5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, int i6) {
        this.f9006g = l3;
        this.f9007h = wVar;
        this.f9008i = c0692g;
        this.f9009j = y5;
        this.f9004e = interfaceC1193a;
        this.f9005f = interfaceC1193a2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f9003c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(4673);
                C.c((L) this.f9006g, (w) this.f9007h, (C0692g) this.f9008i, (Y) this.f9009j, this.f9004e, this.f9005f, (C0626q) obj, J4);
                break;
            default:
                ((Integer) obj2).getClass();
                int J5 = T.r.J(9);
                AbstractC0783w.E((C0808F) this.f9006g, this.f9004e, (l4.c) this.f9007h, (l4.c) this.f9008i, this.f9005f, (InterfaceC1193a) this.f9009j, (C0626q) obj, J5);
                break;
        }
        return y.a;
    }

    public /* synthetic */ q(C0808F c0808f, InterfaceC1193a interfaceC1193a, l4.c cVar, l4.c cVar2, InterfaceC1193a interfaceC1193a2, InterfaceC1193a interfaceC1193a3, int i6) {
        this.f9006g = c0808f;
        this.f9004e = interfaceC1193a;
        this.f9007h = cVar;
        this.f9008i = cVar2;
        this.f9005f = interfaceC1193a2;
        this.f9009j = interfaceC1193a3;
    }
}
