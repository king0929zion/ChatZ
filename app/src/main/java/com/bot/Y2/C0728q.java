package Y2;

/* renamed from: Y2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728q extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0730t f9759h;

    /* renamed from: i, reason: collision with root package name */
    public int f9760i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728q(C0730t c0730t, d4.c cVar) {
        super(cVar);
        this.f9759h = c0730t;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9758g = obj;
        this.f9760i |= Integer.MIN_VALUE;
        return C0730t.b(this.f9759h, null, this);
    }
}
