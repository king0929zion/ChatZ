package com.vladsch.flexmark.util.html;

import I.h;
import com.vladsch.flexmark.util.html.HtmlAppendableBase;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.LineAppendableImpl;
import com.vladsch.flexmark.util.sequence.LineInfo;
import com.vladsch.flexmark.util.sequence.RepeatedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public class HtmlAppendableBase<T extends HtmlAppendableBase<T>> implements HtmlAppendable {
    private final LineAppendable appendable;
    private MutableAttributes currentAttributes;
    private boolean indentOnFirstEol;
    private boolean lineOnChildText;
    private final Stack<String> openTags;
    private boolean suppressCloseTagLine;
    private boolean suppressOpenTagLine;
    private boolean withAttributes;

    public HtmlAppendableBase(LineAppendable lineAppendable, boolean z5) {
        this(lineAppendable, z5 ? lineAppendable.getIndentPrefix().length() : 0, lineAppendable.getOptions());
    }

    public static /* synthetic */ void a(boolean[] zArr) {
        lambda$tag$0(zArr);
    }

    private boolean haveOptions(int i6) {
        return (i6 & this.appendable.getOptions()) != 0;
    }

    public static /* synthetic */ void lambda$tag$0(boolean[] zArr) {
        zArr[0] = true;
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public Attributes getAttributes() {
        return this.currentAttributes;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public BasedSequence getBeforeEolPrefix() {
        return this.appendable.getBeforeEolPrefix();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public ISequenceBuilder<?, ?> getBuilder() {
        return this.appendable.getBuilder();
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

    public String getOpenTagText() {
        return Utils.splice(this.openTags, ", ", true);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public Stack<String> getOpenTags() {
        return this.openTags;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public List<String> getOpenTagsAfterLast(CharSequence charSequence) {
        if (this.openTags.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.openTags);
        int size = arrayList.size();
        String valueOf = String.valueOf(charSequence);
        int i6 = size;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                i6 = size;
                break;
            }
            if (((String) arrayList.get(i7)).equals(valueOf)) {
                break;
            }
            i6 = i7;
        }
        return arrayList.subList(i6, size);
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public boolean inPre() {
        return this.appendable.isPreFormatted();
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

    public boolean isSuppressCloseTagLine() {
        return this.suppressCloseTagLine;
    }

    public boolean isSuppressOpenTagLine() {
        return this.suppressOpenTagLine;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable, java.lang.Iterable
    public Iterator<LineInfo> iterator() {
        return this.appendable.iterator();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int offset() {
        return this.appendable.offset();
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public int offsetWithPending() {
        return this.appendable.offsetWithPending();
    }

    public void popTag(CharSequence charSequence) {
        if (this.openTags.isEmpty()) {
            throw new IllegalStateException("Close tag '" + ((Object) charSequence) + "' with no tags open");
        }
        String peek = this.openTags.peek();
        if (peek.equals(String.valueOf(charSequence))) {
            this.openTags.pop();
            return;
        }
        throw new IllegalStateException("Close tag '" + ((Object) charSequence) + "' does not match '" + peek + "' in " + getOpenTagText());
    }

    public void pushTag(CharSequence charSequence) {
        this.openTags.push(String.valueOf(charSequence));
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void setLine(int i6, CharSequence charSequence, CharSequence charSequence2) {
        this.appendable.setLine(i6, charSequence, charSequence2);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public void setPrefixLength(int i6, int i7) {
        this.appendable.setPrefixLength(i6, i7);
    }

    public T setSuppressCloseTagLine(boolean z5) {
        this.suppressCloseTagLine = z5;
        return this;
    }

    public void setSuppressOpenTagLine(boolean z5) {
        this.suppressOpenTagLine = z5;
    }

    public void tagClosed(CharSequence charSequence) {
        popTag(charSequence);
    }

    public void tagOpened(CharSequence charSequence) {
        pushTag(charSequence);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public CharSequence toSequence(int i6, int i7, boolean z5) {
        return this.appendable.toSequence(i6, i7, z5);
    }

    public String toString() {
        return this.appendable.toString();
    }

    public HtmlAppendableBase(int i6, int i7) {
        this(null, i6, i7);
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T closePre() {
        this.appendable.closePreFormatted();
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T closePreFormatted() {
        this.appendable.closePreFormatted();
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T closeTag(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            if (charSequence.charAt(0) == '/') {
                this.appendable.append((CharSequence) "<").append(charSequence).append((CharSequence) ">");
                tagClosed(charSequence.subSequence(1, charSequence.length()));
                return this;
            }
            this.appendable.append((CharSequence) "</").append(charSequence).append((CharSequence) ">");
            tagClosed(charSequence);
            return this;
        }
        throw new IllegalStateException("closeTag called with tag:'" + ((Object) charSequence) + "'");
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public HtmlAppendable getEmptyAppendable() {
        LineAppendable lineAppendable = this.appendable;
        return new HtmlAppendableBase(lineAppendable, lineAppendable.getIndentPrefix().length(), this.appendable.getOptions());
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T openPre() {
        this.appendable.openPreFormatted(true);
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T rawIndentedPre(CharSequence charSequence) {
        this.appendable.openPreFormatted(true).append(charSequence).closePreFormatted();
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T rawPre(CharSequence charSequence) {
        if (this.appendable.getPendingEOL() == 0 && charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            this.appendable.line();
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        this.appendable.openPreFormatted(true).append(charSequence).closePreFormatted();
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T setAttributes(Attributes attributes) {
        this.currentAttributes = attributes.toMutable();
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagIndent(CharSequence charSequence, Runnable runnable) {
        tag(charSequence, true, false, runnable);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagLineIndent(CharSequence charSequence, Runnable runnable) {
        tag(charSequence, true, true, runnable);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagVoid(CharSequence charSequence) {
        return tag(charSequence, true);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagVoidLine(CharSequence charSequence) {
        lineIf(!this.suppressOpenTagLine).tagVoid(charSequence).lineIf(!this.suppressCloseTagLine);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T text(CharSequence charSequence) {
        this.appendable.append((CharSequence) Escaping.escapeHtml(charSequence, false));
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T withAttr() {
        this.withAttributes = true;
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T withCondIndent() {
        this.indentOnFirstEol = true;
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T withCondLineOnChildText() {
        this.lineOnChildText = true;
        return this;
    }

    public HtmlAppendableBase(Appendable appendable, int i6, int i7) {
        this.indentOnFirstEol = false;
        this.lineOnChildText = false;
        this.withAttributes = false;
        this.suppressOpenTagLine = false;
        this.suppressCloseTagLine = false;
        this.openTags = new Stack<>();
        LineAppendableImpl lineAppendableImpl = new LineAppendableImpl(appendable, i7);
        this.appendable = lineAppendableImpl;
        lineAppendableImpl.setIndentPrefix(RepeatedSequence.repeatOf(SequenceUtils.SPACE, i6).toString());
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T raw(CharSequence charSequence) {
        this.appendable.append(charSequence);
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T attr(CharSequence charSequence, CharSequence charSequence2) {
        if (this.currentAttributes == null) {
            this.currentAttributes = new MutableAttributes();
        }
        this.currentAttributes.addValue(charSequence, charSequence2);
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T raw(CharSequence charSequence, int i6) {
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                return this;
            }
            this.appendable.append(charSequence);
            i6 = i7;
        }
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public T setPrefix(CharSequence charSequence, boolean z5) {
        this.appendable.setPrefix(charSequence, z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagLine(CharSequence charSequence) {
        lineIf(!this.suppressOpenTagLine).tag(charSequence).lineIf(!this.suppressCloseTagLine);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tag(CharSequence charSequence) {
        return tag(charSequence, false);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagLine(CharSequence charSequence, boolean z5) {
        lineIf(!this.suppressOpenTagLine).tag(charSequence, z5).lineIf(!this.suppressCloseTagLine);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tag(CharSequence charSequence, Runnable runnable) {
        return tag(charSequence, false, false, runnable);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tagLine(CharSequence charSequence, Runnable runnable) {
        lineIf(!this.suppressOpenTagLine).tag(charSequence, false, false, runnable).lineIf(!this.suppressCloseTagLine);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T attr(Attribute... attributeArr) {
        if (this.currentAttributes == null) {
            this.currentAttributes = new MutableAttributes();
        }
        for (Attribute attribute : attributeArr) {
            this.currentAttributes.addValue(attribute.getName(), attribute.getValue());
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tag(CharSequence charSequence, boolean z5) {
        if (charSequence.length() != 0 && charSequence.charAt(0) != '/') {
            MutableAttributes mutableAttributes = null;
            if (this.withAttributes) {
                MutableAttributes mutableAttributes2 = this.currentAttributes;
                this.currentAttributes = null;
                this.withAttributes = false;
                mutableAttributes = mutableAttributes2;
            }
            this.appendable.append((CharSequence) "<");
            this.appendable.append(charSequence);
            if (mutableAttributes != null && !mutableAttributes.isEmpty()) {
                for (Attribute attribute : mutableAttributes.values()) {
                    String value = attribute.getValue();
                    if (!attribute.isNonRendering()) {
                        this.appendable.append((CharSequence) SequenceUtils.SPACE);
                        this.appendable.append((CharSequence) Escaping.escapeHtml(attribute.getName(), true));
                        this.appendable.append((CharSequence) "=\"");
                        this.appendable.append((CharSequence) Escaping.escapeHtml(value, true));
                        this.appendable.append((CharSequence) "\"");
                    }
                }
            }
            if (z5) {
                this.appendable.append((CharSequence) " />");
                return this;
            }
            this.appendable.append((CharSequence) ">");
            tagOpened(charSequence);
            return this;
        }
        return closeTag(charSequence);
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T attr(Attributes attributes) {
        if (!attributes.isEmpty()) {
            MutableAttributes mutableAttributes = this.currentAttributes;
            if (mutableAttributes == null) {
                this.currentAttributes = new MutableAttributes(attributes);
                return this;
            }
            mutableAttributes.addValues(attributes);
        }
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

    @Override // com.vladsch.flexmark.util.html.HtmlAppendable
    public T tag(CharSequence charSequence, boolean z5, boolean z6, Runnable runnable) {
        boolean z7 = this.lineOnChildText;
        boolean z8 = this.indentOnFirstEol;
        this.lineOnChildText = false;
        this.indentOnFirstEol = false;
        if (z5 && !this.suppressOpenTagLine) {
            this.appendable.line();
        }
        tag(charSequence, false);
        if (z5 && !z8) {
            this.appendable.indent();
        }
        if ((this.appendable.getOptions() & LineAppendable.F_PASS_THROUGH) != 0) {
            runnable.run();
        } else {
            boolean[] zArr = {false};
            h hVar = new h(zArr, 9);
            if (z7) {
                this.appendable.setLineOnFirstText();
            }
            if (z8) {
                this.appendable.addIndentOnFirstEOL(hVar);
            }
            runnable.run();
            if (z7) {
                this.appendable.clearLineOnFirstText();
            }
            if (zArr[0]) {
                this.appendable.unIndentNoEol();
            } else {
                this.appendable.removeIndentOnFirstEOL(hVar);
            }
        }
        if (z5 && !z8) {
            this.appendable.unIndent();
        }
        if (z6 && !this.suppressCloseTagLine) {
            this.appendable.line();
        }
        closeTag(charSequence);
        if (z5 && !this.suppressCloseTagLine) {
            this.appendable.line();
        }
        return this;
    }
}
