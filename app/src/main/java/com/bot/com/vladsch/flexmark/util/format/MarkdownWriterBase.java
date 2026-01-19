package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.format.MarkdownWriterBase;
import com.vladsch.flexmark.util.format.NodeContext;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.LineAppendableImpl;
import com.vladsch.flexmark.util.sequence.LineInfo;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class MarkdownWriterBase<T extends MarkdownWriterBase<T, N, C>, N, C extends NodeContext<N, C>> implements LineAppendable {
    protected final LineAppendableImpl appendable;
    protected C context;

    public MarkdownWriterBase() {
        this(0);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public <T extends Appendable> T appendTo(T t5, boolean z5, int i6, int i7, int i8, int i9) {
        return (T) this.appendable.appendTo(t5, z5, i6, i7, i8, i9);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int column() {
        return this.appendable.column();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public boolean endsWithEOL() {
        return this.appendable.endsWithEOL();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getAfterEolPrefixDelta() {
        return this.appendable.getAfterEolPrefixDelta();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getBeforeEolPrefix() {
        return this.appendable.getBeforeEolPrefix();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public ISequenceBuilder<?, ?> getBuilder() {
        return this.appendable.getBuilder();
    }

    public C getContext() {
        return this.context;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getIndentPrefix() {
        return this.appendable.getIndentPrefix();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getLine(int i6) {
        return this.appendable.getLine(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getLineCount() {
        return this.appendable.getLineCount();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getLineCountWithPending() {
        return this.appendable.getLineCountWithPending();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public LineInfo getLineInfo(int i6) {
        return this.appendable.getLineInfo(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public Iterable<BasedSequence> getLines(int i6, int i7, int i8, boolean z5) {
        return this.appendable.getLines(i6, i7, i8, true);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public Iterable<LineInfo> getLinesInfo(int i6, int i7, int i8) {
        return this.appendable.getLinesInfo(i6, i7, i8);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BitFieldSet<LineAppendable.Options> getOptionSet() {
        return this.appendable.getOptionSet();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getOptions() {
        return this.appendable.getOptions();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getPendingEOL() {
        return this.appendable.getPendingEOL();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getPendingSpace() {
        return this.appendable.getPendingSpace();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getPrefix() {
        return this.appendable.getPrefix();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int getTrailingBlankLines(int i6) {
        return this.appendable.getTrailingBlankLines(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void insertLine(int i6, CharSequence charSequence, CharSequence charSequence2) {
        this.appendable.insertLine(i6, charSequence, charSequence2);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public boolean isPendingSpace() {
        return this.appendable.isPendingSpace();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public boolean isPreFormatted() {
        return this.appendable.isPreFormatted();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Iterable
    public Iterator<LineInfo> iterator() {
        return this.appendable.iterator();
    }

    public abstract BasedSequence lastBlockQuoteChildPrefix(BasedSequence basedSequence);

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int offset() {
        return this.appendable.offset();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int offsetWithPending() {
        return this.appendable.offsetWithPending();
    }

    public void setContext(C c6) {
        this.context = c6;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void setLine(int i6, CharSequence charSequence, CharSequence charSequence2) {
        this.appendable.setLine(i6, charSequence, charSequence2);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void setPrefixLength(int i6, int i7) {
        this.appendable.setPrefixLength(i6, i7);
    }

    public T tailBlankLine() {
        return tailBlankLine(1);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public CharSequence toSequence(int i6, int i7, boolean z5) {
        return this.appendable.toSequence(i6, i7, z5);
    }

    public String toString() {
        return this.appendable.toString();
    }

    public MarkdownWriterBase(int i6) {
        this(null, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T addIndentOnFirstEOL(Runnable runnable) {
        this.appendable.addIndentOnFirstEOL(runnable);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T blankLineIf(boolean z5) {
        this.appendable.blankLineIf(z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T changeOptions(int i6, int i7) {
        this.appendable.changeOptions(i6, i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T closePreFormatted() {
        this.appendable.closePreFormatted();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T indent() {
        this.appendable.indent();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T line() {
        this.appendable.line();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T lineIf(boolean z5) {
        this.appendable.lineIf(z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T lineOnFirstText(boolean z5) {
        this.appendable.lineOnFirstText(z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T lineWithTrailingSpaces(int i6) {
        this.appendable.lineWithTrailingSpaces(i6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T openPreFormatted(boolean z5) {
        this.appendable.openPreFormatted(z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T popOptions() {
        this.appendable.popOptions();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T pushOptions() {
        this.appendable.pushOptions();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T pushPrefix() {
        this.appendable.pushPrefix();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T removeExtraBlankLines(int i6, int i7, int i8, int i9) {
        this.appendable.removeExtraBlankLines(i6, i7, i8, i9);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T removeIndentOnFirstEOL(Runnable runnable) {
        this.appendable.removeIndentOnFirstEOL(runnable);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T removeLines(int i6, int i7) {
        this.appendable.removeLines(i6, i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T setIndentPrefix(CharSequence charSequence) {
        this.appendable.setIndentPrefix(charSequence);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T setOptions(int i6) {
        this.appendable.setOptions(i6);
        return this;
    }

    public T tailBlankLine(int i6) {
        BasedSequence prefix = this.appendable.getPrefix();
        BasedSequence lastBlockQuoteChildPrefix = lastBlockQuoteChildPrefix(prefix);
        if (!lastBlockQuoteChildPrefix.equals(prefix)) {
            this.appendable.setPrefix(lastBlockQuoteChildPrefix, false);
            this.appendable.blankLine(i6);
            this.appendable.setPrefix(prefix, false);
            return this;
        }
        this.appendable.blankLine(i6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public String toString(int i6, int i7, boolean z5) {
        return this.appendable.toString(i6, i7, z5);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T unIndent() {
        this.appendable.unIndent();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T unIndentNoEol() {
        this.appendable.unIndentNoEol();
        return this;
    }

    public MarkdownWriterBase(Appendable appendable, int i6) {
        LineAppendableImpl lineAppendableImpl = new LineAppendableImpl(appendable, i6);
        this.appendable = lineAppendableImpl;
        lineAppendableImpl.setOptions(lineAppendableImpl.getOptions() | LineAppendable.F_PREFIX_PRE_FORMATTED);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T addPrefix(CharSequence charSequence) {
        this.appendable.addPrefix(charSequence);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T blankLine() {
        this.appendable.blankLine();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T popPrefix() {
        this.appendable.popPrefix();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T setPrefix(CharSequence charSequence) {
        this.appendable.setPrefix(charSequence);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T addPrefix(CharSequence charSequence, boolean z5) {
        this.appendable.addPrefix(charSequence, z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T blankLine(int i6) {
        this.appendable.blankLine(i6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T popPrefix(boolean z5) {
        this.appendable.popPrefix(z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T setPrefix(CharSequence charSequence, boolean z5) {
        this.appendable.setPrefix(charSequence, z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public T append(char c6) {
        this.appendable.append(c6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public T append(CharSequence charSequence) {
        this.appendable.append(charSequence);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Appendable
    public T append(CharSequence charSequence, int i6, int i7) {
        this.appendable.append(charSequence, i6, i7);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T append(LineAppendable lineAppendable, int i6, int i7, boolean z5) {
        this.appendable.append(lineAppendable, i6, i7, z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T append(char c6, int i6) {
        this.appendable.append(c6, i6);
        return this;
    }
}
