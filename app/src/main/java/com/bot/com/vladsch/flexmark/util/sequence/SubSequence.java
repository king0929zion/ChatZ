package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;

/* loaded from: classes.dex */
public final class SubSequence extends BasedSequenceImpl {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final SubSequence baseSeq;
    private final CharSequence charSequence;
    private final int endOffset;
    private final int startOffset;

    private SubSequence(CharSequence charSequence) {
        super(charSequence instanceof String ? charSequence.hashCode() : 0);
        this.baseSeq = this;
        this.charSequence = charSequence;
        this.startOffset = 0;
        this.endOffset = charSequence.length();
    }

    public static BasedSequence create(CharSequence charSequence) {
        return charSequence == null ? BasedSequence.NULL : charSequence instanceof BasedSequence ? (BasedSequence) charSequence : new SubSequence(charSequence);
    }

    @Deprecated
    public static BasedSequence of(CharSequence charSequence) {
        return BasedSequence.of(charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder) {
        iBasedSegmentBuilder.append(this.startOffset, this.endOffset);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean allOptions(int i6) {
        CharSequence charSequence = this.charSequence;
        return (charSequence instanceof BasedOptionsHolder) && ((BasedOptionsHolder) charSequence).allOptions(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean anyOptions(int i6) {
        CharSequence charSequence = this.charSequence;
        return (charSequence instanceof BasedOptionsHolder) && ((BasedOptionsHolder) charSequence).anyOptions(i6);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        SequenceUtils.validateIndex(i6, length());
        char charAt = this.charSequence.charAt(i6 + this.startOffset);
        return charAt == 0 ? SequenceUtils.ENC_NUL : charAt;
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
        CharSequence charSequence = this.charSequence;
        return charSequence instanceof BasedOptionsHolder ? (T) ((BasedOptionsHolder) charSequence).getOption(dataKeyBase) : dataKeyBase.get(null);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public int getOptionFlags() {
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof BasedOptionsHolder) {
            return ((BasedOptionsHolder) charSequence).getOptionFlags();
        }
        return 0;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public DataHolder getOptions() {
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof BasedOptionsHolder) {
            return ((BasedOptionsHolder) charSequence).getOptions();
        }
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

    @Deprecated
    public static BasedSequence of(CharSequence charSequence, int i6) {
        return BasedSequence.of(charSequence).subSequence(i6, charSequence == null ? 0 : charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public SubSequence baseSubSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, this.baseSeq.length());
        if (i6 == this.startOffset && i7 == this.endOffset) {
            return this;
        }
        SubSequence subSequence = this.baseSeq;
        return subSequence != this ? subSequence.baseSubSequence(i6, i7) : new SubSequence(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public CharSequence getBase() {
        return this.charSequence;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public SubSequence getBaseSequence() {
        return this.baseSeq;
    }

    @Deprecated
    public static BasedSequence of(CharSequence charSequence, int i6, int i7) {
        return BasedSequence.of(charSequence).subSequence(i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public SubSequence subSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
        int i8 = this.startOffset;
        return baseSubSequence(i6 + i8, i8 + i7);
    }

    private SubSequence(SubSequence subSequence, int i6, int i7) {
        super(0);
        this.baseSeq = subSequence;
        this.charSequence = subSequence.charSequence;
        this.startOffset = i6;
        this.endOffset = i7;
    }
}
