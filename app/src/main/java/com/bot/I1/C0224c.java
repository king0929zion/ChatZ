package I1;

import android.os.Bundle;
import java.util.Arrays;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: I1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224c extends F {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2539e;

    public static float[] g(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] h(String str) {
        return new int[]{((Number) F.a.d(str)).intValue()};
    }

    public static long[] i(String str) {
        return new long[]{((Number) F.f2533b.d(str)).longValue()};
    }

    public static boolean[] j(String str) {
        return new boolean[]{((Boolean) F.f2534c.d(str)).booleanValue()};
    }

    @Override // I1.F
    public final Object a(String str, Bundle bundle) {
        switch (this.f2539e) {
            case 0:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                h5.e.a0(str);
                throw null;
            case 1:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                h5.e.a0(str);
                throw null;
            case 2:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                h5.e.a0(str);
                throw null;
            case 3:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                h5.e.a0(str);
                throw null;
            default:
                AbstractC1276k.f(bundle, "bundle");
                if (!bundle.containsKey(str) || Y3.C.A(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                h5.e.a0(str);
                throw null;
        }
    }

    @Override // I1.F
    public final String b() {
        switch (this.f2539e) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // I1.F
    public final Object c(Object obj, String str) {
        switch (this.f2539e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] j3 = j(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(j3, 0, copyOf, length, 1);
                AbstractC1276k.c(copyOf);
                return copyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] g3 = g(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(g3, 0, copyOf2, length2, 1);
                AbstractC1276k.c(copyOf2);
                return copyOf2;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return h(str);
                }
                int[] h3 = h(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(h3, 0, copyOf3, length3, 1);
                AbstractC1276k.c(copyOf3);
                return copyOf3;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] i6 = i(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(i6, 0, copyOf4, length4, 1);
                AbstractC1276k.c(copyOf4);
                return copyOf4;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                AbstractC1276k.c(copyOf5);
                return (String[]) copyOf5;
        }
    }

    @Override // I1.F
    public final Object d(String str) {
        switch (this.f2539e) {
            case 0:
                return j(str);
            case 1:
                return g(str);
            case 2:
                return h(str);
            case 3:
                return i(str);
            default:
                return new String[]{str};
        }
    }

    @Override // I1.F
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f2539e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                AbstractC1276k.f(str, "key");
                if (zArr != null) {
                    bundle.putBooleanArray(str, zArr);
                    return;
                } else {
                    AbstractC1410a.E(str, bundle);
                    return;
                }
            case 1:
                float[] fArr = (float[]) obj;
                AbstractC1276k.f(str, "key");
                if (fArr != null) {
                    bundle.putFloatArray(str, fArr);
                    return;
                } else {
                    AbstractC1410a.E(str, bundle);
                    return;
                }
            case 2:
                int[] iArr = (int[]) obj;
                AbstractC1276k.f(str, "key");
                if (iArr != null) {
                    bundle.putIntArray(str, iArr);
                    return;
                } else {
                    AbstractC1410a.E(str, bundle);
                    return;
                }
            case 3:
                long[] jArr = (long[]) obj;
                AbstractC1276k.f(str, "key");
                if (jArr != null) {
                    bundle.putLongArray(str, jArr);
                    return;
                } else {
                    AbstractC1410a.E(str, bundle);
                    return;
                }
            default:
                String[] strArr = (String[]) obj;
                AbstractC1276k.f(str, "key");
                if (strArr != null) {
                    bundle.putStringArray(str, strArr);
                    return;
                } else {
                    AbstractC1410a.E(str, bundle);
                    return;
                }
        }
    }

    @Override // I1.F
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.f2539e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i6 = 0; i6 < length; i6++) {
                        boolArr[i6] = Boolean.valueOf(zArr[i6]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i7 = 0; i7 < length2; i7++) {
                        boolArr2[i7] = Boolean.valueOf(zArr2[i7]);
                    }
                }
                return Y3.k.e0(boolArr, boolArr2);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i8 = 0; i8 < length3; i8++) {
                        fArr[i8] = Float.valueOf(fArr2[i8]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i9 = 0; i9 < length4; i9++) {
                        fArr4[i9] = Float.valueOf(fArr3[i9]);
                    }
                }
                return Y3.k.e0(fArr, fArr4);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i10 = 0; i10 < length5; i10++) {
                        numArr[i10] = Integer.valueOf(iArr[i10]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i11 = 0; i11 < length6; i11++) {
                        numArr2[i11] = Integer.valueOf(iArr2[i11]);
                    }
                }
                return Y3.k.e0(numArr, numArr2);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i12 = 0; i12 < length7; i12++) {
                        lArr[i12] = Long.valueOf(jArr[i12]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i13 = 0; i13 < length8; i13++) {
                        lArr2[i13] = Long.valueOf(jArr2[i13]);
                    }
                }
                return Y3.k.e0(lArr, lArr2);
            default:
                return Y3.k.e0((String[]) obj, (String[]) obj2);
        }
    }
}
