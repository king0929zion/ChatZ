package Y2;

/* loaded from: classes.dex */
public final class K extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f9632g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9633h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9634i;

    /* renamed from: j, reason: collision with root package name */
    public int f9635j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l3, d4.c cVar) {
        super(cVar);
        this.f9634i = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9633h = obj;
        this.f9635j |= Integer.MIN_VALUE;
        return this.f9634i.n(null, this);
    }
}
