package N2;

/* loaded from: classes.dex */
public final class f extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f3820g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f3822i;

    /* renamed from: j, reason: collision with root package name */
    public int f3823j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, d4.c cVar) {
        super(cVar);
        this.f3822i = hVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3821h = obj;
        this.f3823j |= Integer.MIN_VALUE;
        return this.f3822i.e(null, null, this);
    }
}
