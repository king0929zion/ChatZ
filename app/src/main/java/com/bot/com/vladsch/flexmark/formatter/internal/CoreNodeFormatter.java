package com.vladsch.flexmark.formatter.internal;

import B3.e;
import F0.F;
import c.C0914b;
import com.vladsch.flexmark.ast.AutoLink;
import com.vladsch.flexmark.ast.BlockQuote;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.BulletListItem;
import com.vladsch.flexmark.ast.Code;
import com.vladsch.flexmark.ast.DelimitedLinkNode;
import com.vladsch.flexmark.ast.Emphasis;
import com.vladsch.flexmark.ast.FencedCodeBlock;
import com.vladsch.flexmark.ast.HardLineBreak;
import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.HtmlBlock;
import com.vladsch.flexmark.ast.HtmlBlockBase;
import com.vladsch.flexmark.ast.HtmlCommentBlock;
import com.vladsch.flexmark.ast.HtmlEntity;
import com.vladsch.flexmark.ast.HtmlInline;
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
import com.vladsch.flexmark.ast.ParagraphContainer;
import com.vladsch.flexmark.ast.ParagraphItemContainer;
import com.vladsch.flexmark.ast.RefNode;
import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.ast.SoftLineBreak;
import com.vladsch.flexmark.ast.StrongEmphasis;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.ast.TextBase;
import com.vladsch.flexmark.ast.ThematicBreak;
import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.formatter.FormatterOptions;
import com.vladsch.flexmark.formatter.FormatterUtils;
import com.vladsch.flexmark.formatter.FormattingPhase;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.NodeFormatter;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.NodeFormatterFactory;
import com.vladsch.flexmark.formatter.NodeFormattingHandler;
import com.vladsch.flexmark.formatter.NodeRepositoryFormatter;
import com.vladsch.flexmark.formatter.RenderPurpose;
import com.vladsch.flexmark.formatter.TranslationPlaceholderGenerator;
import com.vladsch.flexmark.formatter.i;
import com.vladsch.flexmark.formatter.j;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.ParserEmulationProfile;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.ast.BlankLine;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeRepository;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.NotNullValueSupplier;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.format.options.CodeFenceMarker;
import com.vladsch.flexmark.util.format.options.ElementPlacement;
import com.vladsch.flexmark.util.format.options.ElementPlacementSort;
import com.vladsch.flexmark.util.format.options.EqualizeTrailingMarker;
import com.vladsch.flexmark.util.format.options.ListSpacing;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.RepeatedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.mappers.SpaceMapper;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class CoreNodeFormatter extends NodeRepositoryFormatter<ReferenceRepository, Reference, RefNode> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Map<String, String> attributeUniquificationIdMap;
    private int blankLines;
    final FormatterOptions formatterOptions;
    private final ListOptions listOptions;
    private final String myHtmlBlockPrefix;
    private final String myHtmlInlinePrefix;
    private final String myTranslationAutolinkPrefix;
    MutableDataHolder myTranslationStore;

    @Deprecated
    public static final DataKey<Map<String, String>> UNIQUIFICATION_MAP = Formatter.UNIQUIFICATION_MAP;

    @Deprecated
    public static final DataKey<Map<String, String>> ATTRIBUTE_UNIQUIFICATION_ID_MAP = Formatter.ATTRIBUTE_UNIQUIFICATION_ID_MAP;
    static final TranslationPlaceholderGenerator htmlEntityPlaceholderGenerator = new F(7);
    public static final DataKey<Boolean> UNWRAPPED_AUTO_LINKS = new DataKey<>("UNWRAPPED_AUTO_LINKS", Boolean.FALSE);
    public static final DataKey<HashSet<String>> UNWRAPPED_AUTO_LINKS_MAP = new DataKey<>("UNWRAPPED_AUTO_LINKS_MAP", (NotNullValueSupplier) new Object());

    /* renamed from: com.vladsch.flexmark.formatter.internal.CoreNodeFormatter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$CodeFenceMarker;
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$util$format$options$EqualizeTrailingMarker;

        static {
            int[] iArr = new int[RenderPurpose.values().length];
            $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose = iArr;
            try {
                iArr[RenderPurpose.TRANSLATION_SPANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED_SPANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[CodeFenceMarker.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$CodeFenceMarker = iArr2;
            try {
                iArr2[CodeFenceMarker.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$CodeFenceMarker[CodeFenceMarker.BACK_TICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$CodeFenceMarker[CodeFenceMarker.TILDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EqualizeTrailingMarker.values().length];
            $SwitchMap$com$vladsch$flexmark$util$format$options$EqualizeTrailingMarker = iArr3;
            try {
                iArr3[EqualizeTrailingMarker.EQUALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$EqualizeTrailingMarker[EqualizeTrailingMarker.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$EqualizeTrailingMarker[EqualizeTrailingMarker.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$util$format$options$EqualizeTrailingMarker[EqualizeTrailingMarker.AS_IS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Factory implements NodeFormatterFactory {
        @Override // com.vladsch.flexmark.formatter.NodeFormatterFactory
        public NodeFormatter create(DataHolder dataHolder) {
            return new CoreNodeFormatter(dataHolder);
        }
    }

    public CoreNodeFormatter(DataHolder dataHolder) {
        super(dataHolder, null, Formatter.UNIQUIFICATION_MAP);
        FormatterOptions formatterOptions = new FormatterOptions(dataHolder);
        this.formatterOptions = formatterOptions;
        this.listOptions = ListOptions.get(dataHolder);
        this.blankLines = 0;
        this.myHtmlBlockPrefix = AbstractC1135a.f("<", formatterOptions.translationHtmlBlockPrefix);
        this.myHtmlInlinePrefix = formatterOptions.translationHtmlInlinePrefix;
        this.myTranslationAutolinkPrefix = formatterOptions.translationAutolinkPrefix;
    }

    public static /* synthetic */ void lambda$render$3(HtmlEntity htmlEntity, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.appendNonTranslating(htmlEntity.getChars());
    }

    public /* synthetic */ CharSequence lambda$renderAutoLink$4(String str) {
        UNWRAPPED_AUTO_LINKS_MAP.get(this.myTranslationStore).add(str);
        return str;
    }

    public static /* synthetic */ void lambda$renderAutoLink$5(MarkdownWriter markdownWriter, String str, DelimitedLinkNode delimitedLinkNode, String str2) {
        markdownWriter.append("<");
        markdownWriter.appendNonTranslating(str, delimitedLinkNode.getText(), str2);
        markdownWriter.append(">");
    }

    public static /* synthetic */ String lambda$static$2(int i6) {
        Locale locale = Locale.US;
        return e.l("&#", i6, ";");
    }

    public void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        BasedSequence chars = node.getChars();
        if (node instanceof Block) {
            BasedSequence contentChars = ((Block) node).getContentChars();
            if (chars.isNotNull()) {
                BasedSequence prefixOf = chars.prefixOf(contentChars);
                if (!prefixOf.isEmpty()) {
                    markdownWriter.append((CharSequence) prefixOf);
                }
            }
            nodeFormatterContext.renderChildren(node);
            if (chars.isNotNull()) {
                BasedSequence suffixOf = chars.suffixOf(contentChars);
                if (suffixOf.isEmpty()) {
                    return;
                }
                markdownWriter.append((CharSequence) suffixOf);
                return;
            }
            return;
        }
        if (this.formatterOptions.keepSoftLineBreaks) {
            markdownWriter.append((CharSequence) chars);
        } else {
            markdownWriter.append(FormatterUtils.stripSoftLineBreak(chars, SequenceUtils.SPACE));
        }
    }

    private void renderAutoLink(DelimitedLinkNode delimitedLinkNode, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, String str, String str2) {
        if (!nodeFormatterContext.isTransformingText()) {
            markdownWriter.append((CharSequence) delimitedLinkNode.getChars());
            return;
        }
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[nodeFormatterContext.getRenderPurpose().ordinal()];
        if (i6 == 1) {
            if (delimitedLinkNode.getOpeningMarker().isNull()) {
                this.myTranslationStore.set((DataKey<DataKey<Boolean>>) UNWRAPPED_AUTO_LINKS, (DataKey<Boolean>) Boolean.TRUE);
                nodeFormatterContext.postProcessNonTranslating(new i(this, 1), new j(markdownWriter, str, delimitedLinkNode, str2));
                return;
            } else {
                markdownWriter.append("<");
                markdownWriter.appendNonTranslating(str, delimitedLinkNode.getText(), str2);
                markdownWriter.append(">");
                return;
            }
        }
        if (i6 == 2) {
            markdownWriter.append("<");
            markdownWriter.appendNonTranslating(str, delimitedLinkNode.getText(), str2);
            markdownWriter.append(">");
        } else {
            if (i6 != 3) {
                markdownWriter.append((CharSequence) delimitedLinkNode.getChars());
                return;
            }
            if (UNWRAPPED_AUTO_LINKS.get(this.myTranslationStore).booleanValue() && UNWRAPPED_AUTO_LINKS_MAP.get(this.myTranslationStore).contains(delimitedLinkNode.getText().toString())) {
                markdownWriter.appendNonTranslating(str, delimitedLinkNode.getText(), str2);
                return;
            }
            markdownWriter.append("<");
            markdownWriter.appendNonTranslating(str, delimitedLinkNode.getText(), str2);
            markdownWriter.append(">");
        }
    }

    public void appendReference(CharSequence charSequence, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (!nodeFormatterContext.isTransformingText() || nodeFormatterContext.getRenderPurpose() != RenderPurpose.TRANSLATED || nodeFormatterContext.getMergeContext() == null) {
            markdownWriter.appendTranslating(charSequence);
        } else {
            String valueOf = String.valueOf(nodeFormatterContext.transformTranslating(null, charSequence, null, null));
            markdownWriter.append((CharSequence) this.referenceUniqificationMap.getOrDefault(valueOf, valueOf));
        }
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public char getBlockQuoteLikePrefixChar() {
        return BlockQuoteParser.MARKER_CHAR;
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<Class<?>> getNodeClasses() {
        if (this.formatterOptions.referencePlacement.isNoChange() || !this.formatterOptions.referenceSort.isUnused()) {
            return null;
        }
        return new HashSet(Arrays.asList(RefNode.class));
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<NodeFormattingHandler<?>> getNodeFormattingHandlers() {
        final int i6 = 10;
        final int i7 = 2;
        final int i8 = 14;
        final int i9 = 19;
        final int i10 = 20;
        final int i11 = 22;
        final int i12 = 23;
        final int i13 = 24;
        final int i14 = 25;
        final int i15 = 26;
        final int i16 = 21;
        final int i17 = 27;
        final int i18 = 28;
        final int i19 = 29;
        final int i20 = 0;
        final int i21 = 1;
        final int i22 = 2;
        final int i23 = 3;
        final int i24 = 0;
        final int i25 = 1;
        final int i26 = 3;
        final int i27 = 4;
        final int i28 = 5;
        final int i29 = 6;
        final int i30 = 7;
        final int i31 = 8;
        final int i32 = 9;
        final int i33 = 11;
        final int i34 = 12;
        final int i35 = 13;
        final int i36 = 15;
        final int i37 = 16;
        final int i38 = 17;
        final int i39 = 18;
        return new HashSet(Arrays.asList(new NodeFormattingHandler(Node.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i6) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(AutoLink.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i7) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(BlankLine.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i8) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(BlockQuote.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i9) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Code.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i10) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Document.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i11) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Emphasis.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i12) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(FencedCodeBlock.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i13) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HardLineBreak.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i14) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Heading.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i15) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlBlock.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i16) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlCommentBlock.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i17) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlInnerBlock.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i18) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlInnerBlockComment.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i19) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlEntity.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11314b; {
                this.f11314b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i20) {
                    case 0:
                        this.f11314b.render((HtmlEntity) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11314b.render((HtmlInline) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11314b.render((HtmlInlineComment) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11314b.render((Image) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlInline.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11314b; {
                this.f11314b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i21) {
                    case 0:
                        this.f11314b.render((HtmlEntity) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11314b.render((HtmlInline) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11314b.render((HtmlInlineComment) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11314b.render((Image) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(HtmlInlineComment.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11314b; {
                this.f11314b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i22) {
                    case 0:
                        this.f11314b.render((HtmlEntity) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11314b.render((HtmlInline) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11314b.render((HtmlInlineComment) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11314b.render((Image) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Image.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11314b; {
                this.f11314b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i23) {
                    case 0:
                        this.f11314b.render((HtmlEntity) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11314b.render((HtmlInline) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11314b.render((HtmlInlineComment) node, nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11314b.render((Image) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(ImageRef.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i24) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(IndentedCodeBlock.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i25) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Link.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i26) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(LinkRef.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i27) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(BulletList.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i28) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(OrderedList.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i29) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(BulletListItem.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i30) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(OrderedListItem.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i31) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(MailLink.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i32) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Paragraph.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i33) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Reference.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i34) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(SoftLineBreak.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i35) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(StrongEmphasis.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i36) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(Text.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i37) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(TextBase.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i38) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        }), new NodeFormattingHandler(ThematicBreak.class, new NodeFormattingHandler.CustomNodeFormatter(this) { // from class: com.vladsch.flexmark.formatter.internal.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreNodeFormatter f11311b; {
                this.f11311b = this;
            }

            @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
            public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
                switch (i39) {
                    case 0:
                        this.f11311b.render((ImageRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 1:
                        this.f11311b.render((IndentedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 2:
                        this.f11311b.render((AutoLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 3:
                        this.f11311b.render((Link) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 4:
                        this.f11311b.render((LinkRef) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11311b.render((BulletList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 6:
                        this.f11311b.render((OrderedList) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 7:
                        this.f11311b.render((BulletListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 8:
                        this.f11311b.render((OrderedListItem) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15287d /* 9 */:
                        this.f11311b.render((MailLink) node, nodeFormatterContext, markdownWriter);
                        return;
                    case AbstractC1787b.f15289f /* 10 */:
                        this.f11311b.render(node, nodeFormatterContext, markdownWriter);
                        return;
                    case 11:
                        this.f11311b.render((Paragraph) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 12:
                        this.f11311b.render((Reference) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 13:
                        this.f11311b.render((SoftLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 14:
                        this.f11311b.render((BlankLine) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 15:
                        this.f11311b.render((StrongEmphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        this.f11311b.render((Text) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 17:
                        this.f11311b.render((TextBase) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 18:
                        this.f11311b.render((ThematicBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 19:
                        this.f11311b.render((BlockQuote) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 20:
                        this.f11311b.render((Code) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 21:
                        this.f11311b.render((HtmlBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 22:
                        this.f11311b.render((Document) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 23:
                        this.f11311b.render((Emphasis) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 24:
                        this.f11311b.render((FencedCodeBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 25:
                        this.f11311b.render((HardLineBreak) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 26:
                        this.f11311b.render((Heading) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 27:
                        this.f11311b.render((HtmlCommentBlock) node, nodeFormatterContext, markdownWriter);
                        return;
                    case 28:
                        this.f11311b.render((HtmlBlockBase) ((HtmlInnerBlock) node), nodeFormatterContext, markdownWriter);
                        return;
                    default:
                        this.f11311b.render((HtmlInnerBlockComment) node, nodeFormatterContext, markdownWriter);
                        return;
                }
            }
        })));
    }

    @Override // com.vladsch.flexmark.formatter.NodeRepositoryFormatter
    public ElementPlacement getReferencePlacement() {
        return this.formatterOptions.referencePlacement;
    }

    @Override // com.vladsch.flexmark.formatter.NodeRepositoryFormatter
    public ElementPlacementSort getReferenceSort() {
        return this.formatterOptions.referenceSort;
    }

    @Override // com.vladsch.flexmark.formatter.NodeRepositoryFormatter, com.vladsch.flexmark.formatter.PhasedNodeFormatter
    public void renderDocument(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, Document document, FormattingPhase formattingPhase) {
        super.renderDocument(nodeFormatterContext, markdownWriter, document, formattingPhase);
        this.attributeUniquificationIdMap = Formatter.ATTRIBUTE_UNIQUIFICATION_ID_MAP.get(nodeFormatterContext.getTranslationStore());
        if (formattingPhase == FormattingPhase.DOCUMENT_BOTTOM && this.formatterOptions.appendTransferredReferences) {
            ArrayList arrayList = new ArrayList();
            for (DataKeyBase<?> dataKeyBase : document.getAll().keySet()) {
                if (dataKeyBase.get(document) instanceof NodeRepository) {
                    arrayList.add(dataKeyBase);
                }
            }
            arrayList.sort(Comparator.comparing(new g(1)));
            int size = arrayList.size();
            boolean z5 = true;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                DataKeyBase dataKeyBase2 = (DataKeyBase) obj;
                if (dataKeyBase2.get(document) instanceof NodeRepository) {
                    for (Object obj2 : ((NodeRepository) dataKeyBase2.get(document)).getReferencedElements(document)) {
                        if (obj2 instanceof Node) {
                            Node node = (Node) obj2;
                            if (node.getDocument() != document) {
                                if (z5) {
                                    markdownWriter.blankLine();
                                    z5 = false;
                                }
                                nodeFormatterContext.render(node);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.vladsch.flexmark.formatter.NodeRepositoryFormatter
    public ReferenceRepository getRepository(DataHolder dataHolder) {
        return Parser.REFERENCES.get(dataHolder);
    }

    @Override // com.vladsch.flexmark.formatter.NodeRepositoryFormatter
    public void lambda$renderReferenceBlockUnique$1(Reference reference, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.isTransformingText()) {
            markdownWriter.append((CharSequence) reference.getOpeningMarker());
            appendReference(reference.getReference(), nodeFormatterContext, markdownWriter);
            markdownWriter.append((CharSequence) reference.getClosingMarker());
            markdownWriter.append(SequenceUtils.SPC);
            markdownWriter.append((CharSequence) reference.getUrlOpeningMarker());
            if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.TRANSLATION_SPANS) {
                ResolvedLink resolveLink = nodeFormatterContext.resolveLink(LinkType.LINK, reference.getUrl(), Boolean.FALSE);
                markdownWriter.appendNonTranslating(resolveLink.getPageRef());
                if (resolveLink.getAnchorRef() != null) {
                    markdownWriter.append("#");
                    CharSequence transformAnchorRef = nodeFormatterContext.transformAnchorRef(resolveLink.getPageRef(), resolveLink.getAnchorRef());
                    if (this.attributeUniquificationIdMap != null && resolveLink.getPageRef().isEmpty() && nodeFormatterContext.isTransformingText() && nodeFormatterContext.getMergeContext() != null) {
                        String valueOf = String.valueOf(transformAnchorRef);
                        markdownWriter.append((CharSequence) this.attributeUniquificationIdMap.getOrDefault(valueOf, valueOf));
                    } else {
                        markdownWriter.append(transformAnchorRef);
                    }
                    markdownWriter.append(transformAnchorRef);
                }
            } else {
                markdownWriter.appendNonTranslating(reference.getPageRef());
                markdownWriter.append((CharSequence) reference.getAnchorMarker());
                if (reference.getAnchorRef().isNotNull()) {
                    markdownWriter.append(nodeFormatterContext.transformAnchorRef(reference.getPageRef(), reference.getAnchorRef()));
                }
            }
            if (reference.getTitleOpeningMarker().isNotNull()) {
                markdownWriter.append(SequenceUtils.SPC);
                markdownWriter.append((CharSequence) reference.getTitleOpeningMarker());
                if (reference.getTitle().isNotNull()) {
                    markdownWriter.appendTranslating(reference.getTitle());
                }
                markdownWriter.append((CharSequence) reference.getTitleClosingMarker());
            }
            markdownWriter.append((CharSequence) reference.getUrlClosingMarker()).line();
            return;
        }
        markdownWriter.append((CharSequence) reference.getChars()).line();
        Node next = reference.getNext();
        if ((next instanceof HtmlCommentBlock) || (next instanceof HtmlInnerBlockComment)) {
            BasedSequence midSequence = next.getChars().trim().midSequence(4, -3);
            Pattern pattern = this.formatterOptions.linkMarkerCommentPattern;
            if (pattern != null && pattern.matcher(midSequence).matches()) {
                markdownWriter.append("<!--").append((CharSequence) String.valueOf(midSequence)).append((CharSequence) "-->");
            }
        }
        markdownWriter.line();
    }

    public void render(BlankLine blankLine, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (FormatterUtils.LIST_ITEM_SPACING.get(nodeFormatterContext.getDocument()) != null || markdownWriter.offsetWithPending() <= 0) {
            return;
        }
        if (blankLine.getPrevious() != null && !(blankLine.getPrevious() instanceof BlankLine)) {
            this.blankLines = 0;
        }
        int i6 = this.blankLines + 1;
        this.blankLines = i6;
        if (i6 <= this.formatterOptions.maxBlankLines) {
            markdownWriter.blankLine(i6);
        }
    }

    public void render(Document document, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        this.myTranslationStore = nodeFormatterContext.getTranslationStore();
        nodeFormatterContext.renderChildren(document);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r8.getClosingMarker().isNull() != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(final com.vladsch.flexmark.ast.Heading r8, com.vladsch.flexmark.formatter.NodeFormatterContext r9, com.vladsch.flexmark.formatter.MarkdownWriter r10) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.formatter.internal.CoreNodeFormatter.render(com.vladsch.flexmark.ast.Heading, com.vladsch.flexmark.formatter.NodeFormatterContext, com.vladsch.flexmark.formatter.MarkdownWriter):void");
    }

    public void render(BlockQuote blockQuote, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterUtils.renderBlockQuoteLike(blockQuote, nodeFormatterContext, markdownWriter);
    }

    public void render(ThematicBreak thematicBreak, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.blankLine();
        String str = this.formatterOptions.thematicBreak;
        if (str != null) {
            markdownWriter.append((CharSequence) str);
        } else {
            markdownWriter.append((CharSequence) thematicBreak.getChars());
        }
        markdownWriter.tailBlankLine();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(com.vladsch.flexmark.ast.FencedCodeBlock r12, com.vladsch.flexmark.formatter.NodeFormatterContext r13, com.vladsch.flexmark.formatter.MarkdownWriter r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.formatter.internal.CoreNodeFormatter.render(com.vladsch.flexmark.ast.FencedCodeBlock, com.vladsch.flexmark.formatter.NodeFormatterContext, com.vladsch.flexmark.formatter.MarkdownWriter):void");
    }

    public void render(IndentedCodeBlock indentedCodeBlock, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.blankLine();
        if (nodeFormatterContext.isTransformingText()) {
            BasedSequence contentChars = indentedCodeBlock.getContentChars();
            String actualAdditionalPrefix = FormatterUtils.getActualAdditionalPrefix(contentChars, markdownWriter);
            if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.TRANSLATED) {
                contentChars = contentChars.trimStart();
            }
            markdownWriter.pushPrefix().addPrefix((CharSequence) actualAdditionalPrefix);
            markdownWriter.openPreFormatted(true);
            markdownWriter.appendNonTranslating(Utils.suffixWith(contentChars.toString(), '\n'));
        } else {
            String charSequence = RepeatedSequence.repeatOf(SequenceUtils.SPACE, this.listOptions.getCodeIndent()).toString();
            if (this.formatterOptions.emulationProfile == ParserEmulationProfile.GITHUB_DOC && (indentedCodeBlock.getParent() instanceof ListItem)) {
                charSequence = RepeatedSequence.repeatOf(SequenceUtils.SPACE, Utils.minLimit(7 - ((ListItem) indentedCodeBlock.getParent()).getOpeningMarker().length(), 4)).toString();
            }
            markdownWriter.pushPrefix().addPrefix((CharSequence) charSequence);
            markdownWriter.openPreFormatted(true);
            if (this.formatterOptions.indentedCodeMinimizeIndent) {
                List<BasedSequence> contentLines = indentedCodeBlock.getContentLines();
                int[] iArr = new int[contentLines.size()];
                Iterator<BasedSequence> it = contentLines.iterator();
                int i6 = 0;
                int i7 = TableCell.NOT_TRACKED;
                int i8 = 0;
                while (it.hasNext()) {
                    int countLeadingColumns = it.next().countLeadingColumns(0, CharPredicate.SPACE_TAB);
                    iArr[i8] = countLeadingColumns;
                    i7 = Utils.min(i7, countLeadingColumns);
                    i8++;
                }
                if (i7 > 0) {
                    for (BasedSequence basedSequence : contentLines) {
                        int i9 = iArr[i6];
                        if (i9 > i7) {
                            markdownWriter.append(SequenceUtils.SPC, i9 - i7);
                        }
                        markdownWriter.append((CharSequence) basedSequence.trimStart());
                        i6++;
                    }
                } else {
                    markdownWriter.append((CharSequence) indentedCodeBlock.getContentChars());
                }
            } else {
                markdownWriter.append((CharSequence) indentedCodeBlock.getContentChars());
            }
        }
        markdownWriter.closePreFormatted();
        markdownWriter.popPrefix(true);
        markdownWriter.tailBlankLine();
    }

    public void render(BulletList bulletList, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterUtils.renderList(bulletList, nodeFormatterContext, markdownWriter);
    }

    public void render(OrderedList orderedList, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterUtils.renderList(orderedList, nodeFormatterContext, markdownWriter);
    }

    public void render(BulletListItem bulletListItem, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterUtils.renderListItem(bulletListItem, nodeFormatterContext, markdownWriter, this.listOptions, bulletListItem.getMarkerSuffix(), false);
    }

    public void render(OrderedListItem orderedListItem, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterUtils.renderListItem(orderedListItem, nodeFormatterContext, markdownWriter, this.listOptions, orderedListItem.getMarkerSuffix(), false);
    }

    public void render(Emphasis emphasis, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.append((CharSequence) emphasis.getOpeningMarker());
        nodeFormatterContext.renderChildren(emphasis);
        markdownWriter.append((CharSequence) emphasis.getOpeningMarker());
    }

    public void render(StrongEmphasis strongEmphasis, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.append((CharSequence) strongEmphasis.getOpeningMarker());
        nodeFormatterContext.renderChildren(strongEmphasis);
        markdownWriter.append((CharSequence) strongEmphasis.getOpeningMarker());
    }

    public void render(Paragraph paragraph, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.isTransformingText()) {
            FormatterUtils.renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
            if (paragraph.isTrailingBlankLine()) {
                markdownWriter.tailBlankLine();
                return;
            }
            return;
        }
        if (!(paragraph.getParent() instanceof ParagraphItemContainer)) {
            if (paragraph.getParent() instanceof ParagraphContainer) {
                boolean isParagraphStartWrappingDisabled = ((ParagraphContainer) paragraph.getParent()).isParagraphStartWrappingDisabled(paragraph);
                boolean isParagraphEndWrappingDisabled = ((ParagraphContainer) paragraph.getParent()).isParagraphEndWrappingDisabled(paragraph);
                if (!isParagraphStartWrappingDisabled && !isParagraphEndWrappingDisabled) {
                    FormatterUtils.renderLooseParagraph(paragraph, nodeFormatterContext, markdownWriter);
                    return;
                }
                if (!isParagraphStartWrappingDisabled) {
                    markdownWriter.blankLine();
                }
                FormatterUtils.renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
                if (isParagraphEndWrappingDisabled) {
                    return;
                }
                markdownWriter.tailBlankLine();
                return;
            }
            if (!paragraph.isTrailingBlankLine() && (paragraph.getNext() == null || (paragraph.getNext() instanceof ListBlock))) {
                FormatterUtils.renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
                return;
            } else {
                FormatterUtils.renderLooseParagraph(paragraph, nodeFormatterContext, markdownWriter);
                return;
            }
        }
        if (((ParagraphItemContainer) paragraph.getParent()).isItemParagraph(paragraph)) {
            if (this.formatterOptions.blankLinesInAst) {
                FormatterUtils.renderLooseItemParagraph(paragraph, nodeFormatterContext, markdownWriter);
                return;
            }
            ListSpacing listSpacing = FormatterUtils.LIST_ITEM_SPACING.get(nodeFormatterContext.getDocument());
            if (listSpacing == ListSpacing.TIGHT) {
                FormatterUtils.renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
                return;
            }
            if (listSpacing == ListSpacing.LOOSE) {
                if (paragraph.getParent().getNextAnyNot(BlankLine.class) == null) {
                    FormatterUtils.renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
                    return;
                } else {
                    FormatterUtils.renderLooseItemParagraph(paragraph, nodeFormatterContext, markdownWriter);
                    return;
                }
            }
            if (!((ParagraphItemContainer) paragraph.getParent()).isParagraphWrappingDisabled(paragraph, this.listOptions, nodeFormatterContext.getOptions())) {
                FormatterUtils.renderLooseItemParagraph(paragraph, nodeFormatterContext, markdownWriter);
                return;
            } else {
                FormatterUtils.renderTextBlockParagraphLines(paragraph, nodeFormatterContext, markdownWriter);
                return;
            }
        }
        FormatterUtils.renderLooseParagraph(paragraph, nodeFormatterContext, markdownWriter);
    }

    public void render(SoftLineBreak softLineBreak, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        FormatterOptions formatterOptions = this.formatterOptions;
        if (!formatterOptions.keepSoftLineBreaks && formatterOptions.rightMargin <= 0) {
            if (markdownWriter.isPendingSpace()) {
                return;
            }
            markdownWriter.append(SequenceUtils.SPC);
            return;
        }
        markdownWriter.append((CharSequence) softLineBreak.getChars());
    }

    public void render(HardLineBreak hardLineBreak, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (this.formatterOptions.keepHardLineBreaks) {
            if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.FORMAT) {
                markdownWriter.append((CharSequence) hardLineBreak.getChars());
                return;
            } else {
                markdownWriter.append((CharSequence) hardLineBreak.getChars());
                return;
            }
        }
        if (markdownWriter.isPendingSpace()) {
            return;
        }
        markdownWriter.append(SequenceUtils.SPC);
    }

    public void render(HtmlEntity htmlEntity, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.FORMAT) {
            markdownWriter.append((CharSequence) htmlEntity.getChars());
        } else {
            nodeFormatterContext.customPlaceholderFormat(htmlEntityPlaceholderGenerator, new C0914b(htmlEntity, 2));
        }
    }

    public void render(Text text, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (this.formatterOptions.keepSoftLineBreaks) {
            markdownWriter.append((CharSequence) text.getChars());
        } else {
            markdownWriter.append(FormatterUtils.stripSoftLineBreak(text.getChars(), SequenceUtils.SPACE));
        }
    }

    public void render(TextBase textBase, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        nodeFormatterContext.renderChildren(textBase);
    }

    public void render(Code code, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.append((CharSequence) code.getOpeningMarker());
        if (!nodeFormatterContext.isTransformingText()) {
            FormatterOptions formatterOptions = this.formatterOptions;
            if (formatterOptions.rightMargin != 0) {
                if (formatterOptions.keepSoftLineBreaks) {
                    markdownWriter.append((CharSequence) code.getText());
                } else {
                    markdownWriter.append(FormatterUtils.stripSoftLineBreak(code.getText(), SequenceUtils.SPACE));
                }
                markdownWriter.append((CharSequence) code.getClosingMarker());
            }
        }
        if (this.formatterOptions.keepSoftLineBreaks) {
            markdownWriter.appendNonTranslating(code.getText());
        } else {
            markdownWriter.appendNonTranslating(FormatterUtils.stripSoftLineBreak(code.getText(), SequenceUtils.SPACE));
        }
        markdownWriter.append((CharSequence) code.getClosingMarker());
    }

    public void render(HtmlBlock htmlBlock, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (htmlBlock.hasChildren()) {
            nodeFormatterContext.renderChildren(htmlBlock);
            return;
        }
        markdownWriter.blankLine();
        render((HtmlBlockBase) htmlBlock, nodeFormatterContext, markdownWriter);
        markdownWriter.tailBlankLine();
    }

    public void render(HtmlCommentBlock htmlCommentBlock, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        Pattern pattern;
        BasedSequence midSequence = htmlCommentBlock.getChars().trim().midSequence(4, -3);
        CharSequence charSequence = BasedSequence.EOL;
        if (!nodeFormatterContext.isTransformingText() && (pattern = this.formatterOptions.linkMarkerCommentPattern) != null && pattern.matcher(midSequence).matches()) {
            if (htmlCommentBlock.getPrevious() instanceof Reference) {
                return;
            }
            ((MarkdownWriter) markdownWriter.append("<!--")).append((CharSequence) String.valueOf(midSequence.toMapped(SpaceMapper.toNonBreakSpace))).append((CharSequence) "-->");
            return;
        }
        markdownWriter.appendTranslating("<!--", midSequence, "-->", charSequence);
    }

    public void render(HtmlBlockBase htmlBlockBase, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[nodeFormatterContext.getRenderPurpose().ordinal()];
        if (i6 == 1 || i6 == 2) {
            markdownWriter.appendNonTranslating(this.myHtmlBlockPrefix, htmlBlockBase.getChars().trimEOL(), ">", htmlBlockBase.getChars().trimmedEOL());
            return;
        }
        if (i6 != 3) {
            markdownWriter.openPreFormatted(true);
            if (htmlBlockBase.getSpanningChars().equals(htmlBlockBase.getChars())) {
                Iterator<BasedSequence> it = htmlBlockBase.getContentLines().iterator();
                while (it.hasNext()) {
                    markdownWriter.append((CharSequence) it.next());
                }
            } else {
                markdownWriter.append((CharSequence) htmlBlockBase.getChars());
            }
            markdownWriter.line().closePreFormatted();
            return;
        }
        markdownWriter.openPreFormatted(true);
        markdownWriter.appendNonTranslating(htmlBlockBase.getChars());
        markdownWriter.closePreFormatted();
    }

    public void render(HtmlInnerBlockComment htmlInnerBlockComment, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        Pattern pattern;
        BasedSequence midSequence = htmlInnerBlockComment.getChars().trim().midSequence(4, -3);
        if (!nodeFormatterContext.isTransformingText() && (pattern = this.formatterOptions.linkMarkerCommentPattern) != null && pattern.matcher(midSequence).matches()) {
            if (htmlInnerBlockComment.getPrevious() instanceof Reference) {
                return;
            }
            ((MarkdownWriter) markdownWriter.append("<!--")).append((CharSequence) String.valueOf(midSequence.toMapped(SpaceMapper.toNonBreakSpace))).append((CharSequence) "-->");
            return;
        }
        markdownWriter.appendTranslating("<!--", midSequence, "-->");
    }

    public void render(HtmlInline htmlInline, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[nodeFormatterContext.getRenderPurpose().ordinal()];
        if (i6 == 1 || i6 == 2) {
            markdownWriter.appendNonTranslating(e.n(htmlInline.getChars().startsWith("</") ? "</" : "<", this.myHtmlInlinePrefix), htmlInline.getChars(), ">");
        } else if (i6 != 3) {
            markdownWriter.append((CharSequence) htmlInline.getChars());
        } else {
            markdownWriter.appendNonTranslating(htmlInline.getChars());
        }
    }

    public void render(HtmlInlineComment htmlInlineComment, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        Pattern pattern;
        BasedSequence midSequence = htmlInlineComment.getChars().trim().midSequence(4, -3);
        if (!nodeFormatterContext.isTransformingText() && (pattern = this.formatterOptions.linkMarkerCommentPattern) != null && pattern.matcher(midSequence).matches()) {
            ((MarkdownWriter) markdownWriter.append("<!--")).append((CharSequence) String.valueOf(midSequence.toMapped(SpaceMapper.toNonBreakSpace))).append((CharSequence) "-->");
        } else {
            markdownWriter.appendTranslating("<!--", midSequence, "-->");
        }
    }

    public void render(Reference reference, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        renderReference(reference, nodeFormatterContext, markdownWriter);
    }

    public void render(AutoLink autoLink, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        renderAutoLink(autoLink, nodeFormatterContext, markdownWriter, this.myTranslationAutolinkPrefix, null);
    }

    public void render(MailLink mailLink, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        renderAutoLink(mailLink, nodeFormatterContext, markdownWriter, this.myTranslationAutolinkPrefix, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(com.vladsch.flexmark.ast.Image r11, com.vladsch.flexmark.formatter.NodeFormatterContext r12, com.vladsch.flexmark.formatter.MarkdownWriter r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.formatter.internal.CoreNodeFormatter.render(com.vladsch.flexmark.ast.Image, com.vladsch.flexmark.formatter.NodeFormatterContext, com.vladsch.flexmark.formatter.MarkdownWriter):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void render(com.vladsch.flexmark.ast.Link r5, com.vladsch.flexmark.formatter.NodeFormatterContext r6, com.vladsch.flexmark.formatter.MarkdownWriter r7) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.formatter.internal.CoreNodeFormatter.render(com.vladsch.flexmark.ast.Link, com.vladsch.flexmark.formatter.NodeFormatterContext, com.vladsch.flexmark.formatter.MarkdownWriter):void");
    }

    public void render(ImageRef imageRef, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (this.formatterOptions.optimizedInlineRendering && !nodeFormatterContext.isTransformingText()) {
            markdownWriter.append((CharSequence) imageRef.getChars());
            return;
        }
        if (!nodeFormatterContext.isTransformingText() && this.formatterOptions.rightMargin != 0) {
            if (imageRef.isReferenceTextCombined()) {
                markdownWriter.append((CharSequence) imageRef.getReferenceOpeningMarker());
                if (imageRef.isOrDescendantOfType(Paragraph.class)) {
                    markdownWriter.append((CharSequence) imageRef.getReference().toMapped(SpaceMapper.toNonBreakSpace));
                } else {
                    markdownWriter.append((CharSequence) imageRef.getReference());
                }
                markdownWriter.append((CharSequence) imageRef.getReferenceClosingMarker());
                markdownWriter.append((CharSequence) imageRef.getTextOpeningMarker());
                markdownWriter.append((CharSequence) imageRef.getTextClosingMarker());
                return;
            }
            markdownWriter.append((CharSequence) imageRef.getTextOpeningMarker());
            nodeFormatterContext.renderChildren(imageRef);
            markdownWriter.append((CharSequence) imageRef.getTextClosingMarker());
            markdownWriter.append((CharSequence) imageRef.getReferenceOpeningMarker());
            markdownWriter.append((CharSequence) imageRef.getReference());
            markdownWriter.append((CharSequence) imageRef.getReferenceClosingMarker());
            return;
        }
        if (imageRef.isReferenceTextCombined()) {
            markdownWriter.append((CharSequence) imageRef.getReferenceOpeningMarker());
            markdownWriter.appendTranslating(imageRef.getReference());
            markdownWriter.append((CharSequence) imageRef.getReferenceClosingMarker());
            markdownWriter.append((CharSequence) imageRef.getTextOpeningMarker());
            markdownWriter.append((CharSequence) imageRef.getTextClosingMarker());
            return;
        }
        markdownWriter.append((CharSequence) imageRef.getTextOpeningMarker());
        appendReference(imageRef.getText(), nodeFormatterContext, markdownWriter);
        markdownWriter.append((CharSequence) imageRef.getTextClosingMarker());
        markdownWriter.append((CharSequence) imageRef.getReferenceOpeningMarker());
        markdownWriter.appendTranslating(imageRef.getReference());
        markdownWriter.append((CharSequence) imageRef.getReferenceClosingMarker());
    }

    public void render(LinkRef linkRef, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (this.formatterOptions.optimizedInlineRendering && !nodeFormatterContext.isTransformingText()) {
            markdownWriter.append((CharSequence) linkRef.getChars());
            return;
        }
        if (!nodeFormatterContext.isTransformingText() && this.formatterOptions.rightMargin != 0) {
            if (linkRef.isReferenceTextCombined()) {
                markdownWriter.append((CharSequence) linkRef.getReferenceOpeningMarker());
                if (linkRef.isOrDescendantOfType(Paragraph.class)) {
                    markdownWriter.append((CharSequence) linkRef.getReference().toMapped(SpaceMapper.toNonBreakSpace));
                } else {
                    markdownWriter.append((CharSequence) linkRef.getReference());
                }
                markdownWriter.append((CharSequence) linkRef.getReferenceClosingMarker());
                markdownWriter.append((CharSequence) linkRef.getTextOpeningMarker());
                markdownWriter.append((CharSequence) linkRef.getTextClosingMarker());
                return;
            }
            markdownWriter.append((CharSequence) linkRef.getTextOpeningMarker());
            nodeFormatterContext.renderChildren(linkRef);
            markdownWriter.append((CharSequence) linkRef.getTextClosingMarker());
            markdownWriter.append((CharSequence) linkRef.getReferenceOpeningMarker());
            markdownWriter.append((CharSequence) linkRef.getReference());
            markdownWriter.append((CharSequence) linkRef.getReferenceClosingMarker());
            return;
        }
        if (linkRef.isReferenceTextCombined()) {
            markdownWriter.append((CharSequence) linkRef.getReferenceOpeningMarker());
            FormatterUtils.appendWhiteSpaceBetween(markdownWriter, linkRef.getReferenceOpeningMarker(), linkRef.getReference(), true, false, false);
            appendReference(linkRef.getReference(), nodeFormatterContext, markdownWriter);
            markdownWriter.append((CharSequence) linkRef.getReferenceClosingMarker());
            markdownWriter.append((CharSequence) linkRef.getTextOpeningMarker());
            markdownWriter.append((CharSequence) linkRef.getTextClosingMarker());
            return;
        }
        markdownWriter.append((CharSequence) linkRef.getTextOpeningMarker());
        if (nodeFormatterContext.isTransformingText() && linkRef.getFirstChildAny(HtmlInline.class) == null) {
            appendReference(linkRef.getText(), nodeFormatterContext, markdownWriter);
        } else {
            nodeFormatterContext.renderChildren(linkRef);
        }
        markdownWriter.append((CharSequence) linkRef.getTextClosingMarker());
        markdownWriter.append((CharSequence) linkRef.getReferenceOpeningMarker());
        FormatterUtils.appendWhiteSpaceBetween(markdownWriter, linkRef.getReferenceOpeningMarker(), linkRef.getReference(), true, false, false);
        markdownWriter.appendTranslating(linkRef.getReference());
        markdownWriter.append((CharSequence) linkRef.getReferenceClosingMarker());
    }
}
