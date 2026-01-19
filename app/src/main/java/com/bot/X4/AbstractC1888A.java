package x4;

import D.P0;
import Z2.C0789z;
import b4.C0906d;
import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0907e;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.CoroutineExceptionHandler;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* renamed from: x4.A */
/* loaded from: classes.dex */
public abstract class AbstractC1888A {
    public static final C4.u a = new C4.u("RESUME_TOKEN", 0);

    /* renamed from: b */
    public static final C4.u f15638b = new C4.u("REMOVED_TASK", 0);

    /* renamed from: c */
    public static final C4.u f15639c = new C4.u("CLOSED_EMPTY", 0);

    /* renamed from: d */
    public static final C4.u f15640d = new C4.u("COMPLETING_ALREADY", 0);

    /* renamed from: e */
    public static final C4.u f15641e = new C4.u("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: f */
    public static final C4.u f15642f = new C4.u("COMPLETING_RETRY", 0);

    /* renamed from: g */
    public static final C4.u f15643g = new C4.u("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h */
    public static final C4.u f15644h = new C4.u("SEALED", 0);

    /* renamed from: i */
    public static final C1902O f15645i = new C1902O(false);

    /* renamed from: j */
    public static final C1902O f15646j = new C1902O(true);

    public static final Object A(Object obj) {
        return obj instanceof C1936s ? X3.a.b(((C1936s) obj).a) : obj;
    }

    public static final void B(C1928k c1928k, InterfaceC0905c interfaceC0905c, boolean z5) {
        Object obj = C1928k.f15705j.get(c1928k);
        Throwable d6 = c1928k.d(obj);
        Object b5 = d6 != null ? X3.a.b(d6) : c1928k.f(obj);
        if (!z5) {
            interfaceC0905c.k(b5);
            return;
        }
        AbstractC1276k.d(interfaceC0905c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C4.f fVar = (C4.f) interfaceC0905c;
        d4.c cVar = fVar.f690h;
        Object obj2 = fVar.f692j;
        InterfaceC0910h o5 = cVar.o();
        Object l3 = C4.a.l(o5, obj2);
        B0 G5 = l3 != C4.a.f680d ? G(cVar, o5, l3) : null;
        try {
            cVar.k(b5);
            if (G5 == null || G5.q0()) {
                C4.a.g(o5, l3);
            }
        } catch (Throwable th) {
            if (G5 == null || G5.q0()) {
                C4.a.g(o5, l3);
            }
            throw th;
        }
    }

    public static final Object C(InterfaceC0910h interfaceC0910h, l4.e eVar) {
        AbstractC1908V abstractC1908V;
        InterfaceC0910h o5;
        Thread currentThread = Thread.currentThread();
        InterfaceC0909g interfaceC0909g = C0906d.f11056c;
        InterfaceC0907e interfaceC0907e = (InterfaceC0907e) interfaceC0910h.r(interfaceC0909g);
        C0911i c0911i = C0911i.f11057c;
        if (interfaceC0907e == null) {
            abstractC1908V = v0.a();
            o5 = o(c0911i, interfaceC0910h.Y(abstractC1908V), true);
            E4.e eVar2 = AbstractC1898K.a;
            if (o5 != eVar2 && o5.r(interfaceC0909g) == null) {
                o5 = o5.Y(eVar2);
            }
        } else {
            if (interfaceC0907e instanceof AbstractC1908V) {
            }
            abstractC1908V = (AbstractC1908V) v0.a.get();
            o5 = o(c0911i, interfaceC0910h, true);
            E4.e eVar3 = AbstractC1898K.a;
            if (o5 != eVar3 && o5.r(interfaceC0909g) == null) {
                o5 = o5.Y(eVar3);
            }
        }
        C1923f c1923f = new C1923f(o5, currentThread, abstractC1908V);
        c1923f.p0(EnumC1943z.f15739c, c1923f, eVar);
        AbstractC1908V abstractC1908V2 = c1923f.f15692h;
        if (abstractC1908V2 != null) {
            int i6 = AbstractC1908V.f15672i;
            abstractC1908V2.k0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long l02 = abstractC1908V2 != null ? abstractC1908V2.l0() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l0.f15714c;
                if (!(atomicReferenceFieldUpdater.get(c1923f) instanceof InterfaceC1914a0)) {
                    if (abstractC1908V2 != null) {
                        int i7 = AbstractC1908V.f15672i;
                        abstractC1908V2.h0(false);
                    }
                    Object F5 = F(atomicReferenceFieldUpdater.get(c1923f));
                    C1936s c1936s = F5 instanceof C1936s ? (C1936s) F5 : null;
                    if (c1936s == null) {
                        return F5;
                    }
                    throw c1936s.a;
                }
                LockSupport.parkNanos(c1923f, l02);
            } catch (Throwable th) {
                if (abstractC1908V2 != null) {
                    int i8 = AbstractC1908V.f15672i;
                    abstractC1908V2.h0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1923f.B(interruptedException);
        throw interruptedException;
    }

    public static final Object D(y0 y0Var, l4.e eVar) {
        Object c1936s;
        Object a02;
        u(y0Var, true, new C1901N(p(y0Var.f713g.o()).c(y0Var.f15738h, y0Var, y0Var.f15679f), 0));
        try {
            if (eVar instanceof d4.a) {
                AbstractC1291z.b(2, eVar);
                c1936s = eVar.m(y0Var, y0Var);
            } else {
                c1936s = Y4.d.Y(eVar, y0Var, y0Var);
            }
        } catch (Throwable th) {
            c1936s = new C1936s(th, false);
        }
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (c1936s == enumC0927a || (a02 = y0Var.a0(c1936s)) == f15641e) {
            return enumC0927a;
        }
        if (a02 instanceof C1936s) {
            Throwable th2 = ((C1936s) a02).a;
            if (!(th2 instanceof x0)) {
                throw th2;
            }
            if (((x0) th2).f15737c != y0Var) {
                throw th2;
            }
            if (c1936s instanceof C1936s) {
                throw ((C1936s) c1936s).a;
            }
        } else {
            c1936s = F(a02);
        }
        return c1936s;
    }

    public static final String E(InterfaceC0905c interfaceC0905c) {
        Object b5;
        if (interfaceC0905c instanceof C4.f) {
            return ((C4.f) interfaceC0905c).toString();
        }
        try {
            b5 = interfaceC0905c + '@' + q(interfaceC0905c);
        } catch (Throwable th) {
            b5 = X3.a.b(th);
        }
        if (X3.l.a(b5) != null) {
            b5 = interfaceC0905c.getClass().getName() + '@' + q(interfaceC0905c);
        }
        return (String) b5;
    }

    public static final Object F(Object obj) {
        InterfaceC1914a0 interfaceC1914a0;
        C1916b0 c1916b0 = obj instanceof C1916b0 ? (C1916b0) obj : null;
        return (c1916b0 == null || (interfaceC1914a0 = c1916b0.a) == null) ? obj : interfaceC1914a0;
    }

    public static final B0 G(InterfaceC0905c interfaceC0905c, InterfaceC0910h interfaceC0910h, Object obj) {
        B0 b02 = null;
        if ((interfaceC0905c instanceof d4.d) && interfaceC0910h.r(C0.f15651c) != null) {
            d4.d dVar = (d4.d) interfaceC0905c;
            while (true) {
                if ((dVar instanceof C1895H) || (dVar = dVar.g()) == null) {
                    break;
                }
                if (dVar instanceof B0) {
                    b02 = (B0) dVar;
                    break;
                }
            }
            if (b02 != null) {
                b02.r0(interfaceC0910h, obj);
            }
        }
        return b02;
    }

    public static final Object H(InterfaceC0910h interfaceC0910h, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        InterfaceC0910h o5 = interfaceC0905c.o();
        InterfaceC0910h Y5 = !((Boolean) interfaceC0910h.q(Boolean.FALSE, new C0789z(23))).booleanValue() ? o5.Y(interfaceC0910h) : o(o5, interfaceC0910h, false);
        n(Y5);
        if (Y5 == o5) {
            C4.r rVar = new C4.r(interfaceC0905c, Y5);
            return Y3.C.T(rVar, rVar, eVar);
        }
        C0906d c0906d = C0906d.f11056c;
        if (AbstractC1276k.b(Y5.r(c0906d), o5.r(c0906d))) {
            B0 b02 = new B0(interfaceC0905c, Y5);
            InterfaceC0910h interfaceC0910h2 = b02.f15679f;
            Object l3 = C4.a.l(interfaceC0910h2, null);
            try {
                return Y3.C.T(b02, b02, eVar);
            } finally {
                C4.a.g(interfaceC0910h2, l3);
            }
        }
        C4.r rVar2 = new C4.r(interfaceC0905c, Y5);
        try {
            C4.a.h(Y4.d.K(Y4.d.x(rVar2, rVar2, eVar)), X3.y.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1895H.f15656h;
            do {
                int i6 = atomicIntegerFieldUpdater.get(rVar2);
                if (i6 != 0) {
                    if (i6 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object F5 = F(l0.f15714c.get(rVar2));
                    if (F5 instanceof C1936s) {
                        throw ((C1936s) F5).a;
                    }
                    return F5;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(rVar2, 0, 1));
            return EnumC0927a.f11114c;
        } catch (Throwable th) {
            rVar2.k(X3.a.b(th));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(long r5, l4.e r7, d4.c r8) {
        /*
            boolean r0 = r8 instanceof x4.z0
            if (r0 == 0) goto L13
            r0 = r8
            x4.z0 r0 = (x4.z0) r0
            int r1 = r0.f15746i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15746i = r1
            goto L18
        L13:
            x4.z0 r0 = new x4.z0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15745h
            int r1 = r0.f15746i
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            m4.w r5 = r0.f15744g
            X3.a.e(r8)     // Catch: x4.x0 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            X3.a.e(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            m4.w r8 = new m4.w
            r8.<init>()
            r0.f15744g = r8     // Catch: x4.x0 -> L55
            r0.f15746i = r2     // Catch: x4.x0 -> L55
            x4.y0 r1 = new x4.y0     // Catch: x4.x0 -> L55
            r1.<init>(r5, r0)     // Catch: x4.x0 -> L55
            r8.f12973c = r1     // Catch: x4.x0 -> L55
            java.lang.Object r5 = D(r1, r7)     // Catch: x4.x0 -> L55
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            x4.e0 r7 = r6.f15737c
            java.lang.Object r5 = r5.f12973c
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC1888A.I(long, l4.e, d4.c):java.lang.Object");
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x4.l0, x4.p] */
    public static C1933p b() {
        l0 l0Var = new l0(true);
        l0Var.V(null);
        return l0Var;
    }

    public static final C4.c c(InterfaceC0910h interfaceC0910h) {
        if (interfaceC0910h.r(C1940w.f15731e) == null) {
            interfaceC0910h = interfaceC0910h.Y(d());
        }
        return new C4.c(interfaceC0910h);
    }

    public static g0 d() {
        return new g0(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x4.g0, x4.t0] */
    public static t0 e() {
        return new g0(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [x4.E, x4.a] */
    public static C1892E f(InterfaceC1942y interfaceC1942y, InterfaceC0910h interfaceC0910h, l4.e eVar, int i6) {
        if ((i6 & 1) != 0) {
            interfaceC0910h = C0911i.f11057c;
        }
        AbstractC1913a abstractC1913a = new AbstractC1913a(z(interfaceC1942y, interfaceC0910h), true, true);
        abstractC1913a.p0(EnumC1943z.f15739c, abstractC1913a, eVar);
        return abstractC1913a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(List list, d4.i iVar) {
        if (list.isEmpty()) {
            return Y3.v.f9812c;
        }
        InterfaceC1891D[] interfaceC1891DArr = (InterfaceC1891D[]) list.toArray(new InterfaceC1891D[0]);
        C1921e c1921e = new C1921e(interfaceC1891DArr);
        C1928k c1928k = new C1928k(1, Y4.d.K(iVar));
        c1928k.t();
        int length = interfaceC1891DArr.length;
        C1917c[] c1917cArr = new C1917c[length];
        for (int i6 = 0; i6 < length; i6++) {
            g0 g0Var = interfaceC1891DArr[i6];
            g0Var.start();
            C1917c c1917c = new C1917c(c1921e, c1928k);
            c1917c.f15683i = u(g0Var, true, c1917c);
            c1917cArr[i6] = c1917c;
        }
        C1919d c1919d = new C1919d(c1917cArr);
        for (int i7 = 0; i7 < length; i7++) {
            C1917c c1917c2 = c1917cArr[i7];
            c1917c2.getClass();
            C1917c.f15681k.set(c1917c2, c1919d);
        }
        if (C1928k.f15705j.get(c1928k) instanceof q0) {
            c1928k.x(c1919d);
        } else {
            c1919d.a();
        }
        return c1928k.s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(d4.c r4) {
        /*
            boolean r0 = r4 instanceof x4.C1894G
            if (r0 == 0) goto L13
            r0 = r4
            x4.G r0 = (x4.C1894G) r0
            int r1 = r0.f15655h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15655h = r1
            goto L18
        L13:
            x4.G r0 = new x4.G
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f15654g
            int r1 = r0.f15655h
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L29:
            X3.a.e(r4)
            goto L47
        L2d:
            X3.a.e(r4)
            r0.f15655h = r2
            x4.k r4 = new x4.k
            b4.c r0 = Y4.d.K(r0)
            r4.<init>(r2, r0)
            r4.t()
            java.lang.Object r4 = r4.s()
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r4 != r0) goto L47
            return
        L47:
            N0.e r4 = new N0.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC1888A.h(d4.c):void");
    }

    public static final void i(InterfaceC0910h interfaceC0910h, CancellationException cancellationException) {
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC0910h.r(C1940w.f15731e);
        if (interfaceC1922e0 != null) {
            interfaceC1922e0.f(cancellationException);
        }
    }

    public static final void j(InterfaceC1942y interfaceC1942y, CancellationException cancellationException) {
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC1942y.c().r(C1940w.f15731e);
        if (interfaceC1922e0 != null) {
            interfaceC1922e0.f(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC1942y).toString());
        }
    }

    public static final Object l(l4.e eVar, InterfaceC0905c interfaceC0905c) {
        C4.r rVar = new C4.r(interfaceC0905c, interfaceC0905c.o());
        return Y3.C.T(rVar, rVar, eVar);
    }

    public static final Object m(long j3, InterfaceC0905c interfaceC0905c) {
        if (j3 > 0) {
            C1928k c1928k = new C1928k(1, Y4.d.K(interfaceC0905c));
            c1928k.t();
            if (j3 < Long.MAX_VALUE) {
                p(c1928k.f15708h).p(j3, c1928k);
            }
            Object s5 = c1928k.s();
            if (s5 == EnumC0927a.f11114c) {
                return s5;
            }
        }
        return X3.y.a;
    }

    public static final void n(InterfaceC0910h interfaceC0910h) {
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC0910h.r(C1940w.f15731e);
        if (interfaceC1922e0 != null && !interfaceC1922e0.d()) {
            throw interfaceC1922e0.y();
        }
    }

    public static final InterfaceC0910h o(InterfaceC0910h interfaceC0910h, InterfaceC0910h interfaceC0910h2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) interfaceC0910h.q(bool, new C0789z(23))).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC0910h2.q(bool, new C0789z(23))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC0910h.Y(interfaceC0910h2);
        }
        C0789z c0789z = new C0789z(21);
        C0911i c0911i = C0911i.f11057c;
        InterfaceC0910h interfaceC0910h3 = (InterfaceC0910h) interfaceC0910h.q(c0911i, c0789z);
        Object obj = interfaceC0910h2;
        if (booleanValue2) {
            obj = interfaceC0910h2.q(c0911i, new C0789z(22));
        }
        return interfaceC0910h3.Y((InterfaceC0910h) obj);
    }

    public static final InterfaceC1893F p(InterfaceC0910h interfaceC0910h) {
        InterfaceC0908f r5 = interfaceC0910h.r(C0906d.f11056c);
        InterfaceC1893F interfaceC1893F = r5 instanceof InterfaceC1893F ? (InterfaceC1893F) r5 : null;
        return interfaceC1893F == null ? AbstractC1890C.a : interfaceC1893F;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC1922e0 r(InterfaceC0910h interfaceC0910h) {
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC0910h.r(C1940w.f15731e);
        if (interfaceC1922e0 != null) {
            return interfaceC1922e0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC0910h).toString());
    }

    public static final C1928k s(InterfaceC0905c interfaceC0905c) {
        C1928k c1928k;
        C1928k c1928k2;
        if (!(interfaceC0905c instanceof C4.f)) {
            return new C1928k(1, interfaceC0905c);
        }
        C4.f fVar = (C4.f) interfaceC0905c;
        C4.u uVar = C4.a.f679c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4.f.f688k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            c1928k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, uVar);
                c1928k2 = null;
                break;
            }
            if (obj instanceof C1928k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c1928k2 = (C1928k) obj;
                break loop0;
            }
            if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1928k2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1928k.f15705j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1928k2);
            if (!(obj2 instanceof C1935r) || ((C1935r) obj2).f15724d == null) {
                C1928k.f15704i.set(c1928k2, SegmentTree.MAX_VALUE);
                atomicReferenceFieldUpdater2.set(c1928k2, C1915b.f15680c);
                c1928k = c1928k2;
            } else {
                c1928k2.p();
            }
            if (c1928k != null) {
                return c1928k;
            }
        }
        return new C1928k(2, interfaceC0905c);
    }

    public static final void t(InterfaceC0910h interfaceC0910h, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC0910h.r(C1940w.f15730c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.N(interfaceC0910h, th);
            } else {
                C4.a.d(interfaceC0910h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                X3.a.a(runtimeException, th);
                th = runtimeException;
            }
            C4.a.d(interfaceC0910h, th);
        }
    }

    public static final InterfaceC1900M u(InterfaceC1922e0 interfaceC1922e0, boolean z5, h0 h0Var) {
        if (interfaceC1922e0 instanceof l0) {
            return ((l0) interfaceC1922e0).W(z5, h0Var);
        }
        return interfaceC1922e0.H(h0Var.j(), z5, new P0(1, h0Var, h0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 13));
    }

    public static final boolean v(InterfaceC0910h interfaceC0910h) {
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC0910h.r(C1940w.f15731e);
        if (interfaceC1922e0 != null) {
            return interfaceC1922e0.d();
        }
        return true;
    }

    public static final boolean w(InterfaceC1942y interfaceC1942y) {
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) interfaceC1942y.c().r(C1940w.f15731e);
        if (interfaceC1922e0 != null) {
            return interfaceC1922e0.d();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [x4.a, x4.s0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final s0 x(InterfaceC1942y interfaceC1942y, InterfaceC0910h interfaceC0910h, EnumC1943z enumC1943z, l4.e eVar) {
        InterfaceC0910h z5 = z(interfaceC1942y, interfaceC0910h);
        enumC1943z.getClass();
        Object m0Var = enumC1943z == EnumC1943z.f15740e ? new m0(z5, eVar) : new AbstractC1913a(z5, true, true);
        m0Var.p0(enumC1943z, m0Var, eVar);
        return m0Var;
    }

    public static /* synthetic */ s0 y(InterfaceC1942y interfaceC1942y, InterfaceC0910h interfaceC0910h, l4.e eVar, int i6) {
        if ((i6 & 1) != 0) {
            interfaceC0910h = C0911i.f11057c;
        }
        return x(interfaceC1942y, interfaceC0910h, (i6 & 2) != 0 ? EnumC1943z.f15739c : EnumC1943z.f15742g, eVar);
    }

    public static final InterfaceC0910h z(InterfaceC1942y interfaceC1942y, InterfaceC0910h interfaceC0910h) {
        InterfaceC0910h o5 = o(interfaceC1942y.c(), interfaceC0910h, true);
        E4.e eVar = AbstractC1898K.a;
        return (o5 == eVar || o5.r(C0906d.f11056c) != null) ? o5 : o5.Y(eVar);
    }
}
