package Y2;

/* loaded from: classes.dex */
public final class J extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public int f9628g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9629h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9630i;

    /* renamed from: j, reason: collision with root package name */
    public int f9631j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(L l3, d4.c cVar) {
        super(cVar);
        this.f9630i = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9629h = obj;
        this.f9631j |= Integer.MIN_VALUE;
        return this.f9630i.m(false, this);
    }
}
