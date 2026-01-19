package n;

/* renamed from: n.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1319d0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f13123g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13124h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13125i;

    /* renamed from: j, reason: collision with root package name */
    public int f13126j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319d0(C1321e0 c1321e0, d4.c cVar) {
        super(cVar);
        this.f13125i = c1321e0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f13124h = obj;
        this.f13126j |= Integer.MIN_VALUE;
        return C1321e0.w(this.f13125i, this);
    }
}
