package com.vladsch.flexmark.util.sequence.builder.tree;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class SegmentTreePos {
    public final int iterations;
    public final int pos;
    public final int startIndex;

    public SegmentTreePos(int i6, int i7, int i8) {
        this.pos = i6;
        this.startIndex = i7;
        this.iterations = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentTreePos)) {
            return false;
        }
        SegmentTreePos segmentTreePos = (SegmentTreePos) obj;
        return this.pos == segmentTreePos.pos && this.startIndex == segmentTreePos.startIndex;
    }

    public int hashCode() {
        return (this.pos * 31) + this.startIndex;
    }

    public String toString() {
        int i6 = this.pos;
        int i7 = this.startIndex;
        return AbstractC1135a.i(AbstractC1135a.j(i6, "{", i7, ", s: ", ", i: "), this.iterations, "}");
    }
}
