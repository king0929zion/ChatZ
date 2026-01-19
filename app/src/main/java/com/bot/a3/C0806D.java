package a3;

/* renamed from: a3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806D extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f10589g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10590h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f10591i;

    /* renamed from: j, reason: collision with root package name */
    public int f10592j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0806D(C0808F c0808f, d4.c cVar) {
        super(cVar);
        this.f10591i = c0808f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10590h = obj;
        this.f10592j |= Integer.MIN_VALUE;
        return this.f10591i.h(null, null, this);
    }
}
