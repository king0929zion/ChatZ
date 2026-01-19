package T;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f1 implements g1 {
    public final Object a;

    public f1(Object obj) {
        this.a = obj;
    }

    @Override // T.g1
    public final Object a(InterfaceC0617l0 interfaceC0617l0) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && AbstractC1276k.b(this.a, ((f1) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
