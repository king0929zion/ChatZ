package E4;

import x4.AbstractC1939v;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final e f1362g;

    /* JADX WARN: Type inference failed for: r0v0, types: [x4.v, E4.e, E4.h] */
    static {
        int i6 = k.f1368c;
        int i7 = k.f1369d;
        long j3 = k.f1370e;
        String str = k.a;
        ?? abstractC1939v = new AbstractC1939v();
        abstractC1939v.f1363f = new c(j3, str, i6, i7);
        f1362g = abstractC1939v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // x4.AbstractC1939v
    public final AbstractC1939v g0(int i6) {
        C4.a.a(i6);
        return i6 >= k.f1368c ? this : super.g0(i6);
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
