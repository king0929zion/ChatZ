package M;

import D.C0098v0;
import H0.AbstractC0157l;
import I0.C0207s0;
import I0.S0;
import l4.InterfaceC1193a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3157c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f3158e;

    public /* synthetic */ h(j jVar, int i6) {
        this.f3157c = i6;
        this.f3158e = jVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        S0 s02;
        switch (this.f3157c) {
            case 0:
                AbstractC0157l.s(this.f3158e);
                return X3.y.a;
            case 1:
                this.f3158e.f3169z.h(true);
                return Boolean.TRUE;
            case 2:
                this.f3158e.f3169z.d(true);
                return Boolean.TRUE;
            case 3:
                this.f3158e.f3169z.f();
                return Boolean.TRUE;
            case 4:
                AbstractC0157l.s(this.f3158e);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                this.f3158e.f3169z.p();
                return Boolean.TRUE;
            case 6:
                j jVar = this.f3158e;
                jVar.f3165v.f1204w.f869e.f1199r.b(jVar.f3161A.f9112e);
                return Boolean.TRUE;
            default:
                j jVar2 = this.f3158e;
                C0098v0 c0098v0 = jVar2.f3165v;
                m0.w wVar = jVar2.f3162B;
                boolean z5 = jVar2.f3166w;
                if (!c0098v0.b()) {
                    m0.w.a(wVar);
                } else if (!z5 && (s02 = c0098v0.f1184c) != null) {
                    ((C0207s0) s02).b();
                }
                return Boolean.TRUE;
        }
    }
}
