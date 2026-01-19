package D;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import Q.I2;
import Q.M1;
import Q.R1;
import Q.S2;
import Q.f3;
import Q.t3;
import Q.u3;
import R.AbstractC0497b;
import R2.AbstractC0530j;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import b3.AbstractC0888d;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.AbstractC0960b;
import e1.C0959a;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import m.InterfaceC1194A;
import m4.AbstractC1276k;
import t0.AbstractC1688b;
import v.AbstractC1787b;
import v.AbstractC1806l;
import x.C1851b;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0064e implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1004c;

    public /* synthetic */ C0064e(int i6) {
        this.f1004c = i6;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1004c) {
            case 0:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
                C0626q c0626q = (C0626q) obj2;
                ((Integer) obj3).getClass();
                c0626q.b0(-2126899193);
                long j3 = ((O.T0) c0626q.j(O.U0.a)).a;
                boolean e6 = c0626q.e(j3);
                Object P5 = c0626q.P();
                if (e6 || P5 == C0616l.a) {
                    P5 = new C0066f(j3, 0);
                    c0626q.m0(P5);
                }
                InterfaceC1041r c6 = interfaceC1041r.c(l0.h.f(C1038o.a, (l4.c) P5));
                c0626q.p(false);
                return c6;
            case 1:
                I2 i22 = (I2) obj;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f(i22, "snackbarData");
                if ((intValue & 6) == 0) {
                    intValue |= c0626q2.f(i22) ? 4 : 2;
                }
                if (c0626q2.S(intValue & 1, (intValue & 19) != 18)) {
                    T.e1 e1Var = Q.O.a;
                    S2.c(i22, null, null, ((Q.N) c0626q2.j(e1Var)).f5435y, ((Q.N) c0626q2.j(e1Var)).f5436z, 0L, 0L, 0L, c0626q2, intValue & 14, 462);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 2:
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AbstractC1787b.h(c0626q3, v.t0.d(C1038o.a, 1));
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 3:
                C0626q c0626q4 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q4.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.model_services_title, c0626q4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 4:
                C0626q c0626q5 = (C0626q) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q5.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    R1.f(AbstractC1787b.A(S.l.f7374V, 8, 1, C1038o.a), S.l.f7374V, o0.s.c(0.2f, ((Q.N) c0626q5.j(Q.O.a)).f5378A), c0626q5, 6, 2);
                } else {
                    c0626q5.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                F0.X x5 = (F0.X) obj;
                final int l02 = x5.l0(AbstractC0497b.a);
                int i6 = l02 * 2;
                final F0.k0 w5 = ((F0.U) obj2).w(AbstractC0960b.i(i6, 0, ((C0959a) obj3).a));
                final int i7 = 1;
                return x5.D(w5.f1485c - i6, w5.f1486e, Y3.w.f9813c, new l4.c() { // from class: R.a
                    @Override // l4.c
                    public final Object f(Object obj4) {
                        F0.j0 j0Var = (F0.j0) obj4;
                        switch (i7) {
                            case 0:
                                j0Var.h(w5, 0, -l02, S.l.f7374V);
                                break;
                            default:
                                j0Var.h(w5, -l02, 0, S.l.f7374V);
                                break;
                        }
                        return X3.y.a;
                    }
                });
            case 6:
                F0.X x6 = (F0.X) obj;
                final int l03 = x6.l0(AbstractC0497b.f6737b);
                int i8 = l03 * 2;
                final int i9 = 0;
                final F0.k0 w6 = ((F0.U) obj2).w(AbstractC0960b.i(0, i8, ((C0959a) obj3).a));
                return x6.D(w6.f1485c, w6.f1486e - i8, Y3.w.f9813c, new l4.c() { // from class: R.a
                    @Override // l4.c
                    public final Object f(Object obj4) {
                        F0.j0 j0Var = (F0.j0) obj4;
                        switch (i9) {
                            case 0:
                                j0Var.h(w6, 0, -l03, S.l.f7374V);
                                break;
                            default:
                                j0Var.h(w6, -l03, 0, S.l.f7374V);
                                break;
                        }
                        return X3.y.a;
                    }
                });
            case 7:
                C0626q c0626q6 = (C0626q) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q6.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.dialog_button_confirm, c0626q6), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q6, 0, 0, 262142);
                } else {
                    c0626q6.V();
                }
                return X3.y.a;
            case 8:
                C0626q c0626q7 = (C0626q) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q7.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.dialog_button_cancel, c0626q7), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q7, 0, 0, 262142);
                } else {
                    c0626q7.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                C0626q c0626q8 = (C0626q) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q8.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.dialog_button_cancel, c0626q8), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q8, 0, 0, 262142);
                } else {
                    c0626q8.V();
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                C0626q c0626q9 = (C0626q) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q9.S(intValue8 & 1, (intValue8 & 17) != 16)) {
                    AbstractC0888d.e(null, c0626q9, 0);
                } else {
                    c0626q9.V();
                }
                return X3.y.a;
            case 11:
                C0626q c0626q10 = (C0626q) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q10.S(intValue9 & 1, (intValue9 & 17) != 16)) {
                    AbstractC0888d.e(null, c0626q10, 0);
                } else {
                    c0626q10.V();
                }
                return X3.y.a;
            case 12:
                C0626q c0626q11 = (C0626q) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q11.S(intValue10 & 1, (intValue10 & 17) != 16)) {
                    AbstractC0530j.h(0, c0626q11);
                } else {
                    c0626q11.V();
                }
                return X3.y.a;
            case 13:
                C0626q c0626q12 = (C0626q) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$Button");
                if (c0626q12.S(intValue11 & 1, (intValue11 & 17) != 16)) {
                    AbstractC1688b L5 = Y3.C.L(R.drawable.cuida_edit_outline, 0, c0626q12);
                    C1038o c1038o = C1038o.a;
                    Q.A0.a(L5, null, v.t0.j(c1038o, 16), 0L, c0626q12, 440, 8);
                    AbstractC1787b.h(c0626q12, v.t0.n(c1038o, 8));
                    f3.b(h5.e.j0(R.string.chat_start_new_conversation, c0626q12), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q12, 0, 0, 262142);
                } else {
                    c0626q12.V();
                }
                return X3.y.a;
            case 14:
                C0626q c0626q13 = (C0626q) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q13.S(intValue12 & 1, (intValue12 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.update_banner_downloading, c0626q13), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q13, 0, 0, 262142);
                } else {
                    c0626q13.V();
                }
                return X3.y.a;
            case 15:
                C0626q c0626q14 = (C0626q) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q14.S(intValue13 & 1, (intValue13 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.update_banner_action, c0626q14), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q14, 0, 0, 262142);
                } else {
                    c0626q14.V();
                }
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                C0626q c0626q15 = (C0626q) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q15.S(intValue14 & 1, (intValue14 & 17) != 16)) {
                    AbstractC1787b.h(c0626q15, v.t0.d(C1038o.a, 24));
                } else {
                    c0626q15.V();
                }
                return X3.y.a;
            case 17:
                C0626q c0626q16 = (C0626q) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q16.S(intValue15 & 1, (intValue15 & 17) != 16)) {
                    InterfaceC1041r A5 = AbstractC1787b.A(S.l.f7374V, 16, 1, v.t0.a);
                    F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode = Long.hashCode(c0626q16.f8164T);
                    InterfaceC0617l0 l3 = c0626q16.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q16, A5);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q16.f0();
                    if (c0626q16.f8163S) {
                        c0626q16.k(c0148f);
                    } else {
                        c0626q16.p0();
                    }
                    T.r.G(c0626q16, d6, C0150g.f1928f);
                    T.r.G(c0626q16, l3, C0150g.f1927e);
                    T.r.x(c0626q16, Integer.valueOf(hashCode), C0150g.f1929g);
                    T.r.C(c0626q16, C0150g.f1930h);
                    T.r.G(c0626q16, c7, C0150g.f1926d);
                    M1.a(null, 0L, S.l.f7374V, 0L, 0, S.l.f7374V, c0626q16, 0, 63);
                    c0626q16.p(true);
                } else {
                    c0626q16.V();
                }
                return X3.y.a;
            case 18:
                C0626q c0626q17 = (C0626q) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q17.S(intValue16 & 1, (intValue16 & 17) != 16)) {
                    InterfaceC1041r A6 = AbstractC1787b.A(S.l.f7374V, 24, 1, v.t0.a);
                    F0.V d7 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode2 = Long.hashCode(c0626q17.f8164T);
                    InterfaceC0617l0 l5 = c0626q17.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q17, A6);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q17.f0();
                    if (c0626q17.f8163S) {
                        c0626q17.k(c0148f2);
                    } else {
                        c0626q17.p0();
                    }
                    T.r.G(c0626q17, d7, C0150g.f1928f);
                    T.r.G(c0626q17, l5, C0150g.f1927e);
                    T.r.x(c0626q17, Integer.valueOf(hashCode2), C0150g.f1929g);
                    T.r.C(c0626q17, C0150g.f1930h);
                    T.r.G(c0626q17, c8, C0150g.f1926d);
                    f3.b(h5.e.j0(R.string.model_config_bots_empty, c0626q17), null, ((Q.N) c0626q17.j(Q.O.a)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q17, 0, 0, 262138);
                    c0626q17.p(true);
                } else {
                    c0626q17.V();
                }
                return X3.y.a;
            case 19:
                I2 i23 = (I2) obj;
                C0626q c0626q18 = (C0626q) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                AbstractC1276k.f(i23, "snackbarData");
                if ((intValue17 & 6) == 0) {
                    intValue17 |= c0626q18.f(i23) ? 4 : 2;
                }
                if (c0626q18.S(intValue17 & 1, (intValue17 & 19) != 18)) {
                    T.e1 e1Var2 = Q.O.a;
                    S2.c(i23, null, null, ((Q.N) c0626q18.j(e1Var2)).f5435y, ((Q.N) c0626q18.j(e1Var2)).f5436z, 0L, 0L, 0L, c0626q18, intValue17 & 14, 462);
                } else {
                    c0626q18.V();
                }
                return X3.y.a;
            case 20:
                C0626q c0626q19 = (C0626q) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q19.S(intValue18 & 1, (intValue18 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.bot_delete, c0626q19), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q19, 0, 0, 262142);
                } else {
                    c0626q19.V();
                }
                return X3.y.a;
            case 21:
                C0626q c0626q20 = (C0626q) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q20.S(intValue19 & 1, (intValue19 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.dialog_button_cancel, c0626q20), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q20, 0, 0, 262142);
                } else {
                    c0626q20.V();
                }
                return X3.y.a;
            case 22:
                C0626q c0626q21 = (C0626q) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q21.S(intValue20 & 1, (intValue20 & 17) != 16)) {
                    AbstractC1688b L6 = Y3.C.L(R.drawable.add, 0, c0626q21);
                    String j02 = h5.e.j0(R.string.mcp_headers_add, c0626q21);
                    T.e1 e1Var3 = Q.O.a;
                    Q.A0.a(L6, j02, null, ((Q.N) c0626q21.j(e1Var3)).a, c0626q21, 8, 4);
                    AbstractC1787b.h(c0626q21, v.t0.j(C1038o.a, 4));
                    f3.b(h5.e.j0(R.string.mcp_headers_add, c0626q21), null, ((Q.N) c0626q21.j(e1Var3)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q21, 0, 0, 262138);
                } else {
                    c0626q21.V();
                }
                return X3.y.a;
            case 23:
                C0626q c0626q22 = (C0626q) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q22.S(intValue21 & 1, (intValue21 & 17) != 16)) {
                    AbstractC1688b L7 = Y3.C.L(R.drawable.delete, 0, c0626q22);
                    String j03 = h5.e.j0(R.string.button_delete, c0626q22);
                    T.e1 e1Var4 = Q.O.a;
                    Q.A0.a(L7, j03, null, ((Q.N) c0626q22.j(e1Var4)).f5433w, c0626q22, 8, 4);
                    AbstractC1787b.h(c0626q22, v.t0.j(C1038o.a, 4));
                    f3.b(h5.e.j0(R.string.button_delete, c0626q22), null, ((Q.N) c0626q22.j(e1Var4)).f5433w, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q22, 0, 0, 262138);
                } else {
                    c0626q22.V();
                }
                return X3.y.a;
            case 24:
                C0626q c0626q23 = (C0626q) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q23.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                    InterfaceC1041r A7 = AbstractC1787b.A(S.l.f7374V, 24, 1, v.t0.a);
                    F0.V d8 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode3 = Long.hashCode(c0626q23.f8164T);
                    InterfaceC0617l0 l6 = c0626q23.l();
                    InterfaceC1041r c9 = AbstractC1024a.c(c0626q23, A7);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f3 = C0150g.f1924b;
                    c0626q23.f0();
                    if (c0626q23.f8163S) {
                        c0626q23.k(c0148f3);
                    } else {
                        c0626q23.p0();
                    }
                    T.r.G(c0626q23, d8, C0150g.f1928f);
                    T.r.G(c0626q23, l6, C0150g.f1927e);
                    T.r.x(c0626q23, Integer.valueOf(hashCode3), C0150g.f1929g);
                    T.r.C(c0626q23, C0150g.f1930h);
                    T.r.G(c0626q23, c9, C0150g.f1926d);
                    f3.b(h5.e.j0(R.string.mcp_empty_state, c0626q23), null, ((Q.N) c0626q23.j(Q.O.a)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q23, 0, 0, 262138);
                    c0626q23.p(true);
                } else {
                    c0626q23.V();
                }
                return X3.y.a;
            case 25:
                C0626q c0626q24 = (C0626q) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q24.S(intValue23 & 1, (intValue23 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.button_delete, c0626q24), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q24, 0, 0, 262142);
                } else {
                    c0626q24.V();
                }
                return X3.y.a;
            case 26:
                C0626q c0626q25 = (C0626q) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                AbstractC1276k.f((v.q0) obj, "$this$TextButton");
                if (c0626q25.S(intValue24 & 1, (intValue24 & 17) != 16)) {
                    f3.b(h5.e.j0(R.string.dialog_button_cancel, c0626q25), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q25, 0, 0, 262142);
                } else {
                    c0626q25.V();
                }
                return X3.y.a;
            case 27:
                C0626q c0626q26 = (C0626q) obj2;
                ((Integer) obj3).getClass();
                AbstractC1276k.f((InterfaceC1194A) obj, "$this$AnimatedVisibility");
                f3.b(h5.e.j0(R.string.mcp_no_tools, c0626q26), AbstractC1787b.C(C1038o.a, S.l.f7374V, 16, S.l.f7374V, S.l.f7374V, 13), ((Q.N) c0626q26.j(Q.O.a)).f5429s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) c0626q26.j(u3.a)).f6130k, c0626q26, 48, 0, 131064);
                return X3.y.a;
            case 28:
                I2 i24 = (I2) obj;
                C0626q c0626q27 = (C0626q) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                AbstractC1276k.f(i24, "snackbarData");
                if ((intValue25 & 6) == 0) {
                    intValue25 |= c0626q27.f(i24) ? 4 : 2;
                }
                if (c0626q27.S(intValue25 & 1, (intValue25 & 19) != 18)) {
                    T.e1 e1Var5 = Q.O.a;
                    S2.c(i24, null, null, ((Q.N) c0626q27.j(e1Var5)).f5435y, ((Q.N) c0626q27.j(e1Var5)).f5436z, 0L, 0L, 0L, c0626q27, intValue25 & 14, 462);
                } else {
                    c0626q27.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q28 = (C0626q) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1851b) obj, "$this$item");
                if (c0626q28.S(intValue26 & 1, (intValue26 & 17) != 16)) {
                    InterfaceC1041r A8 = AbstractC1787b.A(S.l.f7374V, 24, 1, v.t0.a);
                    F0.V d9 = AbstractC1806l.d(C1026c.f11790h, false);
                    int hashCode4 = Long.hashCode(c0626q28.f8164T);
                    InterfaceC0617l0 l7 = c0626q28.l();
                    InterfaceC1041r c10 = AbstractC1024a.c(c0626q28, A8);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f4 = C0150g.f1924b;
                    c0626q28.f0();
                    if (c0626q28.f8163S) {
                        c0626q28.k(c0148f4);
                    } else {
                        c0626q28.p0();
                    }
                    T.r.G(c0626q28, d9, C0150g.f1928f);
                    T.r.G(c0626q28, l7, C0150g.f1927e);
                    T.r.x(c0626q28, Integer.valueOf(hashCode4), C0150g.f1929g);
                    T.r.C(c0626q28, C0150g.f1930h);
                    T.r.G(c0626q28, c10, C0150g.f1926d);
                    M1.a(null, 0L, S.l.f7374V, 0L, 0, S.l.f7374V, c0626q28, 0, 63);
                    c0626q28.p(true);
                } else {
                    c0626q28.V();
                }
                return X3.y.a;
        }
    }
}
