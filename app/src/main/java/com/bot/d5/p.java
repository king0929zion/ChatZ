package d5;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class p implements G {

    /* renamed from: c, reason: collision with root package name */
    public final G f11497c;

    public p(G g3) {
        AbstractC1276k.f(g3, "delegate");
        this.f11497c = g3;
    }

    @Override // d5.G
    public void T(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "source");
        this.f11497c.T(j3, c0949i);
    }

    @Override // d5.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11497c.close();
    }

    @Override // d5.G, java.io.Flushable
    public void flush() {
        this.f11497c.flush();
    }

    @Override // d5.G
    public final K timeout() {
        return this.f11497c.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f11497c + ')';
    }
}
