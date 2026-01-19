package u4;

import com.vladsch.flexmark.parser.PegdownExtensions;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: u4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1766d {
    public static final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f15178b;

    static {
        int[] iArr = new int[PegdownExtensions.WIKILINKS];
        int i6 = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            iArr[i7] = "0123456789abcdef".charAt(i7 & 15) | ("0123456789abcdef".charAt(i7 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[PegdownExtensions.WIKILINKS];
        for (int i8 = 0; i8 < 256; i8++) {
            iArr2[i8] = "0123456789ABCDEF".charAt(i8 & 15) | ("0123456789ABCDEF".charAt(i8 >> 4) << '\b');
        }
        int[] iArr3 = new int[PegdownExtensions.WIKILINKS];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr3[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i12)] = i13;
            i12++;
            i13++;
        }
        long[] jArr = new long[PegdownExtensions.WIKILINKS];
        for (int i14 = 0; i14 < 256; i14++) {
            jArr[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        while (i6 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i6)] = i17;
            i6++;
            i17++;
        }
        f15178b = jArr;
    }

    public static final void a(int i6, int i7, String str) {
        int i8 = i7 - i6;
        if (i8 < 1) {
            String substring = str.substring(i6, i7);
            AbstractC1276k.e(substring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i6 + ", but was \"" + substring + "\" of length " + i8);
        }
        if (i8 > 16) {
            int i9 = (i8 + i6) - 16;
            while (i6 < i9) {
                if (str.charAt(i6) != '0') {
                    StringBuilder k3 = AbstractC1135a.k("Expected the hexadecimal digit '0' at index ", i6, ", but was '");
                    k3.append(str.charAt(i6));
                    k3.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(k3.toString());
                }
                i6++;
            }
        }
    }

    public static long b(int i6, int i7, String str) {
        C1769g c1769g = C1769g.f15180d;
        AbstractC1276k.f(c1769g, "format");
        s4.j.k(i6, i7, str.length());
        if (c1769g.f15182c.a) {
            a(i6, i7, str);
            return c(i6, i7, str);
        }
        if (i7 - i6 > 0) {
            a(i6, i7, str);
            return c(i6, i7, str);
        }
        String substring = str.substring(i6, i7);
        AbstractC1276k.e(substring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(substring));
    }

    public static final long c(int i6, int i7, String str) {
        long j3 = 0;
        while (i6 < i7) {
            long j4 = j3 << 4;
            char charAt = str.charAt(i6);
            if ((charAt >>> '\b') == 0) {
                long j5 = f15178b[charAt];
                if (j5 >= 0) {
                    j3 = j4 | j5;
                    i6++;
                }
            }
            StringBuilder k3 = AbstractC1135a.k("Expected a hexadecimal digit at index ", i6, ", but was ");
            k3.append(str.charAt(i6));
            throw new NumberFormatException(k3.toString());
        }
        return j3;
    }
}
