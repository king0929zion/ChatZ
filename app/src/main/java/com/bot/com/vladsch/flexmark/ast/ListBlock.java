package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.BlankLineContainer;
import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ListBlock implements Block, BlankLineContainer {
    private boolean tight;

    public ListBlock() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        super.getAstExtra(sb);
        if (isTight()) {
            sb.append(" isTight");
        } else {
            sb.append(" isLoose");
        }
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public Node getLastBlankLineChild() {
        return getLastChild();
    }

    public boolean isLoose() {
        return !this.tight;
    }

    public boolean isTight() {
        return this.tight;
    }

    public void setLoose(boolean z5) {
        this.tight = !z5;
    }

    public void setTight(boolean z5) {
        this.tight = z5;
    }

    public ListBlock(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public ListBlock(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public ListBlock(BlockContent blockContent) {
        super(blockContent);
    }
}
