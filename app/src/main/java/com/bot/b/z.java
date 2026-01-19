package b;

import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class z implements InterfaceC0844s, InterfaceC0859c {

    /* renamed from: c, reason: collision with root package name */
    public final O f10966c;

    /* renamed from: e, reason: collision with root package name */
    public final u f10967e;

    /* renamed from: f, reason: collision with root package name */
    public C0852A f10968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0853B f10969g;

    public z(C0853B c0853b, O o5, u uVar) {
        AbstractC1276k.f(uVar, "onBackPressedCallback");
        this.f10969g = c0853b;
        this.f10966c = o5;
        this.f10967e = uVar;
        o5.a(this);
    }

    @Override // b.InterfaceC0859c
    public final void cancel() {
        this.f10966c.j(this);
        this.f10967e.f10956b.remove(this);
        C0852A c0852a = this.f10968f;
        if (c0852a != null) {
            c0852a.cancel();
        }
        this.f10968f = null;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        if (enumC0841o != EnumC0841o.ON_START) {
            if (enumC0841o != EnumC0841o.ON_STOP) {
                if (enumC0841o == EnumC0841o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0852A c0852a = this.f10968f;
                if (c0852a != null) {
                    c0852a.cancel();
                    return;
                }
                return;
            }
        }
        u uVar = this.f10967e;
        AbstractC1276k.f(uVar, "onBackPressedCallback");
        C0853B c0853b = this.f10969g;
        c0853b.f10899b.addLast(uVar);
        C0852A c0852a2 = new C0852A(c0853b, uVar);
        uVar.f10956b.add(c0852a2);
        c0853b.e();
        uVar.f10957c = new I.o(0, c0853b, C0853B.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 4);
        this.f10968f = c0852a2;
    }
}
