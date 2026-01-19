package e1;

import com.vladsch.flexmark.util.format.TableCell;
import f1.AbstractC1005b;
import f1.InterfaceC1004a;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0961c {
    default float A(long j3) {
        float c6;
        float b02;
        if (!p.a(o.b(j3), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC1005b.a;
        if (b0() >= 1.03f) {
            InterfaceC1004a a = AbstractC1005b.a(b0());
            c6 = o.c(j3);
            if (a != null) {
                return a.b(c6);
            }
            b02 = b0();
        } else {
            c6 = o.c(j3);
            b02 = b0();
        }
        return b02 * c6;
    }

    default long O(float f6) {
        return s(V(f6));
    }

    default float T(int i6) {
        return i6 / a();
    }

    default float V(float f6) {
        return f6 / a();
    }

    float a();

    float b0();

    default float e0(float f6) {
        return a() * f6;
    }

    default int l0(float f6) {
        float e02 = e0(f6);
        return Float.isInfinite(e02) ? TableCell.NOT_TRACKED : Math.round(e02);
    }

    default long r0(long j3) {
        if (j3 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float e02 = e0(h.b(j3));
        float e03 = e0(h.a(j3));
        return (Float.floatToRawIntBits(e03) & 4294967295L) | (Float.floatToRawIntBits(e02) << 32);
    }

    default long s(float f6) {
        float[] fArr = AbstractC1005b.a;
        if (b0() < 1.03f) {
            return s4.j.B(f6 / b0(), 4294967296L);
        }
        InterfaceC1004a a = AbstractC1005b.a(b0());
        return s4.j.B(a != null ? a.a(f6) : f6 / b0(), 4294967296L);
    }

    default long t(long j3) {
        if (j3 != 9205357640488583168L) {
            return Y4.l.h(V(Float.intBitsToFloat((int) (j3 >> 32))), V(Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float u0(long j3) {
        if (!p.a(o.b(j3), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return e0(A(j3));
    }
}
