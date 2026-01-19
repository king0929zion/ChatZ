package r;

/* renamed from: r.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590n1 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public long f14403g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1593o1 f14405i;

    /* renamed from: j, reason: collision with root package name */
    public int f14406j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590n1(C1593o1 c1593o1, d4.c cVar) {
        super(cVar);
        this.f14405i = c1593o1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14404h = obj;
        this.f14406j |= Integer.MIN_VALUE;
        return this.f14405i.z(0L, 0L, this);
    }
}
