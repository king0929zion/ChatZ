package B3;

/* loaded from: classes.dex */
public final class a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public d f500g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f501h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f502i;

    /* renamed from: j, reason: collision with root package name */
    public int f503j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, d4.c cVar) {
        super(cVar);
        this.f502i = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f501h = obj;
        this.f503j |= Integer.MIN_VALUE;
        return this.f502i.b(this);
    }
}
