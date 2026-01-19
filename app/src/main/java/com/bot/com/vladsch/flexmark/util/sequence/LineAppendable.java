package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface LineAppendable extends Appendable, Iterable<LineInfo> {

    @Deprecated
    public static final int ALLOW_LEADING_EOL = 0;

    @Deprecated
    public static final int ALLOW_LEADING_WHITESPACE = 0;

    @Deprecated
    public static final int COLLAPSE_WHITESPACE = null;

    @Deprecated
    public static final int CONVERT_TABS = null;

    @Deprecated
    public static final int FORMAT_ALL = null;
    public static final int F_COLLAPSE_WHITESPACE = null;
    public static final int F_CONVERT_TABS = null;
    public static final int F_FORMAT_ALL = null;
    public static final int F_PASS_THROUGH = null;
    public static final int F_PREFIX_PRE_FORMATTED = null;
    public static final int F_TRIM_LEADING_EOL = null;
    public static final int F_TRIM_LEADING_WHITESPACE = null;
    public static final int F_TRIM_TRAILING_WHITESPACE = null;
    public static final int F_WHITESPACE_REMOVAL = null;
    public static final Options O_COLLAPSE_WHITESPACE = null;
    public static final Options O_CONVERT_TABS = null;
    public static final BitFieldSet<Options> O_FORMAT_ALL;
    public static final Options O_PASS_THROUGH = null;
    public static final Options O_PREFIX_PRE_FORMATTED = null;
    public static final Options O_TRIM_LEADING_EOL = null;
    public static final Options O_TRIM_LEADING_WHITESPACE = null;
    public static final Options O_TRIM_TRAILING_WHITESPACE = null;

    @Deprecated
    public static final int PASS_THROUGH = null;

    @Deprecated
    public static final int PREFIX_PRE_FORMATTED = null;

    @Deprecated
    public static final int TRIM_LEADING_WHITESPACE = null;

    @Deprecated
    public static final int TRIM_TRAILING_WHITESPACE = null;

    /* loaded from: classes.dex */
    public enum Options {
        CONVERT_TABS,
        COLLAPSE_WHITESPACE,
        TRIM_TRAILING_WHITESPACE,
        PASS_THROUGH,
        TRIM_LEADING_WHITESPACE,
        TRIM_LEADING_EOL,
        PREFIX_PRE_FORMATTED
    }

    static {
        Options options = Options.CONVERT_TABS;
        O_CONVERT_TABS = options;
        Options options2 = Options.COLLAPSE_WHITESPACE;
        O_COLLAPSE_WHITESPACE = options2;
        Options options3 = Options.TRIM_TRAILING_WHITESPACE;
        O_TRIM_TRAILING_WHITESPACE = options3;
        Options options4 = Options.PASS_THROUGH;
        O_PASS_THROUGH = options4;
        Options options5 = Options.TRIM_LEADING_WHITESPACE;
        O_TRIM_LEADING_WHITESPACE = options5;
        Options options6 = Options.TRIM_LEADING_EOL;
        O_TRIM_LEADING_EOL = options6;
        Options options7 = Options.PREFIX_PRE_FORMATTED;
        O_PREFIX_PRE_FORMATTED = options7;
        O_FORMAT_ALL = BitFieldSet.of(options, options2, options3, options5);
        int intMask = BitFieldSet.intMask(options);
        F_CONVERT_TABS = intMask;
        int intMask2 = BitFieldSet.intMask(options2);
        F_COLLAPSE_WHITESPACE = intMask2;
        int intMask3 = BitFieldSet.intMask(options3);
        F_TRIM_TRAILING_WHITESPACE = intMask3;
        int intMask4 = BitFieldSet.intMask(options4);
        F_PASS_THROUGH = intMask4;
        int intMask5 = BitFieldSet.intMask(options5);
        F_TRIM_LEADING_WHITESPACE = intMask5;
        int intMask6 = BitFieldSet.intMask(options6);
        F_TRIM_LEADING_EOL = intMask6;
        int intMask7 = BitFieldSet.intMask(options7);
        F_PREFIX_PRE_FORMATTED = intMask7;
        int i6 = intMask6 | intMask | intMask2 | intMask3 | intMask5;
        F_FORMAT_ALL = i6;
        F_WHITESPACE_REMOVAL = intMask2 | intMask3 | intMask5;
        CONVERT_TABS = intMask;
        COLLAPSE_WHITESPACE = intMask2;
        TRIM_TRAILING_WHITESPACE = intMask3;
        PASS_THROUGH = intMask4;
        TRIM_LEADING_WHITESPACE = intMask5;
        PREFIX_PRE_FORMATTED = intMask7;
        FORMAT_ALL = i6;
    }

    static CharSequence combinedPrefix(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence2 == null || charSequence2.length() <= 0) {
            return (charSequence == null || charSequence.length() <= 0) ? (charSequence2 == null || charSequence2.length() <= 0) ? BasedSequence.NULL : charSequence2 : charSequence;
        }
        return String.valueOf(charSequence) + ((Object) charSequence2);
    }

    static BitFieldSet<Options> toOptionSet(int i6) {
        return BitFieldSet.of(Options.class, i6);
    }

    LineAppendable addIndentOnFirstEOL(Runnable runnable);

    default LineAppendable addOptions(int i6) {
        return changeOptions(i6, 0);
    }

    default LineAppendable addPrefix(CharSequence charSequence) {
        return addPrefix(charSequence, getPendingEOL() == 0);
    }

    LineAppendable addPrefix(CharSequence charSequence, boolean z5);

    @Override // java.lang.Appendable
    LineAppendable append(char c6);

    LineAppendable append(char c6, int i6);

    LineAppendable append(LineAppendable lineAppendable, int i6, int i7, boolean z5);

    @Override // java.lang.Appendable
    LineAppendable append(CharSequence charSequence);

    @Override // java.lang.Appendable
    LineAppendable append(CharSequence charSequence, int i6, int i7);

    default LineAppendable appendAll(Iterable<CharSequence> iterable) {
        Iterator<CharSequence> it = iterable.iterator();
        while (it.hasNext()) {
            append(it.next());
        }
        return this;
    }

    @Deprecated
    default <T extends Appendable> T appendTo(T t5, int i6) {
        return (T) appendTo(t5, TableCell.NOT_TRACKED, i6);
    }

    <T extends Appendable> T appendTo(T t5, boolean z5, int i6, int i7, int i8, int i9);

    default <T extends Appendable> T appendToSilently(T t5, boolean z5, int i6, int i7, int i8, int i9) {
        try {
            appendTo(t5, z5, i6, i7, i8, i9);
        } catch (IOException unused) {
        }
        return t5;
    }

    LineAppendable blankLine();

    LineAppendable blankLine(int i6);

    LineAppendable blankLineIf(boolean z5);

    LineAppendable changeOptions(int i6, int i7);

    default LineAppendable clearLineOnFirstText() {
        return lineOnFirstText(false);
    }

    LineAppendable closePreFormatted();

    int column();

    default LineAppendable copyAppendable(int i6, int i7, boolean z5) {
        return getEmptyAppendable().append(this, i6, i7, z5);
    }

    boolean endsWithEOL();

    default LineInfo get(int i6) {
        return getLineInfo(i6);
    }

    int getAfterEolPrefixDelta();

    BasedSequence getBeforeEolPrefix();

    ISequenceBuilder<?, ?> getBuilder();

    LineAppendable getEmptyAppendable();

    BasedSequence getIndentPrefix();

    BasedSequence getLine(int i6);

    default BasedSequence getLineContent(int i6) {
        LineInfo lineInfo = getLineInfo(i6);
        BasedSequence line = getLine(i6);
        int i7 = lineInfo.prefixLength;
        return line.subSequence(i7, lineInfo.textLength + i7);
    }

    int getLineCount();

    int getLineCountWithPending();

    LineInfo getLineInfo(int i6);

    default BasedSequence getLinePrefix(int i6) {
        return getLine(i6).subSequence(0, getLineInfo(i6).prefixLength);
    }

    default Iterable<BasedSequence> getLines(int i6) {
        return getLines(i6, 0, TableCell.NOT_TRACKED, true);
    }

    Iterable<BasedSequence> getLines(int i6, int i7, int i8, boolean z5);

    default Iterable<LineInfo> getLinesInfo(int i6) {
        return getLinesInfo(i6, 0, TableCell.NOT_TRACKED);
    }

    Iterable<LineInfo> getLinesInfo(int i6, int i7, int i8);

    BitFieldSet<Options> getOptionSet();

    default int getOptions() {
        return getOptionSet().toInt();
    }

    int getPendingEOL();

    int getPendingSpace();

    BasedSequence getPrefix();

    default int getTrailingBlankLines() {
        return getTrailingBlankLines(getLineCountWithPending());
    }

    int getTrailingBlankLines(int i6);

    LineAppendable indent();

    void insertLine(int i6, CharSequence charSequence, CharSequence charSequence2);

    default boolean isEmpty() {
        return getLineCountWithPending() == 0;
    }

    default boolean isNotEmpty() {
        return getLineCountWithPending() != 0;
    }

    boolean isPendingSpace();

    boolean isPreFormatted();

    Iterator<LineInfo> iterator();

    LineAppendable line();

    LineAppendable lineIf(boolean z5);

    LineAppendable lineOnFirstText(boolean z5);

    LineAppendable lineWithTrailingSpaces(int i6);

    default LineAppendable noPreserveSpaces() {
        return changeOptions(F_TRIM_LEADING_WHITESPACE | F_COLLAPSE_WHITESPACE, 0);
    }

    default LineAppendable noTrimLeading() {
        return changeOptions(0, F_TRIM_LEADING_WHITESPACE);
    }

    int offset();

    int offsetWithPending();

    LineAppendable openPreFormatted(boolean z5);

    LineAppendable popOptions();

    default LineAppendable popPrefix() {
        return popPrefix(false);
    }

    LineAppendable popPrefix(boolean z5);

    default LineAppendable preserveSpaces() {
        return changeOptions(0, F_TRIM_LEADING_WHITESPACE | F_COLLAPSE_WHITESPACE);
    }

    LineAppendable pushOptions();

    LineAppendable pushPrefix();

    default LineAppendable removeExtraBlankLines(int i6, int i7) {
        return removeExtraBlankLines(i6, i7, 0, TableCell.NOT_TRACKED);
    }

    LineAppendable removeExtraBlankLines(int i6, int i7, int i8, int i9);

    LineAppendable removeIndentOnFirstEOL(Runnable runnable);

    LineAppendable removeLines(int i6, int i7);

    default LineAppendable removeOptions(int i6) {
        return changeOptions(0, i6);
    }

    LineAppendable setIndentPrefix(CharSequence charSequence);

    void setLine(int i6, CharSequence charSequence, CharSequence charSequence2);

    default LineAppendable setLineOnFirstText() {
        return lineOnFirstText(true);
    }

    default LineAppendable setOptions(int i6) {
        return setOptions(toOptionSet(i6));
    }

    default LineAppendable setPrefix(CharSequence charSequence) {
        return setPrefix(charSequence, getPendingEOL() == 0);
    }

    LineAppendable setPrefix(CharSequence charSequence, boolean z5);

    void setPrefixLength(int i6, int i7);

    default CharSequence toSequence(int i6, int i7) {
        return toSequence(i6, i7, true);
    }

    CharSequence toSequence(int i6, int i7, boolean z5);

    default String toString(int i6, int i7) {
        return toString(i6, i7, true);
    }

    String toString(int i6, int i7, boolean z5);

    default LineAppendable trimLeading() {
        return changeOptions(F_TRIM_LEADING_WHITESPACE, 0);
    }

    LineAppendable unIndent();

    LineAppendable unIndentNoEol();

    static BitFieldSet<Options> toOptionSet(Options... optionsArr) {
        return BitFieldSet.of(Options.class, (Enum[]) optionsArr);
    }

    default <T extends Appendable> T appendTo(T t5, int i6, int i7, int i8, int i9) {
        return (T) appendTo(t5, true, i6, i7, i8, i9);
    }

    default <T extends Appendable> T appendToSilently(T t5, int i6, int i7, int i8, int i9) {
        appendToSilently(t5, true, i6, i7, i8, i9);
        return t5;
    }

    default LineAppendable copyAppendable(int i6, int i7) {
        return getEmptyAppendable().append(this, i6, i7, false);
    }

    default Iterable<BasedSequence> getLines() {
        return getLines(TableCell.NOT_TRACKED, 0, TableCell.NOT_TRACKED, true);
    }

    default Iterable<LineInfo> getLinesInfo() {
        return getLinesInfo(TableCell.NOT_TRACKED, 0, TableCell.NOT_TRACKED);
    }

    default LineAppendable setOptions(Options... optionsArr) {
        return setOptions(toOptionSet(optionsArr).toInt());
    }

    default CharSequence toSequence(int i6, boolean z5) {
        return toSequence(i6, i6, z5);
    }

    default String toString(int i6, boolean z5) {
        return toString(i6, i6, z5);
    }

    default <T extends Appendable> T appendTo(T t5, int i6, int i7) {
        return (T) appendTo(t5, i6, i7, 0, TableCell.NOT_TRACKED);
    }

    default <T extends Appendable> T appendToSilently(T t5, int i6, int i7) {
        appendToSilently(t5, i6, i7, 0, TableCell.NOT_TRACKED);
        return t5;
    }

    default LineAppendable copyAppendable(int i6) {
        return getEmptyAppendable().append(this, i6, TableCell.NOT_TRACKED, false);
    }

    default Iterable<BasedSequence> getLines(int i6, boolean z5) {
        return getLines(i6, 0, TableCell.NOT_TRACKED, z5);
    }

    default LineAppendable setOptions(BitFieldSet<Options> bitFieldSet) {
        return setOptions(bitFieldSet.toInt());
    }

    default CharSequence toSequence(boolean z5) {
        return toSequence(TableCell.NOT_TRACKED, TableCell.NOT_TRACKED, z5);
    }

    default String toString(boolean z5) {
        return toString(TableCell.NOT_TRACKED, TableCell.NOT_TRACKED, z5);
    }

    default LineAppendable append(LineAppendable lineAppendable) {
        return append(lineAppendable, 0, TableCell.NOT_TRACKED, true);
    }

    default <T extends Appendable> T appendTo(T t5) {
        return (T) appendTo(t5, 0, 0, 0, TableCell.NOT_TRACKED);
    }

    default <T extends Appendable> T appendToSilently(T t5) {
        return (T) appendToSilently(t5, 0, 0, 0, TableCell.NOT_TRACKED);
    }

    default LineAppendable copyAppendable() {
        return getEmptyAppendable().append(this, 0, TableCell.NOT_TRACKED, false);
    }

    default Iterable<BasedSequence> getLines(boolean z5) {
        return getLines(TableCell.NOT_TRACKED, 0, TableCell.NOT_TRACKED, z5);
    }

    default CharSequence toSequence() {
        return toSequence(TableCell.NOT_TRACKED, TableCell.NOT_TRACKED, true);
    }

    default String toString(int i6) {
        return toString(i6, i6, true);
    }

    default LineAppendable append(LineAppendable lineAppendable, boolean z5) {
        return append(lineAppendable, 0, TableCell.NOT_TRACKED, z5);
    }

    default LineAppendable copyAppendable(boolean z5) {
        return getEmptyAppendable().append(this, 0, TableCell.NOT_TRACKED, z5);
    }
}
