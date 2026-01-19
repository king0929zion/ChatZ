package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.misc.DelimitedBuilder;

/* loaded from: classes.dex */
public class SegmentStats {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int NOT_REPEATED_CHAR = -2;
    public static final int NULL_REPEATED_CHAR = -1;
    protected final boolean trackFirst256;
    protected int textLength = 0;
    protected int textSegments = 0;
    protected int textSegmentLength = 0;
    protected int textSpaceLength = 0;
    protected int textSpaceSegments = 0;
    protected int textSpaceSegmentLength = 0;
    protected int textFirst256Length = 0;
    protected int textFirst256Segments = 0;
    protected int textFirst256SegmentLength = 0;
    protected int repeatedChar = -1;

    public SegmentStats(boolean z5) {
        this.trackFirst256 = z5;
    }

    public void add(SegmentStats segmentStats) {
        this.textLength += segmentStats.textLength;
        this.textSegments += segmentStats.textSegments;
        if (this.trackFirst256 && segmentStats.trackFirst256) {
            this.textSpaceLength += segmentStats.textSpaceLength;
            this.textSpaceSegments += segmentStats.textSpaceSegments;
            this.textFirst256Length += segmentStats.textFirst256Length;
            this.textFirst256Segments += segmentStats.textFirst256Segments;
        }
    }

    public void addText(CharSequence charSequence) {
        this.textLength = charSequence.length() + this.textLength;
        if (this.trackFirst256) {
            int length = charSequence.length();
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                int i7 = this.repeatedChar;
                if (i7 == -1) {
                    this.repeatedChar = charAt;
                } else if (i7 != charAt) {
                    this.repeatedChar = -2;
                }
                if (charAt < 256) {
                    if (charAt == ' ') {
                        this.textSpaceLength++;
                    }
                    this.textFirst256Length++;
                }
            }
        }
    }

    public void clear() {
        this.textLength = 0;
        this.textSegments = 0;
        this.textSegmentLength = 0;
        this.repeatedChar = -1;
        if (this.trackFirst256) {
            this.textSpaceLength = 0;
            this.textSpaceSegments = 0;
            this.textSpaceSegmentLength = 0;
            this.textFirst256Length = 0;
            this.textFirst256Segments = 0;
            this.textFirst256SegmentLength = 0;
        }
    }

    public void commitText() {
        int i6 = this.textLength;
        int i7 = this.textSegmentLength;
        if (i6 > i7) {
            this.textSegments++;
            this.repeatedChar = -1;
            boolean z5 = this.trackFirst256;
            if (z5) {
                int i8 = i6 - i7;
                if (this.textSpaceLength - this.textSpaceSegmentLength == i8) {
                    this.textSpaceSegments++;
                }
                if (this.textFirst256Length - this.textFirst256SegmentLength == i8) {
                    this.textFirst256Segments++;
                }
            }
            this.textSegmentLength = i6;
            if (z5) {
                this.textSpaceSegmentLength = this.textSpaceLength;
                this.textFirst256SegmentLength = this.textFirst256Length;
            }
        }
    }

    public SegmentStats committedCopy() {
        SegmentStats segmentStats = new SegmentStats(this.trackFirst256);
        segmentStats.textLength = this.textLength;
        segmentStats.textSegments = this.textSegments;
        segmentStats.textSegmentLength = this.textSegmentLength;
        if (this.trackFirst256) {
            segmentStats.textSpaceLength = this.textSpaceLength;
            segmentStats.textSpaceSegments = this.textSpaceSegments;
            segmentStats.textSpaceSegmentLength = this.textSpaceSegmentLength;
            segmentStats.textFirst256Length = this.textFirst256Length;
            segmentStats.textFirst256Segments = this.textFirst256Segments;
            segmentStats.textFirst256SegmentLength = this.textFirst256SegmentLength;
        }
        segmentStats.commitText();
        return segmentStats;
    }

    public int getTextFirst256Length() {
        return this.textFirst256Length;
    }

    public int getTextFirst256Segments() {
        return this.textFirst256Segments;
    }

    public int getTextLength() {
        return this.textLength;
    }

    public int getTextSegments() {
        return this.textSegments;
    }

    public int getTextSpaceLength() {
        return this.textSpaceLength;
    }

    public int getTextSpaceSegments() {
        return this.textSpaceSegments;
    }

    public boolean isEmpty() {
        if (this.textLength != 0 || this.textSegments != 0 || this.textSegmentLength != 0) {
            return false;
        }
        if (this.trackFirst256) {
            return this.textSpaceLength == 0 && this.textSpaceSegments == 0 && this.textSpaceSegmentLength == 0 && this.textFirst256Length == 0 && this.textFirst256Segments == 0 && this.textFirst256SegmentLength == 0;
        }
        return true;
    }

    public boolean isRepeatedText() {
        return this.repeatedChar >= 0;
    }

    public boolean isTextFirst256() {
        return this.textFirst256Length - this.textFirst256SegmentLength == this.textLength - this.textSegmentLength;
    }

    public boolean isTextRepeatedSpace() {
        return this.textSpaceLength - this.textSpaceSegmentLength == this.textLength - this.textSegmentLength;
    }

    public boolean isTrackTextFirst256() {
        return this.trackFirst256;
    }

    public boolean isValid() {
        int i6;
        int i7;
        int i8;
        int i9 = this.textLength;
        int i10 = this.textSegments;
        if (i9 < i10) {
            return false;
        }
        if (!this.trackFirst256) {
            return true;
        }
        int i11 = this.textFirst256Length;
        return i9 >= i11 && i10 >= (i6 = this.textFirst256Segments) && i11 >= i6 && i11 >= (i7 = this.textSpaceLength) && i6 >= (i8 = this.textSpaceSegments) && i7 >= i8;
    }

    public void remove(SegmentStats segmentStats) {
        int i6 = this.textLength - segmentStats.textLength;
        this.textLength = i6;
        this.textSegments -= segmentStats.textSegments;
        this.textSegmentLength = i6;
        if (this.trackFirst256 && segmentStats.trackFirst256) {
            int i7 = this.textSpaceLength - segmentStats.textSpaceLength;
            this.textSpaceLength = i7;
            this.textSpaceSegments -= segmentStats.textSpaceSegments;
            int i8 = this.textFirst256Length - segmentStats.textFirst256Length;
            this.textFirst256Length = i8;
            this.textFirst256Segments -= segmentStats.textFirst256Segments;
            this.textSpaceSegmentLength = i7;
            this.textFirst256SegmentLength = i8;
        }
    }

    public void removeText(CharSequence charSequence) {
        this.textLength -= charSequence.length();
        if (this.trackFirst256) {
            int length = charSequence.length();
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                int i7 = this.repeatedChar;
                if (i7 == -1) {
                    this.repeatedChar = charAt;
                } else if (i7 != charAt) {
                    this.repeatedChar = -2;
                }
                if (charAt < 256) {
                    if (charAt == ' ') {
                        this.textSpaceLength--;
                    }
                    this.textFirst256Length--;
                }
            }
        }
        if (this.textLength == this.textSegmentLength) {
            this.repeatedChar = -1;
        }
    }

    public String toString() {
        DelimitedBuilder delimitedBuilder = new DelimitedBuilder(", ");
        delimitedBuilder.append("s=").append(this.textSpaceSegments).append(":").append(this.textSpaceLength).mark().append("u=").append(this.textFirst256Segments).append(":").append(this.textFirst256Length).mark().append("t=").append(this.textSegments).append(":").append(this.textLength);
        return delimitedBuilder.toString();
    }

    public void addText(char c6) {
        this.textLength++;
        if (this.trackFirst256) {
            int i6 = this.repeatedChar;
            if (i6 == -1) {
                this.repeatedChar = c6;
            } else if (i6 != c6) {
                this.repeatedChar = -2;
            }
            if (c6 < 256) {
                if (c6 == ' ') {
                    this.textSpaceLength++;
                }
                this.textFirst256Length++;
            }
        }
    }

    public void addText(char c6, int i6) {
        this.textLength += i6;
        if (this.trackFirst256) {
            int i7 = this.repeatedChar;
            if (i7 == -1) {
                this.repeatedChar = c6;
            } else if (i7 != c6) {
                this.repeatedChar = -2;
            }
            if (c6 < 256) {
                if (c6 == ' ') {
                    this.textSpaceLength += i6;
                }
                this.textFirst256Length += i6;
            }
        }
    }
}
