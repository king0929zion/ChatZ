package x4;

/* renamed from: x4.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1905S implements Runnable, Comparable, InterfaceC1900M {
    private volatile Object _heap;

    /* renamed from: c, reason: collision with root package name */
    public long f15666c;

    /* renamed from: e, reason: collision with root package name */
    public int f15667e = -1;

    public AbstractRunnableC1905S(long j3) {
        this.f15666c = j3;
    }

    public final int b(long j3, C1906T c1906t, AbstractC1907U abstractC1907U) {
        synchronized (this) {
            if (this._heap == AbstractC1888A.f15638b) {
                return 2;
            }
            synchronized (c1906t) {
                try {
                    AbstractRunnableC1905S[] abstractRunnableC1905SArr = c1906t.a;
                    AbstractRunnableC1905S abstractRunnableC1905S = abstractRunnableC1905SArr != null ? abstractRunnableC1905SArr[0] : null;
                    if (AbstractC1907U.f15671l.get(abstractC1907U) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC1905S == null) {
                        c1906t.f15668c = j3;
                    } else {
                        long j4 = abstractRunnableC1905S.f15666c;
                        if (j4 - j3 < 0) {
                            j3 = j4;
                        }
                        if (j3 - c1906t.f15668c > 0) {
                            c1906t.f15668c = j3;
                        }
                    }
                    long j5 = this.f15666c;
                    long j6 = c1906t.f15668c;
                    if (j5 - j6 < 0) {
                        this.f15666c = j6;
                    }
                    c1906t.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(C1906T c1906t) {
        if (this._heap == AbstractC1888A.f15638b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c1906t;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f15666c - ((AbstractRunnableC1905S) obj).f15666c;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    @Override // x4.InterfaceC1900M
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C4.u uVar = AbstractC1888A.f15638b;
                if (obj == uVar) {
                    return;
                }
                C1906T c1906t = obj instanceof C1906T ? (C1906T) obj : null;
                if (c1906t != null) {
                    synchronized (c1906t) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C4.y ? (C4.y) obj2 : null) != null) {
                            c1906t.b(this.f15667e);
                        }
                    }
                }
                this._heap = uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f15666c + ']';
    }
}
