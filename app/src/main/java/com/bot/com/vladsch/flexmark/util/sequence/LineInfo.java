package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.misc.BitField;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.misc.Utils;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class LineInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Flags BLANK_PREFIX;
    public static final Flags BLANK_TEXT;
    public static final int F_BLANK_PREFIX;
    public static final int F_BLANK_TEXT;
    public static final int F_PREFORMATTED;
    public static final LineInfo NULL;
    public static final Flags PREFORMATTED;
    public final int flags;
    public final int index;
    public final int length;
    public final CharSequence lineSeq;
    public final int prefixLength;
    public final int sumLength;
    public final int sumPrefixLength;
    public final int sumTextLength;
    public final int textLength;

    /* loaded from: classes.dex */
    public enum Flags implements BitField {
        PREFORMATTED(2),
        BLANK_PREFIX,
        BLANK_TEXT;

        final int bits;

        Flags() {
            this(1);
        }

        @Override // com.vladsch.flexmark.util.misc.BitField
        public int getBits() {
            return this.bits;
        }

        Flags(int i6) {
            this.bits = i6;
        }
    }

    /* loaded from: classes.dex */
    public enum Preformatted {
        NONE,
        FIRST,
        BODY,
        LAST;

        final int mask = BitFieldSet.setBitField(0, Flags.PREFORMATTED, ordinal());

        Preformatted() {
        }

        public static Preformatted get(int i6) {
            int i7 = i6 & LineInfo.F_PREFORMATTED;
            Preformatted preformatted = FIRST;
            if (i7 == preformatted.mask) {
                return preformatted;
            }
            Preformatted preformatted2 = BODY;
            if (i7 == preformatted2.mask) {
                return preformatted2;
            }
            Preformatted preformatted3 = LAST;
            return i7 == preformatted3.mask ? preformatted3 : NONE;
        }
    }

    static {
        Flags flags = Flags.BLANK_PREFIX;
        BLANK_PREFIX = flags;
        Flags flags2 = Flags.BLANK_TEXT;
        BLANK_TEXT = flags2;
        Flags flags3 = Flags.PREFORMATTED;
        PREFORMATTED = flags3;
        F_PREFORMATTED = BitFieldSet.intMask(flags3);
        F_BLANK_PREFIX = BitFieldSet.intMask(flags);
        F_BLANK_TEXT = BitFieldSet.intMask(flags2);
        NULL = new LineInfo(BasedSequence.NULL, -1, 0, 0, 0, 0, 0, 0, true, true, Preformatted.NONE);
    }

    private LineInfo(CharSequence charSequence, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z5, boolean z6, Preformatted preformatted) {
        this.lineSeq = charSequence;
        this.index = i6;
        this.prefixLength = i7;
        this.textLength = i8;
        this.length = i9;
        this.sumPrefixLength = i10 + i7;
        this.sumTextLength = i11 + i8;
        this.sumLength = i12 + i9;
        this.flags = ((z6 || i8 == 0) ? F_BLANK_TEXT : 0) | ((z5 || i7 == 0) ? F_BLANK_PREFIX : 0) | preformatted.ordinal();
    }

    public static LineInfo create(CharSequence charSequence, int i6, int i7, int i8, boolean z5, boolean z6, Preformatted preformatted) {
        return new LineInfo(charSequence, 0, i6, i7, i8, 0, 0, 0, z5, z6, preformatted);
    }

    public BasedSequence getEOL() {
        return getLine().subSequence(this.prefixLength + this.textLength, this.length);
    }

    public BasedSequence getLine() {
        CharSequence charSequence = this.lineSeq;
        return charSequence instanceof BasedSequence ? (BasedSequence) charSequence : BasedSequence.of(charSequence);
    }

    public BasedSequence getLineNoEOL() {
        return getLine().subSequence(0, this.prefixLength + this.textLength);
    }

    public BasedSequence getPrefix() {
        return getLine().subSequence(0, this.prefixLength);
    }

    public Preformatted getPreformatted() {
        return Preformatted.get(this.flags);
    }

    public BasedSequence getText() {
        return getLine().subSequence(this.prefixLength, this.length);
    }

    public int getTextEnd() {
        return this.prefixLength + this.textLength;
    }

    public BasedSequence getTextNoEOL() {
        BasedSequence line = getLine();
        int i6 = this.prefixLength;
        return line.subSequence(i6, this.textLength + i6);
    }

    public int getTextStart() {
        return this.prefixLength;
    }

    public boolean isBlankPrefix() {
        return BitFieldSet.any(this.flags, F_BLANK_PREFIX);
    }

    public boolean isBlankText() {
        return BitFieldSet.any(this.flags, F_BLANK_TEXT);
    }

    public boolean isBlankTextAndPrefix() {
        return BitFieldSet.all(this.flags, F_BLANK_PREFIX | F_BLANK_TEXT);
    }

    public boolean isNotNull() {
        return this != NULL;
    }

    public boolean isNull() {
        return this == NULL;
    }

    public boolean isPreformatted() {
        return BitFieldSet.any(this.flags, F_PREFORMATTED);
    }

    public boolean needAggregateUpdate(LineInfo lineInfo) {
        return (this.sumPrefixLength == lineInfo.sumPrefixLength && this.sumTextLength == lineInfo.sumTextLength && this.sumLength == lineInfo.sumLength) ? false : true;
    }

    public String toString() {
        int i6 = this.index;
        int i7 = this.prefixLength;
        int i8 = this.textLength;
        int i9 = this.length;
        int i10 = this.sumPrefixLength;
        int i11 = this.sumTextLength;
        int i12 = this.sumLength;
        int i13 = this.flags;
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (i13 != 0) {
            String str2 = isBlankPrefix() ? " bp" : FlexmarkHtmlConverter.DEFAULT_NODE;
            String str3 = isBlankText() ? " bt" : FlexmarkHtmlConverter.DEFAULT_NODE;
            if (isPreformatted()) {
                str = " p";
            }
            str = "," + str2 + str3 + str;
        }
        String escapeJavaString = Utils.escapeJavaString(this.lineSeq);
        StringBuilder j3 = AbstractC1135a.j(i6, "LineInfo{i=", i7, ", pl=", ", tl=");
        j3.append(i8);
        j3.append(", l=");
        j3.append(i9);
        j3.append(", sumPl=");
        j3.append(i10);
        j3.append(", sumTl=");
        j3.append(i11);
        j3.append(", sumL=");
        j3.append(i12);
        j3.append(str);
        j3.append(", '");
        j3.append(escapeJavaString);
        j3.append("'}");
        return j3.toString();
    }

    public static LineInfo create(CharSequence charSequence, LineInfo lineInfo, int i6, int i7, int i8, boolean z5, boolean z6, Preformatted preformatted) {
        return new LineInfo(charSequence, lineInfo.index + 1, i6, i7, i8, lineInfo.sumPrefixLength, lineInfo.sumTextLength, lineInfo.sumLength, z5, z6, preformatted);
    }

    public static LineInfo create(LineInfo lineInfo, LineInfo lineInfo2) {
        return new LineInfo(lineInfo2.lineSeq, lineInfo.index + 1, lineInfo2.prefixLength, lineInfo2.textLength, lineInfo2.length, lineInfo.sumPrefixLength, lineInfo.sumTextLength, lineInfo.sumLength, lineInfo2.isBlankPrefix(), lineInfo2.isBlankText(), lineInfo2.getPreformatted());
    }
}
