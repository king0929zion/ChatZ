package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.collection.iteration.Indexed;
import com.vladsch.flexmark.util.collection.iteration.IndexedItemIterable;
import com.vladsch.flexmark.util.collection.iteration.IndexedItemIterator;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.LineInfo;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.StringSequenceBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public class LineAppendableImpl implements LineAppendable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char EOL = '\n';
    private boolean allWhitespace;
    private ISequenceBuilder<?, ?> appendable;
    private int eolOnFirstText;
    private CharSequence indentPrefix;
    private final Stack<Boolean> indentPrefixStack;
    private final ArrayList<Runnable> indentsOnFirstEol;
    private boolean lastWasWhitespace;
    final ArrayList<LineInfo> lines;
    int modificationCount;
    private final Stack<Integer> optionStack;
    private final BitFieldSet<LineAppendable.Options> options;
    private final boolean passThrough;
    private int preFormattedFirstLine;
    private int preFormattedFirstLineOffset;
    private int preFormattedLastLine;
    private int preFormattedLastLineOffset;
    private int preFormattedNesting;
    private CharSequence prefix;
    private CharSequence prefixAfterEol;
    private final Stack<CharSequence> prefixStack;

    /* loaded from: classes.dex */
    public static class IndexedLineInfoProxy implements Indexed<LineInfo> {
        final LineAppendableImpl appendable;
        final int endLine;
        final int maxTrailingBlankLines;
        final int startLine;

        public IndexedLineInfoProxy(LineAppendableImpl lineAppendableImpl, int i6, int i7, int i8) {
            this.appendable = lineAppendableImpl;
            this.startLine = i7;
            this.endLine = Math.min(i8, lineAppendableImpl.getLineCountWithPending());
            this.maxTrailingBlankLines = i6;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public int modificationCount() {
            return this.appendable.modificationCount;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public void removeAt(int i6) {
            int i7 = this.startLine;
            if (i6 + i7 >= this.endLine) {
                throw new IndexOutOfBoundsException(String.format("index %d is out of valid range [%d, %d)", Integer.valueOf(i6), Integer.valueOf(this.startLine), Integer.valueOf(this.endLine)));
            }
            this.appendable.removeLines(i7 + i6, i6 + 1);
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public int size() {
            return Math.max(0, (this.endLine - this.startLine) - this.appendable.tailBlankLinesToRemove(this.endLine, this.maxTrailingBlankLines));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public LineInfo get(int i6) {
            int i7 = this.startLine;
            if (i6 + i7 < this.endLine) {
                return this.appendable.getLineInfo(i6 + i7);
            }
            throw new IndexOutOfBoundsException(String.format("index %d is out of valid range [%d, %d)", Integer.valueOf(i6), Integer.valueOf(this.startLine), Integer.valueOf(this.endLine)));
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public void set(int i6, LineInfo lineInfo) {
            int i7 = this.startLine;
            if (i6 + i7 < this.endLine) {
                this.appendable.lines.set(i7 + i6, lineInfo);
                this.appendable.recomputeLineInfo(this.startLine + i6 + 1);
                return;
            }
            throw new IndexOutOfBoundsException(String.format("index %d is out of valid range [%d, %d)", Integer.valueOf(i6), Integer.valueOf(this.startLine), Integer.valueOf(this.endLine)));
        }
    }

    /* loaded from: classes.dex */
    public static class IndexedLineProxy implements Indexed<BasedSequence> {
        final IndexedLineInfoProxy proxy;
        final boolean withPrefixes;

        public IndexedLineProxy(IndexedLineInfoProxy indexedLineInfoProxy, boolean z5) {
            this.proxy = indexedLineInfoProxy;
            this.withPrefixes = z5;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public int modificationCount() {
            return this.proxy.modificationCount();
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public void removeAt(int i6) {
            this.proxy.removeAt(i6);
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public int size() {
            return this.proxy.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public BasedSequence get(int i6) {
            IndexedLineInfoProxy indexedLineInfoProxy = this.proxy;
            return (indexedLineInfoProxy.maxTrailingBlankLines == -1 && i6 + 1 == indexedLineInfoProxy.size()) ? this.withPrefixes ? this.proxy.get(i6).getLineNoEOL() : this.proxy.get(i6).getTextNoEOL() : this.withPrefixes ? this.proxy.get(i6).getLine() : this.proxy.get(i6).getText();
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public void set(int i6, BasedSequence basedSequence) {
            if (this.withPrefixes) {
                IndexedLineInfoProxy indexedLineInfoProxy = this.proxy;
                indexedLineInfoProxy.appendable.setLine(i6 + indexedLineInfoProxy.startLine, BasedSequence.NULL, basedSequence);
            } else {
                IndexedLineInfoProxy indexedLineInfoProxy2 = this.proxy;
                LineAppendableImpl lineAppendableImpl = indexedLineInfoProxy2.appendable;
                int i7 = indexedLineInfoProxy2.startLine;
                lineAppendableImpl.setLine(i6 + i7, lineAppendableImpl.getLineInfo(i6 + i7).getPrefix(), basedSequence);
            }
        }
    }

    public LineAppendableImpl(int i6) {
        this((Appendable) null, LineAppendable.toOptionSet(i6));
    }

    private void addLineRange(int i6, int i7, CharSequence charSequence) {
        this.lines.add(getLineRange(i6, i7, charSequence));
        resetBuilder();
    }

    private boolean any(int i6) {
        return this.options.any(i6);
    }

    private void appendEol(CharSequence charSequence) {
        this.appendable.append(charSequence);
        addLineRange(0, this.appendable.length() - charSequence.length(), this.prefix);
        this.eolOnFirstText = 0;
        rawIndentsOnFirstEol();
    }

    private void appendImpl(CharSequence charSequence, int i6) {
        char charAt = charSequence.charAt(i6);
        if (this.passThrough) {
            if (charAt == '\n') {
                appendEol(BasedSequence.EOL);
                return;
            }
            if (this.eolOnFirstText > 0) {
                this.eolOnFirstText = 0;
                appendEol(BasedSequence.EOL);
            }
            if (charAt != '\t' && charAt != ' ') {
                this.allWhitespace = false;
            }
            this.appendable.append(charAt);
            return;
        }
        if (charAt == '\n') {
            Pair<Range, CharSequence> rangePrefixAfterEol = getRangePrefixAfterEol();
            Range first = rangePrefixAfterEol.getFirst();
            if (first.isNull()) {
                resetBuilder();
            } else {
                this.appendable.append(charAt);
                addLineRange(first.getStart(), first.getEnd(), rangePrefixAfterEol.getSecond());
            }
            rawIndentsOnFirstEol();
            return;
        }
        doEolOnFirstTest();
        if (charAt == '\t') {
            if (this.preFormattedNesting == 0 && any(LineAppendable.F_COLLAPSE_WHITESPACE)) {
                if (this.lastWasWhitespace) {
                    return;
                }
                this.appendable.append(SequenceUtils.SPC);
                this.lastWasWhitespace = true;
                return;
            }
            if (any(LineAppendable.F_CONVERT_TABS)) {
                this.appendable.append(SequenceUtils.SPC, 4 - (this.appendable.length() % 4));
                return;
            } else {
                this.appendable.append(charSequence, i6, i6 + 1);
                return;
            }
        }
        if (charAt == ' ') {
            if (this.preFormattedNesting == 0) {
                if (!any(LineAppendable.F_TRIM_LEADING_WHITESPACE) || (this.appendable.length() != 0 && !this.allWhitespace)) {
                    if (any(LineAppendable.F_COLLAPSE_WHITESPACE)) {
                        if (!this.lastWasWhitespace) {
                            this.appendable.append(SequenceUtils.SPC);
                        }
                    } else {
                        this.appendable.append(SequenceUtils.SPC);
                    }
                }
            } else {
                this.appendable.append(charSequence.subSequence(i6, i6 + 1));
            }
            this.lastWasWhitespace = true;
            return;
        }
        this.allWhitespace = false;
        this.lastWasWhitespace = false;
        this.appendable.append(charSequence, i6, i6 + 1);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder] */
    private LineInfo createLineInfo(int i6, CharSequence charSequence, CharSequence charSequence2) {
        LineInfo lineInfo = i6 == 0 ? LineInfo.NULL : this.lines.get(i6 - 1);
        LineInfo lineInfo2 = i6 == this.lines.size() ? LineInfo.NULL : this.lines.get(i6);
        CharSequence trimmedEOL = SequenceUtils.trimmedEOL(charSequence2);
        if (trimmedEOL == null) {
            trimmedEOL = SequenceUtils.EOL;
        } else {
            charSequence2 = charSequence2.subSequence(0, charSequence2.length() - trimmedEOL.length());
        }
        if (charSequence2.length() == 0) {
            charSequence = SequenceUtils.trimEnd(charSequence);
        }
        CharSequence sequence = this.appendable.getBuilder().append(charSequence).append(charSequence2).append(trimmedEOL).toSequence();
        return LineInfo.create(sequence, lineInfo, charSequence.length(), charSequence2.length(), sequence.length(), SequenceUtils.isBlank(charSequence), SequenceUtils.isBlank(charSequence2), lineInfo2.isNotNull() ? lineInfo2.getPreformatted() : (!lineInfo.isPreformatted() || lineInfo.getPreformatted() == LineInfo.Preformatted.LAST) ? LineInfo.Preformatted.NONE : LineInfo.Preformatted.BODY);
    }

    private void doEolOnFirstTest() {
        if (this.eolOnFirstText > 0) {
            this.eolOnFirstText = 0;
            appendEol(BasedSequence.EOL);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence] */
    private LineInfo getLineRange(int i6, int i7, CharSequence charSequence) {
        Object sequence = this.appendable.toSequence();
        CharSequence trimmedEOL = SequenceUtils.trimmedEOL(sequence);
        if (trimmedEOL == null || trimmedEOL.length() == 0) {
            trimmedEOL = SequenceUtils.EOL;
        }
        Range range = Range.NULL;
        CharSequence subSequence = (i6 == range.getStart() && i7 == range.getEnd()) ? BasedSequence.NULL : sequence.subSequence(i6, Math.max(i6, i7 - Math.max(0, trimmedEOL.length() - 1)));
        CharSequence trimEnd = i6 >= i7 ? SequenceUtils.trimEnd(charSequence) : charSequence;
        CharSequence sequence2 = this.appendable.getBuilder().append(trimEnd).append(subSequence).append(trimmedEOL).toSequence();
        return LineInfo.create(sequence2, getLastLineInfo(), trimEnd.length(), subSequence.length(), sequence2.length(), SequenceUtils.isBlank(trimEnd), this.allWhitespace || subSequence.length() == 0, this.preFormattedNesting > 0 ? this.preFormattedFirstLine == this.lines.size() ? LineInfo.Preformatted.FIRST : LineInfo.Preformatted.BODY : this.preFormattedFirstLine == this.lines.size() ? LineInfo.Preformatted.LAST : LineInfo.Preformatted.NONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.vladsch.flexmark.util.misc.Pair<com.vladsch.flexmark.util.sequence.Range, java.lang.CharSequence> getRangePrefixAfterEol() {
        /*
            r6 = this;
            com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder<?, ?> r0 = r6.appendable
            int r0 = r0.length()
            int r1 = r0 + 1
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.LineInfo> r2 = r6.lines
            int r2 = r2.size()
            boolean r3 = r6.isPrefixed(r2)
            boolean r4 = r6.passThrough
            r5 = 0
            if (r4 == 0) goto L28
            com.vladsch.flexmark.util.misc.Pair r1 = new com.vladsch.flexmark.util.misc.Pair
            com.vladsch.flexmark.util.sequence.Range r0 = com.vladsch.flexmark.util.sequence.Range.of(r5, r0)
            if (r3 == 0) goto L22
            java.lang.CharSequence r2 = r6.prefix
            goto L24
        L22:
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
        L24:
            r1.<init>(r0, r2)
            return r1
        L28:
            boolean r4 = r6.allWhitespace
            if (r4 == 0) goto L5f
            int r4 = r6.preFormattedNesting
            if (r4 != 0) goto L5f
            int r4 = r6.preFormattedFirstLine
            if (r4 == r2) goto L5f
            int r4 = r6.preFormattedLastLine
            if (r4 == r2) goto L5f
            int r1 = com.vladsch.flexmark.util.sequence.LineAppendable.F_TRIM_LEADING_EOL
            boolean r1 = r6.any(r1)
            if (r1 == 0) goto L53
            java.util.ArrayList<com.vladsch.flexmark.util.sequence.LineInfo> r1 = r6.lines
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L49
            goto L53
        L49:
            com.vladsch.flexmark.util.misc.Pair r0 = new com.vladsch.flexmark.util.misc.Pair
            com.vladsch.flexmark.util.sequence.Range r1 = com.vladsch.flexmark.util.sequence.Range.NULL
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
            r0.<init>(r1, r2)
            return r0
        L53:
            com.vladsch.flexmark.util.misc.Pair r1 = new com.vladsch.flexmark.util.misc.Pair
            com.vladsch.flexmark.util.sequence.Range r0 = com.vladsch.flexmark.util.sequence.Range.of(r5, r0)
            java.lang.CharSequence r2 = r6.prefix
            r1.<init>(r0, r2)
            return r1
        L5f:
            boolean r4 = r6.isTrimTrailingWhitespace()
            if (r4 == 0) goto L79
            int r4 = r6.preFormattedNesting
            if (r4 != 0) goto L79
            boolean r4 = r6.allWhitespace
            if (r4 == 0) goto L6e
            goto L7a
        L6e:
            com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder<?, ?> r4 = r6.appendable
            java.lang.CharSequence r4 = r4.toSequence()
            int r0 = com.vladsch.flexmark.util.sequence.SequenceUtils.countTrailingSpaceTab(r4, r0)
            int r1 = r1 - r0
        L79:
            r0 = r5
        L7a:
            int r4 = r6.preFormattedFirstLine
            if (r4 != r2) goto L83
            int r4 = r6.preFormattedFirstLineOffset
            if (r0 <= r4) goto L83
            r0 = r4
        L83:
            int r4 = r6.preFormattedLastLine
            if (r4 != r2) goto L8f
            int r2 = r6.preFormattedLastLineOffset
            int r4 = r2 + 1
            if (r1 >= r4) goto L8f
            int r1 = r2 + 1
        L8f:
            com.vladsch.flexmark.util.misc.Pair r2 = new com.vladsch.flexmark.util.misc.Pair
            int r1 = r1 + (-1)
            com.vladsch.flexmark.util.sequence.Range r0 = com.vladsch.flexmark.util.sequence.Range.of(r0, r1)
            if (r3 == 0) goto L9c
            java.lang.CharSequence r1 = r6.prefix
            goto L9e
        L9c:
            com.vladsch.flexmark.util.sequence.BasedSequence r1 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
        L9e:
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.sequence.LineAppendableImpl.getRangePrefixAfterEol():com.vladsch.flexmark.util.misc.Pair");
    }

    private boolean isCollapseWhitespace() {
        return any(LineAppendable.F_COLLAPSE_WHITESPACE);
    }

    private boolean isConvertingTabs() {
        return any(LineAppendable.F_CONVERT_TABS | LineAppendable.F_COLLAPSE_WHITESPACE);
    }

    private boolean isPrefixed(int i6) {
        if (any(LineAppendable.F_PREFIX_PRE_FORMATTED) || this.preFormattedFirstLine == i6) {
            return true;
        }
        return this.preFormattedNesting == 0 && this.preFormattedLastLine != i6;
    }

    private boolean isTrailingBlankLine() {
        return this.appendable.length() == 0 && getLastLineInfo().isBlankText();
    }

    private boolean isTrimLeadingWhitespace() {
        return any(LineAppendable.F_TRIM_LEADING_WHITESPACE);
    }

    private boolean isTrimTrailingWhitespace() {
        return any(LineAppendable.F_TRIM_TRAILING_WHITESPACE);
    }

    private int offsetAfterEol() {
        Pair<Range, CharSequence> rangePrefixAfterEol = getRangePrefixAfterEol();
        LineInfo lastLineInfo = getLastLineInfo();
        if (rangePrefixAfterEol.getFirst().isNull()) {
            return lastLineInfo.sumLength;
        }
        Range first = rangePrefixAfterEol.getFirst();
        CharSequence second = rangePrefixAfterEol.getSecond();
        if (first.isEmpty() && second.length() != 0) {
            second = SequenceUtils.trimEnd(second);
        }
        return second.length() + rangePrefixAfterEol.getFirst().getSpan() + lastLineInfo.sumLength;
    }

    private void rawIndent() {
        this.prefixStack.push(this.prefixAfterEol);
        CharSequence combinedPrefix = LineAppendable.combinedPrefix(this.prefixAfterEol, this.indentPrefix);
        this.prefix = combinedPrefix;
        this.prefixAfterEol = combinedPrefix;
        this.indentPrefixStack.push(Boolean.TRUE);
    }

    private void rawIndentsOnFirstEol() {
        this.prefix = this.prefixAfterEol;
        while (!this.indentsOnFirstEol.isEmpty()) {
            Runnable remove = this.indentsOnFirstEol.remove(r0.size() - 1);
            rawIndent();
            remove.run();
        }
    }

    private void rawUnIndent() {
        if (this.prefixStack.isEmpty()) {
            throw new IllegalStateException("unIndent with an empty stack");
        }
        if (!this.indentPrefixStack.peek().booleanValue()) {
            throw new IllegalStateException("unIndent for an element added by pushPrefix(), use popPrefix() instead");
        }
        CharSequence pop = this.prefixStack.pop();
        this.prefix = pop;
        this.prefixAfterEol = pop;
        this.indentPrefixStack.pop();
    }

    private int removeLinesRaw(int i6, int i7) {
        int minLimit = Utils.minLimit(i6, 0);
        int maxLimit = Utils.maxLimit(i7, getLineCountWithPending());
        if (minLimit < maxLimit) {
            this.lines.subList(minLimit, maxLimit).clear();
            this.modificationCount++;
            return minLimit;
        }
        if (i7 >= getLineCountWithPending() && this.appendable.length() > 0) {
            resetBuilder();
        }
        return this.lines.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder<?, ?>] */
    private void resetBuilder() {
        this.appendable = this.appendable.getBuilder();
        this.allWhitespace = true;
        this.lastWasWhitespace = true;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable addIndentOnFirstEOL(Runnable runnable) {
        this.indentsOnFirstEol.add(runnable);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable addPrefix(CharSequence charSequence, boolean z5) {
        if (!this.passThrough && charSequence.length() != 0) {
            if (z5) {
                this.prefixAfterEol = LineAppendable.combinedPrefix(this.prefixAfterEol, charSequence);
                return this;
            }
            CharSequence combinedPrefix = LineAppendable.combinedPrefix(this.prefixAfterEol, charSequence);
            this.prefix = combinedPrefix;
            this.prefixAfterEol = combinedPrefix;
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public <T extends Appendable> T appendTo(T t5, boolean z5, int i6, int i7, int i8, int i9) {
        line();
        return (T) appendToNoLine(t5, z5, i6, i7, i8, i9);
    }

    public <T extends Appendable> T appendToNoLine(T t5, boolean z5, int i6, int i7, int i8, int i9) {
        boolean z6 = i7 >= 0;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, i7);
        int size = this.lines.size();
        int min = Utils.min(getLineCountWithPending(), i9);
        int lastNonBlankLine = lastNonBlankLine(min);
        int i10 = i8;
        int i11 = 0;
        while (i10 < min) {
            LineInfo lineInfo = getLineInfo(i10);
            boolean z7 = i10 < size;
            if (lineInfo.textLength != 0 || lineInfo.isPreformatted()) {
                if (!z7 || (!z6 && i10 >= lastNonBlankLine && (!lineInfo.isPreformatted() || lineInfo.getPreformatted() == LineInfo.Preformatted.LAST))) {
                    if (z5) {
                        t5.append(lineInfo.getLineNoEOL());
                    } else {
                        t5.append(lineInfo.getText());
                    }
                } else if (z5) {
                    t5.append(lineInfo.lineSeq);
                } else {
                    t5.append(lineInfo.getText());
                }
                i11 = 0;
            } else if (i10 > lastNonBlankLine) {
                if (i11 < max2) {
                    i11++;
                    if (z5) {
                        boolean isTrimTrailingWhitespace = isTrimTrailingWhitespace();
                        CharSequence prefix = lineInfo.getPrefix();
                        if (isTrimTrailingWhitespace) {
                            prefix = SequenceUtils.trimEnd(prefix);
                        }
                        t5.append(prefix);
                    }
                    if (z7 && (z6 || i11 != max2)) {
                        t5.append(EOL);
                    }
                }
            } else if (i11 < max) {
                i11++;
                if (z5) {
                    boolean isTrimTrailingWhitespace2 = isTrimTrailingWhitespace();
                    CharSequence prefix2 = lineInfo.getPrefix();
                    if (isTrimTrailingWhitespace2) {
                        prefix2 = SequenceUtils.trimEnd(prefix2);
                    }
                    t5.append(prefix2);
                }
                if (z7) {
                    t5.append(EOL);
                }
            }
            i10++;
        }
        return t5;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable blankLine() {
        line();
        if ((!this.lines.isEmpty() && !isTrailingBlankLine()) || (this.lines.isEmpty() && !any(LineAppendable.F_TRIM_LEADING_EOL))) {
            appendEol(BasedSequence.EOL);
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable blankLineIf(boolean z5) {
        if (z5) {
            blankLine();
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable changeOptions(int i6, int i7) {
        int i8 = i6 & i7;
        if (i8 != 0) {
            throw new IllegalStateException(String.format("Add flags:%d and remove flags:%d overlap:%d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        this.options.orMask(i6);
        this.options.andNotMask(i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable closePreFormatted() {
        int i6 = this.preFormattedNesting;
        if (i6 <= 0) {
            throw new IllegalStateException("closePreFormatted called with nesting == 0");
        }
        int i7 = i6 - 1;
        this.preFormattedNesting = i7;
        if (i7 == 0 && !endsWithEOL()) {
            this.preFormattedLastLine = this.lines.size();
            this.preFormattedLastLineOffset = this.appendable.length();
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int column() {
        return this.appendable.length();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public boolean endsWithEOL() {
        return this.appendable.length() == 0 && getLastLineInfo().isNotNull();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getAfterEolPrefixDelta() {
        return this.prefixAfterEol.length() - this.prefix.length();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getBeforeEolPrefix() {
        return BasedSequence.of(this.prefix);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder<?, ?>] */
    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public ISequenceBuilder<?, ?> getBuilder() {
        return this.appendable.getBuilder();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable getEmptyAppendable() {
        return new LineAppendableImpl(this, getOptions());
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getIndentPrefix() {
        return BasedSequence.of(this.indentPrefix);
    }

    public IndexedLineInfoProxy getIndexedLineInfoProxy(int i6, int i7, int i8) {
        return new IndexedLineInfoProxy(this, i6, i7, i8);
    }

    public IndexedLineProxy getIndexedLineProxy(int i6, int i7, int i8, boolean z5) {
        return new IndexedLineProxy(getIndexedLineInfoProxy(i6, i7, i8), z5);
    }

    public LineInfo getLastLineInfo() {
        if (this.lines.isEmpty()) {
            return LineInfo.NULL;
        }
        return this.lines.get(r0.size() - 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getLine(int i6) {
        return getLineInfo(i6).getLine();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getLineCount() {
        return this.lines.size();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getLineCountWithPending() {
        return this.appendable.length() == 0 ? this.lines.size() : this.lines.size() + 1;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineInfo getLineInfo(int i6) {
        if (i6 != this.lines.size()) {
            return this.lines.get(i6);
        }
        if (this.appendable.length() == 0) {
            return LineInfo.NULL;
        }
        Pair<Range, CharSequence> rangePrefixAfterEol = getRangePrefixAfterEol();
        Range first = rangePrefixAfterEol.getFirst();
        return first.isNull() ? LineInfo.NULL : getLineRange(first.getStart(), first.getEnd(), rangePrefixAfterEol.getSecond());
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public Iterable<BasedSequence> getLines(int i6, int i7, int i8, boolean z5) {
        return new IndexedItemIterable(getIndexedLineProxy(i6, i7, i8, z5));
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public Iterable<LineInfo> getLinesInfo(int i6, int i7, int i8) {
        return new IndexedItemIterable(getIndexedLineInfoProxy(i6, i7, i8));
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BitFieldSet<LineAppendable.Options> getOptionSet() {
        return this.options;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getPendingEOL() {
        if (this.appendable.length() == 0) {
            return getTrailingBlankLines(this.lines.size()) + 1;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence] */
    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getPendingSpace() {
        if (!this.lastWasWhitespace || this.appendable.length() == 0) {
            return 0;
        }
        return SequenceUtils.countTrailingSpaceTab(this.appendable.toSequence());
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getPrefix() {
        return BasedSequence.of(this.prefixAfterEol);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getTrailingBlankLines(int i6) {
        int min = Math.min(this.lines.size(), i6);
        return (min - lastNonBlankLine(min)) - 1;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable indent() {
        if (!this.passThrough) {
            line();
            rawIndent();
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void insertLine(int i6, CharSequence charSequence, CharSequence charSequence2) {
        this.lines.add(i6, createLineInfo(i6, charSequence, charSequence2));
        recomputeLineInfo(i6 + 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public boolean isPendingSpace() {
        return this.appendable.length() > 0 && this.lastWasWhitespace;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public boolean isPreFormatted() {
        return this.preFormattedNesting > 0;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Iterable
    public Iterator<LineInfo> iterator() {
        return new IndexedItemIterator(getIndexedLineInfoProxy(TableCell.NOT_TRACKED, 0, getLineCount()));
    }

    public int lastNonBlankLine(int i6) {
        int i7;
        if (i6 > this.lines.size() && this.appendable.length() > 0 && !this.allWhitespace) {
            return this.lines.size();
        }
        int min = Math.min(this.lines.size(), i6);
        while (true) {
            i7 = min - 1;
            if (min <= 0 || !this.lines.get(i7).isBlankText()) {
                break;
            }
            min = i7;
        }
        return i7;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable line() {
        if (this.preFormattedNesting > 0 || this.appendable.length() != 0) {
            appendImpl(SequenceUtils.EOL, 0);
            return this;
        }
        CharSequence charSequence = this.prefix;
        boolean isEmpty = this.indentsOnFirstEol.isEmpty();
        rawIndentsOnFirstEol();
        if (isEmpty && (charSequence.length() <= 0 || this.prefix.length() != 0)) {
            return this;
        }
        this.prefix = charSequence;
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable lineIf(boolean z5) {
        if (z5) {
            line();
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable lineOnFirstText(boolean z5) {
        if (z5) {
            this.eolOnFirstText++;
            return this;
        }
        int i6 = this.eolOnFirstText;
        if (i6 > 0) {
            this.eolOnFirstText = i6 - 1;
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable lineWithTrailingSpaces(int i6) {
        if (this.preFormattedNesting <= 0 && this.appendable.length() == 0) {
            return this;
        }
        int i7 = this.options.toInt();
        this.options.andNotMask(LineAppendable.F_TRIM_TRAILING_WHITESPACE | LineAppendable.F_COLLAPSE_WHITESPACE);
        if (i6 > 0) {
            append(SequenceUtils.SPC, i6);
        }
        appendImpl(SequenceUtils.EOL, 0);
        this.options.setAll(i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int offset() {
        return getLastLineInfo().sumLength;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int offsetWithPending() {
        return offsetAfterEol();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable openPreFormatted(boolean z5) {
        if (this.preFormattedNesting == 0 && this.preFormattedFirstLine != this.lines.size()) {
            this.preFormattedFirstLine = this.lines.size();
            this.preFormattedFirstLineOffset = this.appendable.length();
        }
        this.preFormattedNesting++;
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable popOptions() {
        if (this.optionStack.isEmpty()) {
            throw new IllegalStateException("Option stack is empty");
        }
        this.options.setAll(this.optionStack.pop().intValue());
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable popPrefix(boolean z5) {
        if (this.passThrough) {
            return this;
        }
        if (this.prefixStack.isEmpty()) {
            throw new IllegalStateException("popPrefix with an empty stack");
        }
        if (this.indentPrefixStack.peek().booleanValue()) {
            throw new IllegalStateException("popPrefix for element added by indent(), use unIndent() instead");
        }
        CharSequence pop = this.prefixStack.pop();
        this.prefixAfterEol = pop;
        if (!z5) {
            this.prefix = pop;
        }
        this.indentPrefixStack.pop();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable pushOptions() {
        this.optionStack.push(Integer.valueOf(this.options.toInt()));
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable pushPrefix() {
        if (!this.passThrough) {
            this.prefixStack.push(this.prefixAfterEol);
            this.indentPrefixStack.push(Boolean.FALSE);
        }
        return this;
    }

    public void recomputeLineInfo(int i6) {
        int size = this.lines.size();
        int max = Math.max(0, i6);
        if (max < size) {
            int i7 = max - 1;
            LineInfo lineInfo = i7 >= 0 ? this.lines.get(i7) : LineInfo.NULL;
            while (max < size) {
                LineInfo lineInfo2 = this.lines.get(max);
                lineInfo = LineInfo.create(lineInfo, lineInfo2);
                this.lines.set(max, lineInfo);
                if (!lineInfo.needAggregateUpdate(lineInfo2)) {
                    return;
                } else {
                    max++;
                }
            }
        }
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable removeExtraBlankLines(int i6, int i7, int i8, int i9) {
        int max = Math.max(0, i6);
        int max2 = Math.max(0, i7);
        int min = Utils.min(i9, getLineCountWithPending());
        int lineCountWithPending = getLineCountWithPending();
        int i10 = 0;
        while (true) {
            int i11 = min - 1;
            if (min <= 0) {
                recomputeLineInfo(lineCountWithPending);
                return this;
            }
            LineInfo lineInfo = getLineInfo(i11);
            if (!lineInfo.isBlankText() || lineInfo.isPreformatted()) {
                max2 = max;
                i10 = 0;
            } else if (i10 >= max2) {
                int i12 = i11 + i10;
                lineCountWithPending = removeLinesRaw(i12, i12 + 1);
            } else {
                i10++;
            }
            min = i11;
        }
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable removeIndentOnFirstEOL(Runnable runnable) {
        this.indentsOnFirstEol.remove(runnable);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable removeLines(int i6, int i7) {
        recomputeLineInfo(removeLinesRaw(i6, i7));
        return this;
    }

    public LineAppendable repeat(CharSequence charSequence, int i6) {
        append(RepeatedSequence.repeatOf(charSequence, i6));
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable setIndentPrefix(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BasedSequence.NULL;
        }
        this.indentPrefix = charSequence;
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void setLine(int i6, CharSequence charSequence, CharSequence charSequence2) {
        if (i6 == this.lines.size() && this.appendable.length() > 0) {
            line();
        }
        this.lines.set(i6, createLineInfo(i6, charSequence, charSequence2));
        recomputeLineInfo(i6 + 1);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable setOptions(int i6) {
        this.options.setAll(i6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable setPrefix(CharSequence charSequence, boolean z5) {
        if (!this.passThrough) {
            if (z5) {
                if (charSequence == null) {
                    charSequence = BasedSequence.NULL;
                }
                this.prefixAfterEol = charSequence;
                return this;
            }
            if (charSequence == null) {
                charSequence = BasedSequence.NULL;
            }
            this.prefix = charSequence;
            this.prefixAfterEol = charSequence;
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void setPrefixLength(int i6, int i7) {
        if (i6 == this.lines.size() && this.appendable.length() > 0) {
            line();
        }
        LineInfo lineInfo = this.lines.get(i6);
        CharSequence charSequence = lineInfo.lineSeq;
        if (i7 < 0 || i7 > lineInfo.getTextEnd()) {
            throw new IllegalArgumentException(String.format("prefixLength %d is out of valid range [0, %d) for the line", Integer.valueOf(i7), Integer.valueOf(lineInfo.getTextEnd() + 1)));
        }
        if (i7 != lineInfo.prefixLength) {
            CharSequence subSequence = charSequence.subSequence(0, i7);
            this.lines.set(i6, LineInfo.create(lineInfo.lineSeq, i6 == 0 ? LineInfo.NULL : this.lines.get(i6 - 1), subSequence.length(), (lineInfo.prefixLength + lineInfo.textLength) - i7, lineInfo.length, SequenceUtils.isBlank(subSequence), SequenceUtils.isBlank(charSequence.subSequence(i7, lineInfo.getTextEnd())), lineInfo.getPreformatted()));
            recomputeLineInfo(i6 + 1);
        }
    }

    public int tailBlankLinesToRemove(int i6, int i7) {
        return Utils.max(0, getTrailingBlankLines(i6) - Utils.max(0, i7));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public CharSequence toSequence(int i6, int i7, boolean z5) {
        ISequenceBuilder<?, ?> builder = getBuilder();
        try {
            appendTo(builder, z5, i6, i7, 0, TableCell.NOT_TRACKED);
        } catch (IOException unused) {
        }
        return builder.toSequence();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            appendToNoLine(sb, true, TableCell.NOT_TRACKED, TableCell.NOT_TRACKED, 0, TableCell.NOT_TRACKED);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable unIndent() {
        if (!this.passThrough) {
            line();
            rawUnIndent();
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable unIndentNoEol() {
        if (!this.passThrough) {
            if (endsWithEOL()) {
                rawUnIndent();
                return this;
            }
            CharSequence charSequence = this.prefix;
            rawUnIndent();
            this.prefixAfterEol = this.prefix;
            this.prefix = charSequence;
        }
        return this;
    }

    public LineAppendableImpl(Appendable appendable, int i6) {
        this(appendable, LineAppendable.toOptionSet(i6));
    }

    public LineAppendable repeat(CharSequence charSequence, int i6, int i7, int i8) {
        append(RepeatedSequence.repeatOf(charSequence.subSequence(i6, i7), i8));
        return this;
    }

    public LineAppendableImpl(Appendable appendable, BitFieldSet<LineAppendable.Options> bitFieldSet) {
        ISequenceBuilder<?, ?> builder;
        this.optionStack = new Stack<>();
        if (appendable instanceof ISequenceBuilder) {
            builder = ((ISequenceBuilder) appendable).getBuilder();
        } else {
            builder = appendable instanceof LineAppendable ? ((LineAppendable) appendable).getBuilder() : StringSequenceBuilder.emptyBuilder();
        }
        this.appendable = builder;
        this.options = bitFieldSet;
        this.passThrough = any(LineAppendable.F_PASS_THROUGH);
        this.preFormattedNesting = 0;
        this.preFormattedFirstLine = -1;
        this.preFormattedLastLine = -1;
        this.allWhitespace = true;
        this.lastWasWhitespace = false;
        this.lines = new ArrayList<>();
        this.prefixStack = new Stack<>();
        this.indentPrefixStack = new Stack<>();
        BasedSequence basedSequence = BasedSequence.EMPTY;
        this.prefix = basedSequence;
        this.prefixAfterEol = basedSequence;
        this.indentPrefix = basedSequence;
        this.eolOnFirstText = 0;
        this.indentsOnFirstEol = new ArrayList<>();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable blankLine(int i6) {
        line();
        if (any(LineAppendable.F_TRIM_LEADING_EOL) && this.lines.isEmpty()) {
            return this;
        }
        appendEol(i6 - getTrailingBlankLines(this.lines.size()));
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public LineAppendable append(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            appendImpl(charSequence, 0, charSequence.length());
            return this;
        }
        this.appendable.append(charSequence);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public String toString(int i6, int i7, boolean z5) {
        StringBuilder sb = new StringBuilder();
        try {
            appendTo(sb, z5, i6, i7, 0, TableCell.NOT_TRACKED);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    private void appendEol(int i6) {
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                return;
            }
            appendEol(BasedSequence.EOL);
            i6 = i7;
        }
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public LineAppendable append(CharSequence charSequence, int i6, int i7) {
        if (i6 < i7) {
            appendImpl(charSequence, i6, i7);
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public LineAppendable append(char c6) {
        appendImpl(Character.toString(c6), 0);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable append(char c6, int i6) {
        append(RepeatedSequence.repeatOf(c6, i6));
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineAppendable append(LineAppendable lineAppendable, int i6, int i7, boolean z5) {
        int min = Math.min(i7, lineAppendable.getLineCountWithPending());
        for (int max = Math.max(0, i6); max < min; max++) {
            LineInfo lineInfo = lineAppendable.getLineInfo(max);
            BasedSequence textNoEOL = lineInfo.getTextNoEOL();
            CharSequence prefix = z5 ? lineInfo.getPrefix() : BasedSequence.NULL;
            if (any(LineAppendable.F_PREFIX_PRE_FORMATTED) || !lineInfo.isPreformatted() || lineInfo.getPreformatted() == LineInfo.Preformatted.FIRST) {
                prefix = LineAppendable.combinedPrefix(this.prefix, prefix);
            }
            this.appendable.append((CharSequence) textNoEOL);
            this.allWhitespace = lineInfo.isBlankText();
            int i8 = lineInfo.textLength;
            this.lastWasWhitespace = i8 == 0 || CharPredicate.SPACE_TAB.test(textNoEOL.safeCharAt(i8 + (-1)));
            if (max < lineAppendable.getLineCount()) {
                this.appendable.append(EOL);
                this.allWhitespace = lineInfo.isBlankText();
                addLineRange(0, this.appendable.length() - 1, prefix);
            } else {
                this.prefix = prefix;
            }
        }
        return this;
    }

    private void appendImpl(CharSequence charSequence, int i6, int i7) {
        while (i6 < i7) {
            appendImpl(charSequence, i6);
            i6++;
        }
    }
}
