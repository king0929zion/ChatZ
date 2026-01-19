package N1;

/* loaded from: classes.dex */
public final class D extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f3643g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3644h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f3645i;

    /* renamed from: j, reason: collision with root package name */
    public int f3646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Q q3, d4.c cVar) {
        super(cVar);
        this.f3645i = q3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3644h = obj;
        this.f3646j |= Integer.MIN_VALUE;
        return Q.a(this.f3645i, null, this);
    }
}
