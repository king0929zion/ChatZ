package o0;

import H0.AbstractC0141b0;
import H0.AbstractC0157l;
import H0.i0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends AbstractC0141b0 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13484b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13485c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13486d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13487e;

    /* renamed from: f, reason: collision with root package name */
    public final float f13488f;

    /* renamed from: g, reason: collision with root package name */
    public final float f13489g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13490h;

    /* renamed from: i, reason: collision with root package name */
    public final L f13491i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13492j;

    /* renamed from: k, reason: collision with root package name */
    public final long f13493k;

    /* renamed from: l, reason: collision with root package name */
    public final long f13494l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13495m;

    public x(float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j3, L l3, boolean z5, long j4, long j5, int i6) {
        this.a = f6;
        this.f13484b = f7;
        this.f13485c = f8;
        this.f13486d = f9;
        this.f13487e = f10;
        this.f13488f = f11;
        this.f13489g = f12;
        this.f13490h = j3;
        this.f13491i = l3;
        this.f13492j = z5;
        this.f13493k = j4;
        this.f13494l = j5;
        this.f13495m = i6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o0.M, java.lang.Object, h0.q] */
    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        ?? abstractC1040q = new AbstractC1040q();
        abstractC1040q.f13445r = this.a;
        abstractC1040q.f13446s = this.f13484b;
        abstractC1040q.f13447t = this.f13485c;
        abstractC1040q.f13448u = this.f13486d;
        abstractC1040q.f13449v = this.f13487e;
        abstractC1040q.f13450w = this.f13488f;
        abstractC1040q.f13451x = this.f13489g;
        abstractC1040q.f13452y = 8.0f;
        abstractC1040q.f13453z = this.f13490h;
        abstractC1040q.f13438A = this.f13491i;
        abstractC1040q.f13439B = this.f13492j;
        abstractC1040q.f13440C = this.f13493k;
        abstractC1040q.f13441D = this.f13494l;
        abstractC1040q.f13442E = this.f13495m;
        abstractC1040q.f13443F = 3;
        abstractC1040q.f13444G = new B0.G(abstractC1040q, 26);
        return abstractC1040q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.a, xVar.a) == 0 && Float.compare(this.f13484b, xVar.f13484b) == 0 && Float.compare(this.f13485c, xVar.f13485c) == 0 && Float.compare(this.f13486d, xVar.f13486d) == 0 && Float.compare(this.f13487e, xVar.f13487e) == 0 && Float.compare(this.f13488f, xVar.f13488f) == 0 && Float.compare(S.l.f7374V, S.l.f7374V) == 0 && Float.compare(S.l.f7374V, S.l.f7374V) == 0 && Float.compare(this.f13489g, xVar.f13489g) == 0 && Float.compare(8.0f, 8.0f) == 0 && O.a(this.f13490h, xVar.f13490h) && AbstractC1276k.b(this.f13491i, xVar.f13491i) && this.f13492j == xVar.f13492j && s.d(this.f13493k, xVar.f13493k) && s.d(this.f13494l, xVar.f13494l) && this.f13495m == xVar.f13495m;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        i0 i0Var;
        M m3 = (M) abstractC1040q;
        m3.f13445r = this.a;
        m3.f13446s = this.f13484b;
        m3.f13447t = this.f13485c;
        m3.f13448u = this.f13486d;
        m3.f13449v = this.f13487e;
        m3.f13450w = this.f13488f;
        m3.f13451x = this.f13489g;
        m3.f13452y = 8.0f;
        m3.f13453z = this.f13490h;
        m3.f13438A = this.f13491i;
        m3.f13439B = this.f13492j;
        m3.f13440C = this.f13493k;
        m3.f13441D = this.f13494l;
        m3.f13442E = this.f13495m;
        m3.f13443F = 3;
        B0.G g3 = m3.f13444G;
        if (m3.f11806c.f11819q && (i0Var = AbstractC0157l.t(m3, 2).f1955s) != null) {
            i0Var.u1(g3, true);
        }
    }

    public final int hashCode() {
        int a = AbstractC1135a.a(8.0f, AbstractC1135a.a(this.f13489g, AbstractC1135a.a(S.l.f7374V, AbstractC1135a.a(S.l.f7374V, AbstractC1135a.a(this.f13488f, AbstractC1135a.a(this.f13487e, AbstractC1135a.a(this.f13486d, AbstractC1135a.a(this.f13485c, AbstractC1135a.a(this.f13484b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i6 = O.f13455c;
        int d6 = AbstractC1135a.d((this.f13491i.hashCode() + AbstractC1135a.c(a, 31, this.f13490h)) * 31, 961, this.f13492j);
        int i7 = s.f13482i;
        return AbstractC1135a.b(3, AbstractC1135a.b(this.f13495m, AbstractC1135a.c(AbstractC1135a.c(d6, 31, this.f13493k), 31, this.f13494l), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.f13484b);
        sb.append(", alpha=");
        sb.append(this.f13485c);
        sb.append(", translationX=");
        sb.append(this.f13486d);
        sb.append(", translationY=");
        sb.append(this.f13487e);
        sb.append(", shadowElevation=");
        sb.append(this.f13488f);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f13489g);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) O.d(this.f13490h));
        sb.append(", shape=");
        sb.append(this.f13491i);
        sb.append(", clip=");
        sb.append(this.f13492j);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC1135a.p(this.f13493k, sb, ", spotShadowColor=");
        AbstractC1135a.p(this.f13494l, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f13495m + ')'));
        sb.append(", blendMode=");
        sb.append((Object) y.G(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
