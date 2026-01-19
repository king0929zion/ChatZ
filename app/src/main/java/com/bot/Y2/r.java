package Y2;

/* loaded from: classes.dex */
public final class r extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0730t f9762h;

    /* renamed from: i, reason: collision with root package name */
    public int f9763i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0730t c0730t, d4.c cVar) {
        super(cVar);
        this.f9762h = c0730t;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9761g = obj;
        this.f9763i |= Integer.MIN_VALUE;
        return C0730t.c(this.f9762h, null, this);
    }
}
