package Q1;

/* loaded from: classes.dex */
public final class c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public d f6345g;

    /* renamed from: h, reason: collision with root package name */
    public Y1.a f6346h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6347i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f6348j;

    /* renamed from: k, reason: collision with root package name */
    public int f6349k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d4.c cVar) {
        super(cVar);
        this.f6348j = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6347i = obj;
        this.f6349k |= Integer.MIN_VALUE;
        return this.f6348j.e(null, null, this);
    }
}
