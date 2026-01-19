package r;

import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.view.ViewTreeObserver;
import c4.EnumC0927a;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import java.lang.reflect.Method;
import m4.AbstractC1276k;
import n0.C1353b;
import p.C1459u;

/* loaded from: classes.dex */
public final class E1 {
    public InterfaceC1623y1 a;

    /* renamed from: b, reason: collision with root package name */
    public C1459u f14013b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1619x0 f14014c;

    /* renamed from: d, reason: collision with root package name */
    public X0 f14015d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14016e;

    /* renamed from: f, reason: collision with root package name */
    public A0.e f14017f;

    /* renamed from: g, reason: collision with root package name */
    public final C1620x1 f14018g;

    /* renamed from: h, reason: collision with root package name */
    public final C1596p1 f14019h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14020i;

    /* renamed from: j, reason: collision with root package name */
    public int f14021j = 1;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1563e1 f14022k = AbstractC1587m1.f14389b;

    /* renamed from: l, reason: collision with root package name */
    public final B1 f14023l = new B1(this);

    /* renamed from: m, reason: collision with root package name */
    public final W0.e f14024m = new W0.e(this, 12);

    public E1(InterfaceC1623y1 interfaceC1623y1, C1459u c1459u, InterfaceC1619x0 interfaceC1619x0, X0 x02, boolean z5, A0.e eVar, C1620x1 c1620x1, C1596p1 c1596p1) {
        this.a = interfaceC1623y1;
        this.f14013b = c1459u;
        this.f14014c = interfaceC1619x0;
        this.f14015d = x02;
        this.f14016e = z5;
        this.f14017f = eVar;
        this.f14018g = c1620x1;
        this.f14019h = c1596p1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, d4.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof r.C1626z1
            if (r0 == 0) goto L13
            r0 = r13
            r.z1 r0 = (r.C1626z1) r0
            int r1 = r0.f14530j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14530j = r1
            goto L18
        L13:
            r.z1 r0 = new r.z1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f14528h
            int r1 = r0.f14530j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            m4.v r11 = r0.f14527g
            X3.a.e(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L59
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L69
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            X3.a.e(r13)
            m4.v r6 = new m4.v
            r6.<init>()
            r6.f12972c = r11
            r10.f14020i = r3
            p.x0 r13 = p.x0.f13823c     // Catch: java.lang.Throwable -> L66
            r.A1 r4 = new r.A1     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L63
            r0.f14527g = r6     // Catch: java.lang.Throwable -> L63
            r0.f14530j = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r10.f(r13, r4, r0)     // Catch: java.lang.Throwable -> L63
            c4.a r12 = c4.EnumC0927a.f11114c
            if (r11 != r12) goto L58
            return r12
        L58:
            r11 = r6
        L59:
            r5.f14020i = r2
            long r11 = r11.f12972c
            e1.q r13 = new e1.q
            r13.<init>(r11)
            return r13
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L69
        L66:
            r0 = move-exception
            r5 = r10
            goto L64
        L69:
            r5.f14020i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r.E1.a(long, d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof r.C1521G) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, boolean r7, d4.i r8) {
        /*
            r4 = this;
            X3.y r0 = X3.y.a
            if (r7 == 0) goto Ld
            r.x0 r7 = r4.f14014c
            p.O0 r1 = r.AbstractC1587m1.a
            boolean r7 = r7 instanceof r.C1521G
            if (r7 == 0) goto Ld
            goto L4d
        Ld:
            r.X0 r7 = r4.f14015d
            r.X0 r1 = r.X0.f14184e
            r2 = 0
            if (r7 != r1) goto L1a
            r7 = 1
        L15:
            long r5 = e1.q.a(r5, r2, r2, r7)
            goto L1c
        L1a:
            r7 = 2
            goto L15
        L1c:
            r.C1 r7 = new r.C1
            r1 = 0
            r7.<init>(r4, r1)
            p.u r1 = r4.f14013b
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3f
            r.y1 r3 = r4.a
            boolean r3 = r3.d()
            if (r3 != 0) goto L38
            r.y1 r3 = r4.a
            boolean r3 = r3.c()
            if (r3 == 0) goto L3f
        L38:
            java.lang.Object r5 = r1.b(r5, r7, r8)
            if (r5 != r2) goto L4d
            return r5
        L3f:
            r.C1 r7 = new r.C1
            r7.<init>(r4, r8)
            r7.f13992j = r5
            java.lang.Object r5 = r7.r(r0)
            if (r5 != r2) goto L4d
            return r5
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.E1.b(long, boolean, d4.i):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                public final long c(InterfaceC1563e1 interfaceC1563e1, long j3, int i6) {
        int i7;
        A0.j jVar;
        A0.j jVar2;
        long j4;
        long j5;
        A0.j jVar3;
        C0149f0 c0149f0;
        AbstractC1040q abstractC1040q;
        H0.F0 f02;
        C0149f0 c0149f02;
        AbstractC1040q abstractC1040q2;
        A0.j jVar4 = this.f14017f.a;
        int i8 = PegdownExtensions.ATXHEADERSPACE;
        int i9 = 1;
        Object obj = null;
        if (jVar4 == null || !jVar4.f11819q) {
            i7 = 262144;
            jVar = null;
        } else {
            if (!jVar4.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q3 = jVar4.f11806c.f11810h;
            H0.J v5 = AbstractC0157l.v(jVar4);
            loop0: while (true) {
                if (v5 == null) {
                    i7 = i8;
                    f02 = null;
                    break;
                }
                if ((v5.f1721J.f1919f.f11809g & i8) != 0) {
                    while (abstractC1040q3 != null) {
                        if ((abstractC1040q3.f11808f & i8) != 0) {
                            V.e eVar = null;
                            AbstractC0156k abstractC0156k = abstractC1040q3;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof H0.F0) {
                                    f02 = (H0.F0) abstractC0156k;
                                    i7 = i8;
                                    if (AbstractC1276k.b(jVar4.m(), f02.m()) && A0.j.class == f02.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i7 = i8;
                                    if ((abstractC0156k.f11808f & i7) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                        AbstractC1040q abstractC1040q4 = abstractC0156k.f1964s;
                                        int i10 = 0;
                                        abstractC1040q2 = abstractC0156k;
                                        eVar = eVar;
                                        while (abstractC1040q4 != null) {
                                            if ((abstractC1040q4.f11808f & i7) != 0) {
                                                i10++;
                                                eVar = eVar;
                                                if (i10 == 1) {
                                                    abstractC1040q2 = abstractC1040q4;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new V.e(new AbstractC1040q[16]);
                                                    }
                                                    if (abstractC1040q2 != null) {
                                                        eVar.b(abstractC1040q2);
                                                        abstractC1040q2 = null;
                                                    }
                                                    eVar.b(abstractC1040q4);
                                                }
                                            }
                                            abstractC1040q4 = abstractC1040q4.f11811i;
                                            abstractC1040q2 = abstractC1040q2;
                                            eVar = eVar;
                                        }
                                        if (i10 == 1) {
                                            i8 = i7;
                                            abstractC0156k = abstractC1040q2;
                                            eVar = eVar;
                                        }
                                    }
                                }
                                abstractC1040q2 = AbstractC0157l.e(eVar);
                                i8 = i7;
                                abstractC0156k = abstractC1040q2;
                                eVar = eVar;
                            }
                        }
                        abstractC1040q3 = abstractC1040q3.f11810h;
                        i8 = i8;
                    }
                }
                int i11 = i8;
                v5 = v5.v();
                abstractC1040q3 = (v5 == null || (c0149f02 = v5.f1721J) == null) ? null : c0149f02.f1918e;
                i8 = i11;
            }
            jVar = (A0.j) f02;
        }
        long a02 = jVar != null ? jVar.a0(j3, i6) : 0L;
        long e6 = C1353b.e(j3, a02);
        long e7 = e(h(interfaceC1563e1.a(g(e(this.f14015d == X0.f14184e ? C1353b.a(S.l.f7374V, 1, e6) : C1353b.a(S.l.f7374V, 2, e6))))));
        C1620x1 c1620x1 = this.f14018g;
        if (c1620x1.f11819q) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c1620x1)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC0216x.f2406S0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC0216x.f2406S0 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC0216x.f2406S0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long e8 = C1353b.e(e6, e7);
        A0.j jVar5 = this.f14017f.a;
        if (jVar5 == null || !jVar5.f11819q) {
            jVar2 = null;
        } else {
            if (!jVar5.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q5 = jVar5.f11806c.f11810h;
            H0.J v6 = AbstractC0157l.v(jVar5);
            loop3: while (true) {
                if (v6 == null) {
                    jVar3 = null;
                    break;
                }
                if ((v6.f1721J.f1919f.f11809g & i7) != 0) {
                    while (abstractC1040q5 != null) {
                        if ((abstractC1040q5.f11808f & i7) != 0) {
                            AbstractC0156k abstractC0156k2 = abstractC1040q5;
                            Object r8 = obj;
                            while (abstractC0156k2 != 0) {
                                if (abstractC0156k2 instanceof H0.F0) {
                                    Object r7 = (H0.F0) abstractC0156k2;
                                    if (AbstractC1276k.b(jVar5.m(), r7.m()) && A0.j.class == r7.getClass()) {
                                        jVar3 = r7;
                                        break loop3;
                                    }
                                } else if ((abstractC0156k2.f11808f & i7) != 0 && (abstractC0156k2 instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q6 = abstractC0156k2.f1964s;
                                    int i12 = 0;
                                    abstractC1040q = abstractC0156k2;
                                    r8 = r8;
                                    while (abstractC1040q6 != null) {
                                        abstractC1040q = abstractC1040q;
                                        if ((abstractC1040q6.f11808f & i7) != 0) {
                                            i12++;
                                            if (i12 == i9) {
                                                abstractC1040q = abstractC1040q6;
                                            } else {
                                                r8 = r8 == 0 ? new V.e(new AbstractC1040q[16]) : r8;
                                                if (abstractC1040q != null) {
                                                    r8.b(abstractC1040q);
                                                    abstractC1040q = null;
                                                }
                                                r8.b(abstractC1040q6);
                                                abstractC1040q6 = abstractC1040q6.f11811i;
                                                i9 = 1;
                                                abstractC1040q = abstractC1040q;
                                                r8 = r8;
                                            }
                                        }
                                        abstractC1040q6 = abstractC1040q6.f11811i;
                                        i9 = 1;
                                        abstractC1040q = abstractC1040q;
                                        r8 = r8;
                                    }
                                    if (i12 == i9) {
                                        abstractC0156k2 = abstractC1040q;
                                        r8 = r8;
                                    }
                                }
                                abstractC1040q = AbstractC0157l.e(r8);
                                abstractC0156k2 = abstractC1040q;
                                r8 = r8;
                            }
                        }
                        abstractC1040q5 = abstractC1040q5.f11810h;
                        obj = null;
                    }
                }
                v6 = v6.v();
                abstractC1040q5 = (v6 == null || (c0149f0 = v6.f1721J) == null) ? null : c0149f0.f1918e;
                obj = null;
            }
            jVar2 = jVar3;
        }
        if (jVar2 != null) {
            j5 = jVar2.s0(e7, e8, i6);
            j4 = e7;
        } else {
            j4 = e7;
            j5 = 0;
        }
        return C1353b.f(C1353b.f(a02, j4), j5);
    }

    public final float d(float f6) {
        return this.f14016e ? f6 * (-1) : f6;
    }

    public final long e(long j3) {
        return this.f14016e ? C1353b.g(-1.0f, j3) : j3;
    }

    public final Object f(p.x0 x0Var, l4.e eVar, d4.c cVar) {
        Object a = this.a.a(x0Var, new D1(this, eVar, null), cVar);
        return a == EnumC0927a.f11114c ? a : X3.y.a;
    }

    public final float g(long j3) {
        return Float.intBitsToFloat((int) (this.f14015d == X0.f14184e ? j3 >> 32 : j3 & 4294967295L));
    }

    public final long h(float f6) {
        long floatToRawIntBits;
        long j3;
        if (f6 == S.l.f7374V) {
            return 0L;
        }
        if (this.f14015d == X0.f14184e) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f6);
            floatToRawIntBits = Float.floatToRawIntBits(S.l.f7374V);
            j3 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(S.l.f7374V);
            floatToRawIntBits = Float.floatToRawIntBits(f6);
            j3 = floatToRawIntBits3 << 32;
        }
        return j3 | (floatToRawIntBits & 4294967295L);
    }

    public final float i(long j3) {
        int i6 = (int) (4294967295L & j3);
        int i7 = (int) (j3 >> 32);
        return ((double) ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat(i6)), (double) Math.abs(Float.intBitsToFloat(i7))))) >= 0.7853981633974483d ? this.f14015d == X0.f14183c ? Float.intBitsToFloat(i6) : S.l.f7374V : this.f14015d == X0.f14184e ? Float.intBitsToFloat(i7) : S.l.f7374V;
    }
}
