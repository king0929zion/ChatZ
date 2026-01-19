package j2;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import m4.C1266a;
import m4.InterfaceC1272g;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0008i, InterfaceC1272g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12369c;

    public g(l lVar) {
        this.f12369c = lVar;
    }

    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        this.f12369c.k((e) obj);
        return X3.y.a;
    }

    @Override // m4.InterfaceC1272g
    public final X3.e b() {
        return new C1266a(2, 4, l.class, this.f12369c, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0008i) && (obj instanceof InterfaceC1272g)) {
            return b().equals(((InterfaceC1272g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
