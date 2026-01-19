package Y2;

/* loaded from: classes.dex */
public final class C extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9592h;

    /* renamed from: i, reason: collision with root package name */
    public int f9593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(L l3, d4.c cVar) {
        super(cVar);
        this.f9592h = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9591g = obj;
        this.f9593i |= Integer.MIN_VALUE;
        return this.f9592h.h(this);
    }
}
