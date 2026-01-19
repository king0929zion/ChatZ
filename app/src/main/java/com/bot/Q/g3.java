package Q;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C1327h0;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g3 extends AbstractC0141b0 {
    public final C1682j a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5822b;

    /* renamed from: c, reason: collision with root package name */
    public final C1327h0 f5823c;

    public g3(C1682j c1682j, boolean z5, C1327h0 c1327h0) {
        this.a = c1682j;
        this.f5822b = z5;
        this.f5823c = c1327h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q.k3, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        AbstractC1040q abstractC1040q = new AbstractC1040q();
        abstractC1040q.f5945r = this.a;
        abstractC1040q.f5946s = this.f5822b;
        abstractC1040q.f5947t = this.f5823c;
        abstractC1040q.f5951x = Float.NaN;
        abstractC1040q.f5952y = Float.NaN;
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return AbstractC1276k.b(this.a, g3Var.a) && this.f5822b == g3Var.f5822b && this.f5823c.equals(g3Var.f5823c);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        k3 k3Var = (k3) abstractC1040q;
        k3Var.f5945r = this.a;
        boolean z5 = k3Var.f5946s;
        boolean z6 = this.f5822b;
        if (z5 != z6) {
            AbstractC0157l.l(k3Var);
        }
        k3Var.f5946s = z6;
        k3Var.f5947t = this.f5823c;
        if (k3Var.f5950w == null && !Float.isNaN(k3Var.f5952y)) {
            k3Var.f5950w = AbstractC1318d.a(k3Var.f5952y);
        }
        if (k3Var.f5949v != null || Float.isNaN(k3Var.f5951x)) {
            return;
        }
        k3Var.f5949v = AbstractC1318d.a(k3Var.f5951x);
    }

    public final int hashCode() {
        return this.f5823c.hashCode() + AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f5822b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.f5822b + ", animationSpec=" + this.f5823c + ')';
    }
}
