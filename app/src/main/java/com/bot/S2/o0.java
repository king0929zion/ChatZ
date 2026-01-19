package S2;

import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o0 {
    public final S0.G a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7837c;

    public o0(S0.G g3, int i6, int i7) {
        AbstractC1276k.f(g3, Attribute.STYLE_ATTR);
        this.a = g3;
        this.f7836b = i6;
        this.f7837c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC1276k.b(this.a, o0Var.a) && this.f7836b == o0Var.f7836b && this.f7837c == o0Var.f7837c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7837c) + AbstractC1135a.b(this.f7836b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyleRange(style=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.f7836b);
        sb.append(", end=");
        return AbstractC1135a.i(sb, this.f7837c, ")");
    }
}
