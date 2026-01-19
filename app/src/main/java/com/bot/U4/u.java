package u4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1120d;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class u implements t {
    public static String A(String str, int i6) {
        AbstractC1276k.f(str, "<this>");
        if (i6 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i6 + '.').toString());
        }
        if (i6 == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        int i7 = 1;
        if (i6 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i6];
            for (int i8 = 0; i8 < i6; i8++) {
                cArr[i8] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i6);
        if (1 <= i6) {
            while (true) {
                sb.append((CharSequence) str);
                if (i7 == i6) {
                    break;
                }
                i7++;
            }
        }
        String sb2 = sb.toString();
        AbstractC1276k.c(sb2);
        return sb2;
    }

    public static String B(String str, String str2, String str3, boolean z5) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "oldValue");
        AbstractC1276k.f(str3, "newValue");
        int i6 = 0;
        int M5 = AbstractC1776n.M(str, str2, 0, z5);
        if (M5 < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i6, M5);
            sb.append(str3);
            i6 = M5 + length;
            if (M5 >= str.length()) {
                break;
            }
            M5 = AbstractC1776n.M(str, str2, M5 + i7, z5);
        } while (M5 > 0);
        sb.append((CharSequence) str, i6, str.length());
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public static boolean C(String str, String str2, int i6, boolean z5) {
        AbstractC1276k.f(str, "<this>");
        return !z5 ? str.startsWith(str2, i6) : z(str, i6, str2, 0, str2.length(), z5);
    }

    public static boolean D(String str, String str2, boolean z5) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "prefix");
        return !z5 ? str.startsWith(str2) : z(str, 0, str2, 0, str2.length(), z5);
    }

    public static Integer E(String str) {
        boolean z5;
        int i6;
        int i7;
        AbstractC1276k.f(str, "<this>");
        AbstractC1120d.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        int i9 = -2147483647;
        if (AbstractC1276k.g(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z5 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i9 = Integer.MIN_VALUE;
                z5 = true;
            }
        } else {
            z5 = false;
            i6 = 0;
        }
        int i10 = -59652323;
        while (i6 < length) {
            int digit = Character.digit((int) str.charAt(i6), 10);
            if (digit < 0) {
                return null;
            }
            if ((i8 < i10 && (i10 != -59652323 || i8 < (i10 = i9 / 10))) || (i7 = i8 * 10) < i9 + digit) {
                return null;
            }
            i8 = i7 - digit;
            i6++;
        }
        return z5 ? Integer.valueOf(i8) : Integer.valueOf(-i8);
    }

    public static Long F(int i6, String str) {
        boolean z5;
        AbstractC1276k.f(str, "<this>");
        AbstractC1120d.g(i6);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        long j3 = -9223372036854775807L;
        if (AbstractC1276k.g(charAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z5 = false;
                i7 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j3 = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z5 = false;
        }
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), i6);
            if (digit < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 != -256204778801521550L) {
                    return null;
                }
                j5 = j3 / i6;
                if (j4 < j5) {
                    return null;
                }
            }
            long j6 = j4 * i6;
            long j7 = digit;
            if (j6 < j3 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i7++;
        }
        return z5 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }

    public static boolean w(String str, String str2, boolean z5) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "suffix");
        return !z5 ? str.endsWith(str2) : z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean x(String str, String str2, boolean z5) {
        return str == null ? str2 == null : !z5 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void y(String str) {
        throw new NumberFormatException(B3.e.g('\'', "Invalid number format: '", str));
    }

    public static boolean z(String str, int i6, String str2, int i7, int i8, boolean z5) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "other");
        return !z5 ? str.regionMatches(i6, str2, i7, i8) : str.regionMatches(z5, i6, str2, i7, i8);
    }
}
