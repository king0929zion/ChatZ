package H4;

import C4.s;
import C4.u;
import D.b1;
import X3.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x4.D0;
import x4.InterfaceC1927j;

/* loaded from: classes.dex */
public class h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2055f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2056g = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2057h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2058i = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2059j = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final int f2060c;
    private volatile /* synthetic */ long deqIdx$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f2061e;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i6) {
        this.f2060c = i6;
        if (i6 <= 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i6;
        this.f2061e = new b1(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.e(r3, r4.f2061e);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d4.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = H4.h.f2059j
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f2060c
            if (r1 > r2) goto L0
            X3.y r3 = X3.y.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            b4.c r5 = Y4.d.K(r5)
            x4.k r5 = x4.AbstractC1888A.s(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            D.b1 r0 = r4.f2061e     // Catch: java.lang.Throwable -> L3f
            r5.e(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.s()
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.h.a(d4.c):java.lang.Object");
    }

    public final boolean b(D0 d02) {
        Object b5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2057h;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2058i.getAndIncrement(this);
        f fVar = f.f2053l;
        long j3 = andIncrement / j.f2066f;
        loop0: while (true) {
            b5 = C4.a.b(kVar, j3, fVar);
            if (!C4.a.e(b5)) {
                s c6 = C4.a.c(b5);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f715f >= c6.f715f) {
                        break loop0;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) C4.a.c(b5);
        AtomicReferenceArray atomicReferenceArray = kVar2.f2067h;
        int i6 = (int) (andIncrement % j.f2066f);
        while (!atomicReferenceArray.compareAndSet(i6, null, d02)) {
            if (atomicReferenceArray.get(i6) != null) {
                u uVar = j.f2062b;
                u uVar2 = j.f2063c;
                while (!atomicReferenceArray.compareAndSet(i6, uVar, uVar2)) {
                    if (atomicReferenceArray.get(i6) != uVar) {
                        return false;
                    }
                }
                ((InterfaceC1927j) d02).e(y.a, this.f2061e);
                return true;
            }
        }
        d02.a(kVar2, i6);
        return true;
    }

    public final void e() {
        int i6;
        Object b5;
        boolean z5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2059j;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i7 = this.f2060c;
            if (andIncrement >= i7) {
                do {
                    i6 = atomicIntegerFieldUpdater.get(this);
                    if (i6 <= i7) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, i7));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i7).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2055f;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f2056g.getAndIncrement(this);
            long j3 = andIncrement2 / j.f2066f;
            g gVar = g.f2054l;
            while (true) {
                b5 = C4.a.b(kVar, j3, gVar);
                if (C4.a.e(b5)) {
                    break;
                }
                s c6 = C4.a.c(b5);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f715f >= c6.f715f) {
                        break;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            }
            k kVar2 = (k) C4.a.c(b5);
            AtomicReferenceArray atomicReferenceArray = kVar2.f2067h;
            kVar2.a();
            z5 = false;
            if (kVar2.f715f <= j3) {
                int i8 = (int) (andIncrement2 % j.f2066f);
                Object andSet = atomicReferenceArray.getAndSet(i8, j.f2062b);
                if (andSet == null) {
                    int i9 = j.a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (atomicReferenceArray.get(i8) == j.f2063c) {
                            z5 = true;
                            break;
                        }
                    }
                    u uVar = j.f2062b;
                    u uVar2 = j.f2064d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i8, uVar, uVar2)) {
                            if (atomicReferenceArray.get(i8) != uVar) {
                                break;
                            }
                        } else {
                            z5 = true;
                            break;
                        }
                    }
                    z5 = !z5;
                } else if (andSet != j.f2065e) {
                    boolean z6 = andSet instanceof InterfaceC1927j;
                    y yVar = y.a;
                    if (!z6) {
                        if (!(andSet instanceof F4.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((F4.e) ((F4.f) andSet)).g(this, yVar) != 0) {
                        }
                        z5 = true;
                        break;
                        break;
                    }
                    InterfaceC1927j interfaceC1927j = (InterfaceC1927j) andSet;
                    u l3 = interfaceC1927j.l(yVar, this.f2061e);
                    if (l3 != null) {
                        interfaceC1927j.z(l3);
                        z5 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z5);
    }
}
