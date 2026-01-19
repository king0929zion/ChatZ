package X3;

import java.io.Serializable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Object f9403c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9404e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9405f;

    public o(Object obj, Object obj2, Object obj3) {
        this.f9403c = obj;
        this.f9404e = obj2;
        this.f9405f = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC1276k.b(this.f9403c, oVar.f9403c) && AbstractC1276k.b(this.f9404e, oVar.f9404e) && AbstractC1276k.b(this.f9405f, oVar.f9405f);
    }

    public final int hashCode() {
        Object obj = this.f9403c;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9404e;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f9405f;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f9403c + ", " + this.f9404e + ", " + this.f9405f + ')';
    }
}
