package O;

import k.AbstractC1171s;
import k.C1151E;

/* loaded from: classes.dex */
public final class C0 implements InterfaceC0307f0 {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3919b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3920c;

    /* renamed from: d, reason: collision with root package name */
    public final G f3921d;

    /* renamed from: e, reason: collision with root package name */
    public final D f3922e;

    public C0(boolean z5, int i6, int i7, G g3, D d6) {
        this.a = z5;
        this.f3919b = i6;
        this.f3920c = i7;
        this.f3921d = g3;
        this.f3922e = d6;
    }

    @Override // O.InterfaceC0307f0
    public final boolean a() {
        return this.a;
    }

    @Override // O.InterfaceC0307f0
    public final D b() {
        return this.f3922e;
    }

    @Override // O.InterfaceC0307f0
    public final G c() {
        return this.f3921d;
    }

    @Override // O.InterfaceC0307f0
    public final D d() {
        return this.f3922e;
    }

    @Override // O.InterfaceC0307f0
    public final boolean e(InterfaceC0307f0 interfaceC0307f0) {
        if (this.f3921d == null || interfaceC0307f0 == null || !(interfaceC0307f0 instanceof C0)) {
            return true;
        }
        C0 c02 = (C0) interfaceC0307f0;
        if (this.f3919b != c02.f3919b || this.f3920c != c02.f3920c || this.a != c02.a) {
            return true;
        }
        D d6 = c02.f3922e;
        D d7 = this.f3922e;
        return (d7.a == d6.a && d7.f3924c == d6.f3924c && d7.f3925d == d6.f3925d) ? false : true;
    }

    @Override // O.InterfaceC0307f0
    public final int f() {
        return this.f3920c;
    }

    @Override // O.InterfaceC0307f0
    public final D g() {
        return this.f3922e;
    }

    @Override // O.InterfaceC0307f0
    public final EnumC0318l h() {
        int i6 = this.f3919b;
        int i7 = this.f3920c;
        return i6 < i7 ? EnumC0318l.f4146e : i6 > i7 ? EnumC0318l.f4145c : this.f3922e.b();
    }

    @Override // O.InterfaceC0307f0
    public final C1151E i(G g3) {
        boolean z5 = g3.f3946c;
        F f6 = g3.f3945b;
        F f7 = g3.a;
        if ((!z5 && f7.f3941b > f6.f3941b) || (z5 && f7.f3941b <= f6.f3941b)) {
            g3 = G.a(g3, null, null, !z5, 3);
        }
        long j3 = this.f3922e.a;
        C1151E c1151e = AbstractC1171s.a;
        C1151E c1151e2 = new C1151E();
        c1151e2.h(j3, g3);
        return c1151e2;
    }

    @Override // O.InterfaceC0307f0
    public final void j(l4.c cVar) {
    }

    @Override // O.InterfaceC0307f0
    public final D k() {
        return this.f3922e;
    }

    @Override // O.InterfaceC0307f0
    public final int l() {
        return this.f3919b;
    }

    @Override // O.InterfaceC0307f0
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + h() + ", info=\n\t" + this.f3922e + ')';
    }
}
