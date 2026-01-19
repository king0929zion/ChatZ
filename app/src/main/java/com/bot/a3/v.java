package a3;

/* loaded from: classes.dex */
public final class v extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f10700h;

    /* renamed from: i, reason: collision with root package name */
    public int f10701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, d4.c cVar) {
        super(cVar);
        this.f10700h = wVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10699g = obj;
        this.f10701i |= Integer.MIN_VALUE;
        return this.f10700h.A(null, this);
    }
}
