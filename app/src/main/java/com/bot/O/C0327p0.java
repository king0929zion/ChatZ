package O;

import D.C0098v0;
import D.EnumC0073i0;
import D.d1;
import F0.InterfaceC0134w;
import T.C0607g0;
import m4.AbstractC1276k;
import n0.C1353b;
import u.AbstractC1734b;

/* renamed from: O.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327p0 implements D.H0 {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4171c;

    public C0327p0(N0 n02, boolean z5) {
        this.f4171c = n02;
        this.f4170b = z5;
    }

    private final void f() {
    }

    private final void g(long j3, H h3) {
    }

    @Override // D.H0
    public final void a(long j3, H h3) {
        switch (this.a) {
            case 0:
                C0332s0 c0332s0 = (C0332s0) this.f4171c;
                if (c0332s0.e() == null) {
                    return;
                }
                G f6 = c0332s0.f();
                AbstractC1276k.c(f6);
                boolean z5 = this.f4170b;
                Object e6 = c0332s0.a.f4265c.e((z5 ? f6.a : f6.f3945b).f3942c);
                if (e6 == null) {
                    AbstractC1734b.d("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new RuntimeException();
                }
                r rVar = (r) e6;
                InterfaceC0134w c6 = rVar.c();
                if (c6 == null) {
                    AbstractC1734b.d("Current selectable should have layout coordinates.");
                    throw new RuntimeException();
                }
                long a = rVar.a(f6, z5);
                if ((9223372034707292159L & a) == 9205357640488583168L) {
                    return;
                }
                c0332s0.f4203n.setValue(new C1353b(c0332s0.j().R(c6, AbstractC0305e0.a(a))));
                c0332s0.f4204o.setValue(new C1353b(0L));
                return;
            default:
                return;
        }
    }

    @Override // D.H0
    public final void b() {
        switch (this.a) {
            case 0:
                C0332s0 c0332s0 = (C0332s0) this.f4171c;
                c0332s0.f4213x = true;
                c0332s0.o();
                c0332s0.f4207r.setValue(null);
                c0332s0.f4208s.setValue(null);
                return;
            default:
                N0 n02 = (N0) this.f4171c;
                n02.f4008q.setValue(null);
                n02.f4009r.setValue(null);
                n02.t(true);
                return;
        }
    }

    @Override // D.H0
    public final void c() {
        switch (this.a) {
            case 0:
                C0332s0 c0332s0 = (C0332s0) this.f4171c;
                c0332s0.f4213x = true;
                c0332s0.o();
                c0332s0.f4207r.setValue(null);
                c0332s0.f4208s.setValue(null);
                return;
            default:
                N0 n02 = (N0) this.f4171c;
                n02.f4008q.setValue(null);
                n02.f4009r.setValue(null);
                n02.t(true);
                return;
        }
    }

    @Override // D.H0
    public final void d() {
        G f6;
        InterfaceC0134w c6;
        d1 d6;
        switch (this.a) {
            case 0:
                C0332s0 c0332s0 = (C0332s0) this.f4171c;
                boolean z5 = this.f4170b;
                if ((z5 ? (C1353b) c0332s0.f4205p.getValue() : (C1353b) c0332s0.f4206q.getValue()) == null || (f6 = c0332s0.f()) == null) {
                    return;
                }
                r c7 = c0332s0.c(z5 ? f6.a : f6.f3945b);
                if (c7 == null || (c6 = c7.c()) == null) {
                    return;
                }
                long a = c7.a(f6, z5);
                if ((9223372034707292159L & a) == 9205357640488583168L) {
                    return;
                }
                c0332s0.f4208s.setValue(new C1353b(c0332s0.j().R(c6, AbstractC0305e0.a(a))));
                c0332s0.f4207r.setValue(z5 ? EnumC0073i0.f1035e : EnumC0073i0.f1036f);
                c0332s0.f4213x = false;
                c0332s0.o();
                return;
            default:
                N0 n02 = (N0) this.f4171c;
                boolean z6 = this.f4170b;
                n02.f4008q.setValue(z6 ? EnumC0073i0.f1035e : EnumC0073i0.f1036f);
                long a6 = AbstractC0305e0.a(n02.l(z6));
                C0098v0 c0098v0 = n02.f3995d;
                if (c0098v0 == null || (d6 = c0098v0.d()) == null) {
                    return;
                }
                long e6 = d6.e(a6);
                n02.f4005n = e6;
                n02.f4009r.setValue(new C1353b(e6));
                n02.f4007p = 0L;
                n02.f4010s = -1;
                C0098v0 c0098v02 = n02.f3995d;
                if (c0098v02 != null) {
                    c0098v02.f1198q.setValue(Boolean.TRUE);
                }
                n02.t(false);
                return;
        }
    }

    @Override // D.H0
    public final void e(long j3) {
        switch (this.a) {
            case 0:
                C0332s0 c0332s0 = (C0332s0) this.f4171c;
                C0607g0 c0607g0 = c0332s0.f4203n;
                C0607g0 c0607g02 = c0332s0.f4204o;
                if (c0332s0.e() == null) {
                    return;
                }
                c0607g02.setValue(new C1353b(C1353b.f(((C1353b) c0607g02.getValue()).a, j3)));
                long f6 = C1353b.f(((C1353b) c0607g0.getValue()).a, ((C1353b) c0607g02.getValue()).a);
                if (c0332s0.n(f6, ((C1353b) c0607g0.getValue()).a, this.f4170b, I.f3956g)) {
                    c0607g0.setValue(new C1353b(f6));
                    c0607g02.setValue(new C1353b(0L));
                    return;
                }
                return;
            default:
                N0 n02 = (N0) this.f4171c;
                long f7 = C1353b.f(n02.f4007p, j3);
                n02.f4007p = f7;
                n02.f4009r.setValue(new C1353b(C1353b.f(n02.f4005n, f7)));
                X0.v n3 = n02.n();
                C1353b i6 = n02.i();
                AbstractC1276k.c(i6);
                N0.c(n02, n3, i6.a, false, this.f4170b, I.f3956g, true);
                n02.t(false);
                return;
        }
    }

    @Override // D.H0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                C0332s0 c0332s0 = (C0332s0) this.f4171c;
                c0332s0.f4213x = true;
                c0332s0.o();
                c0332s0.f4207r.setValue(null);
                c0332s0.f4208s.setValue(null);
                return;
            default:
                return;
        }
    }

    public C0327p0(boolean z5, C0332s0 c0332s0) {
        this.f4170b = z5;
        this.f4171c = c0332s0;
    }
}
