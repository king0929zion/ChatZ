package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.DoNotLinkDecorate;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public class Code extends DelimitedNodeImpl implements DoNotLinkDecorate {
    public Code() {
    }

    @Override // com.vladsch.flexmark.util.ast.DelimitedNode, com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        iSequenceBuilder.append((CharSequence) getText());
        return false;
    }

    @Override // com.vladsch.flexmark.ast.DelimitedNodeImpl, com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        Node.delimitedSegmentSpan(sb, this.openingMarker, this.text, this.closingMarker, "text");
    }

    public Code(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public Code(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3) {
        super(basedSequence, basedSequence2, basedSequence3);
    }
}
