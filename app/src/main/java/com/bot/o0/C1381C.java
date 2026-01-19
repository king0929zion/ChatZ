package o0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import j1.AbstractC1135a;
import java.util.List;
import n0.C1353b;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381C extends AbstractC1388J {

    /* renamed from: c, reason: collision with root package name */
    public final List f13406c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13407d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13408e;

    public C1381C(List list, long j3, long j4) {
        this.f13406c = list;
        this.f13407d = j3;
        this.f13408e = j4;
    }

    @Override // o0.AbstractC1388J
    public final Shader b(long j3) {
        long j4 = this.f13407d;
        int i6 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j3 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i6);
        int i7 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.POSITIVE_INFINITY) {
            i7 = (int) (j3 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i7);
        long j5 = this.f13408e;
        int i8 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i8) == Float.POSITIVE_INFINITY) {
            i8 = (int) (j3 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i8);
        int i9 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j3 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i9);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.f13406c;
        if (list.size() < 2) {
            throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
        }
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = y.B(((s) list.get(i10)).a);
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr, (float[]) null, y.A(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1381C)) {
            return false;
        }
        C1381C c1381c = (C1381C) obj;
        return this.f13406c.equals(c1381c.f13406c) && C1353b.c(this.f13407d, c1381c.f13407d) && C1353b.c(this.f13408e, c1381c.f13408e);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1135a.c(AbstractC1135a.c(this.f13406c.hashCode() * 961, 31, this.f13407d), 31, this.f13408e);
    }

    public final String toString() {
        String str;
        long j3 = this.f13407d;
        long j4 = (((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (j4 == 0) {
            str = "start=" + ((Object) C1353b.h(j3)) + ", ";
        } else {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        long j5 = this.f13408e;
        if (((((j5 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C1353b.h(j5)) + ", ";
        }
        return "LinearGradient(colors=" + this.f13406c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
