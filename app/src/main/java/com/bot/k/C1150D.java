package k;

import i4.AbstractC1117a;
import java.util.Arrays;
import m4.AbstractC1276k;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150D {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f12446b;

    public C1150D(int i6) {
        this.a = i6 == 0 ? AbstractC1172t.a : new long[i6];
    }

    public final void a(long j3) {
        int i6 = this.f12446b + 1;
        long[] jArr = this.a;
        if (jArr.length < i6) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i6, (jArr.length * 3) / 2));
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
        long[] jArr2 = this.a;
        int i7 = this.f12446b;
        jArr2[i7] = j3;
        this.f12446b = i7 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1150D) {
            C1150D c1150d = (C1150D) obj;
            int i6 = c1150d.f12446b;
            int i7 = this.f12446b;
            if (i6 == i7) {
                long[] jArr = this.a;
                long[] jArr2 = c1150d.a;
                r4.g z5 = AbstractC1117a.z(0, i7);
                int i8 = z5.f14679c;
                int i9 = z5.f14680e;
                if (i8 > i9) {
                    return true;
                }
                while (jArr[i8] == jArr2[i8]) {
                    if (i8 == i9) {
                        return true;
                    }
                    i8++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i6 = this.f12446b;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += Long.hashCode(jArr[i8]) * 31;
        }
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i6 = this.f12446b;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                sb.append((CharSequence) "]");
                break;
            }
            long j3 = jArr[i7];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j3);
            i7++;
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
