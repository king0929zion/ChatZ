package Q;

/* loaded from: classes.dex */
public final class K2 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public J2 f5340g;

    /* renamed from: h, reason: collision with root package name */
    public H4.a f5341h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2 f5343j;

    /* renamed from: k, reason: collision with root package name */
    public int f5344k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(L2 l22, d4.c cVar) {
        super(cVar);
        this.f5343j = l22;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f5342i = obj;
        this.f5344k |= Integer.MIN_VALUE;
        return this.f5343j.a(null, this);
    }
}
