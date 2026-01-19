package a3;

/* loaded from: classes.dex */
public final class p extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10685g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f10686h;

    /* renamed from: i, reason: collision with root package name */
    public int f10687i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, d4.c cVar) {
        super(cVar);
        this.f10686h = wVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10685g = obj;
        this.f10687i |= Integer.MIN_VALUE;
        return this.f10686h.z(this);
    }
}
