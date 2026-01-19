package Q4;

import com.vladsch.flexmark.parser.PegdownExtensions;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: Q4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494b {
    public static final C0494b a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C0494b f6496b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C0494b f6497c = new Object();

    public static final h a(C0494b c0494b, String str) {
        h hVar = new h(str);
        h.f6516d.put(str, hVar);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [d5.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [d5.i, java.lang.Object] */
    public static String b(String str, int i6, int i7, String str2, int i8) {
        int i9 = (i8 & 1) != 0 ? 0 : i6;
        int length = (i8 & 2) != 0 ? str.length() : i7;
        boolean z5 = (i8 & 8) == 0;
        boolean z6 = (i8 & 16) == 0;
        boolean z7 = (i8 & 32) == 0;
        boolean z8 = (i8 & 64) == 0;
        AbstractC1276k.f(str, "<this>");
        int i10 = i9;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            int i11 = PegdownExtensions.FENCED_CODE_BLOCKS;
            int i12 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z8) || AbstractC1776n.H(str2, (char) codePointAt) || ((codePointAt == 37 && (!z5 || (z6 && !d(i10, length, str)))) || (codePointAt == 43 && z7)))) {
                ?? obj = new Object();
                obj.f0(i9, i10, str);
                ?? r22 = 0;
                while (i10 < length) {
                    int codePointAt2 = str.codePointAt(i10);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z7) {
                            obj.g0(z5 ? "+" : "%2B");
                        } else if (codePointAt2 < i12 || codePointAt2 == 127 || ((codePointAt2 >= i11 && !z8) || AbstractC1776n.H(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z5 || (z6 && !d(i10, length, str)))))) {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.h0(codePointAt2);
                            while (!r22.f()) {
                                byte readByte = r22.readByte();
                                obj.S(37);
                                char[] cArr = p.f6564j;
                                obj.S(cArr[((readByte & 255) >> 4) & 15]);
                                obj.S(cArr[readByte & 15]);
                            }
                        } else {
                            obj.h0(codePointAt2);
                        }
                    }
                    i10 += Character.charCount(codePointAt2);
                    i11 = PegdownExtensions.FENCED_CODE_BLOCKS;
                    i12 = 32;
                    r22 = r22;
                }
                return obj.y();
            }
            i10 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i9, length);
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(int i6, int i7, String str) {
        int i8 = i6 + 2;
        return i8 < i7 && str.charAt(i6) == '%' && R4.b.r(str.charAt(i6 + 1)) != -1 && R4.b.r(str.charAt(i8)) != -1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d5.i, java.lang.Object] */
    public static String e(int i6, int i7, int i8, String str) {
        int i9;
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        boolean z5 = (i8 & 4) == 0;
        AbstractC1276k.f(str, "<this>");
        int i10 = i6;
        while (i10 < i7) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z5)) {
                ?? obj = new Object();
                obj.f0(i6, i10, str);
                while (i10 < i7) {
                    int codePointAt = str.codePointAt(i10);
                    if (codePointAt != 37 || (i9 = i10 + 2) >= i7) {
                        if (codePointAt == 43 && z5) {
                            obj.S(32);
                            i10++;
                        }
                        obj.h0(codePointAt);
                        i10 += Character.charCount(codePointAt);
                    } else {
                        int r5 = R4.b.r(str.charAt(i10 + 1));
                        int r6 = R4.b.r(str.charAt(i9));
                        if (r5 != -1 && r6 != -1) {
                            obj.S((r5 << 4) + r6);
                            i10 = Character.charCount(codePointAt) + i9;
                        }
                        obj.h0(codePointAt);
                        i10 += Character.charCount(codePointAt);
                    }
                }
                return obj.y();
            }
            i10++;
        }
        String substring = str.substring(i6, i7);
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 <= str.length()) {
            int N5 = AbstractC1776n.N(str, '&', i6, 4);
            if (N5 == -1) {
                N5 = str.length();
            }
            int N6 = AbstractC1776n.N(str, '=', i6, 4);
            if (N6 == -1 || N6 > N5) {
                String substring = str.substring(i6, N5);
                AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i6, N6);
                AbstractC1276k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(N6 + 1, N5);
                AbstractC1276k.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i6 = N5 + 1;
        }
        return arrayList;
    }

    public static void g(List list, StringBuilder sb) {
        AbstractC1276k.f(list, "<this>");
        r4.e u5 = AbstractC1117a.u(AbstractC1117a.z(0, list.size()), 2);
        int i6 = u5.f14679c;
        int i7 = u5.f14680e;
        int i8 = u5.f14681f;
        if ((i8 <= 0 || i6 > i7) && (i8 >= 0 || i7 > i6)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i6);
            String str2 = (String) list.get(i6 + 1);
            if (i6 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i6 == i7) {
                return;
            } else {
                i6 += i8;
            }
        }
    }

    public synchronized h c(String str) {
        h hVar;
        String str2;
        try {
            AbstractC1276k.f(str, "javaName");
            LinkedHashMap linkedHashMap = h.f6516d;
            hVar = (h) linkedHashMap.get(str);
            if (hVar == null) {
                if (u4.u.D(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    AbstractC1276k.e(substring, "this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (u4.u.D(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    AbstractC1276k.e(substring2, "this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                hVar = (h) linkedHashMap.get(str2);
                if (hVar == null) {
                    hVar = new h(str);
                }
                linkedHashMap.put(str, hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }
}
