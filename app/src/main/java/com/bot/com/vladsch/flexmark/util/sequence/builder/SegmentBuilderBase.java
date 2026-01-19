package com.vladsch.flexmark.util.sequence.builder;

import B3.e;
import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.misc.DelimitedBuilder;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.builder.SegmentBuilderBase;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;

/* loaded from: classes.dex */
public class SegmentBuilderBase<S extends SegmentBuilderBase<S>> implements ISegmentBuilder<S> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int[] EMPTY_PARTS = new int[0];
    public static final int MIN_PART_CAPACITY = 8;
    protected int anchorsSize;
    protected int endOffset;
    protected int immutableOffset;
    protected int length;
    protected final int options;
    protected int[] parts;
    protected int partsSize;
    protected int startOffset;
    protected final SegmentStats stats;
    protected final StringBuilder text;
    protected final SegmentStats textStats;

    /* loaded from: classes.dex */
    public static class PartsIterator implements Iterator<Object> {
        final SegmentBuilderBase<?> builder;
        int nextIndex;

        public PartsIterator(SegmentBuilderBase<?> segmentBuilderBase) {
            this.builder = segmentBuilderBase;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextIndex < this.builder.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            SegmentBuilderBase<?> segmentBuilderBase = this.builder;
            int i6 = this.nextIndex;
            this.nextIndex = i6 + 1;
            return segmentBuilderBase.getPart(i6);
        }
    }

    /* loaded from: classes.dex */
    public static class SegIterable implements Iterable<Seg> {
        final SegmentBuilderBase<?> builder;

        public SegIterable(SegmentBuilderBase<?> segmentBuilderBase) {
            this.builder = segmentBuilderBase;
        }

        @Override // java.lang.Iterable
        public Iterator<Seg> iterator() {
            return new SegIterator(this.builder);
        }
    }

    /* loaded from: classes.dex */
    public static class SegIterator implements Iterator<Seg> {
        final SegmentBuilderBase<?> builder;
        int nextIndex;

        public SegIterator(SegmentBuilderBase<?> segmentBuilderBase) {
            this.builder = segmentBuilderBase;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextIndex < this.builder.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Seg next() {
            SegmentBuilderBase<?> segmentBuilderBase = this.builder;
            int i6 = this.nextIndex;
            this.nextIndex = i6 + 1;
            return segmentBuilderBase.getSegPart(i6);
        }
    }

    public SegmentBuilderBase() {
        this(ISegmentBuilder.F_INCLUDE_ANCHORS);
    }

    private void addSeg(int i6, int i7) {
        ensureCapacity(this.partsSize);
        int i8 = this.partsSize;
        int i9 = i8 * 2;
        int[] iArr = this.parts;
        iArr[i9] = i6;
        iArr[i9 + 1] = i7;
        this.partsSize = i8 + 1;
        if (i6 == i7) {
            this.anchorsSize++;
        }
    }

    private void addText(CharSequence charSequence) {
        this.length = charSequence.length() + this.length;
        this.text.append(charSequence);
        this.stats.addText(charSequence);
        this.textStats.addText(charSequence);
    }

    private void commitText() {
        addSeg(Seg.getTextStart(this.immutableOffset, this.textStats.isTextFirst256()), Seg.getTextEnd(this.text.length(), this.textStats.isRepeatedText()));
        this.immutableOffset = this.text.length();
        this.stats.commitText();
        this.textStats.clear();
    }

    private int computeLength() {
        int i6 = this.partsSize;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            i7 += getSeg(i8).length();
        }
        return haveDanglingText() ? (this.text.length() - this.immutableOffset) + i7 : i7;
    }

    private static int[] ensureCapacity(int[] iArr, int i6) {
        int length = iArr.length / 2;
        return length <= i6 ? Arrays.copyOf(iArr, Math.max(8, Math.max((length + length) >> 1, i6)) * 2) : iArr;
    }

    private Seg getSeg(int i6) {
        int i7 = i6 * 2;
        int i8 = i7 + 1;
        int[] iArr = this.parts;
        return i8 >= iArr.length ? Seg.NULL : Seg.segOf(iArr[i7], iArr[i8]);
    }

    private Seg getSegOrNull(int i6) {
        int i7 = i6 * 2;
        int i8 = i7 + 1;
        int[] iArr = this.parts;
        if (i8 >= iArr.length) {
            return null;
        }
        return Seg.segOf(iArr[i7], iArr[i8]);
    }

    private Seg lastSegOrNull() {
        int i6 = this.partsSize;
        if (i6 == 0) {
            return null;
        }
        return getSegOrNull(i6 - 1);
    }

    private void processParts(int i6, int i7, boolean z5, boolean z6, Function<Object[], Object[]> function) {
        StringBuilder sb = this.text;
        CharSequence subSequence = sb.subSequence(this.immutableOffset, sb.length());
        Seg lastSegOrNull = lastSegOrNull();
        Range range = (lastSegOrNull == null || !lastSegOrNull.isBase()) ? Range.NULL : lastSegOrNull.getRange();
        if (!isIncludeAnchors() && haveOffsets() && (range.isNull() || range.getEnd() < this.endOffset)) {
            range = Range.emptyOf(this.endOffset);
        }
        if (!haveOffsets()) {
            this.startOffset = i6;
        }
        if (!z5) {
            this.endOffset = Math.max(this.endOffset, i7);
        }
        Object[] objArr = {range, subSequence, z6 ? Range.NULL : Range.of(i6, i7)};
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] apply = function.apply(objArr);
        if (!Arrays.equals(apply, objArr2)) {
            this.textStats.commitText();
            this.stats.commitText();
            this.stats.remove(this.textStats);
            this.textStats.clear();
            this.length -= subSequence.length();
            StringBuilder sb2 = this.text;
            sb2.delete(this.immutableOffset, sb2.length());
            if (lastSegOrNull != null && lastSegOrNull.isBase()) {
                this.length -= lastSegOrNull.length();
                this.partsSize--;
                if (lastSegOrNull.length() == 0) {
                    this.anchorsSize--;
                }
            }
            int length = apply.length;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = apply[i10];
                if (obj instanceof CharSequence) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() > 0) {
                        addText(charSequence);
                    }
                } else {
                    if (obj instanceof Range) {
                        Range range2 = (Range) obj;
                        if (range2.isNotNull()) {
                            int start = range2.getStart();
                            int end = range2.getEnd();
                            if (i9 == Integer.MAX_VALUE) {
                                i9 = start;
                            }
                            if (start < i8) {
                                throw new IllegalStateException(String.format("Accumulated range [%d, %d) overlaps Transformed Range[%d]: [%d, %d)", Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(start), Integer.valueOf(end)));
                            }
                            i8 = Math.max(i8, end);
                            boolean haveDanglingText = haveDanglingText();
                            if (haveDanglingText && z5) {
                                processParts(start, end, false, false, new a(this, 0));
                            } else {
                                this.startOffset = Math.min(this.startOffset, start);
                                this.endOffset = Math.max(this.endOffset, end);
                                if (start != end || isIncludeAnchors()) {
                                    if (haveDanglingText) {
                                        commitText();
                                    }
                                    this.length = (end - start) + this.length;
                                    addSeg(start, end);
                                }
                            }
                        }
                    } else if (obj != null) {
                        throw new IllegalStateException("Invalid optimized part type " + obj.getClass());
                    }
                }
            }
        } else if (i7 > i6 || isIncludeAnchors()) {
            if (subSequence.length() > 0) {
                commitText();
            }
            this.length = (i7 - i6) + this.length;
            addSeg(i6, i7);
        }
    }

    private void setSegEnd(int i6, int i7) {
        int i8 = i6 * 2;
        int[] iArr = this.parts;
        int i9 = iArr[i8];
        if (i9 == i7) {
            if (i9 != iArr[i8 + 1]) {
                this.anchorsSize++;
            }
        } else if (i9 == iArr[i8 + 1]) {
            this.anchorsSize--;
        }
        iArr[i8 + 1] = i7;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public Range getBaseSubSequenceRange() {
        if (this.partsSize != 1 || haveDanglingText()) {
            return null;
        }
        Seg seg = getSeg(this.partsSize - 1);
        if (seg.length() != 0 && this.anchorsSize == 1) {
            seg = getSeg(this.partsSize - 2);
        }
        if (seg.isBase() && seg.getStart() == this.startOffset && seg.getEnd() == this.endOffset) {
            return seg.getRange();
        }
        return null;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getEndOffset() {
        int i6 = this.endOffset;
        if (i6 >= this.startOffset) {
            return i6;
        }
        return -1;
    }

    public int getEndOffsetIfNeeded() {
        int endOffset = getEndOffset();
        Seg segOrNull = getSegOrNull(this.partsSize - 1);
        if (endOffset == -1 || segOrNull == null || !segOrNull.isBase() || endOffset == segOrNull.getEnd()) {
            return -1;
        }
        return endOffset;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getOptions() {
        return this.options;
    }

    public Object getPart(int i6) {
        if (i6 == this.partsSize && haveDanglingText()) {
            StringBuilder sb = this.text;
            return sb.subSequence(this.immutableOffset, sb.length());
        }
        int i7 = i6 * 2;
        int i8 = i7 + 1;
        int[] iArr = this.parts;
        Seg segOf = i8 >= iArr.length ? Seg.NULL : Seg.segOf(iArr[i7], iArr[i8]);
        return segOf.isBase() ? segOf.getRange() : segOf.isText() ? this.text.subSequence(segOf.getTextStart(), segOf.getTextEnd()) : Range.NULL;
    }

    public Seg getSegPart(int i6) {
        if (i6 == this.partsSize && haveDanglingText()) {
            return Seg.textOf(this.immutableOffset, this.text.length(), this.textStats.isTextFirst256(), this.textStats.isRepeatedText());
        }
        int i7 = i6 * 2;
        int i8 = i7 + 1;
        int[] iArr = this.parts;
        return i8 >= iArr.length ? Seg.NULL : Seg.segOf(iArr[i7], iArr[i8]);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public Iterable<Seg> getSegments() {
        return new SegIterable(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getSpan() {
        int i6 = this.startOffset;
        int i7 = this.endOffset;
        if (i6 > i7) {
            return -1;
        }
        return i7 - i6;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getStartOffset() {
        int i6 = this.startOffset;
        if (i6 <= this.endOffset) {
            return i6;
        }
        return -1;
    }

    public int getStartOffsetIfNeeded() {
        int startOffset = getStartOffset();
        Seg segOrNull = getSegOrNull(0);
        if (startOffset == -1 || segOrNull == null || !segOrNull.isBase() || startOffset == segOrNull.getStart()) {
            return -1;
        }
        return startOffset;
    }

    public SegmentStats getStats() {
        return this.stats;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public CharSequence getText() {
        return this.text;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getTextFirst256Length() {
        return this.stats.getTextFirst256Length();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getTextFirst256Segments() {
        return this.stats.getTextFirst256Segments();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getTextLength() {
        return this.stats.getTextLength();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getTextSegments() {
        return this.stats.getTextSegments();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getTextSpaceLength() {
        return this.stats.getTextSpaceLength();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int getTextSpaceSegments() {
        return this.stats.getTextSpaceSegments();
    }

    public Object[] handleOverlap(Object[] objArr) {
        Range range = (Range) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        Range range2 = (Range) objArr[2];
        if (range.getEnd() >= range2.getEnd()) {
            objArr[2] = Range.NULL;
            return objArr;
        }
        if (charSequence.length() > 0) {
            objArr[2] = Range.of(range.getEnd(), range2.getEnd());
            return objArr;
        }
        objArr[0] = range.withEnd(range2.getEnd());
        objArr[2] = Range.NULL;
        return objArr;
    }

    public boolean haveDanglingText() {
        return this.text.length() > this.immutableOffset;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public boolean haveOffsets() {
        return this.startOffset <= this.endOffset;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public boolean isBaseSubSequenceRange() {
        return getBaseSubSequenceRange() != null;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public boolean isIncludeAnchors() {
        return (this.options & ISegmentBuilder.F_INCLUDE_ANCHORS) != 0;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public boolean isTrackTextFirst256() {
        return this.stats.isTrackTextFirst256();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new PartsIterator(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int length() {
        return this.length;
    }

    public boolean needEndOffset() {
        return getEndOffsetIfNeeded() != -1;
    }

    public boolean needStartOffset() {
        return getStartOffsetIfNeeded() != -1;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int noAnchorsSize() {
        return size() - this.anchorsSize;
    }

    public Object[] optimizeText(Object[] objArr) {
        return objArr;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public int size() {
        return (haveDanglingText() ? 1 : 0) + this.partsSize;
    }

    public String toString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function<CharSequence, CharSequence> function) {
        SegmentBuilderBase<S> segmentBuilderBase;
        if (this.endOffset <= charSequence.length()) {
            if (haveDanglingText() && haveOffsets()) {
                int i6 = this.endOffset;
                segmentBuilderBase = this;
                segmentBuilderBase.processParts(i6, i6, false, true, new a(this, 0));
            } else {
                segmentBuilderBase = this;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = segmentBuilderBase.partsSize;
            for (int i8 = 0; i8 < i7; i8++) {
                Seg seg = getSeg(i8);
                if (!seg.isBase()) {
                    sb.append(function.apply(segmentBuilderBase.text.subSequence(seg.getTextStart(), seg.getTextEnd())));
                } else {
                    sb.append(charSequence2);
                    sb.append(function.apply(charSequence.subSequence(seg.getStart(), seg.getEnd())));
                    sb.append(charSequence3);
                }
            }
            if (haveDanglingText()) {
                StringBuilder sb2 = segmentBuilderBase.text;
                sb.append(function.apply(sb2.subSequence(segmentBuilderBase.immutableOffset, sb2.length())));
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(e.k("baseSequence length() must be at least ", this.endOffset, charSequence.length(), ", got: "));
    }

    public String toStringPrep() {
        if (haveDanglingText() && haveOffsets()) {
            int i6 = this.endOffset;
            processParts(i6, i6, false, true, new a(this, 0));
        }
        return toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public String toStringWithRanges(CharSequence charSequence) {
        return toString(charSequence, "⟦", "⟧", Function.identity());
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public String toStringWithRangesVisibleWhitespace(CharSequence charSequence) {
        return toString(charSequence, "⟦", "⟧", new g(10));
    }

    public void trimToSize() {
        int[] iArr = this.parts;
        int length = iArr.length;
        int i6 = this.partsSize;
        if (length > i6) {
            this.parts = Arrays.copyOf(iArr, i6 * 2);
        }
    }

    public SegmentBuilderBase(int i6) {
        this.parts = EMPTY_PARTS;
        this.partsSize = 0;
        this.anchorsSize = 0;
        Range range = Range.NULL;
        this.startOffset = range.getStart();
        this.endOffset = range.getEnd();
        this.length = 0;
        this.text = new StringBuilder();
        this.immutableOffset = 0;
        int i7 = ISegmentBuilder.F_INCLUDE_ANCHORS;
        int i8 = ISegmentBuilder.F_TRACK_FIRST256;
        this.options = (i7 | i8) & i6;
        this.stats = new SegmentStats((i6 & i8) != 0);
        this.textStats = new SegmentStats((i6 & i8) != 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public S appendAnchor(int i6) {
        return append(i6, i6);
    }

    private void ensureCapacity(int i6) {
        this.parts = ensureCapacity(this.parts, i6 + 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public S append(Range range) {
        return append(range.getStart(), range.getEnd());
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public S append(int i6, int i7) {
        if (i7 >= 0 && i6 <= i7) {
            int i8 = i7 - i6;
            if (i8 == 0 && (!isIncludeAnchors() || i6 < this.endOffset)) {
                if (i6 >= this.endOffset) {
                    if (haveDanglingText()) {
                        processParts(i6, i7, false, false, new a(this, 0));
                        return this;
                    }
                    if (!haveOffsets()) {
                        this.startOffset = i6;
                    }
                    this.endOffset = i6;
                    return this;
                }
            } else {
                int i9 = this.endOffset;
                if (i9 > i6) {
                    processParts(i6, i7, true, false, new a(this, 1));
                    return this;
                }
                if (i9 == i6) {
                    if (haveDanglingText()) {
                        processParts(i6, i7, false, false, new a(this, 0));
                        return this;
                    }
                    this.endOffset = i7;
                    this.length += i8;
                    int i10 = this.partsSize;
                    if (i10 == 0) {
                        addSeg(i6, i7);
                        return this;
                    }
                    setSegEnd(i10 - 1, i7);
                    return this;
                }
                if (haveDanglingText()) {
                    processParts(i6, i7, false, false, new a(this, 0));
                    return this;
                }
                if (!haveOffsets()) {
                    this.startOffset = i6;
                }
                this.endOffset = i7;
                this.length += i8;
                addSeg(i6, i7);
                return this;
            }
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public String toString(CharSequence charSequence) {
        return toString(charSequence, FlexmarkHtmlConverter.DEFAULT_NODE, FlexmarkHtmlConverter.DEFAULT_NODE, Function.identity());
    }

    public String toString() {
        DelimitedBuilder delimitedBuilder = new DelimitedBuilder(", ");
        delimitedBuilder.append(getClass().getSimpleName()).append("{");
        if (haveOffsets()) {
            delimitedBuilder.append("[").append(this.startOffset).mark().append(this.endOffset).unmark().append(")").mark();
        } else {
            delimitedBuilder.append("NULL").mark();
        }
        delimitedBuilder.append(this.stats.committedCopy()).mark().append("l=").append(this.length).mark().append("sz=").append(size()).mark().append("na=").append(noAnchorsSize());
        if (size() > 0) {
            delimitedBuilder.append(": ");
        }
        int i6 = this.partsSize;
        for (int i7 = 0; i7 < i6; i7++) {
            delimitedBuilder.append(getSeg(i7).toString(this.text)).mark();
        }
        if (haveDanglingText()) {
            delimitedBuilder.append(Seg.textOf(this.immutableOffset, this.text.length(), this.textStats.isTextFirst256(), this.textStats.isRepeatedText()).toString(this.text)).mark();
        }
        delimitedBuilder.unmark().append(" }");
        return delimitedBuilder.toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder
    public S append(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            this.stats.addText(charSequence);
            this.textStats.addText(charSequence);
            this.text.append(charSequence);
            this.length += length;
        }
        return this;
    }

    public S append(char c6) {
        this.stats.addText(c6);
        this.textStats.addText(c6);
        this.text.append(c6);
        this.length++;
        return this;
    }

    public S append(char c6, int i6) {
        if (i6 > 0) {
            this.stats.addText(c6, i6);
            this.textStats.addText(c6, i6);
            this.length += i6;
            while (true) {
                int i7 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                this.text.append(c6);
                i6 = i7;
            }
        }
        return this;
    }
}
