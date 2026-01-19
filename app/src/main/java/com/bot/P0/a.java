package P0;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.e f4430b;

    public a(String str, X3.e eVar) {
        this.a = str;
        this.f4430b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1276k.b(this.a, aVar.a) && AbstractC1276k.b(this.f4430b, aVar.f4430b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        X3.e eVar = this.f4430b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.f4430b + ')';
    }
}
