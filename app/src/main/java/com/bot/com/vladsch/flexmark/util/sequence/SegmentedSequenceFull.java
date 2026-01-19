package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats;

/* loaded from: classes.dex */
public final class SegmentedSequenceFull extends SegmentedSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int[] baseOffsets;
    private final int baseStartOffset;
    private final boolean nonBaseChars;

    private SegmentedSequenceFull(BasedSequence basedSequence, int i6, int i7, int i8, boolean z5, int[] iArr, int i9) {
        super(basedSequence, i6, i7, i8);
        this.nonBaseChars = z5;
        this.baseOffsets = iArr;
        this.baseStartOffset = i9;
    }

    public static SegmentedSequenceFull create(BasedSequence basedSequence, ISegmentBuilder<?> iSegmentBuilder) {
        SegmentedSequenceStats segmentedSequenceStats;
        BasedSequence baseSequence = basedSequence.getBaseSequence();
        int length = iSegmentBuilder.length();
        int i6 = length + 1;
        int[] iArr = new int[i6];
        int i7 = 0;
        for (Object obj : iSegmentBuilder) {
            if (obj instanceof Range) {
                Range range = (Range) obj;
                if (!range.isEmpty()) {
                    int end = range.getEnd();
                    int start = range.getStart();
                    while (start < end) {
                        iArr[i7] = start;
                        start++;
                        i7++;
                    }
                }
            } else if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                int length2 = charSequence.length();
                int i8 = 0;
                while (i8 < length2) {
                    iArr[i7] = (-charSequence.charAt(i8)) - 1;
                    i8++;
                    i7++;
                }
            } else if (obj != null) {
                throw new IllegalStateException("Invalid part type " + obj.getClass());
            }
        }
        int i9 = iArr[length - 1];
        iArr[length] = i9 < 0 ? i9 - 1 : i9 + 1;
        int startOffset = iSegmentBuilder.getStartOffset();
        int endOffset = iSegmentBuilder.getEndOffset();
        boolean z5 = iSegmentBuilder.getTextLength() > 0;
        if (baseSequence.anyOptions(BasedOptionsHolder.F_COLLECT_SEGMENTED_STATS) && (segmentedSequenceStats = (SegmentedSequenceStats) baseSequence.getOption(BasedOptionsHolder.SEGMENTED_STATS)) != null) {
            segmentedSequenceStats.addStats(iSegmentBuilder.noAnchorsSize(), length, i6 * 4);
        }
        return new SegmentedSequenceFull(baseSequence, startOffset, endOffset, length, z5, iArr, 0);
    }

    @Deprecated
    public static BasedSequence of(BasedSequence basedSequence, Iterable<? extends BasedSequence> iterable) {
        return SegmentedSequence.create(basedSequence, iterable);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder) {
        BasedUtils.generateSegments(iBasedSegmentBuilder, this);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        SequenceUtils.validateIndex(i6, length());
        int i7 = this.baseOffsets[this.baseStartOffset + i6];
        return i7 < 0 ? (char) ((-i7) - 1) : this.baseSeq.charAt(i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int getIndexOffset(int i6) {
        SequenceUtils.validateIndexInclusiveEnd(i6, length());
        int i7 = this.baseOffsets[this.baseStartOffset + i6];
        if (i7 < 0) {
            return -1;
        }
        return i7;
    }

    @Deprecated
    public static BasedSequence of(BasedSequence... basedSequenceArr) {
        return SegmentedSequence.create(basedSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public BasedSequence subSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
        return (i6 == 0 && i7 == this.length) ? this : subSequence(this.baseSeq, this.baseOffsets, this.baseStartOffset + i6, this.nonBaseChars, i7 - i6);
    }

    private SegmentedSequenceFull subSequence(BasedSequence basedSequence, int[] iArr, int i6, boolean z5, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int endOffset;
        int i12;
        boolean z6 = true;
        int length = iArr.length - 1;
        if (z5) {
            int i13 = i6;
            while (true) {
                i8 = 0;
                if (i13 >= length) {
                    i9 = 0;
                    z6 = false;
                    break;
                }
                int i14 = iArr[i13];
                if (i14 < 0) {
                    i13++;
                } else {
                    if (i7 != 0) {
                        int i15 = i6 + i7;
                        while (true) {
                            int i16 = i15 - 1;
                            if (i15 <= i13) {
                                break;
                            }
                            int i17 = iArr[i16];
                            if (i17 >= 0) {
                                i12 = i17 + 1;
                                i8 = 1;
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    i12 = 0;
                    if (i8 == 0) {
                        i12 = i14;
                    }
                    i8 = i12;
                    i9 = i14;
                }
            }
            if (z6) {
                i10 = i8;
                i11 = i9;
            } else {
                endOffset = basedSequence.getEndOffset();
                i11 = endOffset;
                i10 = i11;
            }
        } else {
            if (i6 < length) {
                endOffset = iArr[i6];
            } else {
                endOffset = basedSequence.getEndOffset();
            }
            if (i7 != 0) {
                i11 = endOffset;
                i10 = iArr[(i6 + i7) - 1] + 1;
            }
            i11 = endOffset;
            i10 = i11;
        }
        return new SegmentedSequenceFull(basedSequence, i11, i10, i7, z5, iArr, i6);
    }
}
