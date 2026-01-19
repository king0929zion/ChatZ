package l0;

import B0.G;
import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import H0.i0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o0.C1402m;
import o0.L;
import o0.s;

/* loaded from: classes.dex */
public final class o extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final L f12660b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12661c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12662d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12663e;

    public o(float f6, L l3, boolean z5, long j3, long j4) {
        this.a = f6;
        this.f12660b = l3;
        this.f12661c = z5;
        this.f12662d = j3;
        this.f12663e = j4;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new C1402m(new G(this, 22));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return e1.f.c(this.a, oVar.a) && AbstractC1276k.b(this.f12660b, oVar.f12660b) && this.f12661c == oVar.f12661c && s.d(this.f12662d, oVar.f12662d) && s.d(this.f12663e, oVar.f12663e);
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        i0 i0Var;
        C1402m c1402m = (C1402m) abstractC1040q;
        G g3 = new G(this, 22);
        c1402m.f13470r = g3;
        if (c1402m.f11806c.f11819q && (i0Var = AbstractC0157l.t(c1402m, 2).f1955s) != null) {
            i0Var.u1(g3, true);
        }
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d((this.f12660b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.f12661c);
        int i6 = s.f13482i;
        return Long.hashCode(this.f12663e) + AbstractC1135a.c(d6, 31, this.f12662d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e1.f.d(this.a));
        sb.append(", shape=");
        sb.append(this.f12660b);
        sb.append(", clip=");
        sb.append(this.f12661c);
        sb.append(", ambientColor=");
        AbstractC1135a.p(this.f12662d, sb, ", spotColor=");
        sb.append((Object) s.j(this.f12663e));
        sb.append(')');
        return sb.toString();
    }
}
