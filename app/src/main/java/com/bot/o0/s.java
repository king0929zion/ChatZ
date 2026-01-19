package o0;

import com.vladsch.flexmark.parser.PegdownExtensions;
import k.C1147A;
import p0.AbstractC1467c;
import p0.AbstractC1472h;
import p0.AbstractC1474j;
import p0.C1468d;
import p0.C1471g;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final long f13475b = y.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f13476c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f13477d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f13478e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f13479f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f13480g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f13481h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f13482i = 0;
    public final long a;

    static {
        y.d(4282664004L);
        f13476c = y.d(4287137928L);
        y.d(4291611852L);
        f13477d = y.d(4294967295L);
        f13478e = y.d(4294901760L);
        y.d(4278255360L);
        f13479f = y.d(4278190335L);
        y.d(4294967040L);
        y.d(4278255615L);
        y.d(4294902015L);
        f13480g = y.c(0);
        f13481h = y.b(S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, C1468d.f13857u);
    }

    public /* synthetic */ s(long j3) {
        this.a = j3;
    }

    public static final /* synthetic */ s a(long j3) {
        return new s(j3);
    }

    public static final long b(long j3, AbstractC1467c abstractC1467c) {
        C1471g c1471g;
        AbstractC1467c g3 = g(j3);
        int i6 = g3.f13837c;
        int i7 = abstractC1467c.f13837c;
        if ((i6 | i7) < 0) {
            c1471g = AbstractC1474j.e(g3, abstractC1467c);
        } else {
            C1147A c1147a = AbstractC1472h.a;
            int i8 = i6 | (i7 << 6);
            Object b5 = c1147a.b(i8);
            if (b5 == null) {
                b5 = AbstractC1474j.e(g3, abstractC1467c);
                c1147a.i(i8, b5);
            }
            c1471g = (C1471g) b5;
        }
        return c1471g.a(j3);
    }

    public static long c(float f6, long j3) {
        return y.b(i(j3), h(j3), f(j3), f6, g(j3));
    }

    public static final boolean d(long j3, long j4) {
        return j3 == j4;
    }

    public static final float e(long j3) {
        float f6;
        float f7;
        if ((63 & j3) == 0) {
            f6 = (float) X3.a.f((j3 >>> 56) & 255);
            f7 = 255.0f;
        } else {
            f6 = (float) X3.a.f((j3 >>> 6) & 1023);
            f7 = 1023.0f;
        }
        return f6 / f7;
    }

    public static final float f(long j3) {
        int i6;
        int i7;
        int i8;
        if ((63 & j3) == 0) {
            return ((float) X3.a.f((j3 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j3 >>> 16) & 65535);
        int i9 = 32768 & s5;
        int i10 = ((65535 & s5) >>> 10) & 31;
        int i11 = s5 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= PegdownExtensions.EXTANCHORLINKS;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - v.a;
                return i9 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    public static final AbstractC1467c g(long j3) {
        float[] fArr = C1468d.a;
        return C1468d.f13861y[(int) (j3 & 63)];
    }

    public static final float h(long j3) {
        int i6;
        int i7;
        int i8;
        if ((63 & j3) == 0) {
            return ((float) X3.a.f((j3 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j3 >>> 32) & 65535);
        int i9 = 32768 & s5;
        int i10 = ((65535 & s5) >>> 10) & 31;
        int i11 = s5 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= PegdownExtensions.EXTANCHORLINKS;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - v.a;
                return i9 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    public static final float i(long j3) {
        int i6;
        int i7;
        int i8;
        if ((63 & j3) == 0) {
            return ((float) X3.a.f((j3 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j3 >>> 48) & 65535);
        int i9 = 32768 & s5;
        int i10 = ((65535 & s5) >>> 10) & 31;
        int i11 = s5 & 1023;
        if (i10 != 0) {
            int i12 = i11 << 13;
            if (i10 == 31) {
                i6 = 255;
                if (i12 != 0) {
                    i12 |= PegdownExtensions.EXTANCHORLINKS;
                }
            } else {
                i6 = i10 + 112;
            }
            int i13 = i6;
            i7 = i12;
            i8 = i13;
        } else {
            if (i11 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i11 + 1056964608) - v.a;
                return i9 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i8 = 0;
            i7 = 0;
        }
        return Float.intBitsToFloat((i8 << 23) | (i9 << 16) | i7);
    }

    public static String j(long j3) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(i(j3));
        sb.append(", ");
        sb.append(h(j3));
        sb.append(", ");
        sb.append(f(j3));
        sb.append(", ");
        sb.append(e(j3));
        sb.append(", ");
        return B3.e.r(sb, g(j3).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.a == ((s) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return j(this.a);
    }
}
