package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

/* loaded from: classes.dex */
public enum NumberFormat {
    NONE,
    ARABIC,
    LETTERS,
    ROMAN,
    CUSTOM;

    /* renamed from: com.vladsch.flexmark.util.format.NumberFormat$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$NumberFormat;

        static {
            int[] iArr = new int[NumberFormat.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$NumberFormat = iArr;
            try {
                iArr[NumberFormat.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$NumberFormat[NumberFormat.ARABIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$NumberFormat[NumberFormat.LETTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$NumberFormat[NumberFormat.ROMAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$NumberFormat[NumberFormat.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String getFormat(NumberFormat numberFormat, int i6) {
        int i7 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$format$NumberFormat[numberFormat.ordinal()];
        if (i7 == 2) {
            return String.valueOf(i6);
        }
        if (i7 == 3) {
            if (i6 >= 1) {
                return getFormat(i6 - 1, "abcdefghijklmnopqrstuvwxyz");
            }
            throw new NumberFormatException(B3.e.h(i6, "Letter format count must be > 0, actual "));
        }
        if (i7 == 4) {
            return new RomanNumeral(i6).toString();
        }
        if (i7 != 5) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        throw new IllegalStateException("CounterFormat.CUSTOM has to use custom conversion, possibly by calling getFormat(int count, CharSequence digitSet)");
    }

    public static String getFormat(int i6, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(10);
        int length = charSequence.length();
        while (true) {
            int i7 = i6 / length;
            sb.append(charSequence.charAt(i6 - (i7 * length)));
            if (i7 <= 0) {
                break;
            }
            i6 = i7;
        }
        int length2 = sb.length();
        StringBuilder sb2 = new StringBuilder(length2);
        while (true) {
            int i8 = length2 - 1;
            if (length2 > 0) {
                sb2.append(sb.charAt(i8));
                length2 = i8;
            } else {
                return sb2.toString();
            }
        }
    }
}
