package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.parser.block.BlockContinue;

/* loaded from: classes.dex */
public class BlockContinueImpl extends BlockContinue {
    private final boolean finalize;
    private final int newColumn;
    private final int newIndex;

    public BlockContinueImpl(int i6, int i7, boolean z5) {
        this.newIndex = i6;
        this.newColumn = i7;
        this.finalize = z5;
    }

    public int getNewColumn() {
        return this.newColumn;
    }

    public int getNewIndex() {
        return this.newIndex;
    }

    public boolean isFinalize() {
        return this.finalize;
    }
}
