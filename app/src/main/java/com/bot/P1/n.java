package P1;

import Y3.C;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n implements X1.c {

    /* renamed from: c, reason: collision with root package name */
    public final X1.c f4608c;

    /* renamed from: e, reason: collision with root package name */
    public final long f4609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f4610f;

    public n(u uVar, X1.c cVar) {
        AbstractC1276k.f(cVar, "delegate");
        this.f4610f = uVar;
        this.f4608c = cVar;
        this.f4609e = C.k();
    }

    @Override // X1.c
    public final String M(int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.M(i6);
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final boolean Z() {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.Z();
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final void a(long j3, int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            this.f4608c.a(j3, i6);
        } else {
            h5.e.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // X1.c
    public final void b(double d6, int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            this.f4608c.b(d6, i6);
        } else {
            h5.e.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            this.f4608c.close();
        } else {
            h5.e.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // X1.c
    public final void e(int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            this.f4608c.e(i6);
        } else {
            h5.e.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // X1.c
    public final int getColumnCount() {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.getColumnCount();
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final String getColumnName(int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.getColumnName(i6);
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final double getDouble(int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.getDouble(i6);
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final long getLong(int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.getLong(i6);
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final boolean isNull(int i6) {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            return this.f4608c.isNull(i6);
        }
        h5.e.l0(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // X1.c
    public final void reset() {
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            this.f4608c.reset();
        } else {
            h5.e.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // X1.c
    public final void z(int i6, String str) {
        AbstractC1276k.f(str, "value");
        if (this.f4610f.f4639d.get()) {
            h5.e.l0(21, "Statement is recycled");
            throw null;
        }
        if (this.f4609e == C.k()) {
            this.f4608c.z(i6, str);
        } else {
            h5.e.l0(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
