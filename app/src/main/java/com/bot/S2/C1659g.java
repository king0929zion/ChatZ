package s2;

import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0832f;
import androidx.lifecycle.InterfaceC0845t;
import androidx.lifecycle.O;
import m4.AbstractC1276k;

/* renamed from: s2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1659g extends O {

    /* renamed from: e, reason: collision with root package name */
    public static final C1659g f14748e = new O();

    /* renamed from: f, reason: collision with root package name */
    public static final C1658f f14749f = new Object();

    @Override // androidx.lifecycle.O
    public final void a(InterfaceC0845t interfaceC0845t) {
        if (!(interfaceC0845t instanceof InterfaceC0832f)) {
            throw new IllegalArgumentException((interfaceC0845t + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC0832f interfaceC0832f = (InterfaceC0832f) interfaceC0845t;
        interfaceC0832f.getClass();
        C1658f c1658f = f14749f;
        AbstractC1276k.f(c1658f, "owner");
        interfaceC0832f.j(c1658f);
        interfaceC0832f.c(c1658f);
    }

    @Override // androidx.lifecycle.O
    public final EnumC0842p g() {
        return EnumC0842p.f10879h;
    }

    @Override // androidx.lifecycle.O
    public final void j(InterfaceC0845t interfaceC0845t) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
