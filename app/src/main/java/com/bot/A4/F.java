package A4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class F extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C f166g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f167h;

    /* renamed from: i, reason: collision with root package name */
    public int f168i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C f169j;

    /* renamed from: k, reason: collision with root package name */
    public Object f170k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C c6, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f169j = c6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f167h = obj;
        this.f168i |= Integer.MIN_VALUE;
        return this.f169j.a(null, this);
    }
}
