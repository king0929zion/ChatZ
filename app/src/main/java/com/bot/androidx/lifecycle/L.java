package androidx.lifecycle;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class L implements InterfaceC0844s, AutoCloseable {

    /* renamed from: c, reason: collision with root package name */
    public final String f10845c;

    /* renamed from: e, reason: collision with root package name */
    public final K f10846e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10847f;

    public L(String str, K k3) {
        this.f10845c = str;
        this.f10846e = k3;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        if (enumC0841o == EnumC0841o.ON_DESTROY) {
            this.f10847f = false;
            interfaceC0846u.g().j(this);
        }
    }

    public final void p(M.q qVar, O o5) {
        AbstractC1276k.f(qVar, "registry");
        AbstractC1276k.f(o5, "lifecycle");
        if (this.f10847f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10847f = true;
        o5.a(this);
        qVar.u(this.f10845c, (E1.a) this.f10846e.f10844b.f1295e);
    }
}
