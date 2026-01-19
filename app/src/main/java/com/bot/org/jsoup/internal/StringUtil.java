package org.jsoup.internal;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;

/* loaded from: classes.dex */
public final class StringUtil {
    private static final int MaxCachedBuilderSize = 8192;
    private static final int MaxIdleBuilders = 8;
    static final String[] padding = {FlexmarkHtmlConverter.DEFAULT_NODE, SequenceUtils.SPACE, "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final Pattern extraDotSegmentsPattern = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final Pattern validUriScheme = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    private static final Pattern controlChars = Pattern.compile("[\\x00-\\x1f]*");
    private static final ThreadLocal<Stack<StringBuilder>> threadLocalBuilders = ThreadLocal.withInitial(new Object());

    /* loaded from: classes.dex */
    public static class StringJoiner {
        final String separator;
        StringBuilder sb = StringUtil.borrowBuilder();
        boolean first = true;

        public StringJoiner(String str) {
            this.separator = str;
        }

        public StringJoiner add(Object obj) {
            Validate.notNull(this.sb);
            if (!this.first) {
                this.sb.append(this.separator);
            }
            this.sb.append(obj);
            this.first = false;
            return this;
        }

        public StringJoiner append(Object obj) {
            Validate.notNull(this.sb);
            this.sb.append(obj);
            return this;
        }

        public String complete() {
            String releaseBuilder = StringUtil.releaseBuilder(this.sb);
            this.sb = null;
            return releaseBuilder;
        }
    }

    public static void appendNormalisedWhitespace(StringBuilder sb, String str, boolean z5) {
        int length = str.length();
        int i6 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            if (isActuallyWhitespace(codePointAt)) {
                if ((!z5 || z6) && !z7) {
                    sb.append(SequenceUtils.SPC);
                    z7 = true;
                }
            } else if (!isInvisibleChar(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z7 = false;
                z6 = true;
            }
            i6 += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder borrowBuilder() {
        Stack<StringBuilder> stack = threadLocalBuilders.get();
        return stack.empty() ? new StringBuilder(MaxCachedBuilderSize) : stack.pop();
    }

    public static boolean in(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean inSorted(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean isActuallyWhitespace(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 12 || i6 == 13 || i6 == 160;
    }

    public static boolean isAscii(String str) {
        Validate.notNull(str);
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i6 = 0; i6 < length; i6++) {
                if (!isWhitespace(str.codePointAt(i6))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInvisibleChar(int i6) {
        return i6 == 8203 || i6 == 173;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!Character.isDigit(str.codePointAt(i6))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 12 || i6 == 13;
    }

    public static String join(Collection<?> collection, String str) {
        return join(collection.iterator(), str);
    }

    public static String normaliseWhitespace(String str) {
        StringBuilder borrowBuilder = borrowBuilder();
        appendNormalisedWhitespace(borrowBuilder, str, false);
        return releaseBuilder(borrowBuilder);
    }

    public static String padding(int i6) {
        return padding(i6, 30);
    }

    public static String releaseBuilder(StringBuilder sb) {
        Validate.notNull(sb);
        String sb2 = sb.toString();
        if (sb.length() > MaxCachedBuilderSize) {
            sb = new StringBuilder(MaxCachedBuilderSize);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = threadLocalBuilders.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    public static URL resolve(URL url, String str) {
        String stripControlChars = stripControlChars(str);
        if (stripControlChars.startsWith("?")) {
            stripControlChars = url.getPath() + stripControlChars;
        }
        URL url2 = new URL(url, stripControlChars);
        String replaceFirst = extraDotSegmentsPattern.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    public static boolean startsWithNewline(String str) {
        return (str == null || str.length() == 0 || str.charAt(0) != '\n') ? false : true;
    }

    private static String stripControlChars(String str) {
        return controlChars.matcher(str).replaceAll(FlexmarkHtmlConverter.DEFAULT_NODE);
    }

    public static String join(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringJoiner stringJoiner = new StringJoiner(str);
        stringJoiner.add(obj);
        while (it.hasNext()) {
            stringJoiner.add(it.next());
        }
        return stringJoiner.complete();
    }

    public static String padding(int i6, int i7) {
        Validate.isTrue(i6 >= 0, "width must be >= 0");
        Validate.isTrue(i7 >= -1);
        if (i7 != -1) {
            i6 = Math.min(i6, i7);
        }
        String[] strArr = padding;
        if (i6 < strArr.length) {
            return strArr[i6];
        }
        char[] cArr = new char[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            cArr[i8] = SequenceUtils.SPC;
        }
        return String.valueOf(cArr);
    }

    public static String resolve(String str, String str2) {
        String stripControlChars = stripControlChars(str);
        String stripControlChars2 = stripControlChars(str2);
        try {
            try {
                return resolve(new URL(stripControlChars), stripControlChars2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(stripControlChars2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return validUriScheme.matcher(stripControlChars2).find() ? stripControlChars2 : FlexmarkHtmlConverter.DEFAULT_NODE;
        }
    }

    public static String join(String[] strArr, String str) {
        return join(Arrays.asList(strArr), str);
    }
}
