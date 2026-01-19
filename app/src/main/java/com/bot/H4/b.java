package H4;

import C4.s;
import C4.u;
import D.C0056a;
import D.b1;
import X3.y;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x4.C1928k;
import x4.D0;
import x4.InterfaceC1927j;

/* loaded from: classes.dex */
public final class b implements InterfaceC1927j, D0 {

    /* renamed from: c, reason: collision with root package name */
    public final C1928k f2050c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f2051e;

    public b(c cVar, C1928k c1928k) {
        this.f2051e = cVar;
        this.f2050c = c1928k;
    }

    @Override // x4.D0
    public final void a(s sVar, int i6) {
        this.f2050c.a(sVar, i6);
    }

    @Override // x4.InterfaceC1927j
    public final void e(Object obj, l4.f fVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f2052k;
        c cVar = this.f2051e;
        atomicReferenceFieldUpdater.set(cVar, null);
        C0056a c0056a = new C0056a(2, cVar, this);
        C1928k c1928k = this.f2050c;
        c1928k.E(y.a, c1928k.f15657f, new b1(c0056a, 16));
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        this.f2050c.k(obj);
    }

    @Override // x4.InterfaceC1927j
    public final u l(Object obj, l4.f fVar) {
        c cVar = this.f2051e;
        b1 b1Var = new b1(cVar, this);
        u H3 = this.f2050c.H((y) obj, b1Var);
        if (H3 != null) {
            c.f2052k.set(cVar, null);
        }
        return H3;
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f2050c.f15708h;
    }

    @Override // x4.InterfaceC1927j
    public final boolean w(Throwable th) {
        return this.f2050c.w(th);
    }

    @Override // x4.InterfaceC1927j
    public final void z(Object obj) {
        this.f2050c.z(obj);
    }
}
