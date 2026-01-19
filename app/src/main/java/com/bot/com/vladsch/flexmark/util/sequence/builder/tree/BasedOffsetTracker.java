package com.vladsch.flexmark.util.sequence.builder.tree;

import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class BasedOffsetTracker {
    private Segment lastSegment;
    protected final SegmentOffsetTree segmentOffsetTree;
    protected final BasedSequence sequence;

    public BasedOffsetTracker(BasedSequence basedSequence, SegmentTree segmentTree) {
        this.sequence = basedSequence;
        this.segmentOffsetTree = segmentTree.getSegmentOffsetTree(basedSequence.getBaseSequence());
    }

    public static BasedOffsetTracker create(BasedSequence basedSequence) {
        return new BasedOffsetTracker(basedSequence, basedSequence.getSegmentTree());
    }

    public OffsetInfo getOffsetInfo(int i6, boolean z5) {
        int endIndex;
        int i7;
        int startIndex;
        int i8;
        int i9 = z5 ? i6 : i6 + 1;
        if (i9 <= this.sequence.getStartOffset()) {
            return new OffsetInfo(-1, i6, true, 0);
        }
        if (i6 >= this.sequence.getEndOffset()) {
            return new OffsetInfo(this.segmentOffsetTree.size(), i6, true, this.sequence.length());
        }
        Segment findSegmentByOffset = this.segmentOffsetTree.findSegmentByOffset(i6, this.sequence.getBaseSequence(), this.lastSegment);
        if (findSegmentByOffset == null) {
            if (i6 < this.segmentOffsetTree.getSegment(0, this.sequence).getStartOffset()) {
                return new OffsetInfo(-1, i6, true, 0);
            }
            SegmentOffsetTree segmentOffsetTree = this.segmentOffsetTree;
            if (i6 >= segmentOffsetTree.getSegment(segmentOffsetTree.size() - 1, this.sequence).getEndOffset()) {
                return new OffsetInfo(this.segmentOffsetTree.size(), i6, true, this.sequence.length());
            }
            throw new IllegalStateException("Unexpected");
        }
        this.lastSegment = findSegmentByOffset;
        if (i9 > findSegmentByOffset.getStartOffset() && i6 < findSegmentByOffset.getEndOffset()) {
            return new OffsetInfo(findSegmentByOffset.getPos(), i6, z5, (findSegmentByOffset.getStartIndex() + i6) - findSegmentByOffset.getStartOffset(), (findSegmentByOffset.getStartIndex() + i9) - findSegmentByOffset.getStartOffset());
        }
        if (i9 <= findSegmentByOffset.getStartOffset()) {
            Segment previousText = this.segmentOffsetTree.getPreviousText(findSegmentByOffset, this.sequence);
            if (previousText != null) {
                int startIndex2 = previousText.getStartIndex();
                i8 = previousText.getEndIndex();
                startIndex = startIndex2;
            } else {
                startIndex = findSegmentByOffset.getStartIndex();
                i8 = startIndex;
            }
            return new OffsetInfo(findSegmentByOffset.getPos() - 1, i6, true, startIndex, i8);
        }
        if (i6 < findSegmentByOffset.getEndOffset()) {
            throw new IllegalStateException(String.format("Unexpected offset: [%d, %d), seg: %s, not inside nor at start nor at end", Integer.valueOf(i6), Integer.valueOf(i9), findSegmentByOffset.toString()));
        }
        Segment nextText = this.segmentOffsetTree.getNextText(findSegmentByOffset, this.sequence);
        if (nextText != null) {
            int startIndex3 = nextText.getStartIndex();
            i7 = nextText.getEndIndex();
            endIndex = startIndex3;
        } else {
            endIndex = findSegmentByOffset.getEndIndex();
            i7 = endIndex;
        }
        return new OffsetInfo(findSegmentByOffset.getPos() + 1, i6, true, endIndex, i7);
    }

    public SegmentOffsetTree getSegmentOffsetTree() {
        return this.segmentOffsetTree;
    }

    public BasedSequence getSequence() {
        return this.sequence;
    }

    public int size() {
        return this.segmentOffsetTree.size();
    }

    public String toString() {
        return "BasedOffsetTracker{tree=" + this.segmentOffsetTree + "}";
    }

    public static BasedOffsetTracker create(BasedSequence basedSequence, SegmentOffsetTree segmentOffsetTree) {
        return new BasedOffsetTracker(basedSequence, segmentOffsetTree);
    }

    public BasedOffsetTracker(BasedSequence basedSequence, SegmentOffsetTree segmentOffsetTree) {
        this.sequence = basedSequence;
        this.segmentOffsetTree = segmentOffsetTree;
    }
}
