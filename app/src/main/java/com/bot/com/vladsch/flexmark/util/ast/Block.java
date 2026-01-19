package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Block implements ContentNode,   {
    public Block() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void setParent(Node node) {
        if (node != null && !(node instanceof Block)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.setParent(node);
    }

    public Block(BasedSequence basedSequence) {
        super(basedSequence);
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public Block getParent() {
        return (Block) super.getParent();
    }

    public Block(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public Block(List<BasedSequence> list) {
        super(list);
    }

    public Block(BlockContent blockContent) {
        super(blockContent);
    }
}
