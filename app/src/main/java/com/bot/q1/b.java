package Q1;

/* loaded from: classes.dex */
public final class b implements P1.b {

    /* renamed from: c, reason: collision with root package name */
    public final A3.c f6344c;

    public b(A3.c cVar) {
        this.f6344c = cVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((Y1.b) this.f6344c.f119e).close();
    }

    @Override // P1.b
    public final Object l(boolean z5, l4.e eVar, d4.c cVar) {
        Y1.b bVar = (Y1.b) this.f6344c.f119e;
        bVar.getClass();
        return eVar.m(new d(new a(bVar.G())), cVar);
    }
}
