package x4;

import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m4.AbstractC1276k;

/* renamed from: x4.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1907U implements AbstractC1908V, InterfaceC1893F {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15669j = AtomicReferenceFieldUpdater.newUpdater(AbstractC1907U.class, Object.class, "_queue$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15670k = AtomicReferenceFieldUpdater.newUpdater(AbstractC1907U.class, Object.class, "_delayed$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15671l = AtomicIntegerFieldUpdater.newUpdater(AbstractC1907U.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public InterfaceC1900M c(long j3, Runnable runnable, InterfaceC0910h interfaceC0910h) {
        return AbstractC1890C.a.c(j3, runnable, interfaceC0910h);
    }

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        o0(runnable);
    }

    @Override // x4.AbstractC1908V
    public final long l0() {
        Runnable runnable;
        AbstractRunnableC1905S abstractRunnableC1905S;
        C4.u uVar = AbstractC1888A.f15639c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15669j;
        if (!m0()) {
            p0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C4.n)) {
                    if (obj == uVar) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                C4.n nVar = (C4.n) obj;
                Object d6 = nVar.d();
                if (d6 != C4.n.f709g) {
                    runnable = (Runnable) d6;
                    break;
                }
                C4.n c6 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c6) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            Y3.j jVar = this.f15675h;
            if (((jVar == null || jVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C4.n) {
                        long j3 = C4.n.f708f.get((C4.n) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == uVar) {
                        return Long.MAX_VALUE;
                    }
                }
                C1906T c1906t = (C1906T) f15670k.get(this);
                if (c1906t != null) {
                    synchronized (c1906t) {
                        AbstractRunnableC1905S[] abstractRunnableC1905SArr = c1906t.a;
                        abstractRunnableC1905S = abstractRunnableC1905SArr != null ? abstractRunnableC1905SArr[0] : null;
                    }
                    if (abstractRunnableC1905S != null) {
                        long nanoTime = abstractRunnableC1905S.f15666c - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void o0(Runnable runnable) {
        p0();
        if (!q0(runnable)) {
            RunnableC1889B.f15648m.o0(runnable);
            return;
        }
        Thread j02 = j0();
        if (Thread.currentThread() != j02) {
            LockSupport.unpark(j02);
        }
    }

    @Override // x4.InterfaceC1893F
    public final void p(long j3, C1928k c1928k) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C1903P c1903p = new C1903P(this, j4 + nanoTime, c1928k);
            s0(nanoTime, c1903p);
            c1928k.x(new C1925h(c1903p, 2));
        }
    }

    public final void p0() {
        AbstractRunnableC1905S abstractRunnableC1905S;
        C1906T c1906t = (C1906T) f15670k.get(this);
        if (c1906t == null || C4.y.f722b.get(c1906t) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (c1906t) {
                try {
                    AbstractRunnableC1905S[] abstractRunnableC1905SArr = c1906t.a;
                    AbstractRunnableC1905S abstractRunnableC1905S2 = abstractRunnableC1905SArr != null ? abstractRunnableC1905SArr[0] : null;
                    if (abstractRunnableC1905S2 != null) {
                        abstractRunnableC1905S = ((nanoTime - abstractRunnableC1905S2.f15666c) > 0L ? 1 : ((nanoTime - abstractRunnableC1905S2.f15666c) == 0L ? 0 : -1)) >= 0 ? q0(abstractRunnableC1905S2) : false ? c1906t.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1905S != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = x4.AbstractC1907U.f15669j
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = x4.AbstractC1907U.f15671l
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof C4.n
            if (r4 == 0) goto L47
            r4 = r1
            C4.n r4 = (C4.n) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            C4.n r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            C4.u r4 = x4.AbstractC1888A.f15639c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            C4.n r3 = new C4.n
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC1907U.q0(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((C4.y.f722b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r0() {
        /*
            r7 = this;
            Y3.j r0 = r7.f15675h
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = x4.AbstractC1907U.f15670k
            java.lang.Object r0 = r0.get(r7)
            x4.T r0 = (x4.C1906T) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = C4.y.f722b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = x4.AbstractC1907U.f15669j
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof C4.n
            if (r3 == 0) goto L4f
            C4.n r0 = (C4.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = C4.n.f708f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            C4.u r3 = x4.AbstractC1888A.f15639c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC1907U.r0():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [x4.T, java.lang.Object] */
    public final void s0(long j3, AbstractRunnableC1905S abstractRunnableC1905S) {
        int b5;
        Thread j02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15670k;
        if (f15671l.get(this) != 0) {
            b5 = 1;
        } else {
            C1906T c1906t = (C1906T) atomicReferenceFieldUpdater.get(this);
            if (c1906t == null) {
                Object obj = new Object();
                obj.f15668c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                AbstractC1276k.c(obj2);
                c1906t = (C1906T) obj2;
            }
            b5 = abstractRunnableC1905S.b(j3, c1906t, this);
        }
        if (b5 != 0) {
            if (b5 == 1) {
                n0(j3, abstractRunnableC1905S);
                return;
            } else {
                if (b5 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C1906T c1906t2 = (C1906T) atomicReferenceFieldUpdater.get(this);
        if (c1906t2 != null) {
            synchronized (c1906t2) {
                AbstractRunnableC1905S[] abstractRunnableC1905SArr = c1906t2.a;
                r2 = abstractRunnableC1905SArr != null ? abstractRunnableC1905SArr[0] : null;
            }
        }
        if (r2 != abstractRunnableC1905S || Thread.currentThread() == (j02 = j0())) {
            return;
        }
        LockSupport.unpark(j02);
    }

    @Override // x4.AbstractC1908V
    public void shutdown() {
        AbstractRunnableC1905S b5;
        v0.a.set(null);
        f15671l.set(this, 1);
        C4.u uVar = AbstractC1888A.f15639c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15669j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C4.n)) {
                    if (obj != uVar) {
                        C4.n nVar = new C4.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C4.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (l0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C1906T c1906t = (C1906T) f15670k.get(this);
            if (c1906t == null) {
                return;
            }
            synchronized (c1906t) {
                b5 = C4.y.f722b.get(c1906t) > 0 ? c1906t.b(0) : null;
            }
            if (b5 == null) {
                return;
            } else {
                n0(nanoTime, b5);
            }
        }
    }
}
