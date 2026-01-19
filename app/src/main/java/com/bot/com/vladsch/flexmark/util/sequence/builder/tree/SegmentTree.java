package com.vladsch.flexmark.util.sequence.builder.tree;

import com.vladsch.flexmark.util.misc.DelimitedBuilder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.BasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.Seg;
import com.vladsch.flexmark.util.sequence.builder.tree.Segment;

/* loaded from: classes.dex */
public class SegmentTree {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int F_ANCHOR_FLAGS = -536870912;
    public static final int MAX_VALUE = 536870911;
    protected final byte[] segmentBytes;
    protected final int[] treeData;

    /* loaded from: classes.dex */
    public static class SegmentTreeData {
        public final byte[] segmentBytes;
        public final int[] startIndices;
        public final int[] treeData;

        public SegmentTreeData(int[] iArr, byte[] bArr, int[] iArr2) {
            this.treeData = iArr;
            this.segmentBytes = bArr;
            this.startIndices = iArr2;
        }
    }

    public SegmentTree(int[] iArr, byte[] bArr) {
        this.treeData = iArr;
        this.segmentBytes = bArr;
    }

    public static SegmentTree build(Iterable<Seg> iterable, CharSequence charSequence) {
        SegmentTreeData buildTreeData = buildTreeData(iterable, charSequence, true);
        return new SegmentTree(buildTreeData.treeData, buildTreeData.segmentBytes);
    }

    public static SegmentTreeData buildTreeData(Iterable<Seg> iterable, CharSequence charSequence, boolean z5) {
        int end;
        int i6 = 0;
        int i7 = 0;
        for (Seg seg : iterable) {
            Segment.SegType segType = Segment.getSegType(seg, charSequence);
            i7 += Segment.getSegByteLength(segType, seg.getSegStart(), seg.length());
            if (z5) {
                end = segType == Segment.SegType.ANCHOR ? seg.getEnd() : 0;
                i6++;
            } else {
                if (segType != Segment.SegType.BASE && segType != Segment.SegType.ANCHOR) {
                }
                i6++;
            }
        }
        int[] iArr = new int[i6 * 2];
        byte[] bArr = new byte[i7];
        int[] iArr2 = z5 ? null : new int[i6];
        int[] iArr3 = z5 ? null : new int[2];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        for (Seg seg2 : iterable) {
            int addSegBytes = Segment.addSegBytes(bArr, i8, seg2, charSequence);
            Segment.SegType fromTypeMask = Segment.SegType.fromTypeMask(bArr[i8]);
            if (!z5) {
                iArr2[i9] = i10;
                if (i11 > 0 && seg2.getStart() >= 0) {
                    for (int i13 = 0; i13 < i11; i13++) {
                        iArr[iArr3[i13] << 1] = seg2.getStart();
                    }
                    i11 = 0;
                }
                i10 += seg2.length();
                if (fromTypeMask == Segment.SegType.BASE || fromTypeMask == Segment.SegType.ANCHOR) {
                    setTreeData(i9, iArr, seg2.getEnd(), i8, 0);
                    iArr3[i11] = i9;
                    i9++;
                    i11++;
                    i8 = addSegBytes;
                }
            } else if (fromTypeMask == Segment.SegType.ANCHOR) {
                i12 = i8;
            } else {
                i10 += seg2.length();
                setTreeData(i9, iArr, i10, i8, i12 == -1 ? 0 : i8 - i12);
                i9++;
                i12 = -1;
            }
            i8 = addSegBytes;
        }
        if (!z5) {
            for (int i14 = 0; i14 < i11; i14++) {
                iArr[iArr3[i14] << 1] = end;
            }
        }
        return new SegmentTreeData(iArr, bArr, iArr2);
    }

    public static int getAnchorOffset(int i6) {
        return (i6 & F_ANCHOR_FLAGS) >>> 29;
    }

    public static int getByteOffset(int i6) {
        int i7 = i6 & MAX_VALUE;
        if (i7 == 536870911) {
            return -1;
        }
        return i7;
    }

    public static CharSequence getCharSequence(Segment segment, int i6, int i7, int i8, int i9) {
        int i10 = segment.pos;
        return (i10 == i8 && i10 + 1 == i9) ? segment.getCharSequence().subSequence(i6 - segment.getStartIndex(), i7 - segment.getStartIndex()) : i10 == i8 ? segment.getCharSequence().subSequence(i6 - segment.getStartIndex(), segment.length()) : i10 + 1 == i9 ? segment.getCharSequence().subSequence(0, i7 - segment.getStartIndex()) : segment.getCharSequence();
    }

    public static void setTreeData(int i6, int[] iArr, int i7, int i8, int i9) {
        int i10 = i6 << 1;
        iArr[i10] = i7;
        iArr[i10 + 1] = (i9 == 0 ? 0 : i9 << 29) | i8;
    }

    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder, SegmentTreeRange segmentTreeRange) {
        addSegments(iBasedSegmentBuilder, segmentTreeRange.startIndex, segmentTreeRange.endIndex, segmentTreeRange.startOffset, segmentTreeRange.endOffset, segmentTreeRange.startPos, segmentTreeRange.endPos);
    }

    public int aggrLength(int i6) {
        if (i6 < 0) {
            return 0;
        }
        return this.treeData[i6 << 1];
    }

    public int byteOffset(int i6) {
        return getByteOffset(this.treeData[(i6 << 1) + 1]);
    }

    public int byteOffsetData(int i6) {
        return this.treeData[(i6 << 1) + 1];
    }

    public Segment findSegment(int i6, BasedSequence basedSequence, Segment segment) {
        return findSegment(i6, 0, size(), basedSequence, segment);
    }

    public SegmentTreePos findSegmentPos(int i6) {
        return findSegmentPos(i6, this.treeData, 0, size());
    }

    public Segment getPrevAnchor(int i6, BasedSequence basedSequence) {
        return getPrevAnchor(i6, this.treeData, this.segmentBytes, basedSequence);
    }

    public Segment getSegment(int i6, int i7, int i8, BasedSequence basedSequence) {
        return Segment.getSegment(this.segmentBytes, i6, i7, i8, basedSequence);
    }

    public byte[] getSegmentBytes() {
        return this.segmentBytes;
    }

    public SegmentOffsetTree getSegmentOffsetTree(BasedSequence basedSequence) {
        int length = this.segmentBytes.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            Segment segment = Segment.getSegment(this.segmentBytes, i6, i7, 0, basedSequence);
            i6 += segment.getByteLength();
            if (segment.isBase()) {
                i7++;
                i8 = segment.getEndOffset();
            }
        }
        int[] iArr = new int[i7 * 2];
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[2];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 < length) {
            Segment segment2 = Segment.getSegment(this.segmentBytes, i9, i7, i10, basedSequence);
            if (i11 > 0 && segment2.getStartOffset() >= 0) {
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[iArr3[i13] << 1] = segment2.getStartOffset();
                }
                i11 = 0;
            }
            if (segment2.isBase()) {
                setTreeData(i12, iArr, segment2.getEndOffset(), i9, 0);
                iArr3[i11] = i12;
                iArr2[i12] = i10;
                i12++;
                i11++;
            }
            i9 += segment2.getByteLength();
            i10 += segment2.length();
        }
        for (int i14 = 0; i14 < i11; i14++) {
            iArr[iArr3[i14] << 1] = i8;
        }
        return new SegmentOffsetTree(iArr, this.segmentBytes, iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r8.notInSegment(r10) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.util.sequence.builder.tree.SegmentTreeRange getSegmentRange(int r8, int r9, int r10, int r11, com.vladsch.flexmark.util.sequence.BasedSequence r12, com.vladsch.flexmark.util.sequence.builder.tree.Segment r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree.getSegmentRange(int, int, int, int, com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.builder.tree.Segment):com.vladsch.flexmark.util.sequence.builder.tree.SegmentTreeRange");
    }

    public int getTextEndOffset(Segment segment, BasedSequence basedSequence) {
        if (segment.pos + 1 >= size()) {
            return -1;
        }
        Segment segment2 = getSegment(segment.pos + 1, basedSequence);
        if (segment2.isBase()) {
            return segment2.getStartOffset();
        }
        return -1;
    }

    public int getTextStartOffset(Segment segment, BasedSequence basedSequence) {
        int i6;
        Segment prevAnchor = getPrevAnchor(segment.pos, basedSequence);
        if (prevAnchor == null && (i6 = segment.pos) > 0) {
            prevAnchor = getSegment(i6 - 1, basedSequence);
        }
        if (prevAnchor == null || !prevAnchor.isBase()) {
            return -1;
        }
        return prevAnchor.getEndOffset();
    }

    public int[] getTreeData() {
        return this.treeData;
    }

    public boolean hasPreviousAnchor(int i6) {
        return getAnchorOffset(this.treeData[(i6 << 1) + 1]) > 0;
    }

    public int previousAnchorOffset(int i6) {
        int byteOffsetData = byteOffsetData(i6);
        return getByteOffset(byteOffsetData) - getAnchorOffset(byteOffsetData);
    }

    public int size() {
        return this.treeData.length / 2;
    }

    public String toString(BasedSequence basedSequence) {
        DelimitedBuilder delimitedBuilder = new DelimitedBuilder(", ");
        delimitedBuilder.append(getClass().getSimpleName()).append("{aggr: {");
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            delimitedBuilder.append("[").append(aggrLength(i6)).append(", ").append(byteOffset(i6)).append(":");
            if (hasPreviousAnchor(i6)) {
                delimitedBuilder.append(", ").append(previousAnchorOffset(i6)).append(":");
            }
            delimitedBuilder.append("]").mark();
        }
        delimitedBuilder.unmark().append(" }, seg: { ");
        int i7 = 0;
        while (true) {
            byte[] bArr = this.segmentBytes;
            if (i7 < bArr.length) {
                Segment segment = Segment.getSegment(bArr, i7, 0, 0, basedSequence);
                delimitedBuilder.append(i7).append(":").append(segment).mark();
                i7 += segment.getByteLength();
            } else {
                delimitedBuilder.unmark().append(" } }");
                return delimitedBuilder.toString();
            }
        }
    }

    public static int aggrLength(int i6, int[] iArr) {
        if (i6 < 0) {
            return 0;
        }
        return iArr[i6 << 1];
    }

    public static int byteOffset(int i6, int[] iArr) {
        return getByteOffset(byteOffsetData(i6, iArr));
    }

    public static int byteOffsetData(int i6, int[] iArr) {
        return iArr[(i6 << 1) + 1];
    }

    public static Segment getPrevAnchor(int i6, int[] iArr, byte[] bArr, BasedSequence basedSequence) {
        int byteOffsetData = byteOffsetData(i6, iArr);
        int anchorOffset = getAnchorOffset(byteOffsetData);
        if (anchorOffset > 0) {
            return Segment.getSegment(bArr, getByteOffset(byteOffsetData) - anchorOffset, -1, 0, basedSequence);
        }
        return null;
    }

    public static boolean hasPreviousAnchor(int i6, int[] iArr) {
        return getAnchorOffset(iArr[(i6 << 1) + 1]) > 0;
    }

    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        Segment prevAnchor;
        if (i8 != -1) {
            iBasedSegmentBuilder.appendAnchor(i8);
        }
        BasedSequence baseSequence = iBasedSegmentBuilder.getBaseSequence();
        for (int i13 = i10; i13 < i11; i13++) {
            Segment segment = getSegment(i13, baseSequence);
            if (segment.isText() && (prevAnchor = getPrevAnchor(i13, baseSequence)) != null) {
                iBasedSegmentBuilder.appendAnchor(prevAnchor.getStartOffset());
            }
            CharSequence charSequence = getCharSequence(segment, i6, i7, i10, i11);
            if (segment.isText()) {
                iBasedSegmentBuilder.append(charSequence);
                int byteLength = segment.getByteLength() + segment.byteOffset;
                if (byteLength < this.segmentBytes.length && ((i12 = i13 + 1) >= size() || byteLength != byteOffset(i12))) {
                    Segment segment2 = Segment.getSegment(this.segmentBytes, byteLength, 0, 0, baseSequence);
                    if (segment2.isAnchor()) {
                        iBasedSegmentBuilder.appendAnchor(segment2.getStartOffset());
                    }
                }
            } else {
                BasedSequence basedSequence = (BasedSequence) charSequence;
                i8 = Math.max(i8, basedSequence.getEndOffset());
                iBasedSegmentBuilder.append(basedSequence.getStartOffset(), basedSequence.getEndOffset());
            }
        }
        if (i9 != -1) {
            iBasedSegmentBuilder.appendAnchor(Math.max(i8, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.util.sequence.builder.tree.Segment findSegment(int r5, int r6, int r7, com.vladsch.flexmark.util.sequence.BasedSequence r8, com.vladsch.flexmark.util.sequence.builder.tree.Segment r9) {
        /*
            r4 = this;
            r0 = 0
            if (r9 == 0) goto L58
            int r1 = r9.getStartIndex()
            if (r5 < r1) goto L34
            int r6 = r9.getEndIndex()
            int r1 = r9.pos
            int r2 = r1 + 1
            if (r2 < r7) goto L14
            return r0
        L14:
            int r1 = r1 + 1
            int r1 = r4.aggrLength(r1)
            if (r5 >= r1) goto L2f
            byte[] r5 = r4.segmentBytes
            int r7 = r9.pos
            int r7 = r7 + 1
            int r7 = r4.byteOffset(r7)
            int r9 = r9.pos
            int r9 = r9 + 1
            com.vladsch.flexmark.util.sequence.builder.tree.Segment r5 = com.vladsch.flexmark.util.sequence.builder.tree.Segment.getSegment(r5, r7, r9, r6, r8)
            return r5
        L2f:
            int r6 = r9.pos
            int r6 = r6 + 2
            goto L58
        L34:
            int r7 = r9.pos
            if (r7 != r6) goto L39
            return r0
        L39:
            int r7 = r7 + (-2)
            int r7 = r4.aggrLength(r7)
            if (r5 < r7) goto L54
            byte[] r5 = r4.segmentBytes
            int r6 = r9.pos
            int r6 = r6 + (-1)
            int r6 = r4.byteOffset(r6)
            int r9 = r9.pos
            int r9 = r9 + (-1)
            com.vladsch.flexmark.util.sequence.builder.tree.Segment r5 = com.vladsch.flexmark.util.sequence.builder.tree.Segment.getSegment(r5, r6, r9, r7, r8)
            return r5
        L54:
            int r7 = r9.pos
            int r7 = r7 + (-1)
        L58:
            if (r6 < 0) goto L7d
            int r9 = r4.size()
            if (r6 >= r9) goto L7d
            int r9 = r4.aggrLength(r6)
            if (r5 >= r9) goto L7b
            int r7 = r6 + (-1)
            int r7 = r4.aggrLength(r7)
            if (r5 < r7) goto L79
            byte[] r5 = r4.segmentBytes
            int r9 = r4.byteOffset(r6)
            com.vladsch.flexmark.util.sequence.builder.tree.Segment r5 = com.vladsch.flexmark.util.sequence.builder.tree.Segment.getSegment(r5, r9, r6, r7, r8)
            return r5
        L79:
            r7 = r6
            goto L80
        L7b:
            int r6 = r6 + 1
        L7d:
            r3 = r7
            r7 = r6
            r6 = r3
        L80:
            int r9 = r6 + (-1)
            if (r9 < r7) goto L9f
            int r6 = r6 + (-2)
            int r6 = r4.aggrLength(r6)
            if (r5 < r6) goto L9e
            int r7 = r4.aggrLength(r9)
            if (r5 < r7) goto L93
            return r0
        L93:
            byte[] r5 = r4.segmentBytes
            int r7 = r4.byteOffset(r9)
            com.vladsch.flexmark.util.sequence.builder.tree.Segment r5 = com.vladsch.flexmark.util.sequence.builder.tree.Segment.getSegment(r5, r7, r9, r6, r8)
            return r5
        L9e:
            r6 = r9
        L9f:
            com.vladsch.flexmark.util.sequence.builder.tree.SegmentTreePos r5 = r4.findSegmentPos(r5, r7, r6)
            if (r5 == 0) goto Lb6
            byte[] r6 = r4.segmentBytes
            int r7 = r5.pos
            int r7 = r4.byteOffset(r7)
            int r9 = r5.pos
            int r5 = r5.startIndex
            com.vladsch.flexmark.util.sequence.builder.tree.Segment r5 = com.vladsch.flexmark.util.sequence.builder.tree.Segment.getSegment(r6, r7, r9, r5, r8)
            return r5
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree.findSegment(int, int, int, com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.builder.tree.Segment):com.vladsch.flexmark.util.sequence.builder.tree.Segment");
    }

    public SegmentTreePos findSegmentPos(int i6, int i7, int i8) {
        return findSegmentPos(i6, this.treeData, i7, i8);
    }

    public Segment getSegment(int i6, BasedSequence basedSequence) {
        return Segment.getSegment(this.segmentBytes, byteOffset(i6), i6, aggrLength(i6 - 1), basedSequence);
    }

    public static SegmentTree build(BasedSegmentBuilder basedSegmentBuilder) {
        SegmentTreeData buildTreeData = buildTreeData(basedSegmentBuilder.getSegments(), basedSegmentBuilder.getText(), true);
        return new SegmentTree(buildTreeData.treeData, buildTreeData.segmentBytes);
    }

    public static SegmentTreePos findSegmentPos(int i6, int[] iArr, int i7, int i8) {
        int i9 = 0;
        if (i6 == 0 && i7 == 0) {
            return new SegmentTreePos(0, 0, 0);
        }
        while (i7 < i8) {
            int i10 = (i7 + i8) >> 1;
            i9++;
            if (i6 >= aggrLength(i10, iArr)) {
                i7 = i10 + 1;
            } else {
                int aggrLength = aggrLength(i10 - 1, iArr);
                if (i6 >= aggrLength) {
                    return new SegmentTreePos(i10, aggrLength, i9);
                }
                i8 = i10;
            }
        }
        return null;
    }

    public static Segment getSegment(int i6, int[] iArr, byte[] bArr, BasedSequence basedSequence) {
        return Segment.getSegment(bArr, byteOffset(i6, iArr), i6, aggrLength(i6, iArr), basedSequence);
    }

    public static int previousAnchorOffset(int i6, int[] iArr) {
        int byteOffsetData = byteOffsetData(i6, iArr);
        return getByteOffset(byteOffsetData) - getAnchorOffset(byteOffsetData);
    }

    public String toString() {
        return toString(BasedSequence.NULL);
    }

    public static Segment findSegment(int i6, int[] iArr, int i7, int i8, byte[] bArr, BasedSequence basedSequence) {
        SegmentTreePos findSegmentPos = findSegmentPos(i6, iArr, i7, i8);
        if (findSegmentPos != null) {
            return Segment.getSegment(bArr, byteOffset(findSegmentPos.pos, iArr), findSegmentPos.pos, findSegmentPos.startIndex, basedSequence);
        }
        return null;
    }
}
