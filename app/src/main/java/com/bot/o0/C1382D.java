package o0;

import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Arrays;
import m4.AbstractC1276k;
import n0.C1352a;

/* renamed from: o0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382D {
    public final float[] a;

    public static float[] a() {
        return new float[]{1.0f, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, 1.0f, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, 1.0f, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, 1.0f};
    }

    public static final long b(long j3, float[] fArr) {
        if (fArr.length < 16) {
            return j3;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f15 = 1 / (((f11 * intBitsToFloat2) + (f8 * intBitsToFloat)) + f14);
        if ((Float.floatToRawIntBits(f15) & TableCell.NOT_TRACKED) >= 2139095040) {
            f15 = S.l.f7374V;
        }
        float f16 = f10 * intBitsToFloat2;
        return (Float.floatToRawIntBits((((f9 * intBitsToFloat2) + (f6 * intBitsToFloat)) + f12) * f15) << 32) | (Float.floatToRawIntBits((f16 + (f7 * intBitsToFloat) + f13) * f15) & 4294967295L);
    }

    public static final void c(float[] fArr, C1352a c1352a) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float f15 = c1352a.a;
        float f16 = c1352a.f13291b;
        float f17 = c1352a.f13292c;
        float f18 = c1352a.f13293d;
        float f19 = f8 * f15;
        float f20 = f11 * f16;
        float f21 = 1.0f / ((f19 + f20) + f14);
        int floatToRawIntBits = Float.floatToRawIntBits(f21) & TableCell.NOT_TRACKED;
        float f22 = S.l.f7374V;
        if (floatToRawIntBits >= 2139095040) {
            f21 = 0.0f;
        }
        float f23 = f6 * f15;
        float f24 = f9 * f16;
        float f25 = (f23 + f24 + f12) * f21;
        float f26 = f15 * f7;
        float f27 = f16 * f10;
        float f28 = (f26 + f27 + f13) * f21;
        float f29 = f11 * f18;
        float f30 = 1.0f / ((f19 + f29) + f14);
        if ((Float.floatToRawIntBits(f30) & TableCell.NOT_TRACKED) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f9 * f18;
        float f32 = (f23 + f31 + f12) * f30;
        float f33 = f10 * f18;
        float f34 = (f26 + f33 + f13) * f30;
        float f35 = f8 * f17;
        float f36 = 1.0f / ((f20 + f35) + f14);
        if ((Float.floatToRawIntBits(f36) & TableCell.NOT_TRACKED) >= 2139095040) {
            f36 = 0.0f;
        }
        float f37 = f6 * f17;
        float f38 = (f37 + f24 + f12) * f36;
        float f39 = f17 * f7;
        float f40 = (f27 + f39 + f13) * f36;
        float f41 = 1.0f / ((f35 + f29) + f14);
        if ((Float.floatToRawIntBits(f41) & TableCell.NOT_TRACKED) < 2139095040) {
            f22 = f41;
        }
        float f42 = (f37 + f31 + f12) * f22;
        float f43 = (f39 + f33 + f13) * f22;
        c1352a.a = Math.min(f25, Math.min(f32, Math.min(f38, f42)));
        c1352a.f13291b = Math.min(f28, Math.min(f34, Math.min(f40, f43)));
        c1352a.f13292c = Math.max(f25, Math.max(f32, Math.max(f38, f42)));
        c1352a.f13293d = Math.max(f28, Math.max(f34, Math.max(f40, f43)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f6 = fArr[0];
            float f7 = fArr2[0];
            float f8 = fArr[1];
            float f9 = fArr2[4];
            float f10 = fArr[2];
            float f11 = fArr2[8];
            float f12 = f10 * f11;
            float f13 = fArr[3];
            float f14 = fArr2[12];
            float f15 = f13 * f14;
            float f16 = f15 + f12 + (f8 * f9) + (f6 * f7);
            float f17 = fArr2[1];
            float f18 = fArr2[5];
            float f19 = fArr2[9];
            float f20 = f10 * f19;
            float f21 = fArr2[13];
            float f22 = f13 * f21;
            float f23 = f22 + f20 + (f8 * f18) + (f6 * f17);
            float f24 = fArr2[2];
            float f25 = fArr2[6];
            float f26 = fArr2[10];
            float f27 = f10 * f26;
            float f28 = fArr2[14];
            float f29 = f13 * f28;
            float f30 = f29 + f27 + (f8 * f25) + (f6 * f24);
            float f31 = fArr2[3];
            float f32 = fArr2[7];
            float f33 = fArr2[11];
            float f34 = f10 * f33;
            float f35 = fArr2[15];
            float f36 = f13 * f35;
            float f37 = f36 + f34 + (f8 * f32) + (f6 * f31);
            float f38 = fArr[4];
            float f39 = fArr[5];
            float f40 = fArr[6];
            float f41 = (f40 * f11) + (f39 * f9) + (f38 * f7);
            float f42 = fArr[7];
            float f43 = (f42 * f14) + f41;
            float f44 = (f42 * f21) + (f40 * f19) + (f39 * f18) + (f38 * f17);
            float f45 = (f42 * f28) + (f40 * f26) + (f39 * f25) + (f38 * f24);
            float f46 = f40 * f33;
            float f47 = f42 * f35;
            float f48 = f47 + f46 + (f39 * f32) + (f38 * f31);
            float f49 = fArr[8];
            float f50 = fArr[9];
            float f51 = fArr[10];
            float f52 = (f51 * f11) + (f50 * f9) + (f49 * f7);
            float f53 = fArr[11];
            float f54 = (f53 * f14) + f52;
            float f55 = (f53 * f21) + (f51 * f19) + (f50 * f18) + (f49 * f17);
            float f56 = (f53 * f28) + (f51 * f26) + (f50 * f25) + (f49 * f24);
            float f57 = f51 * f33;
            float f58 = f53 * f35;
            float f59 = f58 + f57 + (f50 * f32) + (f49 * f31);
            float f60 = fArr[12];
            float f61 = fArr[13];
            float f62 = (f9 * f61) + (f7 * f60);
            float f63 = fArr[14];
            float f64 = (f11 * f63) + f62;
            float f65 = fArr[15];
            float f66 = (f14 * f65) + f64;
            float f67 = f19 * f63;
            float f68 = f21 * f65;
            float f69 = f68 + f67 + (f18 * f61) + (f17 * f60);
            float f70 = f26 * f63;
            float f71 = f28 * f65;
            float f72 = f71 + f70 + (f25 * f61) + (f24 * f60);
            float f73 = f63 * f33;
            float f74 = f65 * f35;
            fArr[0] = f16;
            fArr[1] = f23;
            fArr[2] = f30;
            fArr[3] = f37;
            fArr[4] = f43;
            fArr[5] = f44;
            fArr[6] = f45;
            fArr[7] = f48;
            fArr[8] = f54;
            fArr[9] = f55;
            fArr[10] = f56;
            fArr[11] = f59;
            fArr[12] = f66;
            fArr[13] = f69;
            fArr[14] = f72;
            fArr[15] = f74 + f73 + (f61 * f32) + (f60 * f31);
        }
    }

    public static final void f(float[] fArr, float f6, float f7) {
        if (fArr.length < 16) {
            return;
        }
        float f8 = (fArr[8] * S.l.f7374V) + (fArr[4] * f7) + (fArr[0] * f6) + fArr[12];
        float f9 = (fArr[9] * S.l.f7374V) + (fArr[5] * f7) + (fArr[1] * f6) + fArr[13];
        float f10 = (fArr[10] * S.l.f7374V) + (fArr[6] * f7) + (fArr[2] * f6) + fArr[14];
        float f11 = (fArr[11] * S.l.f7374V) + (fArr[7] * f7) + (fArr[3] * f6) + fArr[15];
        fArr[12] = f8;
        fArr[13] = f9;
        fArr[14] = f10;
        fArr[15] = f11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1382D) {
            return AbstractC1276k.b(this.a, ((C1382D) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[1]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[2]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[5]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[6]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[9]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[10]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[13]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[14]);
        sb.append(SequenceUtils.SPC);
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return u4.o.q(sb.toString());
    }
}
