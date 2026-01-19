package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.format.MarkdownWriterBase;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendableImpl;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public class HtmlMarkdownWriter extends MarkdownWriterBase<HtmlMarkdownWriter, Node, HtmlNodeConverterContext> {
    public HtmlMarkdownWriter() {
        this(null, 0);
    }

    @Override // com.vladsch.flexmark.util.format.MarkdownWriterBase
    public BasedSequence lastBlockQuoteChildPrefix(BasedSequence basedSequence) {
        int lastIndexOf;
        Node currentNode = ((HtmlNodeConverterContext) this.context).getCurrentNode();
        if (currentNode instanceof Element) {
            Element element = (Element) currentNode;
            while (element.nextElementSibling() == null && (element = element.parent()) != null) {
                if (element.nodeName().toLowerCase().equals(FlexmarkHtmlConverter.BLOCKQUOTE_NODE) && (lastIndexOf = basedSequence.lastIndexOf(BlockQuoteParser.MARKER_CHAR)) >= 0) {
                    basedSequence = basedSequence.getBuilder().append((CharSequence) basedSequence.subSequence(0, lastIndexOf)).append(SequenceUtils.SPC).append((CharSequence) basedSequence.subSequence(lastIndexOf + 1)).toSequence();
                }
            }
        }
        return basedSequence;
    }

    public HtmlMarkdownWriter(int i6) {
        this(null, i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.LineAppendable
    public HtmlMarkdownWriter getEmptyAppendable() {
        LineAppendableImpl lineAppendableImpl = this.appendable;
        return new HtmlMarkdownWriter(lineAppendableImpl, lineAppendableImpl.getOptions());
    }

    public HtmlMarkdownWriter(Appendable appendable, int i6) {
        super(appendable, i6);
    }
}
