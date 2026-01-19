package t3;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f14918h;

    /* renamed from: i, reason: collision with root package name */
    public int f14919i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728c(d dVar, d4.c cVar) {
        super(cVar);
        this.f14918h = dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f14917g = obj;
        this.f14919i |= Integer.MIN_VALUE;
        return this.f14918h.d(null, this);
    }
}
