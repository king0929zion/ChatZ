package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.BlankLine;
import com.vladsch.flexmark.util.ast.BlockQuoteLike;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.format.MarkdownWriterBase;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendableImpl;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class MarkdownWriter extends MarkdownWriterBase<MarkdownWriter, Node, NodeFormatterContext> {
    public MarkdownWriter() {
        this(null, 0);
    }

    public MarkdownWriter appendNonTranslating(CharSequence charSequence) {
        return appendNonTranslating(null, charSequence, null, null);
    }

    public MarkdownWriter appendTranslating(CharSequence charSequence) {
        return appendTranslating(null, charSequence, null, null);
    }

    @Override // com.vladsch.flexmark.util.format.MarkdownWriterBase
    public BasedSequence lastBlockQuoteChildPrefix(BasedSequence basedSequence) {
        int lastIndexOfAny;
        Node currentNode = ((NodeFormatterContext) this.context).getCurrentNode();
        while (currentNode != null && currentNode.getNextAnyNot(BlankLine.class) == null) {
            currentNode = currentNode.getParent();
            if (currentNode == null || (currentNode instanceof Document)) {
                break;
            }
            if ((currentNode instanceof BlockQuoteLike) && (lastIndexOfAny = basedSequence.lastIndexOfAny(((NodeFormatterContext) this.context).getBlockQuoteLikePrefixPredicate())) >= 0) {
                basedSequence = basedSequence.getBuilder().append((CharSequence) basedSequence.subSequence(0, lastIndexOfAny)).append(SequenceUtils.SPC).append((CharSequence) basedSequence.subSequence(lastIndexOfAny + 1)).toSequence();
            }
        }
        return basedSequence;
    }

    public MarkdownWriter(int i6) {
        this(null, i6);
    }

    public MarkdownWriter appendNonTranslating(CharSequence charSequence, CharSequence charSequence2) {
        return appendNonTranslating(charSequence, charSequence2, null, null);
    }

    public MarkdownWriter appendTranslating(CharSequence charSequence, CharSequence charSequence2) {
        return appendTranslating(charSequence, charSequence2, null, null);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public MarkdownWriter getEmptyAppendable() {
        LineAppendableImpl lineAppendableImpl = this.appendable;
        return new MarkdownWriter(lineAppendableImpl, lineAppendableImpl.getOptions());
    }

    public MarkdownWriter(Appendable appendable, int i6) {
        super(appendable, i6);
    }

    public MarkdownWriter appendNonTranslating(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return appendNonTranslating(charSequence, charSequence2, charSequence3, null);
    }

    public MarkdownWriter appendTranslating(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return appendTranslating(charSequence, charSequence2, charSequence3, null);
    }

    public MarkdownWriter appendNonTranslating(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        if (((NodeFormatterContext) this.context).isTransformingText()) {
            append(((NodeFormatterContext) this.context).transformNonTranslating(charSequence, charSequence2, charSequence3, charSequence4));
            return this;
        }
        append(charSequence2);
        return this;
    }

    public MarkdownWriter appendTranslating(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        if (((NodeFormatterContext) this.context).isTransformingText()) {
            append(((NodeFormatterContext) this.context).transformTranslating(charSequence, charSequence2, charSequence3, charSequence4));
            return this;
        }
        if (charSequence != null) {
            append(charSequence);
        }
        append(charSequence2);
        if (charSequence3 != null) {
            append(charSequence3);
        }
        if (charSequence4 != null) {
            append(charSequence4);
        }
        return this;
    }
}
