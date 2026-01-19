package S0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y {
    public final x a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7676b;

    public y(x xVar, w wVar) {
        this.a = xVar;
        this.f7676b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC1276k.b(this.f7676b, yVar.f7676b) && AbstractC1276k.b(this.a, yVar.a);
    }

    public final int hashCode() {
        x xVar = this.a;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        w wVar = this.f7676b;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.f7676b + ')';
    }
}
