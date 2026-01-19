package Y2;

/* loaded from: classes.dex */
public final class Q extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f9669g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W f9671i;

    /* renamed from: j, reason: collision with root package name */
    public int f9672j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(W w5, d4.c cVar) {
        super(cVar);
        this.f9671i = w5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9670h = obj;
        this.f9672j |= Integer.MIN_VALUE;
        return W.f(this.f9671i, this);
    }
}
