package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class BlankLine extends Block {
    private Block claimedBlankLine;

    public BlankLine(BasedSequence basedSequence) {
        super(basedSequence);
        this.claimedBlankLine = null;
        setCharsFromContent();
    }

    public Block getClaimedBlankLine() {
        return this.claimedBlankLine;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public boolean isClaimed() {
        return this.claimedBlankLine != null;
    }

    public BlankLine setClaimedBlankLine(Block block) {
        this.claimedBlankLine = block;
        return this;
    }

    public BlankLine(BasedSequence basedSequence, Block block) {
        super(basedSequence);
        this.claimedBlankLine = null;
        setCharsFromContent();
        this.claimedBlankLine = block;
    }
}
