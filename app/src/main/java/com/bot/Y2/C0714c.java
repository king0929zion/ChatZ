package Y2;

/* renamed from: Y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0720i f9710h;

    /* renamed from: i, reason: collision with root package name */
    public int f9711i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0714c(C0720i c0720i, d4.c cVar) {
        super(cVar);
        this.f9710h = c0720i;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9709g = obj;
        this.f9711i |= Integer.MIN_VALUE;
        return this.f9710h.i(this);
    }
}
