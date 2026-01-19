package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.util.ast.KeepType;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSet;
import com.vladsch.flexmark.util.data.MutableDataSetter;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public enum ParserEmulationProfile implements MutableDataSetter {
    COMMONMARK(null),
    COMMONMARK_0_26(COMMONMARK),
    COMMONMARK_0_27(COMMONMARK),
    COMMONMARK_0_28(COMMONMARK),
    COMMONMARK_0_29(COMMONMARK),
    FIXED_INDENT(null),
    KRAMDOWN(null),
    MARKDOWN(null),
    GITHUB_DOC(MARKDOWN),
    GITHUB(COMMONMARK),
    MULTI_MARKDOWN(FIXED_INDENT),
    PEGDOWN(FIXED_INDENT),
    PEGDOWN_STRICT(FIXED_INDENT);

    public static final DataKey<Integer> PEGDOWN_EXTENSIONS = new DataKey<>("PEGDOWN_EXTENSIONS", 65535);
    public final ParserEmulationProfile family;

    ParserEmulationProfile(ParserEmulationProfile parserEmulationProfile) {
        this.family = parserEmulationProfile == null ? this : parserEmulationProfile;
    }

    public static boolean haveAll(int i6, int i7) {
        return (i6 & i7) == i7;
    }

    public static boolean haveAny(int i6, int i7) {
        return (i6 & i7) != 0;
    }

    public MutableListOptions getOptions() {
        return getOptions(null);
    }

    public MutableDataHolder getProfileOptions() {
        MutableDataSet mutableDataSet = new MutableDataSet();
        setIn(mutableDataSet);
        return mutableDataSet;
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataSetter
    public MutableDataHolder setIn(MutableDataHolder mutableDataHolder) {
        if (this == FIXED_INDENT) {
            getOptions(mutableDataHolder).setIn(mutableDataHolder).set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) Boolean.TRUE).set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) Boolean.FALSE);
            return mutableDataHolder;
        }
        if (this == KRAMDOWN) {
            getOptions(mutableDataHolder).setIn(mutableDataHolder);
            DataKey<Boolean> dataKey = Parser.HEADING_NO_LEAD_SPACE;
            Boolean bool = Boolean.TRUE;
            MutableDataHolder mutableDataHolder2 = mutableDataHolder.set((DataKey<DataKey<Boolean>>) dataKey, (DataKey<Boolean>) bool);
            DataKey<Boolean> dataKey2 = Parser.BLOCK_QUOTE_INTERRUPTS_PARAGRAPH;
            Boolean bool2 = Boolean.FALSE;
            mutableDataHolder2.set((DataKey<DataKey<Boolean>>) dataKey2, (DataKey<Boolean>) bool2).set((DataKey<DataKey<Boolean>>) HtmlRenderer.RENDER_HEADER_ID, (DataKey<Boolean>) bool).set((DataKey<DataKey<String>>) HtmlRenderer.SOFT_BREAK, (DataKey<String>) SequenceUtils.SPACE).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSER, (DataKey<Boolean>) bool).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_NON_BLOCK, (DataKey<Boolean>) bool).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE, (DataKey<Boolean>) bool2).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS, (DataKey<Boolean>) bool2).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED, (DataKey<Boolean>) bool).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG, (DataKey<Boolean>) bool2).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS, (DataKey<Boolean>) bool).set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) bool).set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) bool2);
            return mutableDataHolder;
        }
        if (this == MARKDOWN) {
            getOptions(mutableDataHolder).setIn(mutableDataHolder);
            DataKey<Boolean> dataKey3 = Parser.HEADING_NO_LEAD_SPACE;
            Boolean bool3 = Boolean.TRUE;
            MutableDataHolder mutableDataHolder3 = mutableDataHolder.set((DataKey<DataKey<Boolean>>) dataKey3, (DataKey<Boolean>) bool3).set((DataKey<DataKey<Boolean>>) Parser.BLOCK_QUOTE_IGNORE_BLANK_LINE, (DataKey<Boolean>) bool3).set((DataKey<DataKey<String>>) HtmlRenderer.SOFT_BREAK, (DataKey<String>) SequenceUtils.SPACE).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSER, (DataKey<Boolean>) bool3).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_NON_BLOCK, (DataKey<Boolean>) bool3);
            DataKey<Boolean> dataKey4 = Parser.HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE;
            Boolean bool4 = Boolean.FALSE;
            mutableDataHolder3.set((DataKey<DataKey<Boolean>>) dataKey4, (DataKey<Boolean>) bool4).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS, (DataKey<Boolean>) bool4).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED, (DataKey<Boolean>) bool3).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG, (DataKey<Boolean>) bool4).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS, (DataKey<Boolean>) bool3).set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) bool3).set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) bool4);
            return mutableDataHolder;
        }
        if (this == GITHUB_DOC) {
            getOptions(mutableDataHolder).setIn(mutableDataHolder);
            DataKey<Boolean> dataKey5 = Parser.BLOCK_QUOTE_IGNORE_BLANK_LINE;
            Boolean bool5 = Boolean.TRUE;
            MutableDataHolder mutableDataHolder4 = mutableDataHolder.set((DataKey<DataKey<Boolean>>) dataKey5, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.BLOCK_QUOTE_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) bool5);
            DataKey<Boolean> dataKey6 = Parser.BLOCK_QUOTE_INTERRUPTS_ITEM_PARAGRAPH;
            Boolean bool6 = Boolean.FALSE;
            mutableDataHolder4.set((DataKey<DataKey<Boolean>>) dataKey6, (DataKey<Boolean>) bool6).set((DataKey<DataKey<Boolean>>) Parser.HEADING_NO_LEAD_SPACE, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSER, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_NON_BLOCK, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE, (DataKey<Boolean>) bool6).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG, (DataKey<Boolean>) bool6).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS, (DataKey<Boolean>) bool6).set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) bool5).set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) bool6).set((DataKey<DataKey<String>>) HtmlRenderer.HEADER_ID_GENERATOR_TO_DASH_CHARS, (DataKey<String>) " -").set((DataKey<DataKey<String>>) HtmlRenderer.HEADER_ID_GENERATOR_NON_DASH_CHARS, (DataKey<String>) "_").set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_GENERATOR_NON_ASCII_TO_LOWERCASE, (DataKey<Boolean>) bool6);
            return mutableDataHolder;
        }
        if (this == GITHUB) {
            getOptions(mutableDataHolder).setIn(mutableDataHolder);
            MutableDataHolder mutableDataHolder5 = mutableDataHolder.set((DataKey<DataKey<String>>) HtmlRenderer.HEADER_ID_GENERATOR_TO_DASH_CHARS, (DataKey<String>) " -").set((DataKey<DataKey<String>>) HtmlRenderer.HEADER_ID_GENERATOR_NON_DASH_CHARS, (DataKey<String>) "_");
            DataKey<Boolean> dataKey7 = HtmlRenderer.HEADER_ID_GENERATOR_NON_ASCII_TO_LOWERCASE;
            Boolean bool7 = Boolean.FALSE;
            mutableDataHolder5.set((DataKey<DataKey<Boolean>>) dataKey7, (DataKey<Boolean>) bool7).set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_REF_TEXT_TRIM_TRAILING_SPACES, (DataKey<Boolean>) bool7).set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_ADD_EMOJI_SHORTCUT, (DataKey<Boolean>) Boolean.TRUE);
            return mutableDataHolder;
        }
        if (this == MULTI_MARKDOWN) {
            getOptions(mutableDataHolder).setIn(mutableDataHolder);
            DataKey<Boolean> dataKey8 = Parser.BLOCK_QUOTE_IGNORE_BLANK_LINE;
            Boolean bool8 = Boolean.TRUE;
            MutableDataHolder mutableDataHolder6 = mutableDataHolder.set((DataKey<DataKey<Boolean>>) dataKey8, (DataKey<Boolean>) bool8);
            DataKey<Boolean> dataKey9 = Parser.BLOCK_QUOTE_WITH_LEAD_SPACES_INTERRUPTS_ITEM_PARAGRAPH;
            Boolean bool9 = Boolean.FALSE;
            mutableDataHolder6.set((DataKey<DataKey<Boolean>>) dataKey9, (DataKey<Boolean>) bool9).set((DataKey<DataKey<Boolean>>) HtmlRenderer.RENDER_HEADER_ID, (DataKey<Boolean>) bool8).set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_GENERATOR_RESOLVE_DUPES, (DataKey<Boolean>) bool9).set((DataKey<DataKey<String>>) HtmlRenderer.HEADER_ID_GENERATOR_TO_DASH_CHARS, (DataKey<String>) FlexmarkHtmlConverter.DEFAULT_NODE).set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_GENERATOR_NO_DUPED_DASHES, (DataKey<Boolean>) bool8).set((DataKey<DataKey<String>>) HtmlRenderer.SOFT_BREAK, (DataKey<String>) SequenceUtils.SPACE).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSER, (DataKey<Boolean>) bool8).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_NON_BLOCK, (DataKey<Boolean>) bool8).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE, (DataKey<Boolean>) bool9).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS, (DataKey<Boolean>) bool9).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED, (DataKey<Boolean>) bool8).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG, (DataKey<Boolean>) bool9).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS, (DataKey<Boolean>) bool8).set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) bool8).set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) bool9);
            return mutableDataHolder;
        }
        if (this != PEGDOWN && this != PEGDOWN_STRICT) {
            if (this != COMMONMARK_0_26 && this != COMMONMARK_0_27) {
                return mutableDataHolder;
            }
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) Boolean.TRUE);
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) Boolean.FALSE);
            return mutableDataHolder;
        }
        int intValue = PEGDOWN_EXTENSIONS.get(mutableDataHolder).intValue();
        getOptions(mutableDataHolder).setIn(mutableDataHolder);
        DataKey<Boolean> dataKey10 = Parser.BLOCK_QUOTE_EXTEND_TO_BLANK_LINE;
        Boolean bool10 = Boolean.TRUE;
        MutableDataHolder mutableDataHolder7 = mutableDataHolder.set((DataKey<DataKey<Boolean>>) dataKey10, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.BLOCK_QUOTE_IGNORE_BLANK_LINE, (DataKey<Boolean>) bool10);
        DataKey<Boolean> dataKey11 = Parser.BLOCK_QUOTE_ALLOW_LEADING_SPACE;
        Boolean bool11 = Boolean.FALSE;
        mutableDataHolder7.set((DataKey<DataKey<Boolean>>) dataKey11, (DataKey<Boolean>) bool11).set((DataKey<DataKey<Boolean>>) Parser.INDENTED_CODE_NO_TRAILING_BLANK_LINES, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Integer>>) Parser.HEADING_SETEXT_MARKER_LENGTH, (DataKey<Integer>) 3).set((DataKey<DataKey<Boolean>>) Parser.HEADING_NO_LEAD_SPACE, (DataKey<Boolean>) bool10).set((DataKey<DataKey<KeepType>>) Parser.REFERENCES_KEEP, (DataKey<KeepType>) KeepType.LAST).set((DataKey<DataKey<Boolean>>) Parser.PARSE_INNER_HTML_COMMENTS, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.SPACE_IN_LINK_ELEMENTS, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) HtmlRenderer.OBFUSCATE_EMAIL, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) HtmlRenderer.GENERATE_HEADER_ID, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_GENERATOR_NO_DUPED_DASHES, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) HtmlRenderer.HEADER_ID_GENERATOR_RESOLVE_DUPES, (DataKey<Boolean>) bool11).set((DataKey<DataKey<String>>) HtmlRenderer.SOFT_BREAK, (DataKey<String>) SequenceUtils.SPACE).set((DataKey<DataKey<Boolean>>) Parser.STRONG_WRAPS_EMPHASIS, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.LINKS_ALLOW_MATCHED_PARENTHESES, (DataKey<Boolean>) bool11);
        if (haveAny(intValue, PegdownExtensions.ANCHORLINKS)) {
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) HtmlRenderer.RENDER_HEADER_ID, (DataKey<Boolean>) bool11);
        }
        if (this == PEGDOWN_STRICT) {
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSER, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_NON_BLOCK, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE, (DataKey<Boolean>) bool11).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS, (DataKey<Boolean>) bool11).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG, (DataKey<Boolean>) bool11).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS, (DataKey<Boolean>) bool11);
            return mutableDataHolder;
        }
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSER, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_NON_BLOCK, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_FIRST_OPEN_TAG_ON_ONE_LINE, (DataKey<Boolean>) bool11).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_MARKDOWN_INTERRUPTS_CLOSED, (DataKey<Boolean>) bool10).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_BLANK_LINE_INTERRUPTS_PARTIAL_TAG, (DataKey<Boolean>) bool11).set((DataKey<DataKey<Boolean>>) Parser.HTML_BLOCK_DEEP_PARSE_INDENTED_CODE_INTERRUPTS, (DataKey<Boolean>) bool11);
        return mutableDataHolder;
    }

    public MutableListOptions getOptions(DataHolder dataHolder) {
        ParserEmulationProfile parserEmulationProfile = this.family;
        if (parserEmulationProfile == FIXED_INDENT) {
            if (this == MULTI_MARKDOWN) {
                return new MutableListOptions().setParserEmulationFamily(this).setAutoLoose(true).setAutoLooseOneLevelLists(true).setDelimiterMismatchToNewList(false).setCodeIndent(8).setEndOnDoubleBlank(false).setItemIndent(4).setItemInterrupt(new ListOptions.MutableItemInterrupt().setBulletItemInterruptsParagraph(false).setOrderedItemInterruptsParagraph(false).setOrderedNonOneItemInterruptsParagraph(false).setEmptyBulletItemInterruptsParagraph(false).setEmptyOrderedItemInterruptsParagraph(false).setEmptyOrderedNonOneItemInterruptsParagraph(false).setBulletItemInterruptsItemParagraph(true).setOrderedItemInterruptsItemParagraph(true).setOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletItemInterruptsItemParagraph(true).setEmptyOrderedItemInterruptsItemParagraph(true).setEmptyOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletSubItemInterruptsItemParagraph(true).setEmptyOrderedSubItemInterruptsItemParagraph(true).setEmptyOrderedNonOneSubItemInterruptsItemParagraph(true)).setItemMarkerSpace(false).setItemTypeMismatchToNewList(false).setItemTypeMismatchToSubList(false).setLooseWhenBlankLineFollowsItemParagraph(true).setLooseWhenHasTrailingBlankLine(false).setLooseWhenHasNonListChildren(true).setNewItemCodeIndent(TableCell.NOT_TRACKED).setOrderedItemDotOnly(true).setOrderedListManualStart(false);
            }
            if (this != PEGDOWN && this != PEGDOWN_STRICT) {
                return new MutableListOptions().setParserEmulationFamily(this).setAutoLoose(false).setAutoLooseOneLevelLists(false).setLooseWhenBlankLineFollowsItemParagraph(false).setLooseWhenHasLooseSubItem(false).setLooseWhenHasTrailingBlankLine(true).setLooseWhenPrevHasTrailingBlankLine(false).setLooseWhenLastItemPrevHasTrailingBlankLine(true).setOrderedListManualStart(false).setDelimiterMismatchToNewList(false).setItemTypeMismatchToNewList(false).setItemTypeMismatchToSubList(false).setEndOnDoubleBlank(false).setOrderedItemDotOnly(true).setItemMarkerSpace(true).setItemIndent(4).setCodeIndent(8).setNewItemCodeIndent(TableCell.NOT_TRACKED).setItemInterrupt(new ListOptions.MutableItemInterrupt().setBulletItemInterruptsParagraph(false).setOrderedItemInterruptsParagraph(false).setOrderedNonOneItemInterruptsParagraph(false).setEmptyBulletItemInterruptsParagraph(false).setEmptyOrderedItemInterruptsParagraph(false).setEmptyOrderedNonOneItemInterruptsParagraph(false).setBulletItemInterruptsItemParagraph(true).setOrderedItemInterruptsItemParagraph(true).setOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletItemInterruptsItemParagraph(true).setEmptyOrderedItemInterruptsItemParagraph(true).setEmptyOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletSubItemInterruptsItemParagraph(true).setEmptyOrderedSubItemInterruptsItemParagraph(true).setEmptyOrderedNonOneSubItemInterruptsItemParagraph(true));
            }
            return new MutableListOptions().setParserEmulationFamily(this).setAutoLoose(false).setAutoLooseOneLevelLists(false).setLooseWhenBlankLineFollowsItemParagraph(false).setLooseWhenHasLooseSubItem(false).setLooseWhenHasTrailingBlankLine(false).setLooseWhenPrevHasTrailingBlankLine(true).setOrderedListManualStart(false).setDelimiterMismatchToNewList(false).setItemTypeMismatchToNewList(true).setItemTypeMismatchToSubList(false).setEndOnDoubleBlank(false).setOrderedItemDotOnly(true).setItemMarkerSpace(true).setItemIndent(4).setCodeIndent(8).setNewItemCodeIndent(TableCell.NOT_TRACKED).setItemInterrupt(new ListOptions.MutableItemInterrupt().setBulletItemInterruptsParagraph(false).setOrderedItemInterruptsParagraph(false).setOrderedNonOneItemInterruptsParagraph(false).setEmptyBulletItemInterruptsParagraph(false).setEmptyOrderedItemInterruptsParagraph(false).setEmptyOrderedNonOneItemInterruptsParagraph(false).setBulletItemInterruptsItemParagraph(true).setOrderedItemInterruptsItemParagraph(true).setOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletItemInterruptsItemParagraph(true).setEmptyOrderedItemInterruptsItemParagraph(true).setEmptyOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletSubItemInterruptsItemParagraph(true).setEmptyOrderedSubItemInterruptsItemParagraph(true).setEmptyOrderedNonOneSubItemInterruptsItemParagraph(true));
        }
        if (parserEmulationProfile == KRAMDOWN) {
            return new MutableListOptions().setParserEmulationFamily(this).setAutoLoose(false).setLooseWhenBlankLineFollowsItemParagraph(true).setLooseWhenHasLooseSubItem(false).setLooseWhenHasTrailingBlankLine(false).setLooseWhenPrevHasTrailingBlankLine(false).setOrderedListManualStart(false).setDelimiterMismatchToNewList(false).setItemTypeMismatchToNewList(true).setItemTypeMismatchToSubList(true).setOrderedItemDotOnly(true).setItemMarkerSpace(true).setEndOnDoubleBlank(false).setItemIndent(4).setCodeIndent(8).setNewItemCodeIndent(TableCell.NOT_TRACKED).setItemInterrupt(new ListOptions.MutableItemInterrupt().setBulletItemInterruptsParagraph(false).setOrderedItemInterruptsParagraph(false).setOrderedNonOneItemInterruptsParagraph(false).setEmptyBulletItemInterruptsParagraph(false).setEmptyOrderedItemInterruptsParagraph(false).setEmptyOrderedNonOneItemInterruptsParagraph(false).setBulletItemInterruptsItemParagraph(true).setOrderedItemInterruptsItemParagraph(true).setOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletItemInterruptsItemParagraph(true).setEmptyOrderedItemInterruptsItemParagraph(true).setEmptyOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletSubItemInterruptsItemParagraph(false).setEmptyOrderedSubItemInterruptsItemParagraph(false).setEmptyOrderedNonOneSubItemInterruptsItemParagraph(false));
        }
        if (parserEmulationProfile == MARKDOWN) {
            if (this == GITHUB_DOC) {
                return new MutableListOptions().setParserEmulationFamily(this).setAutoLoose(false).setLooseWhenBlankLineFollowsItemParagraph(true).setLooseWhenHasLooseSubItem(true).setLooseWhenHasTrailingBlankLine(true).setLooseWhenPrevHasTrailingBlankLine(true).setLooseWhenContainsBlankLine(false).setLooseWhenHasNonListChildren(true).setOrderedListManualStart(false).setDelimiterMismatchToNewList(false).setItemTypeMismatchToNewList(false).setItemTypeMismatchToSubList(false).setEndOnDoubleBlank(false).setOrderedItemDotOnly(true).setItemMarkerSpace(true).setItemIndent(4).setCodeIndent(8).setNewItemCodeIndent(TableCell.NOT_TRACKED).setItemInterrupt(new ListOptions.MutableItemInterrupt().setBulletItemInterruptsParagraph(true).setOrderedItemInterruptsParagraph(false).setOrderedNonOneItemInterruptsParagraph(false).setEmptyBulletItemInterruptsParagraph(true).setEmptyOrderedItemInterruptsParagraph(false).setEmptyOrderedNonOneItemInterruptsParagraph(false).setBulletItemInterruptsItemParagraph(true).setOrderedItemInterruptsItemParagraph(true).setOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletItemInterruptsItemParagraph(true).setEmptyOrderedItemInterruptsItemParagraph(true).setEmptyOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletSubItemInterruptsItemParagraph(true).setEmptyOrderedSubItemInterruptsItemParagraph(true).setEmptyOrderedNonOneSubItemInterruptsItemParagraph(true));
            }
            return new MutableListOptions().setParserEmulationFamily(this).setAutoLoose(false).setLooseWhenBlankLineFollowsItemParagraph(true).setLooseWhenHasLooseSubItem(true).setLooseWhenHasTrailingBlankLine(true).setLooseWhenPrevHasTrailingBlankLine(true).setLooseWhenContainsBlankLine(true).setOrderedListManualStart(false).setDelimiterMismatchToNewList(false).setItemTypeMismatchToNewList(false).setItemTypeMismatchToSubList(false).setEndOnDoubleBlank(false).setOrderedItemDotOnly(true).setItemMarkerSpace(true).setItemIndent(4).setCodeIndent(8).setNewItemCodeIndent(TableCell.NOT_TRACKED).setItemInterrupt(new ListOptions.MutableItemInterrupt().setBulletItemInterruptsParagraph(false).setOrderedItemInterruptsParagraph(false).setOrderedNonOneItemInterruptsParagraph(false).setEmptyBulletItemInterruptsParagraph(false).setEmptyOrderedItemInterruptsParagraph(false).setEmptyOrderedNonOneItemInterruptsParagraph(false).setBulletItemInterruptsItemParagraph(true).setOrderedItemInterruptsItemParagraph(true).setOrderedNonOneItemInterruptsItemParagraph(true).setEmptyBulletItemInterruptsItemParagraph(false).setEmptyOrderedItemInterruptsItemParagraph(false).setEmptyOrderedNonOneItemInterruptsItemParagraph(false).setEmptyBulletSubItemInterruptsItemParagraph(true).setEmptyOrderedSubItemInterruptsItemParagraph(true).setEmptyOrderedNonOneSubItemInterruptsItemParagraph(true));
        }
        if (parserEmulationProfile == COMMONMARK && this == COMMONMARK_0_26) {
            return new MutableListOptions((DataHolder) null).setEndOnDoubleBlank(true);
        }
        return new MutableListOptions((DataHolder) null);
    }
}
