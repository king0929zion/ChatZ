package com.vladsch.flexmark.util.sequence.builder.tree;

import B3.e;

/* loaded from: classes.dex */
public class OffsetInfo {
    public final int endIndex;
    public final boolean isEndOffset;
    public final int offset;
    public final int pos;
    public final int startIndex;

    public OffsetInfo(int i6, int i7, boolean z5, int i8) {
        this(i6, i7, z5, i8, i8);
    }

    public String toString() {
        String i6;
        int i7 = this.pos;
        if (this.isEndOffset) {
            i6 = e.l("[", this.offset, ")");
        } else {
            int i8 = this.offset;
            i6 = e.i(i8, "[", i8 + 1, ", ", ")");
        }
        return "OffsetInfo{ p=" + i7 + ", o=" + i6 + ", i=[" + this.startIndex + ", " + this.endIndex + ") }";
    }

    public OffsetInfo(int i6, int i7, boolean z5, int i8, int i9) {
        this.pos = i6;
        this.offset = i7;
        this.isEndOffset = z5;
        this.startIndex = i8;
        this.endIndex = i9;
    }
}
