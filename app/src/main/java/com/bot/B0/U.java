package B0;

/* loaded from: classes.dex */
public final class U extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V f412h;

    /* renamed from: i, reason: collision with root package name */
    public int f413i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v5, d4.a aVar) {
        super(aVar);
        this.f412h = v5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f411g = obj;
        this.f413i |= Integer.MIN_VALUE;
        return this.f412h.j(0L, null, this);
    }
}
