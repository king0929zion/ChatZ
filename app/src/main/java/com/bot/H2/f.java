package H2;

/* loaded from: classes.dex */
public final class f extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public g f2046g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2047h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f2048i;

    /* renamed from: j, reason: collision with root package name */
    public int f2049j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, d4.c cVar) {
        super(cVar);
        this.f2048i = gVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2047h = obj;
        this.f2049j |= Integer.MIN_VALUE;
        return this.f2048i.d(0, null, this);
    }
}
