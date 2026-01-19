package r;

/* loaded from: classes.dex */
public final class Y0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f14197h;

    /* renamed from: i, reason: collision with root package name */
    public int f14198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(C1551a1 c1551a1, d4.c cVar) {
        super(cVar);
        this.f14197h = c1551a1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14196g = obj;
        this.f14198i |= Integer.MIN_VALUE;
        return this.f14197h.e(this);
    }
}
