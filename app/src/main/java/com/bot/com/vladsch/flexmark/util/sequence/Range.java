package com.vladsch.flexmark.util.sequence;

import B3.e;
import com.vladsch.flexmark.util.format.TableCell;

/* loaded from: classes.dex */
public class Range {
    private final int end;
    private final int start;
    public static final Range NULL = new Range(TableCell.NOT_TRACKED, Integer.MIN_VALUE);
    public static final Range EMPTY = new Range(0, 0);

    public Range(int i6, int i7) {
        this.start = i6;
        this.end = i7;
    }

    public static Range emptyOf(int i6) {
        return new Range(i6, i6);
    }

    public static Range of(int i6, int i7) {
        Range range = NULL;
        return (i6 == range.start && i7 == range.end) ? range : new Range(i6, i7);
    }

    public static Range ofLength(int i6, int i7) {
        return new Range(i6, i7 + i6);
    }

    public BasedSequence basedSafeSubSequence(CharSequence charSequence) {
        int min = Math.min(charSequence.length(), this.end);
        return isNull() ? BasedSequence.NULL : BasedSequence.of(charSequence).subSequence(Math.min(min, Math.max(0, this.start)), min);
    }

    public BasedSequence basedSubSequence(CharSequence charSequence) {
        return BasedSequence.of(charSequence).subSequence(this.start, this.end);
    }

    public CharSequence charSubSequence(CharSequence charSequence) {
        return charSequence.subSequence(this.start, this.end);
    }

    public int compare(Range range) {
        int i6 = this.start;
        int i7 = range.start;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = this.end;
        int i9 = range.end;
        if (i8 > i9) {
            return -1;
        }
        return i8 < i9 ? 1 : 0;
    }

    public int component1() {
        return this.start;
    }

    public int component2() {
        return this.end;
    }

    public boolean contains(Range range) {
        return this.end >= range.end && this.start <= range.start;
    }

    public boolean doesContain(Range range) {
        return this.end >= range.end && this.start <= range.start;
    }

    public boolean doesNotOverlap(Range range) {
        return range.end <= this.start || range.start >= this.end;
    }

    public boolean doesNotOverlapNorAdjacent(Range range) {
        return range.end < this.start || range.start > this.end;
    }

    public boolean doesNotOverlapOrAdjacent(Range range) {
        return range.end < this.start || range.start > this.end;
    }

    public boolean doesOverlap(Range range) {
        return range.end > this.start && range.start < this.end;
    }

    public boolean doesOverlapOrAdjacent(Range range) {
        return range.end >= this.start && range.start <= this.end;
    }

    public boolean doesProperlyContain(Range range) {
        return this.end > range.end && this.start < range.start;
    }

    public Range endMinus(int i6) {
        return i6 == 0 ? this : of(this.start, this.end - i6);
    }

    public Range endPlus(int i6) {
        return i6 == 0 ? this : of(this.start, this.end + i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.start == range.start && this.end == range.end;
    }

    public Range exclude(Range range) {
        int i6;
        int i7 = this.start;
        int i8 = range.start;
        if (i7 >= i8 && i7 < (i6 = range.end)) {
            i7 = i6;
        }
        int i9 = this.end;
        if (i9 > range.end || i9 <= i8) {
            i8 = i9;
        }
        if (i7 >= i8) {
            i7 = 0;
            i8 = 0;
        }
        return withRange(i7, i8);
    }

    public Range expandToInclude(Range range) {
        return expandToInclude(range.start, range.end);
    }

    public int getEnd() {
        return this.end;
    }

    public int getEndOffset() {
        return this.end;
    }

    public int getSpan() {
        if (isNull()) {
            return 0;
        }
        return this.end - this.start;
    }

    public int getStart() {
        return this.start;
    }

    public int getStartOffset() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public Range include(Range range) {
        return range.isNull() ? isNull() ? NULL : this : expandToInclude(range);
    }

    public Range intersect(Range range) {
        int max = Math.max(this.start, range.start);
        int min = Math.min(this.end, range.end);
        if (max >= min) {
            max = min;
        }
        return withRange(max, min);
    }

    public boolean isAdjacent(int i6) {
        return i6 == this.start - 1 || i6 == this.end;
    }

    public boolean isAdjacentAfter(int i6) {
        return this.start - 1 == i6;
    }

    public boolean isAdjacentBefore(int i6) {
        return this.end == i6;
    }

    public boolean isContainedBy(Range range) {
        return range.end >= this.end && range.start <= this.start;
    }

    public boolean isEmpty() {
        return this.start >= this.end;
    }

    public boolean isEnd(int i6) {
        return i6 == this.end;
    }

    public boolean isEqual(Range range) {
        return this.end == range.end && this.start == range.start;
    }

    public boolean isLast(int i6) {
        return i6 >= this.start && i6 == this.end - 1;
    }

    public boolean isNotEmpty() {
        return this.start < this.end;
    }

    public boolean isNotNull() {
        return !isNull();
    }

    public boolean isNull() {
        int i6 = this.start;
        Range range = NULL;
        return i6 == range.start && this.end == range.end;
    }

    public boolean isProperlyContainedBy(Range range) {
        return range.end > this.end && range.start < this.start;
    }

    public boolean isStart(int i6) {
        return i6 == this.start;
    }

    public boolean isValidIndex(int i6) {
        return i6 >= this.start && i6 <= this.end;
    }

    public boolean leadBy(int i6) {
        return i6 <= this.start;
    }

    public boolean leads(int i6) {
        return this.end <= i6;
    }

    public boolean overlaps(Range range) {
        return range.end > this.start && range.start < this.end;
    }

    public boolean overlapsOrAdjacent(Range range) {
        return range.end >= this.start && range.start <= this.end;
    }

    public boolean properlyContains(Range range) {
        return this.end > range.end && this.start < range.start;
    }

    public RichSequence richSafeSubSequence(CharSequence charSequence) {
        int min = Math.min(charSequence.length(), this.end);
        return isNull() ? RichSequence.NULL : RichSequence.of(charSequence, Math.min(min, Math.max(0, this.start)), min);
    }

    public RichSequence richSubSequence(CharSequence charSequence) {
        return RichSequence.of(charSequence.subSequence(this.start, this.end));
    }

    public CharSequence safeSubSequence(CharSequence charSequence) {
        int min = Math.min(charSequence.length(), this.end);
        return isNull() ? charSequence.subSequence(0, 0) : charSequence.subSequence(Math.min(min, Math.max(0, this.start)), min);
    }

    public Range shiftLeft(int i6) {
        return i6 == 0 ? this : of(this.start - i6, this.end - i6);
    }

    public Range shiftRight(int i6) {
        return i6 == 0 ? this : of(this.start + i6, this.end + i6);
    }

    public Range startMinus(int i6) {
        return i6 == 0 ? this : of(this.start - i6, this.end);
    }

    public Range startPlus(int i6) {
        return i6 == 0 ? this : of(this.start + i6, this.end);
    }

    @Deprecated
    public BasedSequence subSequence(CharSequence charSequence) {
        return basedSubSequence(charSequence);
    }

    public String toString() {
        return e.i(this.start, "[", this.end, ", ", ")");
    }

    public boolean trailedBy(int i6) {
        return this.end <= i6;
    }

    public boolean trails(int i6) {
        return i6 <= this.start;
    }

    public Range withEnd(int i6) {
        return i6 == this.end ? this : of(this.start, i6);
    }

    public Range withRange(int i6, int i7) {
        return (i6 == this.start && i7 == this.end) ? this : of(i6, i7);
    }

    public Range withStart(int i6) {
        return i6 == this.start ? this : of(i6, this.end);
    }

    public boolean contains(int i6) {
        return this.start <= i6 && i6 < this.end;
    }

    public boolean doesContain(int i6) {
        return this.start <= i6 && i6 < this.end;
    }

    public Range expandToInclude(int i6, int i7) {
        return withRange(Math.min(this.start, i6), Math.max(this.end, i7));
    }

    public Range include(int i6) {
        return include(i6, i6);
    }

    public boolean isAdjacent(Range range) {
        return this.start == range.end || this.end == range.start;
    }

    public boolean isAdjacentAfter(Range range) {
        return this.start == range.end;
    }

    public boolean isAdjacentBefore(Range range) {
        return this.end == range.start;
    }

    public boolean isContainedBy(int i6, int i7) {
        return i7 >= this.end && i6 <= this.start;
    }

    public boolean isProperlyContainedBy(int i6, int i7) {
        return i7 > this.end && i6 < this.start;
    }

    public boolean contains(int i6, int i7) {
        return this.start <= i6 && i7 <= this.end;
    }

    public boolean doesContain(int i6, int i7) {
        return this.start <= i6 && i7 <= this.end;
    }

    public Range include(int i6, int i7) {
        return isNull() ? of(i6, i7) : expandToInclude(i6, i7);
    }

    public Range(Range range) {
        this.start = range.start;
        this.end = range.end;
    }
}
