package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.html.renderer.HeaderIdGeneratorFactory;
import com.vladsch.flexmark.html.renderer.LinkStatus;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.builder.BuilderBase;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.DataSet;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.ScopedDataSet;
import com.vladsch.flexmark.util.dependency.DependencyResolver;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.format.options.TableCaptionHandling;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.html.MutableAttributes;
import com.vladsch.flexmark.util.misc.Extension;
import com.vladsch.flexmark.util.misc.Ref;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.LineAppendableImpl;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.StringSequenceBuilder;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

/* loaded from: classes.dex */
public class FlexmarkHtmlConverter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String ABBR_NODE = "abbr";
    public static final DataKey<Boolean> ADD_TRAILING_EOL;
    public static final String ASIDE_NODE = "aside";
    public static final String A_NODE = "a";
    public static final String BLOCKQUOTE_NODE = "blockquote";
    public static final DataKey<Boolean> BR_AS_EXTRA_BLANK_LINES;
    public static final DataKey<Boolean> BR_AS_PARA_BREAKS;
    public static final String BR_NODE = "br";
    public static final String B_NODE = "b";
    public static final String CAPTION_NODE = "caption";
    public static final DataKey<String> CODE_INDENT;
    public static final String CODE_NODE = "code";
    public static final String COMMENT_NODE = "#comment";
    public static final DataKey<Boolean> COMMENT_ORIGINAL_NON_NUMERIC_LIST_ITEM;
    public static final String DD_NODE = "dd";
    public static final String DEFAULT_NODE = "";
    public static final DataKey<Integer> DEFINITION_MARKER_SPACES;
    public static final String DEL_NODE = "del";
    public static final DataKey<Boolean> DIV_AS_PARAGRAPH;
    public static final String DIV_NODE = "div";
    public static final DataKey<String[]> DIV_TABLE_CELL_CLASSES;
    public static final DataKey<String[]> DIV_TABLE_HDR_CLASSES;
    public static final DataKey<Boolean> DIV_TABLE_PROCESSING;
    public static final DataKey<String[]> DIV_TABLE_ROW_CLASSES;
    public static final String DL_NODE = "dl";
    public static final DataKey<Boolean> DOT_ONLY_NUMERIC_LISTS;
    public static final String DT_NODE = "dt";
    public static final DataKey<Boolean> DUMP_HTML_TREE;
    public static final String EMOJI_NODE = "g-emoji";
    public static final String EM_NODE = "em";
    public static final DataKey<String> EOL_IN_TITLE_ATTRIBUTE;
    public static String[] EXPLICIT_LINK_TEXT_TAGS = null;
    public static final DataKey<Boolean> EXTRACT_AUTO_LINKS;
    public static final DataKey<ExtensionConversion> EXT_INLINE_CODE;
    public static final DataKey<ExtensionConversion> EXT_INLINE_DEL;
    public static final DataKey<ExtensionConversion> EXT_INLINE_EMPHASIS;
    public static final DataKey<LinkConversion> EXT_INLINE_IMAGE;
    public static final DataKey<ExtensionConversion> EXT_INLINE_INS;
    public static final DataKey<LinkConversion> EXT_INLINE_LINK;
    public static final DataKey<ExtensionConversion> EXT_INLINE_STRONG;
    public static final DataKey<ExtensionConversion> EXT_INLINE_SUB;
    public static final DataKey<ExtensionConversion> EXT_INLINE_SUP;
    public static final DataKey<ExtensionConversion> EXT_MATH;
    public static final DataKey<ExtensionConversion> EXT_TABLES;
    public static final DataKey<Ref<Document>> FOR_DOCUMENT;
    public static final String H1_NODE = "h1";
    public static final String H2_NODE = "h2";
    public static final String H3_NODE = "h3";
    public static final String H4_NODE = "h4";
    public static final String H5_NODE = "h5";
    public static final String H6_NODE = "h6";
    public static final String[] HEADING_NODES;
    public static final String HR_NODE = "hr";
    public static final DataKey<Boolean> IGNORE_TABLE_HEADING_AFTER_ROWS;
    public static final String IMG_NODE = "img";
    public static final String INPUT_NODE = "input";
    public static final String INS_NODE = "ins";
    public static final String I_NODE = "i";
    public static final DataKey<Boolean> LISTS_END_ON_DOUBLE_BLANK;
    public static final DataKey<Boolean> LIST_CONTENT_INDENT;
    public static final DataKey<Integer> LIST_ITEM_INDENT;
    public static final String LI_NODE = "li";
    public static final String MATH_NODE = "math";
    public static final DataKey<Integer> MIN_SETEXT_HEADING_MARKER_LENGTH;
    public static final DataKey<String> NBSP_TEXT;
    public static final Iterable<Node> NULL_ITERABLE;
    private static final Iterator<Node> NULL_ITERATOR;
    public static final String OL_NODE = "ol";
    public static final DataKey<Character> ORDERED_LIST_DELIMITER;
    public static final DataKey<Boolean> OUTPUT_ATTRIBUTES_ID;
    public static final DataKey<String> OUTPUT_ATTRIBUTES_NAMES_REGEX;
    public static final DataKey<String> OUTPUT_ID_ATTRIBUTE_REGEX;
    public static final DataKey<Boolean> OUTPUT_UNKNOWN_TAGS;
    public static final DataKey<Boolean> PRE_CODE_PRESERVE_EMPHASIS;
    public static final String PRE_NODE = "pre";
    public static final String P_NODE = "p";
    public static final DataKey<Boolean> RENDER_COMMENTS;
    public static final DataKey<Boolean> SETEXT_HEADINGS;
    public static final DataKey<Boolean> SKIP_ATTRIBUTES;
    public static final DataKey<Boolean> SKIP_CHAR_ESCAPE;
    public static final DataKey<Boolean> SKIP_FENCED_CODE;
    public static final DataKey<Boolean> SKIP_HEADING_1;
    public static final DataKey<Boolean> SKIP_HEADING_2;
    public static final DataKey<Boolean> SKIP_HEADING_3;
    public static final DataKey<Boolean> SKIP_HEADING_4;
    public static final DataKey<Boolean> SKIP_HEADING_5;
    public static final DataKey<Boolean> SKIP_HEADING_6;
    public static final String SPAN_NODE = "span";
    static final Map<String, String> SPECIAL_CHARS_MAP;
    public static final String STRIKE_NODE = "strike";
    public static final String STRONG_NODE = "strong";
    public static final String SUB_NODE = "sub";
    public static final String SUP_NODE = "sup";
    public static final String SVG_NODE = "svg";

    @Deprecated
    public static final DataKey<TableCaptionHandling> TABLE_CAPTION;
    private static final Map<Object, CellAlignment> TABLE_CELL_ALIGNMENTS;
    public static final DataKey<Map<Object, CellAlignment>> TABLE_CELL_ALIGNMENT_MAP;

    @Deprecated
    public static final DataKey<Boolean> TABLE_LEAD_TRAIL_PIPES;

    @Deprecated
    public static final DataKey<Integer> TABLE_MIN_SEPARATOR_COLUMN_WIDTH;

    @Deprecated
    public static final DataKey<Integer> TABLE_MIN_SEPARATOR_DASHES;
    public static final String TABLE_NODE = "table";

    @Deprecated
    public static final DataKey<Boolean> TABLE_SPACE_AROUND_PIPES;
    public static final String TBODY_NODE = "tbody";
    public static final String TD_NODE = "td";
    public static final String TEXT_NODE = "#text";
    public static final String THEAD_NODE = "thead";
    public static final DataKey<String> THEMATIC_BREAK;
    public static final String TH_NODE = "th";
    public static final String TR_NODE = "tr";
    public static final DataKey<Boolean> TYPOGRAPHIC_QUOTES;
    private static final String TYPOGRAPHIC_QUOTES_PIPED = "“|”|‘|’|«|»|&ldquo;|&rdquo;|&lsquo;|&rsquo;|&apos;|&laquo;|&raquo;";
    public static final DataKey<Map<String, String>> TYPOGRAPHIC_REPLACEMENT_MAP;
    public static final DataKey<Boolean> TYPOGRAPHIC_SMARTS;
    private static final String TYPOGRAPHIC_SMARTS_PIPED = "…|–|—|&hellip;|&endash;|&emdash;";
    public static final String UL_NODE = "ul";
    public static final DataKey<BiFunction<String, Integer, String>> UNIQUE_LINK_REF_ID_GENERATOR;
    public static final DataKey<Character> UNORDERED_LIST_DELIMITER;
    public static final DataKey<String[]> UNWRAPPED_TAGS;
    public static final String U_NODE = "u";
    public static final DataKey<String[]> WRAPPED_TAGS;
    public static final DataKey<Boolean> WRAP_AUTO_LINKS;
    final HtmlConverterOptions htmlConverterOptions;
    final List<HtmlLinkResolverFactory> linkResolverFactories;
    final List<DelegatingNodeRendererFactoryWrapper> nodeRendererFactories;
    private final DataHolder options;
    public static final DataKey<Integer> FORMAT_FLAGS = new DataKey<>("FORMAT_FLAGS", Integer.valueOf((((LineAppendable.F_TRIM_TRAILING_WHITESPACE | LineAppendable.F_TRIM_LEADING_WHITESPACE) | LineAppendable.F_COLLAPSE_WHITESPACE) | LineAppendable.F_TRIM_LEADING_EOL) | LineAppendable.F_PREFIX_PRE_FORMATTED));
    public static final DataKey<Integer> MAX_BLANK_LINES = new DataKey<>("MAX_BLANK_LINES", 2);
    public static final DataKey<Integer> MAX_TRAILING_BLANK_LINES = new DataKey<>("MAX_TRAILING_BLANK_LINES", 1);

    /* loaded from: classes.dex */
    public static class Builder extends BuilderBase<Builder> {
        HeaderIdGeneratorFactory htmlIdGeneratorFactory;
        List<HtmlLinkResolverFactory> linkResolverFactories;
        List<HtmlNodeRendererFactory> nodeRendererFactories;

        public Builder() {
            this.nodeRendererFactories = new ArrayList();
            this.linkResolverFactories = new ArrayList();
            this.htmlIdGeneratorFactory = null;
        }

        public Builder htmlNodeRendererFactory(HtmlNodeRendererFactory htmlNodeRendererFactory) {
            this.nodeRendererFactories.add(htmlNodeRendererFactory);
            return this;
        }

        public Builder linkResolverFactory(HtmlLinkResolverFactory htmlLinkResolverFactory) {
            this.linkResolverFactories.add(htmlLinkResolverFactory);
            addExtensionApiPoint(htmlLinkResolverFactory);
            return this;
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public boolean loadExtension(Extension extension) {
            if (!(extension instanceof HtmlConverterExtension)) {
                return false;
            }
            ((HtmlConverterExtension) extension).extend(this);
            return true;
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public void preloadExtension(Extension extension) {
            if (extension instanceof HtmlConverterExtension) {
                ((HtmlConverterExtension) extension).rendererOptions(this);
            }
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public void removeApiPoint(Object obj) {
            if (obj instanceof HtmlNodeRendererFactory) {
                this.nodeRendererFactories.remove(obj);
            } else if (obj instanceof HtmlLinkResolverFactory) {
                this.linkResolverFactories.remove(obj);
            } else {
                if (!(obj instanceof HeaderIdGeneratorFactory)) {
                    throw new IllegalStateException("Unknown data point type: ".concat(obj.getClass().getName()));
                }
                this.htmlIdGeneratorFactory = null;
            }
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public FlexmarkHtmlConverter build() {
            return new FlexmarkHtmlConverter(this);
        }

        public Builder(DataHolder dataHolder) {
            super(dataHolder);
            this.nodeRendererFactories = new ArrayList();
            this.linkResolverFactories = new ArrayList();
            this.htmlIdGeneratorFactory = null;
            loadExtensions();
        }
    }

    /* loaded from: classes.dex */
    public abstract class HtmlConverterExtension implements Extension,   {
        void extend(Builder builder);

        void rendererOptions(MutableDataHolder mutableDataHolder);
    }

    /* loaded from: classes.dex */
    public class MainHtmlConverter extends HtmlNodeConverterSubContext {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final org.jsoup.nodes.Document document;
        private final HashSet<Reference> myExternalReferences;
        private final Document myForDocument;
        private final HtmlConverterOptions myHtmlConverterOptions;
        private final HtmlLinkResolver[] myHtmlLinkResolvers;
        private boolean myInlineCode;
        private final DataHolder myOptions;
        private Parser myParser;
        private final HashMap<String, Reference> myReferenceIdToReferenceMap;
        private final HashMap<String, Reference> myReferenceUrlToReferenceMap;
        private final Map<String, String> mySpecialCharsMap;
        private HtmlConverterState myState;
        private final Stack<HtmlConverterState> myStateStack;
        private boolean myTrace;
        private HtmlConverterPhase phase;
        private final List<PhasedHtmlNodeRenderer> phasedFormatters;
        private final Map<String, HtmlNodeRendererHandler<?>> renderers;
        private final Set<HtmlConverterPhase> renderingPhases;
        private final Pattern specialCharsPattern;

        /* loaded from: classes.dex */
        public class SubHtmlNodeConverter extends HtmlNodeConverterSubContext implements HtmlNodeConverterContext {
            private final MainHtmlConverter myMainNodeRenderer;
            private final DataHolder myOptions;

            public SubHtmlNodeConverter(MainHtmlConverter mainHtmlConverter, HtmlMarkdownWriter htmlMarkdownWriter, DataHolder dataHolder) {
                super(htmlMarkdownWriter);
                this.myMainNodeRenderer = mainHtmlConverter;
                this.myOptions = (dataHolder == null || dataHolder == mainHtmlConverter.getOptions()) ? mainHtmlConverter.getOptions() : new ScopedDataSet(mainHtmlConverter.getOptions(), dataHolder);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void appendOuterHtml(Node node) {
                FlexmarkHtmlConverter.appendOuterHtml(this, node);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void delegateRender() {
                this.myMainNodeRenderer.renderByPreviousHandler(this);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public String escapeSpecialChars(String str) {
                return this.myMainNodeRenderer.escapeSpecialChars(str);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void excludeAttributes(String... strArr) {
                this.myMainNodeRenderer.excludeAttributes(strArr);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public org.jsoup.nodes.Document getDocument() {
                return this.myMainNodeRenderer.getDocument();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public HashSet<Reference> getExternalReferences() {
                return this.myMainNodeRenderer.getExternalReferences();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Document getForDocument() {
                return this.myMainNodeRenderer.getForDocument();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public HtmlConverterPhase getFormattingPhase() {
                return this.myMainNodeRenderer.getFormattingPhase();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public HtmlConverterOptions getHtmlConverterOptions() {
                return this.myMainNodeRenderer.getHtmlConverterOptions();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext, com.vladsch.flexmark.html.renderer.LinkResolverBasicContext
            public DataHolder getOptions() {
                return this.myOptions;
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Reference getOrCreateReference(String str, String str2, String str3) {
                return this.myMainNodeRenderer.getOrCreateReference(str, str2, str3);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public HashMap<String, Reference> getReferenceIdToReferenceMap() {
                return this.myMainNodeRenderer.getReferenceIdToReferenceMap();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public HashMap<String, Reference> getReferenceUrlToReferenceMap() {
                return this.myMainNodeRenderer.getReferenceUrlToReferenceMap();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public HtmlConverterState getState() {
                return this.myMainNodeRenderer.getState();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Stack<HtmlConverterState> getStateStack() {
                return this.myMainNodeRenderer.getStateStack();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void inlineCode(Runnable runnable) {
                this.myMainNodeRenderer.inlineCode(runnable);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public boolean isInlineCode() {
                return this.myMainNodeRenderer.isInlineCode();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public boolean isTrace() {
                return this.myMainNodeRenderer.isTrace();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Node next() {
                return this.myMainNodeRenderer.next();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public int outputAttributes(LineAppendable lineAppendable, String str) {
                return this.myMainNodeRenderer.outputAttributes(lineAppendable, str);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public com.vladsch.flexmark.util.ast.Node parseMarkdown(String str) {
                return this.myMainNodeRenderer.parseMarkdown(str);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Node peek() {
                return this.myMainNodeRenderer.peek();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void popState(LineAppendable lineAppendable) {
                this.myMainNodeRenderer.popState(lineAppendable);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public String prepareText(String str) {
                return this.myMainNodeRenderer.prepareText(str);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processAttributes(Node node) {
                this.myMainNodeRenderer.processAttributes(node);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processConditional(ExtensionConversion extensionConversion, Node node, Runnable runnable) {
                FlexmarkHtmlConverter.processConditional(this, extensionConversion, node, runnable);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public String processTextNodes(Node node) {
                return this.myMainNodeRenderer.processTextNodes(node);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processUnwrapped(Node node) {
                this.myMainNodeRenderer.processUnwrapped(this, node);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processWrapped(Node node, Boolean bool, boolean z5) {
                FlexmarkHtmlConverter.processWrapped(this, node, bool, z5);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void pushState(Node node) {
                this.myMainNodeRenderer.pushState(node);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void render(Node node) {
                this.myMainNodeRenderer.renderNode(node, this);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void renderChildren(Node node, boolean z5, Runnable runnable) {
                FlexmarkHtmlConverter.processHtmlTree(this, node, z5, runnable);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void renderDefault(Node node) {
                FlexmarkHtmlConverter.processDefault(this, node, getHtmlConverterOptions().outputUnknownTags);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Boolean bool) {
                return this.myMainNodeRenderer.resolveLink(linkType, charSequence, bool);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void setInlineCode(boolean z5) {
                this.myMainNodeRenderer.setInlineCode(z5);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void setTrace(boolean z5) {
                this.myMainNodeRenderer.setTrace(z5);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void skip() {
                this.myMainNodeRenderer.skip();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void transferIdToParent() {
                this.myMainNodeRenderer.transferIdToParent();
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void transferToParentExcept(String... strArr) {
                this.myMainNodeRenderer.transferToParentExcept(strArr);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void transferToParentOnly(String... strArr) {
                this.myMainNodeRenderer.transferToParentOnly(strArr);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void wrapTextNodes(Node node, CharSequence charSequence, boolean z5) {
                FlexmarkHtmlConverter.wrapTextNodes(this, node, charSequence, z5);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext
            public Node getCurrentNode() {
                return this.myRenderingNode;
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Node next(int i6) {
                return this.myMainNodeRenderer.next(i6);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public Node peek(int i6) {
                return this.myMainNodeRenderer.peek(i6);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public String prepareText(String str, boolean z5) {
                return this.myMainNodeRenderer.prepareText(str, z5);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processTextNodes(Node node, boolean z5) {
                processTextNodes(node, z5, null, null);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Attributes attributes, Boolean bool) {
                return this.myMainNodeRenderer.resolveLink(linkType, charSequence, attributes, bool);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void skip(int i6) {
                this.myMainNodeRenderer.skip(i6);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
            public /* bridge */ /* synthetic */ HtmlNodeConverterContext getSubContext(DataHolder dataHolder, ISequenceBuilder iSequenceBuilder) {
                return getSubContext(dataHolder, (ISequenceBuilder<?, ?>) iSequenceBuilder);
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processTextNodes(Node node, boolean z5, CharSequence charSequence) {
                processTextNodes(node, z5, charSequence, charSequence);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
            public HtmlNodeConverterContext getSubContext() {
                return getSubContext(this.myOptions, (ISequenceBuilder<?, ?>) StringSequenceBuilder.emptyBuilder());
            }

            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
            public void processTextNodes(Node node, boolean z5, CharSequence charSequence, CharSequence charSequence2) {
                FlexmarkHtmlConverter.processTextNodes(this, node, z5, charSequence, charSequence2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
            public HtmlNodeConverterContext getSubContext(DataHolder dataHolder) {
                return getSubContext(dataHolder, (ISequenceBuilder<?, ?>) StringSequenceBuilder.emptyBuilder());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
            public HtmlNodeConverterContext getSubContext(DataHolder dataHolder, ISequenceBuilder<?, ?> iSequenceBuilder) {
                HtmlMarkdownWriter htmlMarkdownWriter = new HtmlMarkdownWriter(iSequenceBuilder, this.markdown.getOptions());
                htmlMarkdownWriter.setContext(this);
                return new SubHtmlNodeConverter(this.myMainNodeRenderer, htmlMarkdownWriter, (dataHolder == null || dataHolder == this.myOptions) ? this.myOptions : new ScopedDataSet(this.myOptions, dataHolder));
            }
        }

        public MainHtmlConverter(DataHolder dataHolder, HtmlMarkdownWriter htmlMarkdownWriter, org.jsoup.nodes.Document document, DataHolder dataHolder2) {
            super(htmlMarkdownWriter);
            this.myParser = null;
            ScopedDataSet scopedDataSet = new ScopedDataSet(dataHolder2, dataHolder);
            this.myOptions = scopedDataSet;
            this.renderers = new HashMap(32);
            this.renderingPhases = new HashSet(HtmlConverterPhase.values().length);
            this.phasedFormatters = new ArrayList(FlexmarkHtmlConverter.this.nodeRendererFactories.size());
            this.myHtmlLinkResolvers = new HtmlLinkResolver[FlexmarkHtmlConverter.this.linkResolverFactories.size()];
            htmlMarkdownWriter.setContext(this);
            HtmlConverterOptions htmlConverterOptions = new HtmlConverterOptions(scopedDataSet);
            this.myHtmlConverterOptions = htmlConverterOptions;
            boolean z5 = htmlConverterOptions.typographicQuotes;
            if (z5 && htmlConverterOptions.typographicSmarts) {
                this.specialCharsPattern = Pattern.compile("“|”|‘|’|«|»|&ldquo;|&rdquo;|&lsquo;|&rsquo;|&apos;|&laquo;|&raquo;|…|–|—|&hellip;|&endash;|&emdash;");
            } else if (z5) {
                this.specialCharsPattern = Pattern.compile(FlexmarkHtmlConverter.TYPOGRAPHIC_QUOTES_PIPED);
            } else if (htmlConverterOptions.typographicSmarts) {
                this.specialCharsPattern = Pattern.compile(FlexmarkHtmlConverter.TYPOGRAPHIC_SMARTS_PIPED);
            } else {
                this.specialCharsPattern = null;
            }
            this.myStateStack = new Stack<>();
            this.myReferenceUrlToReferenceMap = new HashMap<>();
            this.myReferenceIdToReferenceMap = new HashMap<>();
            this.myExternalReferences = new HashSet<>();
            this.myState = null;
            Map<String, String> map = FlexmarkHtmlConverter.TYPOGRAPHIC_REPLACEMENT_MAP.get(scopedDataSet);
            if (map.isEmpty()) {
                this.mySpecialCharsMap = FlexmarkHtmlConverter.SPECIAL_CHARS_MAP;
            } else {
                this.mySpecialCharsMap = map;
            }
            for (int size = FlexmarkHtmlConverter.this.nodeRendererFactories.size() - 1; size >= 0; size--) {
                HtmlNodeRenderer apply = FlexmarkHtmlConverter.this.nodeRendererFactories.get(size).apply(this.myOptions);
                Set<HtmlNodeRendererHandler<?>> htmlNodeRendererHandlers = apply.getHtmlNodeRendererHandlers();
                if (htmlNodeRendererHandlers != null) {
                    for (HtmlNodeRendererHandler<?> htmlNodeRendererHandler : htmlNodeRendererHandlers) {
                        this.renderers.put(htmlNodeRendererHandler.getTagName(), htmlNodeRendererHandler);
                    }
                    if (apply instanceof PhasedHtmlNodeRenderer) {
                        PhasedHtmlNodeRenderer phasedHtmlNodeRenderer = (PhasedHtmlNodeRenderer) apply;
                        Set<HtmlConverterPhase> htmlConverterPhases = phasedHtmlNodeRenderer.getHtmlConverterPhases();
                        if (htmlConverterPhases == null) {
                            throw new IllegalStateException("PhasedNodeFormatter with null Phases");
                        }
                        if (htmlConverterPhases.isEmpty()) {
                            throw new IllegalStateException("PhasedNodeFormatter with empty Phases");
                        }
                        this.renderingPhases.addAll(htmlConverterPhases);
                        this.phasedFormatters.add(phasedHtmlNodeRenderer);
                    } else {
                        continue;
                    }
                }
            }
            for (int i6 = 0; i6 < FlexmarkHtmlConverter.this.linkResolverFactories.size(); i6++) {
                this.myHtmlLinkResolvers[i6] = FlexmarkHtmlConverter.this.linkResolverFactories.get(i6).apply((HtmlNodeConverterContext) this);
            }
            this.document = document;
            this.myForDocument = FlexmarkHtmlConverter.FOR_DOCUMENT.get(dataHolder).value;
        }

        private String dumpState() {
            if (this.myStateStack.isEmpty()) {
                return FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            StringBuilder sb = new StringBuilder();
            while (!this.myStateStack.isEmpty()) {
                HtmlConverterState pop = this.myStateStack.pop();
                sb.append(SequenceUtils.EOL);
                sb.append(pop == null ? "null" : pop.toString());
            }
            return sb.toString();
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void appendOuterHtml(Node node) {
            FlexmarkHtmlConverter.appendOuterHtml(this, node);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void delegateRender() {
            renderByPreviousHandler(this);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public String escapeSpecialChars(String str) {
            return !this.myHtmlConverterOptions.skipCharEscape ? str.replace("\\", "\\\\").replace("*", "\\*").replace("~", "\\~").replace("^", "\\^").replace("&", "\\&").replace("<", "\\<").replace(">", "\\>").replace("[", "\\[").replace("]", "\\]").replace("|", "\\|").replace("`", "\\`").replace(" ", this.myHtmlConverterOptions.nbspText) : str;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void excludeAttributes(String... strArr) {
            for (String str : strArr) {
                this.myState.myAttributes.remove(str);
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public org.jsoup.nodes.Document getDocument() {
            return this.document;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public HashSet<Reference> getExternalReferences() {
            return this.myExternalReferences;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Document getForDocument() {
            return this.myForDocument;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public HtmlConverterPhase getFormattingPhase() {
            return this.phase;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public HtmlConverterOptions getHtmlConverterOptions() {
            return FlexmarkHtmlConverter.this.htmlConverterOptions;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext, com.vladsch.flexmark.html.renderer.LinkResolverBasicContext
        public DataHolder getOptions() {
            return this.myOptions;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Reference getOrCreateReference(String str, String str2, String str3) {
            String apply;
            Reference reference = this.myReferenceUrlToReferenceMap.get(str);
            if (reference != null) {
                if (str3 != null && !str3.trim().isEmpty()) {
                    if (reference.getTitle().isBlank()) {
                        reference.setTitle(BasedSequence.of(str3).subSequence(0, str3.length()));
                        return reference;
                    }
                    reference.getTitle().equals(str3.trim());
                }
                return reference;
            }
            if (this.myReferenceIdToReferenceMap.containsKey(str2)) {
                int i6 = 1;
                while (true) {
                    apply = this.myHtmlConverterOptions.uniqueLinkRefIdGenerator.apply(str2, Integer.valueOf(i6));
                    if (!this.myReferenceIdToReferenceMap.containsKey(apply)) {
                        break;
                    }
                    i6++;
                }
                str2 = apply;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(str2);
            sb.append("]: ");
            sb.append(str);
            if (str3 != null && !str3.trim().isEmpty()) {
                sb.append(" '");
                sb.append(str3.replace("'", "\\'"));
                sb.append("'");
            }
            com.vladsch.flexmark.util.ast.Node firstChild = parseMarkdown(sb.toString()).getFirstChild();
            if (!(firstChild instanceof Reference)) {
                return null;
            }
            Reference reference2 = (Reference) firstChild;
            this.myReferenceUrlToReferenceMap.put(str, reference2);
            this.myReferenceIdToReferenceMap.put(str2, reference2);
            return reference2;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public HashMap<String, Reference> getReferenceIdToReferenceMap() {
            return this.myReferenceIdToReferenceMap;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public HashMap<String, Reference> getReferenceUrlToReferenceMap() {
            return this.myReferenceUrlToReferenceMap;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public HtmlConverterState getState() {
            return this.myState;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Stack<HtmlConverterState> getStateStack() {
            return this.myStateStack;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void inlineCode(Runnable runnable) {
            boolean z5 = this.myInlineCode;
            this.myInlineCode = true;
            try {
                runnable.run();
            } finally {
                this.myInlineCode = z5;
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public boolean isInlineCode() {
            return this.myInlineCode;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public boolean isTrace() {
            return this.myTrace;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Node next() {
            Node peek = peek();
            if (peek != null) {
                this.myState.myIndex++;
            }
            return peek;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public int outputAttributes(LineAppendable lineAppendable, String str) {
            MutableAttributes mutableAttributes = this.myState.myAttributes;
            int offsetWithPending = lineAppendable.offsetWithPending();
            if (!mutableAttributes.isEmpty() && !this.myHtmlConverterOptions.skipAttributes) {
                lineAppendable.append((CharSequence) str);
                lineAppendable.append("{");
                CharSequence charSequence = FlexmarkHtmlConverter.DEFAULT_NODE;
                for (String str2 : mutableAttributes.keySet()) {
                    String value = mutableAttributes.getValue(str2);
                    lineAppendable.append(charSequence);
                    if (str2.equals(Attribute.ID_ATTR) || str2.equals(Attribute.NAME_ATTR)) {
                        boolean z5 = false;
                        int i6 = 0;
                        z5 = false;
                        if (!this.myHtmlConverterOptions.outputIdAttributeRegex.isEmpty()) {
                            Matcher matcher = this.myHtmlConverterOptions.outputIdAttributeRegexPattern.matcher(value);
                            if (matcher.matches()) {
                                StringBuilder sb = new StringBuilder();
                                int groupCount = matcher.groupCount();
                                while (i6 < groupCount) {
                                    i6++;
                                    String group = matcher.group(i6);
                                    if (group != null && !group.isEmpty()) {
                                        sb.append(group);
                                    }
                                }
                                value = sb.toString().trim();
                                z5 = value.isEmpty();
                            }
                        }
                        if (!z5) {
                            lineAppendable.append("#").append((CharSequence) value);
                        }
                    } else if (str2.equals(Attribute.CLASS_ATTR)) {
                        lineAppendable.append(".").append((CharSequence) value);
                    } else {
                        lineAppendable.append((CharSequence) str2).append("=");
                        if (!value.contains("\"")) {
                            lineAppendable.append('\"').append((CharSequence) value).append('\"');
                        } else if (value.contains("'")) {
                            lineAppendable.append('\"').append((CharSequence) value.replace("\"", "\\\"")).append('\"');
                        } else {
                            lineAppendable.append('\'').append((CharSequence) value).append('\'');
                        }
                    }
                    charSequence = SequenceUtils.SPACE;
                }
                lineAppendable.append("}");
                this.myState.myAttributes.clear();
            }
            return lineAppendable.offsetWithPending() - offsetWithPending;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public com.vladsch.flexmark.util.ast.Node parseMarkdown(String str) {
            if (this.myParser == null) {
                this.myParser = Parser.builder(this.myOptions).build();
            }
            return this.myParser.parse(str);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Node peek() {
            HtmlConverterState htmlConverterState = this.myState;
            if (htmlConverterState.myIndex >= htmlConverterState.myElements.size()) {
                return null;
            }
            HtmlConverterState htmlConverterState2 = this.myState;
            return htmlConverterState2.myElements.get(htmlConverterState2.myIndex);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void popState(LineAppendable lineAppendable) {
            if (this.myStateStack.isEmpty()) {
                throw new IllegalStateException("popState with an empty stack");
            }
            if (lineAppendable != null) {
                outputAttributes(lineAppendable, FlexmarkHtmlConverter.DEFAULT_NODE);
            }
            this.myState = this.myStateStack.pop();
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public String prepareText(String str) {
            return prepareText(str, this.myInlineCode);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void processAttributes(org.jsoup.nodes.Node r8) {
            /*
                r7 = this;
                com.vladsch.flexmark.html2md.converter.HtmlConverterState r0 = r7.myState
                com.vladsch.flexmark.util.html.MutableAttributes r0 = r0.myAttributes
                com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r1 = r7.myHtmlConverterOptions
                boolean r2 = r1.outputAttributesIdAttr
                if (r2 != 0) goto L12
                java.lang.String r1 = r1.outputAttributesNamesRegex
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L89
            L12:
                org.jsoup.nodes.Attributes r8 = r8.attributes()
                com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r1 = r7.myHtmlConverterOptions
                boolean r1 = r1.outputAttributesIdAttr
                java.lang.String r2 = "name"
                java.lang.String r3 = "id"
                if (r1 == 0) goto L3d
                java.lang.String r1 = r8.get(r3)
                if (r1 == 0) goto L2c
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L30
            L2c:
                java.lang.String r1 = r8.get(r2)
            L30:
                if (r1 == 0) goto L3d
                boolean r4 = r1.isEmpty()
                if (r4 != 0) goto L3d
                r0.replaceValue(r3, r1)
                r1 = 1
                goto L3e
            L3d:
                r1 = 0
            L3e:
                com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r4 = r7.myHtmlConverterOptions
                java.lang.String r4 = r4.outputAttributesNamesRegex
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L89
                java.util.Iterator r8 = r8.iterator()
            L4c:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L89
                java.lang.Object r4 = r8.next()
                org.jsoup.nodes.Attribute r4 = (org.jsoup.nodes.Attribute) r4
                if (r1 == 0) goto L6f
                java.lang.String r5 = r4.getKey()
                boolean r5 = r5.equals(r3)
                if (r5 != 0) goto L4c
                java.lang.String r5 = r4.getKey()
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L6f
                goto L4c
            L6f:
                java.lang.String r5 = r4.getKey()
                com.vladsch.flexmark.html2md.converter.HtmlConverterOptions r6 = r7.myHtmlConverterOptions
                java.lang.String r6 = r6.outputAttributesNamesRegex
                boolean r5 = r5.matches(r6)
                if (r5 == 0) goto L4c
                java.lang.String r5 = r4.getKey()
                java.lang.String r4 = r4.getValue()
                r0.replaceValue(r5, r4)
                goto L4c
            L89:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.MainHtmlConverter.processAttributes(org.jsoup.nodes.Node):void");
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void processConditional(ExtensionConversion extensionConversion, Node node, Runnable runnable) {
            FlexmarkHtmlConverter.processConditional(this, extensionConversion, node, runnable);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void processTextNodes(Node node, boolean z5) {
            processTextNodes(node, z5, null, null);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void processUnwrapped(Node node) {
            processUnwrapped(this, node);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void processWrapped(Node node, Boolean bool, boolean z5) {
            FlexmarkHtmlConverter.processWrapped(this, node, bool, z5);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void pushState(Node node) {
            this.myStateStack.push(this.myState);
            this.myState = new HtmlConverterState(node);
            processAttributes(node);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void render(Node node) {
            renderNode(node, this);
        }

        public void renderByPreviousHandler(HtmlNodeConverterSubContext htmlNodeConverterSubContext) {
            if (htmlNodeConverterSubContext.getRenderingNode() == null) {
                throw new IllegalStateException("renderingByPreviousHandler called outside node rendering code");
            }
            NodeRenderingHandlerWrapper<?> nodeRenderingHandlerWrapper = htmlNodeConverterSubContext.renderingHandlerWrapper.myPreviousRenderingHandler;
            if (nodeRenderingHandlerWrapper != null) {
                Node renderingNode = htmlNodeConverterSubContext.getRenderingNode();
                NodeRenderingHandlerWrapper<?> nodeRenderingHandlerWrapper2 = htmlNodeConverterSubContext.renderingHandlerWrapper;
                try {
                    htmlNodeConverterSubContext.renderingHandlerWrapper = nodeRenderingHandlerWrapper;
                    nodeRenderingHandlerWrapper.myRenderingHandler.render(renderingNode, htmlNodeConverterSubContext, htmlNodeConverterSubContext.getMarkdown());
                } finally {
                    htmlNodeConverterSubContext.setRenderingNode(renderingNode);
                    htmlNodeConverterSubContext.renderingHandlerWrapper = nodeRenderingHandlerWrapper2;
                }
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void renderChildren(Node node, boolean z5, Runnable runnable) {
            FlexmarkHtmlConverter.processHtmlTree(this, node, z5, runnable);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void renderDefault(Node node) {
            FlexmarkHtmlConverter.processDefault(this, node, getHtmlConverterOptions().outputUnknownTags);
        }

        public void renderNode(Node node, HtmlNodeConverterSubContext htmlNodeConverterSubContext) {
            if (!(node instanceof org.jsoup.nodes.Document)) {
                HtmlNodeRendererHandler<?> htmlNodeRendererHandler = this.renderers.get(node.nodeName().toLowerCase());
                if (htmlNodeRendererHandler == null) {
                    htmlNodeRendererHandler = this.renderers.get(FlexmarkHtmlConverter.DEFAULT_NODE);
                }
                if (htmlNodeRendererHandler == null) {
                    throw new IllegalStateException("Core Node Formatter should implement generic empty tag renderer");
                }
                Node node2 = this.myRenderingNode;
                htmlNodeConverterSubContext.myRenderingNode = node;
                htmlNodeRendererHandler.render(node, htmlNodeConverterSubContext, htmlNodeConverterSubContext.markdown);
                htmlNodeConverterSubContext.myRenderingNode = node2;
                return;
            }
            for (HtmlConverterPhase htmlConverterPhase : HtmlConverterPhase.values()) {
                HtmlConverterPhase htmlConverterPhase2 = HtmlConverterPhase.DOCUMENT;
                if (htmlConverterPhase == htmlConverterPhase2 || this.renderingPhases.contains(htmlConverterPhase)) {
                    this.phase = htmlConverterPhase;
                    if (htmlConverterPhase == htmlConverterPhase2) {
                        FlexmarkHtmlConverter.processHtmlTree(htmlNodeConverterSubContext, this.document.body(), false, null);
                    } else {
                        for (PhasedHtmlNodeRenderer phasedHtmlNodeRenderer : this.phasedFormatters) {
                            if (phasedHtmlNodeRenderer.getHtmlConverterPhases().contains(htmlConverterPhase)) {
                                htmlNodeConverterSubContext.myRenderingNode = node;
                                phasedHtmlNodeRenderer.renderDocument(htmlNodeConverterSubContext, htmlNodeConverterSubContext.markdown, (org.jsoup.nodes.Document) node, htmlConverterPhase);
                                htmlNodeConverterSubContext.myRenderingNode = null;
                            }
                        }
                    }
                }
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Boolean bool) {
            return resolveLink(linkType, charSequence, null, bool);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void setInlineCode(boolean z5) {
            this.myInlineCode = z5;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void setTrace(boolean z5) {
            this.myTrace = z5;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void skip() {
            if (peek() != null) {
                this.myState.myIndex++;
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void transferIdToParent() {
            HtmlConverterState peek;
            if (this.myStateStack.isEmpty()) {
                throw new IllegalStateException("transferIdToParent with an empty stack");
            }
            Attribute attribute = this.myState.myAttributes.get(Attribute.ID_ATTR);
            this.myState.myAttributes.remove(Attribute.ID_ATTR);
            if (attribute == null || attribute.getValue().isEmpty() || (peek = this.myStateStack.peek()) == null) {
                return;
            }
            peek.myAttributes.addValue(Attribute.ID_ATTR, attribute.getValue());
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void transferToParentExcept(String... strArr) {
            if (this.myStateStack.isEmpty()) {
                throw new IllegalStateException("transferIdToParent with an empty stack");
            }
            MutableAttributes mutableAttributes = new MutableAttributes(this.myState.myAttributes);
            this.myState.myAttributes.clear();
            for (String str : strArr) {
                this.myState.myAttributes.addValue(mutableAttributes.get(str));
                mutableAttributes.remove(str);
            }
            if (mutableAttributes.isEmpty()) {
                return;
            }
            HtmlConverterState peek = this.myStateStack.peek();
            Iterator<String> it = mutableAttributes.keySet().iterator();
            while (it.hasNext()) {
                peek.myAttributes.addValue(mutableAttributes.get(it.next()));
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void transferToParentOnly(String... strArr) {
            if (this.myStateStack.isEmpty()) {
                throw new IllegalStateException("transferIdToParent with an empty stack");
            }
            MutableAttributes mutableAttributes = new MutableAttributes();
            for (String str : strArr) {
                Attribute attribute = this.myState.myAttributes.get(str);
                if (attribute != null) {
                    this.myState.myAttributes.remove(str);
                    mutableAttributes.addValue(attribute);
                }
            }
            if (mutableAttributes.isEmpty()) {
                return;
            }
            HtmlConverterState peek = this.myStateStack.peek();
            Iterator<String> it = mutableAttributes.keySet().iterator();
            while (it.hasNext()) {
                peek.myAttributes.addValue(mutableAttributes.get(it.next()));
            }
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void wrapTextNodes(Node node, CharSequence charSequence, boolean z5) {
            FlexmarkHtmlConverter.wrapTextNodes(this, node, charSequence, z5);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext
        public Node getCurrentNode() {
            return this.myRenderingNode;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public String prepareText(String str, boolean z5) {
            Pattern pattern = this.specialCharsPattern;
            if (pattern != null) {
                Matcher matcher = pattern.matcher(str);
                int length = str.length();
                StringBuilder sb = new StringBuilder(length * 2);
                int i6 = 0;
                while (matcher.find()) {
                    if (i6 < matcher.start()) {
                        sb.append((CharSequence) str, i6, matcher.start());
                    }
                    String group = matcher.group();
                    String str2 = this.mySpecialCharsMap.get(group);
                    if (str2 != null) {
                        sb.append(str2);
                    } else {
                        sb.append(group);
                    }
                    i6 = matcher.end();
                }
                if (i6 < length) {
                    sb.append((CharSequence) str, i6, length);
                }
                str = sb.toString();
            }
            if (!z5) {
                return escapeSpecialChars(str);
            }
            return str.replace(" ", SequenceUtils.SPACE);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void processTextNodes(Node node, boolean z5, CharSequence charSequence) {
            processTextNodes(node, z5, charSequence, charSequence);
        }

        public void processUnwrapped(HtmlNodeConverterSubContext htmlNodeConverterSubContext, Node node) {
            FlexmarkHtmlConverter.processHtmlTree(htmlNodeConverterSubContext, node, false, null);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Attributes attributes, Boolean bool) {
            String valueOf = String.valueOf(charSequence);
            ResolvedLink resolvedLink = new ResolvedLink(linkType, valueOf, attributes);
            if (!valueOf.isEmpty()) {
                Node currentNode = getCurrentNode();
                for (HtmlLinkResolver htmlLinkResolver : this.myHtmlLinkResolvers) {
                    resolvedLink = htmlLinkResolver.resolveLink(currentNode, this, resolvedLink);
                    if (resolvedLink.getStatus() != LinkStatus.UNKNOWN) {
                        return resolvedLink;
                    }
                }
            }
            return resolvedLink;
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
        public /* bridge */ /* synthetic */ HtmlNodeConverterContext getSubContext(DataHolder dataHolder, ISequenceBuilder iSequenceBuilder) {
            return getSubContext(dataHolder, (ISequenceBuilder<?, ?>) iSequenceBuilder);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Node next(int i6) {
            if (i6 > 0) {
                Node peek = peek(i6 - 1);
                if (peek != null) {
                    this.myState.myIndex += i6;
                }
                return peek;
            }
            return peek();
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public Node peek(int i6) {
            HtmlConverterState htmlConverterState = this.myState;
            int i7 = htmlConverterState.myIndex;
            if (i7 + i6 < 0 || i7 + i6 >= htmlConverterState.myElements.size()) {
                return null;
            }
            HtmlConverterState htmlConverterState2 = this.myState;
            return htmlConverterState2.myElements.get(htmlConverterState2.myIndex + i6);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void processTextNodes(Node node, boolean z5, CharSequence charSequence, CharSequence charSequence2) {
            FlexmarkHtmlConverter.processTextNodes(this, node, z5, charSequence, charSequence2);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public void skip(int i6) {
            if (i6 <= 0 || peek(i6 - 1) == null) {
                return;
            }
            this.myState.myIndex += i6;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
        public HtmlNodeConverterContext getSubContext() {
            return getSubContext((DataHolder) null);
        }

        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext
        public String processTextNodes(Node node) {
            pushState(node);
            HtmlNodeConverterContext subContext = getSubContext();
            while (true) {
                Node next = next();
                if (next != null) {
                    if (next instanceof TextNode) {
                        subContext.getMarkdown().append((CharSequence) prepareText(((TextNode) next).getWholeText()));
                    } else if (next instanceof Element) {
                        subContext.render(next);
                    }
                } else {
                    transferIdToParent();
                    popState(null);
                    return subContext.getMarkdown().toString(-1, -1);
                }
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
        public HtmlNodeConverterContext getSubContext(DataHolder dataHolder) {
            return getSubContext(dataHolder, this.markdown.getBuilder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, com.vladsch.flexmark.util.format.NodeContext
        public HtmlNodeConverterContext getSubContext(DataHolder dataHolder, ISequenceBuilder<?, ?> iSequenceBuilder) {
            HtmlMarkdownWriter htmlMarkdownWriter = new HtmlMarkdownWriter(iSequenceBuilder, this.markdown.getOptions());
            htmlMarkdownWriter.setContext(this);
            return new SubHtmlNodeConverter(this, htmlMarkdownWriter, (dataHolder == null || dataHolder == this.myOptions) ? this.myOptions : new ScopedDataSet(this.myOptions, dataHolder));
        }
    }

    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Iterable<org.jsoup.nodes.Node>, java.lang.Object] */
    {
        Boolean bool = Boolean.TRUE;
        LIST_CONTENT_INDENT = new DataKey<>("LIST_CONTENT_INDENT", bool);
        SETEXT_HEADINGS = new DataKey<>("SETEXT_HEADINGS", bool);
        Boolean bool2 = Boolean.FALSE;
        OUTPUT_UNKNOWN_TAGS = new DataKey<>("OUTPUT_UNKNOWN_TAGS", bool2);
        TYPOGRAPHIC_QUOTES = new DataKey<>("TYPOGRAPHIC_QUOTES", bool);
        TYPOGRAPHIC_SMARTS = new DataKey<>("TYPOGRAPHIC_SMARTS", bool);
        EXTRACT_AUTO_LINKS = new DataKey<>("EXTRACT_AUTO_LINKS", bool);
        OUTPUT_ATTRIBUTES_ID = new DataKey<>("OUTPUT_ATTRIBUTES_ID", bool);
        OUTPUT_ATTRIBUTES_NAMES_REGEX = new DataKey<>("OUTPUT_ATTRIBUTES_NAMES_REGEX", DEFAULT_NODE);
        WRAP_AUTO_LINKS = new DataKey<>("WRAP_AUTO_LINKS", bool);
        RENDER_COMMENTS = new DataKey<>("RENDER_COMMENTS", bool2);
        DOT_ONLY_NUMERIC_LISTS = new DataKey<>("DOT_ONLY_NUMERIC_LISTS", bool);
        COMMENT_ORIGINAL_NON_NUMERIC_LIST_ITEM = new DataKey<>("COMMENT_ORIGINAL_NON_NUMERIC_LIST_ITEM", bool2);
        PRE_CODE_PRESERVE_EMPHASIS = new DataKey<>("PRE_CODE_PRESERVE_EMPHASIS", bool2);
        ORDERED_LIST_DELIMITER = new DataKey<>("ORDERED_LIST_DELIMITER", '.');
        UNORDERED_LIST_DELIMITER = new DataKey<>("UNORDERED_LIST_DELIMITER", '*');
        DEFINITION_MARKER_SPACES = new DataKey<>("DEFINITION_MARKER_SPACES", 3);
        MIN_SETEXT_HEADING_MARKER_LENGTH = new DataKey<>("MIN_SETEXT_HEADING_MARKER_LENGTH", 3);
        LIST_ITEM_INDENT = new DataKey<>("LIST_ITEM_INDENT", 4);
        CODE_INDENT = new DataKey<>("CODE_INDENT", "    ");
        NBSP_TEXT = new DataKey<>("NBSP_TEXT", SequenceUtils.SPACE);
        EOL_IN_TITLE_ATTRIBUTE = new DataKey<>("EOL_IN_TITLE_ATTRIBUTE", SequenceUtils.SPACE);
        THEMATIC_BREAK = new DataKey<>("THEMATIC_BREAK", "*** ** * ** ***");
        UNIQUE_LINK_REF_ID_GENERATOR = new DataKey<>("UNIQUE_LINK_REF_ID_GENERATOR", new Object());
        UNWRAPPED_TAGS = new DataKey<>("UNWRAPPED_TAGS", new String[]{"article", "address", "frameset", "section", "small", "iframe"});
        WRAPPED_TAGS = new DataKey<>("WRAPPED_TAGS", new String[]{"kbd", "var"});
        OUTPUT_ID_ATTRIBUTE_REGEX = new DataKey<>("OUTPUT_ID_ATTRIBUTE_REGEX", "^user-content-(.*)$");
        TABLE_MIN_SEPARATOR_COLUMN_WIDTH = TableFormatOptions.FORMAT_TABLE_MIN_SEPARATOR_COLUMN_WIDTH;
        TABLE_MIN_SEPARATOR_DASHES = TableFormatOptions.FORMAT_TABLE_MIN_SEPARATOR_DASHES;
        TABLE_LEAD_TRAIL_PIPES = TableFormatOptions.FORMAT_TABLE_LEAD_TRAIL_PIPES;
        TABLE_SPACE_AROUND_PIPES = TableFormatOptions.FORMAT_TABLE_SPACE_AROUND_PIPES;
        TABLE_CAPTION = TableFormatOptions.FORMAT_TABLE_CAPTION;
        LISTS_END_ON_DOUBLE_BLANK = new DataKey<>("LISTS_END_ON_DOUBLE_BLANK", bool2);
        DIV_AS_PARAGRAPH = new DataKey<>("DIV_AS_PARAGRAPH", bool2);
        BR_AS_PARA_BREAKS = new DataKey<>("BR_AS_PARA_BREAKS", bool);
        BR_AS_EXTRA_BLANK_LINES = new DataKey<>("BR_AS_EXTRA_BLANK_LINES", bool);
        DIV_TABLE_PROCESSING = new DataKey<>("DIV_TABLE_PROCESSING", bool2);
        DIV_TABLE_HDR_CLASSES = new DataKey<>("DIV_TABLE_HDR_CLASSES", new String[]{"wt-data-grid__row_header"});
        DIV_TABLE_ROW_CLASSES = new DataKey<>("DIV_TABLE_ROW_CLASSES", new String[]{"wt-data-grid__row"});
        DIV_TABLE_CELL_CLASSES = new DataKey<>("DIV_TABLE_CELL_CLASSES", new String[]{"wt-data-grid__cell"});
        ADD_TRAILING_EOL = new DataKey<>("ADD_TRAILING_EOL", bool);
        SKIP_HEADING_1 = new DataKey<>("SKIP_HEADING_1", bool2);
        SKIP_HEADING_2 = new DataKey<>("SKIP_HEADING_2", bool2);
        SKIP_HEADING_3 = new DataKey<>("SKIP_HEADING_3", bool2);
        SKIP_HEADING_4 = new DataKey<>("SKIP_HEADING_4", bool2);
        SKIP_HEADING_5 = new DataKey<>("SKIP_HEADING_5", bool2);
        SKIP_HEADING_6 = new DataKey<>("SKIP_HEADING_6", bool2);
        SKIP_ATTRIBUTES = new DataKey<>("SKIP_ATTRIBUTES", bool2);
        SKIP_FENCED_CODE = new DataKey<>("SKIP_FENCED_CODE", bool2);
        SKIP_CHAR_ESCAPE = new DataKey<>("SKIP_CHAR_ESCAPE", bool2);
        ExtensionConversion extensionConversion = ExtensionConversion.MARKDOWN;
        EXT_INLINE_STRONG = new DataKey<>("EXT_INLINE_STRONG", extensionConversion);
        EXT_INLINE_EMPHASIS = new DataKey<>("EXT_INLINE_EMPHASIS", extensionConversion);
        EXT_INLINE_CODE = new DataKey<>("EXT_INLINE_CODE", extensionConversion);
        EXT_INLINE_DEL = new DataKey<>("EXT_INLINE_DEL", extensionConversion);
        EXT_INLINE_INS = new DataKey<>("EXT_INLINE_INS", extensionConversion);
        EXT_INLINE_SUB = new DataKey<>("EXT_INLINE_SUB", extensionConversion);
        EXT_INLINE_SUP = new DataKey<>("EXT_INLINE_SUP", extensionConversion);
        EXT_MATH = new DataKey<>("EXT_MATH", ExtensionConversion.HTML);
        EXT_TABLES = new DataKey<>("EXT_TABLES", extensionConversion);
        LinkConversion linkConversion = LinkConversion.MARKDOWN_EXPLICIT;
        EXT_INLINE_LINK = new DataKey<>("EXT_INLINE_LINK", linkConversion);
        EXT_INLINE_IMAGE = new DataKey<>("EXT_INLINE_IMAGE", linkConversion);
        FOR_DOCUMENT = new DataKey<>("FOR_DOCUMENT", new Ref(null));
        TYPOGRAPHIC_REPLACEMENT_MAP = new DataKey<>("TYPOGRAPHIC_REPLACEMENT_MAP", new HashMap());
        DUMP_HTML_TREE = new DataKey<>("DUMP_HTML_TREE", bool2);
        IGNORE_TABLE_HEADING_AFTER_ROWS = new DataKey<>("IGNORE_TABLE_HEADING_AFTER_ROWS", bool);
        HEADING_NODES = new String[]{H1_NODE, H2_NODE, H3_NODE, H4_NODE, H5_NODE, H6_NODE};
        EXPLICIT_LINK_TEXT_TAGS = new String[]{IMG_NODE};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TABLE_CELL_ALIGNMENTS = linkedHashMap;
        Pattern compile = Pattern.compile("\\bleft\\b");
        CellAlignment cellAlignment = CellAlignment.LEFT;
        linkedHashMap.put(compile, cellAlignment);
        Pattern compile2 = Pattern.compile("\\bcenter\\b");
        CellAlignment cellAlignment2 = CellAlignment.CENTER;
        linkedHashMap.put(compile2, cellAlignment2);
        Pattern compile3 = Pattern.compile("\\bright\\b");
        CellAlignment cellAlignment3 = CellAlignment.RIGHT;
        linkedHashMap.put(compile3, cellAlignment3);
        linkedHashMap.put("text-left", cellAlignment);
        linkedHashMap.put("text-center", cellAlignment2);
        linkedHashMap.put("text-right", cellAlignment3);
        HashMap hashMap = new HashMap();
        SPECIAL_CHARS_MAP = hashMap;
        hashMap.put("“", "\"");
        hashMap.put("”", "\"");
        hashMap.put("&ldquo;", "\"");
        hashMap.put("&rdquo;", "\"");
        hashMap.put("‘", "'");
        hashMap.put("’", "'");
        hashMap.put("&lsquo;", "'");
        hashMap.put("&rsquo;", "'");
        hashMap.put("&apos;", "'");
        hashMap.put("«", "<<");
        hashMap.put("&laquo;", "<<");
        hashMap.put("»", ">>");
        hashMap.put("&raquo;", ">>");
        hashMap.put("…", "...");
        hashMap.put("&hellip;", "...");
        hashMap.put("–", "--");
        hashMap.put("&endash;", "--");
        hashMap.put("—", "---");
        hashMap.put("&emdash;", "---");
        TABLE_CELL_ALIGNMENT_MAP = new DataKey<>("TABLE_CELL_ALIGNMENT_MAP", linkedHashMap);
        NULL_ITERATOR = new Iterator<Node>() { // from class: com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Node next() {
                return null;
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        };
        NULL_ITERABLE = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.function.Function] */
    public FlexmarkHtmlConverter(Builder builder) {
        DataSet immutable = builder.toImmutable();
        this.options = immutable;
        this.htmlConverterOptions = new HtmlConverterOptions(immutable);
        ArrayList arrayList = new ArrayList(builder.nodeRendererFactories.size() + 1);
        arrayList.addAll(builder.nodeRendererFactories);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList2.add(new DelegatingNodeRendererFactoryWrapper(arrayList2, (HtmlNodeRendererFactory) arrayList.get(size)));
        }
        arrayList2.add(new DelegatingNodeRendererFactoryWrapper(arrayList2, new HtmlConverterCoreNodeRendererFactory()));
        this.nodeRendererFactories = DependencyResolver.resolveFlatDependencies(arrayList2, null, new Object());
        this.linkResolverFactories = DependencyResolver.resolveFlatDependencies(builder.linkResolverFactories, null, null);
    }

    public static void appendOuterHtml(HtmlNodeConverterSubContext htmlNodeConverterSubContext, Node node) {
        String outerHtml = node.outerHtml();
        int indexOf = outerHtml.indexOf(">");
        int lastIndexOf = outerHtml.lastIndexOf("</");
        if (indexOf == -1 || lastIndexOf == -1) {
            if (indexOf == -1) {
                htmlNodeConverterSubContext.markdown.append((CharSequence) htmlNodeConverterSubContext.escapeSpecialChars(outerHtml));
                return;
            } else {
                htmlNodeConverterSubContext.markdown.append((CharSequence) outerHtml);
                return;
            }
        }
        int i6 = indexOf + 1;
        htmlNodeConverterSubContext.markdown.append((CharSequence) outerHtml.substring(0, i6));
        int childNodeSize = node.childNodeSize();
        if (childNodeSize > 0) {
            for (int i7 = 0; i7 < childNodeSize; i7++) {
                appendOuterHtml(htmlNodeConverterSubContext, node.childNode(i7));
            }
        } else {
            htmlNodeConverterSubContext.markdown.append((CharSequence) htmlNodeConverterSubContext.escapeSpecialChars(outerHtml.substring(i6, lastIndexOf)));
        }
        htmlNodeConverterSubContext.markdown.append((CharSequence) outerHtml.substring(lastIndexOf));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static void dumpHtmlTree(LineAppendable lineAppendable, Node node) {
        lineAppendable.line().append((CharSequence) node.nodeName());
        for (org.jsoup.nodes.Attribute attribute : node.attributes().asList()) {
            lineAppendable.append(SequenceUtils.SPC).append((CharSequence) attribute.getKey()).append("=\"").append((CharSequence) attribute.getValue()).append("\"");
        }
        lineAppendable.line().indent();
        Iterator<Node> it = node.childNodes().iterator();
        while (it.hasNext()) {
            dumpHtmlTree(lineAppendable, it.next());
        }
        lineAppendable.unIndent();
    }

    public static String dumpState(HtmlNodeConverterContext htmlNodeConverterContext) {
        Stack<HtmlConverterState> stateStack = htmlNodeConverterContext.getStateStack();
        if (stateStack.isEmpty()) {
            return DEFAULT_NODE;
        }
        StringBuilder sb = new StringBuilder();
        while (!stateStack.isEmpty()) {
            HtmlConverterState pop = stateStack.pop();
            sb.append(SequenceUtils.EOL);
            sb.append(pop == null ? "null" : pop.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class lambda$new$1(DelegatingNodeRendererFactoryWrapper delegatingNodeRendererFactoryWrapper) {
        return delegatingNodeRendererFactoryWrapper.getFactory().getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$0(String str, Integer num) {
        return String.format("%s_%d", str, num);
    }

    public static void processConditional(HtmlNodeConverterContext htmlNodeConverterContext, ExtensionConversion extensionConversion, Node node, Runnable runnable) {
        if (!extensionConversion.isParsed()) {
            htmlNodeConverterContext.processWrapped(node, null, true);
        } else {
            if (extensionConversion.isSuppressed()) {
                return;
            }
            runnable.run();
        }
    }

    public static void processDefault(HtmlNodeConverterSubContext htmlNodeConverterSubContext, Node node, boolean z5) {
        if (z5) {
            htmlNodeConverterSubContext.processWrapped(node, null, false);
        } else {
            htmlNodeConverterSubContext.processUnwrapped(node);
        }
    }

    public static void processHtmlTree(HtmlNodeConverterSubContext htmlNodeConverterSubContext, Node node, boolean z5, Runnable runnable) {
        htmlNodeConverterSubContext.pushState(node);
        HtmlConverterState state = htmlNodeConverterSubContext.getState();
        if (runnable != null) {
            state.addPrePopAction(runnable);
        }
        while (true) {
            Node next = htmlNodeConverterSubContext.next();
            if (next == null) {
                break;
            } else {
                htmlNodeConverterSubContext.render(next);
            }
        }
        if (state != htmlNodeConverterSubContext.getState()) {
            throw new IllegalStateException(AbstractC1135a.f("State not equal after process ", dumpState(htmlNodeConverterSubContext)));
        }
        state.runPrePopActions();
        htmlNodeConverterSubContext.popState(z5 ? htmlNodeConverterSubContext.markdown : null);
    }

    public static void processTextNodes(HtmlNodeConverterContext htmlNodeConverterContext, Node node, boolean z5, CharSequence charSequence, CharSequence charSequence2) {
        htmlNodeConverterContext.pushState(node);
        HtmlMarkdownWriter markdown = htmlNodeConverterContext.getMarkdown();
        while (true) {
            Node next = htmlNodeConverterContext.next();
            if (next == null) {
                break;
            }
            if (next instanceof TextNode) {
                if (charSequence != null && charSequence.length() > 0) {
                    markdown.append(charSequence);
                }
                markdown.append((CharSequence) htmlNodeConverterContext.prepareText(((TextNode) next).getWholeText()));
                if (charSequence2 != null && charSequence2.length() > 0) {
                    markdown.append(charSequence2);
                }
            } else if (next instanceof Element) {
                htmlNodeConverterContext.render(next);
            }
        }
        if (z5) {
            htmlNodeConverterContext.excludeAttributes(Attribute.ID_ATTR);
        }
        if (node.parent().childNode(node.parent().childNodeSize() - 1) == node) {
            htmlNodeConverterContext.transferIdToParent();
        }
        htmlNodeConverterContext.popState(markdown);
    }

    public static void processWrapped(HtmlNodeConverterSubContext htmlNodeConverterSubContext, Node node, Boolean bool, boolean z5) {
        if (!(node instanceof Element) || (!(bool == null && ((Element) node).isBlock()) && (bool == null || !bool.booleanValue()))) {
            if (z5) {
                appendOuterHtml(htmlNodeConverterSubContext, node);
                return;
            } else {
                htmlNodeConverterSubContext.markdown.append((CharSequence) node.toString());
                return;
            }
        }
        String node2 = node.toString();
        htmlNodeConverterSubContext.markdown.lineIf(bool != null).append((CharSequence) node2.substring(0, node2.indexOf(">") + 1)).lineIf(bool != null);
        processHtmlTree(htmlNodeConverterSubContext, node, false, null);
        htmlNodeConverterSubContext.markdown.lineIf(bool != null).append((CharSequence) node2.substring(node2.lastIndexOf("<"))).lineIf(bool != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        if (java.lang.Character.isWhitespace(r10.charAt(0)) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void wrapTextNodes(com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext r10, org.jsoup.nodes.Node r11, java.lang.CharSequence r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.wrapTextNodes(com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext, org.jsoup.nodes.Node, java.lang.CharSequence, boolean):void");
    }

    public void convert(String str, Appendable appendable) {
        org.jsoup.nodes.Document parse = Jsoup.parse(str);
        if (DUMP_HTML_TREE.get(getOptions()).booleanValue()) {
            LineAppendableImpl lineAppendableImpl = new LineAppendableImpl(LineAppendable.F_TRIM_LEADING_EOL);
            lineAppendableImpl.setIndentPrefix("  ");
            dumpHtmlTree(lineAppendableImpl, parse.body());
            System.out.println(lineAppendableImpl.toString(0, 0));
        }
        MainHtmlConverter mainHtmlConverter = new MainHtmlConverter(this.options, new HtmlMarkdownWriter(this.htmlConverterOptions.formatFlags), parse, null);
        mainHtmlConverter.render(parse);
        HtmlConverterOptions htmlConverterOptions = this.htmlConverterOptions;
        mainHtmlConverter.flushTo(appendable, htmlConverterOptions.maxBlankLines, htmlConverterOptions.maxTrailingBlankLines);
    }

    public DataHolder getOptions() {
        return this.options;
    }

    public static Builder builder(DataHolder dataHolder) {
        return new Builder(dataHolder);
    }

    public String convert(String str) {
        return convert(str, 1);
    }

    public String convert(String str, int i6) {
        org.jsoup.nodes.Document parse = Jsoup.parse(str);
        if (DUMP_HTML_TREE.get(getOptions()).booleanValue()) {
            LineAppendableImpl lineAppendableImpl = new LineAppendableImpl(LineAppendable.F_TRIM_LEADING_EOL);
            lineAppendableImpl.setIndentPrefix("  ");
            dumpHtmlTree(lineAppendableImpl, parse.body());
            System.out.println(lineAppendableImpl.toString(0, 0));
        }
        MainHtmlConverter mainHtmlConverter = new MainHtmlConverter(this.options, new HtmlMarkdownWriter(this.htmlConverterOptions.formatFlags), parse, null);
        mainHtmlConverter.render(parse);
        return mainHtmlConverter.getMarkdown().toString(this.htmlConverterOptions.maxBlankLines, i6);
    }

    public void convert(Node node, Appendable appendable, int i6) {
        MainHtmlConverter mainHtmlConverter = new MainHtmlConverter(this.options, new HtmlMarkdownWriter(this.htmlConverterOptions.formatFlags), node.ownerDocument(), null);
        mainHtmlConverter.render(node);
        mainHtmlConverter.flushTo(appendable, this.htmlConverterOptions.maxBlankLines, i6);
    }

    public String convert(Node node) {
        StringBuilder sb = new StringBuilder();
        convert(node, sb, 0);
        return sb.toString();
    }
}
