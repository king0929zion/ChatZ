package O2;

/* loaded from: classes.dex */
public final class b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f4313g;

    /* renamed from: h, reason: collision with root package name */
    public String f4314h;

    /* renamed from: i, reason: collision with root package name */
    public String f4315i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4316j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f4317k;

    /* renamed from: l, reason: collision with root package name */
    public int f4318l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d4.c cVar) {
        super(cVar);
        this.f4317k = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4316j = obj;
        this.f4318l |= Integer.MIN_VALUE;
        return this.f4317k.a(null, null, null, this);
    }
}
