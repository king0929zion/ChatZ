package a3;

/* loaded from: classes.dex */
public final class o extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public String f10680g;

    /* renamed from: h, reason: collision with root package name */
    public String f10681h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f10683j;

    /* renamed from: k, reason: collision with root package name */
    public int f10684k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, d4.c cVar) {
        super(cVar);
        this.f10683j = wVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f10682i = obj;
        this.f10684k |= Integer.MIN_VALUE;
        return w.e(this.f10683j, this);
    }
}
