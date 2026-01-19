package o0;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class N extends AbstractC1404o {
    public final long a;

    public N(long j3) {
        this.a = j3;
    }

    @Override // o0.AbstractC1404o
    public final void a(float f6, long j3, L1.d dVar) {
        dVar.c(1.0f);
        long j4 = this.a;
        if (f6 != 1.0f) {
            j4 = s.c(s.e(j4) * f6, j4);
        }
        dVar.e(j4);
        if (((Shader) dVar.f3003c) != null) {
            dVar.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return s.d(this.a, ((N) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i6 = s.f13482i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) s.j(this.a)) + ')';
    }
}
