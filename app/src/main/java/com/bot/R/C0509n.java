package R;

/* renamed from: R.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509n extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0513s f6811h;

    /* renamed from: i, reason: collision with root package name */
    public int f6812i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0509n(C0513s c0513s, d4.c cVar) {
        super(cVar);
        this.f6811h = c0513s;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6810g = obj;
        this.f6812i |= Integer.MIN_VALUE;
        return this.f6811h.b(null, null, this);
    }
}
