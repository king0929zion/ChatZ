package com.vladsch.flexmark.util.sequence.builder.tree;

import com.vladsch.flexmark.util.misc.DelimitedBuilder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.BasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.Seg;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree;

/* loaded from: classes.dex */
public class SegmentOffsetTree extends SegmentTree {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final int[] startIndices;

    public SegmentOffsetTree(int[] iArr, byte[] bArr, int[] iArr2) {
        super(iArr, bArr);
        this.startIndices = iArr2;
    }

    public static SegmentOffsetTree build(Iterable<Seg> iterable, CharSequence charSequence) {
        SegmentTree.SegmentTreeData buildTreeData = SegmentTree.buildTreeData(iterable, charSequence, false);
        return new SegmentOffsetTree(buildTreeData.treeData, buildTreeData.segmentBytes, buildTreeData.startIndices);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder, SegmentTreeRange segmentTreeRange) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public int aggrLength(int i6) {
        return super.aggrLength(i6);
    }

    public int endOffset(int i6) {
        return super.aggrLength(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public Segment findSegment(int i6, BasedSequence basedSequence, Segment segment) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    public Segment findSegmentByOffset(int i6, BasedSequence basedSequence, Segment segment) {
        SegmentTreePos findSegmentPos = super.findSegmentPos(i6, 0, size());
        if (findSegmentPos == null) {
            return null;
        }
        byte[] bArr = this.segmentBytes;
        int byteOffset = byteOffset(findSegmentPos.pos);
        int i7 = findSegmentPos.pos;
        return Segment.getSegment(bArr, byteOffset, i7, this.startIndices[i7], basedSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public SegmentTreePos findSegmentPos(int i6) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    public SegmentTreePos findSegmentPosByOffset(int i6) {
        return SegmentTree.findSegmentPos(i6, this.treeData, 0, size());
    }

    public Segment getNextText(Segment segment, BasedSequence basedSequence) {
        if (segment.getByteLength() + segment.getByteOffset() >= this.segmentBytes.length) {
            return null;
        }
        Segment segment2 = getSegment(segment.getByteLength() + segment.getByteOffset(), -1, segment.getEndIndex(), basedSequence);
        if (segment2.isText()) {
            return segment2;
        }
        return null;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public Segment getPrevAnchor(int i6, BasedSequence basedSequence) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    public Segment getPreviousText(Segment segment, BasedSequence basedSequence) {
        if (segment.getPos() != 0) {
            return getNextText(getSegment(segment.getPos() - 1, basedSequence), basedSequence);
        }
        if (segment.getStartIndex() <= 0) {
            return null;
        }
        Segment segment2 = getSegment(0, -1, 0, basedSequence);
        if (segment2.isText()) {
            return segment2;
        }
        return null;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    public Segment getSegment(int i6, BasedSequence basedSequence) {
        return Segment.getSegment(this.segmentBytes, byteOffset(i6), i6, this.startIndices[i6], basedSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public SegmentTreeRange getSegmentRange(int i6, int i7, int i8, int i9, BasedSequence basedSequence, Segment segment) {
        return super.getSegmentRange(i6, i7, i8, i9, basedSequence, segment);
    }

    public int getStartIndex(int i6) {
        if (i6 < 0) {
            return 0;
        }
        int[] iArr = this.startIndices;
        return i6 >= iArr.length ? iArr[iArr.length - 1] : iArr[i6];
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public boolean hasPreviousAnchor(int i6) {
        return false;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public int previousAnchorOffset(int i6) {
        return 0;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    public String toString(BasedSequence basedSequence) {
        DelimitedBuilder delimitedBuilder = new DelimitedBuilder(", ");
        delimitedBuilder.append(getClass().getSimpleName()).append("{aggr: {");
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            delimitedBuilder.append("[").append(aggrLength(i6)).append(", ").append(byteOffset(i6)).append(":");
            delimitedBuilder.append(", :").append(this.startIndices[i6]);
            delimitedBuilder.append("]").mark();
        }
        delimitedBuilder.unmark().append(" }, seg: { ");
        int i7 = 0;
        while (true) {
            byte[] bArr = this.segmentBytes;
            if (i7 >= bArr.length) {
                delimitedBuilder.unmark().append(" } }");
                return delimitedBuilder.toString();
            }
            Segment segment = Segment.getSegment(bArr, i7, 0, 0, basedSequence);
            delimitedBuilder.append(i7).append(":").append(segment).mark();
            i7 += segment.getByteLength();
        }
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder, int i6, int i7, int i8, int i9, int i10, int i11) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public Segment findSegment(int i6, int i7, int i8, BasedSequence basedSequence, Segment segment) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree
    @Deprecated
    public SegmentTreePos findSegmentPos(int i6, int i7, int i8) {
        throw new IllegalStateException("Method in SegmentOffsetTree should not be used");
    }

    public static SegmentOffsetTree build(BasedSegmentBuilder basedSegmentBuilder) {
        SegmentTree.SegmentTreeData buildTreeData = SegmentTree.buildTreeData(basedSegmentBuilder.getSegments(), basedSegmentBuilder.getText(), true);
        return new SegmentTree(buildTreeData.treeData, buildTreeData.segmentBytes).getSegmentOffsetTree(basedSegmentBuilder.getBaseSequence());
    }

    public static SegmentOffsetTree build(BasedSequence basedSequence) {
        return basedSequence.getSegmentTree().getSegmentOffsetTree(basedSequence);
    }
}
