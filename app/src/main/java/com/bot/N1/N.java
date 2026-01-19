package N1;

/* loaded from: classes.dex */
public final class N extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public M.q f3691g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f3693i;

    /* renamed from: j, reason: collision with root package name */
    public int f3694j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Q q3, d4.c cVar) {
        super(cVar);
        this.f3693i = q3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3692h = obj;
        this.f3694j |= Integer.MIN_VALUE;
        return this.f3693i.e(this);
    }
}
