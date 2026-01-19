package P2;

import b4.InterfaceC0905c;

/* renamed from: P2.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365l0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4975g;

    /* renamed from: h, reason: collision with root package name */
    public int f4976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0367m0 f4977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0365l0(C0367m0 c0367m0, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f4977i = c0367m0;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f4975g = obj;
        this.f4976h |= Integer.MIN_VALUE;
        return this.f4977i.a(null, this);
    }
}
