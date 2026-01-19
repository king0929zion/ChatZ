package R;

import h0.C1029f;
import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class n0 implements X {
    public final C1029f a;

    public n0(C1029f c1029f) {
        this.a = c1029f;
    }

    @Override // R.X
    public final int a(e1.k kVar, long j3, int i6, e1.m mVar) {
        int i7 = (int) (j3 >> 32);
        if (i6 < i7) {
            return AbstractC1117a.f(this.a.a(i6, i7, mVar), 0, i7 - i6);
        }
        float f6 = (i7 - i6) / 2.0f;
        e1.m mVar2 = e1.m.f11576c;
        float f7 = S.l.f7374V;
        if (mVar != mVar2) {
            f7 = S.l.f7374V * (-1);
        }
        return Math.round((1 + f7) * f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.a.equals(((n0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
