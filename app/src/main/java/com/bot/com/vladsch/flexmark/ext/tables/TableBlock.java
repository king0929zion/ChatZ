package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.util.ast.BlankLineBreakNode;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public class TableBlock extends Block implements BlankLineBreakNode {
    public TableBlock() {
    }

    public TableCaption getCaption() {
        Node lastChild = getLastChild();
        if (lastChild instanceof TableCaption) {
            return (TableCaption) lastChild;
        }
        return null;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return new BasedSequence[0];
    }

    public TableBlock(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public TableBlock(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public TableBlock(List<BasedSequence> list) {
        super(list);
    }

    public TableBlock(BlockContent blockContent) {
        super(blockContent);
    }
}
