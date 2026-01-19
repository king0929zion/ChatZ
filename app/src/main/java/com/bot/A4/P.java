package A4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class P implements S, InterfaceC0007h, B4.w {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f200c;

    public P(V v5) {
        this.f200c = v5;
    }

    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        this.f200c.b(interfaceC0008i, interfaceC0905c);
        return EnumC0927a.f11114c;
    }

    @Override // B4.w
    public final InterfaceC0007h c(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return W.l(this, interfaceC0910h, i6, enumC2050a);
    }
}
