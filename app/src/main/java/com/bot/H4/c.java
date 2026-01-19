package H4;

import C4.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class c extends h implements a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2052k = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.a;
    }

    @Override // H4.a
    public final void c(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2052k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = d.a;
            if (obj2 != uVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    e();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = r0.f2051e;
        H4.c.f2052k.set(r2, null);
        r3 = r0.f2050c;
        r3.E(r1, r3.f15657f, new D.b1(new D.C0056a(2, r2, r0), 16));
     */
    @Override // H4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(b4.InterfaceC0905c r7) {
        /*
            r6 = this;
            boolean r0 = r6.g()
            X3.y r1 = X3.y.a
            if (r0 == 0) goto L9
            goto L52
        L9:
            b4.c r7 = Y4.d.K(r7)
            x4.k r7 = x4.AbstractC1888A.s(r7)
            H4.b r0 = new H4.b     // Catch: java.lang.Throwable -> L53
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L53
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = H4.h.f2059j     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L53
            int r3 = r6.f2060c     // Catch: java.lang.Throwable -> L53
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3f
            H4.c r2 = r0.f2051e     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = H4.c.f2052k     // Catch: java.lang.Throwable -> L53
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L53
            x4.k r3 = r0.f2050c     // Catch: java.lang.Throwable -> L53
            D.a r4 = new D.a     // Catch: java.lang.Throwable -> L53
            r5 = 2
            r4.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r3.f15657f     // Catch: java.lang.Throwable -> L53
            D.b1 r2 = new D.b1     // Catch: java.lang.Throwable -> L53
            r5 = 16
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L53
            r3.E(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L45
        L3f:
            boolean r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L16
        L45:
            java.lang.Object r7 = r7.s()
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r7 != r0) goto L4e
            goto L4f
        L4e:
            r7 = r1
        L4f:
            if (r7 != r0) goto L52
            return r7
        L52:
            return r1
        L53:
            r0 = move-exception
            r7.D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.c.d(b4.c):java.lang.Object");
    }

    public final boolean f() {
        return Math.max(h.f2059j.get(this), 0) == 0;
    }

    public final boolean g() {
        int i6;
        char c6;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f2059j;
            int i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = this.f2060c;
            if (i7 > i8) {
                do {
                    i6 = atomicIntegerFieldUpdater.get(this);
                    if (i6 > i8) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, i8));
            } else {
                if (i7 <= 0) {
                    c6 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 - 1)) {
                    f2052k.set(this, null);
                    c6 = 0;
                    break;
                }
            }
        }
        if (c6 == 0) {
            return true;
        }
        if (c6 == 1) {
            return false;
        }
        if (c6 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        return "Mutex@" + AbstractC1888A.q(this) + "[isLocked=" + f() + ",owner=" + f2052k.get(this) + ']';
    }
}
