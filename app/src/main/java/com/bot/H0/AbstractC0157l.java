package H0;

import F0.AbstractC0107a;
import F0.C0125m;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import T.AbstractC0623o0;
import android.view.View;
import b0.C0878k;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import i0.C1063b;
import i0.C1064c;
import java.util.ArrayList;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: H0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0157l {
    public static final o0 a = new o0(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l4.c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void A(InterfaceC0155j interfaceC0155j, String str, l4.c cVar) {
        AbstractC1040q abstractC1040q = (AbstractC1040q) interfaceC0155j;
        if (!abstractC1040q.f11806c.f11819q) {
            E0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.e eVar = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c;
        AbstractC1040q abstractC1040q3 = abstractC1040q2.f11811i;
        if (abstractC1040q3 == null) {
            b(eVar, abstractC1040q2);
        } else {
            eVar.b(abstractC1040q3);
        }
        while (true) {
            int i6 = eVar.f8761f;
            if (i6 == 0) {
                return;
            }
            AbstractC1040q abstractC1040q4 = (AbstractC1040q) eVar.k(i6 - 1);
            if ((abstractC1040q4.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                for (AbstractC1040q abstractC1040q5 = abstractC1040q4; abstractC1040q5 != null && abstractC1040q5.f11819q; abstractC1040q5 = abstractC1040q5.f11811i) {
                    if ((abstractC1040q5.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                        AbstractC0156k abstractC0156k = abstractC1040q5;
                        int r6 = 0;
                        while (abstractC0156k != 0) {
                            if (abstractC0156k instanceof F0) {
                                F0 f02 = (F0) abstractC0156k;
                                E0 e02 = str.equals(f02.m()) ? (E0) cVar.f(f02) : E0.f1692c;
                                if (e02 == E0.f1694f) {
                                    return;
                                }
                                if (e02 == E0.f1693e) {
                                    break;
                                }
                            } else if ((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                AbstractC1040q abstractC1040q6 = abstractC0156k.f1964s;
                                int i7 = 0;
                                abstractC0156k = abstractC0156k;
                                r6 = r6;
                                while (abstractC1040q6 != null) {
                                    if ((abstractC1040q6.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                        i7++;
                                        r6 = r6;
                                        if (i7 == 1) {
                                            abstractC0156k = abstractC1040q6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC0156k != 0) {
                                                r6.b(abstractC0156k);
                                                abstractC0156k = 0;
                                            }
                                            r6.b(abstractC1040q6);
                                        }
                                    }
                                    abstractC1040q6 = abstractC1040q6.f11811i;
                                    abstractC0156k = abstractC0156k;
                                    r6 = r6;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0156k = e(r6);
                        }
                    }
                }
            }
            b(eVar, abstractC1040q4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, H0.F0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [l4.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void B(F0 f02, l4.c cVar) {
        AbstractC1040q abstractC1040q = (AbstractC1040q) f02;
        if (!abstractC1040q.f11806c.f11819q) {
            E0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.e eVar = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c;
        AbstractC1040q abstractC1040q3 = abstractC1040q2.f11811i;
        if (abstractC1040q3 == null) {
            b(eVar, abstractC1040q2);
        } else {
            eVar.b(abstractC1040q3);
        }
        while (true) {
            int i6 = eVar.f8761f;
            if (i6 == 0) {
                return;
            }
            AbstractC1040q abstractC1040q4 = (AbstractC1040q) eVar.k(i6 - 1);
            if ((abstractC1040q4.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                for (AbstractC1040q abstractC1040q5 = abstractC1040q4; abstractC1040q5 != null && abstractC1040q5.f11819q; abstractC1040q5 = abstractC1040q5.f11811i) {
                    if ((abstractC1040q5.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                        AbstractC0156k abstractC0156k = abstractC1040q5;
                        int r7 = 0;
                        while (abstractC0156k != 0) {
                            if (abstractC0156k instanceof F0) {
                                F0 f03 = (F0) abstractC0156k;
                                E0 e02 = (AbstractC1276k.b(f02.m(), f03.m()) && f02.getClass() == f03.getClass()) ? (E0) cVar.f(f03) : E0.f1692c;
                                if (e02 == E0.f1694f) {
                                    return;
                                }
                                if (e02 == E0.f1693e) {
                                    break;
                                }
                            } else if ((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                AbstractC1040q abstractC1040q6 = abstractC0156k.f1964s;
                                int i7 = 0;
                                abstractC0156k = abstractC0156k;
                                r7 = r7;
                                while (abstractC1040q6 != null) {
                                    if ((abstractC1040q6.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                        i7++;
                                        r7 = r7;
                                        if (i7 == 1) {
                                            abstractC0156k = abstractC1040q6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC0156k != 0) {
                                                r7.b(abstractC0156k);
                                                abstractC0156k = 0;
                                            }
                                            r7.b(abstractC1040q6);
                                        }
                                    }
                                    abstractC1040q6 = abstractC1040q6.f11811i;
                                    abstractC0156k = abstractC0156k;
                                    r7 = r7;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0156k = e(r7);
                        }
                    }
                }
            }
            b(eVar, abstractC1040q4);
        }
    }

    public static final long a(float f6, boolean z5, boolean z6) {
        return (((z5 ? 1L : 0L) | (z6 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final void b(V.e eVar, AbstractC1040q abstractC1040q) {
        V.e z5 = v(abstractC1040q).z();
        int i6 = z5.f8761f - 1;
        Object[] objArr = z5.f8759c;
        if (i6 < objArr.length) {
            while (i6 >= 0) {
                eVar.b(((J) objArr[i6]).f1721J.f1919f);
                i6--;
            }
        }
    }

    public static final int c(S s5, AbstractC0107a abstractC0107a) {
        S A02 = s5.A0();
        if (A02 == null) {
            E0.a.b("Child of " + s5 + " cannot be null when calculating alignment line");
        }
        if (s5.E0().b().containsKey(abstractC0107a)) {
            Integer num = (Integer) s5.E0().b().get(abstractC0107a);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int f02 = A02.f0(abstractC0107a);
            if (f02 != Integer.MIN_VALUE) {
                A02.f1800m = true;
                s5.f1801n = true;
                s5.K0();
                A02.f1800m = false;
                s5.f1801n = false;
                return f02 + ((int) (abstractC0107a instanceof C0125m ? A02.G0() & 4294967295L : A02.G0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final AbstractC1040q d(InterfaceC0155j interfaceC0155j, int i6) {
        AbstractC1040q abstractC1040q = ((AbstractC1040q) interfaceC0155j).f11806c.f11811i;
        if (abstractC1040q == null || (abstractC1040q.f11809g & i6) == 0) {
            return null;
        }
        while (abstractC1040q != null) {
            int i7 = abstractC1040q.f11808f;
            if ((i7 & 2) != 0) {
                return null;
            }
            if ((i7 & i6) != 0) {
                return abstractC1040q;
            }
            abstractC1040q = abstractC1040q.f11811i;
        }
        return null;
    }

    public static final AbstractC1040q e(V.e eVar) {
        int i6;
        if (eVar == null || (i6 = eVar.f8761f) == 0) {
            return null;
        }
        return (AbstractC1040q) eVar.k(i6 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0170z f(AbstractC1040q abstractC1040q) {
        if ((abstractC1040q.f11808f & 2) != 0) {
            if (abstractC1040q instanceof InterfaceC0170z) {
                return (InterfaceC0170z) abstractC1040q;
            }
            if (abstractC1040q instanceof AbstractC0156k) {
                AbstractC1040q abstractC1040q2 = ((AbstractC0156k) abstractC1040q).f1964s;
                while (abstractC1040q2 != 0) {
                    if (abstractC1040q2 instanceof InterfaceC0170z) {
                        return (InterfaceC0170z) abstractC1040q2;
                    }
                    abstractC1040q2 = (!(abstractC1040q2 instanceof AbstractC0156k) || (abstractC1040q2.f11808f & 2) == 0) ? abstractC1040q2.f11811i : ((AbstractC0156k) abstractC1040q2).f1964s;
                }
            }
        }
        return null;
    }

    public static final int g(long j3, long j4) {
        boolean o5 = o(j3);
        if (o5 != o(j4)) {
            return o5 ? -1 : 1;
        }
        return (Math.min(j(j3), j(j4)) >= S.l.f7374V && n(j3) != n(j4)) ? n(j3) ? -1 : 1 : (int) Math.signum(j(j3) - j(j4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(InterfaceC0154i interfaceC0154i, AbstractC0623o0 abstractC0623o0) {
        if (!((AbstractC1040q) interfaceC0154i).f11806c.f11819q) {
            E0.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C0878k c0878k = (C0878k) v(interfaceC0154i).f1717F;
        c0878k.getClass();
        return T.r.B(c0878k, abstractC0623o0);
    }

    public static final ArrayList i(F0.r rVar) {
        AbstractC1276k.d(rVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        J D0 = ((S) rVar).D0();
        boolean p5 = p(D0);
        V.b bVar = (V.b) D0.o();
        V.e eVar = (V.e) bVar.f8751e;
        ArrayList arrayList = new ArrayList(eVar.f8761f);
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j3 = (J) bVar.get(i7);
            arrayList.add(p5 ? j3.l() : j3.m());
        }
        return arrayList;
    }

    public static final float j(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(InterfaceC0160o interfaceC0160o) {
        if (((AbstractC1040q) interfaceC0160o).f11806c.f11819q) {
            t(interfaceC0160o, 1).d1();
        }
    }

    public static final void l(InterfaceC0170z interfaceC0170z) {
        v(interfaceC0170z).E();
    }

    public static final void m(A0 a02) {
        v(a02).F();
    }

    public static final boolean n(long j3) {
        return (j3 & 2) != 0;
    }

    public static final boolean o(long j3) {
        return (j3 & 1) != 0;
    }

    public static final boolean p(J j3) {
        int ordinal = j3.f1722K.f1769d.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    throw new RuntimeException();
                }
                J v5 = j3.v();
                if (v5 != null) {
                    return p(v5);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static final boolean q(J j3) {
        if (j3.f1741l == null) {
            return false;
        }
        J v5 = j3.v();
        return (v5 != null ? v5.f1741l : null) == null || j3.f1722K.f1767b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(AbstractC1040q abstractC1040q, InterfaceC1193a interfaceC1193a) {
        n0 n0Var = abstractC1040q.f11812j;
        if (n0Var == null) {
            n0Var = new n0((m0) abstractC1040q);
            abstractC1040q.f11812j = n0Var;
        }
        t0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) w(abstractC1040q)).getSnapshotObserver();
        snapshotObserver.a.d(n0Var, C0144d.f1893j, interfaceC1193a);
    }

    public static final void s(InterfaceC0155j interfaceC0155j) {
        C1064c c1064c;
        J v5 = v(interfaceC0155j);
        if (v5.f1753x || (c1064c = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(v5)).f2431O) == null) {
            return;
        }
        c1064c.f11943g.a.i(v5.f1734e, new C1063b(c1064c, v5));
    }

    public static final i0 t(InterfaceC0155j interfaceC0155j, int i6) {
        i0 i0Var = ((AbstractC1040q) interfaceC0155j).f11806c.f11813k;
        AbstractC1276k.c(i0Var);
        if (i0Var.W0() != interfaceC0155j || !j0.g(i6)) {
            return i0Var;
        }
        i0 i0Var2 = i0Var.f1955s;
        AbstractC1276k.c(i0Var2);
        return i0Var2;
    }

    public static final i0 u(InterfaceC0155j interfaceC0155j) {
        if (!((AbstractC1040q) interfaceC0155j).f11806c.f11819q) {
            E0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        i0 t5 = t(interfaceC0155j, 2);
        if (!t5.W0().f11819q) {
            E0.a.b("LayoutCoordinates is not attached.");
        }
        return t5;
    }

    public static final J v(InterfaceC0155j interfaceC0155j) {
        i0 i0Var = ((AbstractC1040q) interfaceC0155j).f11806c.f11813k;
        if (i0Var != null) {
            return i0Var.f1954r;
        }
        throw B3.e.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final r0 w(InterfaceC0155j interfaceC0155j) {
        r0 r0Var = v(interfaceC0155j).f1747r;
        if (r0Var != null) {
            return r0Var;
        }
        throw B3.e.f("This node does not have an owner.");
    }

    public static final View x(InterfaceC0155j interfaceC0155j) {
        if (!((AbstractC1040q) interfaceC0155j).f11806c.f11819q) {
            E0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) M.a(v(interfaceC0155j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [l4.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void y(InterfaceC0155j interfaceC0155j, Object obj, l4.c cVar) {
        C0149f0 c0149f0;
        AbstractC1040q abstractC1040q = (AbstractC1040q) interfaceC0155j;
        if (!abstractC1040q.f11806c.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c.f11810h;
        J v5 = v(interfaceC0155j);
        while (v5 != null) {
            if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                while (abstractC1040q2 != null) {
                    if ((abstractC1040q2.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                        AbstractC0156k abstractC0156k = abstractC1040q2;
                        int r42 = 0;
                        while (abstractC0156k != 0) {
                            if (abstractC0156k instanceof F0) {
                                F0 f02 = (F0) abstractC0156k;
                                if (!(obj.equals(f02.m()) ? ((Boolean) cVar.f(f02)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q3 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r42 = r42;
                                    while (abstractC1040q3 != null) {
                                        if ((abstractC1040q3.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                            i6++;
                                            r42 = r42;
                                            if (i6 == 1) {
                                                abstractC0156k = abstractC1040q3;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r42.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r42.b(abstractC1040q3);
                                            }
                                        }
                                        abstractC1040q3 = abstractC1040q3.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r42 = r42;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                            }
                            abstractC0156k = e(r42);
                        }
                    }
                    abstractC1040q2 = abstractC1040q2.f11810h;
                }
            }
            v5 = v5.v();
            abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [H0.j, java.lang.Object, H0.F0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [l4.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void z(F0 f02, l4.c cVar) {
        C0149f0 c0149f0;
        AbstractC1040q abstractC1040q = (AbstractC1040q) f02;
        if (!abstractC1040q.f11806c.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c.f11810h;
        J v5 = v(f02);
        while (v5 != null) {
            if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                while (abstractC1040q2 != null) {
                    if ((abstractC1040q2.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                        AbstractC0156k abstractC0156k = abstractC1040q2;
                        int r5 = 0;
                        while (abstractC0156k != 0) {
                            boolean z5 = true;
                            if (abstractC0156k instanceof F0) {
                                F0 f03 = (F0) abstractC0156k;
                                if (AbstractC1276k.b(f02.m(), f03.m()) && f02.getClass() == f03.getClass()) {
                                    z5 = ((Boolean) cVar.f(f03)).booleanValue();
                                }
                                if (!z5) {
                                    return;
                                }
                            } else {
                                if (((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q3 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r5 = r5;
                                    while (abstractC1040q3 != null) {
                                        if ((abstractC1040q3.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                            i6++;
                                            r5 = r5;
                                            if (i6 == 1) {
                                                abstractC0156k = abstractC1040q3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r5.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r5.b(abstractC1040q3);
                                            }
                                        }
                                        abstractC1040q3 = abstractC1040q3.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r5 = r5;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                            }
                            abstractC0156k = e(r5);
                        }
                    }
                    abstractC1040q2 = abstractC1040q2.f11810h;
                }
            }
            v5 = v5.v();
            abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
        }
    }
}
