package com.vladsch.flexmark.parser.core.delimiter;

import com.vladsch.flexmark.ast.Emphasis;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.delimiter.DelimiterProcessor;
import com.vladsch.flexmark.parser.delimiter.DelimiterRun;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public abstract class EmphasisDelimiterProcessor implements DelimiterProcessor {
    private final char delimiterChar;
    private final int multipleUse;

    public EmphasisDelimiterProcessor(char c6, boolean z5) {
        this.delimiterChar = c6;
        this.multipleUse = z5 ? 1 : 2;
    }

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
        return this.delimiterChar;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public int getDelimiterUse(DelimiterRun delimiterRun, DelimiterRun delimiterRun2) {
        if (delimiterRun.canClose() || delimiterRun2.canOpen()) {
            if ((delimiterRun2.length() + delimiterRun.length()) % 3 == 0) {
                return 0;
            }
        }
        if (delimiterRun.length() < 3 || delimiterRun2.length() < 3) {
            return Utils.min(delimiterRun2.length(), delimiterRun.length());
        }
        if (delimiterRun2.length() % 2 == 0) {
            return 2;
        }
        return this.multipleUse;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public int getMinLength() {
        return 1;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public char getOpeningCharacter() {
        return this.delimiterChar;
    }

    @Override // com.vladsch.flexmark.parser.delimiter.DelimiterProcessor
    public void process(Delimiter delimiter, Delimiter delimiter2, int i6) {
        delimiter.moveNodesBetweenDelimitersTo(i6 == 1 ? new Emphasis(delimiter.getTailChars(i6), BasedSequence.NULL, delimiter2.getLeadChars(i6)) : new StrongEmphasis(delimiter.getTailChars(i6), BasedSequence.NULL, delimiter2.getLeadChars(i6)), delimiter2);
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
