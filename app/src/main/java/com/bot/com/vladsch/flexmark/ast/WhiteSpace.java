package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class WhiteSpace extends Node {
    public WhiteSpace() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        astExtraChars(sb);
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public String toStringAttributes() {
        return "text=" + ((Object) getChars());
    }

    public WhiteSpace(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
