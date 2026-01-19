package Y3;

import i1.AbstractC1087g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class k extends Y4.d {
    public static void A0(Object[] objArr, Comparator comparator, int i6, int i7) {
        AbstractC1276k.f(objArr, "<this>");
        AbstractC1276k.f(comparator, "comparator");
        Arrays.sort(objArr, i6, i7, comparator);
    }

    public static List B0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : Y4.l.H(objArr[0]) : v.f9812c;
    }

    public static Set C0(Object[] objArr) {
        AbstractC1276k.f(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return x.f9814c;
        }
        if (length == 1) {
            return h5.e.i0(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C.H(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static List a0(Object[] objArr) {
        AbstractC1276k.f(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        AbstractC1276k.e(asList, "asList(...)");
        return asList;
    }

    public static boolean b0(Object obj, Object[] objArr) {
        AbstractC1276k.f(objArr, "<this>");
        return v0(obj, objArr) >= 0;
    }

    public static boolean c0(char[] cArr, char c6) {
        int length = cArr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            }
            if (c6 == cArr[i6]) {
                break;
            }
            i6++;
        }
        return i6 >= 0;
    }

    public static boolean d0(int[] iArr, int i6) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (i6 == iArr[i7]) {
                break;
            }
            i7++;
        }
        return i7 >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean e0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = objArr[i6];
            Object obj2 = objArr2[i6];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!e0((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof X3.q) && (obj2 instanceof X3.q)) {
                    byte[] bArr = ((X3.q) obj).f9407c;
                    byte[] bArr2 = ((X3.q) obj2).f9407c;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof X3.x) && (obj2 instanceof X3.x)) {
                    short[] sArr = ((X3.x) obj).f9413c;
                    Object r5 = ((X3.x) obj2).f9413c;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, (short[]) (r5 != 0 ? r5 : null))) {
                        return false;
                    }
                } else if ((obj instanceof X3.s) && (obj2 instanceof X3.s)) {
                    int[] iArr = ((X3.s) obj).f9409c;
                    Object r52 = ((X3.s) obj2).f9409c;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, (int[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof X3.u) && (obj2 instanceof X3.u)) {
                    long[] jArr = ((X3.u) obj).f9411c;
                    Object r53 = ((X3.u) obj2).f9411c;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, (long[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void f0(int i6, int i7, int i8, byte[] bArr, byte[] bArr2) {
        AbstractC1276k.f(bArr, "<this>");
        AbstractC1276k.f(bArr2, "destination");
        System.arraycopy(bArr, i7, bArr2, i6, i8 - i7);
    }

    public static void g0(char[] cArr, char[] cArr2, int i6, int i7, int i8) {
        AbstractC1276k.f(cArr, "<this>");
        System.arraycopy(cArr, i7, cArr2, i6, i8 - i7);
    }

    public static void h0(int[] iArr, int[] iArr2, int i6, int i7, int i8) {
        AbstractC1276k.f(iArr, "<this>");
        AbstractC1276k.f(iArr2, "destination");
        System.arraycopy(iArr, i7, iArr2, i6, i8 - i7);
    }

    public static void i0(long[] jArr, long[] jArr2, int i6, int i7, int i8) {
        AbstractC1276k.f(jArr, "<this>");
        AbstractC1276k.f(jArr2, "destination");
        System.arraycopy(jArr, i7, jArr2, i6, i8 - i7);
    }

    public static void j0(Object[] objArr, Object[] objArr2, int i6, int i7, int i8) {
        AbstractC1276k.f(objArr, "<this>");
        AbstractC1276k.f(objArr2, "destination");
        System.arraycopy(objArr, i7, objArr2, i6, i8 - i7);
    }

    public static /* synthetic */ void k0(int[] iArr, int[] iArr2, int i6, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = iArr.length;
        }
        h0(iArr, iArr2, i6, 0, i7);
    }

    public static /* synthetic */ void l0(Object[] objArr, Object[] objArr2, int i6, int i7, int i8) {
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = objArr.length;
        }
        j0(objArr, objArr2, 0, i6, i7);
    }

    public static byte[] m0(byte[] bArr, int i6, int i7) {
        AbstractC1276k.f(bArr, "<this>");
        Y4.d.w(i7, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6, i7);
        AbstractC1276k.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] n0(Object[] objArr, int i6, int i7) {
        AbstractC1276k.f(objArr, "<this>");
        Y4.d.w(i7, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i6, i7);
        AbstractC1276k.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void o0(Object obj, Object[] objArr, int i6, int i7) {
        AbstractC1276k.f(objArr, "<this>");
        Arrays.fill(objArr, i6, i7, obj);
    }

    public static void p0(long[] jArr, long j3) {
        int length = jArr.length;
        AbstractC1276k.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j3);
    }

    public static ArrayList r0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Float s0(float[] fArr) {
        AbstractC1276k.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r4.e, r4.g] */
    public static r4.g t0(int[] iArr) {
        return new r4.e(0, iArr.length - 1, 1);
    }

    public static int u0(long[] jArr) {
        AbstractC1276k.f(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int v0(Object obj, Object[] objArr) {
        AbstractC1276k.f(objArr, "<this>");
        int i6 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i6 < length) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i6 < length2) {
            if (obj.equals(objArr[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final void w0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, s4.g gVar) {
        AbstractC1276k.f(objArr, "<this>");
        sb.append(charSequence2);
        int i6 = 0;
        for (Object obj : objArr) {
            i6++;
            if (i6 > 1) {
                sb.append(charSequence);
            }
            AbstractC1087g.g(sb, obj, gVar);
        }
        sb.append(charSequence3);
    }

    public static Float x0(float[] fArr) {
        AbstractC1276k.f(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static char y0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void z0(Object[] objArr, Comparator comparator) {
        AbstractC1276k.f(objArr, "<this>");
        AbstractC1276k.f(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
