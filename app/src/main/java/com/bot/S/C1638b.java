package s;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1638b extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public l4.c f14688g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1643g f14690i;

    /* renamed from: j, reason: collision with root package name */
    public int f14691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638b(C1643g c1643g, d4.c cVar) {
        super(cVar);
        this.f14690i = c1643g;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14689h = obj;
        this.f14691j |= Integer.MIN_VALUE;
        return this.f14690i.c(null, S.l.f7374V, null, this);
    }
}
