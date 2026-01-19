package u4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;

/* renamed from: u4.n */
/* loaded from: classes.dex */
public abstract class AbstractC1776n implements u {
    public static boolean G(CharSequence charSequence, String str, boolean z5) {
        AbstractC1276k.f(charSequence, "<this>");
        AbstractC1276k.f(str, "other");
        return O(charSequence, str, 0, z5, 2) >= 0;
    }

    public static boolean H(CharSequence charSequence, char c6) {
        AbstractC1276k.f(charSequence, "<this>");
        return N(charSequence, c6, 0, 2) >= 0;
    }

    public static String I(int i6, String str) {
        AbstractC1276k.f(str, "<this>");
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("Requested character count ", i6, " is less than zero.").toString());
        }
        int length = str.length();
        if (i6 > length) {
            i6 = length;
        }
        String substring = str.substring(i6);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static boolean J(CharSequence charSequence, String str) {
        return charSequence instanceof String ? u.w((String) charSequence, str, false) : W(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean K(String str, char c6) {
        AbstractC1276k.f(str, "<this>");
        return str.length() > 0 && AbstractC1120d.n(str.charAt(L(str)), c6, false);
    }

    public static int L(CharSequence charSequence) {
        AbstractC1276k.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int M(CharSequence charSequence, String str, int i6, boolean z5) {
        AbstractC1276k.f(charSequence, "<this>");
        AbstractC1276k.f(str, "string");
        if (!z5 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i6);
        }
        int length = charSequence.length();
        int i7 = i6 < 0 ? 0 : i6;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        r4.e eVar = new r4.e(i7, length, 1);
        boolean z6 = charSequence instanceof String;
        int i8 = eVar.f14681f;
        int i9 = eVar.f14680e;
        int i10 = eVar.f14679c;
        if (!z6 || !(str instanceof String)) {
            if ((i8 <= 0 || i10 > i9) && (i8 >= 0 || i9 > i10)) {
                return -1;
            }
            while (!W(str, 0, charSequence, i10, str.length(), z5)) {
                if (i10 == i9) {
                    return -1;
                }
                i10 += i8;
            }
            return i10;
        }
        if ((i8 <= 0 || i10 > i9) && (i8 >= 0 || i9 > i10)) {
            return -1;
        }
        int i11 = i10;
        while (!u.z(str, 0, (String) charSequence, i11, str.length(), z5)) {
            if (i11 == i9) {
                return -1;
            }
            i11 += i8;
        }
        return i11;
    }

    public static int N(CharSequence charSequence, char c6, int i6, int i7) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        AbstractC1276k.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? P(charSequence, new char[]{c6}, i6, false) : ((String) charSequence).indexOf(c6, i6);
    }

    public static /* synthetic */ int O(CharSequence charSequence, String str, int i6, boolean z5, int i7) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return M(charSequence, str, i6, z5);
    }

    public static final int P(CharSequence charSequence, char[] cArr, int i6, boolean z5) {
        AbstractC1276k.f(charSequence, "<this>");
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(Y3.k.y0(cArr), i6);
        }
        if (i6 < 0) {
            i6 = 0;
        }
        int L5 = L(charSequence);
        if (i6 > L5) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i6);
            for (char c6 : cArr) {
                if (AbstractC1120d.n(c6, charAt, z5)) {
                    return i6;
                }
            }
            if (i6 == L5) {
                return -1;
            }
            i6++;
        }
    }

    public static boolean Q(CharSequence charSequence) {
        AbstractC1276k.f(charSequence, "<this>");
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            if (!AbstractC1120d.r(charSequence.charAt(i6))) {
                return false;
            }
        }
        return true;
    }

    public static char R(CharSequence charSequence) {
        AbstractC1276k.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(L(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int S(CharSequence charSequence, char c6, int i6, int i7) {
        if ((i7 & 2) != 0) {
            i6 = L(charSequence);
        }
        AbstractC1276k.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c6, i6);
        }
        char[] cArr = {c6};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(Y3.k.y0(cArr), i6);
        }
        int L5 = L(charSequence);
        if (i6 > L5) {
            i6 = L5;
        }
        while (-1 < i6) {
            if (AbstractC1120d.n(cArr[0], charSequence.charAt(i6), false)) {
                return i6;
            }
            i6--;
        }
        return -1;
    }

    public static int T(String str, int i6, String str2) {
        int L5 = (i6 & 2) != 0 ? L(str) : 0;
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "string");
        return str.lastIndexOf(str2, L5);
    }

    public static List U(String str) {
        AbstractC1276k.f(str, "<this>");
        return t4.j.v(new Y3.t(str, 3));
    }

    public static String V(int i6, String str) {
        CharSequence charSequence;
        AbstractC1276k.f(str, "<this>");
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("Desired length ", i6, " is less than zero."));
        }
        if (i6 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i6);
            int length = i6 - str.length();
            int i7 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean W(CharSequence charSequence, int i6, CharSequence charSequence2, int i7, int i8, boolean z5) {
        AbstractC1276k.f(charSequence, "<this>");
        AbstractC1276k.f(charSequence2, "other");
        if (i7 < 0 || i6 < 0 || i6 > charSequence.length() - i8 || i7 > charSequence2.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!AbstractC1120d.n(charSequence.charAt(i6 + i9), charSequence2.charAt(i7 + i9), z5)) {
                return false;
            }
        }
        return true;
    }

    public static String X(String str, String str2) {
        String str3;
        String str4;
        boolean W5;
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "prefix");
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "prefix");
        if (str2 instanceof String) {
            W5 = u.D(str, str2, false);
            str3 = str;
            str4 = str2;
        } else {
            str3 = str;
            str4 = str2;
            W5 = W(str3, 0, str4, 0, str2.length(), false);
        }
        if (!W5) {
            return str3;
        }
        String substring = str3.substring(str4.length());
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String Y(String str, String str2) {
        if (!J(str, str2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static final void Z(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List a0(int i6, CharSequence charSequence, String str) {
        Z(i6);
        int M5 = M(charSequence, str, 0, false);
        if (M5 == -1 || i6 == 1) {
            return Y4.l.H(charSequence.toString());
        }
        boolean z5 = i6 > 0;
        int i7 = 10;
        if (z5 && i6 <= 10) {
            i7 = i6;
        }
        ArrayList arrayList = new ArrayList(i7);
        int i8 = 0;
        do {
            arrayList.add(charSequence.subSequence(i8, M5).toString());
            i8 = str.length() + M5;
            if (z5 && arrayList.size() == i6 - 1) {
                break;
            }
            M5 = M(charSequence, str, i8, false);
        } while (M5 != -1);
        arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
        return arrayList;
    }

    public static List b0(String str, char[] cArr, int i6) {
        int i7 = (i6 & 4) != 0 ? 0 : 2;
        AbstractC1276k.f(str, "<this>");
        if (cArr.length == 1) {
            return a0(i7, str, String.valueOf(cArr[0]));
        }
        Z(i7);
        K4.i iVar = new K4.i(new C1765c(str, i7, new v(cArr, 0)), 2);
        ArrayList arrayList = new ArrayList(Y3.n.Z(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            C1764b c1764b = (C1764b) it;
            if (!c1764b.hasNext()) {
                return arrayList;
            }
            r4.g gVar = (r4.g) c1764b.next();
            AbstractC1276k.f(gVar, "range");
            arrayList.add(str.subSequence(gVar.f14679c, gVar.f14680e + 1).toString());
        }
    }

    public static List c0(String str, String[] strArr) {
        AbstractC1276k.f(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return a0(0, str, str2);
            }
        }
        Z(0);
        K4.i iVar = new K4.i(new C1765c(str, 0, new v(Y3.k.a0(strArr), 1)), 2);
        ArrayList arrayList = new ArrayList(Y3.n.Z(iVar, 10));
        Iterator it = iVar.iterator();
        while (true) {
            C1764b c1764b = (C1764b) it;
            if (!c1764b.hasNext()) {
                return arrayList;
            }
            r4.g gVar = (r4.g) c1764b.next();
            AbstractC1276k.f(gVar, "range");
            arrayList.add(str.subSequence(gVar.f14679c, gVar.f14680e + 1).toString());
        }
    }

    public static boolean d0(String str, char c6) {
        AbstractC1276k.f(str, "<this>");
        return str.length() > 0 && AbstractC1120d.n(str.charAt(0), c6, false);
    }

    public static String e0(char c6, String str, String str2) {
        int N5 = N(str, c6, 0, 6);
        if (N5 == -1) {
            return str2;
        }
        String substring = str.substring(N5 + 1, str.length());
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String f0(String str, String str2) {
        AbstractC1276k.f(str2, "delimiter");
        int O5 = O(str, str2, 0, false, 6);
        if (O5 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + O5, str.length());
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String g0(char c6, String str, String str2) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str2, "missingDelimiterValue");
        int S5 = S(str, c6, 0, 6);
        if (S5 == -1) {
            return str2;
        }
        String substring = str.substring(S5 + 1, str.length());
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String h0(String str, char c6) {
        int N5 = N(str, c6, 0, 6);
        if (N5 == -1) {
            return str;
        }
        String substring = str.substring(0, N5);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String i0(String str, char c6) {
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(str, "missingDelimiterValue");
        int S5 = S(str, c6, 0, 6);
        if (S5 == -1) {
            return str;
        }
        String substring = str.substring(0, S5);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String j0(int i6, String str) {
        AbstractC1276k.f(str, "<this>");
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("Requested character count ", i6, " is less than zero.").toString());
        }
        int length = str.length();
        if (i6 > length) {
            i6 = length;
        }
        String substring = str.substring(0, i6);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static String k0(int i6, String str) {
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("Requested character count ", i6, " is less than zero.").toString());
        }
        int length = str.length();
        if (i6 > length) {
            i6 = length;
        }
        String substring = str.substring(length - i6);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public static CharSequence l0(CharSequence charSequence) {
        AbstractC1276k.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i6 = 0;
        boolean z5 = false;
        while (i6 <= length) {
            boolean r5 = AbstractC1120d.r(charSequence.charAt(!z5 ? i6 : length));
            if (z5) {
                if (!r5) {
                    break;
                }
                length--;
            } else if (r5) {
                i6++;
            } else {
                z5 = true;
            }
        }
        return charSequence.subSequence(i6, length + 1);
    }

    public static String m0(String str, char... cArr) {
        AbstractC1276k.f(str, "<this>");
        int length = str.length() - 1;
        int i6 = 0;
        boolean z5 = false;
        while (i6 <= length) {
            boolean c02 = Y3.k.c0(cArr, str.charAt(!z5 ? i6 : length));
            if (z5) {
                if (!c02) {
                    break;
                }
                length--;
            } else if (c02) {
                i6++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i6, length + 1).toString();
    }

    public static String n0(String str, char... cArr) {
        CharSequence charSequence;
        AbstractC1276k.f(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i6 = length - 1;
                if (!Y3.k.c0(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i6 < 0) {
                    break;
                }
                length = i6;
            }
            return charSequence.toString();
        }
        charSequence = FlexmarkHtmlConverter.DEFAULT_NODE;
        return charSequence.toString();
    }

    public static CharSequence o0(String str) {
        AbstractC1276k.f(str, "<this>");
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!AbstractC1120d.r(str.charAt(i6))) {
                return str.subSequence(i6, str.length());
            }
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static String p0(String str, char... cArr) {
        CharSequence charSequence;
        AbstractC1276k.f(str, "<this>");
        int length = str.length();
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                charSequence = FlexmarkHtmlConverter.DEFAULT_NODE;
                break;
            }
            if (!Y3.k.c0(cArr, str.charAt(i6))) {
                charSequence = str.subSequence(i6, str.length());
                break;
            }
            i6++;
        }
        return charSequence.toString();
    }
}
