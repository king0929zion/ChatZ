package X2;

/* renamed from: X2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701p extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9346h;

    /* renamed from: i, reason: collision with root package name */
    public int f9347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0701p(L l3, d4.c cVar) {
        super(cVar);
        this.f9346h = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9345g = obj;
        this.f9347i |= Integer.MIN_VALUE;
        return this.f9346h.l(this);
    }
}
