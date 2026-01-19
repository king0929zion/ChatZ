package com.vladsch.flexmark.jira.converter.internal;

import com.vladsch.flexmark.ast.AutoLink;
import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.BulletListItem;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.Emphasis;
import com.vladsch.flexmark.ast.FencedCodeBlock;
import com.vladsch.flexmark.ast.HardLineBreak;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.HtmlBlock;
import com.vladsch.flexmark.ast.HtmlBlockBase;
import com.vladsch.flexmark.ast.HtmlCommentBlock;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.ast.HtmlInline;
import com.vladsch.flexmark.ast.HtmlInlineBase;
import com.vladsch.flexmark.ast.HtmlInlineComment;
import com.vladsch.flexmark.ast.HtmlInnerBlock;
import com.vladsch.flexmark.ast.HtmlInnerBlockComment;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.ImageRef;
import com.vladsch.flexmark.ast.IndentedCodeBlock;
import com.vladsch.flexmark.ast.Link;
import com.vladsch.flexmark.ast.LinkRef;
import com.vladsch.flexmark.ast.ListBlock;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.MailLink;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.OrderedListItem;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.ast.ParagraphItemContainer;
import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.TextBase;
import com.vladsch.flexmark.ast.ThematicBreak;
import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class JiraConverterNodeRenderer implements NodeRenderer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int inBlockQuote = 0;
    private final ListOptions listOptions;
    private final boolean recheckUndefinedReferences;
    private final ReferenceRepository referenceRepository;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new JiraConverterNodeRenderer(dataHolder);
        }
    }

    public JiraConverterNodeRenderer(DataHolder dataHolder) {
        this.referenceRepository = Parser.REFERENCES.get(dataHolder);
        this.recheckUndefinedReferences = HtmlRenderer.RECHECK_UNDEFINED_REFERENCES.get(dataHolder).booleanValue();
        this.listOptions = ListOptions.get(dataHolder);
    }

    public static BasedSequence getSoftLineBreakSpan(Node node) {
        if (node == null) {
            return BasedSequence.NULL;
        }
        Node node2 = node;
        for (Node next = node.getNext(); next != null && !(next instanceof SoftLineBreak); next = next.getNext()) {
            node2 = next;
        }
        return Node.spanningChars(node.getChars(), node2.getChars());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Reference reference, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
    }

    private void renderList(ListBlock listBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        nodeRendererContext.renderChildren(listBlock);
        if (listBlock.getParent() instanceof Document) {
            if (listBlock.getLastChild() == null || this.listOptions.isTightListItem((ListItem) listBlock.getLastChild())) {
                htmlWriter.blankLine();
            }
        }
    }

    private void renderListItem(ListItem listItem, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderListItemPrefix(listItem, nodeRendererContext, htmlWriter);
        if (this.listOptions.isTightListItem(listItem)) {
            nodeRendererContext.renderChildren(listItem);
            return;
        }
        nodeRendererContext.renderChildren(listItem);
        if (listItem.getFirstChild().getNext() != null) {
            htmlWriter.blankLine();
        }
    }

    private void renderListItemPrefix(ListItem listItem, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        StringBuilder sb = new StringBuilder();
        ListItem listItem2 = listItem;
        while (true) {
            if (!(listItem2 instanceof ListBlock) && !(listItem2 instanceof ListItem)) {
                break;
            }
            if (listItem2 instanceof BulletList) {
                sb.insert(0, '*');
            } else if (listItem2 instanceof OrderedList) {
                sb.insert(0, '#');
            }
            listItem2 = listItem2.getParent();
        }
        if (sb.length() > 0) {
            sb.append(SequenceUtils.SPC);
        }
        htmlWriter.line().raw((CharSequence) sb.toString());
    }

    private void renderLooseParagraph(Paragraph paragraph, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderTextBlockParagraphLines(paragraph, nodeRendererContext, htmlWriter);
        if (this.inBlockQuote <= 0 || paragraph.getNext() != null) {
            htmlWriter.blankLine();
        } else {
            htmlWriter.line();
        }
    }

    private static void renderTextBlockParagraphLines(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        nodeRendererContext.renderChildren(node);
        htmlWriter.line();
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        final int i6 = 0;
        final int i7 = 2;
        final int i8 = 14;
        final int i9 = 17;
        final int i10 = 18;
        final int i11 = 19;
        final int i12 = 20;
        final int i13 = 21;
        final int i14 = 23;
        final int i15 = 24;
        final int i16 = 11;
        final int i17 = 22;
        final int i18 = 25;
        final int i19 = 26;
        final int i20 = 27;
        final int i21 = 28;
        final int i22 = 29;
        final int i23 = 0;
        final int i24 = 1;
        final int i25 = 1;
        final int i26 = 3;
        final int i27 = 4;
        final int i28 = 5;
        final int i29 = 6;
        final int i30 = 7;
        final int i31 = 8;
        final int i32 = 9;
        final int i33 = 10;
        final int i34 = 12;
        final int i35 = 13;
        final int i36 = 15;
        final int i37 = 16;
        return new HashSet(Arrays.asList(new NodeRenderingHandler(AutoLink.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i6) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(BlockQuote.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i7) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(BulletList.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i8) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(BulletListItem.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i9) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Code.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i10) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Document.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i11) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Emphasis.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i12) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(FencedCodeBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i13) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HardLineBreak.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i14) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Heading.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i15) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i16) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlCommentBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i17) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlEntity.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i18) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInline.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i19) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInlineComment.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i20) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInnerBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i21) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInnerBlockComment.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i22) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Image.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11341b;

            {
                this.f11341b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i23) {
                    case 0:
                        this.f11341b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11341b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(ImageRef.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11341b;

            {
                this.f11341b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i24) {
                    case 0:
                        this.f11341b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11341b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(IndentedCodeBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i25) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Link.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i26) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(LinkRef.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i27) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(MailLink.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i28) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(OrderedList.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i29) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(OrderedListItem.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i30) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Paragraph.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i31) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Reference.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i32) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(SoftLineBreak.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i33) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(StrongEmphasis.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i34) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Text.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i35) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TextBase.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i36) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(ThematicBreak.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.jira.converter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JiraConverterNodeRenderer f11340b;

            {
                this.f11340b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i37) {
                    case 0:
                        this.f11340b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11340b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11340b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11340b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11340b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11340b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11340b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11340b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11340b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11340b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11340b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11340b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11340b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11340b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11340b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11340b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11340b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11340b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11340b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11340b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11340b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11340b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11340b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11340b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11340b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11340b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11340b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11340b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11340b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11340b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        })));
    }

    public void renderHtmlBlock(HtmlBlockBase htmlBlockBase, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter, boolean z5, boolean z6) {
        if (z5) {
            return;
        }
        htmlWriter.line().raw((CharSequence) "{code:html}").line();
        htmlWriter.raw((CharSequence) htmlBlockBase.getContentChars().normalizeEOL());
        htmlWriter.line().raw((CharSequence) "{code:html}").line();
    }

    public void renderInlineHtml(HtmlInlineBase htmlInlineBase, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter, boolean z5, boolean z6) {
        if (z5) {
            return;
        }
        htmlWriter.raw("{{").raw((CharSequence) htmlInlineBase.getChars().normalizeEOL()).raw((CharSequence) "}}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Document document, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        nodeRendererContext.renderChildren(document);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Heading heading, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line().raw((CharSequence) ("h" + heading.getLevel() + ". "));
        nodeRendererContext.renderChildren(heading);
        htmlWriter.blankLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(BlockQuote blockQuote, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line().raw((CharSequence) "{quote}").line();
        htmlWriter.pushPrefix();
        this.inBlockQuote++;
        nodeRendererContext.renderChildren(blockQuote);
        this.inBlockQuote--;
        htmlWriter.popPrefix();
        htmlWriter.line().raw((CharSequence) "{quote}").blankLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(FencedCodeBlock fencedCodeBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        BasedSequence info = fencedCodeBlock.getInfo();
        if (info.isNotNull() && !info.isBlank()) {
            htmlWriter.line().raw((CharSequence) ("{code:lang=" + info.unescape() + "}")).line();
        } else {
            htmlWriter.line().raw((CharSequence) "{code}").line();
        }
        htmlWriter.raw((CharSequence) fencedCodeBlock.getContentChars().normalizeEOL());
        htmlWriter.line().raw((CharSequence) "{code}").blankLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(ThematicBreak thematicBreak, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line().raw((CharSequence) "----").blankLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(IndentedCodeBlock indentedCodeBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line().raw((CharSequence) "{noformat}").line();
        htmlWriter.raw((CharSequence) indentedCodeBlock.getContentChars().trimTailBlankLines().normalizeEndWithEOL());
        htmlWriter.line().raw((CharSequence) "{noformat}").line();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(BulletList bulletList, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderList(bulletList, nodeRendererContext, htmlWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(OrderedList orderedList, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderList(orderedList, nodeRendererContext, htmlWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(BulletListItem bulletListItem, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderListItem(bulletListItem, nodeRendererContext, htmlWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(OrderedListItem orderedListItem, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderListItem(orderedListItem, nodeRendererContext, htmlWriter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Paragraph paragraph, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if ((paragraph.getParent() instanceof ParagraphItemContainer) && ((ParagraphItemContainer) paragraph.getParent()).isParagraphWrappingDisabled(paragraph, this.listOptions, nodeRendererContext.getOptions())) {
            renderTextBlockParagraphLines(paragraph, nodeRendererContext, htmlWriter);
        } else {
            renderLooseParagraph(paragraph, nodeRendererContext, htmlWriter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(SoftLineBreak softLineBreak, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw(SequenceUtils.SPACE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HardLineBreak hardLineBreak, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Emphasis emphasis, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("_");
        nodeRendererContext.renderChildren(emphasis);
        htmlWriter.raw("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(StrongEmphasis strongEmphasis, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("*");
        nodeRendererContext.renderChildren(strongEmphasis);
        htmlWriter.raw("*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Text text, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw((CharSequence) Escaping.normalizeEOL(text.getChars().unescape()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(TextBase textBase, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        nodeRendererContext.renderChildren(textBase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Code code, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("{{");
        htmlWriter.raw((CharSequence) Escaping.collapseWhitespace((CharSequence) code.getText(), true));
        htmlWriter.raw("}}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlBlock htmlBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (htmlBlock.hasChildren()) {
            nodeRendererContext.renderChildren(htmlBlock);
        } else {
            renderHtmlBlock(htmlBlock, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlBlocks);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlCommentBlock htmlCommentBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderHtmlBlock(htmlCommentBlock, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlCommentBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlCommentBlocks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlInnerBlock htmlInnerBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderHtmlBlock(htmlInnerBlock, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlBlocks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlInnerBlockComment htmlInnerBlockComment, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderHtmlBlock(htmlInnerBlockComment, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlCommentBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlCommentBlocks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlInline htmlInline, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderInlineHtml(htmlInline, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressInlineHtml, nodeRendererContext.getHtmlOptions().escapeInlineHtml);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlInlineComment htmlInlineComment, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderInlineHtml(htmlInlineComment, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressInlineHtmlComments, nodeRendererContext.getHtmlOptions().escapeInlineHtmlComments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(HtmlEntity htmlEntity, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw((CharSequence) htmlEntity.getChars().unescape());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(AutoLink autoLink, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        BasedSequence text = autoLink.getText();
        if (nodeRendererContext.isDoNotRenderLinks()) {
            htmlWriter.text((CharSequence) text);
        } else {
            htmlWriter.raw("[").raw((CharSequence) text).raw((CharSequence) "|").raw((CharSequence) nodeRendererContext.resolveLink(LinkType.LINK, text, null).getUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(MailLink mailLink, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String unescape = mailLink.getText().unescape();
        if (nodeRendererContext.isDoNotRenderLinks()) {
            htmlWriter.text((CharSequence) unescape);
        } else {
            htmlWriter.raw("[").raw((CharSequence) unescape).raw((CharSequence) "|mailto:").raw((CharSequence) nodeRendererContext.resolveLink(LinkType.LINK, unescape, null).getUrl()).raw((CharSequence) "]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Image image, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (nodeRendererContext.isDoNotRenderLinks()) {
            return;
        }
        htmlWriter.raw("!").raw((CharSequence) nodeRendererContext.resolveLink(LinkType.IMAGE, image.getUrl().unescape(), null).getUrl()).raw((CharSequence) "!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Link link, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (nodeRendererContext.isDoNotRenderLinks()) {
            nodeRendererContext.renderChildren(link);
            return;
        }
        ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.LINK, link.getUrl().unescape(), null);
        htmlWriter.raw("[");
        nodeRendererContext.renderChildren(link);
        htmlWriter.raw("|").raw((CharSequence) resolveLink.getUrl());
        if (link.getTitle() != null && !link.getTitle().isEmpty()) {
            htmlWriter.raw("|").raw((CharSequence) link.getTitle());
        }
        htmlWriter.raw("]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(ImageRef imageRef, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (!imageRef.isDefined() && this.recheckUndefinedReferences && imageRef.getReferenceNode(this.referenceRepository) != null) {
            imageRef.setDefined(true);
        }
        if (!imageRef.isDefined()) {
            htmlWriter.text((CharSequence) imageRef.getChars().unescape());
        } else {
            if (nodeRendererContext.isDoNotRenderLinks()) {
                return;
            }
            htmlWriter.raw("!").raw((CharSequence) nodeRendererContext.resolveLink(LinkType.IMAGE, imageRef.getReferenceNode(this.referenceRepository).getUrl().unescape(), null).getUrl()).raw((CharSequence) "!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(LinkRef linkRef, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (!linkRef.isDefined() && this.recheckUndefinedReferences && linkRef.getReferenceNode(this.referenceRepository) != null) {
            linkRef.setDefined(true);
        }
        if (!linkRef.isDefined()) {
            htmlWriter.raw("[");
            nodeRendererContext.renderChildren(linkRef);
            htmlWriter.raw("]");
            if (linkRef.isReferenceTextCombined()) {
                return;
            }
            htmlWriter.raw("[");
            htmlWriter.raw((CharSequence) linkRef.getReference().unescape());
            htmlWriter.raw("]");
            return;
        }
        if (nodeRendererContext.isDoNotRenderLinks()) {
            nodeRendererContext.renderChildren(linkRef);
            return;
        }
        ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.LINK, linkRef.getReferenceNode(this.referenceRepository).getUrl().unescape(), null);
        htmlWriter.raw("[");
        nodeRendererContext.renderChildren(linkRef);
        htmlWriter.raw("|");
        htmlWriter.raw((CharSequence) resolveLink.getUrl());
        htmlWriter.raw("]");
    }
}
