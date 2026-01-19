package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public class MutableListOptions extends ListOptions {
    public MutableListOptions() {
        this.itemInterrupt = new ListOptions.MutableItemInterrupt(super.getItemInterrupt());
    }

    @Override // com.vladsch.flexmark.parser.ListOptions
    public MutableListOptions getMutable() {
        return new MutableListOptions(this);
    }

    public MutableListOptions setAutoLoose(boolean z5) {
        this.autoLoose = z5;
        return this;
    }

    public MutableListOptions setAutoLooseOneLevelLists(boolean z5) {
        this.autoLooseOneLevelLists = z5;
        return this;
    }

    public MutableListOptions setCodeIndent(int i6) {
        this.codeIndent = i6;
        return this;
    }

    public MutableListOptions setDelimiterMismatchToNewList(boolean z5) {
        this.delimiterMismatchToNewList = z5;
        return this;
    }

    public MutableListOptions setEndOnDoubleBlank(boolean z5) {
        this.endOnDoubleBlank = z5;
        return this;
    }

    public MutableListOptions setItemIndent(int i6) {
        this.itemIndent = i6;
        return this;
    }

    public MutableListOptions setItemInterrupt(ListOptions.MutableItemInterrupt mutableItemInterrupt) {
        this.itemInterrupt = mutableItemInterrupt;
        return this;
    }

    public MutableListOptions setItemMarkerSpace(boolean z5) {
        this.itemMarkerSpace = z5;
        return this;
    }

    public MutableListOptions setItemMarkerSuffixes(String[] strArr) {
        this.itemMarkerSuffixes = strArr;
        return this;
    }

    public MutableListOptions setItemTypeMismatchToNewList(boolean z5) {
        this.itemTypeMismatchToNewList = z5;
        return this;
    }

    public MutableListOptions setItemTypeMismatchToSubList(boolean z5) {
        this.itemTypeMismatchToSubList = z5;
        return this;
    }

    public MutableListOptions setLooseWhenBlankLineFollowsItemParagraph(boolean z5) {
        this.looseWhenBlankLineFollowsItemParagraph = z5;
        return this;
    }

    public MutableListOptions setLooseWhenContainsBlankLine(boolean z5) {
        this.looseWhenContainsBlankLine = z5;
        return this;
    }

    public MutableListOptions setLooseWhenHasLooseSubItem(boolean z5) {
        this.looseWhenHasLooseSubItem = z5;
        return this;
    }

    public MutableListOptions setLooseWhenHasNonListChildren(boolean z5) {
        this.looseWhenHasNonListChildren = z5;
        return this;
    }

    public MutableListOptions setLooseWhenHasTrailingBlankLine(boolean z5) {
        this.looseWhenHasTrailingBlankLine = z5;
        return this;
    }

    public MutableListOptions setLooseWhenLastItemPrevHasTrailingBlankLine(boolean z5) {
        this.looseWhenLastItemPrevHasTrailingBlankLine = z5;
        return this;
    }

    public MutableListOptions setLooseWhenPrevHasTrailingBlankLine(boolean z5) {
        this.looseWhenPrevHasTrailingBlankLine = z5;
        return this;
    }

    public MutableListOptions setNewItemCodeIndent(int i6) {
        this.newItemCodeIndent = i6;
        return this;
    }

    public MutableListOptions setNumberedItemMarkerSuffixed(boolean z5) {
        this.numberedItemMarkerSuffixed = z5;
        return this;
    }

    public MutableListOptions setOrderedItemDotOnly(boolean z5) {
        this.orderedItemDotOnly = z5;
        return this;
    }

    public MutableListOptions setOrderedListManualStart(boolean z5) {
        this.orderedListManualStart = z5;
        return this;
    }

    public MutableListOptions setParserEmulationFamily(ParserEmulationProfile parserEmulationProfile) {
        this.myParserEmulationProfile = parserEmulationProfile;
        return this;
    }

    public MutableListOptions(DataHolder dataHolder) {
        this(ListOptions.get(dataHolder));
    }

    public MutableListOptions(ListOptions listOptions) {
        super(listOptions);
        this.itemInterrupt = new ListOptions.MutableItemInterrupt(super.getItemInterrupt());
    }
}
