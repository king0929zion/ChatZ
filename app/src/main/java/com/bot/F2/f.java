package F2;

/* loaded from: classes.dex */
public final class f extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f1561h;

    /* renamed from: i, reason: collision with root package name */
    public int f1562i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, d4.c cVar) {
        super(cVar);
        this.f1561h = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1560g = obj;
        this.f1562i |= Integer.MIN_VALUE;
        return this.f1561h.e(this);
    }
}
