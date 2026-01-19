package S2;

import D.C0086p;
import I0.AbstractC0204q0;
import Q.C0398c;
import Q.f3;
import S0.AbstractC0552n;
import S0.C0542d;
import S0.C0543e;
import S0.C0545g;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import b0.C0873f;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.html.Attribute;
import d1.C0934a;
import e1.InterfaceC0961c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1316c;
import o0.C1389K;

/* loaded from: classes.dex */
public abstract class D0 {
    public static final long a = s4.j.z(16);

    static {
        AbstractC1276k.e(Pattern.compile("^\\s*(-{3,}|\\*{3,}|_{3,})\\s*$"), "compile(...)");
    }

    public static final void a(C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(1796359669);
        if (c0626q.S(i6 & 1, (i6 & 147) != 146)) {
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = AbstractC1318d.a(S.l.f7374V);
                c0626q.m0(P5);
            }
            C1316c c1316c = (C1316c) P5;
            Object P6 = c0626q.P();
            if (P6 == obj) {
                P6 = AbstractC1318d.a(S.l.f7374V);
                c0626q.m0(P6);
            }
            C1316c c1316c2 = (C1316c) P6;
            boolean h3 = c0626q.h(c1316c) | c0626q.h(c1316c2);
            Object P7 = c0626q.P();
            if (h3 || P7 == obj) {
                P7 = new x0(c1316c, c1316c2, null);
                c0626q.m0(P7);
            }
            T.r.f(c0626q, X3.y.a, (l4.e) P7);
            boolean h6 = c0626q.h(c1316c) | c0626q.h(c1316c2);
            Object P8 = c0626q.P();
            if (h6 || P8 == obj) {
                P8 = new C0086p(24, c1316c, c1316c2);
                c0626q.m0(P8);
            }
            c0873f.d(o0.y.o(C1038o.a, (l4.c) P8), c0626q, 48);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0398c(c0873f, i6, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Iterable] */
    public static final void b(final C0545g c0545g, final S0.P p5, final InterfaceC1041r interfaceC1041r, final boolean z5, final boolean z6, int i6, float f6, C0626q c0626q, final int i7) {
        int i8;
        final int i9;
        final float f7;
        int f8;
        Object arrayList;
        S0.P p6;
        o0 o0Var;
        Object obj;
        C0545g i10;
        int i11;
        int i12;
        float f9;
        S0.P p7;
        C0545g c0545g2 = c0545g;
        AbstractC1276k.f(c0545g2, "annotatedText");
        String str = c0545g2.f7630e;
        AbstractC1276k.f(p5, Attribute.STYLE_ATTR);
        c0626q.d0(716480863);
        if ((i7 & 6) == 0) {
            i8 = (c0626q.f(c0545g2) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0626q.f(p5) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0626q.g(z6) ? 16384 : 8192;
        }
        int i13 = i8 | 1769472;
        if ((12582912 & i7) == 0) {
            i13 |= c0626q.d(TableCell.NOT_TRACKED) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if ((100663296 & i7) == 0) {
            i13 |= c0626q.d(1) ? PegdownExtensions.MULTI_LINE_IMAGE_URLS : PegdownExtensions.TOC;
        }
        if ((805306368 & i7) == 0) {
            i13 |= c0626q.g(true) ? PegdownExtensions.NOT_USED : PegdownExtensions.FORCELISTITEMPARA;
        }
        if (c0626q.S(i13 & 1, (306783379 & i13) != 306783378)) {
            int i14 = i13 >> 3;
            S0.P g3 = g(p5, c0626q, i14 & 14);
            if (!z5 || str.length() == 0) {
                int i15 = i13;
                c0626q.b0(-1305506324);
                final float f10 = 0.12f;
                f3.c(c0545g, interfaceC1041r, 0L, 0L, 0L, 0L, 1, true, TableCell.NOT_TRACKED, 0, null, null, g3, c0626q, (i15 & 14) | (i14 & 112), ((i15 >> 18) & 8064) | ((i15 >> 9) & 57344), 233468);
                c0626q.p(false);
                C0627q0 t5 = c0626q.t();
                if (t5 != null) {
                    t5.f8193d = new l4.e() { // from class: S2.p0
                        @Override // l4.e
                        public final Object m(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            D0.b(C0545g.this, p5, interfaceC1041r, z5, z6, 240, f10, (C0626q) obj2, T.r.J(i7 | 1));
                            return X3.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            c0626q.b0(-1309812317);
            c0626q.p(false);
            if (z6) {
                c0626q.b0(-1305229248);
                c0626q.p(false);
                f8 = 0;
            } else {
                c0626q.b0(1343369420);
                f8 = f(str, c0626q, 0);
                c0626q.p(false);
            }
            float e6 = e(g3, 0.12f, c0626q);
            int i16 = i13 & 14;
            boolean z7 = ((i16 ^ 6) > 4 && c0626q.f(c0545g2)) || (i13 & 6) == 4;
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z7 || P5 == c0602e) {
                int length = str.length();
                P5 = Y3.v.f9812c;
                if (length != 0) {
                    List h3 = h(str);
                    List a6 = c0545g2.a(length);
                    ArrayList arrayList2 = new ArrayList(Y3.n.Z(h3, 10));
                    Iterator it = h3.iterator();
                    while (it.hasNext()) {
                        C0575j c0575j = (C0575j) it.next();
                        Iterator it2 = it;
                        int i17 = c0575j.f7800c;
                        String str2 = c0575j.f7799b;
                        int i18 = i13;
                        int i19 = c0575j.f7801d;
                        if (i17 >= i19) {
                            arrayList = P5;
                        } else {
                            ArrayList arrayList3 = c0545g2.f7631f;
                            Object r7 = arrayList3;
                            if (arrayList3 == null) {
                                r7 = P5;
                            }
                            arrayList = new ArrayList();
                            Iterator it3 = r7.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                C0543e c0543e = (C0543e) it3.next();
                                int i20 = f8;
                                int f11 = AbstractC1117a.f(c0543e.f7626b, i17, i19);
                                float f12 = e6;
                                int f13 = AbstractC1117a.f(c0543e.f7627c, i17, i19);
                                if (f11 < f13) {
                                    p6 = g3;
                                    o0Var = new o0((S0.G) c0543e.a, f11, f13);
                                } else {
                                    p6 = g3;
                                    o0Var = null;
                                }
                                if (o0Var != null) {
                                    arrayList.add(o0Var);
                                }
                                it3 = it4;
                                f8 = i20;
                                e6 = f12;
                                g3 = p6;
                            }
                        }
                        int i21 = f8;
                        float f14 = e6;
                        S0.P p8 = g3;
                        Iterator it5 = a6.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it5.next();
                            C0543e c0543e2 = (C0543e) obj;
                            if (c0543e2.f7626b <= i17 && c0543e2.f7627c >= i19) {
                                break;
                            }
                        }
                        C0543e c0543e3 = (C0543e) obj;
                        AbstractC0552n abstractC0552n = c0543e3 != null ? (AbstractC0552n) c0543e3.a : null;
                        if (arrayList.isEmpty() && abstractC0552n == null) {
                            i10 = new C0545g(str2);
                        } else {
                            C0542d c0542d = new C0542d();
                            StringBuilder sb = c0542d.f7623c;
                            int length2 = sb.length();
                            if (abstractC0552n != null) {
                                int g6 = c0542d.g(abstractC0552n);
                                try {
                                    c0542d.e(str2);
                                } finally {
                                    c0542d.f(g6);
                                }
                            } else {
                                c0542d.e(str2);
                            }
                            int length3 = sb.length();
                            if (!arrayList.isEmpty()) {
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    o0 o0Var2 = (o0) it6.next();
                                    int i22 = (o0Var2.f7836b - i17) + length2;
                                    Iterator it7 = it6;
                                    int i23 = (o0Var2.f7837c - i17) + length2;
                                    if (i22 < i23 && i23 <= length3) {
                                        c0542d.a(o0Var2.a, i22, i23);
                                    }
                                    it6 = it7;
                                }
                            }
                            i10 = c0542d.i();
                        }
                        arrayList2.add(new C0557a(c0575j.a, str2, i10, c0575j.f7800c, c0575j.f7801d));
                        c0545g2 = c0545g;
                        it = it2;
                        i13 = i18;
                        f8 = i21;
                        e6 = f14;
                        g3 = p8;
                    }
                    P5 = arrayList2;
                }
                i11 = i13;
                i12 = f8;
                f9 = e6;
                p7 = g3;
                c0626q.m0(P5);
            } else {
                i11 = i13;
                i12 = f8;
                f9 = e6;
                p7 = g3;
            }
            List list = (List) P5;
            boolean z8 = i16 == 4;
            Object P6 = c0626q.P();
            if (z8 || P6 == c0602e) {
                P6 = i(c0545g);
                c0626q.m0(P6);
            }
            c((C0545g) P6, list, p7, interfaceC1041r, i12, f9, c0626q, ((i11 << 3) & 7168) | (i11 & 458752) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192));
            i9 = 240;
            f7 = 0.12f;
        } else {
            c0626q.V();
            i9 = i6;
            f7 = f6;
        }
        C0627q0 t6 = c0626q.t();
        if (t6 != null) {
            t6.f8193d = new l4.e() { // from class: S2.q0
                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    D0.b(C0545g.this, p5, interfaceC1041r, z5, z6, i9, f7, (C0626q) obj2, T.r.J(i7 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0349, code lost:
    
        if (r4.f7599b.a.a() != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x023a, code lost:
    
        if (r2.d(240) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0464, code lost:
    
        if (r2 == r0) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [T.q] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final S0.C0545g r40, final java.util.List r41, final S0.P r42, final h0.InterfaceC1041r r43, final int r44, final float r45, T.C0626q r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.D0.c(S0.g, java.util.List, S0.P, h0.r, int, float, T.q, int):void");
    }

    public static final void d(final String str, final S0.P p5, final InterfaceC1041r interfaceC1041r, final boolean z5, int i6, float f6, int i7, int i8, boolean z6, C0626q c0626q, final int i9) {
        final int i10;
        final float f7;
        final int i11;
        final int i12;
        final boolean z7;
        AbstractC1276k.f(str, "text");
        c0626q.d0(-1442468103);
        int i13 = (i9 & 6) == 0 ? (c0626q.f(str) ? 4 : 2) | i9 : i9;
        if ((i9 & 48) == 0) {
            i13 |= c0626q.f(p5) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i13 |= c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i9 & 3072) == 0) {
            i13 |= c0626q.g(z5) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        int i14 = i13 | 920346624;
        if (c0626q.S(i14 & 1, (306783379 & i14) != 306783378)) {
            int i15 = i14 >> 3;
            S0.P g3 = g(p5, c0626q, i15 & 14);
            if (!z5 || str.length() == 0) {
                c0626q.b0(-1418935781);
                final float f8 = 0.12f;
                f3.b(str, interfaceC1041r, 0L, 0L, null, 0L, null, 0L, 1, true, TableCell.NOT_TRACKED, 0, g3, c0626q, (i14 & 14) | (i15 & 112), ((i14 >> 18) & 8064) | ((i14 >> 9) & 57344), 102396);
                c0626q.p(false);
                C0627q0 t5 = c0626q.t();
                if (t5 != null) {
                    t5.f8193d = new l4.e() { // from class: S2.r0
                        @Override // l4.e
                        public final Object m(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            D0.d(str, p5, interfaceC1041r, z5, 240, f8, TableCell.NOT_TRACKED, 1, true, (C0626q) obj, T.r.J(i9 | 1));
                            return X3.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            c0626q.b0(-1421840791);
            c0626q.p(false);
            c0626q.b0(1062615448);
            int f9 = f(str, c0626q, i14 & 14);
            c0626q.p(false);
            boolean z8 = true;
            float e6 = e(g3, 0.12f, c0626q);
            int i16 = i14 & 14;
            boolean z9 = i16 == 4;
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z9 || P5 == c0602e) {
                P5 = i(new C0545g(str));
                c0626q.m0(P5);
            }
            C0545g c0545g = (C0545g) P5;
            if (((i16 ^ 6) <= 4 || !c0626q.f(str)) && (i14 & 6) != 4) {
                z8 = false;
            }
            Object P6 = c0626q.P();
            if (z8 || P6 == c0602e) {
                if (str.length() == 0) {
                    P6 = Y3.v.f9812c;
                } else {
                    List<C0575j> h3 = h(str);
                    ArrayList arrayList = new ArrayList(Y3.n.Z(h3, 10));
                    for (C0575j c0575j : h3) {
                        int i17 = c0575j.a;
                        String str2 = c0575j.f7799b;
                        arrayList.add(new C0557a(i17, str2, new C0545g(str2), c0575j.f7800c, c0575j.f7801d));
                    }
                    P6 = arrayList;
                }
                c0626q.m0(P6);
            }
            c(c0545g, (List) P6, g3, interfaceC1041r, f9, e6, c0626q, ((i14 << 3) & 7168) | (458752 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192));
            i10 = 240;
            f7 = 0.12f;
            i11 = TableCell.NOT_TRACKED;
            i12 = 1;
            z7 = true;
        } else {
            c0626q.V();
            i10 = i6;
            f7 = f6;
            i11 = i7;
            i12 = i8;
            z7 = z6;
        }
        C0627q0 t6 = c0626q.t();
        if (t6 != null) {
            t6.f8193d = new l4.e() { // from class: S2.s0
                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    D0.d(str, p5, interfaceC1041r, z5, i10, f7, i11, i12, z7, (C0626q) obj, T.r.J(i9 | 1));
                    return X3.y.a;
                }
            };
        }
    }

    public static final float e(S0.P p5, float f6, C0626q c0626q) {
        long j3;
        if ((p5.a.f7571b & 1095216660480L) == 0) {
            c0626q.b0(2126831264);
            j3 = ((S0.P) c0626q.j(f3.a)).a.f7571b;
            if ((1095216660480L & j3) == 0) {
                j3 = a;
            }
            c0626q.p(false);
        } else {
            c0626q.b0(2126977491);
            c0626q.p(false);
            j3 = p5.a.f7571b;
        }
        return ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).u0(j3) * f6;
    }

    public static final int f(String str, C0626q c0626q, int i6) {
        Object P5 = c0626q.P();
        C0602e c0602e = C0616l.a;
        if (P5 == c0602e) {
            P5 = T.r.A(FlexmarkHtmlConverter.DEFAULT_NODE);
            c0626q.m0(P5);
        }
        T.X x5 = (T.X) P5;
        int hashCode = u4.u.D(str, (String) x5.getValue(), false) ? 0 : str.hashCode();
        boolean z5 = (((i6 & 14) ^ 6) > 4 && c0626q.f(str)) || (i6 & 6) == 4;
        Object P6 = c0626q.P();
        if (z5 || P6 == c0602e) {
            P6 = new C0(x5, null, str);
            c0626q.m0(P6);
        }
        T.r.f(c0626q, str, (l4.e) P6);
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r4 == T.C0616l.a) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final S0.P g(S0.P r19, T.C0626q r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            T.B r2 = Q.f3.a
            java.lang.Object r2 = r1.j(r2)
            S0.P r2 = (S0.P) r2
            T.B r3 = Q.U.a
            java.lang.Object r3 = r1.j(r3)
            o0.s r3 = (o0.s) r3
            long r5 = r3.a
            r3 = r21 & 14
            r3 = r3 ^ 6
            r4 = 4
            if (r3 <= r4) goto L23
            boolean r3 = r1.f(r0)
            if (r3 != 0) goto L27
        L23:
            r3 = r21 & 6
            if (r3 != r4) goto L29
        L27:
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            boolean r4 = r1.f(r2)
            r3 = r3 | r4
            boolean r4 = r1.e(r5)
            r3 = r3 | r4
            java.lang.Object r4 = r1.P()
            if (r3 != 0) goto L3e
            T.e r3 = T.C0616l.a
            if (r4 != r3) goto L65
        L3e:
            S0.P r4 = r2.d(r0)
            long r2 = r4.b()
            long r7 = o0.s.f13481h
            boolean r0 = o0.s.d(r2, r7)
            if (r0 == 0) goto L62
            r17 = 0
            r18 = 16777214(0xfffffe, float:2.3509884E-38)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            S0.P r0 = S0.P.a(r4, r5, r7, r9, r10, r11, r12, r14, r15, r17, r18)
            r4 = r0
        L62:
            r1.m0(r4)
        L65:
            S0.P r4 = (S0.P) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.D0.g(S0.P, T.q, int):S0.P");
    }

    public static final List h(String str) {
        if (str.length() == 0) {
            return Y3.v.f9812c;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        characterInstance.setText(str);
        ArrayList arrayList = new ArrayList();
        int first = characterInstance.first();
        int next = characterInstance.next();
        int i6 = 0;
        while (true) {
            int i7 = next;
            int i8 = first;
            first = i7;
            if (first == -1) {
                return arrayList;
            }
            String substring = str.substring(i8, first);
            AbstractC1276k.e(substring, "substring(...)");
            arrayList.add(new C0575j(i6, i8, first, substring));
            i6++;
            next = characterInstance.next();
        }
    }

    public static final C0545g i(C0545g c0545g) {
        if (c0545g.f7630e.length() == 0) {
            return c0545g;
        }
        C0542d c0542d = new C0542d();
        c0542d.c(c0545g);
        long j3 = o0.s.f13480g;
        c0542d.a(new S0.G(j3, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, j3, d1.l.f11393b, (C1389K) null, 59390), 0, c0542d.f7623c.length());
        return c0542d.i();
    }
}
