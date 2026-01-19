package d1;

import o0.AbstractC1404o;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936c implements o {
    public final long a;

    public C0936c(long j3) {
        this.a = j3;
        if (j3 != 16) {
            return;
        }
        Y0.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // d1.o
    public final float a() {
        return o0.s.e(this.a);
    }

    @Override // d1.o
    public final long b() {
        return this.a;
    }

    @Override // d1.o
    public final AbstractC1404o c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0936c) && o0.s.d(this.a, ((C0936c) obj).a);
    }

    public final int hashCode() {
        int i6 = o0.s.f13482i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) o0.s.j(this.a)) + ')';
    }
}
