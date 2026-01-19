package v;

import h0.C1026c;
import h0.C1031h;
import h0.C1032i;
import h0.C1033j;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class t0 {
    public static final C1818y a;

    /* renamed from: b */
    public static final C1818y f15348b;

    /* renamed from: c */
    public static final C1818y f15349c;

    /* renamed from: d */
    public static final H0 f15350d;

    /* renamed from: e */
    public static final H0 f15351e;

    /* renamed from: f */
    public static final H0 f15352f;

    /* renamed from: g */
    public static final H0 f15353g;

    /* renamed from: h */
    public static final H0 f15354h;

    /* renamed from: i */
    public static final H0 f15355i;

    static {
        EnumC1817x enumC1817x = EnumC1817x.f15366e;
        a = new C1818y(enumC1817x);
        EnumC1817x enumC1817x2 = EnumC1817x.f15365c;
        f15348b = new C1818y(enumC1817x2);
        EnumC1817x enumC1817x3 = EnumC1817x.f15367f;
        f15349c = new C1818y(enumC1817x3);
        C1031h c1031h = C1026c.f11799q;
        f15350d = new H0(enumC1817x, new u4.v(c1031h, 2), c1031h);
        C1031h c1031h2 = C1026c.f11798p;
        f15351e = new H0(enumC1817x, new u4.v(c1031h2, 2), c1031h2);
        C1032i c1032i = C1026c.f11796n;
        f15352f = new H0(enumC1817x2, new u4.v(c1032i, 3), c1032i);
        C1032i c1032i2 = C1026c.f11795m;
        f15353g = new H0(enumC1817x2, new u4.v(c1032i2, 3), c1032i2);
        C1033j c1033j = C1026c.f11790h;
        f15354h = new H0(enumC1817x3, new u4.v(c1033j, 4), c1033j);
        C1033j c1033j2 = C1026c.f11786c;
        f15355i = new H0(enumC1817x3, new u4.v(c1033j2, 4), c1033j2);
    }

    public static final InterfaceC1041r a(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return interfaceC1041r.c(new A0(f6, f7));
    }

    public static InterfaceC1041r b(InterfaceC1041r interfaceC1041r) {
        return interfaceC1041r.c(f15349c);
    }

    public static InterfaceC1041r c(InterfaceC1041r interfaceC1041r) {
        return interfaceC1041r.c(a);
    }

    public static final InterfaceC1041r d(InterfaceC1041r interfaceC1041r, float f6) {
        return interfaceC1041r.c(new s0(S.l.f7374V, f6, S.l.f7374V, f6, 5));
    }

    public static final InterfaceC1041r e(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return interfaceC1041r.c(new s0(S.l.f7374V, f6, S.l.f7374V, f7, 5));
    }

    public static /* synthetic */ InterfaceC1041r f(float f6, float f7, int i6, InterfaceC1041r interfaceC1041r) {
        if ((i6 & 1) != 0) {
            f6 = Float.NaN;
        }
        if ((i6 & 2) != 0) {
            f7 = Float.NaN;
        }
        return e(interfaceC1041r, f6, f7);
    }

    public static final InterfaceC1041r g(InterfaceC1041r interfaceC1041r, float f6) {
        return interfaceC1041r.c(new s0(f6, f6, f6, f6, false));
    }

    public static final InterfaceC1041r h(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return interfaceC1041r.c(new s0(f6, f7, f6, f7, false));
    }

    public static InterfaceC1041r i(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, float f9, int i6) {
        return interfaceC1041r.c(new s0(f6, (i6 & 2) != 0 ? Float.NaN : f7, (i6 & 4) != 0 ? Float.NaN : f8, (i6 & 8) != 0 ? Float.NaN : f9, false));
    }

    public static final InterfaceC1041r j(InterfaceC1041r interfaceC1041r, float f6) {
        return interfaceC1041r.c(new s0(f6, f6, f6, f6, true));
    }

    public static final InterfaceC1041r k(InterfaceC1041r interfaceC1041r, float f6, float f7) {
        return interfaceC1041r.c(new s0(f6, f7, f6, f7, true));
    }

    public static final InterfaceC1041r l(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, float f9) {
        return interfaceC1041r.c(new s0(f6, f7, f8, f9, true));
    }

    public static /* synthetic */ InterfaceC1041r m(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, int i6) {
        if ((i6 & 2) != 0) {
            f7 = Float.NaN;
        }
        return l(interfaceC1041r, f6, f7, f8, Float.NaN);
    }

    public static final InterfaceC1041r n(InterfaceC1041r interfaceC1041r, float f6) {
        return interfaceC1041r.c(new s0(f6, S.l.f7374V, f6, S.l.f7374V, 10));
    }

    public static InterfaceC1041r o(float f6, float f7, int i6, InterfaceC1041r interfaceC1041r) {
        return interfaceC1041r.c(new s0((i6 & 1) != 0 ? Float.NaN : f6, S.l.f7374V, (i6 & 2) != 0 ? Float.NaN : f7, S.l.f7374V, 10));
    }

    public static InterfaceC1041r p(InterfaceC1041r interfaceC1041r) {
        H0 h02;
        C1032i c1032i = C1026c.f11796n;
        if (AbstractC1276k.b(c1032i, c1032i)) {
            h02 = f15352f;
        } else if (AbstractC1276k.b(c1032i, C1026c.f11795m)) {
            h02 = f15353g;
        } else {
            h02 = new H0(EnumC1817x.f15365c, new u4.v(c1032i, 3), c1032i);
        }
        return interfaceC1041r.c(h02);
    }

    public static InterfaceC1041r q(InterfaceC1041r interfaceC1041r) {
        H0 h02;
        C1033j c1033j = C1026c.f11790h;
        if (c1033j.equals(c1033j)) {
            h02 = f15354h;
        } else if (c1033j.equals(C1026c.f11786c)) {
            h02 = f15355i;
        } else {
            h02 = new H0(EnumC1817x.f15367f, new u4.v(c1033j, 4), c1033j);
        }
        return interfaceC1041r.c(h02);
    }

    public static InterfaceC1041r r(InterfaceC1041r interfaceC1041r) {
        H0 h02;
        C1031h c1031h = C1026c.f11799q;
        if (AbstractC1276k.b(c1031h, c1031h)) {
            h02 = f15350d;
        } else if (AbstractC1276k.b(c1031h, C1026c.f11798p)) {
            h02 = f15351e;
        } else {
            h02 = new H0(EnumC1817x.f15366e, new u4.v(c1031h, 2), c1031h);
        }
        return interfaceC1041r.c(h02);
    }
}
