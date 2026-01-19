package m0;

import F0.AbstractC0137z;
import F0.InterfaceC0134w;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.J;
import H0.i0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import h0.InterfaceC1041r;
import m4.AbstractC1276k;
import n0.C1354c;
import r.C1609u;
import y.C1973m;
import y.C1977q;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1249d {
    /* JADX WARN: Type inference failed for: r0v9, types: [m4.w, java.lang.Object] */
    public static final Object A(C c6, int i6, l4.c cVar) {
        int i7;
        int i8;
        Object obj;
        AbstractC1040q abstractC1040q;
        y.r Q02;
        C0149f0 c0149f0;
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q2 = c6.f11806c.f11810h;
        J v5 = AbstractC0157l.v(c6);
        loop0: while (true) {
            i7 = 0;
            i8 = 1;
            obj = null;
            if (v5 == null) {
                abstractC1040q = null;
                break;
            }
            if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                while (abstractC1040q2 != null) {
                    if ((abstractC1040q2.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        abstractC1040q = abstractC1040q2;
                        V.e eVar = null;
                        while (abstractC1040q != null) {
                            if (abstractC1040q instanceof C) {
                                break loop0;
                            }
                            if ((abstractC1040q.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q instanceof AbstractC0156k)) {
                                int i9 = 0;
                                for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                    if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC1040q = abstractC1040q3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q != null) {
                                                eVar.b(abstractC1040q);
                                                abstractC1040q = null;
                                            }
                                            eVar.b(abstractC1040q3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC1040q = AbstractC0157l.e(eVar);
                        }
                    }
                    abstractC1040q2 = abstractC1040q2.f11810h;
                }
            }
            v5 = v5.v();
            abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
        }
        C c7 = (C) abstractC1040q;
        if ((c7 != null && AbstractC1276k.b(c7.Q0(), c6.Q0())) || (Q02 = c6.Q0()) == null) {
            return null;
        }
        int i10 = 5;
        if (i6 != 5) {
            i10 = 6;
            if (i6 != 6) {
                i10 = 3;
                if (i6 != 3) {
                    i10 = 4;
                    if (i6 != 4) {
                        if (i6 == 1) {
                            i8 = 2;
                        } else if (i6 != 2) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                        }
                        if (Q02.f15934r.a() > 0 || !Q02.f15934r.d() || !Q02.f11819q) {
                            return cVar.f(y.r.f15933u);
                        }
                        int b5 = Q02.N0(i8) ? Q02.f15934r.b() : Q02.f15934r.e();
                        Object obj2 = new Object();
                        C1609u c1609u = Q02.f15935s;
                        c1609u.getClass();
                        C1973m c1973m = new C1973m(b5, b5);
                        c1609u.a.b(c1973m);
                        obj2.f12973c = c1973m;
                        int c8 = Q02.f15934r.c() * 2;
                        int a = Q02.f15934r.a();
                        if (c8 > a) {
                            c8 = a;
                        }
                        while (obj == null && Q02.M0((C1973m) obj2.f12973c, i8) && i7 < c8) {
                            C1973m c1973m2 = (C1973m) obj2.f12973c;
                            int i11 = c1973m2.a;
                            int i12 = c1973m2.f15892b;
                            if (Q02.N0(i8)) {
                                i12++;
                            } else {
                                i11--;
                            }
                            C1609u c1609u2 = Q02.f15935s;
                            c1609u2.getClass();
                            C1973m c1973m3 = new C1973m(i11, i12);
                            c1609u2.a.b(c1973m3);
                            Q02.f15935s.a.j((C1973m) obj2.f12973c);
                            obj2.f12973c = c1973m3;
                            i7++;
                            AbstractC0157l.v(Q02).k();
                            obj = cVar.f(new C1977q(Q02, obj2, i8));
                        }
                        Q02.f15935s.a.j((C1973m) obj2.f12973c);
                        AbstractC0157l.v(Q02).k();
                        return obj;
                    }
                }
            }
        }
        i8 = i10;
        if (Q02.f15934r.a() > 0) {
        }
        return cVar.f(y.r.f15933u);
    }

    public static final boolean B(int i6, c.f fVar, C c6, C1354c c1354c) {
        C g3;
        V.e eVar = new V.e(new C[16]);
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitChildren called on an unattached node");
        }
        V.e eVar2 = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q = c6.f11806c;
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i;
        if (abstractC1040q2 == null) {
            AbstractC0157l.b(eVar2, abstractC1040q);
        } else {
            eVar2.b(abstractC1040q2);
        }
        while (true) {
            int i7 = eVar2.f8761f;
            if (i7 == 0) {
                break;
            }
            AbstractC1040q abstractC1040q3 = (AbstractC1040q) eVar2.k(i7 - 1);
            if ((abstractC1040q3.f11809g & PegdownExtensions.ANCHORLINKS) == 0) {
                AbstractC0157l.b(eVar2, abstractC1040q3);
            } else {
                while (true) {
                    if (abstractC1040q3 == null) {
                        break;
                    }
                    if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        V.e eVar3 = null;
                        while (abstractC1040q3 != null) {
                            if (abstractC1040q3 instanceof C) {
                                C c7 = (C) abstractC1040q3;
                                if (c7.f11819q) {
                                    eVar.b(c7);
                                }
                            } else if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q3 instanceof AbstractC0156k)) {
                                int i8 = 0;
                                for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q3).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                    if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC1040q3 = abstractC1040q4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q3 != null) {
                                                eVar3.b(abstractC1040q3);
                                                abstractC1040q3 = null;
                                            }
                                            eVar3.b(abstractC1040q4);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC1040q3 = AbstractC0157l.e(eVar3);
                        }
                    } else {
                        abstractC1040q3 = abstractC1040q3.f11811i;
                    }
                }
            }
        }
        while (eVar.f8761f != 0 && (g3 = g(eVar, c1354c, i6)) != null) {
            if (g3.O0().a) {
                return ((Boolean) fVar.f(g3)).booleanValue();
            }
            if (l(i6, fVar, g3, c1354c)) {
                return true;
            }
            eVar.j(g3);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean C(m0.C r12, m0.C r13, int r14, c.f r15) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.AbstractC1249d.C(m0.C, m0.C, int, c.f):boolean");
    }

    public static final Boolean D(int i6, c.f fVar, C c6, C1354c c1354c) {
        int ordinal = c6.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C n3 = n(c6);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n3.R0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean D4 = D(i6, fVar, n3, c1354c);
                        if (!AbstractC1276k.b(D4, Boolean.FALSE)) {
                            return D4;
                        }
                        if (c1354c == null) {
                            if (n3.R0() != EnumC1245A.f12869e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C f6 = f(n3);
                            if (f6 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c1354c = i(f6);
                        }
                        return Boolean.valueOf(l(i6, fVar, c6, c1354c));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new RuntimeException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c1354c == null) {
                    c1354c = i(n3);
                }
                return Boolean.valueOf(l(i6, fVar, c6, c1354c));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c6.O0().a ? (Boolean) fVar.f(c6) : c1354c == null ? Boolean.valueOf(h(c6, i6, fVar)) : Boolean.valueOf(B(i6, fVar, c6, c1354c));
                }
                throw new RuntimeException();
            }
        }
        return Boolean.valueOf(h(c6, i6, fVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(m0.C r7, c.f r8) {
        /*
            m0.A r0 = r7.R0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = y(r7, r8)
            if (r0 != 0) goto L7d
            m0.u r0 = r7.O0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.f(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            N0.e r7 = new N0.e
            r7.<init>()
            throw r7
        L37:
            m0.C r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            m0.A r6 = r0.R0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            N0.e r7 = new N0.e
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            m0.u r7 = r0.O0()
            boolean r7 = r7.a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.f(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = y(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.AbstractC1249d.a(m0.C, c.f):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.f13296c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= S.l.f7374V) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.f13297d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.f13295b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(n0.C1354c r18, n0.C1354c r19, n0.C1354c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.f13295b
            float r6 = r2.f13297d
            float r7 = r2.a
            float r2 = r2.f13296c
            float r8 = r0.f13297d
            float r9 = r0.f13295b
            float r10 = r0.f13296c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto La3
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto La3
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L9c
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L9c
            goto L4a
        L44:
            if (r3 != r13) goto L9d
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L9c
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f13296c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f13297d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L96
            float r1 = r1.f13295b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L9c:
            return r18
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        La3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.AbstractC1249d.b(n0.c, n0.c, n0.c, int):boolean");
    }

    public static final boolean c(int i6, C1354c c1354c, C1354c c1354c2) {
        if (i6 == 3 || i6 == 4) {
            return c1354c.f13297d > c1354c2.f13295b && c1354c.f13295b < c1354c2.f13297d;
        }
        if (i6 == 5 || i6 == 6) {
            return c1354c.f13296c > c1354c2.a && c1354c.a < c1354c2.f13296c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean d(C c6, boolean z5) {
        int ordinal = c6.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C n3 = n(c6);
                if (!(n3 != null ? d(n3, z5) : true)) {
                    return false;
                }
                c6.N0(EnumC1245A.f12869e, EnumC1245A.f12870f);
                return true;
            }
            if (ordinal == 2) {
                return z5;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
        }
        return true;
    }

    public static final void e(C c6, V.e eVar) {
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitChildren called on an unattached node");
        }
        V.e eVar2 = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q = c6.f11806c;
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i;
        if (abstractC1040q2 == null) {
            AbstractC0157l.b(eVar2, abstractC1040q);
        } else {
            eVar2.b(abstractC1040q2);
        }
        while (true) {
            int i6 = eVar2.f8761f;
            if (i6 == 0) {
                return;
            }
            AbstractC1040q abstractC1040q3 = (AbstractC1040q) eVar2.k(i6 - 1);
            if ((abstractC1040q3.f11809g & PegdownExtensions.ANCHORLINKS) == 0) {
                AbstractC0157l.b(eVar2, abstractC1040q3);
            } else {
                while (true) {
                    if (abstractC1040q3 == null) {
                        break;
                    }
                    if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        V.e eVar3 = null;
                        while (abstractC1040q3 != null) {
                            if (abstractC1040q3 instanceof C) {
                                C c7 = (C) abstractC1040q3;
                                if (c7.f11819q && !AbstractC0157l.v(c7).f1732U) {
                                    if (c7.O0().a) {
                                        eVar.b(c7);
                                    } else {
                                        e(c7, eVar);
                                    }
                                }
                            } else if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q3 instanceof AbstractC0156k)) {
                                int i7 = 0;
                                for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q3).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                    if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            abstractC1040q3 = abstractC1040q4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q3 != null) {
                                                eVar3.b(abstractC1040q3);
                                                abstractC1040q3 = null;
                                            }
                                            eVar3.b(abstractC1040q4);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC1040q3 = AbstractC0157l.e(eVar3);
                        }
                    } else {
                        abstractC1040q3 = abstractC1040q3.f11811i;
                    }
                }
            }
        }
    }

    public static final C f(C c6) {
        C h3 = ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).h();
        if (h3 == null || !h3.f11819q) {
            return null;
        }
        return h3;
    }

    public static final C g(V.e eVar, C1354c c1354c, int i6) {
        C1354c i7;
        if (i6 == 3) {
            i7 = c1354c.i((c1354c.f13296c - c1354c.a) + 1, S.l.f7374V);
        } else if (i6 == 4) {
            i7 = c1354c.i(-((c1354c.f13296c - c1354c.a) + 1), S.l.f7374V);
        } else if (i6 == 5) {
            i7 = c1354c.i(S.l.f7374V, (c1354c.f13297d - c1354c.f13295b) + 1);
        } else {
            if (i6 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            i7 = c1354c.i(S.l.f7374V, -((c1354c.f13297d - c1354c.f13295b) + 1));
        }
        Object[] objArr = eVar.f8759c;
        int i8 = eVar.f8761f;
        C c6 = null;
        for (int i9 = 0; i9 < i8; i9++) {
            C c7 = (C) objArr[i9];
            if (r(c7)) {
                C1354c i10 = i(c7);
                if (o(i10, i7, c1354c, i6)) {
                    c6 = c7;
                    i7 = i10;
                }
            }
        }
        return c6;
    }

    public static final boolean h(C c6, int i6, l4.c cVar) {
        C1354c c1354c;
        V.e eVar = new V.e(new C[16]);
        e(c6, eVar);
        int i7 = eVar.f8761f;
        if (i7 <= 1) {
            C c7 = (C) (i7 == 0 ? null : eVar.f8759c[0]);
            if (c7 != null) {
                return ((Boolean) cVar.f(c7)).booleanValue();
            }
        } else {
            if (i6 == 7) {
                i6 = 4;
            }
            if (i6 == 4 || i6 == 6) {
                C1354c i8 = i(c6);
                float f6 = i8.a;
                float f7 = i8.f13295b;
                c1354c = new C1354c(f6, f7, f6, f7);
            } else {
                if (i6 != 3 && i6 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C1354c i9 = i(c6);
                float f8 = i9.f13296c;
                float f9 = i9.f13297d;
                c1354c = new C1354c(f8, f9, f8, f9);
            }
            C g3 = g(eVar, c1354c, i6);
            if (g3 != null) {
                return ((Boolean) cVar.f(g3)).booleanValue();
            }
        }
        return false;
    }

    public static final C1354c i(C c6) {
        i0 i0Var;
        if (c6.f11819q && (i0Var = c6.f11813k) != null) {
            InterfaceC0134w h3 = AbstractC0137z.h(i0Var);
            if (!h3.j()) {
                h3 = null;
            }
            if (h3 != null) {
                return c6.P0(h3);
            }
        }
        return C1354c.f13294e;
    }

    public static final InterfaceC1041r j(InterfaceC1041r interfaceC1041r, w wVar) {
        return interfaceC1041r.c(new x(wVar));
    }

    public static final boolean k(C c6, c.f fVar) {
        int ordinal = c6.R0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C n3 = n(c6);
                if (n3 != null) {
                    return k(n3, fVar) || m(c6, n3, 1, fVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c6.O0().a ? ((Boolean) fVar.f(c6)).booleanValue() : z(c6, fVar);
                }
                throw new RuntimeException();
            }
        }
        return z(c6, fVar);
    }

    public static final boolean l(int i6, c.f fVar, C c6, C1354c c1354c) {
        if (B(i6, fVar, c6, c1354c)) {
            return true;
        }
        Boolean bool = (Boolean) A(c6, i6, new E(((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).h(), c6, c1354c, i6, fVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(C c6, C c7, int i6, c.f fVar) {
        if (C(c6, c7, i6, fVar)) {
            return true;
        }
        Boolean bool = (Boolean) A(c6, i6, new E(((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).h(), c6, c7, i6, fVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m0.C n(m0.C r8) {
        /*
            h0.q r0 = r8.f11806c
            boolean r0 = r0.f11819q
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            E0.a.b(r0)
        L10:
            V.e r0 = new V.e
            r2 = 16
            h0.q[] r3 = new h0.AbstractC1040q[r2]
            r0.<init>(r3)
            h0.q r8 = r8.f11806c
            h0.q r3 = r8.f11811i
            if (r3 != 0) goto L23
            H0.AbstractC0157l.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f8761f
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            h0.q r8 = (h0.AbstractC1040q) r8
            int r3 = r8.f11809g
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            H0.AbstractC0157l.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f11808f
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof m0.C
            r5 = 1
            if (r4 == 0) goto L6e
            m0.C r8 = (m0.C) r8
            h0.q r4 = r8.f11806c
            boolean r4 = r4.f11819q
            if (r4 == 0) goto La4
            m0.A r4 = r8.R0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            N0.e r8 = new N0.e
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f11808f
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof H0.AbstractC0156k
            if (r4 == 0) goto La4
            r4 = r8
            H0.k r4 = (H0.AbstractC0156k) r4
            h0.q r4 = r4.f1964s
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f11808f
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            V.e r3 = new V.e
            h0.q[] r7 = new h0.AbstractC1040q[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.b(r8)
            r8 = r1
        L9b:
            r3.b(r4)
        L9e:
            h0.q r4 = r4.f11811i
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            h0.q r8 = H0.AbstractC0157l.e(r3)
            goto L45
        La9:
            h0.q r8 = r8.f11811i
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.AbstractC1249d.n(m0.C):m0.C");
    }

    public static final boolean o(C1354c c1354c, C1354c c1354c2, C1354c c1354c3, int i6) {
        if (!p(i6, c1354c, c1354c3)) {
            return false;
        }
        if (p(i6, c1354c2, c1354c3) && !b(c1354c3, c1354c, c1354c2, i6)) {
            return !b(c1354c3, c1354c2, c1354c, i6) && q(i6, c1354c3, c1354c) < q(i6, c1354c3, c1354c2);
        }
        return true;
    }

    public static final boolean p(int i6, C1354c c1354c, C1354c c1354c2) {
        if (i6 == 3) {
            float f6 = c1354c2.f13296c;
            float f7 = c1354c2.a;
            float f8 = c1354c.f13296c;
            return (f6 > f8 || f7 >= f8) && f7 > c1354c.a;
        }
        if (i6 == 4) {
            float f9 = c1354c2.a;
            float f10 = c1354c2.f13296c;
            float f11 = c1354c.a;
            return (f9 < f11 || f10 <= f11) && f10 < c1354c.f13296c;
        }
        if (i6 == 5) {
            float f12 = c1354c2.f13297d;
            float f13 = c1354c2.f13295b;
            float f14 = c1354c.f13297d;
            return (f12 > f14 || f13 >= f14) && f13 > c1354c.f13295b;
        }
        if (i6 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f15 = c1354c2.f13295b;
        float f16 = c1354c2.f13297d;
        float f17 = c1354c.f13295b;
        return (f15 < f17 || f16 <= f17) && f16 < c1354c.f13297d;
    }

    public static final long q(int i6, C1354c c1354c, C1354c c1354c2) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (i6 == 3) {
            f6 = c1354c.a;
            f7 = c1354c2.f13296c;
        } else if (i6 == 4) {
            f6 = c1354c2.a;
            f7 = c1354c.f13296c;
        } else if (i6 == 5) {
            f6 = c1354c.f13295b;
            f7 = c1354c2.f13297d;
        } else {
            if (i6 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f6 = c1354c2.f13295b;
            f7 = c1354c.f13297d;
        }
        float f12 = f6 - f7;
        if (f12 < S.l.f7374V) {
            f12 = 0.0f;
        }
        long j3 = f12;
        if (i6 == 3 || i6 == 4) {
            float f13 = c1354c.f13295b;
            f8 = 2;
            f9 = ((c1354c.f13297d - f13) / f8) + f13;
            f10 = c1354c2.f13295b;
            f11 = c1354c2.f13297d;
        } else {
            if (i6 != 5 && i6 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f14 = c1354c.a;
            f8 = 2;
            f9 = ((c1354c.f13296c - f14) / f8) + f14;
            f10 = c1354c2.a;
            f11 = c1354c2.f13296c;
        }
        long j4 = f9 - (((f11 - f10) / f8) + f10);
        return (j4 * j4) + (13 * j3 * j3);
    }

    public static final boolean r(C c6) {
        J j3;
        i0 i0Var;
        J j4;
        i0 i0Var2 = c6.f11813k;
        return (i0Var2 == null || (j3 = i0Var2.f1954r) == null || !j3.I() || (i0Var = c6.f11813k) == null || (j4 = i0Var.f1954r) == null || !j4.H()) ? false : true;
    }

    public static final InterfaceC1041r s(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new C1248c(cVar));
    }

    public static final InterfaceC1041r t(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new g(cVar));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [m4.l, l4.c] */
    public static final EnumC1247b u(C c6, int i6) {
        int ordinal = c6.R0().ordinal();
        EnumC1247b enumC1247b = EnumC1247b.f12884c;
        if (ordinal != 0) {
            EnumC1247b enumC1247b2 = EnumC1247b.f12885e;
            if (ordinal == 1) {
                C n3 = n(c6);
                if (n3 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC1247b u5 = u(n3, i6);
                if (u5 == enumC1247b) {
                    u5 = null;
                }
                if (u5 != null) {
                    return u5;
                }
                if (c6.f12874t) {
                    return enumC1247b;
                }
                c6.f12874t = true;
                try {
                    u O02 = c6.O0();
                    C1246a c1246a = new C1246a(i6);
                    q qVar = (q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner();
                    C h3 = qVar.h();
                    O02.f12918k.f(c1246a);
                    C h6 = qVar.h();
                    if (!c1246a.f12883b) {
                        return (h3 == h6 || h6 == null) ? enumC1247b : w.f12922d == w.f12921c ? enumC1247b2 : EnumC1247b.f12886f;
                    }
                    w wVar = w.f12920b;
                    return enumC1247b2;
                } finally {
                    c6.f12874t = false;
                }
            }
            if (ordinal == 2) {
                return enumC1247b2;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
        }
        return enumC1247b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m4.l, l4.c] */
    public static final EnumC1247b v(C c6, int i6) {
        if (!c6.f12875u) {
            c6.f12875u = true;
            try {
                u O02 = c6.O0();
                C1246a c1246a = new C1246a(i6);
                q qVar = (q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner();
                C h3 = qVar.h();
                O02.f12917j.f(c1246a);
                C h6 = qVar.h();
                boolean z5 = c1246a.f12883b;
                EnumC1247b enumC1247b = EnumC1247b.f12885e;
                if (z5) {
                    w wVar = w.f12920b;
                    return enumC1247b;
                }
                if (h3 != h6 && h6 != null) {
                    return w.f12922d == w.f12921c ? enumC1247b : EnumC1247b.f12886f;
                }
            } finally {
                c6.f12875u = false;
            }
        }
        return EnumC1247b.f12884c;
    }

    public static final EnumC1247b w(C c6, int i6) {
        AbstractC1040q abstractC1040q;
        C0149f0 c0149f0;
        int ordinal = c6.R0().ordinal();
        EnumC1247b enumC1247b = EnumC1247b.f12884c;
        if (ordinal != 0) {
            if (ordinal == 1) {
                C n3 = n(c6);
                if (n3 != null) {
                    return u(n3, i6);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                if (!c6.f11806c.f11819q) {
                    E0.a.b("visitAncestors called on an unattached node");
                }
                AbstractC1040q abstractC1040q2 = c6.f11806c.f11810h;
                J v5 = AbstractC0157l.v(c6);
                loop0: while (true) {
                    if (v5 == null) {
                        abstractC1040q = null;
                        break;
                    }
                    if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                        while (abstractC1040q2 != null) {
                            if ((abstractC1040q2.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                abstractC1040q = abstractC1040q2;
                                V.e eVar = null;
                                while (abstractC1040q != null) {
                                    if (abstractC1040q instanceof C) {
                                        break loop0;
                                    }
                                    if ((abstractC1040q.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q instanceof AbstractC0156k)) {
                                        int i7 = 0;
                                        for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                            if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    abstractC1040q = abstractC1040q3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new V.e(new AbstractC1040q[16]);
                                                    }
                                                    if (abstractC1040q != null) {
                                                        eVar.b(abstractC1040q);
                                                        abstractC1040q = null;
                                                    }
                                                    eVar.b(abstractC1040q3);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC1040q = AbstractC0157l.e(eVar);
                                }
                            }
                            abstractC1040q2 = abstractC1040q2.f11810h;
                        }
                    }
                    v5 = v5.v();
                    abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
                }
                C c7 = (C) abstractC1040q;
                if (c7 == null) {
                    return enumC1247b;
                }
                int ordinal2 = c7.R0().ordinal();
                if (ordinal2 == 0) {
                    return v(c7, i6);
                }
                if (ordinal2 == 1) {
                    return w(c7, i6);
                }
                if (ordinal2 == 2) {
                    return EnumC1247b.f12885e;
                }
                if (ordinal2 != 3) {
                    throw new RuntimeException();
                }
                EnumC1247b w5 = w(c7, i6);
                EnumC1247b enumC1247b2 = w5 != enumC1247b ? w5 : null;
                return enumC1247b2 == null ? v(c7, i6) : enumC1247b2;
            }
        }
        return enumC1247b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean x(C c6) {
        V.e eVar;
        C0149f0 c0149f0;
        char c7;
        C0149f0 c0149f02;
        q qVar = (q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner();
        C h3 = qVar.h();
        EnumC1245A R02 = c6.R0();
        if (h3 == c6) {
            c6.N0(R02, R02);
            return true;
        }
        int i6 = 0;
        if ((h3 == null || h3.f12872r) && !c6.f12872r && !((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).a.H()) {
            return false;
        }
        char c8 = 16;
        if (h3 != null) {
            eVar = new V.e(new C[16]);
            if (!h3.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = h3.f11806c.f11810h;
            J v5 = AbstractC0157l.v(h3);
            while (v5 != null) {
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                            AbstractC1040q abstractC1040q2 = abstractC1040q;
                            V.e eVar2 = null;
                            while (abstractC1040q2 != null) {
                                if (abstractC1040q2 instanceof C) {
                                    eVar.b((C) abstractC1040q2);
                                } else if ((abstractC1040q2.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                                    int i7 = 0;
                                    for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                        if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC1040q2 = abstractC1040q3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC1040q2 != null) {
                                                    eVar2.b(abstractC1040q2);
                                                    abstractC1040q2 = null;
                                                }
                                                eVar2.b(abstractC1040q3);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC1040q2 = AbstractC0157l.e(eVar2);
                            }
                        }
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f02 = v5.f1721J) == null) ? null : c0149f02.f1918e;
            }
        } else {
            eVar = null;
        }
        C[] cArr = new C[16];
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q4 = c6.f11806c.f11810h;
        J v6 = AbstractC0157l.v(c6);
        int i8 = 1;
        int i9 = 0;
        while (v6 != null) {
            if ((v6.f1721J.f1919f.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                while (abstractC1040q4 != null) {
                    if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        AbstractC1040q abstractC1040q5 = abstractC1040q4;
                        V.e eVar3 = null;
                        while (abstractC1040q5 != null) {
                            if (abstractC1040q5 instanceof C) {
                                C c9 = (C) abstractC1040q5;
                                Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.j(c9)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i10 = i9 + 1;
                                    if (cArr.length < i10) {
                                        int length = cArr.length;
                                        Object[] r42 = new Object[Math.max(i10, length * 2)];
                                        System.arraycopy(cArr, i6, r42, i6, length);
                                        cArr = r42;
                                    }
                                    cArr[i9] = c9;
                                    i9 = i10;
                                }
                                if (c9 == h3) {
                                    i8 = i6;
                                }
                            } else if ((abstractC1040q5.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q5 instanceof AbstractC0156k)) {
                                int i11 = i6;
                                for (AbstractC1040q abstractC1040q6 = ((AbstractC0156k) abstractC1040q5).f1964s; abstractC1040q6 != null; abstractC1040q6 = abstractC1040q6.f11811i) {
                                    if ((abstractC1040q6.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            abstractC1040q5 = abstractC1040q6;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q5 != null) {
                                                eVar3.b(abstractC1040q5);
                                                abstractC1040q5 = null;
                                            }
                                            eVar3.b(abstractC1040q6);
                                        }
                                    }
                                }
                                c7 = 16;
                                if (i11 == 1) {
                                    c8 = 16;
                                    i6 = 0;
                                }
                                abstractC1040q5 = AbstractC0157l.e(eVar3);
                                c8 = c7;
                                i6 = 0;
                            }
                            c7 = 16;
                            abstractC1040q5 = AbstractC0157l.e(eVar3);
                            c8 = c7;
                            i6 = 0;
                        }
                    }
                    abstractC1040q4 = abstractC1040q4.f11810h;
                    c8 = c8;
                    i6 = 0;
                }
            }
            char c10 = c8;
            v6 = v6.v();
            abstractC1040q4 = (v6 == null || (c0149f0 = v6.f1721J) == null) ? null : c0149f0.f1918e;
            c8 = c10;
            i6 = 0;
        }
        if (i8 == 0 || h3 == null || d(h3, false)) {
            AbstractC0157l.r(c6, new A0.b(c6, 19));
            int ordinal = c6.R0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new RuntimeException();
                        }
                    }
                }
                ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).k(c6);
            }
            EnumC1245A enumC1245A = EnumC1245A.f12870f;
            EnumC1245A enumC1245A2 = EnumC1245A.f12868c;
            if (i8 != 0 && h3 != null) {
                h3.N0(enumC1245A2, enumC1245A);
            }
            EnumC1245A enumC1245A3 = EnumC1245A.f12869e;
            if (eVar != null) {
                int i12 = eVar.f8761f - 1;
                Object[] objArr = eVar.f8759c;
                if (i12 < objArr.length) {
                    while (i12 >= 0) {
                        C c11 = (C) objArr[i12];
                        if (qVar.h() != c6) {
                            break;
                        }
                        c11.N0(enumC1245A3, enumC1245A);
                        i12--;
                    }
                }
            }
            int i13 = i9 - 1;
            if (i13 < cArr.length) {
                while (i13 >= 0) {
                    C c12 = cArr[i13];
                    if (qVar.h() != c6) {
                        break;
                    }
                    c12.N0(c12 == h3 ? enumC1245A2 : enumC1245A, enumC1245A3);
                    i13--;
                }
            }
            if (qVar.h() == c6) {
                c6.N0(R02, enumC1245A2);
                if (qVar.h() != c6) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean y(C c6, c.f fVar) {
        C[] cArr = new C[16];
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitChildren called on an unattached node");
        }
        V.e eVar = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q = c6.f11806c;
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i;
        if (abstractC1040q2 == null) {
            AbstractC0157l.b(eVar, abstractC1040q);
        } else {
            eVar.b(abstractC1040q2);
        }
        int i6 = 0;
        while (true) {
            int i7 = eVar.f8761f;
            if (i7 == 0) {
                break;
            }
            AbstractC1040q abstractC1040q3 = (AbstractC1040q) eVar.k(i7 - 1);
            if ((abstractC1040q3.f11809g & PegdownExtensions.ANCHORLINKS) == 0) {
                AbstractC0157l.b(eVar, abstractC1040q3);
            } else {
                while (true) {
                    if (abstractC1040q3 == null) {
                        break;
                    }
                    if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        V.e eVar2 = null;
                        while (abstractC1040q3 != null) {
                            if (abstractC1040q3 instanceof C) {
                                C c7 = (C) abstractC1040q3;
                                int i8 = i6 + 1;
                                if (cArr.length < i8) {
                                    int length = cArr.length;
                                    Object[] r10 = new Object[Math.max(i8, length * 2)];
                                    System.arraycopy(cArr, 0, r10, 0, length);
                                    cArr = r10;
                                }
                                cArr[i6] = c7;
                                i6 = i8;
                            } else if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q3 instanceof AbstractC0156k)) {
                                int i9 = 0;
                                for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q3).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                    if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC1040q3 = abstractC1040q4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q3 != null) {
                                                eVar2.b(abstractC1040q3);
                                                abstractC1040q3 = null;
                                            }
                                            eVar2.b(abstractC1040q4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC1040q3 = AbstractC0157l.e(eVar2);
                        }
                    } else {
                        abstractC1040q3 = abstractC1040q3.f11811i;
                    }
                }
            }
        }
        Y3.k.A0(cArr, D.a, 0, i6);
        int i10 = i6 - 1;
        if (i10 < cArr.length) {
            while (i10 >= 0) {
                C c8 = cArr[i10];
                if (r(c8) && a(c8, fVar)) {
                    return true;
                }
                i10--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean z(C c6, c.f fVar) {
        C[] cArr = new C[16];
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitChildren called on an unattached node");
        }
        V.e eVar = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q = c6.f11806c;
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i;
        if (abstractC1040q2 == null) {
            AbstractC0157l.b(eVar, abstractC1040q);
        } else {
            eVar.b(abstractC1040q2);
        }
        int i6 = 0;
        while (true) {
            int i7 = eVar.f8761f;
            if (i7 == 0) {
                break;
            }
            AbstractC1040q abstractC1040q3 = (AbstractC1040q) eVar.k(i7 - 1);
            if ((abstractC1040q3.f11809g & PegdownExtensions.ANCHORLINKS) == 0) {
                AbstractC0157l.b(eVar, abstractC1040q3);
            } else {
                while (true) {
                    if (abstractC1040q3 == null) {
                        break;
                    }
                    if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        V.e eVar2 = null;
                        while (abstractC1040q3 != null) {
                            if (abstractC1040q3 instanceof C) {
                                C c7 = (C) abstractC1040q3;
                                int i8 = i6 + 1;
                                if (cArr.length < i8) {
                                    int length = cArr.length;
                                    Object[] r10 = new Object[Math.max(i8, length * 2)];
                                    System.arraycopy(cArr, 0, r10, 0, length);
                                    cArr = r10;
                                }
                                cArr[i6] = c7;
                                i6 = i8;
                            } else if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q3 instanceof AbstractC0156k)) {
                                int i9 = 0;
                                for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q3).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                    if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC1040q3 = abstractC1040q4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q3 != null) {
                                                eVar2.b(abstractC1040q3);
                                                abstractC1040q3 = null;
                                            }
                                            eVar2.b(abstractC1040q4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC1040q3 = AbstractC0157l.e(eVar2);
                        }
                    } else {
                        abstractC1040q3 = abstractC1040q3.f11811i;
                    }
                }
            }
        }
        Y3.k.A0(cArr, D.a, 0, i6);
        for (int i10 = 0; i10 < i6; i10++) {
            C c8 = cArr[i10];
            if (r(c8) && k(c8, fVar)) {
                return true;
            }
        }
        return false;
    }
}
