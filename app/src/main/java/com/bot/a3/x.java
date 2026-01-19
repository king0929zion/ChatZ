package a3;

/* loaded from: classes.dex */
public final class x extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0808F f10763h;

    /* renamed from: i, reason: collision with root package name */
    public int f10764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0808F c0808f, d4.c cVar) {
        super(cVar);
        this.f10763h = c0808f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10762g = obj;
        this.f10764i |= Integer.MIN_VALUE;
        return this.f10763h.e(null, null, null, null, null, null, null, null, false, this);
    }
}
