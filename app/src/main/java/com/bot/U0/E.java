package u0;

import H0.C0158m;
import f0.C0987j;
import j1.AbstractC1135a;
import m4.AbstractC1277l;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public final class E extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f14961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f6, int i6) {
        super(1);
        this.f14960e = i6;
        this.f14961f = f6;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [m4.l, l4.a] */
    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f14960e) {
            case 0:
                F f6 = this.f14961f;
                f6.f14964d = true;
                f6.f14966f.b();
                return X3.y.a;
            default:
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                F f7 = this.f14961f;
                C1743d c1743d = f7.f14962b;
                float f8 = f7.f14971k;
                float f9 = f7.f14972l;
                C0158m g02 = interfaceC1498d.g0();
                long j3 = g02.j();
                g02.g().h();
                try {
                    ((C0987j) g02.f1972e).D(f8, f9, 0L);
                    c1743d.a(interfaceC1498d);
                    AbstractC1135a.q(g02, j3);
                    return X3.y.a;
                } catch (Throwable th) {
                    AbstractC1135a.q(g02, j3);
                    throw th;
                }
        }
    }
}
