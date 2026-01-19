package X2;

/* loaded from: classes.dex */
public final class B extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9150h;

    /* renamed from: i, reason: collision with root package name */
    public int f9151i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(L l3, d4.c cVar) {
        super(cVar);
        this.f9150h = l3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9149g = obj;
        this.f9151i |= Integer.MIN_VALUE;
        return L.h(this.f9150h, null, null, this);
    }
}
