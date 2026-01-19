package x4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;

/* renamed from: x4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1928k extends AbstractC1896I implements InterfaceC1927j, d4.d, D0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15704i = AtomicIntegerFieldUpdater.newUpdater(C1928k.class, "_decisionAndIndex$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15705j = AtomicReferenceFieldUpdater.newUpdater(C1928k.class, Object.class, "_state$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15706k = AtomicReferenceFieldUpdater.newUpdater(C1928k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0905c f15707g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0910h f15708h;

    public C1928k(int i6, InterfaceC0905c interfaceC0905c) {
        super(i6);
        this.f15707g = interfaceC0905c;
        this.f15708h = interfaceC0905c.o();
        this._decisionAndIndex$volatile = SegmentTree.MAX_VALUE;
        this._state$volatile = C1915b.f15680c;
    }

    public static void B(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object G(q0 q0Var, Object obj, int i6, l4.f fVar) {
        if (obj instanceof C1936s) {
            return obj;
        }
        if (i6 != 1 && i6 != 2) {
            return obj;
        }
        if (fVar != null || (q0Var instanceof InterfaceC1926i)) {
            return new C1935r(obj, q0Var instanceof InterfaceC1926i ? (InterfaceC1926i) q0Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        if (this.f15657f != 2) {
            return false;
        }
        InterfaceC0905c interfaceC0905c = this.f15707g;
        AbstractC1276k.d(interfaceC0905c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C4.f.f688k.get((C4.f) interfaceC0905c) != null;
    }

    public String C() {
        return "CancellableContinuation";
    }

    public final void D() {
        InterfaceC0905c interfaceC0905c = this.f15707g;
        Throwable th = null;
        C4.f fVar = interfaceC0905c instanceof C4.f ? (C4.f) interfaceC0905c : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4.f.f688k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                C4.u uVar = C4.a.f679c;
                if (obj != uVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, uVar, this)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != uVar) {
                        break;
                    }
                }
            }
            if (th == null) {
                return;
            }
            p();
            w(th);
        }
    }

    public final void E(Object obj, int i6, l4.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15705j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q0) {
                Object G5 = G((q0) obj2, obj, i6, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G5)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!A()) {
                    p();
                }
                q(i6);
                return;
            }
            if (obj2 instanceof C1929l) {
                C1929l c1929l = (C1929l) obj2;
                c1929l.getClass();
                if (C1929l.f15713c.compareAndSet(c1929l, 0, 1)) {
                    if (fVar != null) {
                        m(fVar, c1929l.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void F(AbstractC1939v abstractC1939v) {
        InterfaceC0905c interfaceC0905c = this.f15707g;
        C4.f fVar = interfaceC0905c instanceof C4.f ? (C4.f) interfaceC0905c : null;
        E(X3.y.a, (fVar != null ? fVar.f689g : null) == abstractC1939v ? 4 : this.f15657f, null);
    }

    public final C4.u H(Object obj, l4.f fVar) {
        C4.u uVar = AbstractC1888A.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15705j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof q0)) {
                return null;
            }
            Object G5 = G((q0) obj2, obj, this.f15657f, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!A()) {
                p();
            }
            return uVar;
        }
    }

    @Override // x4.D0
    public final void a(C4.s sVar, int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f15704i;
            i7 = atomicIntegerFieldUpdater.get(this);
            if ((i7 & SegmentTree.MAX_VALUE) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, ((i7 >> 29) << 29) + i6));
        x(sVar);
    }

    @Override // x4.AbstractC1896I
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15705j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C1936s) {
                return;
            }
            if (!(obj instanceof C1935r)) {
                cancellationException2 = cancellationException;
                C1935r c1935r = new C1935r(obj, (InterfaceC1926i) null, (l4.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1935r)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1935r c1935r2 = (C1935r) obj;
            if (c1935r2.f15725e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1935r a = C1935r.a(c1935r2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC1926i interfaceC1926i = c1935r2.f15722b;
            if (interfaceC1926i != null) {
                j(interfaceC1926i, cancellationException);
            }
            l4.f fVar = c1935r2.f15723c;
            if (fVar != null) {
                m(fVar, cancellationException, c1935r2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // x4.AbstractC1896I
    public final InterfaceC0905c c() {
        return this.f15707g;
    }

    @Override // x4.AbstractC1896I
    public final Throwable d(Object obj) {
        Throwable d6 = super.d(obj);
        if (d6 != null) {
            return d6;
        }
        return null;
    }

    @Override // x4.InterfaceC1927j
    public final void e(Object obj, l4.f fVar) {
        E(obj, this.f15657f, fVar);
    }

    @Override // x4.AbstractC1896I
    public final Object f(Object obj) {
        return obj instanceof C1935r ? ((C1935r) obj).a : obj;
    }

    @Override // d4.d
    public final d4.d g() {
        InterfaceC0905c interfaceC0905c = this.f15707g;
        if (interfaceC0905c instanceof d4.d) {
            return (d4.d) interfaceC0905c;
        }
        return null;
    }

    @Override // x4.AbstractC1896I
    public final Object i() {
        return f15705j.get(this);
    }

    public final void j(InterfaceC1926i interfaceC1926i, Throwable th) {
        try {
            interfaceC1926i.b(th);
        } catch (Throwable th2) {
            AbstractC1888A.t(this.f15708h, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        Throwable a = X3.l.a(obj);
        if (a != null) {
            obj = new C1936s(a, false);
        }
        E(obj, this.f15657f, null);
    }

    @Override // x4.InterfaceC1927j
    public final C4.u l(Object obj, l4.f fVar) {
        return H(obj, fVar);
    }

    public final void m(l4.f fVar, Throwable th, Object obj) {
        InterfaceC0910h interfaceC0910h = this.f15708h;
        try {
            fVar.d(th, obj, interfaceC0910h);
        } catch (Throwable th2) {
            AbstractC1888A.t(interfaceC0910h, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(C4.s sVar, Throwable th) {
        InterfaceC0910h interfaceC0910h = this.f15708h;
        int i6 = f15704i.get(this) & SegmentTree.MAX_VALUE;
        if (i6 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.h(i6, interfaceC0910h);
        } catch (Throwable th2) {
            AbstractC1888A.t(interfaceC0910h, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f15708h;
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15706k;
        InterfaceC1900M interfaceC1900M = (InterfaceC1900M) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1900M == null) {
            return;
        }
        interfaceC1900M.dispose();
        atomicReferenceFieldUpdater.set(this, p0.f15721c);
    }

    public final void q(int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f15704i;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i6 == 4;
                InterfaceC0905c interfaceC0905c = this.f15707g;
                if (!z5 && (interfaceC0905c instanceof C4.f)) {
                    boolean z6 = i6 == 1 || i6 == 2;
                    int i9 = this.f15657f;
                    if (z6 == (i9 == 1 || i9 == 2)) {
                        C4.f fVar = (C4.f) interfaceC0905c;
                        AbstractC1939v abstractC1939v = fVar.f689g;
                        InterfaceC0910h o5 = fVar.f690h.o();
                        if (abstractC1939v.f0(o5)) {
                            abstractC1939v.d0(o5, this);
                            return;
                        }
                        AbstractC1908V a = v0.a();
                        if (a.f15673f >= 4294967296L) {
                            a.i0(this);
                            return;
                        }
                        a.k0(true);
                        try {
                            AbstractC1888A.B(this, interfaceC0905c, true);
                            do {
                            } while (a.m0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1888A.B(this, interfaceC0905c, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
    }

    public Throwable r(l0 l0Var) {
        return l0Var.y();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        InterfaceC1922e0 interfaceC1922e0;
        boolean A5 = A();
        do {
            atomicIntegerFieldUpdater = f15704i;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i7 = i6 >> 29;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (A5) {
                    D();
                }
                Object obj = f15705j.get(this);
                if (obj instanceof C1936s) {
                    throw ((C1936s) obj).a;
                }
                int i8 = this.f15657f;
                if ((i8 != 1 && i8 != 2) || (interfaceC1922e0 = (InterfaceC1922e0) this.f15708h.r(C1940w.f15731e)) == null || interfaceC1922e0.d()) {
                    return f(obj);
                }
                CancellationException y5 = interfaceC1922e0.y();
                b(y5);
                throw y5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, PegdownExtensions.NOT_USED + (536870911 & i6)));
        if (((InterfaceC1900M) f15706k.get(this)) == null) {
            u();
        }
        if (A5) {
            D();
        }
        return EnumC0927a.f11114c;
    }

    public final void t() {
        InterfaceC1900M u5 = u();
        if (u5 == null || (f15705j.get(this) instanceof q0)) {
            return;
        }
        u5.dispose();
        f15706k.set(this, p0.f15721c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C());
        sb.append('(');
        sb.append(AbstractC1888A.E(this.f15707g));
        sb.append("){");
        Object obj = f15705j.get(this);
        sb.append(obj instanceof q0 ? "Active" : obj instanceof C1929l ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1888A.q(this));
        return sb.toString();
    }

    public final InterfaceC1900M u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) this.f15708h.r(C1940w.f15731e);
        if (interfaceC1922e0 == null) {
            return null;
        }
        InterfaceC1900M u5 = AbstractC1888A.u(interfaceC1922e0, true, new C1930m(this, 0));
        do {
            atomicReferenceFieldUpdater = f15706k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, u5)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return u5;
    }

    public final void v(l4.c cVar) {
        x(new C1925h(cVar, 1));
    }

    @Override // x4.InterfaceC1927j
    public final boolean w(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15705j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q0)) {
                return false;
            }
            C1929l c1929l = new C1929l(this, th, (obj instanceof InterfaceC1926i) || (obj instanceof C4.s));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1929l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q0 q0Var = (q0) obj;
            if (q0Var instanceof InterfaceC1926i) {
                j((InterfaceC1926i) obj, th);
            } else if (q0Var instanceof C4.s) {
                n((C4.s) obj, th);
            }
            if (!A()) {
                p();
            }
            q(this.f15657f);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        B(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(x4.q0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = x4.C1928k.f15705j
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof x4.C1915b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto Lae
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof x4.InterfaceC1926i
            r3 = 0
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof C4.s
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof x4.C1936s
            if (r1 == 0) goto L5b
            r0 = r2
            x4.s r0 = (x4.C1936s) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = x4.C1936s.f15726b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L57
            boolean r1 = r2 instanceof x4.C1929l
            if (r1 == 0) goto Lae
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.a
        L42:
            boolean r0 = r8 instanceof x4.InterfaceC1926i
            if (r0 == 0) goto L4c
            x4.i r8 = (x4.InterfaceC1926i) r8
            r7.j(r8, r3)
            return
        L4c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            m4.AbstractC1276k.d(r8, r0)
            C4.s r8 = (C4.s) r8
            r7.n(r8, r3)
            return
        L57:
            B(r8, r2)
            throw r3
        L5b:
            boolean r1 = r2 instanceof x4.C1935r
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L94
            r1 = r2
            x4.r r1 = (x4.C1935r) r1
            x4.i r5 = r1.f15722b
            if (r5 != 0) goto L90
            boolean r5 = r8 instanceof C4.s
            if (r5 == 0) goto L6d
            return
        L6d:
            m4.AbstractC1276k.d(r8, r4)
            r4 = r8
            x4.i r4 = (x4.InterfaceC1926i) r4
            java.lang.Throwable r5 = r1.f15725e
            if (r5 == 0) goto L7b
            r7.j(r4, r5)
            return
        L7b:
            r5 = 29
            x4.r r1 = x4.C1935r.a(r1, r4, r3, r5)
        L81:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L88
            goto Lae
        L88:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L81
            goto L0
        L90:
            B(r8, r2)
            throw r3
        L94:
            boolean r1 = r8 instanceof C4.s
            if (r1 == 0) goto L99
            return
        L99:
            m4.AbstractC1276k.d(r8, r4)
            r3 = r8
            x4.i r3 = (x4.InterfaceC1926i) r3
            x4.r r1 = new x4.r
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        La8:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto Laf
        Lae:
            return
        Laf:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto La8
            goto L0
        Lb7:
            B(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C1928k.x(x4.q0):void");
    }

    public final boolean y() {
        return f15705j.get(this) instanceof q0;
    }

    @Override // x4.InterfaceC1927j
    public final void z(Object obj) {
        q(this.f15657f);
    }
}
