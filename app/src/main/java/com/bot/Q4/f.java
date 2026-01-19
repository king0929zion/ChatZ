package Q4;

import java.util.ArrayList;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f6512c = new f(Y3.m.N0(new ArrayList()), null);
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final Y4.l f6513b;

    public f(Set set, Y4.l lVar) {
        this.a = set;
        this.f6513b = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1276k.b(fVar.a, this.a) && AbstractC1276k.b(fVar.f6513b, this.f6513b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        Y4.l lVar = this.f6513b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
