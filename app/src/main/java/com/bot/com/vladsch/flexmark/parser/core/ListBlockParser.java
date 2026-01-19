package com.vladsch.flexmark.parser.core;

import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.ListBlock;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.util.Parsing;
import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.ParserEmulationProfile;
import com.vladsch.flexmark.parser.block.AbstractBlockParser;
import com.vladsch.flexmark.parser.block.AbstractBlockParserFactory;
import com.vladsch.flexmark.parser.block.BlockContinue;
import com.vladsch.flexmark.parser.block.BlockParser;
import com.vladsch.flexmark.parser.block.BlockParserFactory;
import com.vladsch.flexmark.parser.block.BlockStart;
import com.vladsch.flexmark.parser.block.CustomBlockParserFactory;
import com.vladsch.flexmark.parser.block.MatchedBlockParser;
import com.vladsch.flexmark.parser.block.ParserState;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.parser.core.FencedCodeBlockParser;
import com.vladsch.flexmark.parser.core.HeadingParser;
import com.vladsch.flexmark.parser.core.HtmlBlockParser;
import com.vladsch.flexmark.parser.core.IndentedCodeBlockParser;
import com.vladsch.flexmark.parser.core.ThematicBreakParser;
import com.vladsch.flexmark.util.ast.BlankLine;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.SharedDataKeys;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInCharsHandler;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class ListBlockParser extends AbstractBlockParser {
    private final ListBlock myBlock;
    BasedSequence myItemHandledLine = null;
    boolean myItemHandledNewItemLine;
    boolean myItemHandledNewListLine;
    boolean myItemHandledSkipActiveLine;
    ListItemParser myLastChild;
    private final ListData myListData;
    private final ListOptions myOptions;

    /* loaded from: classes.dex */
    public static class BlockFactory extends AbstractBlockParserFactory {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final ListOptions myOptions;

        public BlockFactory(DataHolder dataHolder) {
            super(dataHolder);
            this.myOptions = ListOptions.get(dataHolder);
        }

        @Override // com.vladsch.flexmark.parser.block.BlockParserFactory
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            BlockParser blockParser = matchedBlockParser.getBlockParser();
            ParserEmulationProfile parserEmulationProfile = this.myOptions.getParserEmulationProfile().family;
            int newItemCodeIndent = this.myOptions.getNewItemCodeIndent();
            if (blockParser instanceof ListBlockParser) {
                ListBlockParser listBlockParser = (ListBlockParser) blockParser;
                if (parserState.getLine() != listBlockParser.myItemHandledLine) {
                    return BlockStart.none();
                }
                if (listBlockParser.myItemHandledNewListLine) {
                    ListData parseListMarker = ListBlockParser.parseListMarker(this.myOptions, newItemCodeIndent, parserState);
                    ListItemParser listItemParser = new ListItemParser(this.myOptions, parserState.getParsing(), parseListMarker);
                    return BlockStart.of(new ListBlockParser(this.myOptions, parseListMarker, listItemParser), listItemParser).atColumn(parseListMarker.listMarker.length() + parseListMarker.markerColumn + parseListMarker.contentOffset);
                }
                if (!listBlockParser.myItemHandledNewItemLine) {
                    listBlockParser.myItemHandledLine = null;
                    return BlockStart.none();
                }
                ListData parseListMarker2 = ListBlockParser.parseListMarker(this.myOptions, newItemCodeIndent, parserState);
                ListItemParser listItemParser2 = new ListItemParser(this.myOptions, parserState.getParsing(), parseListMarker2);
                int length = parseListMarker2.listMarker.length() + parseListMarker2.markerColumn + parseListMarker2.contentOffset;
                listBlockParser.myLastChild = listItemParser2;
                return BlockStart.of(listItemParser2).atColumn(length);
            }
            ListBlock listBlock = (ListBlock) blockParser.getBlock().getAncestorOfType(ListBlock.class);
            if (listBlock != null) {
                ListBlockParser listBlockParser2 = (ListBlockParser) parserState.getActiveBlockParser(listBlock);
                if (listBlockParser2.myItemHandledLine == parserState.getLine() && listBlockParser2.myItemHandledSkipActiveLine) {
                    listBlockParser2.myItemHandledLine = null;
                    return BlockStart.none();
                }
            }
            if (parserEmulationProfile == ParserEmulationProfile.COMMONMARK) {
                if (parserState.getIndent() >= this.myOptions.getCodeIndent()) {
                    return BlockStart.none();
                }
            } else if (parserEmulationProfile == ParserEmulationProfile.FIXED_INDENT) {
                if (parserState.getIndent() >= this.myOptions.getItemIndent()) {
                    return BlockStart.none();
                }
            } else if (parserEmulationProfile == ParserEmulationProfile.KRAMDOWN) {
                if (parserState.getIndent() >= this.myOptions.getItemIndent()) {
                    return BlockStart.none();
                }
            } else if (parserEmulationProfile == ParserEmulationProfile.MARKDOWN && parserState.getIndent() >= this.myOptions.getItemIndent()) {
                return BlockStart.none();
            }
            ListData parseListMarker3 = ListBlockParser.parseListMarker(this.myOptions, newItemCodeIndent, parserState);
            if (parseListMarker3 == null) {
                return BlockStart.none();
            }
            int length2 = parseListMarker3.listMarker.length() + parseListMarker3.markerColumn + parseListMarker3.contentOffset;
            boolean isParagraphParser = blockParser.isParagraphParser();
            boolean z5 = isParagraphParser && (blockParser.getBlock().getParent() instanceof ListItem) && blockParser.getBlock() == blockParser.getBlock().getParent().getFirstChild();
            if (isParagraphParser && !this.myOptions.canInterrupt(parseListMarker3.listBlock, parseListMarker3.isEmpty, z5)) {
                return BlockStart.none();
            }
            ListItemParser listItemParser3 = new ListItemParser(this.myOptions, parserState.getParsing(), parseListMarker3);
            return BlockStart.of(new ListBlockParser(this.myOptions, parseListMarker3, listItemParser3), listItemParser3).atColumn(length2);
        }
    }

    /* loaded from: classes.dex */
    public static class Factory implements CustomBlockParserFactory {
        @Override // com.vladsch.flexmark.util.dependency.Dependent
        public boolean affectsGlobalScope() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getAfterDependents() {
            return new HashSet(Arrays.asList(BlockQuoteParser.Factory.class, HeadingParser.Factory.class, FencedCodeBlockParser.Factory.class, HtmlBlockParser.Factory.class, ThematicBreakParser.Factory.class));
        }

        @Override // com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getBeforeDependents() {
            HashSet hashSet = new HashSet();
            hashSet.add(IndentedCodeBlockParser.Factory.class);
            return hashSet;
        }

        @Override // com.vladsch.flexmark.parser.block.CustomBlockParserFactory
        public SpecialLeadInHandler getLeadInHandler(DataHolder dataHolder) {
            return ListItemLeadInHandler.create(Parser.LISTS_ITEM_PREFIX_CHARS.get(dataHolder), Parser.LISTS_ORDERED_ITEM_DOT_ONLY.get(dataHolder).booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.parser.block.CustomBlockParserFactory, java.util.function.Function
        public BlockParserFactory apply(DataHolder dataHolder) {
            return new BlockFactory(dataHolder);
        }
    }

    /* loaded from: classes.dex */
    public static class ListData {
        final int contentOffset;
        final boolean isEmpty;
        final boolean isNumberedList;
        final ListBlock listBlock;
        final BasedSequence listMarker;
        final int markerColumn;
        final int markerIndent;
        final int markerIndex;
        final BasedSequence markerSuffix;
        final int markerSuffixOffset;

        public ListData(ListBlock listBlock, boolean z5, int i6, int i7, int i8, int i9, BasedSequence basedSequence, boolean z6, BasedSequence basedSequence2, int i10) {
            this.listBlock = listBlock;
            this.isEmpty = z5;
            this.markerIndex = i6;
            this.markerColumn = i7;
            this.markerIndent = i8;
            this.contentOffset = i9;
            this.listMarker = basedSequence;
            this.isNumberedList = z6;
            this.markerSuffix = basedSequence2;
            this.markerSuffixOffset = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class ListItemLeadInHandler extends SpecialLeadInCharsHandler {
        static final SpecialLeadInHandler ORDERED_DELIM_DOT_HANDLER;
        static final SpecialLeadInHandler ORDERED_DELIM_DOT_PARENS_HANDLER;
        final CharPredicate orderedDelims;
        static final CharPredicate ORDERED_DELIM_DOT = CharPredicate.anyOf('.');
        static final CharPredicate ORDERED_DELIM_DOT_PARENS = CharPredicate.anyOf(".)");

        static {
            DataKey<String> dataKey = Parser.LISTS_ITEM_PREFIX_CHARS;
            ORDERED_DELIM_DOT_HANDLER = new ListItemLeadInHandler(dataKey.getDefaultValue(), true);
            ORDERED_DELIM_DOT_PARENS_HANDLER = new ListItemLeadInHandler(dataKey.getDefaultValue(), false);
        }

        public ListItemLeadInHandler(CharSequence charSequence, boolean z5) {
            super(CharPredicate.anyOf(charSequence));
            this.orderedDelims = z5 ? ORDERED_DELIM_DOT : ORDERED_DELIM_DOT_PARENS;
        }

        public static SpecialLeadInHandler create(CharSequence charSequence, boolean z5) {
            return SequenceUtils.equals(Parser.LISTS_ITEM_PREFIX_CHARS.getDefaultValue(), charSequence) ? z5 ? ORDERED_DELIM_DOT_HANDLER : ORDERED_DELIM_DOT_PARENS_HANDLER : new ListItemLeadInHandler(charSequence, z5);
        }

        @Override // com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInCharsHandler, com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler
        public boolean escape(BasedSequence basedSequence, DataHolder dataHolder, Consumer<CharSequence> consumer) {
            int indexOfAnyNot;
            if (super.escape(basedSequence, dataHolder, consumer)) {
                return true;
            }
            if (!SharedDataKeys.ESCAPE_NUMBERED_LEAD_IN.get(dataHolder).booleanValue() || (indexOfAnyNot = basedSequence.indexOfAnyNot(CharPredicate.DECIMAL_DIGITS)) <= 0 || indexOfAnyNot + 1 != basedSequence.length() || !this.orderedDelims.test(basedSequence.charAt(indexOfAnyNot))) {
                return false;
            }
            consumer.accept(basedSequence.subSequence(0, indexOfAnyNot));
            consumer.accept("\\");
            consumer.accept(basedSequence.subSequence(indexOfAnyNot));
            return true;
        }

        @Override // com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInCharsHandler, com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler
        public boolean unEscape(BasedSequence basedSequence, DataHolder dataHolder, Consumer<CharSequence> consumer) {
            if (super.unEscape(basedSequence, dataHolder, consumer)) {
                return true;
            }
            int indexOfAnyNot = basedSequence.indexOfAnyNot(CharPredicate.DECIMAL_DIGITS);
            if (indexOfAnyNot > 0 && indexOfAnyNot + 2 == basedSequence.length() && basedSequence.charAt(indexOfAnyNot) == '\\') {
                int i6 = indexOfAnyNot + 1;
                if (this.orderedDelims.test(basedSequence.charAt(i6))) {
                    consumer.accept(basedSequence.subSequence(0, indexOfAnyNot));
                    consumer.accept(basedSequence.subSequence(i6));
                    return true;
                }
            }
            return false;
        }
    }

    public ListBlockParser(ListOptions listOptions, ListData listData, ListItemParser listItemParser) {
        this.myLastChild = null;
        this.myOptions = listOptions;
        this.myListData = listData;
        ListBlock listBlock = listData.listBlock;
        this.myBlock = listBlock;
        listBlock.setTight(true);
        this.myLastChild = listItemParser;
        this.myItemHandledNewListLine = false;
        this.myItemHandledNewItemLine = false;
        this.myItemHandledSkipActiveLine = false;
    }

    private static ListBlock createListBlock(Matcher matcher) {
        String group = matcher.group(1);
        if (group != null) {
            BulletList bulletList = new BulletList();
            bulletList.setOpeningMarker(group.charAt(0));
            return bulletList;
        }
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);
        OrderedList orderedList = new OrderedList();
        orderedList.setStartNumber(Integer.parseInt(group2));
        orderedList.setDelimiter(group3.charAt(0));
        return orderedList;
    }

    private void finalizeListTight(ParserState parserState) {
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = false;
        for (Node firstChild = getBlock().getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            boolean z10 = firstChild instanceof ListItem;
            if (z10) {
                ListItem listItem = (ListItem) firstChild;
                boolean z11 = listItem.isHadBlankAfterItemParagraph() && !(firstChild.getNext() == null && (firstChild.getFirstChild() == null || firstChild.getFirstChild().getNext() == null));
                boolean isContainsBlankLine = listItem.isContainsBlankLine();
                z6 = parserState.endsWithBlankLine(firstChild) && firstChild.getNext() != null;
                z5 = (z6 && this.myOptions.isLooseWhenHasTrailingBlankLine()) || (z11 && this.myOptions.isLooseWhenBlankLineFollowsItemParagraph()) || ((isContainsBlankLine && this.myOptions.isLooseWhenContainsBlankLine()) || ((hasNonItemChildren(listItem) && this.myOptions.isLooseWhenHasNonListChildren()) || (((z6 && firstChild.getPrevious() == null) || z9) && (this.myOptions.isLooseWhenPrevHasTrailingBlankLine() || (this.myOptions.isLooseWhenLastItemPrevHasTrailingBlankLine() && firstChild.getNext() == null)))));
                if (z5) {
                    listItem.setLoose(true);
                    z7 = false;
                }
            } else {
                z5 = false;
                z6 = false;
            }
            for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNext()) {
                if (parserState.endsWithBlankLine(firstChild2) && (firstChild.getNext() != null || firstChild2.getNext() != null)) {
                    if (firstChild2 == firstChild.getLastChild()) {
                        z6 = true;
                    }
                    if (!z5) {
                        if (this.myOptions.isLooseWhenHasTrailingBlankLine()) {
                            z7 = false;
                        }
                        if (z6 && firstChild.getPrevious() == null && this.myOptions.isLooseWhenPrevHasTrailingBlankLine()) {
                            ((ListItem) firstChild).setLoose(true);
                            z5 = true;
                            z7 = false;
                        }
                    }
                }
                if (firstChild2 instanceof ListBlock) {
                    if (!z5 && this.myOptions.isLooseWhenHasLooseSubItem()) {
                        ReversiblePeekingIterator<Node> childIterator = firstChild2.getChildIterator();
                        while (childIterator.hasNext()) {
                            if (!((ListItem) childIterator.next()).isTight()) {
                                ((ListItem) firstChild).setLoose(true);
                                z8 = true;
                                z5 = true;
                                z7 = false;
                                break;
                            }
                        }
                    }
                    z8 = true;
                }
                if (!this.myOptions.isLooseWhenHasLooseSubItem() ? z7 || (!z8 && this.myOptions.isAutoLooseOneLevelLists()) : !z5 || (!z8 && this.myOptions.isAutoLooseOneLevelLists())) {
                    break;
                }
            }
            if (z10) {
                z9 = z6;
            }
        }
        if (!this.myOptions.isAutoLoose() || !this.myOptions.isAutoLooseOneLevelLists()) {
            if (!this.myOptions.isAutoLoose() || z7) {
                return;
            }
            setTight(false);
            return;
        }
        if (z8 || getBlock().getAncestorOfType(ListBlock.class) != null || z7) {
            return;
        }
        setTight(false);
    }

    private static boolean hasNonItemChildren(ListItem listItem) {
        if (listItem.hasChildren()) {
            ReversiblePeekingIterator<Node> it = listItem.getChildren().iterator();
            int i6 = 0;
            while (it.hasNext()) {
                if (!(it.next() instanceof ListBlock) && (i6 = i6 + 1) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ListData parseListMarker(ListOptions listOptions, int i6, ParserState parserState) {
        boolean z5;
        Matcher matcher;
        ListBlock listBlock;
        int i7;
        int i8;
        boolean z6;
        Parsing parsing = parserState.getParsing();
        BasedSequence line = parserState.getLine();
        int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
        int indent = parserState.getIndent() + parserState.getColumn();
        int indent2 = parserState.getIndent();
        BasedSequence subSequence = line.subSequence(nextNonSpaceIndex, line.length());
        Matcher matcher2 = parsing.LIST_ITEM_MARKER.matcher(subSequence);
        if (!matcher2.find()) {
            return null;
        }
        ListBlock createListBlock = createListBlock(matcher2);
        int end = matcher2.end() - matcher2.start();
        boolean contains = "+-*".contains(matcher2.group());
        boolean z7 = !contains;
        int i9 = nextNonSpaceIndex + end;
        int i10 = end + indent;
        int i11 = i9;
        int i12 = 0;
        while (true) {
            if (i9 >= line.length()) {
                z5 = false;
                break;
            }
            char charAt = line.charAt(i9);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    z5 = true;
                    break;
                }
                i12++;
                i11++;
            } else {
                i11++;
                i12 = Parsing.columnsToNextTabStop(i10 + i12) + i12;
            }
            i9++;
        }
        BasedSequence basedSequence = BasedSequence.NULL;
        if (!z5 || i12 > i6) {
            matcher = matcher2;
            listBlock = createListBlock;
            i7 = 1;
        } else {
            if (contains || listOptions.isNumberedItemMarkerSuffixed()) {
                String[] itemMarkerSuffixes = listOptions.getItemMarkerSuffixes();
                int length = itemMarkerSuffixes.length;
                matcher = matcher2;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13;
                    String str = itemMarkerSuffixes[i14];
                    int length2 = str.length();
                    if (length2 > 0 && line.matchChars(str, i11)) {
                        if (listOptions.isItemMarkerSpace()) {
                            char midCharAt = line.midCharAt(i11 + length2);
                            listBlock = createListBlock;
                            if (midCharAt != ' ' && midCharAt != '\t') {
                            }
                        } else {
                            listBlock = createListBlock;
                        }
                        int i15 = i11 + length2;
                        basedSequence = line.subSequence(i11, i15);
                        int i16 = i12 + length2;
                        int i17 = i10 + length2;
                        i7 = i16;
                        while (true) {
                            if (i15 >= line.length()) {
                                z6 = false;
                                break;
                            }
                            char charAt2 = line.charAt(i15);
                            if (charAt2 != '\t') {
                                if (charAt2 != ' ') {
                                    z6 = true;
                                    break;
                                }
                                i7++;
                            } else {
                                i7 = Parsing.columnsToNextTabStop(i17 + i7) + i7;
                            }
                            i15++;
                        }
                        if (!z6 || i7 - i16 > i6) {
                            z5 = z6;
                            i7 = i16 + 1;
                        } else {
                            z5 = z6;
                        }
                        i8 = i12;
                        return new ListData(listBlock, !z5, nextNonSpaceIndex, indent, indent2, i7, subSequence.subSequence(matcher.start(), matcher.end()), z7, basedSequence, i8);
                    }
                    listBlock = createListBlock;
                    i13 = i14 + 1;
                    createListBlock = listBlock;
                }
            } else {
                matcher = matcher2;
            }
            listBlock = createListBlock;
            i7 = i12;
        }
        i8 = i7;
        return new ListData(listBlock, !z5, nextNonSpaceIndex, indent, indent2, i7, subSequence.subSequence(matcher.start(), matcher.end()), z7, basedSequence, i8);
    }

    private void setTight(boolean z5) {
        this.myBlock.setTight(z5);
    }

    @Override // com.vladsch.flexmark.parser.block.AbstractBlockParser, com.vladsch.flexmark.parser.block.BlockParser
    public boolean breakOutOnDoubleBlankLine() {
        return this.myOptions.isEndOnDoubleBlank();
    }

    @Override // com.vladsch.flexmark.parser.block.AbstractBlockParser, com.vladsch.flexmark.parser.block.BlockParser
    public boolean canContain(ParserState parserState, BlockParser blockParser, Block block) {
        return block instanceof ListItem;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParser
    public void closeBlock(ParserState parserState) {
        finalizeListTight(parserState);
        if (Parser.BLANK_LINES_IN_AST.get(parserState.getProperties()).booleanValue()) {
            for (Node firstChildAnyNot = getBlock().getFirstChildAnyNot(BlankLine.class); firstChildAnyNot instanceof ListItem; firstChildAnyNot = firstChildAnyNot.getNextAnyNot(BlankLine.class)) {
                firstChildAnyNot.moveTrailingBlankLines();
            }
        }
        this.myBlock.setCharsFromContentOnly();
    }

    public int getContentIndent() {
        ListData listData = this.myListData;
        return listData.listMarker.length() + listData.markerIndent + this.myListData.contentOffset;
    }

    public BasedSequence getItemHandledLine() {
        return this.myItemHandledLine;
    }

    public ListItemParser getLastChild() {
        return this.myLastChild;
    }

    public int getLastContentIndent() {
        return this.myLastChild.getContentIndent();
    }

    public ListData getListData() {
        return this.myListData;
    }

    public ListOptions getOptions() {
        return this.myOptions;
    }

    @Override // com.vladsch.flexmark.parser.block.AbstractBlockParser, com.vladsch.flexmark.parser.block.BlockParser
    public boolean isContainer() {
        return true;
    }

    public void setItemHandledLine(BasedSequence basedSequence) {
        this.myItemHandledLine = basedSequence;
        this.myItemHandledNewListLine = false;
        this.myItemHandledNewItemLine = false;
        this.myItemHandledSkipActiveLine = false;
    }

    public void setItemHandledLineSkipActive(BasedSequence basedSequence) {
        this.myItemHandledLine = basedSequence;
        this.myItemHandledNewListLine = false;
        this.myItemHandledNewItemLine = false;
        this.myItemHandledSkipActiveLine = true;
    }

    public void setItemHandledNewItemLine(BasedSequence basedSequence) {
        this.myItemHandledLine = basedSequence;
        this.myItemHandledNewListLine = false;
        this.myItemHandledNewItemLine = true;
        this.myItemHandledSkipActiveLine = false;
    }

    public void setItemHandledNewListLine(BasedSequence basedSequence) {
        this.myItemHandledLine = basedSequence;
        this.myItemHandledNewListLine = true;
        this.myItemHandledNewItemLine = false;
        this.myItemHandledSkipActiveLine = false;
    }

    public void setLastChild(ListItemParser listItemParser) {
        this.myLastChild = listItemParser;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParser
    public BlockContinue tryContinue(ParserState parserState) {
        return BlockContinue.atIndex(parserState.getIndex());
    }

    @Override // com.vladsch.flexmark.parser.block.BlockParser
    public ListBlock getBlock() {
        return this.myBlock;
    }
}
