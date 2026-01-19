package a3;

/* loaded from: classes.dex */
public final class y extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f10765g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10766h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f10767i;

    /* renamed from: j, reason: collision with root package name */
    public int f10768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0808F c0808f, d4.c cVar) {
        super(cVar);
        this.f10767i = c0808f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10766h = obj;
        this.f10768j |= Integer.MIN_VALUE;
        return this.f10767i.f(null, this);
    }
}
