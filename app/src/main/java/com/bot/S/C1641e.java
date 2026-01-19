package s;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1641e extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1643g f14702h;

    /* renamed from: i, reason: collision with root package name */
    public int f14703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1641e(C1643g c1643g, d4.c cVar) {
        super(cVar);
        this.f14702h = c1643g;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14701g = obj;
        this.f14703i |= Integer.MIN_VALUE;
        return this.f14702h.d(null, S.l.f7374V, null, this);
    }
}
