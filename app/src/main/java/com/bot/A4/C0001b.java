package A4;

/* renamed from: A4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public z4.u f233g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f234h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0002c f235i;

    /* renamed from: j, reason: collision with root package name */
    public int f236j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001b(C0002c c0002c, d4.c cVar) {
        super(cVar);
        this.f235i = c0002c;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f234h = obj;
        this.f236j |= Integer.MIN_VALUE;
        return this.f235i.e(null, this);
    }
}
