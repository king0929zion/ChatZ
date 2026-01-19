package T;

import b4.InterfaceC0905c;

/* renamed from: T.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609h0 extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public l4.c f8089g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8090h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.Z f8091i;

    /* renamed from: j, reason: collision with root package name */
    public int f8092j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0609h0(I0.Z z5, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f8091i = z5;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f8090h = obj;
        this.f8092j |= Integer.MIN_VALUE;
        return this.f8091i.a(this, null);
    }
}
