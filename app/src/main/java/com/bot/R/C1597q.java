package r;

/* renamed from: r.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597q extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1606t f14444h;

    /* renamed from: i, reason: collision with root package name */
    public int f14445i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597q(C1606t c1606t, d4.c cVar) {
        super(cVar);
        this.f14444h = c1606t;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14443g = obj;
        this.f14445i |= Integer.MIN_VALUE;
        return this.f14444h.a(null, null, null, this);
    }
}
