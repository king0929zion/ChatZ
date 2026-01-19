package Y2;

/* renamed from: Y2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9702g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0720i f9703h;

    /* renamed from: i, reason: collision with root package name */
    public int f9704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0712a(C0720i c0720i, d4.c cVar) {
        super(cVar);
        this.f9703h = c0720i;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9702g = obj;
        this.f9704i |= Integer.MIN_VALUE;
        return this.f9703h.g(this);
    }
}
