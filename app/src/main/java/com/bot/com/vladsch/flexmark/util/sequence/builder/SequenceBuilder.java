package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedOptionsHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.SegmentedSequence;
import j1.AbstractC1135a;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SequenceBuilder implements ISequenceBuilder<SequenceBuilder, BasedSequence> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final BasedSequence altBase;
    private final BasedSequence baseSeq;
    private final HashMap<BasedSequence, Boolean> equivalentBases;
    private BasedSequence resultSeq;
    private final BasedSegmentBuilder segments;

    private SequenceBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer) {
        this(basedSequence, segmentOptimizer, new HashMap());
    }

    public static SequenceBuilder emptyBuilder(BasedSequence basedSequence) {
        return new SequenceBuilder(basedSequence, null);
    }

    public SequenceBuilder addByLength(int i6, int i7) {
        return add(this.baseSeq.subSequence(i6, i7 + i6));
    }

    public SequenceBuilder addByOffsets(int i6, int i7) {
        if (i6 < 0 || i6 > i7 || i7 > this.baseSeq.length()) {
            throw new IllegalArgumentException(AbstractC1135a.i(AbstractC1135a.j(this.baseSeq.length(), "addByOffsets start/end must be a valid range in [0, ", i6, "], got: [", ", "), i7, "]"));
        }
        this.segments.append(Range.of(i6, i7));
        this.resultSeq = null;
        return this;
    }

    public SequenceBuilder addRange(Range range) {
        this.segments.append(range);
        this.resultSeq = null;
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public char charAt(int i6) {
        return toSequence().charAt(i6);
    }

    public BasedSequence getBaseSequence() {
        return this.baseSeq;
    }

    public Range getLastRangeOrNull() {
        BasedSegmentBuilder basedSegmentBuilder = this.segments;
        Object part = basedSegmentBuilder.getPart(basedSegmentBuilder.size());
        if (!(part instanceof Range)) {
            return null;
        }
        Range range = (Range) part;
        if (range.isNotNull()) {
            return range;
        }
        return null;
    }

    public BasedSegmentBuilder getSegmentBuilder() {
        return this.segments;
    }

    public boolean isCommonBaseSequence(BasedSequence basedSequence) {
        if (basedSequence.isNull()) {
            return false;
        }
        BasedSequence baseSequence = basedSequence.getBaseSequence();
        if (baseSequence == this.baseSeq) {
            return true;
        }
        Boolean bool = this.equivalentBases.get(baseSequence);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean equals = this.baseSeq.equals(baseSequence);
        this.equivalentBases.put(baseSequence, Boolean.valueOf(equals));
        return equals;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public int length() {
        return this.segments.length();
    }

    public BasedSequence toSequenceByIndex(BasedSequence basedSequence, CharPredicate charPredicate, CharPredicate charPredicate2) {
        int span;
        if (basedSequence == this.altBase) {
            return toSequence();
        }
        BasedSegmentBuilder basedSegmentBuilder = this.segments;
        SequenceBuilder sequenceBuilder = new SequenceBuilder(basedSequence, basedSegmentBuilder.options, basedSegmentBuilder.optimizer, new HashMap());
        Iterator<Object> it = this.segments.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Range) {
                int i8 = i6 + i7;
                Range range = (Range) next;
                BasedSequence subSequence = basedSequence.subSequence(i8, range.getSpan() + i8);
                int countLeading = charPredicate == null ? 0 : subSequence.countLeading(charPredicate);
                if (countLeading > 0) {
                    i7 += countLeading;
                    int i9 = i6 + i7;
                    subSequence = basedSequence.subSequence(i9, range.getSpan() + i9);
                }
                sequenceBuilder.append((CharSequence) subSequence);
                span = range.getSpan();
            } else if (next instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) next;
                sequenceBuilder.append(charSequence);
                span = charSequence.length();
            } else if (next != null) {
                throw new IllegalStateException("Invalid part type " + next.getClass());
            }
            i6 += span;
        }
        BasedSequence create = SegmentedSequence.create(sequenceBuilder);
        toSequence();
        return create;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = this.segments.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Range) {
                Range range = (Range) next;
                BasedSequence subSequence = this.baseSeq.subSequence(range.getStart(), range.getEnd());
                if (subSequence.isNotEmpty()) {
                    subSequence.appendTo(sb);
                }
            } else if (next instanceof CharSequence) {
                sb.append(next);
            } else if (next != null) {
                throw new IllegalStateException("Invalid part type " + next.getClass());
            }
        }
        return sb.toString();
    }

    public String toStringNoAddedSpaces() {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = this.segments.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Range) {
                Range range = (Range) next;
                sb.append((CharSequence) this.baseSeq.subSequence(range.getStart(), range.getEnd()));
            } else if (next instanceof CharSequence) {
                sb.append(next);
            } else if (next != null) {
                throw new IllegalStateException("Invalid part type " + next.getClass());
            }
        }
        return sb.toString();
    }

    public String toStringWithRanges() {
        return this.segments.toStringWithRangesVisibleWhitespace(this.baseSeq);
    }

    private SequenceBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer, HashMap<BasedSequence, Boolean> hashMap) {
        this.altBase = basedSequence;
        BasedSequence baseSequence = basedSequence.getBaseSequence();
        this.baseSeq = baseSequence;
        this.equivalentBases = hashMap;
        int i6 = ISegmentBuilder.F_DEFAULT;
        i6 = (!baseSequence.anyOptions(BasedOptionsHolder.F_FULL_SEGMENTED_SEQUENCES) || baseSequence.anyOptions(BasedOptionsHolder.F_COLLECT_FIRST256_STATS)) ? i6 | ISegmentBuilder.F_TRACK_FIRST256 : i6;
        i6 = baseSequence.anyOptions(BasedOptionsHolder.F_NO_ANCHORS) ? i6 & (~ISegmentBuilder.F_INCLUDE_ANCHORS) : i6;
        this.segments = segmentOptimizer == null ? BasedSegmentBuilder.emptyBuilder(baseSequence, i6) : BasedSegmentBuilder.emptyBuilder(baseSequence, segmentOptimizer, i6);
    }

    public static SequenceBuilder emptyBuilder(BasedSequence basedSequence, SegmentOptimizer segmentOptimizer) {
        return new SequenceBuilder(basedSequence, segmentOptimizer);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SequenceBuilder getBuilder() {
        BasedSequence basedSequence = this.altBase;
        BasedSegmentBuilder basedSegmentBuilder = this.segments;
        return new SequenceBuilder(basedSequence, basedSegmentBuilder.options, basedSegmentBuilder.optimizer, this.equivalentBases);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public BasedSequence getSingleBasedSequence() {
        Range baseSubSequenceRange = this.segments.getBaseSubSequenceRange();
        if (baseSubSequenceRange == null) {
            return null;
        }
        return this.baseSeq.subSequence(baseSubSequenceRange.getStart(), baseSubSequenceRange.getEnd());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public BasedSequence toSequence() {
        if (this.resultSeq == null) {
            this.resultSeq = SegmentedSequence.create(this);
        }
        return this.resultSeq;
    }

    public String toStringWithRanges(boolean z5) {
        return z5 ? this.segments.toStringWithRangesVisibleWhitespace(this.baseSeq) : this.segments.toStringWithRanges(this.baseSeq);
    }

    public static SequenceBuilder emptyBuilder(BasedSequence basedSequence, int i6) {
        return new SequenceBuilder(basedSequence, i6, null, new HashMap());
    }

    public static SequenceBuilder emptyBuilder(BasedSequence basedSequence, int i6, SegmentOptimizer segmentOptimizer) {
        return new SequenceBuilder(basedSequence, i6, segmentOptimizer, new HashMap());
    }

    public BasedSequence toSequence(BasedSequence basedSequence) {
        return toSequence(basedSequence, null, null);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public SequenceBuilder append(CharSequence charSequence, int i6, int i7) {
        if (charSequence instanceof BasedSequence) {
            BasedSequence basedSequence = (BasedSequence) charSequence;
            if (isCommonBaseSequence(basedSequence)) {
                if (basedSequence.isNotNull()) {
                    if (i6 == 0 && i7 == charSequence.length()) {
                        basedSequence.addSegments(this.segments);
                    } else {
                        basedSequence.subSequence(i6, i7).addSegments(this.segments);
                    }
                    this.resultSeq = null;
                    return this;
                }
                return this;
            }
        }
        if (charSequence != null && i6 < i7) {
            if (i6 == 0 && i7 == charSequence.length()) {
                this.segments.append(charSequence);
            } else {
                this.segments.append(charSequence.subSequence(i6, i7));
            }
            this.resultSeq = null;
        }
        return this;
    }

    public BasedSequence toSequence(BasedSequence basedSequence, CharPredicate charPredicate, CharPredicate charPredicate2) {
        if (basedSequence == this.altBase) {
            return toSequence();
        }
        BasedSegmentBuilder basedSegmentBuilder = this.segments;
        SequenceBuilder sequenceBuilder = new SequenceBuilder(basedSequence, basedSegmentBuilder.options, basedSegmentBuilder.optimizer, new HashMap());
        Iterator<Object> it = this.segments.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Range) {
                Range range = (Range) next;
                BasedSequence subSequence = basedSequence.subSequence(range.getStart() + i6, range.getEnd() + i6);
                int countLeading = charPredicate == null ? 0 : subSequence.countLeading(charPredicate);
                if (countLeading > 0) {
                    i6 += countLeading;
                    subSequence = basedSequence.subSequence(range.getStart() + i6, range.getEnd() + i6);
                }
                sequenceBuilder.append((CharSequence) subSequence);
            } else if (next instanceof CharSequence) {
                sequenceBuilder.append((CharSequence) next);
            } else if (next != null) {
                throw new IllegalStateException("Invalid part type " + next.getClass());
            }
        }
        BasedSequence create = SegmentedSequence.create(sequenceBuilder);
        toSequence();
        return create;
    }

    private SequenceBuilder(BasedSequence basedSequence, int i6, SegmentOptimizer segmentOptimizer, HashMap<BasedSequence, Boolean> hashMap) {
        this.altBase = basedSequence;
        BasedSequence baseSequence = basedSequence.getBaseSequence();
        this.baseSeq = baseSequence;
        this.equivalentBases = hashMap;
        i6 = (!baseSequence.anyOptions(BasedOptionsHolder.F_FULL_SEGMENTED_SEQUENCES) || baseSequence.anyOptions(BasedOptionsHolder.F_COLLECT_FIRST256_STATS)) ? i6 | ISegmentBuilder.F_TRACK_FIRST256 : i6;
        i6 = baseSequence.anyOptions(BasedOptionsHolder.F_NO_ANCHORS) ? i6 & (~ISegmentBuilder.F_INCLUDE_ANCHORS) : i6;
        this.segments = segmentOptimizer == null ? BasedSegmentBuilder.emptyBuilder(baseSequence, i6) : BasedSegmentBuilder.emptyBuilder(baseSequence, segmentOptimizer, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public SequenceBuilder append(char c6) {
        this.segments.append(c6);
        this.resultSeq = null;
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public SequenceBuilder append(char c6, int i6) {
        if (i6 > 0) {
            this.segments.append(c6, i6);
            this.resultSeq = null;
        }
        return this;
    }

    public SequenceBuilder append(int i6, int i7) {
        return addByOffsets(i6, i7);
    }

    public SequenceBuilder append(Range range) {
        return addRange(range);
    }
}
