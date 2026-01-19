package Y2;

import b4.InterfaceC0905c;

/* renamed from: Y2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715d extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9712g;

    /* renamed from: h, reason: collision with root package name */
    public int f9713h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0716e f9714i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0715d(C0716e c0716e, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f9714i = c0716e;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9712g = obj;
        this.f9713h |= Integer.MIN_VALUE;
        return this.f9714i.a(null, this);
    }
}
