package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;

/* loaded from: classes.dex */
public final class PrefixedSubSequence extends BasedSequenceImpl implements ReplacedBasedSequence {
    private final BasedSequence base;
    private final CharSequence prefix;

    private PrefixedSubSequence(CharSequence charSequence, BasedSequence basedSequence, int i6, int i7) {
        super(0);
        this.prefix = charSequence;
        this.base = basedSequence.subSequence(i6, i7);
    }

    @Deprecated
    public static PrefixedSubSequence of(CharSequence charSequence, BasedSequence basedSequence) {
        return prefixOf(charSequence, basedSequence);
    }

    public static PrefixedSubSequence prefixOf(CharSequence charSequence, BasedSequence basedSequence) {
        return prefixOf(charSequence, basedSequence, 0, basedSequence.length());
    }

    public static PrefixedSubSequence repeatOf(CharSequence charSequence, int i6, BasedSequence basedSequence) {
        return prefixOf(RepeatedSequence.repeatOf(charSequence, i6).toString(), basedSequence, 0, basedSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder) {
        if (this.prefix.length() != 0) {
            iBasedSegmentBuilder.append(this.base.getStartOffset(), this.base.getStartOffset());
            iBasedSegmentBuilder.append(this.prefix.toString());
        }
        this.base.addSegments(iBasedSegmentBuilder);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean allOptions(int i6) {
        return getBaseSequence().allOptions(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean anyOptions(int i6) {
        return getBaseSequence().anyOptions(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence baseSubSequence(int i6, int i7) {
        return this.base.baseSubSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        SequenceUtils.validateIndex(i6, length());
        int length = this.prefix.length();
        return i6 < length ? this.prefix.charAt(i6) : this.base.charAt(i6 - length);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Object getBase() {
        return this.base.getBase();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence getBaseSequence() {
        return this.base.getBaseSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getEndOffset() {
        return this.base.getEndOffset();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getIndexOffset(int i6) {
        SequenceUtils.validateIndexInclusiveEnd(i6, length());
        if (i6 < this.prefix.length()) {
            return -1;
        }
        return this.base.getIndexOffset(i6 - this.prefix.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public <T> T getOption(DataKeyBase<T> dataKeyBase) {
        return (T) getBaseSequence().getOption(dataKeyBase);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public int getOptionFlags() {
        return getBaseSequence().getOptionFlags();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public DataHolder getOptions() {
        return getBaseSequence().getOptions();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Range getSourceRange() {
        return this.base.getSourceRange();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getStartOffset() {
        return this.base.getStartOffset();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.base.length() + this.prefix.length();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequenceBase, java.lang.CharSequence
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefix);
        this.base.appendTo(sb);
        return sb.toString();
    }

    @Deprecated
    public static PrefixedSubSequence of(CharSequence charSequence, BasedSequence basedSequence, int i6) {
        return prefixOf(charSequence, basedSequence, i6);
    }

    public static PrefixedSubSequence prefixOf(CharSequence charSequence, BasedSequence basedSequence, int i6) {
        return prefixOf(charSequence, basedSequence, i6, basedSequence.length());
    }

    public static PrefixedSubSequence repeatOf(char c6, int i6, BasedSequence basedSequence) {
        return prefixOf(RepeatedSequence.repeatOf(c6, i6), basedSequence, 0, basedSequence.length());
    }

    @Deprecated
    public static PrefixedSubSequence of(CharSequence charSequence, BasedSequence basedSequence, int i6, int i7) {
        return prefixOf(charSequence, basedSequence, i6, i7);
    }

    public static PrefixedSubSequence prefixOf(CharSequence charSequence, BasedSequence basedSequence, int i6, int i7) {
        return new PrefixedSubSequence(charSequence, basedSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public BasedSequence subSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
        int length = this.prefix.length();
        if (i6 >= length) {
            return this.base.subSequence(i6 - length, i7 - length);
        }
        if (i7 <= length) {
            return new PrefixedSubSequence(this.prefix.subSequence(i6, i7), this.base.subSequence(0, 0), 0, 0);
        }
        return new PrefixedSubSequence(this.prefix.subSequence(i6, length), this.base, 0, i7 - length);
    }
}
