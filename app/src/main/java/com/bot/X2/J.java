package X2;

import A4.C0005f;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class J extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9188g;

    /* renamed from: h, reason: collision with root package name */
    public int f9189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0005f f9190i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0005f c0005f, InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        this.f9190i = c0005f;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        this.f9188g = obj;
        this.f9189h |= Integer.MIN_VALUE;
        return this.f9190i.a(null, this);
    }
}
