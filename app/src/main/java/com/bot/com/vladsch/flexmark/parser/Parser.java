package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.block.BlockPreProcessorFactory;
import com.vladsch.flexmark.parser.block.CustomBlockParserFactory;
import com.vladsch.flexmark.parser.block.ParagraphPreProcessorFactory;
import com.vladsch.flexmark.parser.delimiter.DelimiterProcessor;
import com.vladsch.flexmark.parser.internal.DocumentParser;
import com.vladsch.flexmark.parser.internal.InlineParserImpl;
import com.vladsch.flexmark.parser.internal.LinkRefProcessorData;
import com.vladsch.flexmark.parser.internal.PostProcessorManager;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.IParse;
import com.vladsch.flexmark.util.ast.KeepType;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeRepository;
import com.vladsch.flexmark.util.builder.BuilderBase;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.DataSet;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.data.SharedDataKeys;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.misc.Extension;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.ReplacedBasedSequence;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Parser implements IParse {
    public static final DataKey<Boolean> ASTERISK_DELIMITER_PROCESSOR;
    public static final DataKey<Boolean> BLANK_LINES_IN_AST;
    public static final DataKey<Boolean> BLOCK_QUOTE_ALLOW_LEADING_SPACE;
    public static final DataKey<Boolean> BLOCK_QUOTE_EXTEND_TO_BLANK_LINE;
    public static final DataKey<Boolean> BLOCK_QUOTE_IGNORE_BLANK_LINE;
    public static final DataKey<Boolean> BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> BLOCK_QUOTE_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Boolean> BLOCK_QUOTE_PARSER;
    public static final DataKey<Boolean> BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Integer> CODE_BLOCK_INDENT;
    public static final DataKey<Boolean> CODE_SOFT_LINE_BREAKS;
    public static final DataKey<Boolean> ESCAPE_HEADING_NO_ATX_SPACE;
    public static final DataKey<Boolean> FENCED_CODE_BLOCK_PARSER;
    public static final DataKey<Boolean> FENCED_CODE_CONTENT_BLOCK;
    public static final DataKey<Boolean> HARD_LINE_BREAK_LIMIT;
    public static final DataKey<Boolean> HEADING_CAN_INTERRUPT_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> HEADING_NO_ATX_SPACE;
    public static final DataKey<Boolean> HEADING_NO_EMPTY_HEADING_WITHOUT_SPACE;
    public static final DataKey<Boolean> HEADING_NO_LEAD_SPACE;
    public static final DataKey<Boolean> HEADING_PARSER;
    public static final DataKey<Integer> HEADING_SETEXT_MARKER_LENGTH;
    public static final DataKey<Boolean> HTML_ALLOW_NAME_SPACE;
    public static final DataKey<Boolean> HTML_BLOCK_COMMENT_ONLY_FULL_LINE;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSER;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED;
    public static final DataKey<Boolean> HTML_BLOCK_DEEP_PARSE_NON_BLOCK;
    public static final DataKey<Boolean> HTML_BLOCK_PARSER;
    public static final DataKey<Boolean> HTML_BLOCK_START_ONLY_ON_BLOCK_TAGS;
    public static final DataKey<List<String>> HTML_BLOCK_TAGS;
    public static final DataKey<Boolean> HTML_COMMENT_BLOCKS_INTERRUPT_PARAGRAPH;
    public static final DataKey<Boolean> HTML_FOR_TRANSLATOR;
    public static final DataKey<Boolean> INDENTED_CODE_BLOCK_PARSER;
    public static final DataKey<Boolean> INDENTED_CODE_NO_TRAILING_BLANK_LINES;
    public static final DataKey<Boolean> INLINE_DELIMITER_DIRECTIONAL_PUNCTUATIONS;
    public static final DataKey<Boolean> INTELLIJ_DUMMY_IDENTIFIER;
    public static final DataKey<Boolean> LINKS_ALLOW_MATCHED_PARENTHESES;
    public static final DataKey<Boolean> LINK_TEXT_PRIORITY_OVER_LINK_REF;
    public static final DataKey<Boolean> LISTS_AUTO_LOOSE;
    public static final DataKey<Boolean> LISTS_AUTO_LOOSE_ONE_LEVEL_LISTS;
    public static final DataKey<Boolean> LISTS_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_BULLET_ITEM_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Integer> LISTS_CODE_INDENT;
    public static final DataKey<Boolean> LISTS_DELIMITER_MISMATCH_TO_NEW_LIST;
    public static final DataKey<Boolean> LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_BULLET_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_ORDERED_NON_ONE_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_EMPTY_ORDERED_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_END_ON_DOUBLE_BLANK;
    public static final DataKey<Boolean> LISTS_ITEM_CONTENT_AFTER_SUFFIX;
    public static final DataKey<Integer> LISTS_ITEM_INDENT;
    public static final DataKey<Boolean> LISTS_ITEM_MARKER_SPACE;
    public static final DataKey<String[]> LISTS_ITEM_MARKER_SUFFIXES;
    public static final DataKey<String> LISTS_ITEM_PREFIX_CHARS;
    public static final DataKey<Boolean> LISTS_ITEM_TYPE_MISMATCH_TO_NEW_LIST;
    public static final DataKey<Boolean> LISTS_ITEM_TYPE_MISMATCH_TO_SUB_LIST;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_BLANK_LINE_FOLLOWS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_CONTAINS_BLANK_LINE;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_HAS_LOOSE_SUB_ITEM;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_HAS_NON_LIST_CHILDREN;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_HAS_TRAILING_BLANK_LINE;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_LAST_ITEM_PREV_HAS_TRAILING_BLANK_LINE;
    public static final DataKey<Boolean> LISTS_LOOSE_WHEN_PREV_HAS_TRAILING_BLANK_LINE;
    public static final DataKey<Integer> LISTS_NEW_ITEM_CODE_INDENT;
    public static final DataKey<Boolean> LISTS_NUMBERED_ITEM_MARKER_SUFFIXED;
    public static final DataKey<Boolean> LISTS_ORDERED_ITEM_DOT_ONLY;
    public static final DataKey<Boolean> LISTS_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_ORDERED_ITEM_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_ORDERED_LIST_MANUAL_START;
    public static final DataKey<Boolean> LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH;
    public static final DataKey<Boolean> LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH;
    public static final DataKey<Boolean> LIST_BLOCK_PARSER;
    public static final DataKey<Boolean> MATCH_CLOSING_FENCE_CHARACTERS;
    public static final DataKey<Boolean> MATCH_NESTED_LINK_REFS_FIRST;
    public static final DataKey<ParserEmulationProfile> PARSER_EMULATION_PROFILE;
    public static final DataKey<Boolean> PARSE_INNER_HTML_COMMENTS;
    public static final DataKey<Boolean> PARSE_JEKYLL_MACROS_IN_URLS;
    public static final DataKey<Boolean> PARSE_MULTI_LINE_IMAGE_URLS;
    public static final DataKey<Boolean> REFERENCE_PARAGRAPH_PRE_PROCESSOR;
    public static final DataKey<Boolean> SPACE_IN_LINK_ELEMENTS;
    public static final DataKey<Boolean> SPACE_IN_LINK_URLS;
    public static final DataKey<List<SpecialLeadInHandler>> SPECIAL_LEAD_IN_HANDLERS;
    public static final DataKey<Boolean> STRONG_WRAPS_EMPHASIS;
    public static final DataKey<Boolean> THEMATIC_BREAK_PARSER;
    public static final DataKey<Boolean> THEMATIC_BREAK_RELAXED_START;
    public static final DataKey<Boolean> TRACK_DOCUMENT_LINES;
    public static final DataKey<String> TRANSLATION_AUTOLINK_TAG_PATTERN;
    public static final DataKey<String> TRANSLATION_HTML_BLOCK_TAG_PATTERN;
    public static final DataKey<String> TRANSLATION_HTML_INLINE_TAG_PATTERN;
    public static final DataKey<Boolean> UNDERSCORE_DELIMITER_PROCESSOR;
    public static final DataKey<Boolean> USE_HARDCODED_LINK_ADDRESS_PARSER;
    public static final DataKey<Boolean> WWW_AUTO_LINK_ELEMENT;
    private final List<CustomBlockParserFactory> blockParserFactories;
    private final List<List<BlockPreProcessorFactory>> blockPreProcessorDependencies;
    private final BitSet delimiterCharacters;
    private final Map<Character, DelimiterProcessor> delimiterProcessors;
    private final List<InlineParserExtensionFactory> inlineParserExtensionFactories;
    private final InlineParserFactory inlineParserFactory;
    private final LinkRefProcessorData linkRefProcessors;
    private final DataHolder options;
    private final List<List<ParagraphPreProcessorFactory>> paragraphPreProcessorFactories;
    private final List<PostProcessorManager.PostProcessorDependencyStage> postProcessorDependencies;
    private final BitSet specialCharacters;
    public static final DataKey<Collection<Extension>> EXTENSIONS = SharedDataKeys.EXTENSIONS;
    public static final DataKey<KeepType> REFERENCES_KEEP = new DataKey<>("REFERENCES_KEEP", KeepType.FIRST);
    public static final DataKey<ReferenceRepository> REFERENCES = new DataKey<>("REFERENCES", new ReferenceRepository(null), new Object());

    /* loaded from: classes.dex */
    public static class Builder extends BuilderBase<Builder> {
        final List<CustomBlockParserFactory> blockParserFactories;
        final List<BlockPreProcessorFactory> blockPreProcessorFactories;
        final List<DelimiterProcessor> delimiterProcessors;
        final List<InlineParserExtensionFactory> inlineParserExtensionFactories;
        InlineParserFactory inlineParserFactory;
        final List<LinkRefProcessorFactory> linkRefProcessors;
        final List<ParagraphPreProcessorFactory> paragraphPreProcessorFactories;
        final List<PostProcessorFactory> postProcessorFactories;
        final List<SpecialLeadInHandler> specialLeadInHandlers;

        public Builder(DataHolder dataHolder) {
            super(dataHolder);
            this.blockParserFactories = new ArrayList();
            this.delimiterProcessors = new ArrayList();
            this.postProcessorFactories = new ArrayList();
            this.paragraphPreProcessorFactories = new ArrayList();
            this.blockPreProcessorFactories = new ArrayList();
            this.linkRefProcessors = new ArrayList();
            this.inlineParserExtensionFactories = new ArrayList();
            this.inlineParserFactory = null;
            this.specialLeadInHandlers = new ArrayList();
            loadExtensions();
        }

        public Builder blockPreProcessorFactory(BlockPreProcessorFactory blockPreProcessorFactory) {
            this.blockPreProcessorFactories.add(blockPreProcessorFactory);
            addExtensionApiPoint(blockPreProcessorFactory);
            return this;
        }

        public Builder customBlockParserFactory(CustomBlockParserFactory customBlockParserFactory) {
            this.blockParserFactories.add(customBlockParserFactory);
            addExtensionApiPoint(customBlockParserFactory);
            return this;
        }

        public Builder customDelimiterProcessor(DelimiterProcessor delimiterProcessor) {
            this.delimiterProcessors.add(delimiterProcessor);
            addExtensionApiPoint(delimiterProcessor);
            return this;
        }

        public Builder customInlineParserExtensionFactory(InlineParserExtensionFactory inlineParserExtensionFactory) {
            this.inlineParserExtensionFactories.add(inlineParserExtensionFactory);
            addExtensionApiPoint(inlineParserExtensionFactory);
            return this;
        }

        public Builder customInlineParserFactory(InlineParserFactory inlineParserFactory) {
            if (this.inlineParserFactory != null) {
                throw new IllegalStateException("custom inline parser factory is already set to ".concat(this.inlineParserFactory.getClass().getName()));
            }
            this.inlineParserFactory = inlineParserFactory;
            addExtensionApiPoint(inlineParserFactory);
            return this;
        }

        public Builder linkRefProcessorFactory(LinkRefProcessorFactory linkRefProcessorFactory) {
            this.linkRefProcessors.add(linkRefProcessorFactory);
            addExtensionApiPoint(linkRefProcessorFactory);
            return this;
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public boolean loadExtension(Extension extension) {
            if (!(extension instanceof ParserExtension)) {
                return false;
            }
            ((ParserExtension) extension).extend(this);
            return true;
        }

        public Builder paragraphPreProcessorFactory(ParagraphPreProcessorFactory paragraphPreProcessorFactory) {
            this.paragraphPreProcessorFactories.add(paragraphPreProcessorFactory);
            addExtensionApiPoint(paragraphPreProcessorFactory);
            return this;
        }

        public Builder postProcessorFactory(PostProcessorFactory postProcessorFactory) {
            this.postProcessorFactories.add(postProcessorFactory);
            addExtensionApiPoint(postProcessorFactory);
            return this;
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public void preloadExtension(Extension extension) {
            if (extension instanceof ParserExtension) {
                ((ParserExtension) extension).parserOptions(this);
            }
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public void removeApiPoint(Object obj) {
            if (obj instanceof CustomBlockParserFactory) {
                this.blockParserFactories.remove(obj);
                return;
            }
            if (obj instanceof DelimiterProcessor) {
                this.delimiterProcessors.remove(obj);
                return;
            }
            if (obj instanceof PostProcessorFactory) {
                this.postProcessorFactories.remove(obj);
                return;
            }
            if (obj instanceof ParagraphPreProcessorFactory) {
                this.paragraphPreProcessorFactories.remove(obj);
                return;
            }
            if (obj instanceof BlockPreProcessorFactory) {
                this.blockPreProcessorFactories.remove(obj);
                return;
            }
            if (obj instanceof LinkRefProcessorFactory) {
                this.linkRefProcessors.remove(obj);
                return;
            }
            if (obj instanceof SpecialLeadInHandler) {
                this.specialLeadInHandlers.remove(obj);
            } else if (obj instanceof InlineParserExtensionFactory) {
                this.inlineParserExtensionFactories.remove(obj);
            } else {
                if (!(obj instanceof InlineParserFactory)) {
                    throw new IllegalStateException("Unknown data point type: ".concat(obj.getClass().getName()));
                }
                this.inlineParserFactory = null;
            }
        }

        public Builder specialLeadInHandler(SpecialLeadInHandler specialLeadInHandler) {
            this.specialLeadInHandlers.add(specialLeadInHandler);
            addExtensionApiPoint(specialLeadInHandler);
            return this;
        }

        @Override // com.vladsch.flexmark.util.builder.BuilderBase
        public Parser build() {
            return new Parser(this);
        }

        public Builder() {
            this.blockParserFactories = new ArrayList();
            this.delimiterProcessors = new ArrayList();
            this.postProcessorFactories = new ArrayList();
            this.paragraphPreProcessorFactories = new ArrayList();
            this.blockPreProcessorFactories = new ArrayList();
            this.linkRefProcessors = new ArrayList();
            this.inlineParserExtensionFactories = new ArrayList();
            this.inlineParserFactory = null;
            this.specialLeadInHandlers = new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public abstract class ParserExtension extends Extension {
        void extend(Builder builder);

        void parserOptions(MutableDataHolder mutableDataHolder);
    }

    /* loaded from: classes.dex */
    public abstract class ReferenceHoldingExtension extends Extension {
        boolean transferReferences(MutableDataHolder mutableDataHolder, DataHolder dataHolder);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.vladsch.flexmark.util.data.DataNotNullValueFactory] */
    {
        Boolean bool = Boolean.TRUE;
        ASTERISK_DELIMITER_PROCESSOR = new DataKey<>("ASTERISK_DELIMITER_PROCESSOR", bool);
        Boolean bool2 = Boolean.FALSE;
        TRACK_DOCUMENT_LINES = new DataKey<>("TRACK_DOCUMENT_LINES", bool2);
        BLOCK_QUOTE_PARSER = new DataKey<>("BLOCK_QUOTE_PARSER", bool);
        BLOCK_QUOTE_EXTEND_TO_BLANK_LINE = new DataKey<>("BLOCK_QUOTE_EXTEND_TO_BLANK_LINE", bool2);
        BLOCK_QUOTE_IGNORE_BLANK_LINE = new DataKey<>("BLOCK_QUOTE_IGNORE_BLANK_LINE", bool2);
        BLOCK_QUOTE_ALLOW_LEADING_SPACE = new DataKey<>("BLOCK_QUOTE_ALLOW_LEADING_SPACE", bool);
        BLOCK_QUOTE_INTERRUPTS_PARAGRAPH = new DataKey<>("BLOCK_QUOTE_INTERRUPTS_PARAGRAPH", bool);
        BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH", bool);
        BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH", bool);
        FENCED_CODE_BLOCK_PARSER = new DataKey<>("FENCED_CODE_BLOCK_PARSER", bool);
        MATCH_CLOSING_FENCE_CHARACTERS = new DataKey<>("MATCH_CLOSING_FENCE_CHARACTERS", bool);
        FENCED_CODE_CONTENT_BLOCK = new DataKey<>("FENCED_CODE_CONTENT_BLOCK", bool2);
        CODE_SOFT_LINE_BREAKS = new DataKey<>("CODE_SOFT_LINE_BREAKS", bool2);
        HARD_LINE_BREAK_LIMIT = new DataKey<>("HARD_LINE_BREAK_LIMIT", bool2);
        HEADING_PARSER = new DataKey<>("HEADING_PARSER", bool);
        HEADING_SETEXT_MARKER_LENGTH = new DataKey<>("HEADING_SETEXT_MARKER_LENGTH", 1);
        HEADING_NO_ATX_SPACE = SharedDataKeys.HEADING_NO_ATX_SPACE;
        ESCAPE_HEADING_NO_ATX_SPACE = SharedDataKeys.ESCAPE_HEADING_NO_ATX_SPACE;
        HEADING_NO_EMPTY_HEADING_WITHOUT_SPACE = new DataKey<>("HEADING_NO_EMPTY_HEADING_WITHOUT_SPACE", bool2);
        HEADING_NO_LEAD_SPACE = new DataKey<>("HEADING_NO_LEAD_SPACE", bool2);
        HEADING_CAN_INTERRUPT_ITEM_PARAGRAPH = new DataKey<>("HEADING_CAN_INTERRUPT_ITEM_PARAGRAPH", bool);
        HTML_BLOCK_PARSER = new DataKey<>("HTML_BLOCK_PARSER", bool);
        HTML_COMMENT_BLOCKS_INTERRUPT_PARAGRAPH = new DataKey<>("HTML_COMMENT_BLOCKS_INTERRUPT_PARAGRAPH", bool);
        HTML_FOR_TRANSLATOR = SharedDataKeys.HTML_FOR_TRANSLATOR;
        INLINE_DELIMITER_DIRECTIONAL_PUNCTUATIONS = new DataKey<>("INLINE_DELIMITER_DIRECTIONAL_PUNCTUATIONS", bool2);
        INDENTED_CODE_BLOCK_PARSER = new DataKey<>("INDENTED_CODE_BLOCK_PARSER", bool);
        INDENTED_CODE_NO_TRAILING_BLANK_LINES = new DataKey<>("INDENTED_CODE_NO_TRAILING_BLANK_LINES", bool);
        INTELLIJ_DUMMY_IDENTIFIER = SharedDataKeys.INTELLIJ_DUMMY_IDENTIFIER;
        MATCH_NESTED_LINK_REFS_FIRST = new DataKey<>("MATCH_NESTED_LINK_REFS_FIRST", bool);
        PARSE_INNER_HTML_COMMENTS = SharedDataKeys.PARSE_INNER_HTML_COMMENTS;
        PARSE_MULTI_LINE_IMAGE_URLS = new DataKey<>("PARSE_MULTI_LINE_IMAGE_URLS", bool2);
        PARSE_JEKYLL_MACROS_IN_URLS = new DataKey<>("PARSE_JEKYLL_MACROS_IN_URLS", bool2);
        SPACE_IN_LINK_URLS = new DataKey<>("SPACE_IN_LINK_URLS", bool2);
        SPACE_IN_LINK_ELEMENTS = new DataKey<>("SPACE_IN_LINK_ELEMENTS", bool2);
        WWW_AUTO_LINK_ELEMENT = new DataKey<>("WWW_AUTO_LINK_ELEMENT", bool2);
        LINK_TEXT_PRIORITY_OVER_LINK_REF = new DataKey<>("LINK_TEXT_PRIORITY_OVER_LINK_REF", bool2);
        REFERENCE_PARAGRAPH_PRE_PROCESSOR = new DataKey<>("REFERENCE_BLOCK_PRE_PROCESSOR", bool);
        THEMATIC_BREAK_PARSER = new DataKey<>("THEMATIC_BREAK_PARSER", bool);
        THEMATIC_BREAK_RELAXED_START = new DataKey<>("THEMATIC_BREAK_RELAXED_START", bool);
        UNDERSCORE_DELIMITER_PROCESSOR = new DataKey<>("UNDERSCORE_DELIMITER_PROCESSOR", bool);
        BLANK_LINES_IN_AST = SharedDataKeys.BLANK_LINES_IN_AST;
        USE_HARDCODED_LINK_ADDRESS_PARSER = new DataKey<>("USE_HARDCODED_LINK_ADDRESS_PARSER", bool);
        STRONG_WRAPS_EMPHASIS = new DataKey<>("STRONG_WRAPS_EMPHASIS", bool2);
        LINKS_ALLOW_MATCHED_PARENTHESES = new DataKey<>("LINKS_ALLOW_MATCHED_PARENTHESES", bool);
        LIST_BLOCK_PARSER = new DataKey<>("LIST_BLOCK_PARSER", bool);
        PARSER_EMULATION_PROFILE = new DataKey<>("PARSER_EMULATION_PROFILE", ParserEmulationProfile.COMMONMARK);
        DataKey<Boolean> dataKey = new DataKey<>("HTML_BLOCK_DEEP_PARSER", bool2);
        HTML_BLOCK_DEEP_PARSER = dataKey;
        HTML_BLOCK_DEEP_PARSE_NON_BLOCK = new DataKey<>("HTML_BLOCK_DEEP_PARSE_NON_BLOCK", bool);
        HTML_BLOCK_COMMENT_ONLY_FULL_LINE = new DataKey<>("HTML_BLOCK_COMMENT_ONLY_FULL_LINE", bool2);
        HTML_BLOCK_START_ONLY_ON_BLOCK_TAGS = new DataKey<>("HTML_BLOCK_START_ONLY_ON_BLOCK_TAGS", (DataKey) dataKey);
        HTML_BLOCK_TAGS = new DataKey<>("HTML_BLOCK_TAGS", Arrays.asList("address", "article", FlexmarkHtmlConverter.ASIDE_NODE, "base", "basefont", FlexmarkHtmlConverter.BLOCKQUOTE_NODE, "body", FlexmarkHtmlConverter.CAPTION_NODE, "center", "col", "colgroup", FlexmarkHtmlConverter.DD_NODE, "details", "dialog", "dir", FlexmarkHtmlConverter.DIV_NODE, FlexmarkHtmlConverter.DL_NODE, FlexmarkHtmlConverter.DT_NODE, "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", FlexmarkHtmlConverter.H1_NODE, FlexmarkHtmlConverter.H2_NODE, FlexmarkHtmlConverter.H3_NODE, FlexmarkHtmlConverter.H4_NODE, FlexmarkHtmlConverter.H5_NODE, FlexmarkHtmlConverter.H6_NODE, "head", "header", FlexmarkHtmlConverter.HR_NODE, "html", "iframe", "legend", FlexmarkHtmlConverter.LI_NODE, "link", "main", FlexmarkHtmlConverter.MATH_NODE, "menu", "menuitem", "meta", "nav", "noframes", FlexmarkHtmlConverter.OL_NODE, "optgroup", "option", FlexmarkHtmlConverter.P_NODE, "param", "section", "source", "summary", FlexmarkHtmlConverter.TABLE_NODE, FlexmarkHtmlConverter.TBODY_NODE, FlexmarkHtmlConverter.TD_NODE, "tfoot", FlexmarkHtmlConverter.TH_NODE, FlexmarkHtmlConverter.THEAD_NODE, Attribute.TITLE_ATTR, FlexmarkHtmlConverter.TR_NODE, "track", FlexmarkHtmlConverter.UL_NODE));
        HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS = new DataKey<>("HTML_BL OCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS", bool);
        HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE = new DataKey<>("HTML_BL HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE", bool2);
        HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED = new DataKey<>("HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED", bool2);
        HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG = new DataKey<>("HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG", bool);
        HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS = new DataKey<>("HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS", bool2);
        HTML_ALLOW_NAME_SPACE = new DataKey<>("HTML_ALLOW_NAME_SPACE", bool2);
        TRANSLATION_HTML_BLOCK_TAG_PATTERN = SharedDataKeys.TRANSLATION_HTML_BLOCK_TAG_PATTERN;
        TRANSLATION_HTML_INLINE_TAG_PATTERN = SharedDataKeys.TRANSLATION_HTML_INLINE_TAG_PATTERN;
        TRANSLATION_AUTOLINK_TAG_PATTERN = SharedDataKeys.TRANSLATION_AUTOLINK_TAG_PATTERN;
        LISTS_CODE_INDENT = new DataKey<>("LISTS_CODE_INDENT", 4);
        DataKey<Integer> dataKey2 = new DataKey<>("LISTS_ITEM_INDENT", 4);
        LISTS_ITEM_INDENT = dataKey2;
        LISTS_NEW_ITEM_CODE_INDENT = new DataKey<>("LISTS_NEW_ITEM_CODE_INDENT", 4);
        LISTS_ITEM_MARKER_SPACE = new DataKey<>("LISTS_ITEM_MARKER_SPACE", bool2);
        LISTS_ITEM_MARKER_SUFFIXES = new DataKey<>("LISTS_ITEM_MARKER_SUFFIXES", new String[0]);
        LISTS_NUMBERED_ITEM_MARKER_SUFFIXED = new DataKey<>("LISTS_NUMBERED_ITEM_MARKER_SUFFIXED", bool);
        LISTS_AUTO_LOOSE = new DataKey<>("LISTS_AUTO_LOOSE", bool);
        LISTS_AUTO_LOOSE_ONE_LEVEL_LISTS = new DataKey<>("LISTS_AUTO_LOOSE_ONE_LEVEL_LISTS", bool2);
        LISTS_LOOSE_WHEN_PREV_HAS_TRAILING_BLANK_LINE = new DataKey<>("LISTS_LOOSE_WHEN_PREV_HAS_TRAILING_BLANK_LINE", bool2);
        LISTS_LOOSE_WHEN_LAST_ITEM_PREV_HAS_TRAILING_BLANK_LINE = new DataKey<>("LISTS_LOOSE_WHEN_LAST_ITEM_PREV_HAS_TRAILING_BLANK_LINE", bool2);
        LISTS_LOOSE_WHEN_HAS_NON_LIST_CHILDREN = new DataKey<>("LISTS_LOOSE_WHEN_HAS_NON_LIST_CHILDREN", bool2);
        LISTS_LOOSE_WHEN_BLANK_LINE_FOLLOWS_ITEM_PARAGRAPH = new DataKey<>("LISTS_LOOSE_WHEN_BLANK_LINE_FOLLOWS_ITEM_PARAGRAPH", bool2);
        LISTS_LOOSE_WHEN_HAS_LOOSE_SUB_ITEM = new DataKey<>("LISTS_LOOSE_WHEN_HAS_LOOSE_SUB_ITEM", bool2);
        LISTS_LOOSE_WHEN_HAS_TRAILING_BLANK_LINE = new DataKey<>("LISTS_LOOSE_WHEN_HAS_TRAILING_BLANK_LINE", bool);
        LISTS_LOOSE_WHEN_CONTAINS_BLANK_LINE = new DataKey<>("LISTS_LOOSE_WHEN_CONTAINS_BLANK_LINE", bool2);
        LISTS_DELIMITER_MISMATCH_TO_NEW_LIST = new DataKey<>("LISTS_DELIMITER_MISMATCH_TO_NEW_LIST", bool);
        LISTS_END_ON_DOUBLE_BLANK = new DataKey<>("LISTS_END_ON_DOUBLE_BLANK", bool2);
        LISTS_ITEM_TYPE_MISMATCH_TO_NEW_LIST = new DataKey<>("LISTS_ITEM_TYPE_MISMATCH_TO_NEW_LIST", bool);
        LISTS_ITEM_TYPE_MISMATCH_TO_SUB_LIST = new DataKey<>("LISTS_ITEM_TYPE_MISMATCH_TO_SUB_LIST", bool2);
        LISTS_ORDERED_ITEM_DOT_ONLY = new DataKey<>("LISTS_ORDERED_ITEM_DOT_ONLY", bool2);
        LISTS_ORDERED_LIST_MANUAL_START = new DataKey<>("LISTS_ORDERED_LIST_MANUAL_START", bool);
        LISTS_ITEM_CONTENT_AFTER_SUFFIX = new DataKey<>("LISTS_ITEM_CONTENT_AFTER_SUFFIX", bool2);
        LISTS_BULLET_ITEM_INTERRUPTS_PARAGRAPH = new DataKey<>("LISTS_BULLET_ITEM_INTERRUPTS_PARAGRAPH", bool);
        LISTS_ORDERED_ITEM_INTERRUPTS_PARAGRAPH = new DataKey<>("LISTS_ORDERED_ITEM_INTERRUPTS_PARAGRAPH", bool);
        LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH = new DataKey<>("LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH", bool2);
        LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_PARAGRAPH = new DataKey<>("LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_PARAGRAPH", bool2);
        LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_PARAGRAPH = new DataKey<>("LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_PARAGRAPH", bool2);
        LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH = new DataKey<>("LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH", bool2);
        LISTS_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool);
        LISTS_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool);
        LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool);
        LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool);
        LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool);
        LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool);
        LISTS_EMPTY_BULLET_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_EMPTY_BULLET_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool2);
        LISTS_EMPTY_ORDERED_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_EMPTY_ORDERED_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool2);
        LISTS_EMPTY_ORDERED_NON_ONE_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH = new DataKey<>("LISTS_EMPTY_ORDERED_NON_ONE_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH", bool2);
        LISTS_ITEM_PREFIX_CHARS = new DataKey<>("LISTS_ITEM_PREFIX_CHARS", "+*-");
        SPECIAL_LEAD_IN_HANDLERS = new DataKey<>("SPECIAL_LEAD_IN_HANDLERS", Collections.EMPTY_LIST);
        CODE_BLOCK_INDENT = new DataKey<>("CODE_BLOCK_INDENT", (DataKey) dataKey2);
    }

    public Parser(Builder builder) {
        DataSet immutable = builder.toImmutable();
        List<CustomBlockParserFactory> calculateBlockParserFactories = DocumentParser.calculateBlockParserFactories(immutable, builder.blockParserFactories);
        this.blockParserFactories = calculateBlockParserFactories;
        ArrayList arrayList = new ArrayList(builder.specialLeadInHandlers);
        Iterator<CustomBlockParserFactory> it = calculateBlockParserFactories.iterator();
        while (it.hasNext()) {
            SpecialLeadInHandler leadInHandler = it.next().getLeadInHandler(immutable);
            if (leadInHandler != null) {
                arrayList.add(leadInHandler);
            }
        }
        MutableDataSet mutableDataSet = new MutableDataSet(builder);
        mutableDataSet.set((DataKey<DataKey<List<SpecialLeadInHandler>>>) SPECIAL_LEAD_IN_HANDLERS, (DataKey<List<SpecialLeadInHandler>>) arrayList);
        this.options = mutableDataSet.toImmutable();
        InlineParserFactory inlineParserFactory = builder.inlineParserFactory;
        inlineParserFactory = inlineParserFactory == null ? DocumentParser.INLINE_PARSER_FACTORY : inlineParserFactory;
        this.inlineParserFactory = inlineParserFactory;
        this.paragraphPreProcessorFactories = DocumentParser.calculateParagraphPreProcessors(immutable, builder.paragraphPreProcessorFactories, inlineParserFactory);
        this.blockPreProcessorDependencies = DocumentParser.calculateBlockPreProcessors(immutable, builder.blockPreProcessorFactories);
        Map<Character, DelimiterProcessor> calculateDelimiterProcessors = InlineParserImpl.calculateDelimiterProcessors(immutable, builder.delimiterProcessors);
        this.delimiterProcessors = calculateDelimiterProcessors;
        BitSet calculateDelimiterCharacters = InlineParserImpl.calculateDelimiterCharacters(immutable, calculateDelimiterProcessors.keySet());
        this.delimiterCharacters = calculateDelimiterCharacters;
        this.linkRefProcessors = InlineParserImpl.calculateLinkRefProcessors(immutable, builder.linkRefProcessors);
        this.specialCharacters = InlineParserImpl.calculateSpecialCharacters(immutable, calculateDelimiterCharacters);
        this.postProcessorDependencies = PostProcessorManager.calculatePostProcessors(immutable, builder.postProcessorFactories);
        this.inlineParserExtensionFactories = builder.inlineParserExtensionFactories;
    }

    public static MutableDataHolder addExtensions(MutableDataHolder mutableDataHolder, Extension... extensionArr) {
        Collection<Extension> collection = EXTENSIONS.get(mutableDataHolder);
        ArrayList arrayList = new ArrayList(Arrays.asList(extensionArr));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Extension) it.next());
        }
        mutableDataHolder.set((DataKey<DataKey<Collection<Extension>>>) EXTENSIONS, (DataKey<Collection<Extension>>) arrayList);
        return mutableDataHolder;
    }

    public static Builder builder() {
        return new Builder();
    }

    private Document postProcess(Document document) {
        return PostProcessorManager.processDocument(document, this.postProcessorDependencies);
    }

    public static MutableDataHolder removeExtensions(MutableDataHolder mutableDataHolder, Class... clsArr) {
        Collection<Extension> collection = EXTENSIONS.get(mutableDataHolder);
        HashSet hashSet = new HashSet();
        for (Extension extension : collection) {
            int length = clsArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    hashSet.add(extension);
                    break;
                }
                if (clsArr[i6].isInstance(extension)) {
                    break;
                }
                i6++;
            }
        }
        mutableDataHolder.set((DataKey<DataKey<Collection<Extension>>>) EXTENSIONS, (DataKey<Collection<Extension>>) hashSet);
        return mutableDataHolder;
    }

    @Override // com.vladsch.flexmark.util.ast.IParse
    public DataHolder getOptions() {
        return this.options;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (transferReferences(r4, r8, r3) != false) goto L27;
     */
    @Override // com.vladsch.flexmark.util.ast.IParse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean transferReferences(com.vladsch.flexmark.util.ast.Document r7, com.vladsch.flexmark.util.ast.Document r8, java.lang.Boolean r9) {
        /*
            r6 = this;
            com.vladsch.flexmark.util.data.DataHolder r0 = r6.options
            com.vladsch.flexmark.util.data.DataKey<java.util.Collection<com.vladsch.flexmark.util.misc.Extension>> r1 = com.vladsch.flexmark.parser.Parser.EXTENSIONS
            boolean r0 = r0.contains(r1)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L33
            com.vladsch.flexmark.util.data.DataHolder r0 = r6.options
            java.lang.Object r0 = r1.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = r3
        L19:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r0.next()
            com.vladsch.flexmark.util.misc.Extension r4 = (com.vladsch.flexmark.util.misc.Extension) r4
            boolean r5 = r4 instanceof com.vladsch.flexmark.parser.Parser.ReferenceHoldingExtension
            if (r5 == 0) goto L19
            com.vladsch.flexmark.parser.Parser$ReferenceHoldingExtension r4 = (com.vladsch.flexmark.parser.Parser.ReferenceHoldingExtension) r4
            boolean r4 = r4.transferReferences(r7, r8)
            if (r4 == 0) goto L19
            r1 = r2
            goto L19
        L33:
            r1 = r3
        L34:
            com.vladsch.flexmark.util.data.DataKey<com.vladsch.flexmark.ast.util.ReferenceRepository> r0 = com.vladsch.flexmark.parser.Parser.REFERENCES
            boolean r4 = r7.contains(r0)
            if (r4 == 0) goto L67
            boolean r4 = r8.contains(r0)
            if (r4 == 0) goto L67
            java.lang.Object r4 = r0.get(r7)
            com.vladsch.flexmark.util.ast.NodeRepository r4 = (com.vladsch.flexmark.util.ast.NodeRepository) r4
            java.lang.Object r8 = r0.get(r8)
            com.vladsch.flexmark.util.ast.NodeRepository r8 = (com.vladsch.flexmark.util.ast.NodeRepository) r8
            if (r9 == 0) goto L55
            boolean r3 = r9.booleanValue()
            goto L60
        L55:
            com.vladsch.flexmark.util.data.DataKey<com.vladsch.flexmark.util.ast.KeepType> r9 = com.vladsch.flexmark.parser.Parser.REFERENCES_KEEP
            java.lang.Object r9 = r9.get(r7)
            com.vladsch.flexmark.util.ast.KeepType r0 = com.vladsch.flexmark.util.ast.KeepType.FIRST
            if (r9 != r0) goto L60
            r3 = r2
        L60:
            boolean r8 = transferReferences(r4, r8, r3)
            if (r8 == 0) goto L67
            goto L68
        L67:
            r2 = r1
        L68:
            if (r2 == 0) goto L71
            com.vladsch.flexmark.util.data.DataKey<java.lang.Boolean> r8 = com.vladsch.flexmark.html.HtmlRenderer.RECHECK_UNDEFINED_REFERENCES
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r7.set(r8, r9)
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.Parser.transferReferences(com.vladsch.flexmark.util.ast.Document, com.vladsch.flexmark.util.ast.Document, java.lang.Boolean):boolean");
    }

    public static Builder builder(DataHolder dataHolder) {
        return new Builder(dataHolder);
    }

    @Override // com.vladsch.flexmark.util.ast.IParse
    public Document parseReader(Reader reader) {
        DataHolder dataHolder = this.options;
        return postProcess(new DocumentParser(dataHolder, this.blockParserFactories, this.paragraphPreProcessorFactories, this.blockPreProcessorDependencies, this.inlineParserFactory.inlineParser(dataHolder, this.specialCharacters, this.delimiterCharacters, this.delimiterProcessors, this.linkRefProcessors, this.inlineParserExtensionFactories)).parse(reader));
    }

    @Override // com.vladsch.flexmark.util.ast.IParse
    public Document parse(BasedSequence basedSequence) {
        if (!(basedSequence instanceof ReplacedBasedSequence)) {
            DataHolder dataHolder = this.options;
            return postProcess(new DocumentParser(dataHolder, this.blockParserFactories, this.paragraphPreProcessorFactories, this.blockPreProcessorDependencies, this.inlineParserFactory.inlineParser(dataHolder, this.specialCharacters, this.delimiterCharacters, this.delimiterProcessors, this.linkRefProcessors, this.inlineParserExtensionFactories)).parse(basedSequence));
        }
        throw new IllegalArgumentException("Parser.parse() does not support BasedSequences with replaced or non-contiguous segments.\nUse BasedSequence.of(input.toString()) to convert to contiguous based sequence.");
    }

    @Override // com.vladsch.flexmark.util.ast.IParse
    public Document parse(String str) {
        DataHolder dataHolder = this.options;
        return postProcess(new DocumentParser(dataHolder, this.blockParserFactories, this.paragraphPreProcessorFactories, this.blockPreProcessorDependencies, this.inlineParserFactory.inlineParser(dataHolder, this.specialCharacters, this.delimiterCharacters, this.delimiterProcessors, this.linkRefProcessors, this.inlineParserExtensionFactories)).parse(BasedSequence.of(str)));
    }

    public static <T extends Node> boolean transferReferences(NodeRepository<T> nodeRepository, NodeRepository<T> nodeRepository2, boolean z5) {
        return NodeRepository.transferReferences(nodeRepository, nodeRepository2, z5, null);
    }
}
