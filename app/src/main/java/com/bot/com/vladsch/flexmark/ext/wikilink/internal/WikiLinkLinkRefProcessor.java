package com.vladsch.flexmark.ext.wikilink.internal;

import com.vladsch.flexmark.ext.wikilink.WikiImage;
import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.ext.wikilink.WikiLinkExtension;
import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.parser.LinkRefProcessor;
import com.vladsch.flexmark.parser.LinkRefProcessorFactory;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.TextCollectingVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class WikiLinkLinkRefProcessor implements LinkRefProcessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BRACKET_NESTING_LEVEL = 1;
    private final WikiLinkOptions options;

    /* loaded from: classes.dex */
    public static class Factory implements LinkRefProcessorFactory {
        @Override // com.vladsch.flexmark.parser.LinkRefProcessorFactory
        public int getBracketNestingLevel(DataHolder dataHolder) {
            return 1;
        }

        @Override // com.vladsch.flexmark.parser.LinkRefProcessorFactory
        public boolean getWantExclamationPrefix(DataHolder dataHolder) {
            return WikiLinkExtension.IMAGE_LINKS.get(dataHolder).booleanValue();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.parser.LinkRefProcessorFactory, java.util.function.Function
        public LinkRefProcessor apply(Document document) {
            return new WikiLinkLinkRefProcessor(document);
        }
    }

    public WikiLinkLinkRefProcessor(Document document) {
        this.options = new WikiLinkOptions(document);
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public BasedSequence adjustInlineText(Document document, Node node) {
        WikiNode wikiNode = (WikiNode) node;
        return wikiNode.getText().ifNull(wikiNode.getLink());
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public boolean allowDelimiters(BasedSequence basedSequence, Document document, Node node) {
        WikiNode wikiNode = (WikiNode) node;
        return (node instanceof WikiLink) && WikiLinkExtension.ALLOW_INLINES.get(document).booleanValue() && wikiNode.getText().ifNull(wikiNode.getLink()).containsAllOf(basedSequence);
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public Node createNode(BasedSequence basedSequence) {
        if (basedSequence.firstChar() == '!') {
            WikiLinkOptions wikiLinkOptions = this.options;
            return new WikiImage(basedSequence, wikiLinkOptions.linkFirstSyntax, wikiLinkOptions.allowPipeEscape);
        }
        WikiLinkOptions wikiLinkOptions2 = this.options;
        return new WikiLink(basedSequence, wikiLinkOptions2.linkFirstSyntax, wikiLinkOptions2.allowAnchors, wikiLinkOptions2.allowPipeEscape, wikiLinkOptions2.allowAnchorEscape);
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public int getBracketNestingLevel() {
        return 1;
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public boolean getWantExclamationPrefix() {
        return this.options.imageLinks;
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public boolean isMatch(BasedSequence basedSequence) {
        int length = basedSequence.length();
        if (this.options.imageLinks) {
            return (length < 5 || basedSequence.charAt(0) != '!') ? length >= 4 && basedSequence.charAt(0) == '[' && basedSequence.charAt(1) == '[' && basedSequence.endCharAt(1) == ']' && basedSequence.endCharAt(2) == ']' : basedSequence.charAt(1) == '[' && basedSequence.charAt(2) == '[' && basedSequence.endCharAt(1) == ']' && basedSequence.endCharAt(2) == ']';
        }
        if (length >= 4 && basedSequence.charAt(0) == '[' && basedSequence.charAt(1) == '[' && basedSequence.endCharAt(1) == ']' && basedSequence.endCharAt(2) == ']') {
            return true;
        }
        return false;
    }

    @Override // com.vladsch.flexmark.parser.LinkRefProcessor
    public void updateNodeElements(Document document, Node node) {
        WikiNode wikiNode = (WikiNode) node;
        if ((node instanceof WikiLink) && WikiLinkExtension.ALLOW_INLINES.get(document).booleanValue() && wikiNode.getText().isNull()) {
            wikiNode.setLink(new TextCollectingVisitor().collectAndGetSequence(node, TextContainer.F_NODE_TEXT), WikiLinkExtension.ALLOW_ANCHORS.get(document).booleanValue(), WikiLinkExtension.ALLOW_ANCHOR_ESCAPE.get(document).booleanValue());
        }
    }
}
