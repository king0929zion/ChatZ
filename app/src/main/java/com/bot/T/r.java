package T;

import A4.C0010k;
import H0.C0158m;
import b0.C0878k;
import b4.C0911i;
import b4.InterfaceC0910h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import k.C1178z;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public abstract class r {
    public static final H0.C a = new H0.C(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8197b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final H f8198c = new Object();

    public static C0607g0 A(Object obj) {
        return new C0607g0(obj, C0602e.f8083j);
    }

    public static final Object B(InterfaceC0617l0 interfaceC0617l0, AbstractC0623o0 abstractC0623o0) {
        AbstractC1276k.d(abstractC0623o0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C0878k c0878k = (C0878k) interfaceC0617l0;
        Object obj = c0878k.get(abstractC0623o0);
        if (obj == null) {
            obj = abstractC0623o0.b();
        }
        return ((g1) obj).a(c0878k);
    }

    public static final void C(C0626q c0626q, l4.c cVar) {
        c0626q.b(X3.y.a, new B4.D(cVar, 19));
    }

    public static final C0622o D(C0626q c0626q) {
        C0626q c0626q2;
        c0626q.Y(206, AbstractC0629s.f8204e);
        if (c0626q.f8163S) {
            M0.z(c0626q.f8153I);
        }
        Object H3 = c0626q.H();
        C0 c02 = H3 instanceof C0 ? (C0) H3 : null;
        if (c02 == null) {
            c0626q2 = c0626q;
            c02 = new C0(new C0620n(new C0622o(c0626q2, c0626q.f8164T, c0626q.f8181q, c0626q.f8147C, c0626q.f8172h.f8253w)), -1);
            c0626q2.n0(c02);
        } else {
            c0626q2 = c0626q;
        }
        B0 b02 = c02.a;
        AbstractC1276k.d(b02, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        C0622o c0622o = ((C0620n) b02).f8130c;
        c0622o.f8137f.setValue(c0626q2.l());
        c0626q2.p(false);
        return c0622o;
    }

    public static final X E(Object obj, C0626q c0626q) {
        Object P5 = c0626q.P();
        if (P5 == C0616l.a) {
            P5 = A(obj);
            c0626q.m0(P5);
        }
        X x5 = (X) P5;
        x5.setValue(obj);
        return x5;
    }

    public static final void F(M0 m02, int i6, Object obj) {
        int h3 = m02.h(i6);
        Object[] objArr = m02.f7987c;
        Object obj2 = objArr[h3];
        objArr[h3] = C0616l.a;
        if (obj == obj2) {
            return;
        }
        AbstractC0629s.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void G(C0626q c0626q, Object obj, l4.e eVar) {
        if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), obj)) {
            c0626q.m0(obj);
            c0626q.b(obj, eVar);
        }
    }

    public static final C0010k H(InterfaceC1193a interfaceC1193a) {
        return new C0010k(new a1(interfaceC1193a, null));
    }

    public static final int I(C1178z c1178z) {
        int c6;
        int i6 = c1178z.f12592b;
        int c7 = c1178z.c(0);
        while (c1178z.f12592b != 0 && c1178z.c(0) == c7) {
            c1178z.f(0, c1178z.d());
            c1178z.e(c1178z.f12592b - 1);
            int i7 = c1178z.f12592b;
            int i8 = i7 >>> 1;
            int i9 = 0;
            while (i9 < i8) {
                int c8 = c1178z.c(i9);
                int i10 = (i9 + 1) * 2;
                int i11 = i10 - 1;
                int c9 = c1178z.c(i11);
                if (i10 >= i7 || (c6 = c1178z.c(i10)) <= c9) {
                    if (c9 > c8) {
                        c1178z.f(i9, c9);
                        c1178z.f(i11, c8);
                        i9 = i11;
                    }
                } else if (c6 > c8) {
                    c1178z.f(i9, c6);
                    c1178z.f(i10, c8);
                    i9 = i10;
                }
            }
        }
        return c7;
    }

    public static final int J(int i6) {
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        return (i6 & (-920350135)) | (i8 >> 1) | i7 | ((i7 << 1) & i8);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y.e, b0.j] */
    public static final C0878k K(C0625p0[] c0625p0Arr, InterfaceC0617l0 interfaceC0617l0, InterfaceC0617l0 interfaceC0617l02) {
        C0878k c0878k = C0878k.f10988g;
        Y.e eVar = new Y.e(c0878k);
        eVar.f10987j = c0878k;
        for (C0625p0 c0625p0 : c0625p0Arr) {
            AbstractC0623o0 abstractC0623o0 = c0625p0.a;
            if (c0625p0.f8144f || !((C0878k) interfaceC0617l0).containsKey(abstractC0623o0)) {
                eVar.put(abstractC0623o0, abstractC0623o0.c(c0625p0, (g1) ((C0878k) interfaceC0617l02).get(abstractC0623o0)));
            }
        }
        return eVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(T.C0625p0 r11, l4.e r12, T.C0626q r13, int r14) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.d0(r0)
            H0.v r0 = r13.f8188x
            T.l0 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            T.a0 r3 = T.AbstractC0629s.f8201b
            r13.Y(r2, r3)
            java.lang.Object r2 = r13.P()
            T.e r3 = T.C0616l.a
            boolean r3 = m4.AbstractC1276k.b(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L29
        L22:
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            m4.AbstractC1276k.d(r2, r3)
            T.g1 r2 = (T.g1) r2
        L29:
            T.o0 r3 = r11.a
            T.g1 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r13.m0(r5)
        L38:
            boolean r6 = r13.f8163S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L55
            boolean r2 = r11.f8144f
            if (r2 != 0) goto L4b
            r2 = r1
            b0.k r2 = (b0.C0878k) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L51
        L4b:
            b0.k r1 = (b0.C0878k) r1
            b0.k r1 = r1.c(r3, r5)
        L51:
            r13.f8154J = r7
        L53:
            r2 = r8
            goto L97
        L55:
            T.I0 r6 = r13.f8151G
            int r9 = r6.f7958g
            int[] r10 = r6.f7953b
            java.lang.Object r6 = r6.b(r10, r9)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            m4.AbstractC1276k.d(r6, r9)
            T.l0 r6 = (T.InterfaceC0617l0) r6
            boolean r9 = r13.E()
            if (r9 == 0) goto L6e
            if (r2 != 0) goto L7c
        L6e:
            boolean r9 = r11.f8144f
            if (r9 != 0) goto L8a
            r9 = r1
            b0.k r9 = (b0.C0878k) r9
            boolean r9 = r9.containsKey(r3)
            if (r9 != 0) goto L7c
            goto L8a
        L7c:
            if (r2 == 0) goto L83
            boolean r2 = r13.f8187w
            if (r2 != 0) goto L83
            goto L88
        L83:
            boolean r2 = r13.f8187w
            if (r2 == 0) goto L88
            goto L90
        L88:
            r1 = r6
            goto L90
        L8a:
            b0.k r1 = (b0.C0878k) r1
            b0.k r1 = r1.c(r3, r5)
        L90:
            boolean r2 = r13.f8189y
            if (r2 != 0) goto L96
            if (r6 == r1) goto L53
        L96:
            r2 = r7
        L97:
            if (r2 == 0) goto La0
            boolean r3 = r13.f8163S
            if (r3 != 0) goto La0
            r13.N(r1)
        La0:
            boolean r3 = r13.f8187w
            r0.c(r3)
            r13.f8187w = r2
            r13.f8155K = r1
            r2 = 202(0xca, float:2.83E-43)
            T.a0 r3 = T.AbstractC0629s.f8202c
            r13.W(r2, r8, r3, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.m(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lc8
            goto Lc9
        Lc8:
            r7 = r8
        Lc9:
            r13.f8187w = r7
            r13.f8155K = r4
            T.q0 r13 = r13.t()
            if (r13 == 0) goto Ldb
            D.i r0 = new D.i
            r1 = 4
            r0.<init>(r14, r1, r11, r12)
            r13.f8193d = r0
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.r.a(T.p0, l4.e, T.q, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T.l0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(T.C0625p0[] r8, l4.e r9, T.C0626q r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.d0(r0)
            H0.v r0 = r10.f8188x
            T.l0 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            T.a0 r3 = T.AbstractC0629s.f8201b
            r10.Y(r2, r3)
            boolean r2 = r10.f8163S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            b0.k r2 = b0.C0878k.f10988g
            b0.k r2 = K(r8, r1, r2)
            b0.k r1 = r10.l0(r1, r2)
            r10.f8154J = r3
        L25:
            r2 = r4
            goto L74
        L27:
            T.I0 r2 = r10.f8151G
            int r5 = r2.f7958g
            java.lang.Object r2 = r2.h(r5, r4)
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            m4.AbstractC1276k.d(r2, r5)
            T.l0 r2 = (T.InterfaceC0617l0) r2
            T.I0 r6 = r10.f8151G
            int r7 = r6.f7958g
            java.lang.Object r6 = r6.h(r7, r3)
            m4.AbstractC1276k.d(r6, r5)
            T.l0 r6 = (T.InterfaceC0617l0) r6
            b0.k r5 = K(r8, r1, r6)
            boolean r7 = r10.E()
            if (r7 == 0) goto L65
            boolean r7 = r10.f8189y
            if (r7 != 0) goto L65
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L58
            goto L65
        L58:
            int r1 = r10.f8176l
            T.I0 r5 = r10.f8151G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.f8176l = r5
            r1 = r2
            goto L25
        L65:
            b0.k r1 = r10.l0(r1, r5)
            boolean r5 = r10.f8189y
            if (r5 != 0) goto L73
            boolean r2 = m4.AbstractC1276k.b(r1, r2)
            if (r2 != 0) goto L25
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L7d
            boolean r5 = r10.f8163S
            if (r5 != 0) goto L7d
            r10.N(r1)
        L7d:
            boolean r5 = r10.f8187w
            r0.c(r5)
            r10.f8187w = r2
            r10.f8155K = r1
            r2 = 202(0xca, float:2.83E-43)
            T.a0 r5 = T.AbstractC0629s.f8202c
            r10.W(r2, r4, r5, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.m(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La5
            goto La6
        La5:
            r3 = r4
        La6:
            r10.f8187w = r3
            r0 = 0
            r10.f8155K = r0
            T.q0 r10 = r10.t()
            if (r10 == 0) goto Lb9
            D.i r0 = new D.i
            r1 = 5
            r0.<init>(r11, r1, r8, r9)
            r10.f8193d = r0
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.r.b(T.p0[], l4.e, T.q, int):void");
    }

    public static final void c(Object obj, Object obj2, l4.c cVar, C0626q c0626q) {
        boolean f6 = c0626q.f(obj) | c0626q.f(obj2);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            P5 = new F(cVar);
            c0626q.m0(P5);
        }
    }

    public static final void d(Object obj, l4.c cVar, C0626q c0626q) {
        boolean f6 = c0626q.f(obj);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            P5 = new F(cVar);
            c0626q.m0(P5);
        }
    }

    public static final void e(Object[] objArr, l4.c cVar, C0626q c0626q) {
        boolean z5 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z5 |= c0626q.f(obj);
        }
        Object P5 = c0626q.P();
        if (z5 || P5 == C0616l.a) {
            c0626q.m0(new F(cVar));
        }
    }

    public static final void f(C0626q c0626q, Object obj, l4.e eVar) {
        InterfaceC0910h interfaceC0910h = c0626q.f8162R;
        boolean f6 = c0626q.f(obj);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            P5 = new S(interfaceC0910h, eVar);
            c0626q.m0(P5);
        }
    }

    public static final void g(Object obj, Object obj2, Object obj3, l4.e eVar, C0626q c0626q) {
        InterfaceC0910h interfaceC0910h = c0626q.f8162R;
        boolean f6 = c0626q.f(obj) | c0626q.f(obj2) | c0626q.f(obj3);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            P5 = new S(interfaceC0910h, eVar);
            c0626q.m0(P5);
        }
    }

    public static final void h(Object obj, Object obj2, l4.e eVar, C0626q c0626q) {
        InterfaceC0910h interfaceC0910h = c0626q.f8162R;
        boolean f6 = c0626q.f(obj) | c0626q.f(obj2);
        Object P5 = c0626q.P();
        if (f6 || P5 == C0616l.a) {
            P5 = new S(interfaceC0910h, eVar);
            c0626q.m0(P5);
        }
    }

    public static final void i(Object[] objArr, l4.e eVar, C0626q c0626q) {
        InterfaceC0910h interfaceC0910h = c0626q.f8162R;
        boolean z5 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z5 |= c0626q.f(obj);
        }
        Object P5 = c0626q.P();
        if (z5 || P5 == C0616l.a) {
            c0626q.m0(new S(interfaceC0910h, eVar));
        }
    }

    public static final void j(InterfaceC1193a interfaceC1193a, C0626q c0626q) {
        U.M m3 = c0626q.f8157M.f8557b.f8556c;
        m3.W(U.B.f8537c);
        AbstractC1410a.Q(m3, 0, interfaceC1193a);
    }

    public static final void k(List list, int i6, int i7) {
        int t5 = t(list, i6);
        if (t5 < 0) {
            t5 = -(t5 + 1);
        }
        while (t5 < list.size() && ((N) list.get(t5)).f8009b < i7) {
        }
    }

    public static final void l(C1178z c1178z, int i6) {
        if (c1178z.f12592b == 0 || !(c1178z.c(0) == i6 || c1178z.c(c1178z.f12592b - 1) == i6)) {
            int i7 = c1178z.f12592b;
            c1178z.a(i6);
            while (i7 > 0) {
                int i8 = ((i7 + 1) >>> 1) - 1;
                int c6 = c1178z.c(i8);
                if (i6 <= c6) {
                    break;
                }
                c1178z.f(i7, c6);
                i7 = i8;
            }
            c1178z.f(i7, i6);
        }
    }

    public static void m(M0 m02, List list, C0639x c0639x) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int c6 = m02.c((C0594a) list.get(i6));
            int N5 = m02.N(m02.f7986b, m02.r(c6));
            Object obj = N5 < m02.g(m02.f7986b, m02.r(c6 + 1)) ? m02.f7987c[m02.h(N5)] : C0616l.a;
            C0627q0 c0627q0 = obj instanceof C0627q0 ? (C0627q0) obj : null;
            if (c0627q0 != null) {
                c0627q0.a = c0639x;
            }
        }
    }

    public static final X n(A4.e0 e0Var, C0626q c0626q) {
        Object value = e0Var.getValue();
        C0911i c0911i = C0911i.f11057c;
        boolean h3 = c0626q.h(c0911i) | c0626q.h(e0Var);
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (h3 || P5 == obj) {
            P5 = new Z0(c0911i, e0Var, null);
            c0626q.m0(P5);
        }
        l4.e eVar = (l4.e) P5;
        Object P6 = c0626q.P();
        if (P6 == obj) {
            P6 = A(value);
            c0626q.m0(P6);
        }
        X x5 = (X) P6;
        boolean h6 = c0626q.h(eVar);
        Object P7 = c0626q.P();
        if (h6 || P7 == obj) {
            P7 = new V0(eVar, x5, null);
            c0626q.m0(P7);
        }
        h(e0Var, c0911i, (l4.e) P7, c0626q);
        return x5;
    }

    public static final void o(I0 i02, ArrayList arrayList, int i6) {
        boolean l3 = i02.l(i6);
        int[] iArr = i02.f7953b;
        if (l3) {
            arrayList.add(i02.n(i6));
            return;
        }
        int i7 = iArr[(i6 * 5) + 3] + i6;
        for (int i8 = i6 + 1; i8 < i7; i8 += iArr[(i8 * 5) + 3]) {
            o(i02, arrayList, i8);
        }
    }

    public static final InterfaceC1942y p(C0626q c0626q) {
        return new E0(c0626q.f8162R);
    }

    public static final V.e q() {
        C0158m c0158m = S0.f8028b;
        V.e eVar = (V.e) c0158m.e();
        if (eVar != null) {
            return eVar;
        }
        V.e eVar2 = new V.e(new C0624p[0]);
        c0158m.o(eVar2);
        return eVar2;
    }

    public static final E r(R0 r02, InterfaceC1193a interfaceC1193a) {
        C0158m c0158m = S0.a;
        return new E(r02, interfaceC1193a);
    }

    public static final E s(InterfaceC1193a interfaceC1193a) {
        C0158m c0158m = S0.a;
        return new E(null, interfaceC1193a);
    }

    public static final int t(List list, int i6) {
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            int g3 = AbstractC1276k.g(((N) list.get(i8)).f8009b, i6);
            if (g3 < 0) {
                i7 = i8 + 1;
            } else {
                if (g3 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final long u(C0626q c0626q) {
        return c0626q.f8164T;
    }

    public static final Object v(Object obj, Integer num, Integer num2) {
        P p5 = obj instanceof P ? (P) obj : null;
        if (p5 == null) {
            return null;
        }
        Object obj2 = p5.f8018b;
        Integer num3 = p5.a;
        if (num3.equals(num) && AbstractC1276k.b(obj2, num2)) {
            return obj;
        }
        Object v5 = v(num3, num, num2);
        return v5 == null ? v(obj2, num, num2) : v5;
    }

    public static final I0.Z w(InterfaceC0910h interfaceC0910h) {
        I0.Z z5 = (I0.Z) interfaceC0910h.r(C0602e.f8079f);
        if (z5 != null) {
            return z5;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void x(C0626q c0626q, Integer num, l4.e eVar) {
        if (c0626q.f8163S) {
            c0626q.b(num, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List y(M0 m02, int i6, M0 m03, boolean z5, boolean z6, boolean z7) {
        Y3.v vVar;
        boolean z8;
        int i7;
        int i8;
        int u5 = m02.u(i6);
        int i9 = i6 + u5;
        int f6 = m02.f(i6);
        int f7 = m02.f(i9);
        int i10 = f7 - f6;
        boolean z9 = i6 >= 0 && (m02.f7986b[(m02.r(i6) * 5) + 1] & 201326592) != 0;
        m03.w(u5);
        m03.x(i10, m03.f8004t);
        if (m02.f7991g < i9) {
            m02.B(i9);
        }
        if (m02.f7995k < f7) {
            m02.C(f7, i9);
        }
        int[] iArr = m03.f7986b;
        int i11 = m03.f8004t;
        int i12 = i11 * 5;
        Y3.k.h0(m02.f7986b, iArr, i12, i6 * 5, i9 * 5);
        Object[] objArr = m03.f7987c;
        int i13 = m03.f7993i;
        System.arraycopy(m02.f7987c, f6, objArr, i13, i10);
        int i14 = m03.f8006v;
        iArr[i12 + 2] = i14;
        int i15 = i11 - i6;
        int i16 = i11 + u5;
        int g3 = i13 - m03.g(iArr, i11);
        int i17 = m03.f7997m;
        int i18 = m03.f7996l;
        int length = objArr.length;
        boolean z10 = z9;
        int i19 = i17;
        int i20 = i11;
        while (i20 < i16) {
            if (i20 != i11) {
                int i21 = (i20 * 5) + 2;
                iArr[i21] = iArr[i21] + i15;
            }
            int[] iArr2 = iArr;
            int g6 = m03.g(iArr, i20) + g3;
            if (i19 < i20) {
                i7 = i11;
                i8 = 0;
            } else {
                i7 = i11;
                i8 = m03.f7995k;
            }
            iArr2[(i20 * 5) + 4] = M0.i(g6, i8, i18, length);
            if (i20 == i19) {
                i19++;
            }
            i20++;
            i11 = i7;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        m03.f7997m = i19;
        int b5 = L0.b(m02.f7988d, i6, m02.p());
        int b6 = L0.b(m02.f7988d, i9, m02.p());
        if (b5 < b6) {
            ArrayList arrayList = m02.f7988d;
            ArrayList arrayList2 = new ArrayList(b6 - b5);
            for (int i22 = b5; i22 < b6; i22++) {
                C0594a c0594a = (C0594a) arrayList.get(i22);
                c0594a.a += i15;
                arrayList2.add(c0594a);
            }
            m03.f7988d.addAll(L0.b(m03.f7988d, m03.f8004t, m03.p()), arrayList2);
            arrayList.subList(b5, b6).clear();
            vVar = arrayList2;
        } else {
            vVar = Y3.v.f9812c;
        }
        if (!vVar.isEmpty()) {
            HashMap hashMap = m02.f7989e;
            HashMap hashMap2 = m03.f7989e;
            if (hashMap != null && hashMap2 != null) {
                int size = vVar.size();
                for (int i23 = 0; i23 < size; i23++) {
                }
            }
        }
        int i24 = m03.f8006v;
        m03.O(i14);
        int E5 = m02.E(m02.f7986b, i6);
        if (!z7) {
            z8 = false;
        } else if (z5) {
            boolean z11 = E5 >= 0;
            if (z11) {
                m02.P();
                m02.a(E5 - m02.f8004t);
                m02.P();
            }
            m02.a(i6 - m02.f8004t);
            boolean H3 = m02.H();
            if (z11) {
                m02.M();
                m02.j();
                m02.M();
                m02.j();
            }
            z8 = H3;
        } else {
            boolean I5 = m02.I(i6, u5);
            m02.J(f6, i10, i6 - 1);
            z8 = I5;
        }
        if (z8) {
            AbstractC0629s.a("Unexpectedly removed anchors");
        }
        int i25 = m03.f7999o;
        int i26 = iArr3[i12 + 1];
        m03.f7999o = i25 + ((1073741824 & i26) != 0 ? 1 : i26 & 67108863);
        if (z6) {
            m03.f8004t = i16;
            m03.f7993i = i13 + i10;
        }
        if (z10) {
            m03.T(i14);
        }
        return vVar;
    }

    public static final C0601d0 z() {
        return new C0601d0(0);
    }
}
