package p;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import android.view.View;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: p.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1457s0 extends AbstractC0141b0 {
    public final l4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f13792b;

    /* renamed from: c, reason: collision with root package name */
    public final H0 f13793c;

    public C1457s0(l4.c cVar, l4.c cVar2, H0 h02) {
        this.a = cVar;
        this.f13792b = cVar2;
        this.f13793c = h02;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new v0(this.a, this.f13792b, this.f13793c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1457s0)) {
            return false;
        }
        l4.c cVar = ((C1457s0) obj).a;
        return false;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        v0 v0Var = (v0) abstractC1040q;
        v0Var.getClass();
        H0 h02 = v0Var.f13816t;
        View view = v0Var.f13817u;
        InterfaceC0961c interfaceC0961c = v0Var.f13818v;
        v0Var.f13814r = this.a;
        v0Var.f13815s = this.f13792b;
        H0 h03 = this.f13793c;
        v0Var.f13816t = h03;
        View x5 = AbstractC0157l.x(v0Var);
        InterfaceC0961c interfaceC0961c2 = AbstractC0157l.v(v0Var).f1714C;
        if (v0Var.f13819w != null) {
            P0.w wVar = w0.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !h03.a()) || !e1.f.c(Float.NaN, Float.NaN) || !e1.f.c(Float.NaN, Float.NaN) || !h03.equals(h02) || !x5.equals(view) || !AbstractC1276k.b(interfaceC0961c2, interfaceC0961c)) {
                v0Var.N0();
            }
        }
        v0Var.O0();
    }

    public final int hashCode() {
        return this.f13793c.hashCode() + ((this.f13792b.hashCode() + AbstractC1135a.d(AbstractC1135a.a(Float.NaN, AbstractC1135a.a(Float.NaN, AbstractC1135a.c(AbstractC1135a.d(AbstractC1135a.a(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
