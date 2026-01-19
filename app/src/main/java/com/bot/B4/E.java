package B4;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class E implements InterfaceC0008i {

    /* renamed from: c, reason: collision with root package name */
    public final z4.x f568c;

    public E(z4.u uVar) {
        this.f568c = uVar;
    }

    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        Object a = this.f568c.a(interfaceC0905c, obj);
        return a == EnumC0927a.f11114c ? a : X3.y.a;
    }
}
