package com.vladsch.flexmark.util.sequence.builder;

import B3.e;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.Range;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public class Seg {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Seg ANCHOR_0;
    public static final int F_TEXT_OPTION = 1073741824;
    public static final int MAX_TEXT_OFFSET = 1073741823;
    public static final Seg NULL;
    private final int end;
    private final int start;

    static {
        Range range = Range.NULL;
        NULL = new Seg(range.getStart(), range.getEnd());
        ANCHOR_0 = new Seg(0, 0);
    }

    private Seg(int i6, int i7) {
        this.start = i6;
        this.end = i7;
    }

    public static int getTextEnd(int i6, boolean z5) {
        if (z5) {
            i6 |= 1073741824;
        }
        return (-i6) - 1;
    }

    public static int getTextOffset(int i6) {
        return ((-i6) - 1) & MAX_TEXT_OFFSET;
    }

    public static int getTextStart(int i6, boolean z5) {
        if (z5) {
            i6 |= 1073741824;
        }
        return (-i6) - 1;
    }

    public static boolean isFirst256Start(int i6) {
        return (((-i6) - 1) & 1073741824) != 0;
    }

    public static boolean isRepeatedTextEnd(int i6) {
        return (((-i6) - 1) & 1073741824) != 0;
    }

    public static Seg segOf(int i6, int i7) {
        return (i6 == 0 && i7 == 0) ? ANCHOR_0 : new Seg(i6, i7);
    }

    public static Seg textOf(int i6, int i7, boolean z5, boolean z6) {
        return new Seg(getTextStart(i6, z5), getTextEnd(i7, z6));
    }

    public int getEnd() {
        return this.end;
    }

    public Range getRange() {
        return Range.of(this.start, this.end);
    }

    public int getSegEnd() {
        return isText() ? getTextEnd() : this.end;
    }

    public int getSegStart() {
        return isText() ? getTextStart() : this.start;
    }

    public int getStart() {
        return this.start;
    }

    public boolean isAnchor() {
        int i6;
        int i7 = this.start;
        return i7 >= 0 && (i6 = this.end) >= 0 && i7 == i6;
    }

    public boolean isBase() {
        int i6;
        int i7 = this.start;
        return i7 >= 0 && (i6 = this.end) >= 0 && i7 <= i6;
    }

    public boolean isNull() {
        return (isBase() || isText()) ? false : true;
    }

    public boolean isText() {
        int i6;
        int i7 = this.start;
        return i7 < 0 && (i6 = this.end) < 0 && (i7 & MAX_TEXT_OFFSET) > (i6 & MAX_TEXT_OFFSET);
    }

    public int length() {
        int i6;
        int i7;
        if (isBase()) {
            i6 = this.end;
            i7 = this.start;
        } else {
            if (!isText()) {
                return 0;
            }
            i6 = this.start & MAX_TEXT_OFFSET;
            i7 = 1073741823 & this.end;
        }
        return i6 - i7;
    }

    public String toString(CharSequence charSequence) {
        if (isNull()) {
            return "NULL";
        }
        if (isBase()) {
            int i6 = this.start;
            int i7 = this.end;
            if (i6 == i7) {
                return e.l("[", i6, ")");
            }
            return e.i(i6, "[", i7, ", ", ")");
        }
        CharSequence subSequence = charSequence.subSequence(getTextStart(), getTextEnd());
        if (isRepeatedTextEnd() && length() > 1) {
            if (isFirst256Start()) {
                return "a:" + length() + "x'" + Utils.escapeJavaString(subSequence.subSequence(0, 1)) + "'";
            }
            return length() + "x'" + Utils.escapeJavaString(subSequence.subSequence(0, 1)) + "'";
        }
        String charSequence2 = length() <= 20 ? subSequence.toString() : AbstractC1135a.g(subSequence.subSequence(0, 10).toString(), "…", subSequence.subSequence(length() - 10, length()).toString());
        if (isFirst256Start()) {
            return AbstractC1135a.s("a:'", Utils.escapeJavaString(charSequence2), "'");
        }
        return AbstractC1135a.s("'", Utils.escapeJavaString(charSequence2), "'");
    }

    public int getTextEnd() {
        return getTextOffset(this.end);
    }

    public int getTextStart() {
        return getTextOffset(this.start);
    }

    public boolean isFirst256Start() {
        return isFirst256Start(this.start);
    }

    public boolean isRepeatedTextEnd() {
        return isRepeatedTextEnd(this.end);
    }

    public String toString() {
        if (isNull()) {
            return "NULL";
        }
        if (isBase()) {
            int i6 = this.start;
            int i7 = this.end;
            if (i6 == i7) {
                return e.l("BASE[", i6, ")");
            }
            return e.i(i6, "BASE[", i7, ", ", ")");
        }
        return e.i(getTextStart(), "TEXT[", getTextEnd(), ", ", ")");
    }
}
