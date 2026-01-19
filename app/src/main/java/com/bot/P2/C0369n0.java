package P2;

import A4.C0010k;
import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: P2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369n0 implements InterfaceC0007h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4996c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0010k f4997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4998f;

    public /* synthetic */ C0369n0(C0010k c0010k, int i6, int i7) {
        this.f4996c = i7;
        this.f4997e = c0010k;
        this.f4998f = i6;
    }

    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        switch (this.f4996c) {
            case 0:
                Object b5 = this.f4997e.b(new C0367m0(this.f4998f, 0, interfaceC0008i), interfaceC0905c);
                return b5 == EnumC0927a.f11114c ? b5 : X3.y.a;
            default:
                Object b6 = this.f4997e.b(new C0367m0(this.f4998f, 1, interfaceC0008i), interfaceC0905c);
                return b6 == EnumC0927a.f11114c ? b6 : X3.y.a;
        }
    }
}
