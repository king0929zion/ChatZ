package com.vladsch.flexmark.util.sequence;

import B3.e;

/* loaded from: classes.dex */
public class RepeatedSequence implements CharSequence {
    public static RepeatedSequence NULL = new RepeatedSequence(BasedSequence.NULL, 0, 0);
    private final CharSequence chars;
    private final int endIndex;
    private int hashCode;
    private final int startIndex;

    private RepeatedSequence(CharSequence charSequence, int i6, int i7) {
        this.chars = charSequence;
        this.startIndex = i6;
        this.endIndex = i7;
    }

    @Deprecated
    public static CharSequence of(char c6, int i6) {
        return repeatOf(c6, i6);
    }

    public static CharSequence ofSpaces(int i6) {
        return new RepeatedSequence(SequenceUtils.SPACE, 0, i6);
    }

    public static CharSequence repeatOf(char c6, int i6) {
        return new RepeatedSequence(String.valueOf(c6), 0, i6);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        if (i6 >= 0) {
            int i7 = this.endIndex;
            int i8 = this.startIndex;
            if (i6 < i7 - i8) {
                CharSequence charSequence = this.chars;
                return charSequence.charAt((i8 + i6) % charSequence.length());
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof CharSequence) && toString().equals(obj.toString());
        }
        return true;
    }

    public int hashCode() {
        int i6 = this.hashCode;
        if (i6 == 0 && length() > 0) {
            for (int i7 = 0; i7 < length(); i7++) {
                i6 = (i6 * 31) + charAt(i7);
            }
            this.hashCode = i6;
        }
        return i6;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.endIndex - this.startIndex;
    }

    public RepeatedSequence repeat(int i6) {
        int i7 = this.startIndex;
        int i8 = this.endIndex;
        int i9 = ((i8 - i7) * i6) + i7;
        return i7 >= i8 ? NULL : i8 == i9 ? this : new RepeatedSequence(this.chars, i7, i9);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i6, int i7) {
        if (i6 >= 0 && i6 <= i7) {
            int i8 = this.endIndex;
            int i9 = this.startIndex;
            if (i7 <= i8 - i9) {
                return i6 == i7 ? NULL : (i6 == i9 && i7 == i8) ? this : new RepeatedSequence(this.chars, i6 + i9, i9 + i7);
            }
        }
        throw new IllegalArgumentException(e.i(this.startIndex, "subSequence($startIndex, $endIndex) in RepeatedCharSequence('', ", this.endIndex, ", ", ")"));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this, 0, length());
        return sb.toString();
    }

    @Deprecated
    public static CharSequence of(CharSequence charSequence, int i6) {
        return repeatOf(charSequence, i6);
    }

    public static CharSequence repeatOf(CharSequence charSequence, int i6) {
        return new RepeatedSequence(charSequence, 0, charSequence.length() * i6);
    }

    @Deprecated
    public static CharSequence of(CharSequence charSequence, int i6, int i7) {
        return repeatOf(charSequence, i6, i7);
    }

    public static CharSequence repeatOf(CharSequence charSequence, int i6, int i7) {
        return new RepeatedSequence(charSequence, i6, i7);
    }
}
