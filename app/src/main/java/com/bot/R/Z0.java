package r;

/* loaded from: classes.dex */
public final class Z0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14206h;

    /* renamed from: i, reason: collision with root package name */
    public int f14207i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C1551a1 c1551a1, d4.c cVar) {
        super(cVar);
        this.f14206h = c1551a1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14205g = obj;
        this.f14207i |= Integer.MIN_VALUE;
        return this.f14206h.g(this);
    }
}
