package o0;

import android.graphics.RenderEffect;
import j1.AbstractC1135a;

/* renamed from: o0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403n {
    public RenderEffect a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13471b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13473d;

    public C1403n(float f6, float f7, int i6) {
        this.f13471b = f6;
        this.f13472c = f7;
        this.f13473d = i6;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect == null) {
            float f6 = this.f13471b;
            float f7 = this.f13472c;
            renderEffect = (f6 == S.l.f7374V && f7 == S.l.f7374V) ? RenderEffect.createOffsetEffect(S.l.f7374V, S.l.f7374V) : RenderEffect.createBlurEffect(f6, f7, y.A(this.f13473d));
            this.a = renderEffect;
        }
        return renderEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1403n)) {
            return false;
        }
        C1403n c1403n = (C1403n) obj;
        return this.f13471b == c1403n.f13471b && this.f13472c == c1403n.f13472c && this.f13473d == c1403n.f13473d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13473d) + AbstractC1135a.a(this.f13472c, Float.hashCode(this.f13471b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurEffect(renderEffect=null, radiusX=");
        sb.append(this.f13471b);
        sb.append(", radiusY=");
        sb.append(this.f13472c);
        sb.append(", edgeTreatment=");
        int i6 = this.f13473d;
        sb.append((Object) (i6 == 0 ? "Clamp" : i6 == 1 ? "Repeated" : i6 == 2 ? "Mirror" : i6 == 3 ? "Decal" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
