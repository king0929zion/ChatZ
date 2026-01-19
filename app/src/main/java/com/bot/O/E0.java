package O;

import D.AbstractC0090r0;
import D.d1;
import S0.C0545g;
import S0.C0554p;
import X0.C0683a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class E0 {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3933b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.L f3934c;

    /* renamed from: d, reason: collision with root package name */
    public final X0.p f3935d;

    /* renamed from: e, reason: collision with root package name */
    public final S0 f3936e;

    /* renamed from: f, reason: collision with root package name */
    public long f3937f;

    /* renamed from: g, reason: collision with root package name */
    public final C0545g f3938g;

    /* renamed from: h, reason: collision with root package name */
    public final X0.v f3939h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f3940i;

    public E0(X0.v vVar, X0.p pVar, d1 d1Var, S0 s02) {
        C0545g c0545g = vVar.a;
        long j3 = vVar.f9125b;
        S0.L l3 = d1Var != null ? d1Var.a : null;
        this.a = c0545g;
        this.f3933b = j3;
        this.f3934c = l3;
        this.f3935d = pVar;
        this.f3936e = s02;
        this.f3937f = j3;
        this.f3938g = c0545g;
        this.f3939h = vVar;
        this.f3940i = d1Var;
    }

    public final List a(l4.c cVar) {
        if (!S0.O.c(this.f3937f)) {
            return Y4.l.I(new C0683a(FlexmarkHtmlConverter.DEFAULT_NODE, 0), new X0.u(S0.O.f(this.f3937f), S0.O.f(this.f3937f)));
        }
        X0.g gVar = (X0.g) cVar.f(this);
        if (gVar != null) {
            return Y4.l.H(gVar);
        }
        return null;
    }

    public final Integer b() {
        S0.L l3 = this.f3934c;
        if (l3 == null) {
            return null;
        }
        C0554p c0554p = l3.f7599b;
        int e6 = S0.O.e(this.f3937f);
        X0.p pVar = this.f3935d;
        return Integer.valueOf(pVar.a(c0554p.c(c0554p.d(pVar.b(e6)), true)));
    }

    public final Integer c() {
        S0.L l3 = this.f3934c;
        if (l3 == null) {
            return null;
        }
        int f6 = S0.O.f(this.f3937f);
        X0.p pVar = this.f3935d;
        return Integer.valueOf(pVar.a(l3.i(l3.f7599b.d(pVar.b(f6)))));
    }

    public final Integer d() {
        int length;
        S0.L l3 = this.f3934c;
        if (l3 == null) {
            return null;
        }
        int r5 = r();
        while (true) {
            C0545g c0545g = this.a;
            if (r5 < c0545g.f7630e.length()) {
                int length2 = this.f3938g.f7630e.length() - 1;
                if (r5 <= length2) {
                    length2 = r5;
                }
                long l5 = l3.l(length2);
                int i6 = S0.O.f7611c;
                int i7 = (int) (l5 & 4294967295L);
                if (i7 > r5) {
                    length = this.f3935d.a(i7);
                    break;
                }
                r5++;
            } else {
                length = c0545g.f7630e.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i6;
        S0.L l3 = this.f3934c;
        if (l3 == null) {
            return null;
        }
        int r5 = r();
        while (true) {
            if (r5 <= 0) {
                i6 = 0;
                break;
            }
            int length = this.f3938g.f7630e.length() - 1;
            if (r5 <= length) {
                length = r5;
            }
            long l5 = l3.l(length);
            int i7 = S0.O.f7611c;
            int i8 = (int) (l5 >> 32);
            if (i8 < r5) {
                i6 = this.f3935d.a(i8);
                break;
            }
            r5--;
        }
        return Integer.valueOf(i6);
    }

    public final boolean f() {
        S0.L l3 = this.f3934c;
        return (l3 != null ? l3.j(r()) : null) != d1.j.f11391e;
    }

    public final int g(S0.L l3, int i6) {
        int r5 = r();
        S0 s02 = this.f3936e;
        if (s02.a == null) {
            s02.a = Float.valueOf(l3.c(r5).a);
        }
        C0554p c0554p = l3.f7599b;
        int d6 = c0554p.d(r5) + i6;
        if (d6 < 0) {
            return 0;
        }
        if (d6 >= c0554p.f7652f) {
            return this.f3938g.f7630e.length();
        }
        float b5 = c0554p.b(d6) - 1;
        Float f6 = s02.a;
        AbstractC1276k.c(f6);
        float floatValue = f6.floatValue();
        if ((f() && floatValue >= l3.h(d6)) || (!f() && floatValue <= l3.g(d6))) {
            return c0554p.c(d6, true);
        }
        return this.f3935d.a(c0554p.g((Float.floatToRawIntBits(b5) & 4294967295L) | (Float.floatToRawIntBits(f6.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(D.d1 r9, int r10) {
        /*
            r8 = this;
            F0.w r0 = r9.f1002b
            S0.L r1 = r9.a
            if (r0 == 0) goto L13
            F0.w r9 = r9.f1003c
            if (r9 == 0) goto L10
            r2 = 1
            n0.c r9 = r9.Q(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            n0.c r9 = n0.C1354c.f13294e
        L15:
            X0.v r0 = r8.f3939h
            long r2 = r0.f9125b
            int r0 = S0.O.f7611c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            X0.p r2 = r8.f3935d
            int r0 = r2.b(r0)
            n0.c r0 = r1.c(r0)
            float r3 = r0.a
            float r0 = r0.f13295b
            long r6 = r9.d()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            S0.p r0 = r1.f7599b
            int r9 = r0.g(r9)
            int r9 = r2.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O.E0.h(D.d1, int):int");
    }

    public final void i() {
        S0 s02 = this.f3936e;
        s02.a = null;
        C0545g c0545g = this.f3938g;
        if (c0545g.f7630e.length() > 0) {
            if (f()) {
                k();
                return;
            }
            s02.a = null;
            if (c0545g.f7630e.length() > 0) {
                String str = c0545g.f7630e;
                long j3 = this.f3937f;
                int i6 = S0.O.f7611c;
                int s5 = AbstractC0090r0.s((int) (j3 & 4294967295L), str);
                if (s5 != -1) {
                    q(s5, s5);
                }
            }
        }
    }

    public final void j() {
        this.f3936e.a = null;
        C0545g c0545g = this.f3938g;
        String str = c0545g.f7630e;
        String str2 = c0545g.f7630e;
        if (str.length() > 0) {
            int t5 = AbstractC0090r0.t(S0.O.e(this.f3937f), str2);
            if (t5 == S0.O.e(this.f3937f) && t5 != str2.length()) {
                t5 = AbstractC0090r0.t(t5 + 1, str2);
            }
            q(t5, t5);
        }
    }

    public final void k() {
        this.f3936e.a = null;
        C0545g c0545g = this.f3938g;
        if (c0545g.f7630e.length() > 0) {
            String str = c0545g.f7630e;
            long j3 = this.f3937f;
            int i6 = S0.O.f7611c;
            int v5 = AbstractC0090r0.v((int) (j3 & 4294967295L), str);
            if (v5 != -1) {
                q(v5, v5);
            }
        }
    }

    public final void l() {
        this.f3936e.a = null;
        C0545g c0545g = this.f3938g;
        String str = c0545g.f7630e;
        String str2 = c0545g.f7630e;
        if (str.length() > 0) {
            int u5 = AbstractC0090r0.u(S0.O.f(this.f3937f), str2);
            if (u5 == S0.O.f(this.f3937f) && u5 != 0) {
                u5 = AbstractC0090r0.u(u5 - 1, str2);
            }
            q(u5, u5);
        }
    }

    public final void m() {
        S0 s02 = this.f3936e;
        s02.a = null;
        C0545g c0545g = this.f3938g;
        if (c0545g.f7630e.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            s02.a = null;
            if (c0545g.f7630e.length() > 0) {
                String str = c0545g.f7630e;
                long j3 = this.f3937f;
                int i6 = S0.O.f7611c;
                int s5 = AbstractC0090r0.s((int) (j3 & 4294967295L), str);
                if (s5 != -1) {
                    q(s5, s5);
                }
            }
        }
    }

    public final void n() {
        Integer b5;
        this.f3936e.a = null;
        if (this.f3938g.f7630e.length() <= 0 || (b5 = b()) == null) {
            return;
        }
        int intValue = b5.intValue();
        q(intValue, intValue);
    }

    public final void o() {
        Integer c6;
        this.f3936e.a = null;
        if (this.f3938g.f7630e.length() <= 0 || (c6 = c()) == null) {
            return;
        }
        int intValue = c6.intValue();
        q(intValue, intValue);
    }

    public final void p() {
        if (this.f3938g.f7630e.length() > 0) {
            int i6 = S0.O.f7611c;
            this.f3937f = S0.F.b((int) (this.f3933b >> 32), (int) (this.f3937f & 4294967295L));
        }
    }

    public final void q(int i6, int i7) {
        this.f3937f = S0.F.b(i6, i7);
    }

    public final int r() {
        long j3 = this.f3937f;
        int i6 = S0.O.f7611c;
        return this.f3935d.b((int) (j3 & 4294967295L));
    }
}
