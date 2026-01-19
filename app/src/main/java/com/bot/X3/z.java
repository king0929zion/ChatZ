package X3;

import java.io.Serializable;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class z implements f, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1193a f9414c;

    /* renamed from: e, reason: collision with root package name */
    public Object f9415e;

    @Override // X3.f
    public final boolean a() {
        return this.f9415e != v.a;
    }

    @Override // X3.f
    public final Object getValue() {
        if (this.f9415e == v.a) {
            InterfaceC1193a interfaceC1193a = this.f9414c;
            AbstractC1276k.c(interfaceC1193a);
            this.f9415e = interfaceC1193a.b();
            this.f9414c = null;
        }
        return this.f9415e;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
