package O;

/* loaded from: classes.dex */
public final class M0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public N0 f3984g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3985h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ N0 f3986i;

    /* renamed from: j, reason: collision with root package name */
    public int f3987j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(N0 n02, d4.c cVar) {
        super(cVar);
        this.f3986i = n02;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3985h = obj;
        this.f3987j |= Integer.MIN_VALUE;
        return this.f3986i.s(this);
    }
}
