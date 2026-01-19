package B4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class u extends C4.r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(InterfaceC0910h interfaceC0910h, InterfaceC0905c interfaceC0905c, int i6) {
        super(interfaceC0905c, interfaceC0910h);
        this.f634h = i6;
    }

    @Override // x4.l0
    public final boolean G(Throwable th) {
        switch (this.f634h) {
            case 0:
                if (th instanceof p) {
                    return true;
                }
                return B(th);
            default:
                return false;
        }
    }
}
