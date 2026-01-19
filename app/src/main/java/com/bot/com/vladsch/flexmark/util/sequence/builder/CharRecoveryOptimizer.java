package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.sequence.PositionAnchor;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class CharRecoveryOptimizer implements SegmentOptimizer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final PositionAnchor anchor;
    private int prevEolPos;

    /* renamed from: com.vladsch.flexmark.util.sequence.builder.CharRecoveryOptimizer$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$sequence$PositionAnchor;

        static {
            int[] iArr = new int[PositionAnchor.values().length];
            $SwitchMap$com$vladsch$flexmark$util$sequence$PositionAnchor = iArr;
            try {
                iArr[PositionAnchor.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$sequence$PositionAnchor[PositionAnchor.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$sequence$PositionAnchor[PositionAnchor.CURRENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CharRecoveryOptimizer(PositionAnchor positionAnchor) {
        this.anchor = positionAnchor;
    }

    public int nextMatchPos(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        int max = Math.max(0, i6);
        int min = Math.min(charSequence.length(), i7);
        int length = charSequence2.length();
        int min2 = Math.min(min - max, length);
        int i8 = min - min2;
        int i9 = length - min2;
        while (true) {
            int i10 = min2 - 1;
            if (min2 <= 0) {
                return i9;
            }
            int i11 = i9 + i10;
            if (charSequence2.charAt(i11) != charSequence.charAt(i8 + i10)) {
                return i11 + 1;
            }
            min2 = i10;
        }
    }

    public int prevMatchPos(CharSequence charSequence, CharSequence charSequence2, int i6, int i7) {
        int min = Math.min(Math.min(charSequence.length(), i7) - i6, charSequence2.length());
        for (int i8 = 0; i8 < min; i8++) {
            char charAt = charSequence.charAt(i8 + i6);
            char charAt2 = charSequence2.charAt(i8);
            if (charAt == SequenceUtils.EOL_CHAR) {
                this.prevEolPos = i8 + 1;
            }
            if (charAt2 != charAt) {
                return i8;
            }
        }
        return min;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.SegmentOptimizer, java.util.function.BiFunction
    public Object[] apply(CharSequence charSequence, Object[] objArr) {
        int prevMatchPos;
        int nextMatchPos;
        char c6;
        Range range;
        int endOfLine;
        int min;
        int endOfLine2;
        if (objArr.length == 3) {
            Object obj = objArr[0];
            if (obj instanceof Range) {
                Object obj2 = objArr[1];
                if (obj2 instanceof CharSequence) {
                    Object obj3 = objArr[2];
                    if (obj3 instanceof Range) {
                        Range range2 = (Range) obj;
                        CharSequence charSequence2 = (CharSequence) obj2;
                        Range range3 = (Range) obj3;
                        int length = charSequence2.length();
                        if ((!range2.isNull() || !range3.isNull()) && length != 0) {
                            int length2 = charSequence.length();
                            this.prevEolPos = -1;
                            if (range2.isNull()) {
                                prevMatchPos = 0;
                            } else {
                                prevMatchPos = prevMatchPos(charSequence, charSequence2, range2.getEnd(), range3.isNotNull() ? range3.getStart() : length2);
                            }
                            if (range3.isNull()) {
                                nextMatchPos = length;
                            } else {
                                nextMatchPos = nextMatchPos(charSequence, charSequence2, range2.isNotNull() ? range2.getEnd() : 0, range3.getStart());
                            }
                            if (prevMatchPos == 0 && nextMatchPos == length) {
                                if (range2.isNotNull() && !SequenceUtils.endsWithEOL(charSequence.subSequence(range2.getStart(), range2.getEnd())) && SequenceUtils.startsWith(charSequence2, SequenceUtils.EOL) && (endOfLine2 = SequenceUtils.endOfLine(charSequence, range2.getEnd())) < length2 && SequenceUtils.isBlank(charSequence.subSequence(range2.getEnd(), endOfLine2))) {
                                    Range ofLength = Range.ofLength(endOfLine2, 1);
                                    CharSequence subSequence = charSequence2.subSequence(1, length);
                                    if (range3.isEmpty() && range3.getStart() < ofLength.getEnd()) {
                                        range3 = Range.NULL;
                                    }
                                    if (subSequence.length() == 0) {
                                        objArr[1] = ofLength;
                                        objArr[2] = range3;
                                        return objArr;
                                    }
                                    if (range2.isNull()) {
                                        objArr[0] = ofLength;
                                        objArr[1] = subSequence;
                                        objArr[2] = range3;
                                        return objArr;
                                    }
                                    if (range3.isNull()) {
                                        objArr[1] = ofLength;
                                        objArr[2] = subSequence;
                                        return objArr;
                                    }
                                    Object[] objArr2 = new Object[objArr.length + 1];
                                    objArr2[0] = range2;
                                    objArr2[1] = ofLength;
                                    objArr2[2] = subSequence;
                                    objArr2[3] = range3;
                                    return objArr2;
                                }
                            } else {
                                int i6 = this.prevEolPos;
                                if (i6 != -1 && i6 < prevMatchPos) {
                                    prevMatchPos = i6;
                                    if (nextMatchPos < i6) {
                                        nextMatchPos = prevMatchPos;
                                    }
                                }
                                int i7 = length - nextMatchPos;
                                int min2 = (prevMatchPos + i7) - Math.min(length, (range3.isNotNull() ? range3.getStart() : length2) - (range2.isNotNull() ? range2.getEnd() : 0));
                                if (min2 > 0) {
                                    c6 = 3;
                                    int i8 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$util$sequence$PositionAnchor[this.anchor.ordinal()];
                                    if (i8 == 1) {
                                        min = Math.min(prevMatchPos, min2);
                                    } else if (i8 != 2) {
                                        min = Math.min(prevMatchPos, min2 >> 1);
                                    } else {
                                        int min3 = Math.min(i7, min2);
                                        i7 -= min3;
                                        prevMatchPos -= min2 - min3;
                                    }
                                    prevMatchPos -= min;
                                    i7 -= min2 - min;
                                } else {
                                    c6 = 3;
                                }
                                if (prevMatchPos > 0) {
                                    range2 = range2.endPlus(prevMatchPos);
                                }
                                if (i7 > 0) {
                                    range3 = range3.startMinus(i7);
                                }
                                CharSequence subSequence2 = charSequence2.subSequence(prevMatchPos, length - i7);
                                Range range4 = Range.NULL;
                                if (!range2.isNotNull() || SequenceUtils.endsWithEOL(charSequence.subSequence(range2.getStart(), range2.getEnd())) || !SequenceUtils.startsWith(subSequence2, SequenceUtils.EOL) || (endOfLine = SequenceUtils.endOfLine(charSequence, range2.getEnd())) >= length2 || ((!range3.isNull() && endOfLine >= range3.getStart()) || !SequenceUtils.isBlank(charSequence.subSequence(range2.getEnd(), endOfLine)))) {
                                    range = range4;
                                } else {
                                    range = Range.ofLength(endOfLine, 1);
                                    subSequence2 = subSequence2.subSequence(1, subSequence2.length());
                                }
                                if (range2.isNotNull() && range3.isNotNull() && subSequence2.length() == 0 && range2.isAdjacentBefore(range3)) {
                                    objArr[0] = range2.expandToInclude(range3);
                                    objArr[1] = null;
                                    objArr[2] = null;
                                    return objArr;
                                }
                                if (range.isNotNull()) {
                                    if (range3.isEmpty() && range3.getStart() < range.getEnd()) {
                                        range3 = range4;
                                    }
                                    if (subSequence2.length() == 0) {
                                        objArr[0] = range2;
                                        objArr[1] = range;
                                        objArr[2] = range3;
                                        return objArr;
                                    }
                                    if (range2.isNull()) {
                                        objArr[0] = range;
                                        objArr[1] = subSequence2;
                                        objArr[2] = range3;
                                        return objArr;
                                    }
                                    if (range3.isNull()) {
                                        objArr[0] = range2;
                                        objArr[1] = range;
                                        objArr[2] = subSequence2;
                                        return objArr;
                                    }
                                    Object[] objArr3 = new Object[objArr.length + 1];
                                    objArr3[0] = range2;
                                    objArr3[1] = range;
                                    objArr3[2] = subSequence2;
                                    objArr3[c6] = range3;
                                    return objArr3;
                                }
                                objArr[0] = range2;
                                objArr[1] = subSequence2;
                                objArr[2] = range3;
                            }
                        }
                    }
                }
            }
        }
        return objArr;
    }
}
