package A4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class B extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public C f149g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f150h;

    /* renamed from: i, reason: collision with root package name */
    public int f151i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C f152j;

    /* renamed from: k, reason: collision with root package name */
    public Object f153k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c6, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f152j = c6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f150h = obj;
        this.f151i |= Integer.MIN_VALUE;
        return this.f152j.a(null, this);
    }
}
