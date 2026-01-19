package X3;

import java.io.Serializable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Object f9393c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9394e;

    public i(Object obj, Object obj2) {
        this.f9393c = obj;
        this.f9394e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC1276k.b(this.f9393c, iVar.f9393c) && AbstractC1276k.b(this.f9394e, iVar.f9394e);
    }

    public final int hashCode() {
        Object obj = this.f9393c;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9394e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f9393c + ", " + this.f9394e + ')';
    }
}
