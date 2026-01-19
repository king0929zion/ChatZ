package I3;

import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: I3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2746b;

    /* renamed from: c, reason: collision with root package name */
    public final double f2747c;

    public C0245i(String str, List list) {
        Double d6;
        Object obj;
        String str2;
        Double u5;
        AbstractC1276k.f(str, "value");
        AbstractC1276k.f(list, "params");
        this.a = str;
        this.f2746b = list;
        Iterator it = list.iterator();
        while (true) {
            d6 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (AbstractC1276k.b(((j) obj).a, "q")) {
                    break;
                }
            }
        }
        j jVar = (j) obj;
        double d7 = 1.0d;
        if (jVar != null && (str2 = jVar.f2748b) != null && (u5 = u4.t.u(str2)) != null) {
            double doubleValue = u5.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d6 = u5;
            }
            if (d6 != null) {
                d7 = d6.doubleValue();
            }
        }
        this.f2747c = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0245i)) {
            return false;
        }
        C0245i c0245i = (C0245i) obj;
        return AbstractC1276k.b(this.a, c0245i.a) && AbstractC1276k.b(this.f2746b, c0245i.f2746b);
    }

    public final int hashCode() {
        return this.f2746b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.f2746b + ')';
    }
}
