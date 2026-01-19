package A4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class K extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f186g;

    /* renamed from: h, reason: collision with root package name */
    public int f187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0005f f188i;

    /* renamed from: j, reason: collision with root package name */
    public Object f189j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0008i f190k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(C0005f c0005f, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f188i = c0005f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f186g = obj;
        this.f187h |= Integer.MIN_VALUE;
        return this.f188i.a(null, this);
    }
}
