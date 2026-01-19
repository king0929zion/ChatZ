package com.vladsch.flexmark.util.sequence.builder.tree;

import B3.e;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.Seg;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public abstract class Segment {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int TYPE_ANCHOR = 0;
    static final int TYPE_BASE = 32;
    static final int TYPE_HAS_BOTH = 768;
    static final int TYPE_HAS_BYTE = 4096;
    static final int TYPE_HAS_BYTES = 8192;
    static final int TYPE_HAS_CHAR = 1024;
    static final int TYPE_HAS_CHARS = 2048;
    static final int TYPE_HAS_LENGTH = 512;
    static final int TYPE_HAS_OFFSET = 256;
    static final int TYPE_LENGTH_BYTES = 12;
    static final int TYPE_MASK = 224;
    static final int TYPE_NO_SIZE_BYTES = 16;
    static final int TYPE_REPEATED_ASCII = 160;
    static final int TYPE_REPEATED_EOL = 224;
    static final int TYPE_REPEATED_SPACE = 192;
    static final int TYPE_REPEATED_TEXT = 96;
    static final int TYPE_START_BYTES = 3;
    static final int TYPE_TEXT = 64;
    static final int TYPE_TEXT_ASCII = 128;
    protected final int byteOffset;
    protected final byte[] bytes;
    protected final int pos;
    protected final int startIndex;

    /* loaded from: classes.dex */
    public static class Base extends Segment {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        protected final BasedSequence baseSeq;
        protected final int endOffset;
        protected final int startOffset;

        public Base(int i6, byte[] bArr, int i7, int i8, BasedSequence basedSequence) {
            super(i6, bArr, i7, i8);
            this.baseSeq = basedSequence;
            int i9 = i7 + 1;
            int i10 = bArr[i7];
            int i11 = i10 & 255;
            if ((i10 & 224) != 0) {
                int i12 = (i10 & 3) + 1;
                int i13 = Segment.getInt(bArr, i9, i12);
                this.startOffset = i13;
                this.endOffset = Segment.getInt(bArr, i9 + i12, ((i10 & Segment.TYPE_LENGTH_BYTES) >> 2) + 1) + i13;
                return;
            }
            if (hasAll(i11, 16)) {
                int i14 = i10 & 15;
                this.startOffset = i14;
                this.endOffset = i14;
            } else {
                int i15 = Segment.getInt(bArr, i9, (i10 & 3) + 1);
                this.startOffset = i15;
                this.endOffset = i15;
            }
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public char charAt(int i6) {
            int i7 = this.startIndex;
            if (i6 >= i7 && i6 - i7 < length()) {
                return this.baseSeq.charAt((this.startOffset + i6) - this.startIndex);
            }
            int i8 = this.startIndex;
            int length = length();
            StringBuilder j3 = AbstractC1135a.j(i6, "index ", i8, " out of bounds [", ", ");
            j3.append(i8);
            j3.append(length);
            j3.append(")");
            throw new IndexOutOfBoundsException(j3.toString());
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public CharSequence getCharSequence() {
            return this.baseSeq.subSequence(this.startOffset, this.endOffset);
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public int getEndOffset() {
            return this.endOffset;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public int getStartOffset() {
            return this.startOffset;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isAnchor() {
            return this.startOffset == this.endOffset;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isBase() {
            return true;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isFirst256Start() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isRepeatedTextEnd() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isText() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public int length() {
            return this.endOffset - this.startOffset;
        }
    }

    /* loaded from: classes.dex */
    public enum SegType {
        ANCHOR(256),
        BASE(800),
        TEXT(2624),
        REPEATED_TEXT(1632),
        TEXT_ASCII(8832),
        REPEATED_ASCII(4768),
        REPEATED_SPACE(704),
        REPEATED_EOL(736);

        public final int flags;

        SegType(int i6) {
            this.flags = i6;
        }

        public static SegType fromTypeMask(int i6) {
            int i7 = i6 & 224;
            if (i7 == 0) {
                return ANCHOR;
            }
            if (i7 == 32) {
                return BASE;
            }
            if (i7 == 64) {
                return TEXT;
            }
            if (i7 == Segment.TYPE_REPEATED_TEXT) {
                return REPEATED_TEXT;
            }
            if (i7 == 128) {
                return TEXT_ASCII;
            }
            if (i7 == Segment.TYPE_REPEATED_ASCII) {
                return REPEATED_ASCII;
            }
            if (i7 == Segment.TYPE_REPEATED_SPACE) {
                return REPEATED_SPACE;
            }
            if (i7 == 224) {
                return REPEATED_EOL;
            }
            throw new IllegalStateException(String.format("Invalid text type %02x", Integer.valueOf(i6)));
        }

        public boolean hasAll(int i6) {
            return (this.flags & i6) == i6;
        }

        public boolean hasBoth() {
            return hasAll(Segment.TYPE_HAS_BOTH);
        }

        public boolean hasByte() {
            return hasAll(Segment.TYPE_HAS_BYTE);
        }

        public boolean hasBytes() {
            return hasAll(Segment.TYPE_HAS_BYTES);
        }

        public boolean hasChar() {
            return hasAll(1024);
        }

        public boolean hasChars() {
            return hasAll(Segment.TYPE_HAS_CHARS);
        }

        public boolean hasLength() {
            return hasAll(512);
        }

        public boolean hasOffset() {
            return hasAll(256);
        }
    }

    /* loaded from: classes.dex */
    public static class Text extends Segment {
        protected final CharSequence chars;

        public Text(int i6, byte[] bArr, int i7, int i8) {
            super(i6, bArr, i7, i8);
            int i9;
            int i10 = i7 + 1;
            int i11 = bArr[i7];
            int i12 = i11 & 224;
            if (hasAll(i11 & 255, 16)) {
                i9 = i11 & 15;
            } else {
                int i13 = ((i11 & Segment.TYPE_LENGTH_BYTES) >> 2) + 1;
                int i14 = Segment.getInt(bArr, i10, i13);
                i10 += i13;
                i9 = i14;
            }
            if (i12 == 64) {
                this.chars = new TextCharSequence(bArr, i10, 0, i9);
                return;
            }
            if (i12 == Segment.TYPE_REPEATED_TEXT) {
                this.chars = new TextRepeatedSequence(Segment.getChar(bArr, i10), i9);
                return;
            }
            if (i12 == 128) {
                this.chars = new TextAsciiCharSequence(bArr, i10, 0, i9);
                return;
            }
            if (i12 == Segment.TYPE_REPEATED_ASCII) {
                this.chars = new TextRepeatedSequence((char) (bArr[i10] & 255), i9);
            } else if (i12 == Segment.TYPE_REPEATED_SPACE) {
                this.chars = new TextRepeatedSequence(SequenceUtils.SPC, i9);
            } else {
                if (i12 != 224) {
                    throw new IllegalStateException(e.h(i12, "Invalid text type "));
                }
                this.chars = new TextRepeatedSequence('\n', i9);
            }
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public char charAt(int i6) {
            int i7 = this.startIndex;
            if (i6 >= i7 && i6 - i7 < this.chars.length()) {
                return this.chars.charAt(i6 - this.startIndex);
            }
            int i8 = this.startIndex;
            int length = this.chars.length();
            StringBuilder j3 = AbstractC1135a.j(i6, "index ", i8, " out of bounds [", ", ");
            j3.append(i8);
            j3.append(length);
            j3.append(")");
            throw new IndexOutOfBoundsException(j3.toString());
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public CharSequence getCharSequence() {
            return this.chars;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public int getEndOffset() {
            return -1;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public int getStartOffset() {
            return -1;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isAnchor() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isBase() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isFirst256Start() {
            int textType = textType();
            return textType == 128 || textType == Segment.TYPE_REPEATED_ASCII || textType == Segment.TYPE_REPEATED_SPACE || textType == 224;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isRepeatedTextEnd() {
            int textType = textType();
            return textType == Segment.TYPE_REPEATED_TEXT || textType == Segment.TYPE_REPEATED_ASCII || textType == Segment.TYPE_REPEATED_SPACE || textType == 224;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public boolean isText() {
            return true;
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment
        public int length() {
            return this.chars.length();
        }

        public int textType() {
            return this.bytes[this.byteOffset] & 224;
        }
    }

    /* loaded from: classes.dex */
    public static class TextAsciiCharSequence extends TextCharSequenceBase {
        public TextAsciiCharSequence(byte[] bArr, int i6, int i7, int i8) {
            super(bArr, i6, i7, i8);
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment.TextCharSequenceBase, java.lang.CharSequence
        public char charAt(int i6) {
            if (i6 < 0 || i6 >= this.length) {
                throw new IndexOutOfBoundsException(e.i(i6, "index ", this.length, " out of bounds [0, ", ")"));
            }
            return (char) (this.bytes[this.byteOffset + this.startOffset + i6] & 255);
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment.TextCharSequenceBase
        public CharSequence create(int i6, int i7) {
            return new TextAsciiCharSequence(this.bytes, this.byteOffset, i6, i7);
        }
    }

    /* loaded from: classes.dex */
    public static class TextCharSequence extends TextCharSequenceBase {
        public TextCharSequence(byte[] bArr, int i6, int i7, int i8) {
            super(bArr, i6, i7, i8);
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment.TextCharSequenceBase, java.lang.CharSequence
        public char charAt(int i6) {
            if (i6 < 0 || i6 >= this.length) {
                throw new IndexOutOfBoundsException(e.i(i6, "index ", this.length, " out of bounds [0, ", ")"));
            }
            return Segment.getChar(this.bytes, ((this.startOffset + i6) * 2) + this.byteOffset);
        }

        @Override // com.vladsch.flexmark.util.sequence.builder.tree.Segment.TextCharSequenceBase
        public CharSequence create(int i6, int i7) {
            return new TextCharSequence(this.bytes, this.byteOffset, i6, i7);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class TextCharSequenceBase implements CharSequence {
        protected final int byteOffset;
        protected final byte[] bytes;
        protected final int length;
        protected final int startOffset;

        public TextCharSequenceBase(byte[] bArr, int i6, int i7, int i8) {
            this.bytes = bArr;
            this.byteOffset = i6;
            this.startOffset = i7;
            this.length = i8;
        }

        @Override // java.lang.CharSequence
        public abstract char charAt(int i6);

        public abstract CharSequence create(int i6, int i7);

        @Override // java.lang.CharSequence
        public int length() {
            return this.length;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i6, int i7) {
            if (i6 >= 0 && i6 <= i7 && i7 <= this.length) {
                return create(this.startOffset + i6, i7 - i6);
            }
            throw new IndexOutOfBoundsException(AbstractC1135a.i(AbstractC1135a.j(i6, "Invalid index range [", i7, ", ", "] out of bounds [0, "), length(), ")"));
        }

        @Override // java.lang.CharSequence
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < this.length; i6++) {
                sb.append(charAt(i6));
            }
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class TextRepeatedSequence implements CharSequence {

        /* renamed from: c, reason: collision with root package name */
        protected final char f11377c;
        protected final int length;

        public TextRepeatedSequence(char c6, int i6) {
            this.f11377c = c6;
            this.length = i6;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i6) {
            if (i6 < 0 || i6 >= this.length) {
                throw new IndexOutOfBoundsException(e.i(i6, "index ", this.length, " out of bounds [0, ", ")"));
            }
            return this.f11377c;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.length;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i6, int i7) {
            if (i6 >= 0 && i6 <= i7 && i7 <= this.length) {
                return new TextRepeatedSequence(this.f11377c, i7 - i6);
            }
            throw new IndexOutOfBoundsException(AbstractC1135a.i(AbstractC1135a.j(i6, "Invalid index range [", i7, ", ", "] out of bounds [0, "), length(), ")"));
        }

        @Override // java.lang.CharSequence
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < this.length; i6++) {
                sb.append(this.f11377c);
            }
            return sb.toString();
        }
    }

    public Segment(int i6, byte[] bArr, int i7, int i8) {
        this.pos = i6;
        this.bytes = bArr;
        this.byteOffset = i7;
        this.startIndex = i8;
    }

    public static int addChar(byte[] bArr, int i6, char c6) {
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((65280 & c6) >> 8);
        int i8 = i6 + 2;
        bArr[i7] = (byte) (c6 & 255);
        return i8;
    }

    public static int addCharAscii(byte[] bArr, int i6, char c6) {
        int i7 = i6 + 1;
        bArr[i6] = (byte) (c6 & 255);
        return i7;
    }

    public static int addChars(byte[] bArr, int i6, CharSequence charSequence, int i7, int i8) {
        while (i7 < i8) {
            char charAt = charSequence.charAt(i7);
            int i9 = i6 + 1;
            bArr[i6] = (byte) ((65280 & charAt) >> 8);
            i6 += 2;
            bArr[i9] = (byte) (charAt & 255);
            i7++;
        }
        return i6;
    }

    public static int addCharsAscii(byte[] bArr, int i6, CharSequence charSequence, int i7, int i8) {
        while (i7 < i8) {
            bArr[i6] = (byte) (charSequence.charAt(i7) & 255);
            i7++;
            i6++;
        }
        return i6;
    }

    public static int addIntBytes(byte[] bArr, int i6, int i7, int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return i6;
                    }
                    bArr[i6] = (byte) (((-16777216) & i7) >> 24);
                    i6++;
                }
                bArr[i6] = (byte) ((16711680 & i7) >> 16);
                i6++;
            }
            bArr[i6] = (byte) ((65280 & i7) >> 8);
            i6++;
        }
        int i9 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        return i9;
    }

    public static int addSegBytes(byte[] bArr, int i6, Seg seg, CharSequence charSequence) {
        SegType segType = getSegType(seg, charSequence);
        int length = seg.length();
        if (segType.hasOffset()) {
            int start = seg.getStart();
            if (segType.hasLength()) {
                int intBytes = getIntBytes(start);
                int intBytes2 = getIntBytes(length);
                bArr[i6] = (byte) (segType.flags | (intBytes - 1) | ((intBytes2 - 1) << 2));
                i6 = addIntBytes(bArr, addIntBytes(bArr, i6 + 1, start, intBytes), length, intBytes2);
            } else {
                int offsetBytes = getOffsetBytes(start);
                if (offsetBytes == 0) {
                    bArr[i6] = (byte) (start | segType.flags | 16);
                    i6++;
                } else {
                    bArr[i6] = (byte) (segType.flags | (offsetBytes - 1));
                    i6 = addIntBytes(bArr, i6 + 1, start, offsetBytes);
                }
            }
        } else if (segType.hasLength()) {
            int lengthBytes = getLengthBytes(length);
            if (lengthBytes == 0) {
                bArr[i6] = (byte) (length | segType.flags | 16);
                i6++;
            } else {
                bArr[i6] = (byte) (segType.flags | ((lengthBytes - 1) << 2));
                i6 = addIntBytes(bArr, i6 + 1, length, lengthBytes);
            }
        }
        return segType.hasChar() ? addChar(bArr, i6, charSequence.charAt(seg.getTextStart())) : segType.hasChars() ? addChars(bArr, i6, charSequence, seg.getTextStart(), seg.getTextEnd()) : segType.hasByte() ? addCharAscii(bArr, i6, charSequence.charAt(seg.getTextStart())) : segType.hasBytes() ? addCharsAscii(bArr, i6, charSequence, seg.getTextStart(), seg.getTextEnd()) : i6;
    }

    public static char getChar(byte[] bArr, int i6) {
        int i7 = i6 + 1;
        return (char) ((bArr[i7] & 255) | ((char) ((bArr[i6] & 255) << 8)));
    }

    public static char getCharAscii(byte[] bArr, int i6) {
        return (char) (bArr[i6] & 255);
    }

    public static int getInt(byte[] bArr, int i6, int i7) {
        int i8 = 0;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return 0;
                    }
                    i8 = (bArr[i6] & 255) << 24;
                    i6++;
                }
                i8 |= (bArr[i6] & 255) << 16;
                i6++;
            }
            i8 |= (bArr[i6] & 255) << 8;
            i6++;
        }
        return (bArr[i6] & 255) | i8;
    }

    public static int getIntBytes(int i6) {
        if (i6 < 256) {
            return 1;
        }
        if (i6 < 65536) {
            return 2;
        }
        return i6 < 16777216 ? 3 : 4;
    }

    public static int getLengthBytes(int i6) {
        if (i6 < 16) {
            return 0;
        }
        if (i6 < 256) {
            return 1;
        }
        if (i6 < 65536) {
            return 2;
        }
        return i6 < 16777216 ? 3 : 4;
    }

    public static int getOffsetBytes(int i6) {
        if (i6 < 16) {
            return 0;
        }
        if (i6 < 256) {
            return 1;
        }
        if (i6 < 65536) {
            return 2;
        }
        return i6 < 16777216 ? 3 : 4;
    }

    public static int getSegByteLength(SegType segType, int i6, int i7) {
        int i8;
        int lengthBytes;
        if (segType.hasBoth()) {
            i8 = getIntBytes(i7) + getIntBytes(i6) + 1;
        } else {
            if (segType.hasOffset()) {
                lengthBytes = getOffsetBytes(i6);
            } else if (segType.hasLength()) {
                lengthBytes = getLengthBytes(i7);
            } else {
                i8 = 1;
            }
            i8 = lengthBytes + 1;
        }
        return segType.hasChar() ? i8 + 2 : segType.hasChars() ? (i7 * 2) + i8 : segType.hasByte() ? i8 + 1 : segType.hasBytes() ? i8 + i7 : i8;
    }

    public static SegType getSegType(Seg seg, CharSequence charSequence) {
        if (seg.isBase()) {
            return seg.isAnchor() ? SegType.ANCHOR : SegType.BASE;
        }
        if (!seg.isText()) {
            throw new IllegalStateException("Unknown seg type " + seg);
        }
        boolean isFirst256Start = seg.isFirst256Start();
        boolean isRepeatedTextEnd = seg.isRepeatedTextEnd();
        if (!isFirst256Start) {
            return isRepeatedTextEnd ? SegType.REPEATED_TEXT : SegType.TEXT;
        }
        if (!isRepeatedTextEnd) {
            return SegType.TEXT_ASCII;
        }
        char charAt = charSequence.charAt(seg.getTextStart());
        return charAt == ' ' ? SegType.REPEATED_SPACE : charAt == '\n' ? SegType.REPEATED_EOL : SegType.REPEATED_ASCII;
    }

    public static Segment getSegment(byte[] bArr, int i6, int i7, int i8, BasedSequence basedSequence) {
        int i9 = bArr[i6] & 224;
        if (i9 == 0 || i9 == 32) {
            return new Base(i7, bArr, i6, i8, basedSequence);
        }
        if (i9 == 64 || i9 == TYPE_REPEATED_TEXT || i9 == 128 || i9 == TYPE_REPEATED_ASCII || i9 == TYPE_REPEATED_SPACE || i9 == 224) {
            return new Text(i7, bArr, i6, i8);
        }
        throw new IllegalStateException(e.h(i9, "Invalid text type "));
    }

    public abstract char charAt(int i6);

    public final int getByteLength() {
        return getSegByteLength(getType(), getStartOffset(), length());
    }

    public final int getByteOffset() {
        return this.byteOffset;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public abstract CharSequence getCharSequence();

    public final int getEndIndex() {
        return length() + this.startIndex;
    }

    public abstract int getEndOffset();

    public int getPos() {
        return this.pos;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public abstract int getStartOffset();

    public final SegType getType() {
        return SegType.fromTypeMask(this.bytes[this.byteOffset]);
    }

    public boolean hasAll(int i6, int i7) {
        return (i6 & i7) == i7;
    }

    public abstract boolean isAnchor();

    public abstract boolean isBase();

    public abstract boolean isFirst256Start();

    public abstract boolean isRepeatedTextEnd();

    public abstract boolean isText();

    public abstract int length();

    public boolean notInSegment(int i6) {
        int i7 = this.startIndex;
        return i6 < i7 || i6 >= length() + i7;
    }

    public boolean offsetNotInSegment(int i6) {
        return i6 < getStartOffset() || i6 >= getEndOffset();
    }

    public String toString() {
        if (isBase()) {
            return isAnchor() ? e.l("[", getStartOffset(), ")") : e.i(getStartOffset(), "[", getEndOffset(), ", ", ")");
        }
        CharSequence charSequence = getCharSequence();
        if (!isRepeatedTextEnd() || length() <= 1) {
            int length = charSequence.length();
            String charSequence2 = length <= 20 ? charSequence.toString() : AbstractC1135a.g(charSequence.subSequence(0, 10).toString(), "…", charSequence.subSequence(length - 10, length).toString());
            return isFirst256Start() ? AbstractC1135a.s("a:'", Utils.escapeJavaString(charSequence2), "'") : AbstractC1135a.s("'", Utils.escapeJavaString(charSequence2), "'");
        }
        if (isFirst256Start()) {
            return "a:" + length() + "x'" + Utils.escapeJavaString(charSequence.subSequence(0, 1)) + "'";
        }
        return length() + "x'" + Utils.escapeJavaString(charSequence.subSequence(0, 1)) + "'";
    }

    public static int getSegByteLength(Seg seg, CharSequence charSequence) {
        return getSegByteLength(getSegType(seg, charSequence), seg.getSegStart(), seg.length());
    }
}
