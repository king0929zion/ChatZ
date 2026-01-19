package C;

import e1.InterfaceC0961c;
import e1.f;

/* loaded from: classes.dex */
public final class b implements a {
    public final float a;

    public b(float f6) {
        this.a = f6;
    }

    @Override // C.a
    public final float a(long j3, InterfaceC0961c interfaceC0961c) {
        return interfaceC0961c.e0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.c(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
