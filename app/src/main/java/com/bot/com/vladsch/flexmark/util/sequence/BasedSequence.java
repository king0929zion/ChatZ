package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;
import com.vladsch.flexmark.util.sequence.builder.SequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentTree;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface BasedSequence extends IRichSequence<BasedSequence>, BasedOptionsHolder {
    public static final BasedSequence NULL = new EmptyBasedSequence();
    public static final BasedSequence EMPTY = new EmptyBasedSequence();
    public static final BasedSequence EOL = CharSubSequence.of((CharSequence) SequenceUtils.EOL);
    public static final BasedSequence SPACE = CharSubSequence.of((CharSequence) SequenceUtils.SPACE);
    public static final List<BasedSequence> EMPTY_LIST = new ArrayList();
    public static final BasedSequence[] EMPTY_ARRAY = new BasedSequence[0];
    public static final BasedSequence[] EMPTY_SEGMENTS = new BasedSequence[0];
    public static final BasedSequence LINE_SEP = CharSubSequence.of((CharSequence) SequenceUtils.LINE_SEP);

    static BasedSequence of(CharSequence charSequence) {
        return BasedSequenceImpl.create(charSequence);
    }

    static BasedSequence ofSpaces(int i6) {
        return of(RepeatedSequence.ofSpaces(i6));
    }

    static BasedSequence repeatOf(char c6, int i6) {
        return of(RepeatedSequence.repeatOf(String.valueOf(c6), 0, i6));
    }

    void addSegments(IBasedSegmentBuilder<?> iBasedSegmentBuilder);

    int baseColumnAtEnd();

    int baseColumnAtIndex(int i6);

    int baseColumnAtStart();

    int baseEndOfLine();

    int baseEndOfLine(int i6);

    int baseEndOfLineAnyEOL();

    int baseEndOfLineAnyEOL(int i6);

    Pair<Integer, Integer> baseLineColumnAtEnd();

    Pair<Integer, Integer> baseLineColumnAtIndex(int i6);

    Pair<Integer, Integer> baseLineColumnAtStart();

    Range baseLineRangeAtEnd();

    Range baseLineRangeAtIndex(int i6);

    Range baseLineRangeAtStart();

    int baseStartOfLine();

    int baseStartOfLine(int i6);

    int baseStartOfLineAnyEOL();

    int baseStartOfLineAnyEOL(int i6);

    BasedSequence baseSubSequence(int i6);

    BasedSequence baseSubSequence(int i6, int i7);

    boolean containsAllOf(BasedSequence basedSequence);

    boolean containsOnlyIn(CharPredicate charPredicate);

    boolean containsOnlyNotIn(CharPredicate charPredicate);

    boolean containsSomeIn(CharPredicate charPredicate);

    boolean containsSomeNotIn(CharPredicate charPredicate);

    boolean containsSomeOf(BasedSequence basedSequence);

    BasedSequence extendByAny(CharPredicate charPredicate);

    BasedSequence extendByAny(CharPredicate charPredicate, int i6);

    BasedSequence extendByAnyNot(CharPredicate charPredicate);

    BasedSequence extendByAnyNot(CharPredicate charPredicate, int i6);

    BasedSequence extendByOneOfAny(CharPredicate charPredicate);

    BasedSequence extendByOneOfAnyNot(CharPredicate charPredicate);

    @Deprecated
    default BasedSequence extendToAny(CharPredicate charPredicate, int i6) {
        return extendByAnyNot(charPredicate, i6);
    }

    BasedSequence extendToEndOfLine();

    BasedSequence extendToEndOfLine(CharPredicate charPredicate);

    BasedSequence extendToEndOfLine(CharPredicate charPredicate, boolean z5);

    BasedSequence extendToEndOfLine(boolean z5);

    BasedSequence extendToStartOfLine();

    BasedSequence extendToStartOfLine(CharPredicate charPredicate);

    BasedSequence extendToStartOfLine(CharPredicate charPredicate, boolean z5);

    BasedSequence extendToStartOfLine(boolean z5);

    Object getBase();

    BasedSequence getBaseSequence();

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    SequenceBuilder getBuilder();

    BasedSequence getEmptyPrefix();

    BasedSequence getEmptySuffix();

    int getEndOffset();

    int getIndexOffset(int i6);

    SegmentTree getSegmentTree();

    Range getSourceRange();

    int getStartOffset();

    BasedSequence intersect(BasedSequence basedSequence);

    boolean isBaseCharAt(int i6, CharPredicate charPredicate);

    boolean isContinuationOf(BasedSequence basedSequence);

    boolean isContinuedBy(BasedSequence basedSequence);

    BasedSequence normalizeEOL(ReplacedTextMapper replacedTextMapper);

    BasedSequence normalizeEndWithEOL(ReplacedTextMapper replacedTextMapper);

    BasedSequence prefixOf(BasedSequence basedSequence);

    BasedSequence prefixWithIndent();

    BasedSequence prefixWithIndent(int i6);

    char safeBaseCharAt(int i6);

    BasedSequence spliceAtEnd(BasedSequence basedSequence);

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    BasedSequence subSequence(int i6, int i7);

    BasedSequence suffixOf(BasedSequence basedSequence);

    BasedSequence unescape(ReplacedTextMapper replacedTextMapper);

    String unescape();

    String unescapeNoEntities();

    /* loaded from: classes.dex */
    public static class EmptyBasedSequence extends BasedSequenceImpl {
        public EmptyBasedSequence() {
            super(0);
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
        public boolean allOptions(int i6) {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
        public boolean anyOptions(int i6) {
            return false;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequenceImpl, com.vladsch.flexmark.util.sequence.BasedSequence
        public BasedSequence baseSubSequence(int i6, int i7) {
            return subSequence(i6, i7);
        }

        @Override // java.lang.CharSequence
        public char charAt(int i6) {
            throw new StringIndexOutOfBoundsException("EMPTY sequence has no characters");
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequence
        public BasedSequence getBase() {
            return this;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequence
        public BasedSequence getBaseSequence() {
            return this;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequence
        public int getEndOffset() {
            return 0;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequence
        public int getIndexOffset(int i6) {
            SequenceUtils.validateIndexInclusiveEnd(i6, length());
            return 0;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
        public <T> T getOption(DataKeyBase<T> dataKeyBase) {
            return dataKeyBase.get(null);
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
        public int getOptionFlags() {
            return 0;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
        public DataHolder getOptions() {
            return null;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequence
        public Range getSourceRange() {
            return Range.NULL;
        }

        @Override // com.vladsch.flexmark.util.sequence.BasedSequence
        public int getStartOffset() {
            return 0;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return 0;
        }

        @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
        public BasedSequence subSequence(int i6, int i7) {
            SequenceUtils.validateStartEnd(i6, i7, length());
            return this;
        }
    }

    static BasedSequence repeatOf(CharSequence charSequence, int i6) {
        return of(RepeatedSequence.repeatOf(charSequence, 0, charSequence.length() * i6));
    }

    @Deprecated
    default BasedSequence extendToAny(CharPredicate charPredicate) {
        return extendByAnyNot(charPredicate);
    }

    static BasedSequence repeatOf(CharSequence charSequence, int i6, int i7) {
        return of(RepeatedSequence.repeatOf(charSequence, i6, i7));
    }
}
