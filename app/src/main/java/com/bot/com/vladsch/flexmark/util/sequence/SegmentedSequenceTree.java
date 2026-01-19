package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats;
import com.vladsch.flexmark.util.sequence.builder.tree.Segment;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTreeRange;

/* loaded from: classes.dex */
public final class SegmentedSequenceTree extends SegmentedSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ThreadLocal<Cache> cache;
    private final int endPos;
    private final SegmentTree segmentTree;
    private final int startIndex;
    private final int startPos;

    /* loaded from: classes.dex */
    public static class Cache {
        final CharSequence chars;
        final int indexDelta;
        final Segment segment;

        public Cache(Segment segment, CharSequence charSequence, int i6) {
            this.segment = segment;
            this.chars = charSequence;
            this.indexDelta = i6 - segment.getStartIndex();
        }

        public char charAt(int i6) {
            return this.chars.charAt(i6 + this.indexDelta);
        }

        public int charIndex(int i6) {
            return i6 + this.indexDelta;
        }
    }

    private SegmentedSequenceTree(BasedSequence basedSequence, int i6, int i7, int i8, SegmentTree segmentTree) {
        super(basedSequence, i6, i7, i8);
        this.cache = new ThreadLocal<>();
        this.segmentTree = segmentTree;
        this.startIndex = 0;
        this.startPos = 0;
        this.endPos = segmentTree.size();
    }

    public static SegmentedSequenceTree create(BasedSequence basedSequence, ISegmentBuilder<?> iSegmentBuilder) {
        SegmentedSequenceStats segmentedSequenceStats;
        SegmentTree build = SegmentTree.build(iSegmentBuilder.getSegments(), iSegmentBuilder.getText());
        if (basedSequence.anyOptions(BasedOptionsHolder.F_COLLECT_SEGMENTED_STATS) && (segmentedSequenceStats = (SegmentedSequenceStats) basedSequence.getOption(BasedOptionsHolder.SEGMENTED_STATS)) != null) {
            segmentedSequenceStats.addStats(iSegmentBuilder.noAnchorsSize(), iSegmentBuilder.length(), (build.getTreeData().length * 4) + build.getSegmentBytes().length);
        }
        return new SegmentedSequenceTree(basedSequence.getBaseSequence(), iSegmentBuilder.getStartOffset(), iSegmentBuilder.getEndOffset(), iSegmentBuilder.length(), build);
    }

    private Cache getCache(int i6) {
        Cache cache = this.cache.get();
        if (cache != null && !cache.segment.notInSegment(this.startIndex + i6)) {
            return cache;
        }
        Segment findSegment = this.segmentTree.findSegment(i6 + this.startIndex, this.startPos, this.endPos, this.baseSeq, cache == null ? null : cache.segment);
        Cache cache2 = new Cache(findSegment, findSegment.getCharSequence(), this.startIndex);
        this.cache.set(cache2);
        return cache2;
    }

    private Segment getCachedSegment() {
        Cache cache = this.cache.get();
        if (cache == null) {
            return null;
        }
        return cache.segment;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder) {
        SegmentTree segmentTree = this.segmentTree;
        int i6 = this.startIndex;
        segmentTree.addSegments(iBasedSegmentBuilder, i6, i6 + this.length, this.startOffset, this.endOffset, this.startPos, this.endPos);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        SequenceUtils.validateIndex(i6, length());
        return getCache(i6).charAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getIndexOffset(int i6) {
        if (i6 == this.length) {
            Cache cache = getCache(i6 - 1);
            CharSequence charSequence = cache.chars;
            if (charSequence instanceof BasedSequence) {
                return ((BasedSequence) charSequence).getIndexOffset(cache.charIndex(i6));
            }
            return -1;
        }
        SequenceUtils.validateIndexInclusiveEnd(i6, length());
        Cache cache2 = getCache(i6);
        CharSequence charSequence2 = cache2.chars;
        if (charSequence2 instanceof BasedSequence) {
            return ((BasedSequence) charSequence2).getIndexOffset(cache2.charIndex(i6));
        }
        return -1;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public SegmentTree getSegmentTree() {
        return this.segmentTree;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public BasedSequence subSequence(int i6, int i7) {
        if (i6 == 0 && i7 == this.length) {
            return this;
        }
        SequenceUtils.validateStartEnd(i6, i7, length());
        SegmentTree segmentTree = this.segmentTree;
        int i8 = this.startIndex;
        return new SegmentedSequenceTree(this.baseSeq, this.segmentTree, segmentTree.getSegmentRange(i6 + i8, i7 + i8, this.startPos, this.endPos, this.baseSeq, getCachedSegment()));
    }

    private SegmentedSequenceTree(BasedSequence basedSequence, SegmentTree segmentTree, SegmentTreeRange segmentTreeRange) {
        super(basedSequence, segmentTreeRange.startOffset, segmentTreeRange.endOffset, segmentTreeRange.length);
        this.cache = new ThreadLocal<>();
        this.segmentTree = segmentTree;
        this.startIndex = segmentTreeRange.startIndex;
        this.startPos = segmentTreeRange.startPos;
        this.endPos = segmentTreeRange.endPos;
    }
}
