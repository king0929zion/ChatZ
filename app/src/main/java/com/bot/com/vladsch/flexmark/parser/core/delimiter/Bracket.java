package com.vladsch.flexmark.parser.core.delimiter;

import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class Bracket {
    private boolean allowed = true;
    private boolean bracketAfter = false;
    private final boolean image;
    private final int index;
    private final Text node;
    private final Bracket previous;
    private final Delimiter previousDelimiter;

    private Bracket(BasedSequence basedSequence, Text text, int i6, Bracket bracket, Delimiter delimiter, boolean z5) {
        this.node = text;
        this.index = i6;
        this.image = z5;
        this.previous = bracket;
        this.previousDelimiter = delimiter;
    }

    public static Bracket image(BasedSequence basedSequence, Text text, int i6, Bracket bracket, Delimiter delimiter) {
        return new Bracket(basedSequence, text, i6, bracket, delimiter, true);
    }

    public static Bracket link(BasedSequence basedSequence, Text text, int i6, Bracket bracket, Delimiter delimiter) {
        return new Bracket(basedSequence, text, i6, bracket, delimiter, false);
    }

    public int getEndIndex() {
        return this.image ? this.index + 2 : this.index + 1;
    }

    public Text getNode() {
        return this.node;
    }

    public Bracket getPrevious() {
        return this.previous;
    }

    public Delimiter getPreviousDelimiter() {
        return this.previousDelimiter;
    }

    public int getStartIndex() {
        return this.index;
    }

    public boolean isAllowed() {
        return this.allowed;
    }

    public boolean isBracketAfter() {
        return this.bracketAfter;
    }

    public boolean isImage() {
        return this.image;
    }

    public boolean isStraddling(BasedSequence basedSequence) {
        int startOffset = basedSequence.getStartOffset();
        int endOffset = basedSequence.getEndOffset();
        Delimiter delimiter = this.previousDelimiter;
        for (Delimiter next = delimiter == null ? null : delimiter.getNext(); next != null; next = next.getNext()) {
            int endIndex = next.getEndIndex();
            if (endIndex >= endOffset) {
                return false;
            }
            if (endIndex >= startOffset && !next.isMatched()) {
                return true;
            }
        }
        return false;
    }

    public void setAllowed(boolean z5) {
        this.allowed = z5;
    }

    public void setBracketAfter(boolean z5) {
        this.bracketAfter = z5;
    }
}
