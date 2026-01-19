package M2;

import m4.AbstractC1276k;
import x4.s0;

/* loaded from: classes.dex */
public final class z {
    public final s0 a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3409b;

    public z(s0 s0Var, String str) {
        AbstractC1276k.f(str, "messageId");
        this.a = s0Var;
        this.f3409b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a.equals(zVar.a) && AbstractC1276k.b(this.f3409b, zVar.f3409b);
    }

    public final int hashCode() {
        return this.f3409b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StreamingJob(job=" + this.a + ", messageId=" + this.f3409b + ")";
    }
}
