package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.parser.block.BlockParser;
import com.vladsch.flexmark.parser.block.BlockStart;

/* loaded from: classes.dex */
public class BlockStartImpl extends BlockStart {
    private final BlockParser[] blockParsers;
    private int newIndex = -1;
    private int newColumn = -1;
    private boolean replaceActiveBlockParser = false;

    public BlockStartImpl(BlockParser... blockParserArr) {
        this.blockParsers = blockParserArr;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockStart
    public BlockStart atColumn(int i6) {
        this.newColumn = i6;
        return this;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockStart
    public BlockStart atIndex(int i6) {
        this.newIndex = i6;
        return this;
    }

    public BlockParser[] getBlockParsers() {
        return this.blockParsers;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public boolean isReplaceActiveBlockParser() {
        return this.replaceActiveBlockParser;
    }

    @Override // com.vladsch.flexmark.parser.block.BlockStart
    public BlockStart replaceActiveBlockParser() {
        this.replaceActiveBlockParser = true;
        return this;
    }
}
