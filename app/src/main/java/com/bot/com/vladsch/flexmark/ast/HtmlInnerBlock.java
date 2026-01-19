package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class HtmlInnerBlock extends HtmlBlockBase {
    public HtmlInnerBlock() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        astExtraChars(sb);
    }

    @Override // com.vladsch.flexmark.ast.HtmlBlockBase, com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public HtmlInnerBlock(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
