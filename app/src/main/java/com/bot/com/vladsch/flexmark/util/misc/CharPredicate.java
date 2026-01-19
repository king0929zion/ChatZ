package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.util.format.k;
import java.util.BitSet;
import java.util.Objects;
import java.util.function.IntPredicate;

/* loaded from: classes.dex */
public interface CharPredicate extends IntPredicate {
    public static final CharPredicate ALL = null;
    public static final CharPredicate ANY_EOL = null;
    public static final CharPredicate ANY_EOL_NUL = null;
    public static final CharPredicate BACKSLASH = null;
    public static final CharPredicate BINARY_DIGITS = null;
    public static final CharPredicate BLANKSPACE = null;
    public static final CharPredicate DECIMAL_DIGITS = null;
    public static final CharPredicate EOL = null;

    @Deprecated
    public static final CharPredicate FALSE = null;
    public static final CharPredicate HASH = null;
    public static final CharPredicate HEXADECIMAL_DIGITS = null;
    public static final CharPredicate LINE_SEP = null;
    public static final CharPredicate NONE = null;
    public static final CharPredicate OCTAL_DIGITS = null;
    public static final CharPredicate SLASH = null;
    public static final CharPredicate SPACE = null;
    public static final CharPredicate SPACE_ANY_EOL = null;
    public static final CharPredicate SPACE_EOL = null;
    public static final CharPredicate SPACE_TAB = null;
    public static final CharPredicate SPACE_TAB_EOL = null;
    public static final CharPredicate SPACE_TAB_LINE_SEP = null;
    public static final CharPredicate SPACE_TAB_NBSP = null;
    public static final CharPredicate SPACE_TAB_NBSP_EOL = null;
    public static final CharPredicate SPACE_TAB_NBSP_LINE_SEP = null;
    public static final CharPredicate SPACE_TAB_NUL = null;

    @Deprecated
    public static final CharPredicate SPACE_TAB_OR_NUL = null;
    public static final CharPredicate TAB = null;

    @Deprecated
    public static final CharPredicate TRUE = null;
    public static final CharPredicate WHITESPACE = null;
    public static final CharPredicate WHITESPACE_NBSP = null;
    public static final CharPredicate WHITESPACE_NBSP_OR_NUL = null;
    public static final CharPredicate WHITESPACE_OR_NUL = null;

    /* renamed from: com.vladsch.flexmark.util.misc.CharPredicate$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ boolean $assertionsDisabled = false;
    }

    static {
        k kVar = new k(21);
        NONE = kVar;
        k kVar2 = new k(4);
        ALL = kVar2;
        SPACE = new k(14);
        TAB = new k(15);
        EOL = new k(16);
        ANY_EOL = new k(17);
        ANY_EOL_NUL = new k(18);
        BACKSLASH = new k(19);
        SLASH = new k(20);
        LINE_SEP = new k(22);
        HASH = new k(23);
        SPACE_TAB = new k(24);
        k kVar3 = new k(25);
        SPACE_TAB_NUL = kVar3;
        SPACE_TAB_LINE_SEP = new k(26);
        SPACE_TAB_NBSP_LINE_SEP = new k(27);
        SPACE_EOL = new k(28);
        SPACE_ANY_EOL = new com.vladsch.flexmark.util.sequence.d(1);
        SPACE_TAB_NBSP = new k(1);
        SPACE_TAB_EOL = new k(2);
        SPACE_TAB_NBSP_EOL = new k(3);
        WHITESPACE = new k(5);
        WHITESPACE_OR_NUL = new k(6);
        WHITESPACE_NBSP = new k(7);
        WHITESPACE_NBSP_OR_NUL = new k(8);
        BLANKSPACE = new k(9);
        HEXADECIMAL_DIGITS = new k(10);
        DECIMAL_DIGITS = new k(11);
        OCTAL_DIGITS = new k(12);
        BINARY_DIGITS = new k(13);
        FALSE = kVar;
        TRUE = kVar2;
        SPACE_TAB_OR_NUL = kVar3;
    }

    static CharPredicate anyOf(char... cArr) {
        int length = cArr.length;
        if (length == 0) {
            return NONE;
        }
        if (length == 1) {
            return standardOrAnyOf(cArr[0]);
        }
        if (length == 2) {
            return standardOrAnyOf(cArr[0], cArr[1]);
        }
        if (length == 3) {
            return standardOrAnyOf(cArr[0], cArr[1], cArr[2]);
        }
        if (length != 4) {
            return anyOf(String.valueOf(cArr));
        }
        return standardOrAnyOf(cArr[0], cArr[1], cArr[2], cArr[3]);
    }

    static int indexOf(CharSequence charSequence, char c6) {
        return indexOf(charSequence, c6, 0, charSequence.length());
    }

    /* synthetic */ default boolean lambda$and$29(CharPredicate charPredicate, int i6) {
        return test(i6) && charPredicate.test(i6);
    }

    static /* synthetic */ boolean lambda$anyOf$36(String str, int i6) {
        return indexOf(str, (char) i6) != -1;
    }

    /* synthetic */ default boolean lambda$negate$30(int i6) {
        return !test(i6);
    }

    /* synthetic */ default boolean lambda$or$31(CharPredicate charPredicate, int i6) {
        return test(i6) || charPredicate.test(i6);
    }

    static /* synthetic */ boolean lambda$standardOrAnyOf$32(char c6, int i6) {
        return i6 == c6;
    }

    static /* synthetic */ boolean lambda$standardOrAnyOf$33(char c6, char c7, int i6) {
        return i6 == c6 || i6 == c7;
    }

    static /* synthetic */ boolean lambda$standardOrAnyOf$34(char c6, char c7, char c8, int i6) {
        return i6 == c6 || i6 == c7 || i6 == c8;
    }

    static /* synthetic */ boolean lambda$standardOrAnyOf$35(char c6, char c7, char c8, char c9, int i6) {
        return i6 == c6 || i6 == c7 || i6 == c8 || i6 == c9;
    }

    static /* synthetic */ boolean lambda$static$0(int i6) {
        return false;
    }

    static /* synthetic */ boolean lambda$static$1(int i6) {
        return true;
    }

    static /* synthetic */ boolean lambda$static$10(int i6) {
        return i6 == 35;
    }

    static /* synthetic */ boolean lambda$static$11(int i6) {
        return i6 == 32 || i6 == 9;
    }

    static /* synthetic */ boolean lambda$static$12(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 0;
    }

    static /* synthetic */ boolean lambda$static$13(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 8232;
    }

    static /* synthetic */ boolean lambda$static$14(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 160 || i6 == 8232;
    }

    static /* synthetic */ boolean lambda$static$15(int i6) {
        return i6 == 32 || i6 == 10;
    }

    static /* synthetic */ boolean lambda$static$16(int i6) {
        return i6 == 32 || i6 == 13 || i6 == 10;
    }

    static /* synthetic */ boolean lambda$static$17(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 160;
    }

    static /* synthetic */ boolean lambda$static$18(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10;
    }

    static /* synthetic */ boolean lambda$static$19(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 160;
    }

    static /* synthetic */ boolean lambda$static$2(int i6) {
        return i6 == 32;
    }

    static /* synthetic */ boolean lambda$static$20(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 13;
    }

    static /* synthetic */ boolean lambda$static$21(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 13 || i6 == 0;
    }

    static /* synthetic */ boolean lambda$static$22(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 13 || i6 == 160;
    }

    static /* synthetic */ boolean lambda$static$23(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 13 || i6 == 160 || i6 == 0;
    }

    static /* synthetic */ boolean lambda$static$24(int i6) {
        return i6 == 32 || i6 == 9 || i6 == 10 || i6 == 13 || i6 == 11 || i6 == 12;
    }

    static /* synthetic */ boolean lambda$static$25(int i6) {
        if (i6 >= 48 && i6 <= 57) {
            return true;
        }
        if (i6 < 97 || i6 > 102) {
            return i6 >= 65 && i6 <= 70;
        }
        return true;
    }

    static /* synthetic */ boolean lambda$static$26(int i6) {
        return i6 >= 48 && i6 <= 57;
    }

    static /* synthetic */ boolean lambda$static$27(int i6) {
        return i6 >= 48 && i6 <= 55;
    }

    static /* synthetic */ boolean lambda$static$28(int i6) {
        return i6 >= 48 && i6 <= 49;
    }

    static /* synthetic */ boolean lambda$static$3(int i6) {
        return i6 == 9;
    }

    static /* synthetic */ boolean lambda$static$4(int i6) {
        return i6 == 10;
    }

    static /* synthetic */ boolean lambda$static$5(int i6) {
        return i6 == 10 || i6 == 13;
    }

    static /* synthetic */ boolean lambda$static$6(int i6) {
        return i6 == 10 || i6 == 13 || i6 == 0;
    }

    static /* synthetic */ boolean lambda$static$7(int i6) {
        return i6 == 92;
    }

    static /* synthetic */ boolean lambda$static$8(int i6) {
        return i6 == 47;
    }

    static /* synthetic */ boolean lambda$static$9(int i6) {
        return i6 == 8232;
    }

    static CharPredicate standardOrAnyOf(char c6) {
        CharPredicate charPredicate = SPACE;
        if (charPredicate.test(c6)) {
            return charPredicate;
        }
        CharPredicate charPredicate2 = EOL;
        if (charPredicate2.test(c6)) {
            return charPredicate2;
        }
        CharPredicate charPredicate3 = TAB;
        return charPredicate3.test(c6) ? charPredicate3 : new com.vladsch.flexmark.html2md.converter.internal.d(c6, 1);
    }

    static /* synthetic */ boolean y(char c6, int i6) {
        return lambda$standardOrAnyOf$32(c6, i6);
    }

    default CharPredicate and(CharPredicate charPredicate) {
        Objects.requireNonNull(charPredicate);
        CharPredicate charPredicate2 = NONE;
        if (this == charPredicate2 || charPredicate == charPredicate2) {
            return charPredicate2;
        }
        CharPredicate charPredicate3 = ALL;
        return this == charPredicate3 ? charPredicate : charPredicate == charPredicate3 ? this : new b(this, charPredicate, 0);
    }

    default CharPredicate or(CharPredicate charPredicate) {
        Objects.requireNonNull(charPredicate);
        CharPredicate charPredicate2 = ALL;
        if (this == charPredicate2 || charPredicate == charPredicate2) {
            return charPredicate2;
        }
        CharPredicate charPredicate3 = NONE;
        return this == charPredicate3 ? charPredicate : charPredicate == charPredicate3 ? this : new b(this, charPredicate, 1);
    }

    default boolean test(char c6) {
        return test((int) c6);
    }

    @Override // java.util.function.IntPredicate
    boolean test(int i6);

    static int indexOf(CharSequence charSequence, char c6, int i6, int i7) {
        int min = Math.min(charSequence.length(), i7);
        for (int max = Math.max(i6, 0); max < min; max++) {
            if (c6 == charSequence.charAt(max)) {
                return max;
            }
        }
        return -1;
    }

    @Override // java.util.function.IntPredicate
    default CharPredicate negate() {
        CharPredicate charPredicate = NONE;
        return this == charPredicate ? ALL : this == ALL ? charPredicate : new d(this, 2);
    }

    static CharPredicate standardOrAnyOf(final char c6, final char c7) {
        if (c6 == c7) {
            return standardOrAnyOf(c6);
        }
        CharPredicate charPredicate = SPACE_TAB;
        if (charPredicate.test(c6) && charPredicate.test(c7)) {
            return charPredicate;
        }
        CharPredicate charPredicate2 = ANY_EOL;
        return (charPredicate2.test(c6) && charPredicate2.test(c7)) ? charPredicate2 : new CharPredicate() { // from class: com.vladsch.flexmark.util.misc.c
            @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
            public final boolean test(int i6) {
                boolean lambda$standardOrAnyOf$33;
                lambda$standardOrAnyOf$33 = CharPredicate.lambda$standardOrAnyOf$33(c6, c7, i6);
                return lambda$standardOrAnyOf$33;
            }
        };
    }

    static CharPredicate anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return NONE;
        }
        if (length == 1) {
            return standardOrAnyOf(charSequence.charAt(0));
        }
        if (length == 2) {
            return standardOrAnyOf(charSequence.charAt(0), charSequence.charAt(1));
        }
        if (length == 3) {
            return standardOrAnyOf(charSequence.charAt(0), charSequence.charAt(1), charSequence.charAt(2));
        }
        if (length != 4) {
            int length2 = charSequence.length();
            d dVar = null;
            StringBuilder sb = null;
            BitSet bitSet = null;
            for (int i6 = 0; i6 < length2; i6++) {
                char charAt = charSequence.charAt(i6);
                if (charAt <= 127) {
                    if (bitSet == null) {
                        bitSet = new BitSet();
                    }
                    bitSet.set(charAt);
                } else {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    if (indexOf(sb, charAt) == -1) {
                        sb.append(charAt);
                    }
                }
            }
            String sb2 = sb == null ? null : sb.toString();
            CharPredicate anyOf = (sb2 == null || sb2.isEmpty()) ? null : sb2.length() <= 4 ? anyOf(sb) : new d(sb2, 0);
            if (bitSet != null && bitSet.cardinality() != 0) {
                dVar = new d(bitSet, 1);
            }
            if (!AnonymousClass1.$assertionsDisabled && dVar == null && anyOf == null) {
                throw new AssertionError();
            }
            if (dVar == null || anyOf == null) {
                return dVar != null ? dVar : anyOf;
            }
            return dVar.or(anyOf);
        }
        return standardOrAnyOf(charSequence.charAt(0), charSequence.charAt(1), charSequence.charAt(2), charSequence.charAt(3));
    }

    static CharPredicate standardOrAnyOf(final char c6, final char c7, final char c8) {
        if (c6 == c7 && c7 == c8) {
            return standardOrAnyOf(c6);
        }
        if (c6 == c7 || c6 == c8) {
            return standardOrAnyOf(c7, c8);
        }
        if (c7 == c8) {
            return standardOrAnyOf(c6, c8);
        }
        return new CharPredicate() { // from class: com.vladsch.flexmark.util.misc.e
            @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
            public final boolean test(int i6) {
                boolean lambda$standardOrAnyOf$34;
                lambda$standardOrAnyOf$34 = CharPredicate.lambda$standardOrAnyOf$34(c6, c7, c8, i6);
                return lambda$standardOrAnyOf$34;
            }
        };
    }

    static CharPredicate standardOrAnyOf(final char c6, final char c7, final char c8, final char c9) {
        if (c6 == c7 && c7 == c8 && c8 == c9) {
            return standardOrAnyOf(c6);
        }
        if (c6 == c7 || c6 == c8 || c6 == c9) {
            return standardOrAnyOf(c7, c8, c9);
        }
        if (c7 == c8 || c7 == c9) {
            return standardOrAnyOf(c6, c8, c9);
        }
        if (c8 == c9) {
            return standardOrAnyOf(c6, c7, c8);
        }
        CharPredicate charPredicate = WHITESPACE;
        return (charPredicate.test(c6) && charPredicate.test(c7) && charPredicate.test(c8) && charPredicate.test(c9)) ? charPredicate : new CharPredicate() { // from class: com.vladsch.flexmark.util.misc.f
            @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
            public final boolean test(int i6) {
                boolean lambda$standardOrAnyOf$35;
                lambda$standardOrAnyOf$35 = CharPredicate.lambda$standardOrAnyOf$35(c6, c7, c8, c9, i6);
                return lambda$standardOrAnyOf$35;
            }
        };
    }
}
