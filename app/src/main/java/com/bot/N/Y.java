package n;

/* loaded from: classes.dex */
public final class Y extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13065h;

    /* renamed from: i, reason: collision with root package name */
    public int f13066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1321e0 c1321e0, d4.c cVar) {
        super(cVar);
        this.f13065h = c1321e0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f13064g = obj;
        this.f13066i |= Integer.MIN_VALUE;
        return C1321e0.u(this.f13065h, this);
    }
}
