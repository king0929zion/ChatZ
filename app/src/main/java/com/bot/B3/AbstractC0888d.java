package b3;

import D.C0072i;
import F0.C0120h;
import F0.V;
import H0.C0144d;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import O.B;
import Q.N;
import Q.O;
import R.C0515u;
import R2.C0531k;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.e1;
import X3.y;
import Z2.C0789z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.util.html.Attribute;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import j1.AbstractC1135a;
import j2.C1146b;
import j2.w;
import java.util.List;
import java.util.Locale;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.AbstractC1350y;
import n.C1297F;
import n.EnumC1310T;
import o0.C1381C;
import o0.C1395f;
import o0.s;
import p.AbstractC1464z;
import u4.AbstractC1776n;
import u4.u;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.AbstractC1812s;
import v.C1813t;
import v.C1818y;
import v.Z;
import v.o0;
import v.p0;
import v.t0;
import w.AbstractC1829a;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0888d {
    public static final C0873f a = new C0873f(new B(4), false, 1792930883);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f11023b = new C0873f(new B(5), false, 1369922169);

    /* renamed from: c, reason: collision with root package name */
    public static final C0873f f11024c = new C0873f(new C0789z(12), false, 918488693);

    public static final void a(final float f6, final InterfaceC1041r interfaceC1041r, final float f7, C0626q c0626q, final int i6) {
        int i7;
        c0626q.d0(393415810);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.c(f6) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i8 = i7 | 432;
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            f7 = 25;
            long j3 = ((N) c0626q.j(O.a)).f5424n;
            AbstractC1806l.a(l0.h.b(AbstractC1464z.e(t0.d(t0.a, f6), androidx.lifecycle.N.x(Y4.l.I(new s(s.c(0.9f, j3)), new s(s.c(0.8f, j3)), new s(s.c(0.7f, j3)), new s(s.c(0.6f, j3)), new s(s.f13480g)))), f7), c0626q, 0);
            interfaceC1041r = C1038o.a;
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: b3.a
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(i6 | 1);
                    AbstractC0888d.a(f6, interfaceC1041r, f7, (C0626q) obj, J4);
                    return y.a;
                }
            };
        }
    }

    public static final void b(final float f6, int i6, C0626q c0626q, InterfaceC1041r interfaceC1041r, String str, String str2) {
        InterfaceC1041r interfaceC1041r2;
        String str3;
        C1038o c1038o;
        C0626q c0626q2 = c0626q;
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        c0626q2.d0(1681301664);
        int i7 = i6 | (c0626q2.f(str) ? 4 : 2) | (c0626q2.f(str2) ? 32 : 16) | 3072;
        if (c0626q2.S(i7 & 1, (i7 & 1171) != 1170)) {
            String obj = AbstractC1776n.l0(str).toString();
            boolean f7 = c0626q2.f(obj);
            Object P5 = c0626q2.P();
            C0602e c0602e = C0616l.a;
            if (f7 || P5 == c0602e) {
                String j02 = AbstractC1776n.j0(2, obj);
                if (j02.length() > 0) {
                    str3 = j02.toUpperCase(Locale.ROOT);
                    AbstractC1276k.e(str3, "toUpperCase(...)");
                } else {
                    str3 = "B";
                }
                P5 = str3;
                c0626q2.m0(P5);
            }
            final String str4 = (String) P5;
            boolean f8 = c0626q2.f(obj);
            Object P6 = c0626q2.P();
            if (f8 || P6 == c0602e) {
                if (AbstractC1776n.Q(obj)) {
                    obj = "bot";
                }
                c0626q2.m0(obj);
                P6 = obj;
            }
            String str5 = (String) P6;
            boolean f9 = c0626q2.f(str5);
            Object P7 = c0626q2.P();
            if (f9 || P7 == c0602e) {
                List I5 = Y4.l.I(new s(o0.y.d(4283333031L)), new s(o0.y.d(4294086187L)), new s(o0.y.d(4292958041L)), new s(o0.y.d(4285970354L)), new s(o0.y.d(4284064079L)), new s(o0.y.d(4293773640L)), new s(o0.y.d(4289755809L)), new s(o0.y.d(4294942119L)));
                s sVar = new s(((s) I5.get(Math.abs(str5.hashCode()) % I5.size())).a);
                c0626q2.m0(sVar);
                P7 = sVar;
            }
            final long j3 = ((s) P7).a;
            boolean e6 = c0626q2.e(j3);
            Object P8 = c0626q2.P();
            if (e6 || P8 == c0602e) {
                s sVar2 = new s(o0.y.t(j3) < 0.5f ? s.f13477d : s.f13475b);
                c0626q2.m0(sVar2);
                P8 = sVar2;
            }
            final long j4 = ((s) P8).a;
            Object P9 = c0626q2.P();
            if (P9 == c0602e) {
                P9 = new e1.o(s4.j.B(0.4f * f6, 4294967296L));
                c0626q2.m0(P9);
            }
            final long j5 = ((e1.o) P9).a;
            C1038o c1038o2 = C1038o.a;
            if (str2 == null || AbstractC1776n.Q(str2)) {
                c1038o = c1038o2;
                c0626q2.b0(-249200373);
                c(str4, j3, j4, j5, f6, c1038o, c0626q, 221184, 0);
                c0626q2 = c0626q;
                c0626q2.p(false);
            } else {
                c0626q2.b0(-250040442);
                InterfaceC1041r c6 = l0.h.c(t0.j(c1038o2, f6), C.e.a);
                final int i8 = 0;
                c1038o = c1038o2;
                C0873f c7 = AbstractC0874g.c(87999870, new l4.g() { // from class: b3.b
                    @Override // l4.g
                    public final Object i(Object obj2, Object obj3, Object obj4, Object obj5) {
                        w wVar = (w) obj2;
                        switch (i8) {
                            case 0:
                                C0626q c0626q3 = (C0626q) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                AbstractC1276k.f(wVar, "$this$SubcomposeAsyncImage");
                                AbstractC1276k.f((j2.c) obj3, "it");
                                if (c0626q3.S(intValue & 1, (intValue & 129) != 128)) {
                                    AbstractC0888d.c(str4, j3, j4, j5, f6, null, c0626q3, 0, 32);
                                } else {
                                    c0626q3.V();
                                }
                                return y.a;
                            default:
                                C0626q c0626q4 = (C0626q) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                AbstractC1276k.f(wVar, "$this$SubcomposeAsyncImage");
                                AbstractC1276k.f((C1146b) obj3, "it");
                                if (c0626q4.S(intValue2 & 1, (intValue2 & 129) != 128)) {
                                    AbstractC0888d.c(str4, j3, j4, j5, f6, null, c0626q4, 0, 32);
                                } else {
                                    c0626q4.V();
                                }
                                return y.a;
                        }
                    }
                }, c0626q2);
                final int i9 = 1;
                j2.n.a(str2, null, c6, c7, AbstractC0874g.c(1359911688, new l4.g() { // from class: b3.b
                    @Override // l4.g
                    public final Object i(Object obj2, Object obj3, Object obj4, Object obj5) {
                        w wVar = (w) obj2;
                        switch (i9) {
                            case 0:
                                C0626q c0626q3 = (C0626q) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                AbstractC1276k.f(wVar, "$this$SubcomposeAsyncImage");
                                AbstractC1276k.f((j2.c) obj3, "it");
                                if (c0626q3.S(intValue & 1, (intValue & 129) != 128)) {
                                    AbstractC0888d.c(str4, j3, j4, j5, f6, null, c0626q3, 0, 32);
                                } else {
                                    c0626q3.V();
                                }
                                return y.a;
                            default:
                                C0626q c0626q4 = (C0626q) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                AbstractC1276k.f(wVar, "$this$SubcomposeAsyncImage");
                                AbstractC1276k.f((C1146b) obj3, "it");
                                if (c0626q4.S(intValue2 & 1, (intValue2 & 129) != 128)) {
                                    AbstractC0888d.c(str4, j3, j4, j5, f6, null, c0626q4, 0, 32);
                                } else {
                                    c0626q4.V();
                                }
                                return y.a;
                        }
                    }
                }, c0626q2), null, C0120h.a, c0626q, ((i7 >> 3) & 14) | 1597488, 48, 128936);
                c0626q2 = c0626q;
                c0626q2.p(false);
            }
            interfaceC1041r2 = c1038o;
        } else {
            c0626q2.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C0531k(str, str2, f6, interfaceC1041r2, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r30, final long r31, final long r33, final long r35, final float r37, h0.InterfaceC1041r r38, T.C0626q r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.AbstractC0888d.c(java.lang.String, long, long, long, float, h0.r, T.q, int, int):void");
    }

    public static final void d(InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        c0626q.d0(2014363717);
        int i7 = i6 | 6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            C1818y c1818y = t0.a;
            float f6 = 16;
            InterfaceC1041r z5 = AbstractC1787b.z(c1818y, f6, 12);
            V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, z5);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, d6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q, 48);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c1818y);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c7, c0146e4);
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            h(t0.d(new Z(1.0f, true), f6), C.e.a(8), c0626q, 0);
            c0626q.p(true);
            c0626q.p(true);
            interfaceC1041r = C1038o.a;
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0899o(interfaceC1041r, i6, 1);
        }
    }

    public static final void e(InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        c0626q.d0(1416236506);
        int i7 = i6 | 6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            C1038o c1038o = C1038o.a;
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, c1038o);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            float f6 = 16;
            float f7 = 8;
            float f8 = 14;
            float f9 = 7;
            h(t0.d(t0.n(AbstractC1787b.z(c1038o, f6, f7), 80), f8), C.e.a(f9), c0626q, 6);
            c0626q.b0(-916510433);
            for (int i8 = 0; i8 < 6; i8++) {
                d(null, c0626q, 0);
            }
            c0626q.p(false);
            AbstractC1787b.h(c0626q, t0.d(c1038o, f6));
            h(t0.d(t0.n(AbstractC1787b.z(c1038o, f6, f7), 100), f8), C.e.a(f9), c0626q, 6);
            c0626q.b0(-916497121);
            for (int i9 = 0; i9 < 4; i9++) {
                d(null, c0626q, 0);
            }
            c0626q.p(false);
            c0626q.p(true);
            interfaceC1041r = c1038o;
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0899o(interfaceC1041r, i6, 0);
        }
    }

    public static final void f(int i6, C0626q c0626q, InterfaceC1041r interfaceC1041r, boolean z5) {
        int i7;
        int i8;
        float f6;
        c0626q.d0(313995049);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.g(z5) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            C1818y c1818y = t0.a;
            InterfaceC1041r z6 = AbstractC1787b.z(interfaceC1041r.c(c1818y), 16, 8);
            p0 a6 = o0.a(z5 ? AbstractC1799h.f15304b : AbstractC1799h.a, C1026c.f11795m, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, z6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            C0146e c0146e = C0150g.f1928f;
            T.r.G(c0626q, a6, c0146e);
            C0146e c0146e2 = C0150g.f1927e;
            T.r.G(c0626q, l3, c0146e2);
            Integer valueOf = Integer.valueOf(hashCode);
            C0146e c0146e3 = C0150g.f1929g;
            T.r.x(c0626q, valueOf, c0146e3);
            C0144d c0144d = C0150g.f1930h;
            T.r.C(c0626q, c0144d);
            C0146e c0146e4 = C0150g.f1926d;
            T.r.G(c0626q, c6, c0146e4);
            C1038o c1038o = C1038o.a;
            InterfaceC1041r o5 = t0.o(S.l.f7374V, 280, 1, c1038o);
            C1813t a7 = AbstractC1812s.a(AbstractC1799h.f15305c, z5 ? C1026c.f11800r : C1026c.f11798p, c0626q, 0);
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, o5);
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a7, c0146e);
            T.r.G(c0626q, l5, c0146e2);
            AbstractC1135a.n(hashCode2, c0626q, c0146e3, c0626q, c0144d);
            T.r.G(c0626q, c7, c0146e4);
            float f7 = 60;
            InterfaceC1041r d6 = t0.d(c1818y, f7);
            if (z5) {
                f6 = 12;
                i8 = 4;
            } else {
                i8 = 4;
                f6 = 4;
            }
            float f8 = 12;
            h(d6, C.e.b(f6, z5 ? i8 : 12, f8, f8), c0626q, 6);
            AbstractC1787b.h(c0626q, t0.d(c1038o, i8));
            h(t0.d(t0.n(c1038o, f7), f8), C.e.a(6), c0626q, 6);
            c0626q.p(true);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0515u(i6, 1, interfaceC1041r, z5);
        }
    }

    public static final void g(InterfaceC1041r interfaceC1041r, C0626q c0626q, int i6) {
        C1038o c1038o;
        c0626q.d0(1361038196);
        int i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            InterfaceC1041r c6 = interfaceC1041r.c(t0.f15349c);
            C1813t a6 = AbstractC1812s.a(AbstractC1799h.f15305c, C1026c.f11798p, c0626q, 0);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, a6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c7, C0150g.f1926d);
            c0626q.b0(-905197812);
            int i8 = 0;
            while (true) {
                c1038o = C1038o.a;
                if (i8 >= 4) {
                    break;
                }
                f(48, c0626q, AbstractC1787b.A(S.l.f7374V, 4, 1, c1038o), i8 % 2 == 1);
                i8++;
            }
            c0626q.p(false);
            AbstractC1787b.h(c0626q, t0.d(c1038o, 16));
            f(54, c0626q, AbstractC1787b.A(S.l.f7374V, 4, 1, c1038o), false);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0899o(interfaceC1041r, i6, 2);
        }
    }

    public static final void h(InterfaceC1041r interfaceC1041r, C.d dVar, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(1076360152);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        int i8 = i7 | (c0626q.f(dVar) ? 32 : 16);
        if (c0626q.S(i8 & 1, (i8 & 19) != 18)) {
            c0626q.X();
            if ((i6 & 1) != 0 && !c0626q.B()) {
                c0626q.V();
            }
            c0626q.q();
            C1297F g3 = AbstractC1318d.g(AbstractC1318d.p("shimmer", c0626q, 0), S.l.f7374V, 1000.0f, AbstractC1318d.o(AbstractC1318d.s(1000, 2, AbstractC1350y.a), EnumC1310T.f13041c, 4), "shimmer", c0626q, 29112, 0);
            e1 e1Var = O.a;
            List I5 = Y4.l.I(new s(s.c(0.08f, ((N) c0626q.j(e1Var)).f5427q)), new s(s.c(0.04f, ((N) c0626q.j(e1Var)).f5427q)), new s(s.c(0.08f, ((N) c0626q.j(e1Var)).f5427q)));
            float floatValue = ((Number) g3.f12991f.getValue()).floatValue() - 300;
            C0607g0 c0607g0 = g3.f12991f;
            AbstractC1806l.a(AbstractC1464z.e(l0.h.c(interfaceC1041r, dVar), new C1381C(I5, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(((Number) c0607g0.getValue()).floatValue() - r4) & 4294967295L), (Float.floatToRawIntBits(((Number) c0607g0.getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(((Number) c0607g0.getValue()).floatValue()) & 4294967295L))), c0626q, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 10, interfaceC1041r, dVar);
        }
    }

    public static final C1395f i(String str) {
        int N5;
        Object b5;
        AbstractC1276k.f(str, "url");
        String obj = AbstractC1776n.l0(str).toString();
        if (u.D(obj, "data:", false) && (N5 = AbstractC1776n.N(obj, ',', 0, 6)) != -1) {
            String substring = obj.substring(N5 + 1);
            AbstractC1276k.e(substring, "substring(...)");
            if (!AbstractC1776n.Q(substring)) {
                try {
                    byte[] decode = Base64.decode(substring, 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    b5 = decodeByteArray != null ? new C1395f(decodeByteArray) : null;
                } catch (Throwable th) {
                    b5 = X3.a.b(th);
                }
                return (C1395f) (b5 instanceof X3.k ? null : b5);
            }
        }
        return null;
    }
}
