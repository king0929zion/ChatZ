package z4;

import m4.AbstractC1276k;

/* renamed from: z4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2062m extends C2063n {
    public final Throwable a;

    public C2062m(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2062m) {
            return AbstractC1276k.b(this.a, ((C2062m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // z4.C2063n
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
