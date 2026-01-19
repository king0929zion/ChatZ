package H0;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class P extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f1787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v0 f1790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s5, long j3, long j4, v0 v0Var) {
        super(0);
        this.f1787e = s5;
        this.f1788f = j3;
        this.f1789g = j4;
        this.f1790h = v0Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        S s5 = this.f1787e;
        s5.H0().f1783c = false;
        s5.H0().f1784e = this.f1788f;
        s5.H0().f1785f = this.f1789g;
        l4.c f6 = this.f1790h.f2002c.f();
        if (f6 != null) {
            f6.f(s5.H0());
        }
        return X3.y.a;
    }
}
