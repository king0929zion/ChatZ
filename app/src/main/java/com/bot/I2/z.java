package I2;

/* loaded from: classes.dex */
public final class z extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A f2702h;

    /* renamed from: i, reason: collision with root package name */
    public int f2703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a, d4.c cVar) {
        super(cVar);
        this.f2702h = a;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2701g = obj;
        this.f2703i |= Integer.MIN_VALUE;
        return this.f2702h.c(this);
    }
}
