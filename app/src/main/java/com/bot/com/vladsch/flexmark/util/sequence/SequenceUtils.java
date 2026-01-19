package com.vladsch.flexmark.util.sequence;

import B3.e;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Utils;
import j1.AbstractC1135a;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public interface SequenceUtils {
    public static final String ANY_EOL = "\r\n";

    @Deprecated
    public static final CharPredicate ANY_EOL_SET;

    @Deprecated
    public static final CharPredicate BACKSLASH_SET;

    @Deprecated
    public static final CharPredicate DECIMAL_DIGITS;
    public static final int[] EMPTY_INDICES;
    public static final char ENC_NUL = 65533;
    public static final String EOL = "\n";

    @Deprecated
    public static final String EOL_CHARS = "\r\n";

    @Deprecated
    public static final CharPredicate HASH_SET;

    @Deprecated
    public static final CharPredicate HEXADECIMAL_DIGITS;
    public static final char LS = 8232;

    @Deprecated
    public static final char LSEP = 8232;
    public static final char NUL = 0;

    @Deprecated
    public static final CharPredicate OCTAL_DIGITS;
    public static final String SPACE = " ";
    public static final String SPACE_EOL = " \n";

    @Deprecated
    public static final CharPredicate SPACE_EOL_SET;
    public static final String SPACE_TAB = " \t";
    public static final char SPC = ' ';
    public static final int SPLIT_INCLUDE_DELIMS = 1;
    public static final int SPLIT_INCLUDE_DELIM_PARTS = 8;
    public static final int SPLIT_SKIP_EMPTY = 4;
    public static final int SPLIT_TRIM_PARTS = 2;
    public static final int SPLIT_TRIM_SKIP_EMPTY = 6;
    public static final char US = 31;

    @Deprecated
    public static final CharPredicate US_SET;
    public static final String WHITESPACE = " \t\r\n";

    @Deprecated
    public static final String WHITESPACE_CHARS = " \t\r\n";
    public static final String WHITESPACE_NBSP = " \t\r\n ";

    @Deprecated
    public static final String WHITESPACE_NBSP_CHARS = " \t\r\n ";

    @Deprecated
    public static final CharPredicate WHITESPACE_NBSP_SET;

    @Deprecated
    public static final String WHITESPACE_NO_EOL_CHARS = " \t";

    @Deprecated
    public static final CharPredicate WHITESPACE_SET;
    public static final Map<Character, String> visibleSpacesMap;
    public static final char EOL_CHAR = "\r\n".charAt(1);
    public static final char EOL_CHAR1 = "\r\n".charAt(0);
    public static final char EOL_CHAR2 = "\r\n".charAt(1);
    public static final String LINE_SEP = Character.toString(8232);
    public static final String US_CHARS = Character.toString(31);
    public static final char NBSP = 160;
    public static final String NBSP_CHARS = Character.toString(NBSP);

    @Deprecated
    public static final CharPredicate SPACE_SET = CharPredicate.SPACE;

    @Deprecated
    public static final CharPredicate TAB_SET = CharPredicate.TAB;

    @Deprecated
    public static final CharPredicate EOL_SET = CharPredicate.EOL;

    @Deprecated
    public static final CharPredicate SPACE_TAB_SET = CharPredicate.SPACE_TAB;

    @Deprecated
    public static final CharPredicate SPACE_TAB_NBSP_SET = CharPredicate.SPACE_TAB_NBSP;

    @Deprecated
    public static final CharPredicate SPACE_TAB_EOL_SET = CharPredicate.SPACE_TAB_EOL;

    static {
        CharPredicate charPredicate = CharPredicate.WHITESPACE;
        SPACE_EOL_SET = charPredicate;
        ANY_EOL_SET = CharPredicate.ANY_EOL;
        WHITESPACE_SET = charPredicate;
        WHITESPACE_NBSP_SET = CharPredicate.WHITESPACE_NBSP;
        BACKSLASH_SET = CharPredicate.BACKSLASH;
        US_SET = new d(0);
        CharPredicate charPredicate2 = CharPredicate.HASH;
        HASH_SET = charPredicate2;
        DECIMAL_DIGITS = charPredicate2;
        HEXADECIMAL_DIGITS = charPredicate2;
        OCTAL_DIGITS = charPredicate2;
        visibleSpacesMap = getVisibleSpacesMap();
        EMPTY_INDICES = new int[0];
    }

    static List<Range> blankLinesRemovedRanges(CharSequence charSequence) {
        return blankLinesRemovedRanges(charSequence, CharPredicate.EOL, 0, TableCell.NOT_TRACKED);
    }

    static int columnAtIndex(CharSequence charSequence, int i6) {
        int lastIndexOfAny = lastIndexOfAny(charSequence, CharPredicate.ANY_EOL, i6);
        return i6 - (lastIndexOfAny == -1 ? 0 : eolStartLength(charSequence, lastIndexOfAny) + lastIndexOfAny);
    }

    static int columnsToNextTabStop(int i6) {
        return 4 - (i6 % 4);
    }

    static int compare(CharSequence charSequence, CharSequence charSequence2) {
        return compare(charSequence, charSequence2, false);
    }

    static int compareReversed(CharSequence charSequence, CharSequence charSequence2) {
        return compare(charSequence2, charSequence);
    }

    static <T extends CharSequence> boolean containedBy(T[] tArr, CharSequence charSequence) {
        for (T t5 : tArr) {
            if (equals(charSequence, t5)) {
                return true;
            }
        }
        return false;
    }

    static boolean containsAny(CharSequence charSequence, CharPredicate charPredicate) {
        return indexOfAny(charSequence, charPredicate, 0, TableCell.NOT_TRACKED) != -1;
    }

    static boolean containsAnyNot(CharSequence charSequence, CharPredicate charPredicate) {
        return indexOfAny(charSequence, charPredicate.negate(), 0, TableCell.NOT_TRACKED) != -1;
    }

    static int countLeading(CharSequence charSequence, CharPredicate charPredicate) {
        return countLeading(charSequence, charPredicate, 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingColumns(CharSequence charSequence, int i6, CharPredicate charPredicate) {
        int length = charSequence.length();
        int indexOfAnyNot = indexOfAnyNot(charSequence, charPredicate, 0, length);
        int i7 = indexOfAnyNot == -1 ? length : indexOfAnyNot;
        if (indexOfAnyNot == -1) {
            indexOfAnyNot = length;
        }
        int indexOf = indexOf(charSequence, '\t', 0, i7);
        if (indexOf == -1) {
            return indexOfAnyNot;
        }
        do {
            i6 += columnsToNextTabStop(indexOf + i6) + indexOf;
            indexOf = indexOf(charSequence, '\t', indexOf + 1);
            if (indexOf < 0) {
                break;
            }
        } while (indexOf < length);
        return indexOfAnyNot + i6;
    }

    static int countLeadingNot(CharSequence charSequence, CharPredicate charPredicate) {
        return countLeading(charSequence, charPredicate.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingNotSpace(CharSequence charSequence) {
        return countLeading(charSequence, CharPredicate.SPACE.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingNotSpaceTab(CharSequence charSequence) {
        return countLeading(charSequence, CharPredicate.SPACE_TAB.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingNotWhitespace(CharSequence charSequence) {
        return countLeading(charSequence, CharPredicate.WHITESPACE.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingSpace(CharSequence charSequence) {
        return countLeading(charSequence, CharPredicate.SPACE, 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingSpaceTab(CharSequence charSequence) {
        return countLeading(charSequence, CharPredicate.SPACE_TAB, 0, TableCell.NOT_TRACKED);
    }

    static int countLeadingWhitespace(CharSequence charSequence) {
        return countLeading(charSequence, CharPredicate.WHITESPACE, 0, TableCell.NOT_TRACKED);
    }

    static int countOfAny(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return countOfAny(charSequence, charPredicate, i6, TableCell.NOT_TRACKED);
    }

    static int countOfAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        return countOfAny(charSequence, charPredicate.negate(), i6, i7);
    }

    static int countOfNotSpaceTab(CharSequence charSequence) {
        return countOfAny(charSequence, CharPredicate.SPACE_TAB.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countOfNotWhitespace(CharSequence charSequence) {
        return countOfAny(charSequence, CharPredicate.WHITESPACE.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countOfSpaceTab(CharSequence charSequence) {
        return countOfAny(charSequence, CharPredicate.SPACE_TAB, 0, TableCell.NOT_TRACKED);
    }

    static int countOfWhitespace(CharSequence charSequence) {
        return countOfAny(charSequence, CharPredicate.WHITESPACE, TableCell.NOT_TRACKED);
    }

    static int countTrailing(CharSequence charSequence, CharPredicate charPredicate) {
        return countTrailing(charSequence, charPredicate, 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingNot(CharSequence charSequence, CharPredicate charPredicate) {
        return countTrailing(charSequence, charPredicate.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingNotSpace(CharSequence charSequence) {
        return countTrailing(charSequence, CharPredicate.SPACE.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingNotSpaceTab(CharSequence charSequence) {
        return countTrailing(charSequence, CharPredicate.SPACE_TAB.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingNotWhitespace(CharSequence charSequence) {
        return countTrailing(charSequence, CharPredicate.WHITESPACE.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingSpace(CharSequence charSequence) {
        return countTrailing(charSequence, CharPredicate.SPACE, 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingSpaceTab(CharSequence charSequence) {
        return countTrailing(charSequence, CharPredicate.SPACE_TAB, 0, TableCell.NOT_TRACKED);
    }

    static int countTrailingWhitespace(CharSequence charSequence) {
        return countTrailing(charSequence, CharPredicate.WHITESPACE, 0, TableCell.NOT_TRACKED);
    }

    static int endOfDelimitedBy(CharSequence charSequence, CharSequence charSequence2, int i6) {
        int length = charSequence.length();
        int indexOf = indexOf(charSequence, charSequence2, Utils.rangeLimit(i6, 0, length));
        return indexOf == -1 ? length : indexOf;
    }

    static int endOfDelimitedByAny(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        int length = charSequence.length();
        int indexOfAny = indexOfAny(charSequence, charPredicate, Utils.rangeLimit(i6, 0, length));
        return indexOfAny == -1 ? length : indexOfAny;
    }

    static int endOfDelimitedByAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return endOfDelimitedByAny(charSequence, charPredicate.negate(), i6);
    }

    static int endOfLine(CharSequence charSequence, int i6) {
        return endOfDelimitedBy(charSequence, EOL, i6);
    }

    static int endOfLineAnyEOL(CharSequence charSequence, int i6) {
        return endOfDelimitedByAny(charSequence, CharPredicate.ANY_EOL, i6);
    }

    static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence.length() > 0 && matchCharsReversed(charSequence, charSequence2, charSequence.length() - 1, false);
    }

    static boolean endsWithAnyEOL(CharSequence charSequence) {
        return endsWith(charSequence, CharPredicate.ANY_EOL);
    }

    static boolean endsWithEOL(CharSequence charSequence) {
        return endsWith(charSequence, CharPredicate.EOL);
    }

    static boolean endsWithSpace(CharSequence charSequence) {
        return endsWith(charSequence, CharPredicate.SPACE);
    }

    static boolean endsWithSpaceTab(CharSequence charSequence) {
        return endsWith(charSequence, CharPredicate.SPACE_TAB);
    }

    static boolean endsWithWhitespace(CharSequence charSequence) {
        return endsWith(charSequence, CharPredicate.WHITESPACE);
    }

    static int eolEndLength(CharSequence charSequence) {
        return eolEndLength(charSequence, charSequence.length());
    }

    static Range eolEndRange(CharSequence charSequence, int i6) {
        int eolEndLength = eolEndLength(charSequence, i6);
        return eolEndLength == 0 ? Range.NULL : Range.of(i6 - eolEndLength, i6);
    }

    static int eolStartLength(CharSequence charSequence, int i6) {
        int length = charSequence.length();
        int min = Math.min(i6, length);
        if (min < 0 || min >= length) {
            return 0;
        }
        char charAt = charSequence.charAt(min);
        return charAt == '\r' ? safeCharAt(charSequence, min + 1) == '\n' ? 2 : 1 : (charAt != '\n' || safeCharAt(charSequence, min - 1) == '\r') ? 0 : 1;
    }

    static Range eolStartRange(CharSequence charSequence, int i6) {
        int eolStartLength = eolStartLength(charSequence, i6);
        return eolStartLength == 0 ? Range.NULL : Range.of(i6, eolStartLength + i6);
    }

    static boolean equals(CharSequence charSequence, Object obj) {
        if (obj == charSequence) {
            return true;
        }
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence2 = (CharSequence) obj;
        if (charSequence2.length() != charSequence.length()) {
            return false;
        }
        if (obj instanceof String) {
            if (((String) obj).hashCode() != charSequence.hashCode()) {
                return false;
            }
        } else if ((obj instanceof IRichSequence) && ((IRichSequence) obj).hashCode() != charSequence.hashCode()) {
            return false;
        }
        return matchChars(charSequence, charSequence2, 0, false);
    }

    static int[] expandTo(int[] iArr, int i6, int i7) {
        if ((i6 & i7) == 0) {
            i7 = 0;
        }
        int i8 = i6 + i7;
        if (iArr.length >= i8) {
            return iArr;
        }
        int[] iArr2 = new int[i8];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    static char firstChar(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return (char) 0;
        }
        return charSequence.charAt(0);
    }

    static Map<Character, String> getVisibleSpacesMap() {
        HashMap hashMap = new HashMap();
        hashMap.put('\n', "\\n");
        hashMap.put('\r', "\\r");
        hashMap.put('\f', "\\f");
        hashMap.put('\t', "\\u2192");
        hashMap.put((char) 8232, "➥");
        return hashMap;
    }

    static int hashCode(CharSequence charSequence) {
        int length = charSequence.length();
        if (length <= 0) {
            return 0;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            i6 = (i6 * 31) + charSequence.charAt(i7);
        }
        return i6;
    }

    static int indexOf(CharSequence charSequence, CharSequence charSequence2) {
        return indexOf(charSequence, charSequence2, 0, TableCell.NOT_TRACKED);
    }

    static int[] indexOfAll(CharSequence charSequence, CharSequence charSequence2) {
        int indexOf;
        int length = charSequence2.length();
        if (length != 0 && (indexOf = indexOf(charSequence, charSequence2)) != -1) {
            int[] iArr = new int[32];
            iArr[0] = indexOf;
            int i6 = 1;
            while (true) {
                indexOf = indexOf(charSequence, charSequence2, indexOf + length);
                if (indexOf == -1) {
                    return truncateTo(iArr, i6);
                }
                if (iArr.length <= i6) {
                    iArr = expandTo(iArr, i6 + 1, 32);
                }
                iArr[i6] = indexOf;
                i6++;
            }
        }
        return EMPTY_INDICES;
    }

    static int indexOfAny(CharSequence charSequence, CharPredicate charPredicate) {
        return indexOfAny(charSequence, charPredicate, 0, TableCell.NOT_TRACKED);
    }

    static int indexOfAnyNot(CharSequence charSequence, CharPredicate charPredicate) {
        return indexOfAny(charSequence, charPredicate.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int indexOfNot(CharSequence charSequence, char c6) {
        return indexOfNot(charSequence, c6, 0, TableCell.NOT_TRACKED);
    }

    static boolean isBlank(CharSequence charSequence) {
        return isEmpty(charSequence) || countLeading(charSequence, CharPredicate.WHITESPACE, 0, TableCell.NOT_TRACKED) == charSequence.length();
    }

    static boolean isEmpty(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    static boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    static boolean isNotEmpty(CharSequence charSequence) {
        return charSequence.length() != 0;
    }

    static boolean isVisibleWhitespace(char c6) {
        return visibleSpacesMap.containsKey(Character.valueOf(c6));
    }

    static /* synthetic */ boolean lambda$static$0(int i6) {
        return i6 == 31;
    }

    static char lastChar(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return (char) 0;
        }
        return charSequence.charAt(charSequence.length() - 1);
    }

    static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        return lastIndexOf(charSequence, charSequence2, 0, TableCell.NOT_TRACKED);
    }

    static int lastIndexOfAny(CharSequence charSequence, CharPredicate charPredicate) {
        return lastIndexOfAny(charSequence, charPredicate, 0, TableCell.NOT_TRACKED);
    }

    static int lastIndexOfAnyNot(CharSequence charSequence, CharPredicate charPredicate) {
        return lastIndexOfAny(charSequence, charPredicate.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int lastIndexOfNot(CharSequence charSequence, char c6) {
        return lastIndexOfNot(charSequence, c6, 0, TableCell.NOT_TRACKED);
    }

    static Range leadingBlankLinesRange(CharSequence charSequence) {
        return leadingBlankLinesRange(charSequence, CharPredicate.EOL, 0, TableCell.NOT_TRACKED);
    }

    static Pair<Integer, Integer> lineColumnAtIndex(CharSequence charSequence, int i6) {
        int length = charSequence.length();
        if (i6 < 0 || i6 > length) {
            throw new IllegalArgumentException(e.i(i6, "Index: ", length, " out of range [0, ", "]"));
        }
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        for (int i9 = 0; i9 < i6; i9++) {
            char charAt = charSequence.charAt(i9);
            if (charAt == '\r') {
                i7++;
                z5 = true;
                i8 = 0;
            } else if (charAt == '\n') {
                if (!z5) {
                    i7++;
                }
                i8 = 0;
                z5 = false;
            } else {
                i8++;
            }
        }
        return new Pair<>(Integer.valueOf(i7), Integer.valueOf(i8));
    }

    static Range lineRangeAt(CharSequence charSequence, int i6) {
        return Range.of(startOfLine(charSequence, i6), endOfLine(charSequence, i6));
    }

    static Range lineRangeAtAnyEOL(CharSequence charSequence, int i6) {
        return Range.of(startOfLineAnyEOL(charSequence, i6), endOfLineAnyEOL(charSequence, i6));
    }

    static boolean matchChars(CharSequence charSequence, CharSequence charSequence2, int i6, boolean z5) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, true, z5) == charSequence2.length();
    }

    static boolean matchCharsIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return matchChars(charSequence, charSequence2, i6, true);
    }

    static boolean matchCharsReversed(CharSequence charSequence, CharSequence charSequence2, int i6, boolean z5) {
        int i7 = i6 + 1;
        return i7 >= charSequence2.length() && matchChars(charSequence, charSequence2, i7 - charSequence2.length(), z5);
    }

    static boolean matchCharsReversedIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i6) {
        int i7 = i6 + 1;
        return i7 >= charSequence2.length() && matchChars(charSequence, charSequence2, i7 - charSequence2.length(), true);
    }

    static int matchedCharCount(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, false, z5);
    }

    static int matchedCharCountIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, false, true);
    }

    static int matchedCharCountReversed(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        return matchedCharCountReversed(charSequence, charSequence2, i6, i7, false);
    }

    static int matchedCharCountReversedIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        return matchedCharCountReversed(charSequence, charSequence2, i6, i7, true);
    }

    static boolean matches(CharSequence charSequence, CharSequence charSequence2, boolean z5) {
        return charSequence2.length() == charSequence.length() && matchChars(charSequence, charSequence2, 0, z5);
    }

    static boolean matchesIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence2.length() == charSequence.length() && matchChars(charSequence, charSequence2, 0, true);
    }

    static String padEnd(CharSequence charSequence, int i6, char c6) {
        return i6 <= charSequence.length() ? FlexmarkHtmlConverter.DEFAULT_NODE : RepeatedSequence.repeatOf(c6, i6 - charSequence.length()).toString();
    }

    static String padStart(CharSequence charSequence, int i6, char c6) {
        return i6 <= charSequence.length() ? FlexmarkHtmlConverter.DEFAULT_NODE : RepeatedSequence.repeatOf(c6, i6 - charSequence.length()).toString();
    }

    static int parseIntOrDefault(String str, int i6) {
        return parseIntOrDefault(str, i6, 10);
    }

    static Integer parseIntOrNull(String str) {
        return parseIntOrNull(str, 10);
    }

    static Long parseLongOrNull(String str) {
        return parseLongOrNull(str, 10);
    }

    static Number parseNumberOrNull(String str) {
        Long parseLongOrNull;
        if (str == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            return parseLongOrNull(str.substring(2), 16);
        }
        if (str.startsWith("0b")) {
            return parseLongOrNull(str.substring(2), 2);
        }
        if (str.startsWith("0") && (parseLongOrNull = parseLongOrNull(str.substring(1), 8)) != null) {
            return parseLongOrNull;
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        ParsePosition parsePosition = new ParsePosition(0);
        Number parse = numberFormat.parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        return null;
    }

    static Pair<Number, String> parseNumberPrefixOrNull(String str, Predicate<String> predicate) {
        int countLeading;
        if (str == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            int countLeading2 = countLeading(str.substring(2), CharPredicate.HEXADECIMAL_DIGITS);
            int i6 = countLeading2 + 2;
            String substring = str.substring(i6);
            if (countLeading2 > 0 && (substring.isEmpty() || predicate == null || predicate.test(substring))) {
                return Pair.of(parseLongOrNull(str.substring(2, i6), 16), substring);
            }
        } else if (str.startsWith("0b")) {
            int countLeading3 = countLeading(str.substring(2), CharPredicate.BINARY_DIGITS);
            int i7 = countLeading3 + 2;
            String substring2 = str.substring(i7);
            if (countLeading3 > 0 && (substring2.isEmpty() || predicate == null || predicate.test(substring2))) {
                return Pair.of(parseLongOrNull(str.substring(2, i7), 2), substring2);
            }
        } else if (str.startsWith("0") && (countLeading = countLeading(str.substring(1), CharPredicate.OCTAL_DIGITS)) == countLeading(str.substring(1), CharPredicate.DECIMAL_DIGITS)) {
            int i8 = countLeading + 1;
            String substring3 = str.substring(i8);
            if (countLeading > 0 && (substring3.isEmpty() || predicate == null || predicate.test(substring3))) {
                return Pair.of(parseLongOrNull(str.substring(1, i8), 8), substring3);
            }
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        ParsePosition parsePosition = new ParsePosition(0);
        Number parse = numberFormat.parse(str, parsePosition);
        String substring4 = str.substring(parsePosition.getIndex());
        if (parsePosition.getIndex() <= 0 || !(substring4.isEmpty() || predicate == null || predicate.test(substring4))) {
            return null;
        }
        return Pair.of(parse, substring4);
    }

    static int parseUnsignedIntOrDefault(String str, int i6) {
        return parseUnsignedIntOrDefault(str, i6, 10);
    }

    static Integer parseUnsignedIntOrNull(String str) {
        return parseUnsignedIntOrNull(str, 10);
    }

    static char safeCharAt(CharSequence charSequence, int i6) {
        if (i6 < 0 || i6 >= charSequence.length()) {
            return (char) 0;
        }
        return charSequence.charAt(i6);
    }

    static <T extends CharSequence> T[] split(T t5, T[] tArr, CharSequence charSequence, boolean z5, CharPredicate charPredicate) {
        return (T[]) split(t5, tArr, EOL, 0, z5 ? 1 : 0, charPredicate);
    }

    static <T extends CharSequence> T[] splitEOL(T t5, T[] tArr) {
        return (T[]) split(t5, tArr, EOL, 0, 1, (CharPredicate) null);
    }

    static <T extends CharSequence> List<T> splitList(T t5, CharSequence charSequence) {
        return splitList(t5, charSequence, 0, 0, (CharPredicate) null);
    }

    static <T extends CharSequence> List<T> splitListEOL(T t5) {
        return splitList(t5, EOL, 0, 1, (CharPredicate) null);
    }

    static int startOfDelimitedBy(CharSequence charSequence, CharSequence charSequence2, int i6) {
        int lastIndexOf = lastIndexOf(charSequence, charSequence2, Utils.rangeLimit(i6, 0, charSequence.length()) - 1);
        if (lastIndexOf == -1) {
            return 0;
        }
        return lastIndexOf + 1;
    }

    static int startOfDelimitedByAny(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        int lastIndexOfAny = lastIndexOfAny(charSequence, charPredicate, Utils.rangeLimit(i6, 0, charSequence.length()) - 1);
        if (lastIndexOfAny == -1) {
            return 0;
        }
        return lastIndexOfAny + 1;
    }

    static int startOfDelimitedByAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return startOfDelimitedByAny(charSequence, charPredicate.negate(), i6);
    }

    static int startOfLine(CharSequence charSequence, int i6) {
        return startOfDelimitedBy(charSequence, EOL, i6);
    }

    static int startOfLineAnyEOL(CharSequence charSequence, int i6) {
        return startOfDelimitedByAny(charSequence, CharPredicate.ANY_EOL, i6);
    }

    static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence.length() > 0 && matchChars(charSequence, charSequence2, 0, false);
    }

    static boolean startsWithAnyEOL(CharSequence charSequence) {
        return startsWith(charSequence, CharPredicate.ANY_EOL);
    }

    static boolean startsWithEOL(CharSequence charSequence) {
        return startsWith(charSequence, CharPredicate.EOL);
    }

    static boolean startsWithSpace(CharSequence charSequence) {
        return startsWith(charSequence, CharPredicate.SPACE);
    }

    static boolean startsWithSpaceTab(CharSequence charSequence) {
        return startsWith(charSequence, CharPredicate.SPACE_TAB);
    }

    static boolean startsWithWhitespace(CharSequence charSequence) {
        return startsWith(charSequence, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T subSequence(T t5, int i6) {
        return (T) t5.subSequence(i6, t5.length());
    }

    static <T extends CharSequence> T subSequenceAfter(T t5, Range range) {
        if (range.isNull()) {
            return null;
        }
        return (T) t5.subSequence(range.getEnd(), t5.length());
    }

    static <T extends CharSequence> T subSequenceBefore(T t5, Range range) {
        if (range.isNull()) {
            return null;
        }
        return (T) t5.subSequence(0, range.getStart());
    }

    static <T extends CharSequence> Pair<T, T> subSequenceBeforeAfter(T t5, Range range) {
        return Pair.of(subSequenceBefore(t5, range), subSequenceAfter(t5, range));
    }

    static String[] toStringArray(CharSequence... charSequenceArr) {
        String[] strArr = new String[charSequenceArr.length];
        int i6 = 0;
        for (CharSequence charSequence : charSequenceArr) {
            CharSequence charSequence2 = charSequenceArr[i6];
            strArr[i6] = charSequence2 == null ? null : charSequence2.toString();
            i6++;
        }
        return strArr;
    }

    static String toVisibleWhitespaceString(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            String str = visibleSpacesMap.get(Character.valueOf(charAt));
            if (str != null) {
                sb.append(str);
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    static Range trailingBlankLinesRange(CharSequence charSequence) {
        return trailingBlankLinesRange(charSequence, CharPredicate.EOL, 0, TableCell.NOT_TRACKED);
    }

    static <T extends CharSequence> T trim(T t5, CharPredicate charPredicate) {
        return (T) trim(t5, 0, charPredicate);
    }

    static <T extends CharSequence> T trimEOL(T t5) {
        int eolEndLength = eolEndLength(t5);
        return eolEndLength > 0 ? (T) t5.subSequence(0, t5.length() - eolEndLength) : t5;
    }

    static <T extends CharSequence> T trimEnd(T t5, CharPredicate charPredicate) {
        return (T) trimEnd(t5, 0, charPredicate);
    }

    static Range trimEndRange(CharSequence charSequence, CharPredicate charPredicate) {
        return trimEndRange(charSequence, 0, charPredicate);
    }

    static <T extends CharSequence> T trimLeadBlankLines(T t5) {
        Range leadingBlankLinesRange = leadingBlankLinesRange(t5);
        return leadingBlankLinesRange.isNull() ? t5 : (T) subSequenceAfter(t5, leadingBlankLinesRange);
    }

    static Range trimRange(CharSequence charSequence, CharPredicate charPredicate) {
        return trimRange(charSequence, 0, charPredicate);
    }

    static <T extends CharSequence> T trimStart(T t5, CharPredicate charPredicate) {
        return (T) subSequence(t5, trimStartRange(t5, 0, charPredicate));
    }

    static Range trimStartRange(CharSequence charSequence, CharPredicate charPredicate) {
        return trimStartRange(charSequence, 0, charPredicate);
    }

    static <T extends CharSequence> T trimTailBlankLines(T t5) {
        Range trailingBlankLinesRange = trailingBlankLinesRange(t5);
        return trailingBlankLinesRange.isNull() ? t5 : (T) subSequenceBefore(t5, trailingBlankLinesRange);
    }

    static <T extends CharSequence> Pair<T, T> trimmed(T t5, CharPredicate charPredicate) {
        return trimmed(t5, 0, charPredicate);
    }

    static <T extends CharSequence> T trimmedEOL(T t5) {
        int eolEndLength = eolEndLength(t5);
        if (eolEndLength > 0) {
            return (T) t5.subSequence(t5.length() - eolEndLength, t5.length());
        }
        return null;
    }

    static <T extends CharSequence> T trimmedEnd(T t5, CharPredicate charPredicate) {
        return (T) trimmedEnd(t5, 0, charPredicate);
    }

    static <T extends CharSequence> T trimmedStart(T t5, CharPredicate charPredicate) {
        return (T) trimmedStart(t5, 0, charPredicate);
    }

    static int[] truncateTo(int[] iArr, int i6) {
        if (iArr.length <= i6) {
            return iArr;
        }
        int[] iArr2 = new int[i6];
        System.arraycopy(iArr, 0, iArr2, 0, i6);
        return iArr2;
    }

    static void validateIndex(int i6, int i7) {
        if (i6 < 0 || i6 >= i7) {
            throw new StringIndexOutOfBoundsException(e.i(i6, "String index: ", i7, " out of range: [0, ", ")"));
        }
    }

    static void validateIndexInclusiveEnd(int i6, int i7) {
        if (i6 < 0 || i6 > i7) {
            throw new StringIndexOutOfBoundsException(e.i(i6, "index: ", i7, " out of range: [0, ", "]"));
        }
    }

    static void validateStartEnd(int i6, int i7, int i8) {
        if (i6 < 0 || i6 > i8) {
            throw new StringIndexOutOfBoundsException(e.i(i6, "startIndex: ", i8, " out of range: [0, ", ")"));
        }
        if (i7 < i6 || i7 > i8) {
            throw new StringIndexOutOfBoundsException(AbstractC1135a.i(AbstractC1135a.j(i7, "endIndex: ", i6, " out of range: [", ", "), i8, "]"));
        }
    }

    static List<Range> blankLinesRemovedRanges(CharSequence charSequence, int i6) {
        return blankLinesRemovedRanges(charSequence, CharPredicate.EOL, i6, TableCell.NOT_TRACKED);
    }

    static int compare(CharSequence charSequence, CharSequence charSequence2, boolean z5) {
        return compare(charSequence, charSequence2, z5, null);
    }

    static boolean containsAny(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return indexOfAny(charSequence, charPredicate, i6, TableCell.NOT_TRACKED) != -1;
    }

    static boolean containsAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return indexOfAny(charSequence, charPredicate.negate(), i6, TableCell.NOT_TRACKED) != -1;
    }

    static int countLeading(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return countLeading(charSequence, charPredicate, i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return countLeading(charSequence, charPredicate.negate(), i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingNotSpace(CharSequence charSequence, int i6) {
        return countLeading(charSequence, CharPredicate.SPACE.negate(), i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingNotSpaceTab(CharSequence charSequence, int i6) {
        return countLeading(charSequence, CharPredicate.SPACE_TAB.negate(), i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingNotWhitespace(CharSequence charSequence, int i6) {
        return countLeading(charSequence, CharPredicate.WHITESPACE.negate(), i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingSpace(CharSequence charSequence, int i6) {
        return countLeading(charSequence, CharPredicate.SPACE, i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingSpaceTab(CharSequence charSequence, int i6) {
        return countLeading(charSequence, CharPredicate.SPACE_TAB, i6, TableCell.NOT_TRACKED);
    }

    static int countLeadingWhitespace(CharSequence charSequence, int i6) {
        return countLeading(charSequence, CharPredicate.WHITESPACE, i6, TableCell.NOT_TRACKED);
    }

    static int countOfAny(CharSequence charSequence, CharPredicate charPredicate) {
        return countOfAny(charSequence, charPredicate, 0, TableCell.NOT_TRACKED);
    }

    static int countOfAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return countOfAny(charSequence, charPredicate.negate(), i6, TableCell.NOT_TRACKED);
    }

    static int countTrailing(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return countTrailing(charSequence, charPredicate, 0, i6);
    }

    static int countTrailingNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return countTrailing(charSequence, charPredicate.negate(), 0, i6);
    }

    static int countTrailingNotSpace(CharSequence charSequence, int i6) {
        return countTrailing(charSequence, CharPredicate.SPACE.negate(), 0, i6);
    }

    static int countTrailingNotSpaceTab(CharSequence charSequence, int i6) {
        return countTrailing(charSequence, CharPredicate.SPACE_TAB.negate(), 0, i6);
    }

    static int countTrailingNotWhitespace(CharSequence charSequence, int i6) {
        return countTrailing(charSequence, CharPredicate.WHITESPACE.negate(), 0, i6);
    }

    static int countTrailingSpace(CharSequence charSequence, int i6) {
        return countTrailing(charSequence, CharPredicate.SPACE, 0, i6);
    }

    static int countTrailingSpaceTab(CharSequence charSequence, int i6) {
        return countTrailing(charSequence, CharPredicate.SPACE_TAB, 0, i6);
    }

    static int countTrailingWhitespace(CharSequence charSequence, int i6) {
        return countTrailing(charSequence, CharPredicate.WHITESPACE, 0, i6);
    }

    static boolean endsWith(CharSequence charSequence, CharSequence charSequence2, boolean z5) {
        return charSequence.length() > 0 && matchCharsReversed(charSequence, charSequence2, charSequence.length() - 1, z5);
    }

    static int eolEndLength(CharSequence charSequence, int i6) {
        int min = Math.min(i6 - 1, charSequence.length() - 1);
        if (min < 0) {
            return 0;
        }
        char charAt = charSequence.charAt(min);
        if (charAt == '\r') {
            if (safeCharAt(charSequence, min + 1) != '\n') {
                return 1;
            }
        } else if (charAt == '\n') {
            return safeCharAt(charSequence, min - 1) == '\r' ? 2 : 1;
        }
        return 0;
    }

    static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return indexOf(charSequence, charSequence2, i6, TableCell.NOT_TRACKED);
    }

    static int indexOfAny(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return indexOfAny(charSequence, charPredicate, i6, TableCell.NOT_TRACKED);
    }

    static int indexOfAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return indexOfAny(charSequence, charPredicate.negate(), i6, TableCell.NOT_TRACKED);
    }

    static int indexOfNot(CharSequence charSequence, char c6, int i6) {
        return indexOfNot(charSequence, c6, i6, TableCell.NOT_TRACKED);
    }

    static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return lastIndexOf(charSequence, charSequence2, 0, i6);
    }

    static int lastIndexOfAny(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return lastIndexOfAny(charSequence, charPredicate, 0, i6);
    }

    static int lastIndexOfAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6) {
        return lastIndexOfAny(charSequence, charPredicate.negate(), 0, i6);
    }

    static int lastIndexOfNot(CharSequence charSequence, char c6, int i6) {
        return lastIndexOfNot(charSequence, c6, 0, i6);
    }

    static Range leadingBlankLinesRange(CharSequence charSequence, int i6) {
        return leadingBlankLinesRange(charSequence, CharPredicate.EOL, i6, TableCell.NOT_TRACKED);
    }

    static boolean matchChars(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return matchChars(charSequence, charSequence2, i6, false);
    }

    static boolean matchCharsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return matchChars(charSequence, charSequence2, 0, true);
    }

    static boolean matchCharsReversed(CharSequence charSequence, CharSequence charSequence2, int i6) {
        int i7 = i6 + 1;
        return i7 >= charSequence2.length() && matchChars(charSequence, charSequence2, i7 - charSequence2.length(), false);
    }

    static int matchedCharCount(CharSequence charSequence, CharSequence charSequence2, int i6, boolean z5) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, false, z5);
    }

    static int matchedCharCountIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, false, true);
    }

    static int matchedCharCountReversed(CharSequence charSequence, CharSequence charSequence2, int i6, boolean z5) {
        return matchedCharCountReversed(charSequence, charSequence2, 0, i6, z5);
    }

    static int matchedCharCountReversedIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return matchedCharCountReversed(charSequence, charSequence2, 0, i6, true);
    }

    static boolean matches(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence2.length() == charSequence.length() && matchChars(charSequence, charSequence2, 0, false);
    }

    static String padEnd(CharSequence charSequence, int i6) {
        return padEnd(charSequence, i6, SPC);
    }

    static String padStart(CharSequence charSequence, int i6) {
        return padStart(charSequence, i6, SPC);
    }

    static int parseIntOrDefault(String str, int i6, int i7) {
        try {
            return Integer.parseInt(str, i7);
        } catch (NumberFormatException unused) {
            return i6;
        }
    }

    static Integer parseIntOrNull(String str, int i6) {
        try {
            return Integer.valueOf(Integer.parseInt(str, i6));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Long parseLongOrNull(String str, int i6) {
        try {
            return Long.valueOf(Long.parseLong(str, i6));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static int parseUnsignedIntOrDefault(String str, int i6, int i7) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str, i7);
        } catch (NumberFormatException unused) {
        }
        return parseInt >= 0 ? parseInt : i6;
    }

    static Integer parseUnsignedIntOrNull(String str, int i6) {
        try {
            int parseInt = Integer.parseInt(str, i6);
            if (parseInt >= 0) {
                return Integer.valueOf(parseInt);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    static <T extends CharSequence> T[] split(T t5, T[] tArr, CharSequence charSequence) {
        return (T[]) split(t5, tArr, charSequence, 0, 0, (CharPredicate) null);
    }

    static <T extends CharSequence> T[] splitEOL(T t5, T[] tArr, boolean z5) {
        return (T[]) split(t5, tArr, EOL, 0, z5 ? 1 : 0, (CharPredicate) null);
    }

    static <T extends CharSequence> List<T> splitList(T t5, CharSequence charSequence, int i6, boolean z5, CharPredicate charPredicate) {
        return splitList(t5, charSequence, i6, z5 ? 1 : 0, charPredicate);
    }

    static <T extends CharSequence> List<T> splitListEOL(T t5, boolean z5) {
        return splitList(t5, EOL, 0, z5 ? 1 : 0, (CharPredicate) null);
    }

    static boolean startsWith(CharSequence charSequence, CharSequence charSequence2, boolean z5) {
        return charSequence.length() > 0 && matchChars(charSequence, charSequence2, 0, z5);
    }

    static <T extends CharSequence> T subSequence(T t5, Range range) {
        return range.isNull() ? t5 : (T) t5.subSequence(range.getStart(), range.getEnd());
    }

    static Range trailingBlankLinesRange(CharSequence charSequence, int i6) {
        return trailingBlankLinesRange(charSequence, CharPredicate.EOL, i6, TableCell.NOT_TRACKED);
    }

    static <T extends CharSequence> T trim(T t5, int i6) {
        return (T) trim(t5, i6, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimEnd(T t5, int i6) {
        return (T) trimEnd(t5, i6, CharPredicate.WHITESPACE);
    }

    static Range trimEndRange(CharSequence charSequence, int i6) {
        return trimEndRange(charSequence, i6, CharPredicate.WHITESPACE);
    }

    static Range trimRange(CharSequence charSequence, int i6) {
        return trimRange(charSequence, i6, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimStart(T t5, int i6) {
        return (T) trimStart(t5, i6, CharPredicate.WHITESPACE);
    }

    static Range trimStartRange(CharSequence charSequence, int i6) {
        return trimStartRange(charSequence, i6, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> Pair<T, T> trimmed(T t5, int i6) {
        return trimmed(t5, i6, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimmedEnd(T t5, int i6) {
        return (T) trimmedEnd(t5, i6, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimmedStart(T t5, int i6) {
        return (T) trimmedStart(t5, i6, CharPredicate.WHITESPACE);
    }

    static List<Range> blankLinesRemovedRanges(CharSequence charSequence, int i6, int i7) {
        return blankLinesRemovedRanges(charSequence, CharPredicate.EOL, i6, i7);
    }

    static int compare(CharSequence charSequence, CharSequence charSequence2, boolean z5, CharPredicate charPredicate) {
        char upperCase;
        char upperCase2;
        int i6 = 0;
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == null && charSequence2 == null) {
                return 0;
            }
            return charSequence == null ? -1 : 1;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int min = Math.min(length, length2);
        if (z5) {
            while (i6 < min) {
                char charAt = charSequence.charAt(i6);
                char charAt2 = charSequence2.charAt(i6);
                if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2) && (charPredicate == null || !charPredicate.test(charAt) || !charPredicate.test(charAt2))) {
                    return charAt - charAt2;
                }
                i6++;
            }
        } else {
            while (i6 < min) {
                char charAt3 = charSequence.charAt(i6);
                char charAt4 = charSequence2.charAt(i6);
                if (charAt3 != charAt4 && (charPredicate == null || !charPredicate.test(charAt3) || !charPredicate.test(charAt4))) {
                    return charAt3 - charAt4;
                }
                i6++;
            }
        }
        return length - length2;
    }

    static boolean containedBy(Collection<? extends CharSequence> collection, CharSequence charSequence) {
        Iterator<? extends CharSequence> it = collection.iterator();
        while (it.hasNext()) {
            if (equals(charSequence, it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean containsAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        return indexOfAny(charSequence, charPredicate.negate(), i6, i7) != -1;
    }

    static int countLeading(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int min = Math.min(i7, charSequence.length());
        int rangeLimit = Utils.rangeLimit(i6, 0, min);
        int indexOfAnyNot = indexOfAnyNot(charSequence, charPredicate, rangeLimit, min);
        return indexOfAnyNot == -1 ? min - rangeLimit : indexOfAnyNot - rangeLimit;
    }

    static int countLeadingNot(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        return countLeading(charSequence, charPredicate.negate(), i6, i7);
    }

    static int countLeadingNotSpace(CharSequence charSequence, int i6, int i7) {
        return countLeading(charSequence, CharPredicate.SPACE.negate(), i6, i7);
    }

    static int countLeadingNotSpaceTab(CharSequence charSequence, int i6, int i7) {
        return countLeading(charSequence, CharPredicate.SPACE_TAB.negate(), i6, i7);
    }

    static int countLeadingNotWhitespace(CharSequence charSequence, int i6, int i7) {
        return countLeading(charSequence, CharPredicate.WHITESPACE.negate(), i6, i7);
    }

    static int countLeadingSpace(CharSequence charSequence, int i6, int i7) {
        return countLeading(charSequence, CharPredicate.SPACE, i6, i7);
    }

    static int countLeadingSpaceTab(CharSequence charSequence, int i6, int i7) {
        return countLeading(charSequence, CharPredicate.SPACE_TAB, i6, i7);
    }

    static int countLeadingWhitespace(CharSequence charSequence, int i6, int i7) {
        return countLeading(charSequence, CharPredicate.WHITESPACE, i6, i7);
    }

    static int countOfAny(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int i8 = 0;
        int min = Math.min(i7, charSequence.length());
        for (int max = Math.max(i6, 0); max < min; max++) {
            if (charPredicate.test(charSequence.charAt(max))) {
                i8++;
            }
        }
        return i8;
    }

    static int countOfAnyNot(CharSequence charSequence, CharPredicate charPredicate) {
        return countOfAny(charSequence, charPredicate.negate(), 0, TableCell.NOT_TRACKED);
    }

    static int countTrailing(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int min = Math.min(i7, charSequence.length());
        int rangeLimit = Utils.rangeLimit(i6, 0, min);
        int lastIndexOfAnyNot = lastIndexOfAnyNot(charSequence, charPredicate, rangeLimit, min - 1);
        if (lastIndexOfAnyNot == -1) {
            return min - rangeLimit;
        }
        if (min <= lastIndexOfAnyNot) {
            return 0;
        }
        return (min - lastIndexOfAnyNot) - 1;
    }

    static int countTrailingNot(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        return countTrailing(charSequence, charPredicate.negate(), i6, i7);
    }

    static int countTrailingNotSpace(CharSequence charSequence, int i6, int i7) {
        return countTrailing(charSequence, CharPredicate.SPACE.negate(), i6, i7);
    }

    static int countTrailingNotSpaceTab(CharSequence charSequence, int i6, int i7) {
        return countTrailing(charSequence, CharPredicate.SPACE_TAB.negate(), i6, i7);
    }

    static int countTrailingNotWhitespace(CharSequence charSequence, int i6, int i7) {
        return countTrailing(charSequence, CharPredicate.WHITESPACE.negate(), i6, i7);
    }

    static int countTrailingSpace(CharSequence charSequence, int i6, int i7) {
        return countTrailing(charSequence, CharPredicate.SPACE, i6, i7);
    }

    static int countTrailingSpaceTab(CharSequence charSequence, int i6, int i7) {
        return countTrailing(charSequence, CharPredicate.SPACE_TAB, i6, i7);
    }

    static int countTrailingWhitespace(CharSequence charSequence, int i6, int i7) {
        return countTrailing(charSequence, CharPredicate.WHITESPACE, i6, i7);
    }

    static boolean endsWith(CharSequence charSequence, CharPredicate charPredicate) {
        return countTrailing(charSequence, charPredicate) > 0;
    }

    static int indexOf(CharSequence charSequence, char c6) {
        return indexOf(charSequence, c6, 0, TableCell.NOT_TRACKED);
    }

    static int indexOfAny(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int min = Math.min(i7, charSequence.length());
        for (int max = Math.max(i6, 0); max < min; max++) {
            if (charPredicate.test(charSequence.charAt(max))) {
                return max;
            }
        }
        return -1;
    }

    static int indexOfAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        return indexOfAny(charSequence, charPredicate.negate(), i6, i7);
    }

    static int indexOfNot(CharSequence charSequence, char c6, int i6, int i7) {
        int min = Math.min(i7, charSequence.length());
        for (int max = Math.max(i6, 0); max < min; max++) {
            if (charSequence.charAt(max) != c6) {
                return max;
            }
        }
        return -1;
    }

    static int lastIndexOf(CharSequence charSequence, char c6) {
        return lastIndexOf(charSequence, c6, 0, TableCell.NOT_TRACKED);
    }

    static int lastIndexOfAny(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int min = Math.min(i7, charSequence.length() - 1) + 1;
        int max = Math.max(i6, 0);
        while (true) {
            int i8 = min - 1;
            if (min <= max) {
                return -1;
            }
            if (charPredicate.test(charSequence.charAt(i8))) {
                return i8;
            }
            min = i8;
        }
    }

    static int lastIndexOfAnyNot(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        return lastIndexOfAny(charSequence, charPredicate.negate(), i6, i7);
    }

    static int lastIndexOfNot(CharSequence charSequence, char c6, int i6, int i7) {
        int min = Math.min(i7, charSequence.length() - 1) + 1;
        int max = Math.max(i6, 0);
        while (true) {
            int i8 = min - 1;
            if (min <= max) {
                return -1;
            }
            if (charSequence.charAt(i8) != c6) {
                return i8;
            }
            min = i8;
        }
    }

    static Range leadingBlankLinesRange(CharSequence charSequence, int i6, int i7) {
        return leadingBlankLinesRange(charSequence, CharPredicate.EOL, i6, i7);
    }

    static boolean matchChars(CharSequence charSequence, CharSequence charSequence2, boolean z5) {
        return matchChars(charSequence, charSequence2, 0, z5);
    }

    static int matchedCharCount(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, false, false);
    }

    static int matchedCharCountReversed(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return matchedCharCountReversed(charSequence, charSequence2, 0, i6, false);
    }

    static <T extends CharSequence> T[] split(T t5, T[] tArr, CharSequence charSequence, int i6, boolean z5, CharPredicate charPredicate) {
        return (T[]) split(t5, tArr, charSequence, i6, z5 ? 1 : 0, charPredicate);
    }

    static <T extends CharSequence> List<T> splitList(T t5, CharSequence charSequence, int i6, int i7) {
        return splitList(t5, charSequence, i6, i7, (CharPredicate) null);
    }

    static <T extends CharSequence> List<T> splitListEOL(T t5, boolean z5, CharPredicate charPredicate) {
        return splitList(t5, EOL, 0, z5 ? 1 : 0, charPredicate);
    }

    static boolean startsWith(CharSequence charSequence, CharPredicate charPredicate) {
        return countLeading(charSequence, charPredicate) > 0;
    }

    static Range trailingBlankLinesRange(CharSequence charSequence, int i6, int i7) {
        return trailingBlankLinesRange(charSequence, CharPredicate.EOL, i6, i7);
    }

    static <T extends CharSequence> T trim(T t5) {
        return (T) trim(t5, 0, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimEnd(T t5) {
        return (T) trimEnd(t5, 0, CharPredicate.WHITESPACE);
    }

    static Range trimEndRange(CharSequence charSequence) {
        return trimEndRange(charSequence, 0, CharPredicate.WHITESPACE);
    }

    static Range trimRange(CharSequence charSequence) {
        return trimRange(charSequence, 0, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimStart(T t5) {
        return (T) trimStart(t5, 0, CharPredicate.WHITESPACE);
    }

    static Range trimStartRange(CharSequence charSequence) {
        return trimStartRange(charSequence, 0, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> Pair<T, T> trimmed(T t5) {
        return trimmed(t5, 0, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimmedEnd(T t5) {
        return (T) trimmedEnd(t5, 0, CharPredicate.WHITESPACE);
    }

    static <T extends CharSequence> T trimmedStart(T t5) {
        return (T) trimmedStart(t5, 0, CharPredicate.WHITESPACE);
    }

    static List<Range> blankLinesRemovedRanges(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int min = Math.min(i7, charSequence.length());
        int rangeLimit = Utils.rangeLimit(i6, 0, min);
        ArrayList arrayList = new ArrayList();
        while (rangeLimit < min) {
            Range leadingBlankLinesRange = leadingBlankLinesRange(charSequence, charPredicate, rangeLimit, min);
            if (leadingBlankLinesRange.isNull()) {
                int min2 = Math.min(endOfLine(charSequence, rangeLimit) + 1, min);
                if (rangeLimit < min2) {
                    arrayList.add(Range.of(rangeLimit, min2));
                }
                rangeLimit = min2;
            } else {
                if (rangeLimit < leadingBlankLinesRange.getStart()) {
                    arrayList.add(Range.of(rangeLimit, leadingBlankLinesRange.getStart()));
                }
                rangeLimit = leadingBlankLinesRange.getEnd();
            }
        }
        return arrayList;
    }

    static int indexOf(CharSequence charSequence, char c6, int i6) {
        return indexOf(charSequence, c6, i6, TableCell.NOT_TRACKED);
    }

    static int lastIndexOf(CharSequence charSequence, char c6, int i6) {
        return lastIndexOf(charSequence, c6, 0, i6);
    }

    static Range leadingBlankLinesRange(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int min = Math.min(i7, charSequence.length());
        int rangeLimit = Utils.rangeLimit(i6, 0, min);
        int i8 = -1;
        int i9 = rangeLimit;
        while (i9 < min) {
            char charAt = charSequence.charAt(i9);
            if (!charPredicate.test(charAt)) {
                if (charAt != ' ' && charAt != '\t') {
                    break;
                }
            } else {
                i8 = i9;
            }
            i9++;
        }
        if (i9 == min) {
            return Range.of(rangeLimit, min);
        }
        if (i8 >= 0) {
            return Range.of(rangeLimit, Math.min(Math.min(eolStartLength(charSequence, i8), 1) + i8, min));
        }
        return Range.NULL;
    }

    static boolean matchChars(CharSequence charSequence, CharSequence charSequence2) {
        return matchChars(charSequence, charSequence2, 0, false);
    }

    static int matchedCharCount(CharSequence charSequence, CharSequence charSequence2, int i6) {
        return matchedCharCount(charSequence, charSequence2, i6, TableCell.NOT_TRACKED, false, false);
    }

    static int matchedCharCountReversed(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5) {
        int i8;
        char upperCase;
        char upperCase2;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, Math.min(charSequence.length(), i7));
        int min = Math.min(max2 - max, charSequence2.length());
        int i9 = max2 - min;
        if (!z5) {
            int i10 = min;
            while (true) {
                i8 = i10 - 1;
                if (i10 <= 0) {
                    break;
                }
                if (charSequence2.charAt(i8) != charSequence.charAt(i9 + i8)) {
                    break;
                }
                i10 = i8;
            }
            return min;
        }
        int i11 = min;
        while (true) {
            i8 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            char charAt = charSequence2.charAt(i8);
            char charAt2 = charSequence.charAt(i9 + i8);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                break;
            }
            i11 = i8;
        }
        return (min - i8) - 1;
    }

    static <T extends CharSequence> T[] split(T t5, T[] tArr, CharSequence charSequence, int i6, int i7) {
        return (T[]) split(t5, tArr, charSequence, i6, i7, (CharPredicate) null);
    }

    static <T extends CharSequence> List<T> splitList(T t5, CharSequence charSequence, boolean z5, CharPredicate charPredicate) {
        return splitList(t5, charSequence, 0, z5 ? 1 : 0, charPredicate);
    }

    static Range trailingBlankLinesRange(CharSequence charSequence, CharPredicate charPredicate, int i6, int i7) {
        int i8;
        int min = Math.min(i7, charSequence.length());
        int rangeLimit = Utils.rangeLimit(i6, 0, min);
        int i9 = min;
        int i10 = i9;
        while (true) {
            i8 = i9 - 1;
            if (i9 <= rangeLimit) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (!charPredicate.test(charAt)) {
                if (charAt != ' ' && charAt != '\t') {
                    break;
                }
            } else {
                i10 = Math.min(Math.min(eolStartLength(charSequence, i8), 1) + i8, min);
            }
            i9 = i8;
        }
        if (i8 < rangeLimit) {
            return Range.of(rangeLimit, min);
        }
        if (i10 != min) {
            return Range.of(i10, min);
        }
        return Range.NULL;
    }

    static <T extends CharSequence> T trim(T t5, int i6, CharPredicate charPredicate) {
        return (T) subSequence(t5, trimRange(t5, i6, charPredicate));
    }

    static <T extends CharSequence> T trimEnd(T t5, int i6, CharPredicate charPredicate) {
        return (T) subSequence(t5, trimEndRange(t5, i6, charPredicate));
    }

    static Range trimEndRange(CharSequence charSequence, int i6, CharPredicate charPredicate) {
        int length = charSequence.length();
        int countTrailing = countTrailing(charSequence, charPredicate, 0, length);
        return countTrailing > i6 ? Range.of(0, (length - countTrailing) + i6) : Range.NULL;
    }

    static Range trimRange(CharSequence charSequence, int i6, CharPredicate charPredicate) {
        int length = charSequence.length();
        if (i6 >= length) {
            return Range.NULL;
        }
        int countLeading = countLeading(charSequence, charPredicate, 0, length);
        if (countLeading > i6) {
            int i7 = countLeading - i6;
            int countTrailing = countTrailing(charSequence, charPredicate, i7, length);
            return countTrailing > i6 ? Range.of(i7, (length - countTrailing) + i6) : Range.of(i7, length);
        }
        int countTrailing2 = countTrailing(charSequence, charPredicate, countLeading, length);
        return countTrailing2 > i6 ? Range.of(0, (length - countTrailing2) + i6) : Range.NULL;
    }

    static <T extends CharSequence> T trimStart(T t5, int i6, CharPredicate charPredicate) {
        return (T) subSequence(t5, trimStartRange(t5, i6, charPredicate));
    }

    static Range trimStartRange(CharSequence charSequence, int i6, CharPredicate charPredicate) {
        int length = charSequence.length();
        int countLeading = countLeading(charSequence, charPredicate, 0, length);
        return countLeading > i6 ? Range.of(countLeading - i6, length) : Range.NULL;
    }

    static <T extends CharSequence> Pair<T, T> trimmed(T t5, int i6, CharPredicate charPredicate) {
        return subSequenceBeforeAfter(t5, trimRange(t5, i6, charPredicate));
    }

    static <T extends CharSequence> T trimmedEnd(T t5, int i6, CharPredicate charPredicate) {
        return (T) subSequenceAfter(t5, trimEndRange(t5, i6, charPredicate));
    }

    static <T extends CharSequence> T trimmedStart(T t5, int i6, CharPredicate charPredicate) {
        return (T) subSequenceBefore(t5, trimStartRange(t5, i6, charPredicate));
    }

    static int indexOf(CharSequence charSequence, char c6, int i6, int i7) {
        int min = Math.min(charSequence.length(), i7);
        for (int max = Math.max(i6, 0); max < min; max++) {
            if (c6 == charSequence.charAt(max)) {
                return max;
            }
        }
        return -1;
    }

    static int lastIndexOf(CharSequence charSequence, char c6, int i6, int i7) {
        int min = Math.min(i7, charSequence.length() - 1) + 1;
        int max = Math.max(i6, 0);
        while (true) {
            int i8 = min - 1;
            if (min <= max) {
                return -1;
            }
            if (c6 == charSequence.charAt(i8)) {
                return i8;
            }
            min = i8;
        }
    }

    static int matchedCharCount(CharSequence charSequence, CharSequence charSequence2, int i6, int i7, boolean z5, boolean z6) {
        char upperCase;
        char upperCase2;
        int length = charSequence2.length();
        int min = Math.min(Math.min(charSequence.length(), i7) - i6, length);
        int i8 = 0;
        if (z5 && min < length) {
            return 0;
        }
        if (z6) {
            while (i8 < min) {
                char charAt = charSequence2.charAt(i8);
                char charAt2 = charSequence.charAt(i8 + i6);
                if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return i8;
                }
                i8++;
            }
        } else {
            while (i8 < min) {
                if (charSequence2.charAt(i8) != charSequence.charAt(i8 + i6)) {
                    return i8;
                }
                i8++;
            }
        }
        return min;
    }

    static <T extends CharSequence> T[] split(T t5, T[] tArr, CharSequence charSequence, int i6, int i7, CharPredicate charPredicate) {
        return (T[]) ((CharSequence[]) splitList(t5, charSequence, i6, i7, charPredicate).toArray(tArr));
    }

    static <T extends CharSequence> List<T> splitList(T t5, CharSequence charSequence, int i6, int i7, CharPredicate charPredicate) {
        if (charPredicate == null) {
            charPredicate = CharPredicate.WHITESPACE;
        } else {
            i7 |= 2;
        }
        if (i6 < 1) {
            i6 = TableCell.NOT_TRACKED;
        }
        int i8 = 0;
        boolean z5 = (i7 & 8) != 0;
        int length = (z5 || (i7 & 1) == 0) ? 0 : charSequence.length();
        boolean z6 = (i7 & 2) != 0;
        boolean z7 = (i7 & 4) != 0;
        ArrayList arrayList = new ArrayList();
        int length2 = t5.length();
        if (i6 > 1) {
            while (true) {
                if (i8 < length2) {
                    int indexOf = indexOf(t5, charSequence, i8);
                    if (indexOf < 0) {
                        break;
                    }
                    if (i8 < indexOf || !z7) {
                        CharSequence subSequence = t5.subSequence(i8, indexOf + length);
                        if (z6) {
                            subSequence = trim(subSequence, charPredicate);
                        }
                        if (!isEmpty(subSequence) || !z7) {
                            arrayList.add(subSequence);
                            if (z5) {
                                arrayList.add(t5.subSequence(indexOf, charSequence.length() + indexOf));
                            }
                            if (arrayList.size() >= i6 - 1) {
                                i8 = indexOf + 1;
                                break;
                            }
                        }
                    }
                    i8 = indexOf + 1;
                } else {
                    break;
                }
            }
        }
        if (i8 < length2) {
            CharSequence subSequence2 = t5.subSequence(i8, length2);
            if (z6) {
                subSequence2 = trim(subSequence2, charPredicate);
            }
            if (!isEmpty(subSequence2) || !z7) {
                arrayList.add(subSequence2);
            }
        }
        return arrayList;
    }

    static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        int max = Math.max(i6, 0);
        int length = charSequence2.length();
        if (length == 0) {
            return max;
        }
        int min = Math.min(charSequence.length(), i7);
        if (max >= min) {
            return -1;
        }
        char charAt = charSequence2.charAt(0);
        do {
            int indexOf = indexOf(charSequence, charAt, max);
            if (indexOf < 0 || indexOf + length > min) {
                return -1;
            }
            if (matchChars(charSequence, charSequence2, indexOf)) {
                return indexOf;
            }
            max = indexOf + 1;
        } while (max + length < min);
        return -1;
    }

    static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        int max = Math.max(i6, 0);
        int length = charSequence2.length();
        if (length == 0) {
            return max;
        }
        int min = Math.min(i7, charSequence.length());
        if (max >= min) {
            return -1;
        }
        char charAt = charSequence2.charAt(length - 1);
        while (true) {
            int lastIndexOf = lastIndexOf(charSequence, charAt, min);
            int i8 = lastIndexOf + 1;
            int i9 = max + length;
            if (i8 < i9) {
                return -1;
            }
            if (matchCharsReversed(charSequence, charSequence2, lastIndexOf)) {
                return i8 - length;
            }
            int i10 = lastIndexOf - 1;
            if (lastIndexOf < i9) {
                return -1;
            }
            min = i10;
        }
    }
}
