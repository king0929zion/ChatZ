package f1;

import androidx.lifecycle.N;
import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006c implements InterfaceC1004a {
    public final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f11755b;

    public C1006c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.f11755b = fArr2;
    }

    @Override // f1.InterfaceC1004a
    public final float a(float f6) {
        return N.h(f6, this.f11755b, this.a);
    }

    @Override // f1.InterfaceC1004a
    public final float b(float f6) {
        return N.h(f6, this.a, this.f11755b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1006c)) {
            return false;
        }
        C1006c c1006c = (C1006c) obj;
        return Arrays.equals(this.a, c1006c.a) && Arrays.equals(this.f11755b, c1006c.f11755b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11755b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        AbstractC1276k.e(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f11755b);
        AbstractC1276k.e(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
