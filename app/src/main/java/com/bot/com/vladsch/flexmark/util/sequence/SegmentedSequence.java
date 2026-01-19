package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.collection.iteration.ArrayIterable;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;

/* loaded from: classes.dex */
public abstract class SegmentedSequence implements BasedSequenceImpl, ReplacedBasedSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final BasedSequence baseSeq;
    protected final int endOffset;
    protected final int length;
    protected final int startOffset;

    public SegmentedSequence(BasedSequence basedSequence, int i6, int i7, int i8) {
        super(0);
        if (i6 < 0 && i7 < 0) {
            i6 = 0;
            i7 = 0;
        }
        this.baseSeq = basedSequence;
        this.startOffset = i6;
        this.endOffset = i7;
        this.length = i8;
    }

    public static BasedSequence create(BasedSequence basedSequence, Iterable<? extends BasedSequence> iterable) {
        return create(basedSequence.getBuilder().addAll(iterable));
    }

    @Deprecated
    public static BasedSequence of(BasedSequence basedSequence, Iterable<? extends BasedSequence> iterable) {
        return create(basedSequence, iterable);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public final boolean allOptions(int i6) {
        return getBaseSequence().allOptions(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public final boolean anyOptions(int i6) {
        return getBaseSequence().anyOptions(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence baseSubSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, this.baseSeq.length());
        return this.baseSeq.baseSubSequence(i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final Object getBase() {
        return this.baseSeq.getBase();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence getBaseSequence() {
        return this.baseSeq;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final int getEndOffset() {
        return this.endOffset;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public final <T> T getOption(DataKeyBase<T> dataKeyBase) {
        return (T) getBaseSequence().getOption(dataKeyBase);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public final int getOptionFlags() {
        return getBaseSequence().getOptionFlags();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public final DataHolder getOptions() {
        return getBaseSequence().getOptions();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final Range getSourceRange() {
        return Range.of(getStartOffset(), getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final int getStartOffset() {
        return this.startOffset;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.length;
    }

    public static BasedSequence create(BasedSequence... basedSequenceArr) {
        return basedSequenceArr.length == 0 ? BasedSequence.NULL : create(basedSequenceArr[0], new ArrayIterable(basedSequenceArr));
    }

    @Deprecated
    public static BasedSequence of(BasedSequence... basedSequenceArr) {
        return create(basedSequenceArr);
    }

    public static BasedSequence create(SequenceBuilder sequenceBuilder) {
        BasedSequence singleBasedSequence = sequenceBuilder.getSingleBasedSequence();
        if (singleBasedSequence != null) {
            return singleBasedSequence;
        }
        if (!sequenceBuilder.isEmpty()) {
            BasedSequence baseSequence = sequenceBuilder.getBaseSequence();
            if (baseSequence.anyOptions(BasedOptionsHolder.F_FULL_SEGMENTED_SEQUENCES)) {
                return SegmentedSequenceFull.create(baseSequence, (ISegmentBuilder<?>) sequenceBuilder.getSegmentBuilder());
            }
            if (baseSequence.anyOptions(BasedOptionsHolder.F_TREE_SEGMENTED_SEQUENCES)) {
                return SegmentedSequenceTree.create(baseSequence, (ISegmentBuilder<?>) sequenceBuilder.getSegmentBuilder());
            }
            return SegmentedSequenceTree.create(baseSequence, (ISegmentBuilder<?>) sequenceBuilder.getSegmentBuilder());
        }
        return BasedSequence.NULL;
    }
}
