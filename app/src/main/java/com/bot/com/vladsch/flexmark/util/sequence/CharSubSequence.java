package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;

/* loaded from: classes.dex */
public final class CharSubSequence extends BasedSequenceImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final CharSubSequence base;
    private final char[] baseChars;
    private final int endOffset;
    private final int startOffset;

    private CharSubSequence(char[] cArr, int i6) {
        super(i6);
        int length = cArr.length;
        this.base = this;
        this.baseChars = cArr;
        this.startOffset = 0;
        this.endOffset = cArr.length;
    }

    public static CharSubSequence of(CharSequence charSequence) {
        return of(charSequence, 0, charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean allOptions(int i6) {
        return false;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean anyOptions(int i6) {
        return false;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        SequenceUtils.validateIndex(i6, length());
        char c6 = this.baseChars[i6 + this.startOffset];
        return c6 == 0 ? SequenceUtils.ENC_NUL : c6;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getEndOffset() {
        return this.endOffset;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getIndexOffset(int i6) {
        SequenceUtils.validateIndexInclusiveEnd(i6, length());
        return this.startOffset + i6;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public <T> T getOption(DataKeyBase<T> dataKeyBase) {
        return dataKeyBase.get(null);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public int getOptionFlags() {
        return 0;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public DataHolder getOptions() {
        return null;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Range getSourceRange() {
        return Range.of(this.startOffset, this.endOffset);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getStartOffset() {
        return this.startOffset;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.endOffset - this.startOffset;
    }

    public static CharSubSequence of(CharSequence charSequence, int i6) {
        return of(charSequence, i6, charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public CharSubSequence baseSubSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, this.baseChars.length);
        if (i6 == this.startOffset && i7 == this.endOffset) {
            return this;
        }
        CharSubSequence charSubSequence = this.base;
        return charSubSequence != this ? charSubSequence.baseSubSequence(i6, i7) : new CharSubSequence(charSubSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public char[] getBase() {
        return this.baseChars;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public CharSubSequence getBaseSequence() {
        return this.base;
    }

    @Deprecated
    public static CharSubSequence of(char[] cArr, int i6, int i7) {
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return (i6 == 0 && i7 == cArr.length) ? new CharSubSequence(cArr2, 0) : new CharSubSequence(cArr2, 0).subSequence(i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public CharSubSequence subSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
        CharSubSequence charSubSequence = this.base;
        int i8 = this.startOffset;
        return charSubSequence.baseSubSequence(i6 + i8, i8 + i7);
    }

    private static CharSubSequence of(CharSequence charSequence, int i6, int i7) {
        CharSubSequence charSubSequence;
        if (charSequence instanceof CharSubSequence) {
            charSubSequence = (CharSubSequence) charSequence;
        } else if (charSequence instanceof String) {
            String str = (String) charSequence;
            charSubSequence = new CharSubSequence(str.toCharArray(), str.hashCode());
        } else if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            char[] cArr = new char[sb.length()];
            ((StringBuilder) charSequence).getChars(0, sb.length(), cArr, 0);
            charSubSequence = new CharSubSequence(cArr, 0);
        } else {
            charSubSequence = new CharSubSequence(charSequence.toString().toCharArray(), 0);
        }
        return (i6 == 0 && i7 == charSequence.length()) ? charSubSequence : charSubSequence.subSequence(i6, i7);
    }

    private CharSubSequence(CharSubSequence charSubSequence, int i6, int i7) {
        super(0);
        this.base = charSubSequence;
        this.baseChars = charSubSequence.baseChars;
        this.startOffset = charSubSequence.startOffset + i6;
        this.endOffset = charSubSequence.startOffset + i7;
    }
}
