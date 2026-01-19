package X3;

import java.io.Serializable;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n implements f, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1193a f9400c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9401e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9402f;

    public n(InterfaceC1193a interfaceC1193a) {
        AbstractC1276k.f(interfaceC1193a, "initializer");
        this.f9400c = interfaceC1193a;
        this.f9401e = v.a;
        this.f9402f = this;
    }

    @Override // X3.f
    public final boolean a() {
        return this.f9401e != v.a;
    }

    @Override // X3.f
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f9401e;
        v vVar = v.a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f9402f) {
            obj = this.f9401e;
            if (obj == vVar) {
                InterfaceC1193a interfaceC1193a = this.f9400c;
                AbstractC1276k.c(interfaceC1193a);
                obj = interfaceC1193a.b();
                this.f9401e = obj;
                this.f9400c = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
