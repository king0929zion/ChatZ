package com.vladsch.flexmark.util.sequence.builder;

import B3.e;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.PositionAnchor;
import com.vladsch.flexmark.util.sequence.Range;

/* loaded from: classes.dex */
public class BasedSegmentBuilder extends SegmentBuilderBase<BasedSegmentBuilder> implements IBasedSegmentBuilder<BasedSegmentBuilder> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final BasedSequence baseSeq;
    final SegmentOptimizer optimizer;

    public BasedSegmentBuilder(BasedSequence basedSequence) {
        this(basedSequence, new CharRecoveryOptimizer(PositionAnchor.CURRENT));
    }

    public static BasedSegmentBuilder emptyBuilder(BasedSequence basedSequence) {
        return new BasedSegmentBuilder(basedSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder
    public BasedSequence getBaseSequence() {
        return this.baseSeq;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.SegmentBuilderBase
    public Object[] handleOverlap(Object[] objArr) {
        Range range = (Range) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        Range range2 = (Range) objArr[2];
        Range range3 = Range.NULL;
        if (range2.getEnd() > range.getStart()) {
            if (range2.getStart() <= range.getStart()) {
                Range of = Range.of(range2.getStart(), Math.min(range2.getEnd(), range.getEnd()));
                if (range.getEnd() < range2.getEnd()) {
                    range3 = Range.of(range.getEnd(), range2.getEnd());
                }
                range2 = of;
            } else if (range2.getEnd() > range.getEnd()) {
                Range withEnd = range2.withEnd(range.getEnd());
                Range withStart = range2.withStart(range.getEnd());
                range2 = withEnd;
                range3 = withStart;
            }
        }
        range2.getSpan();
        if (charSequence.length() == 0) {
            objArr[1] = this.baseSeq.subSequence(range2.getStart(), range2.getEnd()).toString();
        } else {
            objArr[1] = e.n(charSequence.toString(), this.baseSeq.subSequence(range2.getStart(), range2.getEnd()).toString());
        }
        objArr[2] = range3;
        return objArr;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.SegmentBuilderBase
    public Object[] optimizeText(Object[] objArr) {
        return this.optimizer.apply((CharSequence) this.baseSeq, objArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder
    public String toStringChars() {
        return super.toString(this.baseSeq);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder
    public String toStringWithRanges() {
        return super.toStringWithRanges(this.baseSeq);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder
    public String toStringWithRangesVisibleWhitespace() {
        return super.toStringWithRangesVisibleWhitespace(this.baseSeq);
    }

    public BasedSegmentBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer) {
        this.baseSeq = basedSequence.getBaseSequence();
        this.optimizer = segmentOptimizer;
    }

    public static BasedSegmentBuilder emptyBuilder(BasedSequence basedSequence, int i6) {
        return new BasedSegmentBuilder(basedSequence, i6);
    }

    public static BasedSegmentBuilder emptyBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer) {
        return new BasedSegmentBuilder(basedSequence, segmentOptimizer);
    }

    public static BasedSegmentBuilder emptyBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer, int i6) {
        return new BasedSegmentBuilder(basedSequence, segmentOptimizer, i6);
    }

    public BasedSegmentBuilder(BasedSequence basedSequence, int i6) {
        this(basedSequence, new CharRecoveryOptimizer(PositionAnchor.CURRENT), i6);
    }

    public BasedSegmentBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer, int i6) {
        super(i6);
        this.baseSeq = basedSequence.getBaseSequence();
        this.optimizer = segmentOptimizer;
    }
}
