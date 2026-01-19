package P2;

import D.c1;
import H0.C0144d;
import H0.C0146e;
import H0.C0150g;
import H0.InterfaceC0152h;
import R2.AbstractC0530j;
import T.AbstractC0623o0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import Z2.AbstractC0783w;
import Z2.f1;
import com.tencent.mmkv.R;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import p.AbstractC1450o0;
import p.AbstractC1464z;
import p.InterfaceC1455r0;
import t.C1682j;
import v.AbstractC1806l;
import v.C1818y;
import x.C1851b;

/* loaded from: classes.dex */
public final /* synthetic */ class E0 implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4681c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f4682e;

    public /* synthetic */ E0(int i6, InterfaceC1193a interfaceC1193a) {
        this.f4681c = i6;
        this.f4682e = interfaceC1193a;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C1682j c1682j;
        switch (this.f4681c) {
            case 0:
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                C.d dVar = C.e.a;
                InterfaceC1041r c6 = l0.h.c(l0.h.k(v.t0.j(C1038o.a, d3.b.a), 2, dVar, 24), dVar);
                AbstractC0623o0 abstractC0623o0 = Q.O.a;
                InterfaceC1041r f6 = AbstractC1464z.f(c6, ((Q.N) c0626q.j(abstractC0623o0)).f5431u, dVar);
                C1033j c1033j = C1026c.f11790h;
                F0.V d6 = AbstractC1806l.d(c1033j, false);
                int hashCode = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l3 = c0626q.l();
                InterfaceC1041r c7 = AbstractC1024a.c(c0626q, f6);
                InterfaceC0152h.a.getClass();
                InterfaceC1193a interfaceC1193a = C0150g.f1924b;
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(interfaceC1193a);
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
                T.r.G(c0626q, c7, c0146e4);
                C1818y c1818y = v.t0.f15349c;
                Object P5 = c0626q.P();
                Object obj4 = C0616l.a;
                if (P5 == obj4) {
                    P5 = new C1682j();
                    c0626q.m0(P5);
                }
                C1682j c1682j2 = (C1682j) P5;
                InterfaceC1193a interfaceC1193a2 = this.f4682e;
                boolean f7 = c0626q.f(interfaceC1193a2);
                Object P6 = c0626q.P();
                if (f7 || P6 == obj4) {
                    P6 = new C0348d(3, interfaceC1193a2);
                    c0626q.m0(P6);
                }
                InterfaceC1041r j3 = AbstractC1464z.j(c1818y, c1682j2, null, false, null, (InterfaceC1193a) P6, 28);
                F0.V d7 = AbstractC1806l.d(c1033j, false);
                int hashCode2 = Long.hashCode(c0626q.f8164T);
                InterfaceC0617l0 l5 = c0626q.l();
                InterfaceC1041r c8 = AbstractC1024a.c(c0626q, j3);
                c0626q.f0();
                if (c0626q.f8163S) {
                    c0626q.k(interfaceC1193a);
                } else {
                    c0626q.p0();
                }
                T.r.G(c0626q, d7, c0146e);
                T.r.G(c0626q, l5, c0146e2);
                T.r.x(c0626q, Integer.valueOf(hashCode2), c0146e3);
                T.r.C(c0626q, c0144d);
                T.r.G(c0626q, c8, c0146e4);
                Q.A0.a(Y3.C.L(R.drawable.arrow_downward, 0, c0626q), h5.e.j0(R.string.chat_scroll_to_bottom, c0626q), null, ((Q.N) c0626q.j(abstractC0623o0)).f5427q, c0626q, 8, 4);
                c0626q.p(true);
                c0626q.p(true);
                return X3.y.a;
            case 1:
                F0.X x5 = (F0.X) obj;
                F0.U u5 = (F0.U) obj2;
                C0959a c0959a = (C0959a) obj3;
                float f8 = ((e1.f) this.f4682e.b()).f11571c;
                F0.k0 w5 = u5.w(C0959a.a(c0959a.a, 0, 0, AbstractC0960b.f(c0959a.a, !e1.f.c(f8, Float.NaN) ? x5.l0(f8) : 0), 0, 11));
                return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new c1(w5, 5));
            case 2:
                C0626q c0626q2 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q2.S(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC0530j.j(this.f4682e, c0626q2, 0);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 3:
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AbstractC0783w.O(Y4.l.H(new f1(R.drawable.info, h5.e.j0(R.string.settings_about, c0626q3), h5.e.j0(R.string.settings_about_subtitle, c0626q3), this.f4682e, 8)), null, c0626q3, 0);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q4 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q4.b0(-756081143);
                InterfaceC1455r0 interfaceC1455r0 = (InterfaceC1455r0) c0626q4.j(AbstractC1450o0.a);
                if (interfaceC1455r0 != null) {
                    c0626q4.b0(-1604682242);
                    c0626q4.p(false);
                    c1682j = null;
                } else {
                    c0626q4.b0(-1604549624);
                    Object P7 = c0626q4.P();
                    if (P7 == C0616l.a) {
                        P7 = new C1682j();
                        c0626q4.m0(P7);
                    }
                    c1682j = (C1682j) P7;
                    c0626q4.p(false);
                }
                InterfaceC1041r i6 = AbstractC1464z.i(C1038o.a, c1682j, interfaceC1455r0, true, null, this.f4682e);
                c0626q4.p(false);
                return i6;
        }
    }
}
