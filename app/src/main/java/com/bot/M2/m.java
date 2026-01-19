package M2;

/* loaded from: classes.dex */
public final class m extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t f3356h;

    /* renamed from: i, reason: collision with root package name */
    public int f3357i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, d4.c cVar) {
        super(cVar);
        this.f3356h = tVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f3355g = obj;
        this.f3357i |= Integer.MIN_VALUE;
        return t.c(this.f3356h, null, null, null, null, this);
    }
}
