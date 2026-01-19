package Q1;

import Z1.i;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: g, reason: collision with root package name */
    public final i f6356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Y1.a aVar, String str) {
        super(aVar, str);
        AbstractC1276k.f(aVar, "db");
        AbstractC1276k.f(str, "sql");
        this.f6356g = aVar.t(str);
    }

    @Override // X1.c
    public final String M(int i6) {
        c();
        h5.e.l0(21, "no row");
        throw null;
    }

    @Override // X1.c
    public final boolean Z() {
        c();
        this.f6356g.f9883e.execute();
        return false;
    }

    @Override // X1.c
    public final void a(long j3, int i6) {
        c();
        this.f6356g.a(j3, i6);
    }

    @Override // X1.c
    public final void b(double d6, int i6) {
        c();
        this.f6356g.b(d6, i6);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6356g.close();
        this.f6359f = true;
    }

    @Override // X1.c
    public final void e(int i6) {
        c();
        this.f6356g.e(i6);
    }

    @Override // X1.c
    public final int getColumnCount() {
        c();
        return 0;
    }

    @Override // X1.c
    public final String getColumnName(int i6) {
        c();
        h5.e.l0(21, "no row");
        throw null;
    }

    @Override // X1.c
    public final double getDouble(int i6) {
        c();
        h5.e.l0(21, "no row");
        throw null;
    }

    @Override // X1.c
    public final long getLong(int i6) {
        c();
        h5.e.l0(21, "no row");
        throw null;
    }

    @Override // X1.c
    public final boolean isNull(int i6) {
        c();
        h5.e.l0(21, "no row");
        throw null;
    }

    @Override // X1.c
    public final void reset() {
    }

    @Override // X1.c
    public final void z(int i6, String str) {
        AbstractC1276k.f(str, "value");
        c();
        this.f6356g.o(i6, str);
    }
}
