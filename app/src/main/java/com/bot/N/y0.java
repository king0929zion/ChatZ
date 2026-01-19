package n;

import D.C0072i;
import T.C0602e;
import T.C0603e0;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.d1;
import f0.C0996s;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class y0 {
    public final N3.s a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f13278b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13279c;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f13280d;

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f13281e;

    /* renamed from: f, reason: collision with root package name */
    public final C0603e0 f13282f = new C0603e0(0);

    /* renamed from: g, reason: collision with root package name */
    public final C0603e0 f13283g = new C0603e0(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final C0607g0 f13284h;

    /* renamed from: i, reason: collision with root package name */
    public final C0996s f13285i;

    /* renamed from: j, reason: collision with root package name */
    public final C0996s f13286j;

    /* renamed from: k, reason: collision with root package name */
    public final C0607g0 f13287k;

    /* renamed from: l, reason: collision with root package name */
    public final T.E f13288l;

    public y0(N3.s sVar, y0 y0Var, String str) {
        this.a = sVar;
        this.f13278b = y0Var;
        this.f13279c = str;
        this.f13280d = T.r.A(sVar.k());
        this.f13281e = T.r.A(new t0(sVar.k(), sVar.k()));
        Boolean bool = Boolean.FALSE;
        this.f13284h = T.r.A(bool);
        this.f13285i = new C0996s();
        this.f13286j = new C0996s();
        this.f13287k = T.r.A(bool);
        this.f13288l = T.r.s(new p0(this, 1));
        sVar.p(this);
    }

    public final void a(Object obj, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1493585151);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(obj) : c0626q.h(obj) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(this) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            if (g()) {
                c0626q.b0(416369985);
            } else {
                c0626q.b0(466062241);
                p(obj);
                int i8 = i7 & 112;
                boolean z5 = i8 == 32;
                Object P5 = c0626q.P();
                C0602e c0602e = C0616l.a;
                if (z5 || P5 == c0602e) {
                    P5 = T.r.s(new p0(this, 0));
                    c0626q.m0(P5);
                }
                if (((Boolean) ((d1) P5).getValue()).booleanValue()) {
                    c0626q.b0(466470356);
                    Object P6 = c0626q.P();
                    if (P6 == c0602e) {
                        P6 = T.r.p(c0626q);
                        c0626q.m0(P6);
                    }
                    InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P6;
                    boolean h3 = c0626q.h(interfaceC1942y) | (i8 == 32);
                    Object P7 = c0626q.P();
                    if (h3 || P7 == c0602e) {
                        P7 = new Z2.X(5, interfaceC1942y, this);
                        c0626q.m0(P7);
                    }
                    T.r.c(interfaceC1942y, this, (l4.c) P7, c0626q);
                } else {
                    c0626q.b0(416369985);
                }
                c0626q.p(false);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 11, this, obj);
        }
    }

    public final long b() {
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        long j3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j3 = Math.max(j3, ((u0) c0996s.get(i6)).f13266o.g());
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            j3 = Math.max(j3, ((y0) c0996s2.get(i7)).b());
        }
        return j3;
    }

    public final void c() {
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = (u0) c0996s.get(i6);
            u0Var.f13260i = null;
            u0Var.f13259h = null;
            u0Var.f13263l = false;
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((y0) c0996s2.get(i7)).c();
        }
    }

    public final boolean d() {
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((u0) c0996s.get(i6)).f13259h != null) {
                return true;
            }
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (((y0) c0996s2.get(i7)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        y0 y0Var = this.f13278b;
        return y0Var != null ? y0Var.e() : this.f13282f.g();
    }

    public final s0 f() {
        return (s0) this.f13281e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f13287k.getValue()).booleanValue();
    }

    public final void h(long j3, boolean z5) {
        C0603e0 c0603e0 = this.f13283g;
        long g3 = c0603e0.g();
        N3.s sVar = this.a;
        if (g3 == Long.MIN_VALUE) {
            c0603e0.h(j3);
            ((C0607g0) sVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0607g0) sVar.a).getValue()).booleanValue()) {
            ((C0607g0) sVar.a).setValue(Boolean.TRUE);
        }
        this.f13284h.setValue(Boolean.FALSE);
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        boolean z6 = true;
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = (u0) c0996s.get(i6);
            C0607g0 c0607g0 = u0Var.f13261j;
            C0607g0 c0607g02 = u0Var.f13261j;
            if (!((Boolean) c0607g0.getValue()).booleanValue()) {
                long b5 = z5 ? u0Var.a().b() : j3;
                u0Var.e(u0Var.a().f(b5));
                u0Var.f13265n = u0Var.a().d(b5);
                if (u0Var.a().e(b5)) {
                    c0607g02.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0607g02.getValue()).booleanValue()) {
                z6 = false;
            }
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            y0 y0Var = (y0) c0996s2.get(i7);
            C0607g0 c0607g03 = y0Var.f13280d;
            N3.s sVar2 = y0Var.a;
            if (!AbstractC1276k.b(c0607g03.getValue(), sVar2.k())) {
                y0Var.h(j3, z5);
            }
            if (!AbstractC1276k.b(y0Var.f13280d.getValue(), sVar2.k())) {
                z6 = false;
            }
        }
        if (z6) {
            i();
        }
    }

    public final void i() {
        this.f13283g.h(Long.MIN_VALUE);
        N3.s sVar = this.a;
        if (sVar instanceof C1304M) {
            ((C1304M) sVar).o(this.f13280d.getValue());
        }
        n(0L);
        ((C0607g0) sVar.a).setValue(Boolean.FALSE);
        C0996s c0996s = this.f13286j;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((y0) c0996s.get(i6)).i();
        }
    }

    public final void j(float f6) {
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = (u0) c0996s.get(i6);
            u0Var.getClass();
            if (f6 == -4.0f || f6 == -5.0f) {
                o0 o0Var = u0Var.f13260i;
                if (o0Var != null) {
                    u0Var.a().h(o0Var.f13204c);
                    u0Var.f13259h = null;
                    u0Var.f13260i = null;
                }
                Object obj = f6 == -4.0f ? u0Var.a().f13205d : u0Var.a().f13204c;
                u0Var.a().h(obj);
                u0Var.a().i(obj);
                u0Var.e(obj);
                u0Var.f13266o.h(u0Var.a().b());
            } else {
                u0Var.f13262k.h(f6);
            }
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((y0) c0996s2.get(i7)).j(f6);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f13283g.h(Long.MIN_VALUE);
        N3.s sVar = this.a;
        ((C0607g0) sVar.a).setValue(Boolean.FALSE);
        boolean g3 = g();
        C0607g0 c0607g0 = this.f13280d;
        if (!g3 || !AbstractC1276k.b(sVar.k(), obj) || !AbstractC1276k.b(c0607g0.getValue(), obj2)) {
            if (!AbstractC1276k.b(sVar.k(), obj) && (sVar instanceof C1304M)) {
                ((C1304M) sVar).o(obj);
            }
            c0607g0.setValue(obj2);
            this.f13287k.setValue(Boolean.TRUE);
            this.f13281e.setValue(new t0(obj, obj2));
        }
        C0996s c0996s = this.f13286j;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            y0 y0Var = (y0) c0996s.get(i6);
            AbstractC1276k.d(y0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (y0Var.g()) {
                y0Var.k(y0Var.a.k(), y0Var.f13280d.getValue());
            }
        }
        C0996s c0996s2 = this.f13285i;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((u0) c0996s2.get(i7)).d(0L);
        }
    }

    public final void l(long j3) {
        C0603e0 c0603e0 = this.f13283g;
        if (c0603e0.g() == Long.MIN_VALUE) {
            c0603e0.h(j3);
        }
        n(j3);
        this.f13284h.setValue(Boolean.FALSE);
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u0) c0996s.get(i6)).d(j3);
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            y0 y0Var = (y0) c0996s2.get(i7);
            if (!AbstractC1276k.b(y0Var.f13280d.getValue(), y0Var.a.k())) {
                y0Var.l(j3);
            }
        }
    }

    public final void m(V v5) {
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = (u0) c0996s.get(i6);
            C0607g0 c0607g0 = u0Var.f13264m;
            if (!AbstractC1276k.b(u0Var.a().f13204c, u0Var.a().f13205d)) {
                u0Var.f13260i = u0Var.a();
                u0Var.f13259h = v5;
            }
            u0Var.f13258g.setValue(new o0(u0Var.f13268q, u0Var.f13255c, c0607g0.getValue(), c0607g0.getValue(), u0Var.f13265n.c()));
            u0Var.f13266o.h(u0Var.a().b());
            u0Var.f13263l = true;
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((y0) c0996s2.get(i7)).m(v5);
        }
    }

    public final void n(long j3) {
        if (this.f13278b == null) {
            this.f13282f.h(j3);
        }
    }

    public final void o() {
        o0 o0Var;
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = (u0) c0996s.get(i6);
            V v5 = u0Var.f13259h;
            if (v5 != null && (o0Var = u0Var.f13260i) != null) {
                long L5 = AbstractC1410a.L(v5.f13051g * v5.f13048d);
                Object f6 = o0Var.f(L5);
                if (u0Var.f13263l) {
                    u0Var.a().i(f6);
                }
                u0Var.a().h(f6);
                u0Var.f13266o.h(u0Var.a().b());
                if (u0Var.f13262k.g() == -2.0f || u0Var.f13263l) {
                    u0Var.e(f6);
                } else {
                    u0Var.d(u0Var.f13269r.e());
                }
                if (L5 >= v5.f13051g) {
                    u0Var.f13259h = null;
                    u0Var.f13260i = null;
                } else {
                    v5.f13047c = false;
                }
            }
        }
        C0996s c0996s2 = this.f13286j;
        int size2 = c0996s2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((y0) c0996s2.get(i7)).o();
        }
    }

    public final void p(Object obj) {
        C0607g0 c0607g0 = this.f13280d;
        if (AbstractC1276k.b(c0607g0.getValue(), obj)) {
            return;
        }
        this.f13281e.setValue(new t0(c0607g0.getValue(), obj));
        N3.s sVar = this.a;
        if (!AbstractC1276k.b(sVar.k(), c0607g0.getValue())) {
            sVar.o(c0607g0.getValue());
        }
        c0607g0.setValue(obj);
        if (this.f13283g.g() == Long.MIN_VALUE) {
            this.f13284h.setValue(Boolean.TRUE);
        }
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((u0) c0996s.get(i6)).f13262k.h(-2.0f);
        }
    }

    public final String toString() {
        C0996s c0996s = this.f13285i;
        int size = c0996s.size();
        String str = "Transition animation values: ";
        for (int i6 = 0; i6 < size; i6++) {
            str = str + ((u0) c0996s.get(i6)) + ", ";
        }
        return str;
    }
}
