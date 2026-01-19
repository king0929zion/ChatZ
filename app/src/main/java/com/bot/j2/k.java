package j2;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import A4.g0;
import Y2.C0716e;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0007h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12375c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f12376e;

    public /* synthetic */ k(g0 g0Var, int i6) {
        this.f12375c = i6;
        this.f12376e = g0Var;
    }

    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        switch (this.f12375c) {
            case 0:
                Object b5 = this.f12376e.b(new C0716e(interfaceC0008i, 1), interfaceC0905c);
                return b5 == EnumC0927a.f11114c ? b5 : X3.y.a;
            default:
                Object b6 = this.f12376e.b(new C0716e(interfaceC0008i, 2), interfaceC0905c);
                return b6 == EnumC0927a.f11114c ? b6 : X3.y.a;
        }
    }
}
