package n;

/* renamed from: n.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317c0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Object f13102g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1321e0 f13104i;

    /* renamed from: j, reason: collision with root package name */
    public int f13105j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317c0(C1321e0 c1321e0, d4.c cVar) {
        super(cVar);
        this.f13104i = c1321e0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f13103h = obj;
        this.f13105j |= Integer.MIN_VALUE;
        return C1321e0.v(this.f13104i, this);
    }
}
