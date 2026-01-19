package F3;

/* loaded from: classes.dex */
public final class g extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f1594h;

    /* renamed from: i, reason: collision with root package name */
    public int f1595i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, d4.c cVar) {
        super(cVar);
        this.f1594h = kVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f1593g = obj;
        this.f1595i |= Integer.MIN_VALUE;
        return this.f1594h.a(null, this);
    }
}
