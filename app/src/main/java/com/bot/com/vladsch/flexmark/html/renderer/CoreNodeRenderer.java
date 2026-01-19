package com.vladsch.flexmark.html.renderer;

import B3.e;
import I.g;
import N1.y;
import com.vladsch.flexmark.ast.AutoLink;
import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.BulletListItem;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.CodeBlock;
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
import com.vladsch.flexmark.ast.util.LineCollectingVisitor;
import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.formatter.j;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.html.HtmlRendererOptions;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NonRenderingInline;
import com.vladsch.flexmark.util.ast.TextCollectingVisitor;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class CoreNodeRenderer implements NodeRenderer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean codeContentBlock;
    private final boolean codeSoftLineBreaks;
    private final ListOptions listOptions;
    private final boolean obfuscateEmail;
    private final boolean obfuscateEmailRandom;
    private final boolean recheckUndefinedReferences;
    private final ReferenceRepository referenceRepository;
    public static final AttributablePart LOOSE_LIST_ITEM = new AttributablePart("LOOSE_LIST_ITEM");
    public static final AttributablePart TIGHT_LIST_ITEM = new AttributablePart("TIGHT_LIST_ITEM");
    public static final AttributablePart PARAGRAPH_LINE = new AttributablePart("PARAGRAPH_LINE");
    public static final AttributablePart CODE_CONTENT = new AttributablePart("FENCED_CODE_CONTENT");
    private List<Range> myLines = null;
    private List<Integer> myEOLs = null;
    private int myNextLine = 0;
    private int nextLineStartOffset = 0;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new CoreNodeRenderer(dataHolder);
        }
    }

    public CoreNodeRenderer(DataHolder dataHolder) {
        this.referenceRepository = Parser.REFERENCES.get(dataHolder);
        this.recheckUndefinedReferences = HtmlRenderer.RECHECK_UNDEFINED_REFERENCES.get(dataHolder).booleanValue();
        this.listOptions = ListOptions.get(dataHolder);
        this.obfuscateEmail = HtmlRenderer.OBFUSCATE_EMAIL.get(dataHolder).booleanValue();
        this.obfuscateEmailRandom = HtmlRenderer.OBFUSCATE_EMAIL_RANDOM.get(dataHolder).booleanValue();
        this.codeContentBlock = Parser.FENCED_CODE_CONTENT_BLOCK.get(dataHolder).booleanValue();
        this.codeSoftLineBreaks = Parser.CODE_SOFT_LINE_BREAKS.get(dataHolder).booleanValue();
    }

    public static boolean isSuppressedLinkPrefix(CharSequence charSequence, NodeRendererContext nodeRendererContext) {
        Pattern pattern = nodeRendererContext.getHtmlOptions().suppressedLinks;
        if (pattern != null) {
            return pattern.matcher(charSequence).matches();
        }
        return false;
    }

    public static /* synthetic */ void lambda$render$0(HtmlWriter htmlWriter, Heading heading, NodeRendererContext nodeRendererContext) {
        htmlWriter.srcPos(heading.getText()).withAttr().tag(FlexmarkHtmlConverter.SPAN_NODE);
        nodeRendererContext.renderChildren(heading);
        htmlWriter.tag("/span");
    }

    public static /* synthetic */ void lambda$renderListItem$5(HtmlWriter htmlWriter, ListItem listItem, NodeRendererContext nodeRendererContext) {
        htmlWriter.text((CharSequence) listItem.getMarkerSuffix().unescape());
        nodeRendererContext.renderChildren(listItem);
    }

    public static /* synthetic */ void lambda$renderListItem$6(HtmlWriter htmlWriter, ListItem listItem, NodeRendererContext nodeRendererContext) {
        htmlWriter.text((CharSequence) listItem.getMarkerSuffix().unescape());
        nodeRendererContext.renderChildren(listItem);
    }

    public /* synthetic */ void lambda$renderLooseParagraph$8(Paragraph paragraph, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderTextBlockParagraphLines(paragraph, nodeRendererContext, htmlWriter, false);
    }

    private void outputNextLineBreakSpan(Node node, HtmlWriter htmlWriter, boolean z5) {
        Range range = this.myLines.get(this.myNextLine);
        int intValue = this.myEOLs.get(this.myNextLine).intValue();
        this.myNextLine++;
        BasedSequence baseSubSequence = node.baseSubSequence(this.nextLineStartOffset, range.getEnd() - intValue);
        CharPredicate charPredicate = CharPredicate.SPACE_TAB;
        int countTrailing = baseSubSequence.countTrailing(charPredicate);
        if (!z5 && countTrailing > 0) {
            countTrailing--;
        }
        htmlWriter.srcPos(this.nextLineStartOffset, range.getEnd() - (intValue + countTrailing)).withAttr(PARAGRAPH_LINE).tag(FlexmarkHtmlConverter.SPAN_NODE);
        int end = range.getEnd();
        this.nextLineStartOffset = end;
        this.nextLineStartOffset = node.baseSubSequence(end, node.getChars().getBaseSequence().length()).countLeading(charPredicate) + end;
    }

    private void outputSourceLineSpan(Node node, Node node2, Node node3, HtmlWriter htmlWriter) {
        int startOffset = node2.getStartOffset();
        Range range = this.myLines.get(this.myNextLine);
        int intValue = this.myEOLs.get(this.myNextLine).intValue();
        int endOffset = node3.getEndOffset();
        if (range.getEnd() <= endOffset) {
            int end = range.getEnd() - intValue;
            BasedSequence baseSubSequence = node.baseSubSequence(startOffset, end);
            CharPredicate charPredicate = CharPredicate.SPACE_TAB;
            endOffset = end - baseSubSequence.countTrailing(charPredicate);
            this.myNextLine++;
            int end2 = range.getEnd();
            this.nextLineStartOffset = end2;
            this.nextLineStartOffset = node.baseSubSequence(end2, node.getEndOffset()).countLeading(charPredicate) + end2;
        }
        if (range.getStart() > startOffset) {
            startOffset = range.getStart();
        }
        htmlWriter.srcPos(startOffset, endOffset).withAttr(PARAGRAPH_LINE).tag(FlexmarkHtmlConverter.SPAN_NODE);
    }

    private void renderChildrenSourceLineWrapped(Node node, BasedSequence basedSequence, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (!nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines || basedSequence.indexOfAny(CharPredicate.ANY_EOL) < 0) {
            nodeRendererContext.renderChildren(node);
            return;
        }
        int i6 = this.myNextLine;
        if (i6 > 0) {
            this.myNextLine = i6 - 1;
        }
        outputSourceLineSpan(node, node, node, htmlWriter);
        nodeRendererContext.renderChildren(node);
        htmlWriter.tag("/span");
    }

    public static void renderHtmlBlock(HtmlBlockBase htmlBlockBase, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter, boolean z5, boolean z6, boolean z7) {
        if (z5) {
            return;
        }
        boolean z8 = htmlBlockBase instanceof HtmlBlock;
        if (z8) {
            htmlWriter.line();
        }
        String normalizeEOL = (z8 ? htmlBlockBase.getContentChars() : htmlBlockBase.getChars()).normalizeEOL();
        if (z7) {
            normalizeEOL = normalizeEOL.trim();
        }
        if (!z6) {
            htmlWriter.rawPre((CharSequence) normalizeEOL);
        } else if (z8) {
            if (normalizeEOL.length() > 0 && normalizeEOL.charAt(normalizeEOL.length() - 1) == '\n') {
                normalizeEOL = normalizeEOL.substring(0, normalizeEOL.length() - 1);
            }
            htmlWriter.raw("<p>").text((CharSequence) normalizeEOL).raw((CharSequence) "</p>");
        } else {
            htmlWriter.text((CharSequence) normalizeEOL);
        }
        if (z8) {
            htmlWriter.lineIf(nodeRendererContext.getHtmlOptions().htmlBlockCloseTagEol);
        }
    }

    public static void renderInlineHtml(HtmlInlineBase htmlInlineBase, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter, boolean z5, boolean z6) {
        if (z5) {
            return;
        }
        if (z6) {
            htmlWriter.text((CharSequence) htmlInlineBase.getChars().normalizeEOL());
        } else {
            htmlWriter.rawPre((CharSequence) htmlInlineBase.getChars().normalizeEOL());
        }
    }

    private boolean renderLineBreak(String str, String str2, Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        List<Range> list = this.myLines;
        if (list == null || this.myNextLine >= list.size()) {
            return false;
        }
        List<String> openTagsAfterLast = htmlWriter.getOpenTagsAfterLast(FlexmarkHtmlConverter.SPAN_NODE);
        int size = openTagsAfterLast.size();
        boolean z5 = size == 0 || str2 == null || !str2.equalsIgnoreCase(openTagsAfterLast.get(size + (-1)));
        if (!z5 && !htmlWriter.isPendingSpace()) {
            htmlWriter.raw(SequenceUtils.SPACE);
        }
        while (true) {
            int i6 = size - 1;
            if (size <= 0) {
                break;
            }
            htmlWriter.closeTag((CharSequence) openTagsAfterLast.get(i6));
            size = i6;
        }
        htmlWriter.tag("/span");
        if (z5) {
            htmlWriter.raw((CharSequence) str);
        }
        outputNextLineBreakSpan(node, htmlWriter, z5);
        for (String str3 : openTagsAfterLast) {
            if (z5 || nodeRendererContext.getHtmlOptions().inlineCodeSpliceClass == null || nodeRendererContext.getHtmlOptions().inlineCodeSpliceClass.isEmpty()) {
                htmlWriter.tag((CharSequence) str3);
            } else {
                htmlWriter.attr(Attribute.CLASS_ATTR, (CharSequence) nodeRendererContext.getHtmlOptions().inlineCodeSpliceClass).withAttr().tag((CharSequence) str3);
            }
        }
        return true;
    }

    private void renderListItem(final ListItem listItem, final NodeRendererContext nodeRendererContext, final HtmlWriter htmlWriter) {
        if (this.listOptions.isTightListItem(listItem)) {
            final int i6 = 0;
            htmlWriter.srcPosWithEOL(listItem.getChars()).withAttr(TIGHT_LIST_ITEM).withCondIndent().tagLine((CharSequence) FlexmarkHtmlConverter.LI_NODE, new Runnable() { // from class: com.vladsch.flexmark.html.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            CoreNodeRenderer.lambda$renderListItem$5(htmlWriter, listItem, nodeRendererContext);
                            return;
                        default:
                            CoreNodeRenderer.lambda$renderListItem$6(htmlWriter, listItem, nodeRendererContext);
                            return;
                    }
                }
            });
        } else {
            final int i7 = 1;
            htmlWriter.srcPosWithEOL(listItem.getChars()).withAttr(LOOSE_LIST_ITEM).withCondIndent().tagLine((CharSequence) FlexmarkHtmlConverter.LI_NODE, new Runnable() { // from class: com.vladsch.flexmark.html.renderer.b
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            CoreNodeRenderer.lambda$renderListItem$5(htmlWriter, listItem, nodeRendererContext);
                            return;
                        default:
                            CoreNodeRenderer.lambda$renderListItem$6(htmlWriter, listItem, nodeRendererContext);
                            return;
                    }
                }
            });
        }
    }

    private void renderLooseParagraph(Paragraph paragraph, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (!nodeRendererContext.getHtmlOptions().noPTagsUseBr) {
            htmlWriter.srcPosWithEOL(paragraph.getChars()).withAttr().tagLine(FlexmarkHtmlConverter.P_NODE, (Runnable) new j(this, paragraph, nodeRendererContext, htmlWriter, 2));
        } else {
            renderTextBlockParagraphLines(paragraph, nodeRendererContext, htmlWriter, false);
            htmlWriter.tagVoid(FlexmarkHtmlConverter.BR_NODE).tagVoid((CharSequence) FlexmarkHtmlConverter.BR_NODE).line();
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        final int i6 = 29;
        final int i7 = 7;
        final int i8 = 18;
        final int i9 = 22;
        final int i10 = 23;
        final int i11 = 24;
        final int i12 = 25;
        final int i13 = 26;
        final int i14 = 27;
        final int i15 = 28;
        final int i16 = 0;
        final int i17 = 1;
        final int i18 = 2;
        final int i19 = 0;
        final int i20 = 1;
        final int i21 = 2;
        final int i22 = 3;
        final int i23 = 4;
        final int i24 = 5;
        final int i25 = 6;
        final int i26 = 8;
        final int i27 = 9;
        final int i28 = 10;
        final int i29 = 11;
        final int i30 = 12;
        final int i31 = 13;
        final int i32 = 14;
        final int i33 = 15;
        final int i34 = 16;
        final int i35 = 17;
        final int i36 = 19;
        final int i37 = 20;
        final int i38 = 21;
        return new HashSet(Arrays.asList(new NodeRenderingHandler(AutoLink.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i6) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(BlockQuote.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i7) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(BulletList.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i8) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Code.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i9) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(CodeBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i10) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Document.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i11) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Emphasis.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i12) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(FencedCodeBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i13) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HardLineBreak.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i14) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Heading.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i15) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11325b; {
                this.f11325b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i16) {
                    case 0:
                        this.f11325b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11325b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11325b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlCommentBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11325b; {
                this.f11325b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i17) {
                    case 0:
                        this.f11325b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11325b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11325b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInnerBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11325b; {
                this.f11325b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i18) {
                    case 0:
                        this.f11325b.render((HtmlBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11325b.render((HtmlCommentBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11325b.render((HtmlInnerBlock) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInnerBlockComment.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i19) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlEntity.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i20) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInline.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i21) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(HtmlInlineComment.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i22) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Image.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i23) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(ImageRef.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i24) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(IndentedCodeBlock.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i25) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Link.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i26) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(LinkRef.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i27) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(BulletListItem.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i28) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(OrderedListItem.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i29) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(MailLink.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i30) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(OrderedList.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i31) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Paragraph.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i32) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Reference.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i33) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(SoftLineBreak.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i34) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(StrongEmphasis.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i35) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(Text.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i36) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(TextBase.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i37) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }), new NodeRenderingHandler(ThematicBreak.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: com.vladsch.flexmark.html.renderer.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeRenderer f11320b; {
                this.f11320b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i38) {
                    case 0:
                        this.f11320b.render((HtmlInnerBlockComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 1:
                        this.f11320b.render((HtmlEntity) node, nodeRendererContext, htmlWriter);
                        return;
                    case 2:
                        this.f11320b.render((HtmlInline) node, nodeRendererContext, htmlWriter);
                        return;
                    case 3:
                        this.f11320b.render((HtmlInlineComment) node, nodeRendererContext, htmlWriter);
                        return;
                    case 4:
                        this.f11320b.render((Image) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11320b.render((ImageRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case 6:
                        this.f11320b.render((IndentedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 7:
                        this.f11320b.render((BlockQuote) node, nodeRendererContext, htmlWriter);
                        return;
                    case 8:
                        this.f11320b.render((Link) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11320b.render((LinkRef) node, nodeRendererContext, htmlWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11320b.render((BulletListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 11:
                        this.f11320b.render((OrderedListItem) node, nodeRendererContext, htmlWriter);
                        return;
                    case 12:
                        this.f11320b.render((MailLink) node, nodeRendererContext, htmlWriter);
                        return;
                    case 13:
                        this.f11320b.render((OrderedList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 14:
                        this.f11320b.render((Paragraph) node, nodeRendererContext, htmlWriter);
                        return;
                    case 15:
                        this.f11320b.render((Reference) node, nodeRendererContext, htmlWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11320b.render((SoftLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 17:
                        this.f11320b.render((StrongEmphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 18:
                        this.f11320b.render((BulletList) node, nodeRendererContext, htmlWriter);
                        return;
                    case 19:
                        this.f11320b.render((Text) node, nodeRendererContext, htmlWriter);
                        return;
                    case 20:
                        this.f11320b.render((TextBase) node, nodeRendererContext, htmlWriter);
                        return;
                    case 21:
                        this.f11320b.render((ThematicBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 22:
                        this.f11320b.render((Code) node, nodeRendererContext, htmlWriter);
                        return;
                    case 23:
                        this.f11320b.render((CodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 24:
                        this.f11320b.render((Document) node, nodeRendererContext, htmlWriter);
                        return;
                    case 25:
                        this.f11320b.render((Emphasis) node, nodeRendererContext, htmlWriter);
                        return;
                    case 26:
                        this.f11320b.render((FencedCodeBlock) node, nodeRendererContext, htmlWriter);
                        return;
                    case 27:
                        this.f11320b.render((HardLineBreak) node, nodeRendererContext, htmlWriter);
                        return;
                    case 28:
                        this.f11320b.render((Heading) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11320b.render((AutoLink) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        })));
    }

    public void render(Reference reference, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
    }

    public void renderTextBlockParagraphLines(Paragraph paragraph, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter, boolean z5) {
        if (!nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines || !paragraph.hasChildren()) {
            if (z5) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.SPAN_NODE, false, false, (Runnable) new y(8, nodeRendererContext, paragraph));
                return;
            } else {
                nodeRendererContext.renderChildren(paragraph);
                return;
            }
        }
        LineCollectingVisitor lineCollectingVisitor = new LineCollectingVisitor();
        this.myLines = lineCollectingVisitor.collectAndGetRanges(paragraph);
        this.myEOLs = lineCollectingVisitor.getEOLs();
        this.myNextLine = 0;
        if (paragraph.getFirstChild() != null) {
            outputSourceLineSpan(paragraph, paragraph.getFirstChild(), paragraph, htmlWriter);
        }
        nodeRendererContext.renderChildren(paragraph);
        htmlWriter.tag("/span");
    }

    public void render(Document document, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        nodeRendererContext.renderChildren(document);
    }

    public void render(Heading heading, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String nodeId;
        if (nodeRendererContext.getHtmlOptions().renderHeaderId && (nodeId = nodeRendererContext.getNodeId(heading)) != null && nodeId.length() > 0) {
            htmlWriter.attr(Attribute.ID_ATTR, (CharSequence) nodeId);
        }
        if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
            htmlWriter.srcPos(heading.getChars()).withAttr().tagLine((CharSequence) e.h(heading.getLevel(), "h"), (Runnable) new g(htmlWriter, heading, nodeRendererContext, 1));
        } else {
            htmlWriter.srcPos(heading.getText()).withAttr().tagLine((CharSequence) e.h(heading.getLevel(), "h"), (Runnable) new y(12, nodeRendererContext, heading));
        }
    }

    public void render(BlockQuote blockQuote, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.withAttr().tagLineIndent(FlexmarkHtmlConverter.BLOCKQUOTE_NODE, (Runnable) new y(11, nodeRendererContext, blockQuote));
    }

    public void render(FencedCodeBlock fencedCodeBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line();
        htmlWriter.srcPosWithTrailingEOL(fencedCodeBlock.getChars()).withAttr().tag(FlexmarkHtmlConverter.PRE_NODE).openPre();
        BasedSequence info = fencedCodeBlock.getInfo();
        HtmlRendererOptions htmlOptions = nodeRendererContext.getHtmlOptions();
        if (info.isNotNull() && !info.isBlank()) {
            String unescape = fencedCodeBlock.getInfoDelimitedByAny(htmlOptions.languageDelimiterSet).unescape();
            htmlWriter.attr(Attribute.CLASS_ATTR, (CharSequence) htmlOptions.languageClassMap.getOrDefault(unescape, htmlOptions.languageClassPrefix + unescape));
        } else {
            String trim = htmlOptions.noLanguageClass.trim();
            if (!trim.isEmpty()) {
                htmlWriter.attr(Attribute.CLASS_ATTR, (CharSequence) trim);
            }
        }
        htmlWriter.srcPosWithEOL(fencedCodeBlock.getContentChars()).withAttr(CODE_CONTENT).tag(FlexmarkHtmlConverter.CODE_NODE);
        if (this.codeContentBlock) {
            nodeRendererContext.renderChildren(fencedCodeBlock);
        } else {
            htmlWriter.text(fencedCodeBlock.getContentChars().normalizeEOL());
        }
        htmlWriter.tag("/code");
        ((HtmlWriter) htmlWriter.tag("/pre")).closePre();
        htmlWriter.lineIf(htmlOptions.htmlBlockCloseTagEol);
    }

    public void render(ThematicBreak thematicBreak, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.srcPos(thematicBreak.getChars()).withAttr().tagVoidLine(FlexmarkHtmlConverter.HR_NODE);
    }

    public void render(IndentedCodeBlock indentedCodeBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.line();
        htmlWriter.srcPosWithEOL(indentedCodeBlock.getChars()).withAttr().tag(FlexmarkHtmlConverter.PRE_NODE).openPre();
        String trim = nodeRendererContext.getHtmlOptions().noLanguageClass.trim();
        if (!trim.isEmpty()) {
            htmlWriter.attr(Attribute.CLASS_ATTR, (CharSequence) trim);
        }
        htmlWriter.srcPosWithEOL(indentedCodeBlock.getContentChars()).withAttr(CODE_CONTENT).tag(FlexmarkHtmlConverter.CODE_NODE);
        if (this.codeContentBlock) {
            nodeRendererContext.renderChildren(indentedCodeBlock);
        } else {
            htmlWriter.text(indentedCodeBlock.getContentChars().trimTailBlankLines().normalizeEndWithEOL());
        }
        htmlWriter.tag("/code");
        ((HtmlWriter) htmlWriter.tag("/pre")).closePre();
        htmlWriter.lineIf(nodeRendererContext.getHtmlOptions().htmlBlockCloseTagEol);
    }

    public void render(CodeBlock codeBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (codeBlock.getParent() instanceof IndentedCodeBlock) {
            htmlWriter.text((CharSequence) codeBlock.getContentChars().trimTailBlankLines().normalizeEndWithEOL());
        } else {
            htmlWriter.text((CharSequence) codeBlock.getContentChars().normalizeEOL());
        }
    }

    public void render(BulletList bulletList, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.withAttr().tagIndent(FlexmarkHtmlConverter.UL_NODE, (Runnable) new y(10, nodeRendererContext, bulletList));
    }

    public void render(OrderedList orderedList, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        int startNumber = orderedList.getStartNumber();
        if (this.listOptions.isOrderedListManualStart() && startNumber != 1) {
            htmlWriter.attr("start", (CharSequence) String.valueOf(startNumber));
        }
        htmlWriter.withAttr().tagIndent(FlexmarkHtmlConverter.OL_NODE, (Runnable) new y(7, nodeRendererContext, orderedList));
    }

    public void render(BulletListItem bulletListItem, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderListItem(bulletListItem, nodeRendererContext, htmlWriter);
    }

    public void render(OrderedListItem orderedListItem, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderListItem(orderedListItem, nodeRendererContext, htmlWriter);
    }

    public void render(Paragraph paragraph, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (paragraph.getFirstChildAnyNot(NonRenderingInline.class) != null) {
            if ((paragraph.getParent() instanceof ParagraphItemContainer) && ((ParagraphItemContainer) paragraph.getParent()).isParagraphWrappingDisabled(paragraph, this.listOptions, nodeRendererContext.getOptions())) {
                renderTextBlockParagraphLines(paragraph, nodeRendererContext, htmlWriter, false);
            } else {
                renderLooseParagraph(paragraph, nodeRendererContext, htmlWriter);
            }
        }
    }

    public void render(SoftLineBreak softLineBreak, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        HtmlWriter htmlWriter2;
        String str = nodeRendererContext.getHtmlOptions().softBreak;
        if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
            htmlWriter2 = htmlWriter;
            if (renderLineBreak(str, (str.equals(SequenceUtils.EOL) || str.equals("\r\n") || str.equals("\r")) ? FlexmarkHtmlConverter.CODE_NODE : null, softLineBreak, nodeRendererContext, htmlWriter2)) {
                return;
            }
        } else {
            htmlWriter2 = htmlWriter;
        }
        htmlWriter2.raw((CharSequence) str);
    }

    public void render(HardLineBreak hardLineBreak, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        NodeRendererContext nodeRendererContext2;
        HtmlWriter htmlWriter2;
        if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
            nodeRendererContext2 = nodeRendererContext;
            htmlWriter2 = htmlWriter;
            if (renderLineBreak(nodeRendererContext.getHtmlOptions().hardBreak, null, hardLineBreak, nodeRendererContext2, htmlWriter2)) {
                return;
            }
        } else {
            nodeRendererContext2 = nodeRendererContext;
            htmlWriter2 = htmlWriter;
        }
        htmlWriter2.raw((CharSequence) nodeRendererContext2.getHtmlOptions().hardBreak);
    }

    public void render(Emphasis emphasis, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        HtmlRendererOptions htmlOptions = nodeRendererContext.getHtmlOptions();
        String str = htmlOptions.emphasisStyleHtmlOpen;
        if (str != null && htmlOptions.emphasisStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            nodeRendererContext.renderChildren(emphasis);
            htmlWriter.raw((CharSequence) htmlOptions.emphasisStyleHtmlClose);
        } else {
            if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.EM_NODE);
            } else {
                htmlWriter.srcPos(emphasis.getText()).withAttr().tag(FlexmarkHtmlConverter.EM_NODE);
            }
            nodeRendererContext.renderChildren(emphasis);
            htmlWriter.tag("/em");
        }
    }

    public void render(StrongEmphasis strongEmphasis, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        HtmlRendererOptions htmlOptions = nodeRendererContext.getHtmlOptions();
        String str = htmlOptions.strongEmphasisStyleHtmlOpen;
        if (str != null && htmlOptions.strongEmphasisStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            nodeRendererContext.renderChildren(strongEmphasis);
            htmlWriter.raw((CharSequence) htmlOptions.strongEmphasisStyleHtmlClose);
        } else {
            if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
                htmlWriter.withAttr().tag(FlexmarkHtmlConverter.STRONG_NODE);
            } else {
                htmlWriter.srcPos(strongEmphasis.getText()).withAttr().tag(FlexmarkHtmlConverter.STRONG_NODE);
            }
            nodeRendererContext.renderChildren(strongEmphasis);
            htmlWriter.tag("/strong");
        }
    }

    public void render(Text text, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.text((CharSequence) Escaping.normalizeEOL(text.getChars().unescape()));
    }

    public void render(TextBase textBase, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        nodeRendererContext.renderChildren(textBase);
    }

    public void render(Code code, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        HtmlRendererOptions htmlOptions = nodeRendererContext.getHtmlOptions();
        String str = htmlOptions.codeStyleHtmlOpen;
        if (str != null && htmlOptions.codeStyleHtmlClose != null) {
            htmlWriter.raw((CharSequence) str);
            if (this.codeSoftLineBreaks && !htmlOptions.isSoftBreakAllSpaces) {
                ReversiblePeekingIterator<Node> it = code.getChildren().iterator();
                while (it.hasNext()) {
                    Node next = it.next();
                    if (next instanceof Text) {
                        htmlWriter.text((CharSequence) Escaping.collapseWhitespace((CharSequence) next.getChars(), true));
                    } else {
                        nodeRendererContext.render(next);
                    }
                }
            } else {
                htmlWriter.text((CharSequence) Escaping.collapseWhitespace((CharSequence) code.getText(), true));
            }
            htmlWriter.raw((CharSequence) htmlOptions.codeStyleHtmlClose);
            return;
        }
        if (nodeRendererContext.getHtmlOptions().sourcePositionParagraphLines) {
            htmlWriter.withAttr().tag(FlexmarkHtmlConverter.CODE_NODE);
        } else {
            htmlWriter.srcPos(code.getText()).withAttr().tag(FlexmarkHtmlConverter.CODE_NODE);
        }
        if (this.codeSoftLineBreaks && !htmlOptions.isSoftBreakAllSpaces) {
            ReversiblePeekingIterator<Node> it2 = code.getChildren().iterator();
            while (it2.hasNext()) {
                Node next2 = it2.next();
                if (next2 instanceof Text) {
                    htmlWriter.text((CharSequence) Escaping.collapseWhitespace((CharSequence) next2.getChars(), true));
                } else {
                    nodeRendererContext.render(next2);
                }
            }
        } else {
            htmlWriter.text((CharSequence) Escaping.collapseWhitespace((CharSequence) code.getText(), true));
        }
        htmlWriter.tag("/code");
    }

    public void render(HtmlBlock htmlBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        HtmlWriter htmlWriter2;
        htmlWriter.line();
        HtmlRendererOptions htmlOptions = nodeRendererContext.getHtmlOptions();
        if (htmlOptions.sourceWrapHtmlBlocks) {
            htmlWriter.srcPos(htmlBlock.getChars()).withAttr(AttributablePart.NODE_POSITION).tag(FlexmarkHtmlConverter.DIV_NODE).indent().line();
        }
        if (htmlBlock.hasChildren()) {
            nodeRendererContext.renderChildren(htmlBlock);
            htmlWriter2 = htmlWriter;
        } else {
            htmlWriter2 = htmlWriter;
            renderHtmlBlock(htmlBlock, nodeRendererContext, htmlWriter2, htmlOptions.suppressHtmlBlocks, htmlOptions.escapeHtmlBlocks, false);
        }
        if (htmlOptions.sourceWrapHtmlBlocks) {
            htmlWriter2.unIndent().tag((CharSequence) "/div");
        }
        htmlWriter2.lineIf(htmlOptions.htmlBlockCloseTagEol);
    }

    public void render(HtmlCommentBlock htmlCommentBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderHtmlBlock(htmlCommentBlock, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlCommentBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlCommentBlocks, false);
    }

    public void render(HtmlInnerBlock htmlInnerBlock, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderHtmlBlock(htmlInnerBlock, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlBlocks, false);
    }

    public void render(HtmlInnerBlockComment htmlInnerBlockComment, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderHtmlBlock(htmlInnerBlockComment, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressHtmlCommentBlocks, nodeRendererContext.getHtmlOptions().escapeHtmlCommentBlocks, false);
    }

    public void render(HtmlInline htmlInline, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderInlineHtml(htmlInline, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressInlineHtml, nodeRendererContext.getHtmlOptions().escapeInlineHtml);
    }

    public void render(HtmlInlineComment htmlInlineComment, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        renderInlineHtml(htmlInlineComment, nodeRendererContext, htmlWriter, nodeRendererContext.getHtmlOptions().suppressInlineHtmlComments, nodeRendererContext.getHtmlOptions().escapeInlineHtmlComments);
    }

    public void render(HtmlEntity htmlEntity, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (nodeRendererContext.getHtmlOptions().unescapeHtmlEntities) {
            htmlWriter.text((CharSequence) htmlEntity.getChars().unescape());
        } else {
            htmlWriter.raw((CharSequence) htmlEntity.getChars().unescapeNoEntities());
        }
    }

    public void render(AutoLink autoLink, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String url;
        String obj = autoLink.getText().toString();
        if (!nodeRendererContext.isDoNotRenderLinks() && !isSuppressedLinkPrefix(autoLink.getUrl(), nodeRendererContext)) {
            ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.LINK, obj, null);
            HtmlWriter srcPos = htmlWriter.srcPos(autoLink.getText());
            if (resolveLink.getUrl().startsWith("www.")) {
                url = e.n(nodeRendererContext.getHtmlOptions().autolinkWwwPrefix, resolveLink.getUrl());
            } else {
                url = resolveLink.getUrl();
            }
            srcPos.attr("href", (CharSequence) url).withAttr(resolveLink).tag((CharSequence) FlexmarkHtmlConverter.A_NODE, false, false, (Runnable) new y(9, htmlWriter, obj));
            return;
        }
        htmlWriter.text((CharSequence) obj);
    }

    public void render(MailLink mailLink, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String unescape = mailLink.getText().unescape();
        if (!nodeRendererContext.isDoNotRenderLinks() && !isSuppressedLinkPrefix(mailLink.getUrl(), nodeRendererContext)) {
            ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.LINK, unescape, null);
            if (this.obfuscateEmail) {
                htmlWriter.srcPos(mailLink.getText()).attr("href", (CharSequence) Escaping.obfuscate(AbstractC1135a.f("mailto:", resolveLink.getUrl()), this.obfuscateEmailRandom)).withAttr(resolveLink).tag((CharSequence) FlexmarkHtmlConverter.A_NODE).raw((CharSequence) Escaping.obfuscate(unescape, true)).tag((CharSequence) "/a");
                return;
            } else {
                String url = resolveLink.getUrl();
                htmlWriter.srcPos(mailLink.getText()).attr("href", (CharSequence) ("mailto:" + url)).withAttr(resolveLink).tag((CharSequence) FlexmarkHtmlConverter.A_NODE).text((CharSequence) unescape).tag((CharSequence) "/a");
                return;
            }
        }
        htmlWriter.text((CharSequence) unescape);
    }

    public void render(Image image, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (nodeRendererContext.isDoNotRenderLinks() || isSuppressedLinkPrefix(image.getUrl(), nodeRendererContext)) {
            return;
        }
        String collectAndGetText = new TextCollectingVisitor().collectAndGetText(image);
        ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.IMAGE, image.getUrl().unescape(), null, null);
        String url = resolveLink.getUrl();
        if (!image.getUrlContent().isEmpty()) {
            url = e.n(url, Escaping.percentEncodeUrl(image.getUrlContent()).replace("+", "%2B").replace("%3D", "=").replace("%26", "&amp;"));
        }
        htmlWriter.attr("src", (CharSequence) url);
        htmlWriter.attr("alt", (CharSequence) collectAndGetText);
        if (image.getTitle().isNotNull()) {
            resolveLink = resolveLink.withTitle(image.getTitle().unescape());
        }
        htmlWriter.attr(resolveLink.getNonNullAttributes());
        htmlWriter.srcPos(image.getChars()).withAttr(resolveLink).tagVoid(FlexmarkHtmlConverter.IMG_NODE);
    }

    public void render(Link link, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        if (!nodeRendererContext.isDoNotRenderLinks() && !isSuppressedLinkPrefix(link.getUrl(), nodeRendererContext)) {
            ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.LINK, link.getUrl().unescape(), null, null);
            htmlWriter.attr("href", (CharSequence) resolveLink.getUrl());
            if (link.getTitle().isNotNull()) {
                resolveLink = resolveLink.withTitle(link.getTitle().unescape());
            }
            htmlWriter.attr(resolveLink.getNonNullAttributes());
            htmlWriter.srcPos(link.getChars()).withAttr(resolveLink).tag(FlexmarkHtmlConverter.A_NODE);
            renderChildrenSourceLineWrapped(link, link.getText(), nodeRendererContext, htmlWriter);
            htmlWriter.tag("/a");
            return;
        }
        nodeRendererContext.renderChildren(link);
    }

    public void render(ImageRef imageRef, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        Reference reference;
        boolean z5;
        if (!imageRef.isDefined() && this.recheckUndefinedReferences && imageRef.getReferenceNode(this.referenceRepository) != null) {
            imageRef.setDefined(true);
        }
        ResolvedLink resolvedLink = null;
        if (imageRef.isDefined()) {
            reference = imageRef.getReferenceNode(this.referenceRepository);
            String unescape = reference.getUrl().unescape();
            z5 = isSuppressedLinkPrefix(unescape, nodeRendererContext);
            resolvedLink = nodeRendererContext.resolveLink(LinkType.IMAGE, unescape, null, null);
            if (reference.getTitle().isNotNull()) {
                resolvedLink = resolvedLink.withTitle(reference.getTitle().unescape());
            }
        } else {
            ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.IMAGE_REF, this.referenceRepository.normalizeKey(imageRef.getReference()), null, null);
            if (resolveLink.getStatus() == LinkStatus.UNKNOWN || resolveLink.getUrl().isEmpty()) {
                reference = null;
            } else {
                resolvedLink = resolveLink;
                reference = null;
            }
            z5 = false;
        }
        if (resolvedLink == null) {
            htmlWriter.text((CharSequence) imageRef.getChars().unescape());
            return;
        }
        if (nodeRendererContext.isDoNotRenderLinks() || z5) {
            return;
        }
        String collectAndGetText = new TextCollectingVisitor().collectAndGetText(imageRef);
        Attributes nonNullAttributes = resolvedLink.getNonNullAttributes();
        htmlWriter.attr("src", (CharSequence) resolvedLink.getUrl());
        htmlWriter.attr("alt", (CharSequence) collectAndGetText);
        if (reference != null) {
            nonNullAttributes = nodeRendererContext.extendRenderingNodeAttributes(reference, AttributablePart.NODE, nonNullAttributes);
        }
        htmlWriter.attr(nonNullAttributes);
        htmlWriter.srcPos(imageRef.getChars()).withAttr(resolvedLink).tagVoid(FlexmarkHtmlConverter.IMG_NODE);
    }

    public void render(LinkRef linkRef, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        Reference reference;
        boolean z5;
        if (!linkRef.isDefined() && this.recheckUndefinedReferences && linkRef.getReferenceNode(this.referenceRepository) != null) {
            linkRef.setDefined(true);
        }
        ResolvedLink resolvedLink = null;
        if (linkRef.isDefined()) {
            reference = linkRef.getReferenceNode(this.referenceRepository);
            String unescape = reference.getUrl().unescape();
            z5 = isSuppressedLinkPrefix(unescape, nodeRendererContext);
            resolvedLink = nodeRendererContext.resolveLink(LinkType.LINK, unescape, null, null);
            if (reference.getTitle().isNotNull()) {
                resolvedLink = resolvedLink.withTitle(reference.getTitle().unescape());
            }
        } else {
            ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.LINK_REF, linkRef.getReference().unescape(), null, null);
            if (resolveLink.getStatus() == LinkStatus.UNKNOWN || resolveLink.getUrl().isEmpty()) {
                reference = null;
            } else {
                resolvedLink = resolveLink;
                reference = null;
            }
            z5 = false;
        }
        if (resolvedLink == null) {
            if (!linkRef.hasChildren()) {
                htmlWriter.text((CharSequence) linkRef.getChars().unescape());
                return;
            }
            htmlWriter.text((CharSequence) linkRef.getChars().prefixOf(linkRef.getChildChars()).unescape());
            renderChildrenSourceLineWrapped(linkRef, linkRef.getText(), nodeRendererContext, htmlWriter);
            htmlWriter.text((CharSequence) linkRef.getChars().suffixOf(linkRef.getChildChars()).unescape());
            return;
        }
        if (!nodeRendererContext.isDoNotRenderLinks() && !z5) {
            Attributes nonNullAttributes = resolvedLink.getNonNullAttributes();
            htmlWriter.attr("href", (CharSequence) resolvedLink.getUrl());
            if (reference != null) {
                nonNullAttributes = nodeRendererContext.extendRenderingNodeAttributes(reference, AttributablePart.NODE, nonNullAttributes);
            }
            htmlWriter.attr(nonNullAttributes);
            htmlWriter.srcPos(linkRef.getChars()).withAttr(resolvedLink).tag(FlexmarkHtmlConverter.A_NODE);
            renderChildrenSourceLineWrapped(linkRef, linkRef.getText(), nodeRendererContext, htmlWriter);
            htmlWriter.tag("/a");
            return;
        }
        nodeRendererContext.renderChildren(linkRef);
    }
}
