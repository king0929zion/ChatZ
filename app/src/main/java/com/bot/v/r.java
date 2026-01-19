package v;

import e1.C0959a;
import e1.InterfaceC0961c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class r implements InterfaceC1809o {
    public final InterfaceC0961c a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15342b;

    public r(F0.w0 w0Var, long j3) {
        this.a = w0Var;
        this.f15342b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC1276k.b(this.a, rVar.a) && C0959a.b(this.f15342b, rVar.f15342b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15342b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) C0959a.k(this.f15342b)) + ')';
    }
}
