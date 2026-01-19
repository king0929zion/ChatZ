package X2;

/* renamed from: X2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0692g f9255h;

    /* renamed from: i, reason: collision with root package name */
    public int f9256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0686a(C0692g c0692g, d4.c cVar) {
        super(cVar);
        this.f9255h = c0692g;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9254g = obj;
        this.f9256i |= Integer.MIN_VALUE;
        return this.f9255h.e(null, this);
    }
}
