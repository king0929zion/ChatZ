package O;

import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.InterfaceC1272g;
import n0.C1353b;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements InterfaceC0331s, InterfaceC1272g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f4036c;

    public T(InterfaceC1193a interfaceC1193a) {
        this.f4036c = interfaceC1193a;
    }

    @Override // O.InterfaceC0331s
    public final /* synthetic */ long a() {
        return ((C1353b) this.f4036c.b()).a;
    }

    @Override // m4.InterfaceC1272g
    public final X3.e b() {
        return this.f4036c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0331s) || !(obj instanceof InterfaceC1272g)) {
            return false;
        }
        return AbstractC1276k.b(this.f4036c, ((InterfaceC1272g) obj).b());
    }

    public final int hashCode() {
        return this.f4036c.hashCode();
    }
}
