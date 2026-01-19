package W3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class c implements e {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9017h;

    /* renamed from: c, reason: collision with root package name */
    public final int f9018c;

    /* renamed from: e, reason: collision with root package name */
    public final int f9019e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f9020f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9021g;
    private volatile long top;

    static {
        AtomicLongFieldUpdater newUpdater = AtomicLongFieldUpdater.newUpdater(c.class, "top");
        AbstractC1276k.e(newUpdater, "newUpdater(Owner::class.java, p.name)");
        f9017h = newUpdater;
    }

    public c(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "capacity should be positive but it is ").toString());
        }
        if (i6 > 536870911) {
            throw new IllegalArgumentException(B3.e.h(i6, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int highestOneBit = Integer.highestOneBit((i6 * 4) - 1) * 2;
        this.f9018c = highestOneBit;
        this.f9019e = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        int i7 = highestOneBit + 1;
        this.f9020f = new AtomicReferenceArray(i7);
        this.f9021g = new int[i7];
    }

    @Override // W3.e
    public final void X(Object obj) {
        long j3;
        long j4;
        AbstractC1276k.f(obj, "instance");
        j(obj);
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f9019e) + 1;
        for (int i6 = 0; i6 < 8; i6++) {
            AtomicReferenceArray atomicReferenceArray = this.f9020f;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = this.f9018c;
                    }
                }
            }
            if (identityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j3 = this.top;
                j4 = ((((j3 >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.f9021g[identityHashCode] = (int) (4294967295L & j3);
            } while (!f9017h.compareAndSet(this, j3, j4));
            return;
        }
        d(obj);
    }

    public Object c(Object obj) {
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Object h3 = h();
            if (h3 == null) {
                return;
            } else {
                d(h3);
            }
        }
    }

    public void d(Object obj) {
        AbstractC1276k.f(obj, "instance");
    }

    public abstract Object f();

    public final Object h() {
        long j3;
        int i6;
        c cVar;
        long j4;
        do {
            j3 = this.top;
            if (j3 != 0) {
                j4 = ((j3 >> 32) & 4294967295L) + 1;
                i6 = (int) (4294967295L & j3);
                if (i6 != 0) {
                    cVar = this;
                }
            }
            i6 = 0;
            cVar = this;
            break;
        } while (!f9017h.compareAndSet(cVar, j3, (j4 << 32) | this.f9021g[i6]));
        if (i6 == 0) {
            return null;
        }
        return cVar.f9020f.getAndSet(i6, null);
    }

    public void j(Object obj) {
        AbstractC1276k.f(obj, "instance");
    }

    @Override // W3.e
    public final Object v() {
        Object h3 = h();
        return h3 != null ? c(h3) : f();
    }
}
