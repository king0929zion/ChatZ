package F2;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f1548h;

    /* renamed from: i, reason: collision with root package name */
    public int f1549i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, d4.c cVar) {
        super(cVar);
        this.f1548h = iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1547g = obj;
        this.f1549i |= Integer.MIN_VALUE;
        return this.f1548h.a(null, null, this);
    }
}
