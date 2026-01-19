package I0;

import m4.AbstractC1276k;
import n0.C1354c;

/* renamed from: I0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177d extends AbstractC0173b {

    /* renamed from: f, reason: collision with root package name */
    public static C0177d f2290f;

    /* renamed from: g, reason: collision with root package name */
    public static final d1.j f2291g = d1.j.f11391e;

    /* renamed from: h, reason: collision with root package name */
    public static final d1.j f2292h = d1.j.f11390c;

    /* renamed from: d, reason: collision with root package name */
    public S0.L f2293d;

    /* renamed from: e, reason: collision with root package name */
    public P0.p f2294e;

    @Override // I0.AbstractC0173b
    public final int[] a(int i6) {
        int i7;
        if (c().length() <= 0 || i6 >= c().length()) {
            return null;
        }
        try {
            P0.p pVar = this.f2294e;
            if (pVar == null) {
                AbstractC1276k.k("node");
                throw null;
            }
            C1354c g3 = pVar.g();
            int round = Math.round(g3.f13297d - g3.f13295b);
            if (i6 <= 0) {
                i6 = 0;
            }
            S0.L l3 = this.f2293d;
            if (l3 == null) {
                AbstractC1276k.k("layoutResult");
                throw null;
            }
            int d6 = l3.f7599b.d(i6);
            S0.L l5 = this.f2293d;
            if (l5 == null) {
                AbstractC1276k.k("layoutResult");
                throw null;
            }
            float f6 = l5.f7599b.f(d6) + round;
            S0.L l6 = this.f2293d;
            if (l6 == null) {
                AbstractC1276k.k("layoutResult");
                throw null;
            }
            if (l6 == null) {
                AbstractC1276k.k("layoutResult");
                throw null;
            }
            if (f6 < l6.f7599b.f(r0.f7652f - 1)) {
                S0.L l7 = this.f2293d;
                if (l7 == null) {
                    AbstractC1276k.k("layoutResult");
                    throw null;
                }
                i7 = l7.f7599b.e(f6);
            } else {
                S0.L l8 = this.f2293d;
                if (l8 == null) {
                    AbstractC1276k.k("layoutResult");
                    throw null;
                }
                i7 = l8.f7599b.f7652f;
            }
            return b(i6, f(i7 - 1, f2292h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // I0.AbstractC0173b
    public final int[] e(int i6) {
        int i7;
        if (c().length() <= 0 || i6 <= 0) {
            return null;
        }
        try {
            P0.p pVar = this.f2294e;
            if (pVar == null) {
                AbstractC1276k.k("node");
                throw null;
            }
            C1354c g3 = pVar.g();
            int round = Math.round(g3.f13297d - g3.f13295b);
            int length = c().length();
            if (length <= i6) {
                i6 = length;
            }
            S0.L l3 = this.f2293d;
            if (l3 == null) {
                AbstractC1276k.k("layoutResult");
                throw null;
            }
            int d6 = l3.f7599b.d(i6);
            S0.L l5 = this.f2293d;
            if (l5 == null) {
                AbstractC1276k.k("layoutResult");
                throw null;
            }
            float f6 = l5.f7599b.f(d6) - round;
            if (f6 > S.l.f7374V) {
                S0.L l6 = this.f2293d;
                if (l6 == null) {
                    AbstractC1276k.k("layoutResult");
                    throw null;
                }
                i7 = l6.f7599b.e(f6);
            } else {
                i7 = 0;
            }
            if (i6 == c().length() && i7 < d6) {
                i7++;
            }
            return b(f(i7, f2291g), i6);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int f(int i6, d1.j jVar) {
        S0.L l3 = this.f2293d;
        if (l3 == null) {
            AbstractC1276k.k("layoutResult");
            throw null;
        }
        int i7 = l3.i(i6);
        S0.L l5 = this.f2293d;
        if (l5 == null) {
            AbstractC1276k.k("layoutResult");
            throw null;
        }
        if (jVar != l5.j(i7)) {
            S0.L l6 = this.f2293d;
            if (l6 != null) {
                return l6.i(i6);
            }
            AbstractC1276k.k("layoutResult");
            throw null;
        }
        if (this.f2293d != null) {
            return r6.f7599b.c(i6, false) - 1;
        }
        AbstractC1276k.k("layoutResult");
        throw null;
    }
}
