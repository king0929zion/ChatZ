package com.vladsch.flexmark.ext.gfm.strikethrough.internal;

import com.vladsch.flexmark.ext.gfm.strikethrough.Strikethrough;
import com.vladsch.flexmark.ext.gfm.strikethrough.Subscript;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.core.delimiter.Delimiter;
import com.vladsch.flexmark.parser.delimiter.DelimiterProcessor;
import com.vladsch.flexmark.parser.delimiter.DelimiterRun;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class StrikethroughSubscriptDelimiterProcessor implements DelimiterProcessor {
    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public boolean canBeCloser(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return z6;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public boolean canBeOpener(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return z5;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public char getClosingCharacter() {
        return '~';
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public int getDelimiterUse(DelimiterRun delimiterRun, DelimiterRun delimiterRun2) {
        if (delimiterRun.canClose() || delimiterRun2.canOpen()) {
            if ((delimiterRun2.length() + delimiterRun.length()) % 3 == 0) {
                return 0;
            }
        }
        return (delimiterRun.length() < 3 || delimiterRun2.length() < 3) ? delimiterRun2.length() <= delimiterRun.length() ? delimiterRun2.length() : delimiterRun.length() : delimiterRun2.length() % 2 == 0 ? 2 : 1;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public int getMinLength() {
        return 1;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public char getOpeningCharacter() {
        return '~';
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public void process(Delimiter delimiter, Delimiter delimiter2, int i6) {
        delimiter.moveNodesBetweenDelimitersTo(i6 == 1 ? new Subscript(delimiter.getTailChars(i6), BasedSequence.NULL, delimiter2.getLeadChars(i6)) : new Strikethrough(delimiter.getTailChars(i6), BasedSequence.NULL, delimiter2.getLeadChars(i6)), delimiter2);
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public boolean skipNonOpenerCloser() {
        return false;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public Node unmatchedDelimiterNode(InlineParser inlineParser, DelimiterRun delimiterRun) {
        return null;
    }
}
