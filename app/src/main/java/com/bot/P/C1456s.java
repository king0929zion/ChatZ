package p;

/* renamed from: p.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1456s extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public long f13788g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1459u f13790i;

    /* renamed from: j, reason: collision with root package name */
    public int f13791j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456s(C1459u c1459u, d4.c cVar) {
        super(cVar);
        this.f13790i = c1459u;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f13789h = obj;
        this.f13791j |= Integer.MIN_VALUE;
        return this.f13790i.b(0L, null, this);
    }
}
