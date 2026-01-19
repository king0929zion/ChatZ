package k;

import i4.AbstractC1117a;
import java.util.Arrays;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178z {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f12592b;

    public C1178z(int i6) {
        int[] iArr;
        if (i6 == 0) {
            iArr = AbstractC1169p.a;
        } else {
            iArr = new int[i6];
        }
        this.a = iArr;
    }

    public final void a(int i6) {
        b(this.f12592b + 1);
        int[] iArr = this.a;
        int i7 = this.f12592b;
        iArr[i7] = i6;
        this.f12592b = i7 + 1;
    }

    public final void b(int i6) {
        int[] iArr = this.a;
        if (iArr.length < i6) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i6, (iArr.length * 3) / 2));
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    public final int c(int i6) {
        if (i6 >= 0 && i6 < this.f12592b) {
            return this.a[i6];
        }
        AbstractC1180a.d("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i6 = this.f12592b;
        if (i6 != 0) {
            return this.a[i6 - 1];
        }
        AbstractC1180a.e("IntList is empty.");
        throw null;
    }

    public final void e(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f12592b)) {
            AbstractC1180a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i8 = iArr[i6];
        if (i6 != i7 - 1) {
            Y3.k.h0(iArr, iArr, i6, i6 + 1, i7);
        }
        this.f12592b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1178z) {
            C1178z c1178z = (C1178z) obj;
            int i6 = c1178z.f12592b;
            int i7 = this.f12592b;
            if (i6 == i7) {
                int[] iArr = this.a;
                int[] iArr2 = c1178z.a;
                r4.g z5 = AbstractC1117a.z(0, i7);
                int i8 = z5.f14679c;
                int i9 = z5.f14680e;
                if (i8 > i9) {
                    return true;
                }
                while (iArr[i8] == iArr2[i8]) {
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

    public final void f(int i6, int i7) {
        if (i6 < 0 || i6 >= this.f12592b) {
            AbstractC1180a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i8 = iArr[i6];
        iArr[i6] = i7;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i6 = this.f12592b;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += Integer.hashCode(iArr[i8]) * 31;
        }
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i6 = this.f12592b;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                sb.append((CharSequence) "]");
                break;
            }
            int i8 = iArr[i7];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i8);
            i7++;
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ C1178z() {
        this(16);
    }
}
