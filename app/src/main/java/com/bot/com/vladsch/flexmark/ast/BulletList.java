package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public class BulletList extends ListBlock {
    private char openingMarker;

    public BulletList() {
    }

    public char getOpeningMarker() {
        return this.openingMarker;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public void setOpeningMarker(char c6) {
        this.openingMarker = c6;
    }

    public BulletList(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public BulletList(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public BulletList(BlockContent blockContent) {
        super(blockContent);
    }
}
