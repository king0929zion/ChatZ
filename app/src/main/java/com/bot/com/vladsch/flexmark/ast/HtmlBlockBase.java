package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HtmlBlockBase implements Block,   {
    public HtmlBlockBase() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public HtmlBlockBase(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public HtmlBlockBase(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public HtmlBlockBase(BlockContent blockContent) {
        super(blockContent);
    }
}
