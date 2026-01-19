package com.vladsch.flexmark.parser;

import B3.e;
import com.vladsch.flexmark.ast.BulletList;
import com.vladsch.flexmark.ast.ListBlock;
import com.vladsch.flexmark.ast.ListItem;
import com.vladsch.flexmark.ast.OrderedList;
import com.vladsch.flexmark.ast.Paragraph;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSetter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ListOptions implements MutableDataSetter {
    protected boolean autoLoose;
    protected boolean autoLooseOneLevelLists;
    protected int codeIndent;
    protected boolean delimiterMismatchToNewList;
    protected boolean endOnDoubleBlank;
    protected boolean itemContentAfterSuffix;
    protected int itemIndent;
    protected ItemInterrupt itemInterrupt;
    protected boolean itemMarkerSpace;
    protected String[] itemMarkerSuffixes;
    protected String itemPrefixChars;
    protected boolean itemTypeMismatchToNewList;
    protected boolean itemTypeMismatchToSubList;
    protected boolean looseWhenBlankLineFollowsItemParagraph;
    protected boolean looseWhenContainsBlankLine;
    protected boolean looseWhenHasLooseSubItem;
    protected boolean looseWhenHasNonListChildren;
    protected boolean looseWhenHasTrailingBlankLine;
    protected boolean looseWhenLastItemPrevHasTrailingBlankLine;
    protected boolean looseWhenPrevHasTrailingBlankLine;
    protected ParserEmulationProfile myParserEmulationProfile;
    protected int newItemCodeIndent;
    protected boolean numberedItemMarkerSuffixed;
    protected boolean orderedItemDotOnly;
    protected boolean orderedListManualStart;

    /* loaded from: classes.dex */
    public static class MutableItemInterrupt extends ItemInterrupt {
        public MutableItemInterrupt() {
        }

        public boolean isBulletItemInterruptsItemParagraph() {
            return this.bulletItemInterruptsItemParagraph;
        }

        public boolean isBulletItemInterruptsParagraph() {
            return this.bulletItemInterruptsParagraph;
        }

        public boolean isEmptyBulletItemInterruptsItemParagraph() {
            return this.emptyBulletItemInterruptsItemParagraph;
        }

        public boolean isEmptyBulletItemInterruptsParagraph() {
            return this.emptyBulletItemInterruptsParagraph;
        }

        public boolean isEmptyBulletSubItemInterruptsItemParagraph() {
            return this.emptyBulletSubItemInterruptsItemParagraph;
        }

        public boolean isEmptyOrderedItemInterruptsItemParagraph() {
            return this.emptyOrderedItemInterruptsItemParagraph;
        }

        public boolean isEmptyOrderedItemInterruptsParagraph() {
            return this.emptyOrderedItemInterruptsParagraph;
        }

        public boolean isEmptyOrderedNonOneItemInterruptsItemParagraph() {
            return this.emptyOrderedNonOneItemInterruptsItemParagraph;
        }

        public boolean isEmptyOrderedNonOneItemInterruptsParagraph() {
            return this.emptyOrderedNonOneItemInterruptsParagraph;
        }

        public boolean isEmptyOrderedNonOneSubItemInterruptsItemParagraph() {
            return this.emptyOrderedNonOneSubItemInterruptsItemParagraph;
        }

        public boolean isEmptyOrderedSubItemInterruptsItemParagraph() {
            return this.emptyOrderedSubItemInterruptsItemParagraph;
        }

        public boolean isOrderedItemInterruptsItemParagraph() {
            return this.orderedItemInterruptsItemParagraph;
        }

        public boolean isOrderedItemInterruptsParagraph() {
            return this.orderedItemInterruptsParagraph;
        }

        public boolean isOrderedNonOneItemInterruptsItemParagraph() {
            return this.orderedNonOneItemInterruptsItemParagraph;
        }

        public boolean isOrderedNonOneItemInterruptsParagraph() {
            return this.orderedNonOneItemInterruptsParagraph;
        }

        public MutableItemInterrupt setBulletItemInterruptsItemParagraph(boolean z5) {
            this.bulletItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setBulletItemInterruptsParagraph(boolean z5) {
            this.bulletItemInterruptsParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyBulletItemInterruptsItemParagraph(boolean z5) {
            this.emptyBulletItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyBulletItemInterruptsParagraph(boolean z5) {
            this.emptyBulletItemInterruptsParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyBulletSubItemInterruptsItemParagraph(boolean z5) {
            this.emptyBulletSubItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyOrderedItemInterruptsItemParagraph(boolean z5) {
            this.emptyOrderedItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyOrderedItemInterruptsParagraph(boolean z5) {
            this.emptyOrderedItemInterruptsParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyOrderedNonOneItemInterruptsItemParagraph(boolean z5) {
            this.emptyOrderedNonOneItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyOrderedNonOneItemInterruptsParagraph(boolean z5) {
            this.emptyOrderedNonOneItemInterruptsParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyOrderedNonOneSubItemInterruptsItemParagraph(boolean z5) {
            this.emptyOrderedNonOneSubItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setEmptyOrderedSubItemInterruptsItemParagraph(boolean z5) {
            this.emptyOrderedSubItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setOrderedItemInterruptsItemParagraph(boolean z5) {
            this.orderedItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setOrderedItemInterruptsParagraph(boolean z5) {
            this.orderedItemInterruptsParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setOrderedNonOneItemInterruptsItemParagraph(boolean z5) {
            this.orderedNonOneItemInterruptsItemParagraph = z5;
            return this;
        }

        public MutableItemInterrupt setOrderedNonOneItemInterruptsParagraph(boolean z5) {
            this.orderedNonOneItemInterruptsParagraph = z5;
            return this;
        }

        public MutableItemInterrupt(DataHolder dataHolder) {
            super(dataHolder);
        }

        public MutableItemInterrupt(ItemInterrupt itemInterrupt) {
            super(itemInterrupt);
        }
    }

    public ListOptions() {
        this((DataHolder) null);
    }

    public static void addItemMarkerSuffixes(MutableDataHolder mutableDataHolder, String... strArr) {
        String[] strArr2 = Parser.LISTS_ITEM_MARKER_SUFFIXES.get(mutableDataHolder);
        int length = strArr.length;
        int length2 = strArr.length;
        for (String str : strArr2) {
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    break;
                }
                String str2 = strArr[i6];
                if (str2 != null && str2.equals(str)) {
                    length--;
                    strArr[i6] = null;
                    break;
                }
                i6++;
            }
            if (length == 0) {
                break;
            }
        }
        if (length > 0) {
            String[] strArr3 = new String[strArr2.length + length];
            System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
            int length3 = strArr2.length;
            for (String str3 : strArr) {
                if (str3 != null) {
                    strArr3[length3] = str3;
                    length3++;
                }
            }
            mutableDataHolder.set((DataKey<DataKey<String[]>>) Parser.LISTS_ITEM_MARKER_SUFFIXES, (DataKey<String[]>) strArr3);
        }
    }

    public static ListOptions get(DataHolder dataHolder) {
        return new ListOptions(dataHolder);
    }

    @Deprecated
    public static ListOptions getFrom(DataHolder dataHolder) {
        return get(dataHolder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (((com.vladsch.flexmark.ast.OrderedList) r4).getStartNumber() != 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean canInterrupt(com.vladsch.flexmark.ast.ListBlock r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.vladsch.flexmark.ast.OrderedList
            if (r0 == 0) goto L14
            boolean r1 = r3.isOrderedListManualStart()
            r2 = 1
            if (r1 == 0) goto L15
            com.vladsch.flexmark.ast.OrderedList r4 = (com.vladsch.flexmark.ast.OrderedList) r4
            int r4 = r4.getStartNumber()
            if (r4 != r2) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            com.vladsch.flexmark.parser.ListOptions$ItemInterrupt r4 = r3.getItemInterrupt()
            boolean r4 = r4.canInterrupt(r0, r2, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.ListOptions.canInterrupt(com.vladsch.flexmark.ast.ListBlock, boolean, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (((com.vladsch.flexmark.ast.OrderedList) r4).getStartNumber() != 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean canStartSubList(com.vladsch.flexmark.ast.ListBlock r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.vladsch.flexmark.ast.OrderedList
            if (r0 == 0) goto L14
            boolean r1 = r3.isOrderedListManualStart()
            r2 = 1
            if (r1 == 0) goto L15
            com.vladsch.flexmark.ast.OrderedList r4 = (com.vladsch.flexmark.ast.OrderedList) r4
            int r4 = r4.getStartNumber()
            if (r4 != r2) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            com.vladsch.flexmark.parser.ListOptions$ItemInterrupt r4 = r3.getItemInterrupt()
            boolean r4 = r4.canStartSubList(r0, r2, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.ListOptions.canStartSubList(com.vladsch.flexmark.ast.ListBlock, boolean):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOptions)) {
            return false;
        }
        ListOptions listOptions = (ListOptions) obj;
        if (this.myParserEmulationProfile == listOptions.myParserEmulationProfile && this.autoLoose == listOptions.autoLoose && this.autoLooseOneLevelLists == listOptions.autoLooseOneLevelLists && this.delimiterMismatchToNewList == listOptions.delimiterMismatchToNewList && this.endOnDoubleBlank == listOptions.endOnDoubleBlank && this.itemMarkerSpace == listOptions.itemMarkerSpace && this.itemTypeMismatchToNewList == listOptions.itemTypeMismatchToNewList && this.itemTypeMismatchToSubList == listOptions.itemTypeMismatchToSubList && this.looseWhenPrevHasTrailingBlankLine == listOptions.looseWhenPrevHasTrailingBlankLine && this.looseWhenLastItemPrevHasTrailingBlankLine == listOptions.looseWhenLastItemPrevHasTrailingBlankLine && this.looseWhenHasNonListChildren == listOptions.looseWhenHasNonListChildren && this.looseWhenBlankLineFollowsItemParagraph == listOptions.looseWhenBlankLineFollowsItemParagraph && this.looseWhenHasLooseSubItem == listOptions.looseWhenHasLooseSubItem && this.looseWhenHasTrailingBlankLine == listOptions.looseWhenHasTrailingBlankLine && this.looseWhenContainsBlankLine == listOptions.looseWhenContainsBlankLine && this.numberedItemMarkerSuffixed == listOptions.numberedItemMarkerSuffixed && this.orderedItemDotOnly == listOptions.orderedItemDotOnly && this.orderedListManualStart == listOptions.orderedListManualStart && this.codeIndent == listOptions.codeIndent && this.itemIndent == listOptions.itemIndent && this.newItemCodeIndent == listOptions.newItemCodeIndent && this.itemMarkerSuffixes == listOptions.itemMarkerSuffixes && this.itemContentAfterSuffix == listOptions.itemContentAfterSuffix && this.itemPrefixChars.equals(listOptions.itemPrefixChars)) {
            return this.itemInterrupt.equals(listOptions.itemInterrupt);
        }
        return false;
    }

    public int getCodeIndent() {
        return this.codeIndent;
    }

    public int getItemIndent() {
        return this.itemIndent;
    }

    public ItemInterrupt getItemInterrupt() {
        return this.itemInterrupt;
    }

    public String[] getItemMarkerSuffixes() {
        return this.itemMarkerSuffixes;
    }

    public String getItemPrefixChars() {
        return this.itemPrefixChars;
    }

    public MutableListOptions getMutable() {
        return new MutableListOptions(this);
    }

    public int getNewItemCodeIndent() {
        return this.newItemCodeIndent;
    }

    public ParserEmulationProfile getParserEmulationProfile() {
        return this.myParserEmulationProfile;
    }

    public int hashCode() {
        return ((((((e.e((((((((((((((((((((((((((((((((((((((this.itemInterrupt.hashCode() + (this.myParserEmulationProfile.hashCode() * 31)) * 31) + (this.autoLoose ? 1 : 0)) * 31) + (this.autoLooseOneLevelLists ? 1 : 0)) * 31) + (this.delimiterMismatchToNewList ? 1 : 0)) * 31) + (this.endOnDoubleBlank ? 1 : 0)) * 31) + (this.itemMarkerSpace ? 1 : 0)) * 31) + (this.itemTypeMismatchToNewList ? 1 : 0)) * 31) + (this.itemTypeMismatchToSubList ? 1 : 0)) * 31) + (this.looseWhenPrevHasTrailingBlankLine ? 1 : 0)) * 31) + (this.looseWhenLastItemPrevHasTrailingBlankLine ? 1 : 0)) * 31) + (this.looseWhenHasNonListChildren ? 1 : 0)) * 31) + (this.looseWhenBlankLineFollowsItemParagraph ? 1 : 0)) * 31) + (this.looseWhenHasLooseSubItem ? 1 : 0)) * 31) + (this.looseWhenHasTrailingBlankLine ? 1 : 0)) * 31) + (this.looseWhenContainsBlankLine ? 1 : 0)) * 31) + (this.numberedItemMarkerSuffixed ? 1 : 0)) * 31) + (this.orderedItemDotOnly ? 1 : 0)) * 31) + (this.orderedListManualStart ? 1 : 0)) * 31) + (this.itemContentAfterSuffix ? 1 : 0)) * 31, 31, this.itemPrefixChars) + this.codeIndent) * 31) + this.itemIndent) * 31) + this.newItemCodeIndent) * 31) + Arrays.hashCode(this.itemMarkerSuffixes);
    }

    public boolean isAutoLoose() {
        return this.autoLoose;
    }

    public boolean isAutoLooseOneLevelLists() {
        return this.autoLooseOneLevelLists;
    }

    public boolean isDelimiterMismatchToNewList() {
        return this.delimiterMismatchToNewList;
    }

    public boolean isEndOnDoubleBlank() {
        return this.endOnDoubleBlank;
    }

    public boolean isInTightListItem(Paragraph paragraph) {
        Block parent = paragraph.getParent();
        if (!(parent instanceof ListItem)) {
            return false;
        }
        ListItem listItem = (ListItem) parent;
        if (!listItem.isItemParagraph(paragraph)) {
            return false;
        }
        boolean isAutoLoose = isAutoLoose();
        if (isAutoLoose && isAutoLooseOneLevelLists()) {
            return isTightListItem(listItem);
        }
        if (isAutoLoose || !listItem.isParagraphInTightListItem(paragraph)) {
            return isAutoLoose && listItem.isInTightList();
        }
        return true;
    }

    public boolean isItemContentAfterSuffix() {
        return this.itemContentAfterSuffix;
    }

    public boolean isItemMarkerSpace() {
        return this.itemMarkerSpace;
    }

    public boolean isItemTypeMismatchToNewList() {
        return this.itemTypeMismatchToNewList;
    }

    public boolean isItemTypeMismatchToSubList() {
        return this.itemTypeMismatchToSubList;
    }

    public boolean isLooseWhenBlankLineFollowsItemParagraph() {
        return this.looseWhenBlankLineFollowsItemParagraph;
    }

    public boolean isLooseWhenContainsBlankLine() {
        return this.looseWhenContainsBlankLine;
    }

    public boolean isLooseWhenHasLooseSubItem() {
        return this.looseWhenHasLooseSubItem;
    }

    public boolean isLooseWhenHasNonListChildren() {
        return this.looseWhenHasNonListChildren;
    }

    public boolean isLooseWhenHasTrailingBlankLine() {
        return this.looseWhenHasTrailingBlankLine;
    }

    public boolean isLooseWhenLastItemPrevHasTrailingBlankLine() {
        return this.looseWhenLastItemPrevHasTrailingBlankLine;
    }

    public boolean isLooseWhenPrevHasTrailingBlankLine() {
        return this.looseWhenPrevHasTrailingBlankLine;
    }

    public boolean isNumberedItemMarkerSuffixed() {
        return this.numberedItemMarkerSuffixed;
    }

    public boolean isOrderedItemDotOnly() {
        return this.orderedItemDotOnly;
    }

    public boolean isOrderedListManualStart() {
        return this.orderedListManualStart;
    }

    public boolean isTightListItem(ListItem listItem) {
        if (listItem.isLoose()) {
            return false;
        }
        boolean isAutoLoose = isAutoLoose();
        if (!isAutoLoose || !isAutoLooseOneLevelLists()) {
            return listItem.getFirstChild() == null || (!isAutoLoose && listItem.isTight()) || (isAutoLoose && listItem.isInTightList());
        }
        boolean z5 = listItem.getAncestorOfType(ListItem.class) == null && listItem.getChildOfType(ListBlock.class) == null;
        return listItem.getFirstChild() == null || (!z5 && listItem.isTight()) || (z5 && listItem.isInTightList());
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataSetter
    public MutableDataHolder setIn(MutableDataHolder mutableDataHolder) {
        mutableDataHolder.set((DataKey<DataKey<ParserEmulationProfile>>) Parser.PARSER_EMULATION_PROFILE, (DataKey<ParserEmulationProfile>) getParserEmulationProfile());
        getItemInterrupt().setIn(mutableDataHolder);
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_AUTO_LOOSE, (DataKey<Boolean>) Boolean.valueOf(this.autoLoose));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_AUTO_LOOSE_ONE_LEVEL_LISTS, (DataKey<Boolean>) Boolean.valueOf(this.autoLooseOneLevelLists));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_DELIMITER_MISMATCH_TO_NEW_LIST, (DataKey<Boolean>) Boolean.valueOf(this.delimiterMismatchToNewList));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_END_ON_DOUBLE_BLANK, (DataKey<Boolean>) Boolean.valueOf(this.endOnDoubleBlank));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ITEM_MARKER_SPACE, (DataKey<Boolean>) Boolean.valueOf(this.itemMarkerSpace));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ITEM_TYPE_MISMATCH_TO_NEW_LIST, (DataKey<Boolean>) Boolean.valueOf(this.itemTypeMismatchToNewList));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ITEM_TYPE_MISMATCH_TO_SUB_LIST, (DataKey<Boolean>) Boolean.valueOf(this.itemTypeMismatchToSubList));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_PREV_HAS_TRAILING_BLANK_LINE, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenPrevHasTrailingBlankLine));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_LAST_ITEM_PREV_HAS_TRAILING_BLANK_LINE, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenLastItemPrevHasTrailingBlankLine));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_HAS_NON_LIST_CHILDREN, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenHasNonListChildren));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_BLANK_LINE_FOLLOWS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenBlankLineFollowsItemParagraph));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_HAS_LOOSE_SUB_ITEM, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenHasLooseSubItem));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_HAS_TRAILING_BLANK_LINE, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenHasTrailingBlankLine));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_LOOSE_WHEN_CONTAINS_BLANK_LINE, (DataKey<Boolean>) Boolean.valueOf(this.looseWhenContainsBlankLine));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_NUMBERED_ITEM_MARKER_SUFFIXED, (DataKey<Boolean>) Boolean.valueOf(this.numberedItemMarkerSuffixed));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ORDERED_ITEM_DOT_ONLY, (DataKey<Boolean>) Boolean.valueOf(this.orderedItemDotOnly));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ORDERED_LIST_MANUAL_START, (DataKey<Boolean>) Boolean.valueOf(this.orderedListManualStart));
        mutableDataHolder.set((DataKey<DataKey<Integer>>) Parser.LISTS_CODE_INDENT, (DataKey<Integer>) Integer.valueOf(this.codeIndent));
        mutableDataHolder.set((DataKey<DataKey<Integer>>) Parser.LISTS_ITEM_INDENT, (DataKey<Integer>) Integer.valueOf(this.itemIndent));
        mutableDataHolder.set((DataKey<DataKey<Integer>>) Parser.LISTS_NEW_ITEM_CODE_INDENT, (DataKey<Integer>) Integer.valueOf(this.newItemCodeIndent));
        mutableDataHolder.set((DataKey<DataKey<String[]>>) Parser.LISTS_ITEM_MARKER_SUFFIXES, (DataKey<String[]>) this.itemMarkerSuffixes);
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ITEM_CONTENT_AFTER_SUFFIX, (DataKey<Boolean>) Boolean.valueOf(this.itemContentAfterSuffix));
        mutableDataHolder.set((DataKey<DataKey<String>>) Parser.LISTS_ITEM_PREFIX_CHARS, (DataKey<String>) this.itemPrefixChars);
        return mutableDataHolder;
    }

    public boolean startNewList(ListBlock listBlock, ListBlock listBlock2) {
        boolean z5 = listBlock instanceof OrderedList;
        return z5 == (listBlock2 instanceof OrderedList) ? z5 ? isDelimiterMismatchToNewList() && ((OrderedList) listBlock).getDelimiter() != ((OrderedList) listBlock2).getDelimiter() : isDelimiterMismatchToNewList() && ((BulletList) listBlock).getOpeningMarker() != ((BulletList) listBlock2).getOpeningMarker() : isItemTypeMismatchToNewList();
    }

    public boolean startSubList(ListBlock listBlock, ListBlock listBlock2) {
        return (listBlock instanceof OrderedList) != (listBlock2 instanceof OrderedList) && isItemTypeMismatchToSubList();
    }

    private ListOptions(DataHolder dataHolder) {
        this.myParserEmulationProfile = Parser.PARSER_EMULATION_PROFILE.get(dataHolder);
        this.itemInterrupt = new ItemInterrupt(dataHolder);
        this.autoLoose = Parser.LISTS_AUTO_LOOSE.get(dataHolder).booleanValue();
        this.autoLooseOneLevelLists = Parser.LISTS_AUTO_LOOSE_ONE_LEVEL_LISTS.get(dataHolder).booleanValue();
        this.delimiterMismatchToNewList = Parser.LISTS_DELIMITER_MISMATCH_TO_NEW_LIST.get(dataHolder).booleanValue();
        this.endOnDoubleBlank = Parser.LISTS_END_ON_DOUBLE_BLANK.get(dataHolder).booleanValue();
        this.itemMarkerSpace = Parser.LISTS_ITEM_MARKER_SPACE.get(dataHolder).booleanValue();
        this.itemTypeMismatchToNewList = Parser.LISTS_ITEM_TYPE_MISMATCH_TO_NEW_LIST.get(dataHolder).booleanValue();
        this.itemTypeMismatchToSubList = Parser.LISTS_ITEM_TYPE_MISMATCH_TO_SUB_LIST.get(dataHolder).booleanValue();
        this.looseWhenPrevHasTrailingBlankLine = Parser.LISTS_LOOSE_WHEN_PREV_HAS_TRAILING_BLANK_LINE.get(dataHolder).booleanValue();
        this.looseWhenLastItemPrevHasTrailingBlankLine = Parser.LISTS_LOOSE_WHEN_LAST_ITEM_PREV_HAS_TRAILING_BLANK_LINE.get(dataHolder).booleanValue();
        this.looseWhenHasNonListChildren = Parser.LISTS_LOOSE_WHEN_HAS_NON_LIST_CHILDREN.get(dataHolder).booleanValue();
        this.looseWhenBlankLineFollowsItemParagraph = Parser.LISTS_LOOSE_WHEN_BLANK_LINE_FOLLOWS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
        this.looseWhenHasLooseSubItem = Parser.LISTS_LOOSE_WHEN_HAS_LOOSE_SUB_ITEM.get(dataHolder).booleanValue();
        this.looseWhenHasTrailingBlankLine = Parser.LISTS_LOOSE_WHEN_HAS_TRAILING_BLANK_LINE.get(dataHolder).booleanValue();
        this.looseWhenContainsBlankLine = Parser.LISTS_LOOSE_WHEN_CONTAINS_BLANK_LINE.get(dataHolder).booleanValue();
        this.numberedItemMarkerSuffixed = Parser.LISTS_NUMBERED_ITEM_MARKER_SUFFIXED.get(dataHolder).booleanValue();
        this.orderedItemDotOnly = Parser.LISTS_ORDERED_ITEM_DOT_ONLY.get(dataHolder).booleanValue();
        this.orderedListManualStart = Parser.LISTS_ORDERED_LIST_MANUAL_START.get(dataHolder).booleanValue();
        this.itemContentAfterSuffix = Parser.LISTS_ITEM_CONTENT_AFTER_SUFFIX.get(dataHolder).booleanValue();
        this.itemPrefixChars = Parser.LISTS_ITEM_PREFIX_CHARS.get(dataHolder);
        this.codeIndent = Parser.LISTS_CODE_INDENT.get(dataHolder).intValue();
        this.itemIndent = Parser.LISTS_ITEM_INDENT.get(dataHolder).intValue();
        this.newItemCodeIndent = Parser.LISTS_NEW_ITEM_CODE_INDENT.get(dataHolder).intValue();
        this.itemMarkerSuffixes = Parser.LISTS_ITEM_MARKER_SUFFIXES.get(dataHolder);
    }

    /* loaded from: classes.dex */
    public static class ItemInterrupt {
        protected boolean bulletItemInterruptsItemParagraph;
        protected boolean bulletItemInterruptsParagraph;
        protected boolean emptyBulletItemInterruptsItemParagraph;
        protected boolean emptyBulletItemInterruptsParagraph;
        protected boolean emptyBulletSubItemInterruptsItemParagraph;
        protected boolean emptyOrderedItemInterruptsItemParagraph;
        protected boolean emptyOrderedItemInterruptsParagraph;
        protected boolean emptyOrderedNonOneItemInterruptsItemParagraph;
        protected boolean emptyOrderedNonOneItemInterruptsParagraph;
        protected boolean emptyOrderedNonOneSubItemInterruptsItemParagraph;
        protected boolean emptyOrderedSubItemInterruptsItemParagraph;
        protected boolean orderedItemInterruptsItemParagraph;
        protected boolean orderedItemInterruptsParagraph;
        protected boolean orderedNonOneItemInterruptsItemParagraph;
        protected boolean orderedNonOneItemInterruptsParagraph;

        public ItemInterrupt() {
            this.bulletItemInterruptsParagraph = false;
            this.orderedItemInterruptsParagraph = false;
            this.orderedNonOneItemInterruptsParagraph = false;
            this.emptyBulletItemInterruptsParagraph = false;
            this.emptyOrderedItemInterruptsParagraph = false;
            this.emptyOrderedNonOneItemInterruptsParagraph = false;
            this.bulletItemInterruptsItemParagraph = false;
            this.orderedItemInterruptsItemParagraph = false;
            this.orderedNonOneItemInterruptsItemParagraph = false;
            this.emptyBulletItemInterruptsItemParagraph = false;
            this.emptyOrderedItemInterruptsItemParagraph = false;
            this.emptyOrderedNonOneItemInterruptsItemParagraph = false;
            this.emptyBulletSubItemInterruptsItemParagraph = false;
            this.emptyOrderedSubItemInterruptsItemParagraph = false;
            this.emptyOrderedNonOneSubItemInterruptsItemParagraph = false;
        }

        public boolean canInterrupt(boolean z5, boolean z6, boolean z7, boolean z8) {
            return z5 ? z6 ? z8 ? this.orderedItemInterruptsItemParagraph && (!z7 || this.emptyOrderedItemInterruptsItemParagraph) : this.orderedItemInterruptsParagraph && (!z7 || this.emptyOrderedItemInterruptsParagraph) : z8 ? this.orderedNonOneItemInterruptsItemParagraph && (!z7 || this.emptyOrderedNonOneItemInterruptsItemParagraph) : this.orderedNonOneItemInterruptsParagraph && (!z7 || this.emptyOrderedNonOneItemInterruptsParagraph) : z8 ? this.bulletItemInterruptsItemParagraph && (!z7 || this.emptyBulletItemInterruptsItemParagraph) : this.bulletItemInterruptsParagraph && (!z7 || this.emptyBulletItemInterruptsParagraph);
        }

        public boolean canStartSubList(boolean z5, boolean z6, boolean z7) {
            return z5 ? this.orderedItemInterruptsItemParagraph && (!z7 || (this.emptyOrderedSubItemInterruptsItemParagraph && this.emptyOrderedItemInterruptsItemParagraph)) && (z6 || (this.orderedNonOneItemInterruptsItemParagraph && (!z7 || (this.emptyOrderedNonOneSubItemInterruptsItemParagraph && this.emptyOrderedNonOneItemInterruptsItemParagraph)))) : this.bulletItemInterruptsItemParagraph && (!z7 || (this.emptyBulletSubItemInterruptsItemParagraph && this.emptyBulletItemInterruptsItemParagraph));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemInterrupt)) {
                return false;
            }
            ItemInterrupt itemInterrupt = (ItemInterrupt) obj;
            return this.bulletItemInterruptsParagraph == itemInterrupt.bulletItemInterruptsParagraph && this.orderedItemInterruptsParagraph == itemInterrupt.orderedItemInterruptsParagraph && this.orderedNonOneItemInterruptsParagraph == itemInterrupt.orderedNonOneItemInterruptsParagraph && this.emptyBulletItemInterruptsParagraph == itemInterrupt.emptyBulletItemInterruptsParagraph && this.emptyOrderedItemInterruptsParagraph == itemInterrupt.emptyOrderedItemInterruptsParagraph && this.emptyOrderedNonOneItemInterruptsParagraph == itemInterrupt.emptyOrderedNonOneItemInterruptsParagraph && this.bulletItemInterruptsItemParagraph == itemInterrupt.bulletItemInterruptsItemParagraph && this.orderedItemInterruptsItemParagraph == itemInterrupt.orderedItemInterruptsItemParagraph && this.orderedNonOneItemInterruptsItemParagraph == itemInterrupt.orderedNonOneItemInterruptsItemParagraph && this.emptyBulletItemInterruptsItemParagraph == itemInterrupt.emptyBulletItemInterruptsItemParagraph && this.emptyOrderedItemInterruptsItemParagraph == itemInterrupt.emptyOrderedItemInterruptsItemParagraph && this.emptyOrderedNonOneItemInterruptsItemParagraph == itemInterrupt.emptyOrderedNonOneItemInterruptsItemParagraph && this.emptyBulletSubItemInterruptsItemParagraph == itemInterrupt.emptyBulletSubItemInterruptsItemParagraph && this.emptyOrderedSubItemInterruptsItemParagraph == itemInterrupt.emptyOrderedSubItemInterruptsItemParagraph && this.emptyOrderedNonOneSubItemInterruptsItemParagraph == itemInterrupt.emptyOrderedNonOneSubItemInterruptsItemParagraph;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((this.bulletItemInterruptsParagraph ? 1 : 0) * 31) + (this.orderedItemInterruptsParagraph ? 1 : 0)) * 31) + (this.orderedNonOneItemInterruptsParagraph ? 1 : 0)) * 31) + (this.emptyBulletItemInterruptsParagraph ? 1 : 0)) * 31) + (this.emptyOrderedItemInterruptsParagraph ? 1 : 0)) * 31) + (this.emptyOrderedNonOneItemInterruptsParagraph ? 1 : 0)) * 31) + (this.bulletItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.orderedItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.orderedNonOneItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.emptyBulletItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.emptyOrderedItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.emptyOrderedNonOneItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.emptyBulletSubItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.emptyOrderedSubItemInterruptsItemParagraph ? 1 : 0)) * 31) + (this.emptyOrderedNonOneSubItemInterruptsItemParagraph ? 1 : 0);
        }

        public void setIn(MutableDataHolder mutableDataHolder) {
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_BULLET_ITEM_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.bulletItemInterruptsParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ORDERED_ITEM_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.orderedItemInterruptsParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.orderedNonOneItemInterruptsParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyBulletItemInterruptsParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyOrderedItemInterruptsParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyOrderedNonOneItemInterruptsParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.bulletItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.orderedItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.orderedNonOneItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyBulletItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyOrderedItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyOrderedNonOneItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_BULLET_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyBulletSubItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_ORDERED_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyOrderedSubItemInterruptsItemParagraph));
            mutableDataHolder.set((DataKey<DataKey<Boolean>>) Parser.LISTS_EMPTY_ORDERED_NON_ONE_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH, (DataKey<Boolean>) Boolean.valueOf(this.emptyOrderedNonOneSubItemInterruptsItemParagraph));
        }

        public ItemInterrupt(DataHolder dataHolder) {
            this.bulletItemInterruptsParagraph = Parser.LISTS_BULLET_ITEM_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.orderedItemInterruptsParagraph = Parser.LISTS_ORDERED_ITEM_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.orderedNonOneItemInterruptsParagraph = Parser.LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyBulletItemInterruptsParagraph = Parser.LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyOrderedItemInterruptsParagraph = Parser.LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyOrderedNonOneItemInterruptsParagraph = Parser.LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_PARAGRAPH.get(dataHolder).booleanValue();
            this.bulletItemInterruptsItemParagraph = Parser.LISTS_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.orderedItemInterruptsItemParagraph = Parser.LISTS_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.orderedNonOneItemInterruptsItemParagraph = Parser.LISTS_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyBulletItemInterruptsItemParagraph = Parser.LISTS_EMPTY_BULLET_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyOrderedItemInterruptsItemParagraph = Parser.LISTS_EMPTY_ORDERED_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyOrderedNonOneItemInterruptsItemParagraph = Parser.LISTS_EMPTY_ORDERED_NON_ONE_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyBulletSubItemInterruptsItemParagraph = Parser.LISTS_EMPTY_BULLET_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyOrderedSubItemInterruptsItemParagraph = Parser.LISTS_EMPTY_ORDERED_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
            this.emptyOrderedNonOneSubItemInterruptsItemParagraph = Parser.LISTS_EMPTY_ORDERED_NON_ONE_SUB_ITEM_INTERRUPTS_ITEM_PARAGRAPH.get(dataHolder).booleanValue();
        }

        public ItemInterrupt(ItemInterrupt itemInterrupt) {
            this.bulletItemInterruptsParagraph = itemInterrupt.bulletItemInterruptsParagraph;
            this.orderedItemInterruptsParagraph = itemInterrupt.orderedItemInterruptsParagraph;
            this.orderedNonOneItemInterruptsParagraph = itemInterrupt.orderedNonOneItemInterruptsParagraph;
            this.emptyBulletItemInterruptsParagraph = itemInterrupt.emptyBulletItemInterruptsParagraph;
            this.emptyOrderedItemInterruptsParagraph = itemInterrupt.emptyOrderedItemInterruptsParagraph;
            this.emptyOrderedNonOneItemInterruptsParagraph = itemInterrupt.emptyOrderedNonOneItemInterruptsParagraph;
            this.bulletItemInterruptsItemParagraph = itemInterrupt.bulletItemInterruptsItemParagraph;
            this.orderedItemInterruptsItemParagraph = itemInterrupt.orderedItemInterruptsItemParagraph;
            this.orderedNonOneItemInterruptsItemParagraph = itemInterrupt.orderedNonOneItemInterruptsItemParagraph;
            this.emptyBulletItemInterruptsItemParagraph = itemInterrupt.emptyBulletItemInterruptsItemParagraph;
            this.emptyOrderedItemInterruptsItemParagraph = itemInterrupt.emptyOrderedItemInterruptsItemParagraph;
            this.emptyOrderedNonOneItemInterruptsItemParagraph = itemInterrupt.emptyOrderedNonOneItemInterruptsItemParagraph;
            this.emptyBulletSubItemInterruptsItemParagraph = itemInterrupt.emptyBulletSubItemInterruptsItemParagraph;
            this.emptyOrderedSubItemInterruptsItemParagraph = itemInterrupt.emptyOrderedSubItemInterruptsItemParagraph;
            this.emptyOrderedNonOneSubItemInterruptsItemParagraph = itemInterrupt.emptyOrderedNonOneSubItemInterruptsItemParagraph;
        }
    }

    public ListOptions(ListOptions listOptions) {
        this.myParserEmulationProfile = listOptions.getParserEmulationProfile();
        this.itemInterrupt = new ItemInterrupt(listOptions.getItemInterrupt());
        this.autoLoose = listOptions.isAutoLoose();
        this.autoLooseOneLevelLists = listOptions.isAutoLooseOneLevelLists();
        this.delimiterMismatchToNewList = listOptions.isDelimiterMismatchToNewList();
        this.endOnDoubleBlank = listOptions.isEndOnDoubleBlank();
        this.itemMarkerSpace = listOptions.isItemMarkerSpace();
        this.itemTypeMismatchToNewList = listOptions.isItemTypeMismatchToNewList();
        this.itemTypeMismatchToSubList = listOptions.isItemTypeMismatchToSubList();
        this.looseWhenPrevHasTrailingBlankLine = listOptions.isLooseWhenPrevHasTrailingBlankLine();
        this.looseWhenLastItemPrevHasTrailingBlankLine = listOptions.isLooseWhenLastItemPrevHasTrailingBlankLine();
        this.looseWhenHasNonListChildren = listOptions.isLooseWhenHasNonListChildren();
        this.looseWhenBlankLineFollowsItemParagraph = listOptions.isLooseWhenBlankLineFollowsItemParagraph();
        this.looseWhenHasLooseSubItem = listOptions.isLooseWhenHasLooseSubItem();
        this.looseWhenHasTrailingBlankLine = listOptions.isLooseWhenHasTrailingBlankLine();
        this.looseWhenContainsBlankLine = listOptions.isLooseWhenContainsBlankLine();
        this.numberedItemMarkerSuffixed = listOptions.isNumberedItemMarkerSuffixed();
        this.orderedItemDotOnly = listOptions.isOrderedItemDotOnly();
        this.orderedListManualStart = listOptions.isOrderedListManualStart();
        this.itemContentAfterSuffix = listOptions.isItemContentAfterSuffix();
        this.itemPrefixChars = listOptions.getItemPrefixChars();
        this.codeIndent = listOptions.getCodeIndent();
        this.itemIndent = listOptions.getItemIndent();
        this.newItemCodeIndent = listOptions.getNewItemCodeIndent();
        this.itemMarkerSuffixes = listOptions.getItemMarkerSuffixes();
    }
}
