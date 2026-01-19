package I0;

import T.C0639x;
import T.InterfaceC0631t;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import com.tencent.mmkv.R;

/* loaded from: classes.dex */
public final class q1 implements InterfaceC0631t, InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f2374c;

    /* renamed from: e, reason: collision with root package name */
    public final C0639x f2375e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2376f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.O f2377g;

    /* renamed from: h, reason: collision with root package name */
    public l4.e f2378h = AbstractC0200o0.a;

    public q1(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, C0639x c0639x) {
        this.f2374c = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f2375e = c0639x;
    }

    public final void a() {
        if (!this.f2376f) {
            this.f2376f = true;
            this.f2374c.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.O o5 = this.f2377g;
            if (o5 != null) {
                o5.j(this);
            }
        }
        this.f2375e.m();
    }

    public final void b(l4.e eVar) {
        this.f2374c.setOnViewTreeOwnersAvailable(new B0.F(8, this, eVar));
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        if (enumC0841o == EnumC0841o.ON_DESTROY) {
            a();
        } else {
            if (enumC0841o != EnumC0841o.ON_CREATE || this.f2376f) {
                return;
            }
            b(this.f2378h);
        }
    }
}
