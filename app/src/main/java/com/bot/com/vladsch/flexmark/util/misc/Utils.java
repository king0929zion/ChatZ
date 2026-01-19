package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.formatter.i;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.ast.Node;
import j1.AbstractC1135a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class Utils {
    public static int compare(Number number, Number number2) {
        if (number == null && number2 == null) {
            return 0;
        }
        if (number == null) {
            return -1;
        }
        if (number2 == null) {
            return 1;
        }
        return ((number instanceof Double) || (number2 instanceof Double) || (number instanceof Float) || (number2 instanceof Float)) ? Double.compare(number.doubleValue(), number2.doubleValue()) : Long.compare(number.longValue(), number2.longValue());
    }

    public static <T extends Comparable<T>> int compareNullable(T t5, T t6) {
        if (t5 == null || t6 == null) {
            return 0;
        }
        return t5.compareTo(t6);
    }

    public static int count(String str, char c6, int i6, int i7) {
        int i8 = 0;
        if (str == null) {
            return 0;
        }
        int min = Math.min(str.length(), i7);
        while (i6 >= 0 && i6 <= min) {
            int indexOf = str.indexOf(c6, i6);
            if (indexOf < 0) {
                break;
            }
            i8++;
            i6 = indexOf + 1;
        }
        return i8;
    }

    public static boolean endsWith(String str, String... strArr) {
        return endsWith(str, false, strArr);
    }

    public static String escapeJavaString(CharSequence charSequence) {
        if (charSequence == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        escapeJavaString(sb, charSequence);
        return sb.toString();
    }

    public static String getAbbreviatedText(String str, int i6) {
        if (str == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (str.length() <= i6 || i6 < 6) {
            return str;
        }
        int i7 = i6 / 2;
        return AbstractC1135a.g(str.substring(0, i7), Node.SPLICE, str.substring(str.length() - ((i6 - 3) - i7)));
    }

    public static String getLongestCommonPrefix(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        String str = strArr[0];
        int length = str.length();
        int length2 = strArr.length;
        for (int i6 = 1; i6 < length2; i6++) {
            length = Math.min(strArr[i6].length(), length);
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            for (int i8 = 1; i8 < length2; i8++) {
                if (strArr[i8].charAt(i7) != charAt) {
                    return str.substring(0, i7);
                }
            }
        }
        return str.substring(0, length);
    }

    public static <T> T getOrNull(List<T> list, int i6) {
        if (i6 < 0 || i6 >= list.size()) {
            return null;
        }
        return list.get(i6);
    }

    public static String getResourceAsString(Class<?> cls, String str) {
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        StringBuilder sb = new StringBuilder();
        streamAppend(sb, resourceAsStream);
        return sb.toString();
    }

    public static String ifEmpty(String str, String str2) {
        return (str == null || str.isEmpty()) ? str2 : str;
    }

    public static String ifEmptyNullArgs(String str, String str2, String str3) {
        return (str == null || str.isEmpty()) ? str2 : str3;
    }

    public static <T> T ifNull(T t5, T t6) {
        return t5 == null ? t6 : t5;
    }

    public static <T> T ifNullOr(T t5, boolean z5, T t6) {
        return (t5 == null || z5) ? t6 : t5;
    }

    public static String ifNullOrBlank(String str, String str2) {
        return (str == null || isBlank(str)) ? str2 : str;
    }

    public static String ifNullOrEmpty(String str, String str2) {
        return (str == null || str.isEmpty()) ? str2 : str;
    }

    public static <T> T ifNullOrNot(T t5, boolean z5, T t6) {
        return (t5 == null || !z5) ? t6 : t5;
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isIn(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWhiteSpaceNoEOL(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\t') {
                return false;
            }
        }
        return true;
    }

    public static String join(String[] strArr, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str5 : strArr) {
            sb.append(str3);
            sb.append(str5);
            sb.append(str4);
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$removeIf$0(BiFunction biFunction, Map.Entry entry) {
        return (Boolean) biFunction.apply(entry.getKey(), entry.getValue());
    }

    public static int max(int i6, int... iArr) {
        for (int i7 : iArr) {
            if (i6 < i7) {
                i6 = i7;
            }
        }
        return i6;
    }

    public static int maxLimit(int i6, int... iArr) {
        return min(i6, iArr);
    }

    public static int min(int i6, int... iArr) {
        for (int i7 : iArr) {
            if (i6 > i7) {
                i6 = i7;
            }
        }
        return i6;
    }

    public static int minLimit(int i6, int... iArr) {
        return max(i6, iArr);
    }

    public static String orEmpty(String str) {
        return str == null ? FlexmarkHtmlConverter.DEFAULT_NODE : str;
    }

    public static String prefixWith(String str, char c6) {
        return prefixWith(str, c6, false);
    }

    public static <K, V> V putIfMissing(Map<K, V> map, K k3, Supplier<V> supplier) {
        V v5 = map.get(k3);
        if (v5 != null) {
            return v5;
        }
        V v6 = supplier.get();
        map.put(k3, v6);
        return v6;
    }

    public static String quoteJavaString(CharSequence charSequence) {
        if (charSequence == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        escapeJavaString(sb, charSequence);
        sb.append("\"");
        return sb.toString();
    }

    public static int rangeLimit(int i6, int i7, int i8) {
        return Math.min(Math.max(i6, i7), i8);
    }

    public static String regexGroup(String str) {
        return AbstractC1135a.s("(?:", orEmpty(str), ")");
    }

    public static boolean regionMatches(CharSequence charSequence, int i6, String str, int i7, int i8, boolean z5) {
        if (z5) {
            for (int i9 = 0; i9 < i8; i9++) {
                if (Character.toLowerCase(charSequence.charAt(i9 + i6)) != Character.toLowerCase(str.charAt(i9 + i7))) {
                    return false;
                }
            }
            return true;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            if (charSequence.charAt(i10 + i6) != str.charAt(i10 + i7)) {
                return false;
            }
        }
        return true;
    }

    public static String removeAnyPrefix(String str, String... strArr) {
        if (str == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        for (String str2 : strArr) {
            if (str.startsWith(String.valueOf(str2))) {
                return str.substring(str2.length());
            }
        }
        return str;
    }

    public static String removeAnySuffix(String str, String... strArr) {
        if (str == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        for (String str2 : strArr) {
            if (str.endsWith(String.valueOf(str2))) {
                return str.substring(0, str.length() - str2.length());
            }
        }
        return str;
    }

    public static <K, V> void removeIf(Map<K, V> map, Function<Map.Entry<K, V>, Boolean> function) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (function.apply(entry).booleanValue()) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            map.remove(obj);
        }
    }

    public static String removePrefix(String str, char c6) {
        if (str != null) {
            return str.startsWith(String.valueOf(c6)) ? str.substring(1) : str;
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static String removePrefixIncluding(String str, String str2) {
        if (str == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        int indexOf = str.indexOf(str2);
        return indexOf != -1 ? str.substring(str2.length() + indexOf) : str;
    }

    public static String removeSuffix(String str, char c6) {
        if (str != null) {
            return str.endsWith(String.valueOf(c6)) ? str.substring(0, str.length() - 1) : str;
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static String repeat(String str, int i6) {
        if (i6 <= 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        StringBuilder sb = new StringBuilder(str.length() * i6);
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                return sb.toString();
            }
            sb.append(str);
            i6 = i7;
        }
    }

    public static <T> T setOrAdd(List<T> list, int i6, T t5) {
        if (i6 != list.size()) {
            return list.set(i6, t5);
        }
        list.add(t5);
        return null;
    }

    public static String splice(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder((str.length() + 10) * strArr.length);
        int length = strArr.length;
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        int i6 = 0;
        while (i6 < length) {
            String str3 = strArr[i6];
            sb.append(str2);
            sb.append(str3);
            i6++;
            str2 = str;
        }
        return sb.toString();
    }

    public static boolean startsWith(String str, String... strArr) {
        return startsWith(str, false, strArr);
    }

    public static void streamAppend(StringBuilder sb, InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            return;
                        } else {
                            sb.append(readLine);
                            sb.append('\n');
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    e7.printStackTrace();
                    return;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                bufferedReader.close();
                return;
            }
        }
    }

    public static <T> List<? extends T> stringSorted(Collection<? extends T> collection, Function<T, String> function) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.sort(Comparator.comparing(function));
        return arrayList;
    }

    public static String suffixWith(String str, char c6) {
        return suffixWith(str, c6, false);
    }

    public static String suffixWithEol(String str) {
        return suffixWith(str, '\n', false);
    }

    public static String urlDecode(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return orEmpty(str);
        }
    }

    public static String urlEncode(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException unused) {
            return orEmpty(str);
        }
    }

    public static <K, V> Map<K, V> withDefaults(Map<K, V> map, Map<K, V> map2) {
        HashMap hashMap = new HashMap(map);
        for (final Map.Entry<K, V> entry : map2.entrySet()) {
            putIfMissing(hashMap, entry.getKey(), new Supplier() { // from class: com.vladsch.flexmark.util.misc.g
                @Override // java.util.function.Supplier
                public final Object get() {
                    return entry.getValue();
                }
            });
        }
        return hashMap;
    }

    public static String wrapWith(String str, char c6) {
        return wrapWith(str, c6, c6);
    }

    public static boolean endsWith(String str, boolean z5, String... strArr) {
        if (str == null) {
            return false;
        }
        if (z5) {
            for (String str2 : strArr) {
                if (str.length() >= str2.length() && str.substring(str.length() - str2.length()).equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        } else {
            for (String str3 : strArr) {
                if (str.endsWith(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String ifEmpty(String str, String str2, String str3) {
        return (str == null || str.isEmpty()) ? str2 : str3;
    }

    public static <T> T ifNullOr(T t5, Function<T, Boolean> function, T t6) {
        return (t5 == null || function.apply(t5).booleanValue()) ? t6 : t5;
    }

    public static <T> T ifNullOrNot(T t5, Function<T, Boolean> function, T t6) {
        return (t5 == null || !function.apply(t5).booleanValue()) ? t6 : t5;
    }

    public static float max(float f6, float... fArr) {
        for (float f7 : fArr) {
            if (f6 < f7) {
                f6 = f7;
            }
        }
        return f6;
    }

    public static float maxLimit(float f6, float... fArr) {
        return min(f6, fArr);
    }

    public static float min(float f6, float... fArr) {
        for (float f7 : fArr) {
            if (f6 > f7) {
                f6 = f7;
            }
        }
        return f6;
    }

    public static float minLimit(float f6, float... fArr) {
        return max(f6, fArr);
    }

    public static String prefixWith(String str, char c6, boolean z5) {
        if (str != null && !str.isEmpty() && !startsWith(str, String.valueOf(c6), z5)) {
            return c6 + str;
        }
        return orEmpty(str);
    }

    public static float rangeLimit(float f6, float f7, float f8) {
        return Math.min(Math.max(f6, f7), f8);
    }

    public static boolean startsWith(String str, boolean z5, String... strArr) {
        if (str == null) {
            return false;
        }
        if (z5) {
            for (String str2 : strArr) {
                if (str.length() >= str2.length() && str.substring(0, str2.length()).equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        } else {
            for (String str3 : strArr) {
                if (str.startsWith(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String suffixWith(String str, char c6, boolean z5) {
        if (str != null && !str.isEmpty() && !endsWith(str, String.valueOf(c6), z5)) {
            return str + c6;
        }
        return orEmpty(str);
    }

    public static String wrapWith(String str, char c6, char c7) {
        if (str == null || str.isEmpty()) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        return c6 + str + c7;
    }

    public static int count(String str, String str2, int i6, int i7) {
        int i8 = 0;
        if (str == null) {
            return 0;
        }
        int min = Math.min(str.length(), i7);
        while (i6 >= 0 && i6 <= min) {
            int indexOf = str.indexOf(str2, i6);
            if (indexOf < 0 || indexOf > min) {
                break;
            }
            i8++;
            i6 = indexOf + 1;
        }
        return i8;
    }

    public static <T, S extends T> S getOrNull(List<T> list, int i6, Class<S> cls) {
        if (i6 >= 0 && i6 < list.size()) {
            T t5 = list.get(i6);
            if (cls.isInstance(t5)) {
                return t5;
            }
        }
        return null;
    }

    public static String ifEmpty(String str, Supplier<String> supplier) {
        return (str == null || str.isEmpty()) ? supplier.get() : str;
    }

    public static String wrapWith(String str, String str2) {
        return wrapWith(str, str2, str2);
    }

    public static String removePrefix(String str, String str2) {
        if (str != null) {
            return str.startsWith(String.valueOf(str2)) ? str.substring(str2.length()) : str;
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static String removeSuffix(String str, String str2) {
        if (str != null) {
            return str.endsWith(String.valueOf(str2)) ? str.substring(0, str.length() - str2.length()) : str;
        }
        return FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public static String wrapWith(String str, String str2, String str3) {
        return (str == null || str.isEmpty()) ? FlexmarkHtmlConverter.DEFAULT_NODE : prefixWith(suffixWith(str, str3), str2);
    }

    public static void escapeJavaString(StringBuilder sb, CharSequence charSequence) {
        int length = charSequence.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == 0) {
                sb.append("\\0");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\f') {
                sb.append("\\f");
            } else if (charAt != '\r') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case AbstractC1787b.f15287d /* 9 */:
                        sb.append("\\t");
                        break;
                    case AbstractC1787b.f15289f /* 10 */:
                        sb.append("\\n");
                        break;
                    default:
                        if (charAt < ' ') {
                            sb.append('%');
                            sb.append(String.format("%02x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            sb.append(charAt);
                            break;
                        }
                }
            } else {
                sb.append("\\r");
            }
        }
    }

    public static String ifEmpty(String str, Supplier<String> supplier, Supplier<String> supplier2) {
        return (str == null || str.isEmpty()) ? supplier.get() : supplier2.get();
    }

    public static String prefixWith(String str, String str2) {
        return prefixWith(str, str2, false);
    }

    public static String suffixWith(String str, String str2) {
        return suffixWith(str, str2, false);
    }

    public static boolean endsWith(CharSequence charSequence, String str, boolean z5) {
        return charSequence.length() >= str.length() && regionMatches(charSequence, charSequence.length() - str.length(), str, 0, str.length(), z5);
    }

    public static String prefixWith(String str, String str2, boolean z5) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && !startsWith(str, str2, z5)) {
            return str2.concat(str);
        }
        return orEmpty(str);
    }

    public static String splice(Collection<String> collection, String str, boolean z5) {
        StringBuilder sb = new StringBuilder((str.length() + 10) * collection.size());
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        for (String str3 : collection) {
            if ((str3 != null && !str3.isEmpty()) || !z5) {
                if (!z5 || (!str3.startsWith(str) && !endsWith(sb.toString(), str))) {
                    sb.append(str2);
                }
                sb.append(orEmpty(str3));
                str2 = str;
            }
        }
        return sb.toString();
    }

    public static boolean startsWith(CharSequence charSequence, String str, boolean z5) {
        return charSequence.length() >= str.length() && regionMatches(charSequence, 0, str, 0, str.length(), z5);
    }

    public static String suffixWith(String str, String str2, boolean z5) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty() && !endsWith(str, str2, z5)) {
            return str.concat(str2);
        }
        return orEmpty(str);
    }

    public static String join(Collection<String> collection, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str5 : collection) {
            sb.append(str3);
            sb.append(str5);
            sb.append(str4);
        }
        sb.append(str2);
        return sb.toString();
    }

    public static <K, V> void removeIf(Map<K, V> map, BiFunction<K, V, Boolean> biFunction) {
        removeIf(map, new i(biFunction, 2));
    }
}
