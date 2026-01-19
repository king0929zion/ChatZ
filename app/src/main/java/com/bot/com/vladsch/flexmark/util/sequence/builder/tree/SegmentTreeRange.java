package com.vladsch.flexmark.util.sequence.builder.tree;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public class SegmentTreeRange {
    public final int endIndex;
    public final int endOffset;
    public final int endPos;
    public final int length;
    public final int startIndex;
    public final int startOffset;
    public final int startPos;

    public SegmentTreeRange(int i6, int i7, int i8, int i9, int i10, int i11) {
        this.startIndex = i6;
        this.endIndex = i7;
        this.startOffset = i8;
        this.endOffset = i9;
        this.startPos = i10;
        this.endPos = i11;
        this.length = i7 - i6;
    }

    public String toString() {
        int i6 = this.startIndex;
        int i7 = this.endIndex;
        int i8 = this.startOffset;
        int i9 = this.endOffset;
        int i10 = this.startPos;
        int i11 = this.endPos;
        int i12 = this.length;
        StringBuilder j3 = AbstractC1135a.j(i6, "SegmentTreeRange{startIndex=", i7, ", endIndex=", ", startOffset=");
        j3.append(i8);
        j3.append(", endOffset=");
        j3.append(i9);
        j3.append(", startPos=");
        j3.append(i10);
        j3.append(", endPos=");
        j3.append(i11);
        j3.append(", length=");
        return AbstractC1135a.i(j3, i12, "}");
    }
}
