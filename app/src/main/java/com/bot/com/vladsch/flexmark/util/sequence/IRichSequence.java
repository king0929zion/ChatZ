package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.sequence.IRichSequence;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.mappers.CharMapper;
import java.util.Collection;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public interface IRichSequence<T extends IRichSequence<T>> extends CharSequence, Comparable<CharSequence>, SequenceUtils {
    T append(Iterable<? extends CharSequence> iterable);

    T append(CharSequence... charSequenceArr);

    T appendEOL();

    T appendRangesTo(StringBuilder sb, CharMapper charMapper, Iterable<? extends Range> iterable);

    T appendRangesTo(StringBuilder sb, CharMapper charMapper, Range... rangeArr);

    T appendRangesTo(StringBuilder sb, Iterable<? extends Range> iterable);

    T appendRangesTo(StringBuilder sb, Range... rangeArr);

    T appendSpace();

    T appendSpaces(int i6);

    T appendTo(StringBuilder sb);

    T appendTo(StringBuilder sb, int i6);

    T appendTo(StringBuilder sb, int i6, int i7);

    T appendTo(StringBuilder sb, CharMapper charMapper);

    T appendTo(StringBuilder sb, CharMapper charMapper, int i6);

    T appendTo(StringBuilder sb, CharMapper charMapper, int i6, int i7);

    List<Range> blankLinesRemovedRanges();

    List<Range> blankLinesRemovedRanges(int i6);

    List<Range> blankLinesRemovedRanges(int i6, int i7);

    List<Range> blankLinesRemovedRanges(CharPredicate charPredicate, int i6, int i7);

    int columnAtIndex(int i6);

    @Deprecated
    default int countLeading(char c6) {
        return countLeading(CharPredicate.anyOf(c6));
    }

    int countLeading(CharPredicate charPredicate);

    int countLeading(CharPredicate charPredicate, int i6);

    int countLeading(CharPredicate charPredicate, int i6, int i7);

    int countLeadingColumns(int i6, CharPredicate charPredicate);

    int countLeadingNot(CharPredicate charPredicate);

    int countLeadingNot(CharPredicate charPredicate, int i6);

    int countLeadingNot(CharPredicate charPredicate, int i6, int i7);

    int countLeadingNotSpace();

    int countLeadingNotSpace(int i6);

    int countLeadingNotSpace(int i6, int i7);

    int countLeadingNotSpaceTab();

    int countLeadingNotSpaceTab(int i6);

    int countLeadingNotSpaceTab(int i6, int i7);

    int countLeadingNotWhitespace();

    int countLeadingNotWhitespace(int i6);

    int countLeadingNotWhitespace(int i6, int i7);

    int countLeadingSpace();

    int countLeadingSpace(int i6);

    int countLeadingSpace(int i6, int i7);

    int countLeadingSpaceTab();

    int countLeadingSpaceTab(int i6);

    int countLeadingSpaceTab(int i6, int i7);

    int countLeadingWhitespace();

    int countLeadingWhitespace(int i6);

    int countLeadingWhitespace(int i6, int i7);

    @Deprecated
    default int countOf(char c6) {
        return countOfAny(CharPredicate.anyOf(c6));
    }

    int countOfAny(CharPredicate charPredicate);

    int countOfAny(CharPredicate charPredicate, int i6);

    int countOfAny(CharPredicate charPredicate, int i6, int i7);

    int countOfAnyNot(CharPredicate charPredicate);

    int countOfAnyNot(CharPredicate charPredicate, int i6);

    int countOfAnyNot(CharPredicate charPredicate, int i6, int i7);

    int countOfNotSpaceTab();

    int countOfNotWhitespace();

    int countOfSpaceTab();

    int countOfWhitespace();

    @Deprecated
    default int countTrailing() {
        return countLeadingSpaceTab();
    }

    int countTrailing(CharPredicate charPredicate);

    int countTrailing(CharPredicate charPredicate, int i6);

    int countTrailing(CharPredicate charPredicate, int i6, int i7);

    int countTrailingNot(CharPredicate charPredicate);

    int countTrailingNot(CharPredicate charPredicate, int i6);

    int countTrailingNot(CharPredicate charPredicate, int i6, int i7);

    int countTrailingNotSpace();

    int countTrailingNotSpace(int i6);

    int countTrailingNotSpace(int i6, int i7);

    int countTrailingNotSpaceTab();

    int countTrailingNotSpaceTab(int i6);

    int countTrailingNotSpaceTab(int i6, int i7);

    int countTrailingNotWhitespace();

    int countTrailingNotWhitespace(int i6);

    int countTrailingNotWhitespace(int i6, int i7);

    int countTrailingSpace();

    int countTrailingSpace(int i6);

    int countTrailingSpace(int i6, int i7);

    int countTrailingSpaceTab();

    int countTrailingSpaceTab(int i6);

    int countTrailingSpaceTab(int i6, int i7);

    int countTrailingWhitespace();

    int countTrailingWhitespace(int i6);

    int countTrailingWhitespace(int i6, int i7);

    T delete(int i6, int i7);

    T[] emptyArray();

    char endCharAt(int i6);

    int endOfDelimitedBy(CharSequence charSequence, int i6);

    int endOfDelimitedByAny(CharPredicate charPredicate, int i6);

    int endOfDelimitedByAnyNot(CharPredicate charPredicate, int i6);

    int endOfLine(int i6);

    int endOfLineAnyEOL(int i6);

    T endSequence(int i6);

    T endSequence(int i6, int i7);

    boolean endsWith(CharPredicate charPredicate);

    boolean endsWith(CharSequence charSequence);

    /* renamed from: endsWith */
    boolean lambda$nullIfNotEndsWith$5(CharSequence charSequence, boolean z5);

    boolean endsWithAnyEOL();

    boolean endsWithEOL();

    boolean endsWithIgnoreCase(CharSequence charSequence);

    boolean endsWithSpace();

    boolean endsWithSpaceTab();

    boolean endsWithWhitespace();

    int eolEndLength();

    int eolEndLength(int i6);

    Range eolEndRange(int i6);

    @Deprecated
    default int eolLength(int i6) {
        return eolStartLength(i6);
    }

    @Deprecated
    default int eolStartLength() {
        return eolEndLength();
    }

    int eolStartLength(int i6);

    Range eolStartRange(int i6);

    boolean equals(Object obj);

    boolean equals(Object obj, boolean z5);

    boolean equalsIgnoreCase(Object obj);

    T extractRanges(Iterable<Range> iterable);

    T extractRanges(Range... rangeArr);

    char firstChar();

    <B extends ISequenceBuilder<B, T>> B getBuilder();

    @Deprecated
    default int getColumnAtIndex(int i6) {
        return columnAtIndex(i6);
    }

    @Deprecated
    default Pair<Integer, Integer> getLineColumnAtIndex(int i6) {
        return lineColumnAtIndex(i6);
    }

    int hashCode();

    T ifNull(T t5);

    T ifNullEmptyAfter(T t5);

    T ifNullEmptyBefore(T t5);

    int indexOf(char c6);

    int indexOf(char c6, int i6);

    int indexOf(char c6, int i6, int i7);

    int indexOf(CharSequence charSequence);

    int indexOf(CharSequence charSequence, int i6);

    int indexOf(CharSequence charSequence, int i6, int i7);

    int[] indexOfAll(CharSequence charSequence);

    int indexOfAny(CharPredicate charPredicate);

    int indexOfAny(CharPredicate charPredicate, int i6);

    int indexOfAny(CharPredicate charPredicate, int i6, int i7);

    int indexOfAnyNot(CharPredicate charPredicate);

    int indexOfAnyNot(CharPredicate charPredicate, int i6);

    int indexOfAnyNot(CharPredicate charPredicate, int i6, int i7);

    int indexOfNot(char c6);

    int indexOfNot(char c6, int i6);

    int indexOfNot(char c6, int i6, int i7);

    T insert(int i6, CharSequence charSequence);

    @Deprecated
    default T insert(CharSequence charSequence, int i6) {
        return insert(i6, charSequence);
    }

    boolean isBlank();

    boolean isCharAt(int i6, CharPredicate charPredicate);

    boolean isEmpty();

    boolean isIn(Collection<? extends CharSequence> collection);

    boolean isIn(String[] strArr);

    boolean isNotBlank();

    boolean isNotEmpty();

    boolean isNotNull();

    boolean isNull();

    char lastChar();

    int lastIndexOf(char c6);

    int lastIndexOf(char c6, int i6);

    int lastIndexOf(char c6, int i6, int i7);

    int lastIndexOf(CharSequence charSequence);

    int lastIndexOf(CharSequence charSequence, int i6);

    int lastIndexOf(CharSequence charSequence, int i6, int i7);

    int lastIndexOfAny(CharPredicate charPredicate);

    int lastIndexOfAny(CharPredicate charPredicate, int i6);

    int lastIndexOfAny(CharPredicate charPredicate, int i6, int i7);

    int lastIndexOfAnyNot(CharPredicate charPredicate);

    int lastIndexOfAnyNot(CharPredicate charPredicate, int i6);

    int lastIndexOfAnyNot(CharPredicate charPredicate, int i6, int i7);

    int lastIndexOfNot(char c6);

    int lastIndexOfNot(char c6, int i6);

    int lastIndexOfNot(char c6, int i6, int i7);

    Range leadingBlankLinesRange();

    Range leadingBlankLinesRange(int i6);

    Range leadingBlankLinesRange(int i6, int i7);

    Range leadingBlankLinesRange(CharPredicate charPredicate, int i6, int i7);

    T lineAt(int i6);

    T lineAtAnyEOL(int i6);

    Pair<Integer, Integer> lineColumnAtIndex(int i6);

    Range lineRangeAt(int i6);

    Range lineRangeAtAnyEOL(int i6);

    boolean matchChars(CharSequence charSequence);

    boolean matchChars(CharSequence charSequence, int i6);

    boolean matchChars(CharSequence charSequence, int i6, boolean z5);

    boolean matchChars(CharSequence charSequence, boolean z5);

    boolean matchCharsIgnoreCase(CharSequence charSequence);

    boolean matchCharsIgnoreCase(CharSequence charSequence, int i6);

    boolean matchCharsReversed(CharSequence charSequence, int i6);

    boolean matchCharsReversed(CharSequence charSequence, int i6, boolean z5);

    boolean matchCharsReversedIgnoreCase(CharSequence charSequence, int i6);

    int matchedCharCount(CharSequence charSequence, int i6);

    int matchedCharCount(CharSequence charSequence, int i6, int i7);

    int matchedCharCount(CharSequence charSequence, int i6, int i7, boolean z5);

    int matchedCharCount(CharSequence charSequence, int i6, int i7, boolean z5, boolean z6);

    int matchedCharCount(CharSequence charSequence, int i6, boolean z5);

    int matchedCharCountIgnoreCase(CharSequence charSequence, int i6);

    int matchedCharCountIgnoreCase(CharSequence charSequence, int i6, int i7);

    int matchedCharCountReversed(CharSequence charSequence, int i6);

    int matchedCharCountReversed(CharSequence charSequence, int i6, int i7);

    int matchedCharCountReversed(CharSequence charSequence, int i6, int i7, boolean z5);

    int matchedCharCountReversed(CharSequence charSequence, int i6, boolean z5);

    int matchedCharCountReversedIgnoreCase(CharSequence charSequence, int i6);

    int matchedCharCountReversedIgnoreCase(CharSequence charSequence, int i6, int i7);

    boolean matches(CharSequence charSequence);

    boolean matches(CharSequence charSequence, boolean z5);

    boolean matchesIgnoreCase(CharSequence charSequence);

    char midCharAt(int i6);

    T midSequence(int i6);

    T midSequence(int i6, int i7);

    String normalizeEOL();

    String normalizeEndWithEOL();

    T nullIf(BiPredicate<? super T, ? super CharSequence> biPredicate, CharSequence... charSequenceArr);

    T nullIf(Predicate<? super CharSequence> predicate, CharSequence... charSequenceArr);

    T nullIf(boolean z5);

    T nullIf(CharSequence... charSequenceArr);

    T nullIfBlank();

    T nullIfEmpty();

    T nullIfEndsWith(boolean z5, CharSequence... charSequenceArr);

    T nullIfEndsWith(CharSequence... charSequenceArr);

    T nullIfEndsWithIgnoreCase(CharSequence... charSequenceArr);

    @Deprecated
    default T nullIfEndsWithNot(CharSequence... charSequenceArr) {
        return nullIfNotEndsWith(charSequenceArr);
    }

    T nullIfNot(BiPredicate<? super T, ? super CharSequence> biPredicate, CharSequence... charSequenceArr);

    T nullIfNot(Predicate<? super CharSequence> predicate, CharSequence... charSequenceArr);

    T nullIfNot(CharSequence... charSequenceArr);

    T nullIfNotEndsWith(boolean z5, CharSequence... charSequenceArr);

    T nullIfNotEndsWith(CharSequence... charSequenceArr);

    T nullIfNotEndsWithIgnoreCase(CharSequence... charSequenceArr);

    T nullIfNotStartsWith(boolean z5, CharSequence... charSequenceArr);

    T nullIfNotStartsWith(CharSequence... charSequenceArr);

    T nullIfNotStartsWithIgnoreCase(CharSequence... charSequenceArr);

    T nullIfStartsWith(boolean z5, CharSequence... charSequenceArr);

    T nullIfStartsWith(CharSequence... charSequenceArr);

    T nullIfStartsWithIgnoreCase(CharSequence... charSequenceArr);

    @Deprecated
    default T nullIfStartsWithNot(CharSequence... charSequenceArr) {
        return nullIfNotStartsWith(charSequenceArr);
    }

    T nullSequence();

    T padEnd(int i6);

    T padEnd(int i6, char c6);

    T padStart(int i6);

    T padStart(int i6, char c6);

    T padding(int i6);

    T padding(int i6, char c6);

    T prefixOnceWith(CharSequence charSequence);

    T prefixOnceWithEOL();

    T prefixOnceWithSpace();

    T prefixWith(CharSequence charSequence);

    T prefixWithEOL();

    T prefixWithSpace();

    T prefixWithSpaces(int i6);

    T removePrefix(CharSequence charSequence);

    T removePrefix(CharSequence charSequence, boolean z5);

    T removePrefixIgnoreCase(CharSequence charSequence);

    T removeProperPrefix(CharSequence charSequence);

    T removeProperPrefix(CharSequence charSequence, boolean z5);

    T removeProperPrefixIgnoreCase(CharSequence charSequence);

    T removeProperSuffix(CharSequence charSequence);

    T removeProperSuffix(CharSequence charSequence, boolean z5);

    T removeProperSuffixIgnoreCase(CharSequence charSequence);

    T removeSuffix(CharSequence charSequence);

    T removeSuffix(CharSequence charSequence, boolean z5);

    T removeSuffixIgnoreCase(CharSequence charSequence);

    T replace(int i6, int i7, CharSequence charSequence);

    T replace(CharSequence charSequence, CharSequence charSequence2);

    char safeCharAt(int i6);

    T safeSubSequence(int i6);

    T safeSubSequence(int i6, int i7);

    T sequenceOf(CharSequence charSequence);

    T sequenceOf(CharSequence charSequence, int i6);

    T sequenceOf(CharSequence charSequence, int i6, int i7);

    @Deprecated
    default T[] split(char c6, int i6, int i7) {
        return split(Character.toString(c6), i6, i7, (CharPredicate) null);
    }

    T[] split(CharSequence charSequence);

    T[] split(CharSequence charSequence, int i6, int i7);

    T[] split(CharSequence charSequence, int i6, int i7, CharPredicate charPredicate);

    T[] split(CharSequence charSequence, int i6, boolean z5, CharPredicate charPredicate);

    T[] split(CharSequence charSequence, boolean z5, CharPredicate charPredicate);

    T[] splitEOL();

    T[] splitEOL(boolean z5);

    List<T> splitList(CharSequence charSequence);

    List<T> splitList(CharSequence charSequence, int i6, int i7);

    List<T> splitList(CharSequence charSequence, int i6, int i7, CharPredicate charPredicate);

    List<T> splitList(CharSequence charSequence, int i6, boolean z5, CharPredicate charPredicate);

    List<T> splitList(CharSequence charSequence, boolean z5, CharPredicate charPredicate);

    List<T> splitListEOL();

    List<T> splitListEOL(boolean z5);

    List<T> splitListEOL(boolean z5, CharPredicate charPredicate);

    int startOfDelimitedBy(CharSequence charSequence, int i6);

    int startOfDelimitedByAny(CharPredicate charPredicate, int i6);

    int startOfDelimitedByAnyNot(CharPredicate charPredicate, int i6);

    int startOfLine(int i6);

    int startOfLineAnyEOL(int i6);

    boolean startsWith(CharPredicate charPredicate);

    boolean startsWith(CharSequence charSequence);

    /* renamed from: startsWith */
    boolean lambda$nullIfStartsWith$2(CharSequence charSequence, boolean z5);

    boolean startsWithAnyEOL();

    boolean startsWithEOL();

    boolean startsWithIgnoreCase(CharSequence charSequence);

    boolean startsWithSpace();

    boolean startsWithSpaceTab();

    boolean startsWithWhitespace();

    T subSequence(int i6);

    @Override // java.lang.CharSequence
    T subSequence(int i6, int i7);

    T subSequence(Range range);

    T subSequenceAfter(Range range);

    T subSequenceBefore(Range range);

    T suffixOnceWith(CharSequence charSequence);

    T suffixOnceWithEOL();

    T suffixOnceWithSpace();

    T suffixWith(CharSequence charSequence);

    T suffixWithEOL();

    T suffixWithSpace();

    T suffixWithSpaces(int i6);

    T toLowerCase();

    T toMapped(CharMapper charMapper);

    T toNbSp();

    T toSpc();

    String toStringOrNull();

    T toUpperCase();

    String toVisibleWhitespaceString();

    Range trailingBlankLinesRange();

    Range trailingBlankLinesRange(int i6);

    Range trailingBlankLinesRange(int i6, int i7);

    Range trailingBlankLinesRange(CharPredicate charPredicate, int i6, int i7);

    T trim();

    T trim(int i6);

    T trim(int i6, CharPredicate charPredicate);

    T trim(CharPredicate charPredicate);

    T trimEOL();

    T trimEnd();

    T trimEnd(int i6);

    T trimEnd(int i6, CharPredicate charPredicate);

    T trimEnd(CharPredicate charPredicate);

    Range trimEndRange();

    Range trimEndRange(int i6);

    Range trimEndRange(int i6, CharPredicate charPredicate);

    Range trimEndRange(CharPredicate charPredicate);

    T trimLeadBlankLines();

    Range trimRange();

    Range trimRange(int i6);

    Range trimRange(int i6, CharPredicate charPredicate);

    Range trimRange(CharPredicate charPredicate);

    T trimStart();

    T trimStart(int i6);

    T trimStart(int i6, CharPredicate charPredicate);

    T trimStart(CharPredicate charPredicate);

    Range trimStartRange();

    Range trimStartRange(int i6);

    Range trimStartRange(int i6, CharPredicate charPredicate);

    Range trimStartRange(CharPredicate charPredicate);

    T trimTailBlankLines();

    T trimToEndOfLine();

    T trimToEndOfLine(int i6);

    T trimToEndOfLine(CharPredicate charPredicate, boolean z5, int i6);

    T trimToEndOfLine(boolean z5);

    T trimToEndOfLine(boolean z5, int i6);

    T trimToStartOfLine();

    T trimToStartOfLine(int i6);

    T trimToStartOfLine(CharPredicate charPredicate, boolean z5, int i6);

    T trimToStartOfLine(boolean z5);

    T trimToStartOfLine(boolean z5, int i6);

    Pair<T, T> trimmed();

    Pair<T, T> trimmed(int i6);

    Pair<T, T> trimmed(int i6, CharPredicate charPredicate);

    Pair<T, T> trimmed(CharPredicate charPredicate);

    T trimmedEOL();

    T trimmedEnd();

    T trimmedEnd(int i6);

    T trimmedEnd(int i6, CharPredicate charPredicate);

    T trimmedEnd(CharPredicate charPredicate);

    T trimmedStart();

    T trimmedStart(int i6);

    T trimmedStart(int i6, CharPredicate charPredicate);

    T trimmedStart(CharPredicate charPredicate);

    @Deprecated
    default int countLeading() {
        return countLeadingSpaceTab();
    }

    @Deprecated
    default T[] split(char c6, int i6) {
        return split(Character.toString(c6), i6, 0, (CharPredicate) null);
    }

    @Deprecated
    default T[] split(char c6) {
        return split(Character.toString(c6), 0, 0, (CharPredicate) null);
    }
}
