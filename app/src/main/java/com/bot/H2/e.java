package H2;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class e extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public g f2042g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f2044i;

    /* renamed from: j, reason: collision with root package name */
    public int f2045j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f2044i = gVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f2043h = obj;
        this.f2045j |= Integer.MIN_VALUE;
        return this.f2044i.c(this, null);
    }
}
