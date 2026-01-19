package X2;

/* loaded from: classes.dex */
public final class D extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f9155g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9156h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9157i;

    /* renamed from: j, reason: collision with root package name */
    public int f9158j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(L l3, d4.c cVar) {
        super(cVar);
        this.f9157i = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9156h = obj;
        this.f9158j |= Integer.MIN_VALUE;
        return L.j(this.f9157i, null, this);
    }
}
