package Q;

import D.C0056a;
import D.C0086p;
import F0.C0125m;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import I0.InterfaceC0181f;
import R.AbstractC0507l;
import S.AbstractC0535b;
import T.C0607g0;
import T.C0616l;
import T.C0622o;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.C1102v;
import java.util.ArrayList;
import java.util.UUID;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.C1316c;
import n.C1327h0;
import p.AbstractC1464z;
import p.C1417G;
import t.C1682j;
import v.AbstractC1806l;
import v.C1818y;
import v.InterfaceC1802i0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public abstract class R1 {
    public static final P.b a = new P.b(0.16f, 0.1f, 0.08f, 0.1f);

    public static final void a(final InterfaceC1193a interfaceC1193a, final C0873f c0873f, InterfaceC1041r interfaceC1041r, final l4.e eVar, final l4.e eVar2, final l4.e eVar3, o0.L l3, long j3, long j4, long j5, long j6, float f6, C1102v c1102v, C0626q c0626q, final int i6) {
        int i7;
        C0873f c0873f2;
        l4.e eVar4;
        final InterfaceC1041r interfaceC1041r2;
        final o0.L l5;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        final float f7;
        final C1102v c1102v2;
        int i8;
        InterfaceC1041r interfaceC1041r3;
        o0.L l6;
        long j11;
        float f8;
        long j12;
        long j13;
        long j14;
        C1102v c1102v3;
        c0626q.d0(94478519);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            c0873f2 = c0873f;
            i7 |= c0626q.h(c0873f2) ? 32 : 16;
        } else {
            c0873f2 = c0873f;
        }
        int i9 = i7 | 384;
        if ((i6 & 3072) == 0) {
            eVar4 = eVar;
            i9 |= c0626q.h(eVar4) ? 2048 : PegdownExtensions.ANCHORLINKS;
        } else {
            eVar4 = eVar;
        }
        int i10 = i9 | 24576;
        if ((196608 & i6) == 0) {
            i10 |= c0626q.h(eVar2) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i10 |= c0626q.h(eVar3) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i10 |= PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i6) == 0) {
            i10 |= PegdownExtensions.TOC;
        }
        if ((805306368 & i6) == 0) {
            i10 |= PegdownExtensions.FORCELISTITEMPARA;
        }
        if (c0626q.S(i10 & 1, (306783379 & i10) != 306783378)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                float f9 = AbstractC0390a.a;
                o0.L a6 = W1.a(S.g.f7325d, c0626q);
                long d6 = O.d(S.g.f7324c, c0626q);
                long d7 = O.d(S.g.f7330i, c0626q);
                i8 = i10 & (-2143289345);
                long d8 = O.d(S.g.f7326e, c0626q);
                long d9 = O.d(S.g.f7328g, c0626q);
                float f10 = AbstractC0390a.a;
                C1102v c1102v4 = new C1102v();
                interfaceC1041r3 = C1038o.a;
                l6 = a6;
                j11 = d6;
                f8 = f10;
                j12 = d7;
                j13 = d8;
                j14 = d9;
                c1102v3 = c1102v4;
            } else {
                c0626q.V();
                i8 = i10 & (-2143289345);
                interfaceC1041r3 = interfaceC1041r;
                l6 = l3;
                j11 = j3;
                j12 = j4;
                j13 = j5;
                j14 = j6;
                f8 = f6;
                c1102v3 = c1102v;
            }
            c0626q.q();
            InterfaceC1041r interfaceC1041r4 = interfaceC1041r3;
            AbstractC0426j.c(interfaceC1193a, c0873f2, interfaceC1041r4, eVar4, eVar2, eVar3, l6, j11, j12, j13, j14, f8, c1102v3, c0626q, i8 & 2147483646, 3456);
            interfaceC1041r2 = interfaceC1041r4;
            c1102v2 = c1102v3;
            f7 = f8;
            j10 = j14;
            j9 = j13;
            j8 = j12;
            j7 = j11;
            l5 = l6;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            l5 = l3;
            j7 = j3;
            j8 = j4;
            j9 = j5;
            j10 = j6;
            f7 = f6;
            c1102v2 = c1102v;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.k
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(i6 | 1);
                    R1.a(InterfaceC1193a.this, c0873f, interfaceC1041r2, eVar, eVar2, eVar3, l5, j7, j8, j9, j10, f7, c1102v2, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(l4.InterfaceC1193a r32, h0.InterfaceC1041r r33, boolean r34, o0.L r35, Q.r r36, Q.C0477w r37, p.C1417G r38, v.InterfaceC1802i0 r39, l4.f r40, T.C0626q r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.R1.b(l4.a, h0.r, boolean, o0.L, Q.r, Q.w, p.G, v.i0, l4.f, T.q, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        if ((r22 & 8) != 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(h0.InterfaceC1041r r15, o0.L r16, Q.B r17, Q.C r18, b0.C0873f r19, T.C0626q r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.R1.c(h0.r, o0.L, Q.B, Q.C, b0.f, T.q, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, Q.u0] */
    public static final void d(I2 i22, InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        boolean z5;
        c0626q.d0(-977568115);
        int i7 = (i6 & 6) == 0 ? (c0626q.f(i22) ? 4 : 2) | i6 : i6;
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        boolean z6 = true;
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            String j3 = AbstractC0507l.j(R.string.m3c_snackbar_pane_title, c0626q);
            Object P5 = c0626q.P();
            Object obj = P5;
            if (P5 == C0616l.a) {
                Object obj2 = new Object();
                obj2.a = new Object();
                obj2.f6149b = new ArrayList();
                c0626q.m0(obj2);
                obj = obj2;
            }
            C0470u0 c0470u0 = (C0470u0) obj;
            Object obj3 = c0470u0.a;
            ArrayList arrayList = c0470u0.f6149b;
            if (AbstractC1276k.b(i22, obj3)) {
                z5 = true;
                c0626q.b0(1443908949);
                c0626q.p(false);
            } else {
                c0626q.b0(1154891761);
                c0470u0.a = i22;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add((I2) ((C0466t0) arrayList.get(i8)).a);
                }
                ArrayList K0 = Y3.m.K0(arrayList2);
                if (!K0.contains(i22)) {
                    K0.add(i22);
                }
                arrayList.clear();
                ArrayList arrayList3 = new ArrayList(K0.size());
                int size2 = K0.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    Object obj4 = K0.get(i9);
                    if (obj4 != null) {
                        arrayList3.add(obj4);
                    }
                }
                int size3 = arrayList3.size();
                int i10 = 0;
                while (i10 < size3) {
                    I2 i23 = (I2) arrayList3.get(i10);
                    arrayList.add(new C0466t0(i23, AbstractC0874g.c(-1952400805, new E2(i23, i22, c0470u0, j3), c0626q)));
                    i10++;
                    z6 = z6;
                }
                z5 = z6;
                c0626q.p(false);
            }
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            C0627q0 A5 = c0626q.A();
            if (A5 == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            A5.f8191b |= 1;
            c0470u0.f6150c = A5;
            c0626q.b0(-1888182177);
            int size4 = arrayList.size();
            for (int i11 = 0; i11 < size4; i11++) {
                C0466t0 c0466t0 = (C0466t0) arrayList.get(i11);
                I2 i24 = (I2) c0466t0.a;
                C0873f c0873f2 = c0466t0.f6107b;
                c0626q.Z(1325010085, i24);
                c0873f2.d(AbstractC0874g.c(-1893791890, new J1.m(5, c0873f, i24), c0626q), c0626q, 6);
                c0626q.p(false);
            }
            c0626q.p(false);
            c0626q.p(z5);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.e1(i22, interfaceC1041r, c0873f, i6, 5);
        }
    }

    public static final void e(int i6, C0474v0 c0474v0, C0626q c0626q, C0873f c0873f, InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, o0.L l3, boolean z5) {
        o0.L l5;
        c0626q.d0(947208840);
        int i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6 | (c0626q.f(interfaceC1041r) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | PegdownExtensions.ANCHORLINKS | (c0626q.f(c0474v0) ? 16384 : 8192) | PegdownExtensions.SUPPRESS_ALL_HTML;
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                l3 = W1.a(S.x.f7494b, c0626q);
            } else {
                c0626q.V();
            }
            int i8 = i7 & (-7169);
            o0.L l6 = l3;
            c0626q.q();
            n((i8 & 14) | PegdownExtensions.SUPPRESS_ALL_HTML | (i8 & 112) | (i8 & 896) | (i8 & 57344) | 14155776, c0474v0, c0626q, c0873f, interfaceC1041r, interfaceC1193a, l6, z5);
            l5 = l6;
        } else {
            c0626q.V();
            l5 = l3;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0434l(interfaceC1193a, interfaceC1041r, z5, l5, c0474v0, c0873f, i6);
        }
    }

    public static final void f(InterfaceC1041r interfaceC1041r, float f6, final long j3, C0626q c0626q, final int i6, final int i7) {
        int i8;
        c0626q.d0(75144485);
        int i9 = i7 & 1;
        if (i9 != 0) {
            i8 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i8 = i6 | (c0626q.f(interfaceC1041r) ? 4 : 2);
        } else {
            i8 = i6;
        }
        int i10 = i7 & 2;
        if (i10 != 0) {
            i8 |= 48;
        } else if ((i6 & 48) == 0) {
            i8 |= c0626q.c(f6) ? 32 : 16;
        }
        int i11 = i8 | (c0626q.e(j3) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS);
        boolean z5 = true;
        if (c0626q.S(i11 & 1, (i11 & 147) != 146)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                if (i9 != 0) {
                    interfaceC1041r = C1038o.a;
                }
                if (i10 != 0) {
                    f6 = AbstractC0391a0.a;
                }
            } else {
                c0626q.V();
            }
            c0626q.q();
            InterfaceC1041r d6 = v.t0.d(interfaceC1041r.c(v.t0.a), f6);
            boolean z6 = (i11 & 112) == 32;
            if ((((i11 & 896) ^ 384) <= 256 || !c0626q.e(j3)) && (i11 & 384) != 256) {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object P5 = c0626q.P();
            if (z7 || P5 == C0616l.a) {
                P5 = new C0395b0(f6, 0, j3);
                c0626q.m0(P5);
            }
            AbstractC1464z.a(d6, (l4.c) P5, c0626q, 0);
        } else {
            c0626q.V();
        }
        final InterfaceC1041r interfaceC1041r2 = interfaceC1041r;
        final float f7 = f6;
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.c0
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    R1.f(InterfaceC1041r.this, f7, j3, (C0626q) obj, T.r.J(i6 | 1), i7);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final l4.InterfaceC1193a r20, h0.InterfaceC1041r r21, boolean r22, Q.C0474v0 r23, o0.L r24, final b0.C0873f r25, T.C0626q r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.R1.g(l4.a, h0.r, boolean, Q.v0, o0.L, b0.f, T.q, int, int):void");
    }

    public static final void h(int i6, C0474v0 c0474v0, C0626q c0626q, C0873f c0873f, InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, o0.L l3, boolean z5) {
        int i7;
        C0873f c0873f2;
        c0626q.d0(-1134296466);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(l3) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.f(c0474v0) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.f(null) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            c0626q.b0(977045485);
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new C1682j();
                c0626q.m0(P5);
            }
            C1682j c1682j = (C1682j) P5;
            c0626q.p(false);
            C0125m c0125m = D0.a;
            InterfaceC1041r c6 = interfaceC1041r.c(L0.a);
            long b5 = C0478w0.b();
            C1818y c1818y = v.t0.a;
            InterfaceC1041r c7 = AbstractC1464z.j(AbstractC1464z.f(l0.h.c(v.t0.k(c6, e1.h.b(b5), e1.h.a(b5)), l3), z5 ? c0474v0.a : c0474v0.f6160c, l3), c1682j, S1.a(S.l.f7374V, 7, 0L, false), z5, new P0.i(0), interfaceC1193a, 8).c(new R.J(new P2.D0(7)));
            F0.V d6 = AbstractC1806l.d(C1026c.f11790h, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l5 = c0626q.l();
            InterfaceC1041r c8 = AbstractC1024a.c(c0626q, c7);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l5, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c8, C0150g.f1926d);
            c0873f2 = c0873f;
            T.r.a(U.a.a(new o0.s(z5 ? c0474v0.f6159b : c0474v0.f6161d)), c0873f2, c0626q, ((i7 >> 15) & 112) | 8);
            c0626q.p(true);
        } else {
            c0873f2 = c0873f;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0482x0(interfaceC1041r, interfaceC1193a, z5, l3, c0474v0, c0873f2, i6);
        }
    }

    public static final void i(final InterfaceC1193a interfaceC1193a, final long j3, final C0456q1 c0456q1, final C1316c c1316c, final C0873f c0873f, C0626q c0626q, final int i6) {
        int i7;
        long j4;
        C0456q1 c0456q12;
        int i8;
        e1.m mVar;
        int i9;
        boolean z5;
        boolean z6;
        Object obj;
        c0626q.d0(766784632);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            j4 = j3;
            i7 |= c0626q.e(j4) ? 32 : 16;
        } else {
            j4 = j3;
        }
        if ((i6 & 384) == 0) {
            c0456q12 = c0456q1;
            i7 |= c0626q.f(c0456q12) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        } else {
            c0456q12 = c0456q1;
        }
        if ((i6 & 3072) == 0) {
            i7 |= (i6 & 4096) == 0 ? c0626q.f(c1316c) : c0626q.h(c1316c) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(c0873f) ? 16384 : 8192;
        }
        if (c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            View view = (View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f);
            InterfaceC0961c interfaceC0961c = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
            e1.m mVar2 = (e1.m) c0626q.j(AbstractC0204q0.f2364n);
            C0622o D4 = T.r.D(c0626q);
            T.X E5 = T.r.E(c0873f, c0626q);
            Object[] objArr = new Object[0];
            Object P5 = c0626q.P();
            Object obj2 = C0616l.a;
            if (P5 == obj2) {
                i8 = i7;
                P5 = new O.A(13);
                c0626q.m0(P5);
            } else {
                i8 = i7;
            }
            UUID uuid = (UUID) e0.l.e(objArr, (InterfaceC1193a) P5, c0626q, 48);
            Object P6 = c0626q.P();
            if (P6 == obj2) {
                P6 = T.r.p(c0626q);
                c0626q.m0(P6);
            }
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) P6;
            boolean f6 = c0626q.f(view) | c0626q.f(interfaceC0961c);
            Object P7 = c0626q.P();
            if (f6 || P7 == obj2) {
                mVar = mVar2;
                i9 = i8;
                z5 = true;
                z6 = false;
                T0 t02 = new T0(interfaceC1193a, c0456q12, j4, view, mVar, interfaceC0961c, uuid, c1316c, interfaceC1942y);
                C0873f c0873f2 = new C0873f(new V(E5, 1), true, -1051373467);
                O0 o02 = t02.f5522k;
                o02.setParentCompositionContext(D4);
                o02.f5452l.setValue(c0873f2);
                o02.f5453m = true;
                o02.d();
                c0626q.m0(t02);
                obj = t02;
            } else {
                mVar = mVar2;
                i9 = i8;
                z5 = true;
                z6 = false;
                obj = P7;
            }
            final T0 t03 = (T0) obj;
            boolean h3 = c0626q.h(t03);
            Object P8 = c0626q.P();
            if (h3 || P8 == obj2) {
                P8 = new C0056a(t03, 21);
                c0626q.m0(P8);
            }
            T.r.d(t03, (l4.c) P8, c0626q);
            int i10 = i9;
            boolean h6 = c0626q.h(t03) | ((i10 & 14) == 4 ? z5 : z6) | ((i10 & 896) == 256 ? z5 : z6) | ((i10 & 112) == 32 ? z5 : z6) | c0626q.d(mVar.ordinal());
            Object P9 = c0626q.P();
            if (h6 || P9 == obj2) {
                final e1.m mVar3 = mVar;
                P9 = new InterfaceC1193a() { // from class: Q.r1
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        T0.this.d(interfaceC1193a, c0456q1, j3, mVar3);
                        return X3.y.a;
                    }
                };
                c0626q.m0(P9);
            }
            T.r.j((InterfaceC1193a) P9, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: Q.s1
                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    R1.i(InterfaceC1193a.this, j3, c0456q1, c1316c, c0873f, (C0626q) obj3, T.r.J(i6 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    public static final void j(InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1646555525);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            m((View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f), (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h), interfaceC1193a, c0626q, (i7 << 6) & 896);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0458r0(i6, 0, interfaceC1193a);
        }
    }

    public static final void k(final InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, o0.L l3, final r rVar, C1417G c1417g, InterfaceC1802i0 interfaceC1802i0, final C0873f c0873f, C0626q c0626q, final int i6) {
        final InterfaceC1041r interfaceC1041r2;
        final boolean z6;
        final o0.L l5;
        final C1417G c1417g2;
        final InterfaceC1802i0 interfaceC1802i02;
        int i7;
        o0.L l6;
        InterfaceC1041r interfaceC1041r3;
        boolean z7;
        c0626q.d0(399974542);
        int i8 = i6 | 1456 | (c0626q.f(rVar) ? 16384 : 8192) | 113967104;
        if (c0626q.S(i8 & 1, (306783379 & i8) != 306783378)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                v.k0 k0Var = AbstractC0461s.a;
                o0.L a6 = W1.a(AbstractC0535b.f7247b, c0626q);
                float f6 = AbstractC0535b.f7248c;
                c0626q.b0(-112346942);
                long d6 = O.d(S.l.f7384j, c0626q);
                c0626q.p(false);
                C1417G c1417g3 = new C1417G(f6, new o0.N(d6));
                i7 = i8 & (-3677185);
                l6 = a6;
                interfaceC1802i02 = AbstractC0461s.a;
                c1417g2 = c1417g3;
                interfaceC1041r3 = C1038o.a;
                z7 = true;
            } else {
                c0626q.V();
                i7 = i8 & (-3677185);
                interfaceC1041r3 = interfaceC1041r;
                z7 = z5;
                l6 = l3;
                c1417g2 = c1417g;
                interfaceC1802i02 = interfaceC1802i0;
            }
            c0626q.q();
            b(interfaceC1193a, interfaceC1041r3, z7, l6, rVar, null, c1417g2, interfaceC1802i02, c0873f, c0626q, i7 & 2147483646, 0);
            l5 = l6;
            z6 = z7;
            interfaceC1041r2 = interfaceC1041r3;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            z6 = z5;
            l5 = l3;
            c1417g2 = c1417g;
            interfaceC1802i02 = interfaceC1802i0;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1041r2, z6, l5, rVar, c1417g2, interfaceC1802i02, c0873f, i6) { // from class: Q.x

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f6205e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f6206f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ o0.L f6207g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ r f6208h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ C1417G f6209i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1802i0 f6210j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ C0873f f6211k;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(805306375);
                    R1.k(InterfaceC1193a.this, this.f6205e, this.f6206f, this.f6207g, this.f6208h, this.f6209i, this.f6210j, this.f6211k, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void l(L2 l22, InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        C0607g0 c0607g0 = l22.f5361b;
        c0626q.d0(-1077081618);
        int i7 = (c0626q.f(interfaceC1041r) ? 32 : 16) | i6;
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            I2 i22 = (I2) c0607g0.getValue();
            InterfaceC0181f interfaceC0181f = (InterfaceC0181f) c0626q.j(AbstractC0204q0.a);
            boolean f6 = c0626q.f(i22) | c0626q.h(interfaceC0181f);
            Object P5 = c0626q.P();
            if (f6 || P5 == C0616l.a) {
                P5 = new F2(i22, interfaceC0181f, null);
                c0626q.m0(P5);
            }
            T.r.f(c0626q, i22, (l4.e) P5);
            d((I2) c0607g0.getValue(), interfaceC1041r, c0873f, c0626q, i7 & 1008);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.L(l22, interfaceC1041r, c0873f, i6);
        }
    }

    public static final void m(View view, InterfaceC0961c interfaceC0961c, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-1319522472);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(view) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC0961c) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            boolean h3 = c0626q.h(view) | ((i7 & 896) == 256);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0086p(14, view, interfaceC1193a);
                c0626q.m0(P5);
            }
            T.r.c(view, interfaceC0961c, (l4.c) P5, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.e1(view, interfaceC0961c, interfaceC1193a, i6, 4);
        }
    }

    public static final void n(int i6, C0474v0 c0474v0, C0626q c0626q, C0873f c0873f, InterfaceC1041r interfaceC1041r, InterfaceC1193a interfaceC1193a, o0.L l3, boolean z5) {
        int i7;
        C0873f c0873f2;
        c0626q.d0(-171935091);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(l3) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.f(c0474v0) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.f(null) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.f(null) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.h(c0873f) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if (c0626q.S(i7 & 1, (4793491 & i7) != 4793490)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = new P2.D0(3);
                c0626q.m0(P5);
            }
            InterfaceC1041r a6 = P0.n.a(interfaceC1041r, false, (l4.c) P5);
            c0873f2 = c0873f;
            int i8 = i7 & 8078;
            int i9 = i7 << 9;
            X2.b(interfaceC1193a, a6, z5, l3, z5 ? c0474v0.a : c0474v0.f6160c, z5 ? c0474v0.f6159b : c0474v0.f6161d, S.l.f7374V, null, null, AbstractC0874g.c(669231714, new E(c0873f2, 1), c0626q), c0626q, i8 | (234881024 & i9) | (i9 & 1879048192), 192);
        } else {
            c0873f2 = c0873f;
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0482x0(interfaceC1193a, interfaceC1041r, z5, l3, c0474v0, c0873f2, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final l4.InterfaceC1193a r23, h0.InterfaceC1041r r24, boolean r25, o0.L r26, Q.r r27, v.InterfaceC1802i0 r28, final l4.f r29, T.C0626q r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.R1.o(l4.a, h0.r, boolean, o0.L, Q.r, v.i0, l4.f, T.q, int, int):void");
    }

    public static B p(long j3, C0626q c0626q) {
        long b5 = O.b(j3, c0626q);
        long j4 = o0.s.f13481h;
        long c6 = o0.s.c(0.38f, b5);
        B s5 = s((N) c0626q.j(O.a));
        long j5 = j3 != 16 ? j3 : s5.a;
        if (b5 == 16) {
            b5 = s5.f5135b;
        }
        long j6 = b5;
        if (j4 == 16) {
            j4 = s5.f5136c;
        }
        long j7 = j4;
        if (c6 == 16) {
            c6 = s5.f5137d;
        }
        return new B(j5, j6, j7, c6);
    }

    public static C q(float f6, int i6) {
        if ((i6 & 1) != 0) {
            f6 = S.k.f7344b;
        }
        return new C(f6, S.k.f7352j, S.k.f7350h, S.k.f7351i, S.k.f7349g, S.k.f7347e);
    }

    public static N r(C0626q c0626q) {
        return (N) c0626q.j(O.a);
    }

    public static B s(N n3) {
        B b5 = n3.f5403Z;
        if (b5 != null) {
            return b5;
        }
        S.f fVar = S.k.a;
        B b6 = new B(O.c(n3, fVar), O.a(n3, O.c(n3, fVar)), o0.y.k(o0.s.c(S.k.f7348f, O.c(n3, S.k.f7346d)), O.c(n3, fVar)), o0.s.c(0.38f, O.a(n3, O.c(n3, fVar))));
        n3.f5403Z = b6;
        return b6;
    }

    public static t3 t(C0626q c0626q) {
        return (t3) c0626q.j(u3.a);
    }

    public static final C1327h0 u(S.p pVar, C0626q c0626q) {
        InterfaceC0471u1 interfaceC0471u1 = (InterfaceC0471u1) c0626q.j(E0.a);
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            ((C0467t1) interfaceC0471u1).getClass();
            C1327h0 c1327h0 = C0467t1.f6108b;
            AbstractC1276k.d(c1327h0, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>");
            return c1327h0;
        }
        if (ordinal == 1) {
            ((C0467t1) interfaceC0471u1).getClass();
            C1327h0 c1327h02 = C0467t1.f6109c;
            AbstractC1276k.d(c1327h02, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>");
            return c1327h02;
        }
        if (ordinal == 2) {
            ((C0467t1) interfaceC0471u1).getClass();
            C1327h0 c1327h03 = C0467t1.f6110d;
            AbstractC1276k.d(c1327h03, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>");
            return c1327h03;
        }
        if (ordinal == 3) {
            ((C0467t1) interfaceC0471u1).getClass();
            C1327h0 c1327h04 = C0467t1.f6111e;
            AbstractC1276k.d(c1327h04, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>");
            return c1327h04;
        }
        if (ordinal == 4) {
            ((C0467t1) interfaceC0471u1).getClass();
            C1327h0 c1327h05 = C0467t1.f6112f;
            AbstractC1276k.d(c1327h05, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>");
            return c1327h05;
        }
        if (ordinal != 5) {
            throw new RuntimeException();
        }
        ((C0467t1) interfaceC0471u1).getClass();
        C1327h0 c1327h06 = C0467t1.f6113g;
        AbstractC1276k.d(c1327h06, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>");
        return c1327h06;
    }
}
