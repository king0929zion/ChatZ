package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.mappers.CharMapper;

/* loaded from: classes.dex */
public final class MappedBasedSequence extends BasedSequenceImpl implements MappedSequence<BasedSequence>, ReplacedBasedSequence {
    private final BasedSequence baseSeq;
    private final CharMapper mapper;

    private MappedBasedSequence(BasedSequence basedSequence, CharMapper charMapper) {
        super(0);
        this.baseSeq = basedSequence;
        this.mapper = charMapper;
    }

    public static BasedSequence mappedOf(BasedSequence basedSequence, CharMapper charMapper) {
        return new MappedBasedSequence(basedSequence, charMapper);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder) {
        BasedUtils.generateSegments(iBasedSegmentBuilder, this);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean allOptions(int i6) {
        return getBaseSequence().allOptions(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean anyOptions(int i6) {
        return getBaseSequence().anyOptions(i6);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        return this.mapper.map(this.baseSeq.charAt(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Object getBase() {
        return this.baseSeq.getBase();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence getBaseSequence() {
        return this.baseSeq.getBaseSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.MappedSequence
    public CharMapper getCharMapper() {
        return this.mapper;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getEndOffset() {
        return this.baseSeq.getEndOffset();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getIndexOffset(int i6) {
        if (this.baseSeq.charAt(i6) == charAt(i6)) {
            return this.baseSeq.getIndexOffset(i6);
        }
        return -1;
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
        return this.baseSeq.getSourceRange();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getStartOffset() {
        return this.baseSeq.getStartOffset();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.baseSeq.length();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.MappedSequence
    public BasedSequence getCharSequence() {
        return this.baseSeq;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence sequenceOf(CharSequence charSequence, int i6, int i7) {
        if (charSequence instanceof MappedBasedSequence) {
            return (i6 == 0 && i7 == charSequence.length()) ? (BasedSequence) charSequence : ((BasedSequence) charSequence).subSequence(i6, i7).toMapped(this.mapper);
        }
        return new MappedBasedSequence(this.baseSeq.sequenceOf(charSequence, i6, i7), this.mapper);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence toMapped(CharMapper charMapper) {
        return charMapper == CharMapper.IDENTITY ? this : new MappedBasedSequence(this.baseSeq, this.mapper.andThen(charMapper));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public BasedSequence subSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
        return (i6 == 0 && i7 == this.baseSeq.length()) ? this : new MappedBasedSequence(this.baseSeq.subSequence(i6, i7), this.mapper);
    }
}
