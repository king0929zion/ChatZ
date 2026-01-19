package com.vladsch.flexmark.util.sequence;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class ReplacedTextMapper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private BasedSequence original;
    private ReplacedTextMapper parent;
    private ArrayList<ReplacedTextRegion> regions;
    private int replacedLength;
    private ArrayList<BasedSequence> replacedSegments;
    private BasedSequence replacedSequence;

    public ReplacedTextMapper(BasedSequence basedSequence) {
        this.regions = new ArrayList<>();
        this.replacedSegments = new ArrayList<>();
        this.replacedLength = 0;
        this.replacedSequence = null;
        this.original = basedSequence;
        this.parent = null;
    }

    private void finalizeMods() {
        if (this.replacedSequence == null) {
            this.replacedSequence = this.replacedSegments.isEmpty() ? BasedSequence.NULL : SegmentedSequence.create(this.original, this.replacedSegments);
        }
    }

    private int parentOriginalOffset(int i6) {
        ReplacedTextMapper replacedTextMapper = this.parent;
        return replacedTextMapper != null ? replacedTextMapper.originalOffset(i6) : i6;
    }

    public void addOriginalText(int i6, int i7) {
        if (isFinalized()) {
            throw new IllegalStateException("Cannot modify finalized ReplacedTextMapper");
        }
        if (i6 < i7) {
            BasedSequence subSequence = this.original.subSequence(i6, i7);
            ArrayList<ReplacedTextRegion> arrayList = this.regions;
            Range sourceRange = subSequence.getSourceRange();
            Range of = Range.of(i6, i7);
            int i8 = this.replacedLength;
            arrayList.add(new ReplacedTextRegion(sourceRange, of, Range.of(i8, subSequence.length() + i8)));
            this.replacedLength = subSequence.length() + this.replacedLength;
            this.replacedSegments.add(subSequence);
        }
    }

    public void addReplacedText(int i6, int i7, BasedSequence basedSequence) {
        if (isFinalized()) {
            throw new IllegalStateException("Cannot modify finalized ReplacedTextMapper");
        }
        ArrayList<ReplacedTextRegion> arrayList = this.regions;
        Range sourceRange = this.original.subSequence(i6, i7).getSourceRange();
        Range of = Range.of(i6, i7);
        int i8 = this.replacedLength;
        arrayList.add(new ReplacedTextRegion(sourceRange, of, Range.of(i8, basedSequence.length() + i8)));
        this.replacedLength = basedSequence.length() + this.replacedLength;
        this.replacedSegments.add(basedSequence);
    }

    public ReplacedTextMapper getParent() {
        return this.parent;
    }

    public ArrayList<ReplacedTextRegion> getRegions() {
        finalizeMods();
        return this.regions;
    }

    public int getReplacedLength() {
        finalizeMods();
        return this.replacedLength;
    }

    public ArrayList<BasedSequence> getReplacedSegments() {
        finalizeMods();
        return this.replacedSegments;
    }

    public BasedSequence getReplacedSequence() {
        finalizeMods();
        return this.replacedSequence;
    }

    public boolean isFinalized() {
        return this.replacedSequence != null;
    }

    public boolean isModified() {
        return this.replacedLength > 0;
    }

    public int originalOffset(int i6) {
        finalizeMods();
        if (this.regions.isEmpty()) {
            return parentOriginalOffset(i6);
        }
        if (i6 == this.replacedLength) {
            return parentOriginalOffset(this.original.length());
        }
        ArrayList<ReplacedTextRegion> arrayList = this.regions;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            ReplacedTextRegion replacedTextRegion = arrayList.get(i7);
            i7++;
            ReplacedTextRegion replacedTextRegion2 = replacedTextRegion;
            if (replacedTextRegion2.containsReplacedIndex(i6)) {
                i6 = (replacedTextRegion2.getOriginalRange().getStart() + i6) - replacedTextRegion2.getReplacedRange().getStart();
                if (i6 > replacedTextRegion2.getOriginalRange().getEnd()) {
                    i6 = replacedTextRegion2.getOriginalRange().getEnd();
                }
            }
        }
        return parentOriginalOffset(i6);
    }

    public void startNestedReplacement(BasedSequence basedSequence) {
        this.parent = new ReplacedTextMapper(this);
        this.original = basedSequence;
        this.regions = new ArrayList<>();
        this.replacedSegments = new ArrayList<>();
        this.replacedLength = 0;
        this.replacedSequence = null;
    }

    private ReplacedTextMapper(ReplacedTextMapper replacedTextMapper) {
        this.regions = new ArrayList<>();
        this.replacedSegments = new ArrayList<>();
        this.replacedLength = 0;
        this.replacedSequence = null;
        this.parent = replacedTextMapper.parent;
        this.original = replacedTextMapper.original;
        this.regions = replacedTextMapper.regions;
        this.replacedSegments = replacedTextMapper.replacedSegments;
        this.replacedLength = replacedTextMapper.replacedLength;
        this.replacedSequence = replacedTextMapper.getReplacedSequence();
    }
}
