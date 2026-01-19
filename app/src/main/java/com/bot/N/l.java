package N;

import F0.InterfaceC0134w;
import O.A0;
import O.C0319l0;
import O.H;
import O.I;
import O.InterfaceC0326p;
import O.L;
import O.z0;
import n.AbstractC1343r;
import n.EnumC1310T;
import n.F0;
import n.H0;
import n0.C1353b;

/* loaded from: classes.dex */
public final class l implements InterfaceC0326p, F0 {

    /* renamed from: c, reason: collision with root package name */
    public long f3579c;

    /* renamed from: e, reason: collision with root package name */
    public final long f3580e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3581f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3582g;

    public l(h hVar, z0 z0Var, long j3) {
        this.f3581f = hVar;
        this.f3582g = z0Var;
        this.f3580e = j3;
        this.f3579c = 0L;
    }

    @Override // n.F0
    public boolean a() {
        return true;
    }

    @Override // n.F0
    public long b(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return Long.MAX_VALUE;
    }

    @Override // O.InterfaceC0326p
    public boolean c(long j3) {
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) ((h) this.f3581f).b();
        if (interfaceC0134w == null) {
            return true;
        }
        z0 z0Var = (z0) this.f3582g;
        if (!interfaceC0134w.j() || !A0.a(z0Var, this.f3580e)) {
            return false;
        }
        if (!z0Var.b(interfaceC0134w, j3, this.f3579c, I.f3953d, false)) {
            return true;
        }
        this.f3579c = j3;
        return true;
    }

    @Override // O.InterfaceC0326p
    public void d() {
        L l3 = ((z0) this.f3582g).f4270h;
        if (l3 != null) {
            l3.b();
        }
    }

    @Override // O.InterfaceC0326p
    public boolean e(long j3, H h3, int i6) {
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) ((h) this.f3581f).b();
        if (interfaceC0134w == null) {
            return false;
        }
        z0 z0Var = (z0) this.f3582g;
        if (!interfaceC0134w.j()) {
            return false;
        }
        C0319l0 c0319l0 = z0Var.f4268f;
        if (c0319l0 != null) {
            c0319l0.i(Boolean.FALSE, interfaceC0134w, new C1353b(j3), h3);
        }
        this.f3579c = j3;
        return A0.a(z0Var, this.f3580e);
    }

    @Override // O.InterfaceC0326p
    public boolean f(long j3, H h3) {
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) ((h) this.f3581f).b();
        if (interfaceC0134w == null) {
            return true;
        }
        z0 z0Var = (z0) this.f3582g;
        if (!interfaceC0134w.j() || !A0.a(z0Var, this.f3580e)) {
            return false;
        }
        if (!z0Var.b(interfaceC0134w, j3, this.f3579c, h3, false)) {
            return true;
        }
        this.f3579c = j3;
        return true;
    }

    @Override // O.InterfaceC0326p
    public boolean g(long j3) {
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) ((h) this.f3581f).b();
        if (interfaceC0134w == null) {
            return false;
        }
        z0 z0Var = (z0) this.f3582g;
        if (!interfaceC0134w.j()) {
            return false;
        }
        if (z0Var.b(interfaceC0134w, j3, this.f3579c, I.f3953d, false)) {
            this.f3579c = j3;
        }
        return A0.a(z0Var, this.f3580e);
    }

    @Override // n.F0
    public AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H0) this.f3581f).i(j(j3), abstractC1343r, abstractC1343r2, k(j3, abstractC1343r, abstractC1343r3, abstractC1343r2));
    }

    public long j(long j3) {
        long j4 = this.f3580e;
        if (j3 + j4 <= 0) {
            return 0L;
        }
        long j5 = j3 + j4;
        long j6 = this.f3579c;
        long j7 = j5 / j6;
        return (((EnumC1310T) this.f3582g) == EnumC1310T.f13041c || j7 % ((long) 2) == 0) ? j5 - (j7 * j6) : ((j7 + 1) * j6) - j5;
    }

    public AbstractC1343r k(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        long j4 = this.f3580e;
        long j5 = j3 + j4;
        long j6 = this.f3579c;
        return j5 > j6 ? ((H0) this.f3581f).q(j6 - j4, abstractC1343r, abstractC1343r3, abstractC1343r2) : abstractC1343r2;
    }

    @Override // n.F0
    public AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H0) this.f3581f).q(j(j3), abstractC1343r, abstractC1343r2, k(j3, abstractC1343r, abstractC1343r3, abstractC1343r2));
    }

    public l(H0 h02, EnumC1310T enumC1310T, long j3) {
        this.f3581f = h02;
        this.f3582g = enumC1310T;
        this.f3579c = (h02.r() + h02.p()) * 1000000;
        this.f3580e = j3 * 1000000;
    }
}
