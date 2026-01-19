package I2;

import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class E {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2615b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2616c;

    public E(Map map, String str, String str2) {
        this.a = str;
        this.f2615b = str2;
        this.f2616c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        return AbstractC1276k.b(this.a, e6.a) && AbstractC1276k.b(this.f2615b, e6.f2615b) && AbstractC1276k.b(this.f2616c, e6.f2616c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.f2616c.hashCode() + B3.e.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f2615b);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("ToolCallData(id=", this.a, ", name=", this.f2615b, ", arguments=");
        u5.append(this.f2616c);
        u5.append(")");
        return u5.toString();
    }
}
