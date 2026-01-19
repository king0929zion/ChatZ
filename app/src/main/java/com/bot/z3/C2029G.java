package z3;

/* renamed from: z3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2029G extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C2030H f16239g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f16240h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2030H f16241i;

    /* renamed from: j, reason: collision with root package name */
    public int f16242j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2029G(C2030H c2030h, d4.c cVar) {
        super(cVar);
        this.f16241i = c2030h;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f16240h = obj;
        this.f16242j |= Integer.MIN_VALUE;
        return this.f16241i.a(null, this);
    }
}
