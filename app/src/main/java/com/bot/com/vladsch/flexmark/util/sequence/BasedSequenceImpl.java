package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.builder.BasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree;
import com.vladsch.flexmark.util.sequence.mappers.CharMapper;

/* loaded from: classes.dex */
public abstract class BasedSequenceImpl implements IRichSequenceBase<BasedSequence>, BasedSequence {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public BasedSequenceImpl(int i6) {
        super(i6);
    }

    public static BasedSequence create(CharSequence charSequence) {
        return charSequence == null ? BasedSequence.NULL : charSequence instanceof BasedSequence ? (BasedSequence) charSequence : SubSequence.create(charSequence);
    }

    public static BasedSequence firstNonNull(BasedSequence... basedSequenceArr) {
        for (BasedSequence basedSequence : basedSequenceArr) {
            if (basedSequence != null && basedSequence != BasedSequence.NULL) {
                return basedSequence;
            }
        }
        return BasedSequence.NULL;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder) {
        iBasedSegmentBuilder.append(getStartOffset(), getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseColumnAtEnd() {
        return baseColumnAtIndex(getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseColumnAtIndex(int i6) {
        return getBaseSequence().columnAtIndex(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseColumnAtStart() {
        return baseColumnAtIndex(getStartOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseEndOfLine(int i6) {
        return getBaseSequence().endOfLine(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseEndOfLineAnyEOL(int i6) {
        return getBaseSequence().endOfLineAnyEOL(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Pair<Integer, Integer> baseLineColumnAtEnd() {
        return baseLineColumnAtIndex(getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Pair<Integer, Integer> baseLineColumnAtIndex(int i6) {
        return getBaseSequence().lineColumnAtIndex(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Pair<Integer, Integer> baseLineColumnAtStart() {
        return baseLineColumnAtIndex(getStartOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Range baseLineRangeAtEnd() {
        return baseLineRangeAtIndex(getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Range baseLineRangeAtIndex(int i6) {
        return getBaseSequence().lineRangeAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public Range baseLineRangeAtStart() {
        return baseLineRangeAtIndex(getStartOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseStartOfLine(int i6) {
        return getBaseSequence().startOfLine(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseStartOfLineAnyEOL(int i6) {
        return getBaseSequence().startOfLineAnyEOL(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence baseSubSequence(int i6) {
        return baseSubSequence(i6, getBaseSequence().getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean containsAllOf(BasedSequence basedSequence) {
        return getBase() == basedSequence.getBase() && basedSequence.getStartOffset() >= getStartOffset() && basedSequence.getEndOffset() <= getEndOffset();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean containsOnlyIn(CharPredicate charPredicate) {
        return !containsSomeNotIn(charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean containsOnlyNotIn(CharPredicate charPredicate) {
        return !containsSomeIn(charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean containsSomeIn(CharPredicate charPredicate) {
        int length = length();
        for (int i6 = 0; i6 < length; i6++) {
            if (charPredicate.test(charAt(i6))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean containsSomeNotIn(CharPredicate charPredicate) {
        int length = length();
        for (int i6 = 0; i6 < length; i6++) {
            if (!charPredicate.test(charAt(i6))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean containsSomeOf(BasedSequence basedSequence) {
        return getBase() == basedSequence.getBase() && getStartOffset() < basedSequence.getEndOffset() && getEndOffset() > basedSequence.getStartOffset();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendByAny(CharPredicate charPredicate) {
        return extendByAny(charPredicate, TableCell.NOT_TRACKED - getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendByAnyNot(CharPredicate charPredicate) {
        return extendByAnyNot(charPredicate, TableCell.NOT_TRACKED - getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendByOneOfAny(CharPredicate charPredicate) {
        return extendByAny(charPredicate, 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendByOneOfAnyNot(CharPredicate charPredicate) {
        return extendByAnyNot(charPredicate, 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToEndOfLine(CharPredicate charPredicate) {
        return extendToEndOfLine(charPredicate, false);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToStartOfLine(CharPredicate charPredicate) {
        return extendToStartOfLine(charPredicate, false);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence getEmptyPrefix() {
        return subSequence(0, 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence getEmptySuffix() {
        return subSequence(length());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public SegmentTree getSegmentTree() {
        BasedSegmentBuilder emptyBuilder = BasedSegmentBuilder.emptyBuilder(getBaseSequence());
        addSegments(emptyBuilder);
        return SegmentTree.build(emptyBuilder.getSegments(), emptyBuilder.getText());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence intersect(BasedSequence basedSequence) {
        return getBase() != basedSequence.getBase() ? BasedSequence.NULL : basedSequence.getEndOffset() <= getStartOffset() ? subSequence(0, 0) : basedSequence.getStartOffset() >= getEndOffset() ? subSequence(length(), length()) : baseSubSequence(Utils.max(getStartOffset(), basedSequence.getStartOffset()), Utils.min(getEndOffset(), basedSequence.getEndOffset()));
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean isBaseCharAt(int i6, CharPredicate charPredicate) {
        return charPredicate.test(safeBaseCharAt(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean isContinuationOf(BasedSequence basedSequence) {
        return basedSequence.length() > 0 && length() > 0 && basedSequence.getBase() == getBase() && basedSequence.getEndOffset() == getStartOffset();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public boolean isContinuedBy(BasedSequence basedSequence) {
        return basedSequence.length() > 0 && length() > 0 && basedSequence.getBase() == getBase() && basedSequence.getStartOffset() == getEndOffset();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence normalizeEOL(ReplacedTextMapper replacedTextMapper) {
        return Escaping.normalizeEOL(this, replacedTextMapper);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence normalizeEndWithEOL(ReplacedTextMapper replacedTextMapper) {
        return Escaping.normalizeEndWithEOL(this, replacedTextMapper);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence prefixOf(BasedSequence basedSequence) {
        return getBase() != basedSequence.getBase() ? BasedSequence.NULL : basedSequence.getStartOffset() <= getStartOffset() ? subSequence(0, 0) : basedSequence.getStartOffset() >= getEndOffset() ? this : baseSubSequence(getStartOffset(), basedSequence.getStartOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence prefixWithIndent() {
        return prefixWithIndent(TableCell.NOT_TRACKED);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public char safeBaseCharAt(int i6) {
        int startOffset = getStartOffset();
        return (i6 < startOffset || i6 >= length() + startOffset) ? getBaseSequence().safeCharAt(i6) : charAt(i6 - startOffset);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequenceBase, com.vladsch.flexmark.util.sequence.IRichSequence
    public char safeCharAt(int i6) {
        if (i6 < 0 || i6 >= length()) {
            return (char) 0;
        }
        return charAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence spliceAtEnd(BasedSequence basedSequence) {
        return basedSequence.isEmpty() ? this : isEmpty() ? basedSequence : baseSubSequence(getStartOffset(), basedSequence.getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence suffixOf(BasedSequence basedSequence) {
        return getBase() != basedSequence.getBase() ? BasedSequence.NULL : basedSequence.getEndOffset() >= getEndOffset() ? subSequence(length(), length()) : basedSequence.getEndOffset() <= getStartOffset() ? this : baseSubSequence(basedSequence.getEndOffset(), getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequenceBase, com.vladsch.flexmark.util.sequence.IRichSequence
    public String toStringOrNull() {
        if (isNull()) {
            return null;
        }
        return toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public String unescape() {
        return Escaping.unescapeString(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public String unescapeNoEntities() {
        return Escaping.unescapeString(this, false);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseEndOfLine() {
        return baseEndOfLine(getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseEndOfLineAnyEOL() {
        return baseEndOfLineAnyEOL(getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseStartOfLine() {
        return baseStartOfLine(getStartOffset());
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public int baseStartOfLineAnyEOL() {
        return baseStartOfLineAnyEOL(getStartOffset());
    }

    public BasedSequence baseSubSequence(int i6, int i7) {
        return getBaseSequence().subSequence(i6, i7);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence[] emptyArray() {
        return BasedSequence.EMPTY_ARRAY;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendByAny(CharPredicate charPredicate, int i6) {
        int countLeading = getBaseSequence().countLeading(charPredicate, getEndOffset(), getEndOffset() + i6);
        return countLeading == 0 ? this : baseSubSequence(getStartOffset(), getEndOffset() + countLeading);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendByAnyNot(CharPredicate charPredicate, int i6) {
        int countLeadingNot = getBaseSequence().countLeadingNot(charPredicate, getEndOffset(), getEndOffset() + i6);
        return countLeadingNot == getBaseSequence().length() - getEndOffset() ? this : baseSubSequence(getStartOffset(), getEndOffset() + countLeadingNot + 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToEndOfLine(boolean z5) {
        return extendToEndOfLine(CharPredicate.EOL, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToStartOfLine(boolean z5) {
        return extendToStartOfLine(CharPredicate.EOL, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public SequenceBuilder getBuilder() {
        return SequenceBuilder.emptyBuilder(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence nullSequence() {
        return BasedSequence.NULL;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.IRichSequenceBase, com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence prefixWith(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? this : PrefixedSubSequence.prefixOf(charSequence.toString(), this);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence prefixWithIndent(int i6) {
        int startOffset = getStartOffset();
        int startOffset2 = getStartOffset();
        int i7 = 0;
        boolean z5 = false;
        while (true) {
            if (startOffset2 < 0) {
                break;
            }
            char charAt = getBaseSequence().charAt(startOffset2);
            if (charAt != '\t') {
                if (charAt == '\n') {
                    startOffset2++;
                    break;
                }
            } else {
                z5 = true;
            }
            startOffset2--;
        }
        if (startOffset2 < 0) {
            startOffset2 = 0;
        }
        if (startOffset2 < startOffset) {
            if (!z5) {
                while (i7 < i6 && startOffset > 0) {
                    int i8 = startOffset - 1;
                    if (getBaseSequence().charAt(i8) != ' ' && getBaseSequence().charAt(i8) != '\t') {
                        break;
                    }
                    i7++;
                    startOffset--;
                }
            } else {
                int[] iArr = new int[startOffset - startOffset2];
                int i9 = 0;
                for (int i10 = startOffset2; i10 < startOffset; i10++) {
                    if (getBaseSequence().charAt(i10) == '\t') {
                        int i11 = 4 - (i9 % 4);
                        iArr[i10 - startOffset2] = i11;
                        i9 += i11;
                    } else {
                        iArr[i10 - startOffset2] = 1;
                        i9++;
                    }
                }
                while (i7 < i6 && startOffset > 0) {
                    int i12 = startOffset - 1;
                    if ((getBaseSequence().charAt(i12) != ' ' && getBaseSequence().charAt(i12) != '\t') || (i7 = i7 + iArr[i12 - startOffset2]) > i6) {
                        break;
                    }
                    startOffset--;
                }
            }
        }
        return startOffset == getStartOffset() ? this : baseSubSequence(startOffset, getEndOffset());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence sequenceOf(CharSequence charSequence, int i6, int i7) {
        return BasedSequence.of(charSequence).subSequence(i6, i7);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public BasedSequence toMapped(CharMapper charMapper) {
        return MappedBasedSequence.mappedOf(this, charMapper);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence unescape(ReplacedTextMapper replacedTextMapper) {
        return Escaping.unescape(this, replacedTextMapper);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToEndOfLine() {
        return extendToEndOfLine(CharPredicate.EOL, false);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToStartOfLine() {
        return extendToStartOfLine(CharPredicate.EOL, false);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public final BasedSequence extendToEndOfLine(CharPredicate charPredicate, boolean z5) {
        int endOffset = getEndOffset();
        if (!charPredicate.test(lastChar())) {
            BasedSequence baseSequence = getBaseSequence();
            int endOfLine = baseSequence.endOfLine(endOffset);
            if (z5) {
                endOfLine = Math.min(baseSequence.length(), Math.min(baseSequence.eolStartLength(endOfLine), 1) + endOfLine);
            }
            if (endOfLine != endOffset) {
                return baseSequence.subSequence(getStartOffset(), endOfLine);
            }
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedSequence
    public BasedSequence extendToStartOfLine(CharPredicate charPredicate, boolean z5) {
        int startOffset = getStartOffset();
        if (!charPredicate.test(firstChar())) {
            BasedSequence baseSequence = getBaseSequence();
            int startOfLine = baseSequence.startOfLine(startOffset);
            if (z5) {
                startOfLine = Math.max(0, startOfLine - Math.min(baseSequence.eolEndLength(startOfLine), 1));
            }
            if (startOfLine != startOffset) {
                return baseSequence.subSequence(startOfLine, getEndOffset());
            }
        }
        return this;
    }
}
