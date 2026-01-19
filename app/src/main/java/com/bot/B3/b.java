package B3;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public d f504g;

    /* renamed from: h, reason: collision with root package name */
    public String f505h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f506i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f507j;

    /* renamed from: k, reason: collision with root package name */
    public int f508k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d4.c cVar) {
        super(cVar);
        this.f507j = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f506i = obj;
        this.f508k |= Integer.MIN_VALUE;
        return this.f507j.c(null, this);
    }
}
