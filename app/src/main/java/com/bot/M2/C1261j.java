package m2;

/* renamed from: m2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261j extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1263l f12933h;

    /* renamed from: i, reason: collision with root package name */
    public int f12934i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261j(C1263l c1263l, d4.c cVar) {
        super(cVar);
        this.f12933h = c1263l;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f12932g = obj;
        this.f12934i |= Integer.MIN_VALUE;
        return this.f12933h.b(null, this);
    }
}
