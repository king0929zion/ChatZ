package A4;

import b4.InterfaceC0905c;

/* renamed from: A4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public B4.A f229g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f230h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0010k f231i;

    /* renamed from: j, reason: collision with root package name */
    public int f232j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0000a(C0010k c0010k, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f231i = c0010k;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f230h = obj;
        this.f232j |= Integer.MIN_VALUE;
        return this.f231i.b(null, this);
    }
}
