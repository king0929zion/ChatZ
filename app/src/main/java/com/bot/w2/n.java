package W2;

import A4.g0;
import X3.y;
import a3.C0825n;
import a3.t;
import a3.w;
import androidx.lifecycle.O;
import l4.InterfaceC1193a;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8947c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f8948e;

    public /* synthetic */ n(w wVar, int i6) {
        this.f8947c = i6;
        this.f8948e = wVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f8947c) {
            case 0:
                w wVar = this.f8948e;
                wVar.getClass();
                AbstractC1888A.y(O.i(wVar), null, new a3.r(wVar, null), 3);
                break;
            case 1:
                w wVar2 = this.f8948e;
                wVar2.getClass();
                AbstractC1888A.y(O.i(wVar2), null, new C0825n(wVar2, null), 3);
                break;
            case 2:
                this.f8948e.h();
                break;
            case 3:
                this.f8948e.h();
                break;
            case 4:
                w wVar3 = this.f8948e;
                wVar3.f10718Q.k(null);
                g0 g0Var = wVar3.f10726Y;
                Boolean bool = Boolean.TRUE;
                g0Var.getClass();
                g0Var.l(null, bool);
                break;
            default:
                w wVar4 = this.f8948e;
                wVar4.getClass();
                AbstractC1888A.y(O.i(wVar4), null, new t(wVar4, null), 3);
                break;
        }
        return y.a;
    }
}
