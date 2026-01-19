package M2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class v extends y {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3406b;

    public v(String str, String str2) {
        AbstractC1276k.f(str, "conversationId");
        AbstractC1276k.f(str2, "message");
        this.a = str;
        this.f3406b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return AbstractC1276k.b(this.a, vVar.a) && AbstractC1276k.b(this.f3406b, vVar.f3406b);
    }

    public final int hashCode() {
        return this.f3406b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return B3.e.o("Error(conversationId=", this.a, ", message=", this.f3406b, ")");
    }
}
