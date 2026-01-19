package Y2;

/* loaded from: classes.dex */
public final class H extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9623h;

    /* renamed from: i, reason: collision with root package name */
    public int f9624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L l3, d4.c cVar) {
        super(cVar);
        this.f9623h = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9622g = obj;
        this.f9624i |= Integer.MIN_VALUE;
        return this.f9623h.k(this);
    }
}
