package M2;

import I2.F;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class x extends y {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3408b;

    public x(String str, F f6) {
        AbstractC1276k.f(str, "conversationId");
        AbstractC1276k.f(f6, "result");
        this.a = str;
        this.f3408b = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AbstractC1276k.b(this.a, xVar.a) && AbstractC1276k.b(this.f3408b, xVar.f3408b);
    }

    public final int hashCode() {
        return this.f3408b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolResultReceived(conversationId=" + this.a + ", result=" + this.f3408b + ")";
    }
}
