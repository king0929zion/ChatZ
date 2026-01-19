package A0;

/* loaded from: classes.dex */
public final class i extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public long f48g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f50i;

    /* renamed from: j, reason: collision with root package name */
    public int f51j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, d4.c cVar) {
        super(cVar);
        this.f50i = jVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f49h = obj;
        this.f51j |= Integer.MIN_VALUE;
        return this.f50i.y0(0L, this);
    }
}
