package F2;

/* loaded from: classes.dex */
public final class g extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public int f1563g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f1565i;

    /* renamed from: j, reason: collision with root package name */
    public int f1566j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, d4.c cVar) {
        super(cVar);
        this.f1565i = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1564h = obj;
        this.f1566j |= Integer.MIN_VALUE;
        return this.f1565i.f(this);
    }
}
