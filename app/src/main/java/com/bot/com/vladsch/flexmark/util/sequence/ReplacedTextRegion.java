package com.vladsch.flexmark.util.sequence;

/* loaded from: classes.dex */
public class ReplacedTextRegion {
    private final Range base;
    private final Range original;
    private final Range replaced;

    public ReplacedTextRegion(Range range, Range range2, Range range3) {
        this.base = range;
        this.original = range2;
        this.replaced = range3;
    }

    public boolean containsBaseIndex(int i6) {
        return this.base.contains(i6);
    }

    public boolean containsOriginalIndex(int i6) {
        return this.original.contains(i6);
    }

    public boolean containsReplacedIndex(int i6) {
        return this.replaced.contains(i6);
    }

    public Range getBaseRange() {
        return this.base;
    }

    public Range getOriginalRange() {
        return this.original;
    }

    public Range getReplacedRange() {
        return this.replaced;
    }
}
