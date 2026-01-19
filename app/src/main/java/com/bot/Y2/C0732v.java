package Y2;

/* renamed from: Y2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732v extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9778g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f9779h;

    /* renamed from: i, reason: collision with root package name */
    public int f9780i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0732v(x xVar, d4.c cVar) {
        super(cVar);
        this.f9779h = xVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9778g = obj;
        this.f9780i |= Integer.MIN_VALUE;
        return this.f9779h.a(this);
    }
}
