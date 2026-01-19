package d5;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class q implements I {

    /* renamed from: c, reason: collision with root package name */
    public final I f11498c;

    public q(I i6) {
        AbstractC1276k.f(i6, "delegate");
        this.f11498c = i6;
    }

    @Override // d5.I
    public long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        return this.f11498c.W(j3, c0949i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11498c.close();
    }

    @Override // d5.I
    public final K timeout() {
        return this.f11498c.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f11498c + ')';
    }
}
