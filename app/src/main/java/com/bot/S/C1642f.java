package s;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1642f extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1643g f14705h;

    /* renamed from: i, reason: collision with root package name */
    public int f14706i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642f(C1643g c1643g, d4.c cVar) {
        super(cVar);
        this.f14705h = c1643g;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14704g = obj;
        this.f14706i |= Integer.MIN_VALUE;
        return C1643g.b(this.f14705h, null, S.l.f7374V, S.l.f7374V, null, this);
    }
}
