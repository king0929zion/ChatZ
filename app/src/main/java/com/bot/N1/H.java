package N1;

/* loaded from: classes.dex */
public final class H extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Q f3659g;

    /* renamed from: h, reason: collision with root package name */
    public M.q f3660h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3661i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f3662j;

    /* renamed from: k, reason: collision with root package name */
    public int f3663k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Q q3, d4.c cVar) {
        super(cVar);
        this.f3662j = q3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3661i = obj;
        this.f3663k |= Integer.MIN_VALUE;
        return Q.b(this.f3662j, this);
    }
}
