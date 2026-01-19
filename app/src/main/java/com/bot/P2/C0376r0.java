package P2;

import b4.InterfaceC0905c;

/* renamed from: P2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376r0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public Throwable f5044g;

    /* renamed from: h, reason: collision with root package name */
    public int f5045h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5046i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0378s0 f5047j;

    /* renamed from: k, reason: collision with root package name */
    public int f5048k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0376r0(C0378s0 c0378s0, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f5047j = c0378s0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f5046i = obj;
        this.f5048k |= Integer.MIN_VALUE;
        return this.f5047j.b(null, this);
    }
}
