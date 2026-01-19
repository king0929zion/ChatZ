package X2;

/* loaded from: classes.dex */
public final class C extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9153h;

    /* renamed from: i, reason: collision with root package name */
    public int f9154i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(L l3, d4.c cVar) {
        super(cVar);
        this.f9153h = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9152g = obj;
        this.f9154i |= Integer.MIN_VALUE;
        return L.i(this.f9153h, null, null, null, null, this);
    }
}
