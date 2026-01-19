package F2;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1550g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f1551h;

    /* renamed from: i, reason: collision with root package name */
    public int f1552i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, d4.c cVar) {
        super(cVar);
        this.f1551h = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1550g = obj;
        this.f1552i |= Integer.MIN_VALUE;
        return this.f1551h.b(null, null, null, this);
    }
}
