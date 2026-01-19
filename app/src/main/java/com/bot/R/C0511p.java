package R;

/* renamed from: R.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511p extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0513s f6819h;

    /* renamed from: i, reason: collision with root package name */
    public int f6820i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511p(C0513s c0513s, d4.c cVar) {
        super(cVar);
        this.f6819h = c0513s;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f6818g = obj;
        this.f6820i |= Integer.MIN_VALUE;
        return this.f6819h.a(null, null, null, this);
    }
}
