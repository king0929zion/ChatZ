package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.collection.iteration.ArrayIterable;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.IRichSequence;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.mappers.ChangeCase;
import com.vladsch.flexmark.util.sequence.mappers.CharMapper;
import com.vladsch.flexmark.util.sequence.mappers.SpaceMapper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public abstract class IRichSequenceBase<T extends IRichSequence<T>> implements IRichSequence<T> {
    private int hash;

    public IRichSequenceBase(int i6) {
        this.hash = i6;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T append(CharSequence... charSequenceArr) {
        return append(new ArrayIterable(charSequenceArr));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendEOL() {
        return suffixWith(SequenceUtils.EOL);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendRangesTo(StringBuilder sb, CharMapper charMapper, Range... rangeArr) {
        return appendRangesTo(sb, charMapper, new ArrayIterable(rangeArr));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendSpace() {
        return suffixWith(SequenceUtils.SPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendSpaces(int i6) {
        return suffixWith(RepeatedSequence.ofSpaces(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendTo(StringBuilder sb, CharMapper charMapper) {
        return appendTo(sb, charMapper, 0, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<Range> blankLinesRemovedRanges() {
        return SequenceUtils.blankLinesRemovedRanges(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int columnAtIndex(int i6) {
        return SequenceUtils.columnAtIndex(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeading(CharPredicate charPredicate) {
        return SequenceUtils.countLeading(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingColumns(int i6, CharPredicate charPredicate) {
        return SequenceUtils.countLeadingColumns(this, i6, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNot(CharPredicate charPredicate) {
        return SequenceUtils.countLeadingNot(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotSpace() {
        return SequenceUtils.countLeadingNotSpace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotSpaceTab() {
        return SequenceUtils.countLeadingNotSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotWhitespace() {
        return SequenceUtils.countLeadingNotWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingSpace() {
        return SequenceUtils.countLeadingSpace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingSpaceTab() {
        return SequenceUtils.countLeadingSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingWhitespace() {
        return SequenceUtils.countLeadingWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfAny(CharPredicate charPredicate, int i6) {
        return SequenceUtils.countOfAny(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfAnyNot(CharPredicate charPredicate, int i6) {
        return SequenceUtils.countOfAnyNot(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfNotSpaceTab() {
        return SequenceUtils.countOfNotSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfNotWhitespace() {
        return SequenceUtils.countOfNotWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfSpaceTab() {
        return SequenceUtils.countOfSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfWhitespace() {
        return SequenceUtils.countOfWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailing(CharPredicate charPredicate) {
        return SequenceUtils.countTrailing(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNot(CharPredicate charPredicate) {
        return SequenceUtils.countTrailingNot(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotSpace() {
        return SequenceUtils.countTrailingNotSpace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotSpaceTab() {
        return SequenceUtils.countTrailingNotSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotWhitespace() {
        return SequenceUtils.countTrailingNotWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingSpace() {
        return SequenceUtils.countTrailingSpace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingSpaceTab() {
        return SequenceUtils.countTrailingSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingWhitespace() {
        return SequenceUtils.countTrailingWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T delete(int i6, int i7) {
        int max = Math.max(0, Math.min(length(), i7));
        int min = Math.min(max, Math.max(0, i6));
        return min == max ? this : min == 0 ? subSequence(max) : max == length() ? subSequence(0, min) : (T) getBuilder().add(subSequence(0, min)).add(subSequence(max)).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final char endCharAt(int i6) {
        int length = length();
        if (i6 < 0 || i6 >= length) {
            return (char) 0;
        }
        return charAt(length - i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int endOfDelimitedBy(CharSequence charSequence, int i6) {
        return SequenceUtils.endOfDelimitedBy(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int endOfDelimitedByAny(CharPredicate charPredicate, int i6) {
        return SequenceUtils.endOfDelimitedByAny(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int endOfDelimitedByAnyNot(CharPredicate charPredicate, int i6) {
        return endOfDelimitedByAny(charPredicate.negate(), i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int endOfLine(int i6) {
        return SequenceUtils.endOfLine(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int endOfLineAnyEOL(int i6) {
        return SequenceUtils.endOfLineAnyEOL(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T endSequence(int i6, int i7) {
        int length = length();
        int rangeLimit = Utils.rangeLimit(length - i7, 0, length);
        return subSequence(Utils.rangeLimit(length - i6, 0, rangeLimit), rangeLimit);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWith(CharSequence charSequence) {
        return SequenceUtils.endsWith(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWithAnyEOL() {
        return SequenceUtils.endsWithAnyEOL(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWithEOL() {
        return SequenceUtils.endsWithEOL(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWithIgnoreCase(CharSequence charSequence) {
        return length() > 0 && matchCharsReversed(charSequence, length() - 1, true);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWithSpace() {
        return SequenceUtils.endsWithSpace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWithSpaceTab() {
        return SequenceUtils.endsWithSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWithWhitespace() {
        return SequenceUtils.endsWithWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int eolEndLength() {
        return SequenceUtils.eolEndLength(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range eolEndRange(int i6) {
        return SequenceUtils.eolEndRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int eolStartLength(int i6) {
        return SequenceUtils.eolStartLength(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public Range eolStartRange(int i6) {
        return SequenceUtils.eolStartRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean equals(Object obj) {
        return SequenceUtils.equals(this, obj);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean equalsIgnoreCase(Object obj) {
        if (this != obj) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() != length() || !matchChars(charSequence, 0, true)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T extractRanges(Range... rangeArr) {
        return extractRanges(new ArrayIterable(rangeArr));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final char firstChar() {
        if (isEmpty()) {
            return (char) 0;
        }
        return charAt(0);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int hashCode() {
        int i6 = this.hash;
        if (i6 != 0 || length() <= 0) {
            return i6;
        }
        int hashCode = SequenceUtils.hashCode(this);
        this.hash = hashCode;
        return hashCode;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T ifNull(T t5) {
        return isNull() ? t5 : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T ifNullEmptyAfter(T t5) {
        return isNull() ? (T) t5.subSequence(t5.length(), t5.length()) : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T ifNullEmptyBefore(T t5) {
        return isNull() ? (T) t5.subSequence(0, 0) : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOf(CharSequence charSequence) {
        return SequenceUtils.indexOf(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int[] indexOfAll(CharSequence charSequence) {
        return SequenceUtils.indexOfAll(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfAny(CharPredicate charPredicate) {
        return SequenceUtils.indexOfAny(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfAnyNot(CharPredicate charPredicate) {
        return SequenceUtils.indexOfAnyNot(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfNot(char c6) {
        return SequenceUtils.indexOfNot(this, c6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T insert(int i6, CharSequence charSequence) {
        int max = Math.max(0, Math.min(length(), i6));
        return charSequence.length() == 0 ? this : max == 0 ? prefixWith(charSequence) : max == length() ? suffixWith(charSequence) : (T) getBuilder().add(subSequence(0, max)).add(charSequence).add(subSequence(max)).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean isBlank() {
        return SequenceUtils.isBlank(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public boolean isCharAt(int i6, CharPredicate charPredicate) {
        return charPredicate.test(safeCharAt(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean isEmpty() {
        return SequenceUtils.isEmpty(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public boolean isIn(String[] strArr) {
        return SequenceUtils.containedBy(strArr, this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean isNotBlank() {
        return SequenceUtils.isNotBlank(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean isNotEmpty() {
        return SequenceUtils.isNotEmpty(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean isNotNull() {
        return this != nullSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean isNull() {
        return this == nullSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final char lastChar() {
        if (isEmpty()) {
            return (char) 0;
        }
        return charAt(length() - 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOf(char c6) {
        return SequenceUtils.lastIndexOf(this, c6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfAny(CharPredicate charPredicate, int i6) {
        return SequenceUtils.lastIndexOfAny(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfAnyNot(CharPredicate charPredicate) {
        return SequenceUtils.lastIndexOfAnyNot(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfNot(char c6) {
        return SequenceUtils.lastIndexOfNot(this, c6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range leadingBlankLinesRange() {
        return SequenceUtils.leadingBlankLinesRange(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T lineAt(int i6) {
        return subSequence(lineRangeAt(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T lineAtAnyEOL(int i6) {
        return subSequence(lineRangeAtAnyEOL(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Pair<Integer, Integer> lineColumnAtIndex(int i6) {
        return SequenceUtils.lineColumnAtIndex(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range lineRangeAt(int i6) {
        return SequenceUtils.lineRangeAt(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range lineRangeAtAnyEOL(int i6) {
        return SequenceUtils.lineRangeAtAnyEOL(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchChars(CharSequence charSequence, int i6, boolean z5) {
        return SequenceUtils.matchChars(this, charSequence, i6, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchCharsIgnoreCase(CharSequence charSequence, int i6) {
        return SequenceUtils.matchCharsIgnoreCase(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchCharsReversed(CharSequence charSequence, int i6, boolean z5) {
        return SequenceUtils.matchCharsReversed(this, charSequence, i6, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchCharsReversedIgnoreCase(CharSequence charSequence, int i6) {
        return SequenceUtils.matchCharsReversedIgnoreCase(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCount(CharSequence charSequence, int i6, int i7, boolean z5) {
        return SequenceUtils.matchedCharCount(this, charSequence, i6, i7, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountIgnoreCase(CharSequence charSequence, int i6) {
        return SequenceUtils.matchedCharCountIgnoreCase(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountReversed(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.matchedCharCountReversed(this, charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountReversedIgnoreCase(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.matchedCharCountReversedIgnoreCase(this, charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matches(CharSequence charSequence, boolean z5) {
        return SequenceUtils.matches(this, charSequence, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchesIgnoreCase(CharSequence charSequence) {
        return SequenceUtils.matchesIgnoreCase(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final char midCharAt(int i6) {
        int length = length();
        if (i6 < (-length) || i6 >= length) {
            return (char) 0;
        }
        if (i6 < 0) {
            i6 += length;
        }
        return charAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T midSequence(int i6, int i7) {
        int length = length();
        if (i6 < 0) {
            i6 += length;
        }
        if (i7 < 0) {
            i7 += length;
        }
        int rangeLimit = Utils.rangeLimit(i7, 0, length);
        return subSequence(Utils.rangeLimit(i6, 0, rangeLimit), rangeLimit);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final String normalizeEOL() {
        return Escaping.normalizeEOL(toString());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final String normalizeEndWithEOL() {
        return Escaping.normalizeEndWithEOL(toString());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIf(boolean z5) {
        return z5 ? nullSequence() : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfBlank() {
        return isBlank() ? nullSequence() : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfEmpty() {
        return isEmpty() ? nullSequence() : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfEndsWith(CharSequence... charSequenceArr) {
        return nullIf(new b(this, 3), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfEndsWithIgnoreCase(CharSequence... charSequenceArr) {
        return nullIf(new b(this, 2), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNot(BiPredicate<? super T, ? super CharSequence> biPredicate, CharSequence... charSequenceArr) {
        return nullIf(biPredicate.negate(), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNotEndsWith(CharSequence... charSequenceArr) {
        return nullIfNot(new b(this, 3), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNotEndsWithIgnoreCase(CharSequence... charSequenceArr) {
        return nullIfNot(new b(this, 2), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNotStartsWith(CharSequence... charSequenceArr) {
        return nullIfNot(new b(this, 4), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNotStartsWithIgnoreCase(CharSequence... charSequenceArr) {
        return nullIfNot(new b(this, 1), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfStartsWith(CharSequence... charSequenceArr) {
        return nullIf(new b(this, 4), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfStartsWithIgnoreCase(CharSequence... charSequenceArr) {
        return nullIf(new b(this, 1), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T padEnd(int i6, char c6) {
        T padding = padding(i6, c6);
        return padding.isEmpty() ? this : (T) getBuilder().append((CharSequence) this).append((CharSequence) padding).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T padStart(int i6, char c6) {
        T padding = padding(i6, c6);
        return padding.isEmpty() ? this : (T) getBuilder().append((CharSequence) padding).append((CharSequence) this).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T padding(int i6, char c6) {
        return i6 <= length() ? nullSequence() : sequenceOf(RepeatedSequence.repeatOf(c6, i6 - length()));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T prefixOnceWith(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0 || startsWith(charSequence)) ? this : prefixWith(charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T prefixOnceWithEOL() {
        return prefixOnceWith(SequenceUtils.EOL);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T prefixOnceWithSpace() {
        return prefixOnceWith(SequenceUtils.SPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T prefixWith(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? this : (T) getBuilder().add(charSequence).add(this).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T prefixWithEOL() {
        return prefixWith(SequenceUtils.EOL);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T prefixWithSpace() {
        return prefixWith(SequenceUtils.SPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T prefixWithSpaces(int i6) {
        return prefixWith(RepeatedSequence.ofSpaces(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removePrefix(CharSequence charSequence) {
        return !startsWith(charSequence) ? this : subSequence(charSequence.length(), length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removePrefixIgnoreCase(CharSequence charSequence) {
        return !startsWithIgnoreCase(charSequence) ? this : subSequence(charSequence.length(), length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeProperPrefix(CharSequence charSequence) {
        return (length() <= charSequence.length() || !startsWith(charSequence)) ? this : subSequence(charSequence.length(), length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeProperPrefixIgnoreCase(CharSequence charSequence) {
        return (length() <= charSequence.length() || !startsWithIgnoreCase(charSequence)) ? this : subSequence(charSequence.length(), length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeProperSuffix(CharSequence charSequence) {
        return (length() <= charSequence.length() || !endsWith(charSequence)) ? this : subSequence(0, length() - charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeProperSuffixIgnoreCase(CharSequence charSequence) {
        return (length() <= charSequence.length() || !endsWithIgnoreCase(charSequence)) ? this : subSequence(0, length() - charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeSuffix(CharSequence charSequence) {
        return !endsWith(charSequence) ? this : subSequence(0, length() - charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeSuffixIgnoreCase(CharSequence charSequence) {
        return !endsWithIgnoreCase(charSequence) ? this : subSequence(0, length() - charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T replace(int i6, int i7, CharSequence charSequence) {
        int length = length();
        return (T) getBuilder().add(subSequence(0, Math.max(i6, 0))).add(charSequence).add(subSequence(Math.min(i7, length))).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public char safeCharAt(int i6) {
        if (i6 < 0 || i6 >= length()) {
            return (char) 0;
        }
        return charAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T safeSubSequence(int i6, int i7) {
        int length = length();
        int max = Math.max(0, Math.min(length, i6));
        return subSequence(max, Math.max(max, Math.min(length, i7)));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T sequenceOf(CharSequence charSequence) {
        return charSequence == null ? nullSequence() : sequenceOf(charSequence, 0, charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] split(CharSequence charSequence, boolean z5, CharPredicate charPredicate) {
        return split(charSequence, 0, z5 ? 1 : 0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] splitEOL() {
        return split(SequenceUtils.EOL, 0, 1, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitList(CharSequence charSequence) {
        return SequenceUtils.splitList(this, charSequence, 0, 0, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitListEOL() {
        return SequenceUtils.splitList(this, SequenceUtils.EOL, 0, 1, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int startOfDelimitedBy(CharSequence charSequence, int i6) {
        return SequenceUtils.startOfDelimitedBy(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int startOfDelimitedByAny(CharPredicate charPredicate, int i6) {
        return SequenceUtils.startOfDelimitedByAny(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int startOfDelimitedByAnyNot(CharPredicate charPredicate, int i6) {
        return startOfDelimitedByAny(charPredicate.negate(), i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int startOfLine(int i6) {
        return SequenceUtils.startOfLine(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int startOfLineAnyEOL(int i6) {
        return SequenceUtils.startOfLineAnyEOL(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWith(CharSequence charSequence) {
        return SequenceUtils.startsWith(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWithAnyEOL() {
        return SequenceUtils.startsWithAnyEOL(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWithEOL() {
        return SequenceUtils.startsWithEOL(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWithIgnoreCase(CharSequence charSequence) {
        return length() > 0 && matchChars(charSequence, 0, true);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWithSpace() {
        return SequenceUtils.startsWithSpace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWithSpaceTab() {
        return SequenceUtils.startsWithSpaceTab(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWithWhitespace() {
        return SequenceUtils.startsWithWhitespace(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T subSequence(int i6) {
        return subSequence(i6, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T subSequenceAfter(Range range) {
        return range.isNull() ? nullSequence() : subSequence(range.getEnd());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T subSequenceBefore(Range range) {
        return range.isNull() ? nullSequence() : subSequence(0, range.getStart());
    }

    public final Pair<T, T> subSequenceBeforeAfter(Range range) {
        return Pair.of(subSequenceBefore(range), subSequenceAfter(range));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T suffixOnceWith(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0 || endsWith(charSequence)) ? this : suffixWith(charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T suffixOnceWithEOL() {
        return suffixOnceWith(SequenceUtils.EOL);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T suffixOnceWithSpace() {
        return suffixOnceWith(SequenceUtils.SPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T suffixWith(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? this : (T) getBuilder().add(this).add(charSequence).toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T suffixWithEOL() {
        return suffixWith(SequenceUtils.EOL);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T suffixWithSpace() {
        return suffixWith(SequenceUtils.SPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T suffixWithSpaces(int i6) {
        return suffixWith(RepeatedSequence.ofSpaces(i6));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T toLowerCase() {
        return toMapped(ChangeCase.toLowerCase);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T toNbSp() {
        return toMapped(SpaceMapper.toNonBreakSpace);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T toSpc() {
        return toMapped(SpaceMapper.fromNonBreakSpace);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int length = length();
        StringBuilder sb = new StringBuilder(length);
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(charAt(i6));
        }
        return sb.toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public String toStringOrNull() {
        if (isNull()) {
            return null;
        }
        return toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T toUpperCase() {
        return toMapped(ChangeCase.toUpperCase);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final String toVisibleWhitespaceString() {
        return SequenceUtils.toVisibleWhitespaceString(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trailingBlankLinesRange() {
        return SequenceUtils.trailingBlankLinesRange(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trim(CharPredicate charPredicate) {
        return trim(0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimEOL() {
        int eolEndLength = eolEndLength();
        return eolEndLength > 0 ? subSequence(0, length() - eolEndLength) : this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimEnd(CharPredicate charPredicate) {
        return trimEnd(0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimEndRange(int i6, CharPredicate charPredicate) {
        return SequenceUtils.trimEndRange(this, i6, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimLeadBlankLines() {
        Range leadingBlankLinesRange = leadingBlankLinesRange();
        return leadingBlankLinesRange.isNull() ? this : subSequenceAfter(leadingBlankLinesRange);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimRange(int i6, CharPredicate charPredicate) {
        return SequenceUtils.trimRange(this, i6, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimStart(CharPredicate charPredicate) {
        return subSequence(trimStartRange(0, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimStartRange(int i6, CharPredicate charPredicate) {
        return SequenceUtils.trimStartRange(this, i6, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimTailBlankLines() {
        Range trailingBlankLinesRange = trailingBlankLinesRange();
        return trailingBlankLinesRange.isNull() ? this : subSequenceBefore(trailingBlankLinesRange);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToEndOfLine(boolean z5) {
        return trimToEndOfLine(CharPredicate.EOL, z5, 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToStartOfLine(boolean z5) {
        return trimToStartOfLine(CharPredicate.EOL, z5, 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Pair<T, T> trimmed(CharPredicate charPredicate) {
        return trimmed(0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedEOL() {
        int eolEndLength = eolEndLength();
        return eolEndLength > 0 ? subSequence(length() - eolEndLength) : nullSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedEnd(CharPredicate charPredicate) {
        return trimmedEnd(0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedStart(CharPredicate charPredicate) {
        return trimmedStart(0, charPredicate);
    }

    public final void validateIndex(int i6) {
        SequenceUtils.validateIndex(i6, length());
    }

    public final void validateIndexInclusiveEnd(int i6) {
        SequenceUtils.validateIndexInclusiveEnd(i6, length());
    }

    public final void validateStartEnd(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T append(Iterable<? extends CharSequence> iterable) {
        ISequenceBuilder builder = getBuilder();
        builder.add(this);
        Iterator<? extends CharSequence> it = iterable.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
        return (T) builder.toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendRangesTo(StringBuilder sb, Range... rangeArr) {
        return appendRangesTo(sb, (CharMapper) null, new ArrayIterable(rangeArr));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendTo(StringBuilder sb, CharMapper charMapper, int i6) {
        return appendTo(sb, charMapper, i6, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<Range> blankLinesRemovedRanges(int i6) {
        return SequenceUtils.blankLinesRemovedRanges(this, i6);
    }

    @Override // java.lang.Comparable
    public int compareTo(CharSequence charSequence) {
        return SequenceUtils.compare(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeading(CharPredicate charPredicate, int i6) {
        return SequenceUtils.countLeading(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNot(CharPredicate charPredicate, int i6) {
        return SequenceUtils.countLeadingNot(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotSpace(int i6) {
        return SequenceUtils.countLeadingNotSpace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotSpaceTab(int i6) {
        return SequenceUtils.countLeadingNotSpaceTab(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotWhitespace(int i6) {
        return SequenceUtils.countLeadingNotWhitespace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingSpace(int i6) {
        return SequenceUtils.countLeadingSpace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingSpaceTab(int i6) {
        return SequenceUtils.countLeadingSpaceTab(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingWhitespace(int i6) {
        return SequenceUtils.countLeadingWhitespace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfAny(CharPredicate charPredicate) {
        return SequenceUtils.countOfAny(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfAnyNot(CharPredicate charPredicate) {
        return SequenceUtils.countOfAnyNot(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailing(CharPredicate charPredicate, int i6) {
        return SequenceUtils.countTrailing(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNot(CharPredicate charPredicate, int i6) {
        return SequenceUtils.countTrailingNot(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotSpace(int i6) {
        return SequenceUtils.countTrailingNotSpace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotSpaceTab(int i6) {
        return SequenceUtils.countTrailingNotSpaceTab(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotWhitespace(int i6) {
        return SequenceUtils.countTrailingNotWhitespace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingSpace(int i6) {
        return SequenceUtils.countTrailingSpace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingSpaceTab(int i6) {
        return SequenceUtils.countTrailingSpaceTab(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingWhitespace(int i6) {
        return SequenceUtils.countTrailingWhitespace(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    /* renamed from: endsWith, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean lambda$nullIfNotEndsWith$5(CharSequence charSequence, boolean z5) {
        return SequenceUtils.endsWith(this, charSequence, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int eolEndLength(int i6) {
        return SequenceUtils.eolEndLength(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean equals(Object obj, boolean z5) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == length() && matchChars(charSequence, 0, z5)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T extractRanges(Iterable<Range> iterable) {
        ISequenceBuilder builder = getBuilder();
        for (Range range : iterable) {
            if (range != null && !range.isNull()) {
                builder.add(range.safeSubSequence(this));
            }
        }
        return (T) builder.toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOf(CharSequence charSequence, int i6) {
        return SequenceUtils.indexOf(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfAny(CharPredicate charPredicate, int i6) {
        return SequenceUtils.indexOfAny(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfAnyNot(CharPredicate charPredicate, int i6) {
        return SequenceUtils.indexOfAnyNot(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfNot(char c6, int i6) {
        return SequenceUtils.indexOfNot(this, c6, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public boolean isIn(Collection<? extends CharSequence> collection) {
        return SequenceUtils.containedBy(collection, this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOf(char c6, int i6) {
        return SequenceUtils.lastIndexOf(this, c6, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfAny(CharPredicate charPredicate) {
        return SequenceUtils.lastIndexOfAny(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfAnyNot(CharPredicate charPredicate, int i6) {
        return SequenceUtils.lastIndexOfAnyNot(this, charPredicate, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfNot(char c6, int i6) {
        return SequenceUtils.lastIndexOfNot(this, c6, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range leadingBlankLinesRange(int i6) {
        return SequenceUtils.leadingBlankLinesRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchChars(CharSequence charSequence, int i6) {
        return SequenceUtils.matchChars(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchCharsIgnoreCase(CharSequence charSequence) {
        return SequenceUtils.matchCharsIgnoreCase(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchCharsReversed(CharSequence charSequence, int i6) {
        return SequenceUtils.matchCharsReversed(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCount(CharSequence charSequence, int i6, boolean z5) {
        return SequenceUtils.matchedCharCount(this, charSequence, i6, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountIgnoreCase(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.matchedCharCountIgnoreCase(this, charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountReversed(CharSequence charSequence, int i6, boolean z5) {
        return SequenceUtils.matchedCharCountReversed(this, charSequence, i6, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountReversedIgnoreCase(CharSequence charSequence, int i6) {
        return SequenceUtils.matchedCharCountReversedIgnoreCase(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matches(CharSequence charSequence) {
        return SequenceUtils.matches(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIf(Predicate<? super CharSequence> predicate, CharSequence... charSequenceArr) {
        return nullIf(new c(predicate, 0), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfEndsWith(boolean z5, CharSequence... charSequenceArr) {
        return nullIf(new a(this, z5, 2), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNot(Predicate<? super CharSequence> predicate, CharSequence... charSequenceArr) {
        return nullIfNot(new c(predicate, 1), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNotEndsWith(boolean z5, CharSequence... charSequenceArr) {
        return nullIfNot(new a(this, z5, 3), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNotStartsWith(boolean z5, CharSequence... charSequenceArr) {
        return nullIfNot(new a(this, z5, 1), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfStartsWith(boolean z5, CharSequence... charSequenceArr) {
        return nullIf(new a(this, z5, 0), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T padding(int i6) {
        return padStart(i6, SequenceUtils.SPC);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removePrefix(CharSequence charSequence, boolean z5) {
        return !lambda$nullIfStartsWith$2(charSequence, z5) ? this : subSequence(charSequence.length(), length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeProperPrefix(CharSequence charSequence, boolean z5) {
        return (length() <= charSequence.length() || !lambda$nullIfStartsWith$2(charSequence, z5)) ? this : subSequence(charSequence.length(), length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeProperSuffix(CharSequence charSequence, boolean z5) {
        return (length() <= charSequence.length() || !lambda$nullIfNotEndsWith$5(charSequence, z5)) ? this : subSequence(0, length() - charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T removeSuffix(CharSequence charSequence, boolean z5) {
        return !lambda$nullIfNotEndsWith$5(charSequence, z5) ? this : subSequence(0, length() - charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T sequenceOf(CharSequence charSequence, int i6) {
        return charSequence == null ? nullSequence() : sequenceOf(charSequence, i6, charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] split(CharSequence charSequence) {
        return split(charSequence, 0, 0, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] splitEOL(boolean z5) {
        return split(SequenceUtils.EOL, 0, z5 ? 1 : 0, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitList(CharSequence charSequence, int i6, boolean z5, CharPredicate charPredicate) {
        return SequenceUtils.splitList(this, charSequence, i6, z5 ? 1 : 0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitListEOL(boolean z5) {
        return SequenceUtils.splitList(this, SequenceUtils.EOL, 0, z5 ? 1 : 0, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    /* renamed from: startsWith, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final boolean lambda$nullIfStartsWith$2(CharSequence charSequence, boolean z5) {
        return SequenceUtils.startsWith(this, charSequence, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T subSequence(Range range) {
        return range.isNull() ? this : subSequence(range.getStart(), range.getEnd());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trailingBlankLinesRange(int i6) {
        return SequenceUtils.trailingBlankLinesRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trim(int i6) {
        return trim(i6, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimEnd(int i6) {
        return trimEnd(i6, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimEndRange(CharPredicate charPredicate) {
        return SequenceUtils.trimEndRange(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimRange(CharPredicate charPredicate) {
        return SequenceUtils.trimRange(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimStart(int i6) {
        return trimStart(i6, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimStartRange(CharPredicate charPredicate) {
        return SequenceUtils.trimStartRange(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToEndOfLine(int i6) {
        return trimToEndOfLine(CharPredicate.EOL, false, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToStartOfLine(int i6) {
        return trimToStartOfLine(CharPredicate.EOL, false, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Pair<T, T> trimmed(int i6) {
        return trimmed(i6, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedEnd(int i6) {
        return trimmedEnd(i6, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedStart(int i6) {
        return trimmedStart(i6, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendRangesTo(StringBuilder sb, Iterable<? extends Range> iterable) {
        return appendRangesTo(sb, (CharMapper) null, iterable);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendTo(StringBuilder sb) {
        return appendTo(sb, null, 0, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<Range> blankLinesRemovedRanges(int i6, int i7) {
        return SequenceUtils.blankLinesRemovedRanges(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeading(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.countLeading(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNot(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.countLeadingNot(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotSpace(int i6, int i7) {
        return SequenceUtils.countLeadingNotSpace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotSpaceTab(int i6, int i7) {
        return SequenceUtils.countLeadingNotSpaceTab(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingNotWhitespace(int i6, int i7) {
        return SequenceUtils.countLeadingNotWhitespace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingSpace(int i6, int i7) {
        return SequenceUtils.countLeadingSpace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingSpaceTab(int i6, int i7) {
        return SequenceUtils.countLeadingSpaceTab(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countLeadingWhitespace(int i6, int i7) {
        return SequenceUtils.countLeadingWhitespace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfAny(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.countOfAny(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countOfAnyNot(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.countOfAnyNot(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailing(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.countTrailing(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNot(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.countTrailingNot(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotSpace(int i6, int i7) {
        return SequenceUtils.countTrailingNotSpace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotSpaceTab(int i6, int i7) {
        return SequenceUtils.countTrailingNotSpaceTab(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingNotWhitespace(int i6, int i7) {
        return SequenceUtils.countTrailingNotWhitespace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingSpace(int i6, int i7) {
        return SequenceUtils.countTrailingSpace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingSpaceTab(int i6, int i7) {
        return SequenceUtils.countTrailingSpaceTab(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int countTrailingWhitespace(int i6, int i7) {
        return SequenceUtils.countTrailingWhitespace(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean endsWith(CharPredicate charPredicate) {
        return SequenceUtils.endsWith(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOf(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.indexOf(this, charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfAny(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.indexOfAny(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfAnyNot(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.indexOfAnyNot(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOfNot(char c6, int i6, int i7) {
        return SequenceUtils.indexOfNot(this, c6, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOf(CharSequence charSequence) {
        return SequenceUtils.lastIndexOf(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfAny(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.lastIndexOfAny(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfAnyNot(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.lastIndexOfAnyNot(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOfNot(char c6, int i6, int i7) {
        return SequenceUtils.lastIndexOfNot(this, c6, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range leadingBlankLinesRange(int i6, int i7) {
        return SequenceUtils.leadingBlankLinesRange(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchChars(CharSequence charSequence, boolean z5) {
        return SequenceUtils.matchChars(this, charSequence, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCount(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.matchedCharCount(this, charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountReversed(CharSequence charSequence, int i6) {
        return SequenceUtils.matchedCharCountReversed(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIf(CharSequence... charSequenceArr) {
        return nullIf(new b(this, 0), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIfNot(CharSequence... charSequenceArr) {
        return nullIfNot(new b(this, 0), charSequenceArr);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T padEnd(int i6) {
        return padEnd(i6, SequenceUtils.SPC);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T padStart(int i6) {
        return padStart(i6, SequenceUtils.SPC);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] split(CharSequence charSequence, int i6, boolean z5, CharPredicate charPredicate) {
        return split(charSequence, i6, z5 ? 1 : 0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitList(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.splitList(this, charSequence, i6, i7, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitListEOL(boolean z5, CharPredicate charPredicate) {
        return SequenceUtils.splitList(this, SequenceUtils.EOL, 0, z5 ? 1 : 0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean startsWith(CharPredicate charPredicate) {
        return SequenceUtils.startsWith(this, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trailingBlankLinesRange(int i6, int i7) {
        return SequenceUtils.trailingBlankLinesRange(this, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trim() {
        return trim(0, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimEnd() {
        return trimEnd(0, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimEndRange(int i6) {
        return SequenceUtils.trimEndRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimRange(int i6) {
        return SequenceUtils.trimRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimStart() {
        return trimStart(0, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimStartRange(int i6) {
        return SequenceUtils.trimStartRange(this, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToEndOfLine() {
        return trimToEndOfLine(CharPredicate.EOL, false, 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToStartOfLine() {
        return trimToStartOfLine(CharPredicate.EOL, false, 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Pair<T, T> trimmed() {
        return trimmed(0, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedEnd() {
        return trimmedEnd(0, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedStart() {
        return trimmedStart(0, CharPredicate.WHITESPACE);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendRangesTo(StringBuilder sb, CharMapper charMapper, Iterable<? extends Range> iterable) {
        T mapped = charMapper == null ? this : toMapped(charMapper);
        for (Range range : iterable) {
            if (range != null && range.isNotNull()) {
                sb.append((CharSequence) mapped, range.getStart(), range.getEnd());
            }
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendTo(StringBuilder sb, int i6) {
        return appendTo(sb, null, i6, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<Range> blankLinesRemovedRanges(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.blankLinesRemovedRanges(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOf(char c6) {
        return SequenceUtils.indexOf(this, c6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOf(CharSequence charSequence, int i6) {
        return SequenceUtils.lastIndexOf(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range leadingBlankLinesRange(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.leadingBlankLinesRange(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final boolean matchChars(CharSequence charSequence) {
        return SequenceUtils.matchChars(this, charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCount(CharSequence charSequence, int i6) {
        return SequenceUtils.matchedCharCount(this, charSequence, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCountReversed(CharSequence charSequence, int i6, int i7, boolean z5) {
        return SequenceUtils.matchedCharCountReversed(this, charSequence, i6, i7, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T nullIf(BiPredicate<? super T, ? super CharSequence> biPredicate, CharSequence... charSequenceArr) {
        for (CharSequence charSequence : charSequenceArr) {
            if (biPredicate.test(this, charSequence)) {
                return nullSequence();
            }
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] split(CharSequence charSequence, int i6, int i7) {
        return split(charSequence, i6, i7, (CharPredicate) null);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitList(CharSequence charSequence, boolean z5, CharPredicate charPredicate) {
        return SequenceUtils.splitList(this, charSequence, 0, z5 ? 1 : 0, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trailingBlankLinesRange(CharPredicate charPredicate, int i6, int i7) {
        return SequenceUtils.trailingBlankLinesRange(this, charPredicate, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trim(int i6, CharPredicate charPredicate) {
        return subSequence(trimRange(i6, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimEnd(int i6, CharPredicate charPredicate) {
        return subSequence(trimEndRange(i6, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimEndRange() {
        return SequenceUtils.trimEndRange(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimRange() {
        return SequenceUtils.trimRange(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimStart(int i6, CharPredicate charPredicate) {
        return subSequence(trimStartRange(i6, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Range trimStartRange() {
        return SequenceUtils.trimStartRange(this);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToEndOfLine(boolean z5, int i6) {
        return trimToEndOfLine(CharPredicate.EOL, z5, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToStartOfLine(boolean z5, int i6) {
        return trimToStartOfLine(CharPredicate.EOL, z5, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final Pair<T, T> trimmed(int i6, CharPredicate charPredicate) {
        return subSequenceBeforeAfter(trimRange(i6, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedEnd(int i6, CharPredicate charPredicate) {
        return subSequenceAfter(trimEndRange(i6, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T trimmedStart(int i6, CharPredicate charPredicate) {
        return subSequenceBefore(trimStartRange(i6, charPredicate));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendTo(StringBuilder sb, int i6, int i7) {
        return appendTo(sb, null, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T endSequence(int i6) {
        return endSequence(i6, 0);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOf(char c6, int i6) {
        return SequenceUtils.indexOf(this, c6, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOf(CharSequence charSequence, int i6, int i7) {
        return SequenceUtils.lastIndexOf(this, charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int matchedCharCount(CharSequence charSequence, int i6, int i7, boolean z5, boolean z6) {
        return SequenceUtils.matchedCharCount(this, charSequence, i6, i7, z5, z6);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T midSequence(int i6) {
        return midSequence(i6, length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T safeSubSequence(int i6) {
        int length = length();
        return subSequence(Math.max(0, Math.min(length, i6)), length);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T[] split(CharSequence charSequence, int i6, int i7, CharPredicate charPredicate) {
        return (T[]) ((IRichSequence[]) SequenceUtils.splitList(this, charSequence, i6, i7, charPredicate).toArray(emptyArray()));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final List<T> splitList(CharSequence charSequence, int i6, int i7, CharPredicate charPredicate) {
        return SequenceUtils.splitList(this, charSequence, i6, i7, charPredicate);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToEndOfLine(CharPredicate charPredicate, boolean z5, int i6) {
        int endOfDelimitedByAny = endOfDelimitedByAny(charPredicate, i6);
        if (endOfDelimitedByAny >= length()) {
            return this;
        }
        if (z5) {
            endOfDelimitedByAny += eolStartLength(endOfDelimitedByAny);
        }
        return subSequence(0, endOfDelimitedByAny);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public T trimToStartOfLine(CharPredicate charPredicate, boolean z5, int i6) {
        int startOfDelimitedByAny = startOfDelimitedByAny(charPredicate, i6);
        if (startOfDelimitedByAny <= 0) {
            return this;
        }
        if (z5) {
            startOfDelimitedByAny -= eolEndLength(startOfDelimitedByAny - 1);
        }
        return subSequence(startOfDelimitedByAny);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T appendTo(StringBuilder sb, CharMapper charMapper, int i6, int i7) {
        sb.append((CharSequence) (charMapper == null ? this : toMapped(charMapper)), i6, i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int indexOf(char c6, int i6, int i7) {
        return SequenceUtils.indexOf(this, c6, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final int lastIndexOf(char c6, int i6, int i7) {
        return SequenceUtils.lastIndexOf(this, c6, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public final T replace(CharSequence charSequence, CharSequence charSequence2) {
        int[] indexOfAll = indexOfAll(charSequence);
        if (indexOfAll.length == 0) {
            return this;
        }
        ISequenceBuilder builder = getBuilder();
        int length = indexOfAll.length;
        int length2 = length();
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = i6 + 1;
            int i9 = indexOfAll[i6];
            if (i7 < i9) {
                builder.add(subSequence(i7, i9));
            }
            i7 = charSequence.length() + i9;
            builder.add(charSequence2);
            i6 = i8;
        }
        if (i7 < length2) {
            builder.add(subSequence(i7, length2));
        }
        return (T) builder.toSequence();
    }
}
