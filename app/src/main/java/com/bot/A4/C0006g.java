package A4;

import B4.AbstractC0050c;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1288w;

/* renamed from: A4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g implements InterfaceC0007h {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0007h f261c;

    public C0006g(InterfaceC0007h interfaceC0007h) {
        this.f261c = interfaceC0007h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.w, java.lang.Object] */
    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        Object obj = new Object();
        obj.f12973c = AbstractC0050c.f579b;
        Object b5 = this.f261c.b(new C0005f(this, (C1288w) obj, interfaceC0008i), interfaceC0905c);
        return b5 == EnumC0927a.f11114c ? b5 : X3.y.a;
    }
}
