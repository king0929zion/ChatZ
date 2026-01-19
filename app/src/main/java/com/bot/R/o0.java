package R;

import h0.C1032i;
import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class o0 implements Y {
    public final C1032i a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6817b;

    public o0(C1032i c1032i, int i6) {
        this.a = c1032i;
        this.f6817b = i6;
    }

    @Override // R.Y
    public final int a(e1.k kVar, long j3, int i6) {
        int i7 = (int) (j3 & 4294967295L);
        int i8 = this.f6817b;
        if (i6 < i7 - (i8 * 2)) {
            return AbstractC1117a.f(this.a.a(i6, i7), i8, (i7 - i8) - i6);
        }
        return Math.round((1 + S.l.f7374V) * ((i7 - i6) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a.equals(o0Var.a) && this.f6817b == o0Var.f6817b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6817b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return B3.e.q(sb, this.f6817b, ')');
    }
}
