package o0;

import F0.U;
import F0.W;
import F0.X;
import F0.k0;
import H0.A0;
import H0.InterfaceC0170z;
import h0.AbstractC1040q;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class M extends AbstractC1040q implements InterfaceC0170z, A0 {

    /* renamed from: A, reason: collision with root package name */
    public L f13438A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13439B;

    /* renamed from: C, reason: collision with root package name */
    public long f13440C;

    /* renamed from: D, reason: collision with root package name */
    public long f13441D;

    /* renamed from: E, reason: collision with root package name */
    public int f13442E;

    /* renamed from: F, reason: collision with root package name */
    public int f13443F;

    /* renamed from: G, reason: collision with root package name */
    public B0.G f13444G;

    /* renamed from: r, reason: collision with root package name */
    public float f13445r;

    /* renamed from: s, reason: collision with root package name */
    public float f13446s;

    /* renamed from: t, reason: collision with root package name */
    public float f13447t;

    /* renamed from: u, reason: collision with root package name */
    public float f13448u;

    /* renamed from: v, reason: collision with root package name */
    public float f13449v;

    /* renamed from: w, reason: collision with root package name */
    public float f13450w;

    /* renamed from: x, reason: collision with root package name */
    public float f13451x;

    /* renamed from: y, reason: collision with root package name */
    public float f13452y;

    /* renamed from: z, reason: collision with root package name */
    public long f13453z;

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        if (this.f13439B) {
            P0.v.f(xVar, this.f13438A);
        }
    }

    @Override // H0.InterfaceC0170z
    public final W d(X x5, U u5, long j3) {
        k0 w5 = u5.w(j3);
        return x5.D(w5.f1485c, w5.f1486e, Y3.w.f9813c, new B0.F(16, w5, this));
    }

    @Override // H0.A0
    public final boolean h() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f13445r);
        sb.append(", scaleY=");
        sb.append(this.f13446s);
        sb.append(", alpha = ");
        sb.append(this.f13447t);
        sb.append(", translationX=");
        sb.append(this.f13448u);
        sb.append(", translationY=");
        sb.append(this.f13449v);
        sb.append(", shadowElevation=");
        sb.append(this.f13450w);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f13451x);
        sb.append(", cameraDistance=");
        sb.append(this.f13452y);
        sb.append(", transformOrigin=");
        sb.append((Object) O.d(this.f13453z));
        sb.append(", shape=");
        sb.append(this.f13438A);
        sb.append(", clip=");
        sb.append(this.f13439B);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC1135a.p(this.f13440C, sb, ", spotShadowColor=");
        AbstractC1135a.p(this.f13441D, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f13442E + ')'));
        sb.append(", blendMode=");
        sb.append((Object) y.G(this.f13443F));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
