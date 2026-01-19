package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.DoNotAttributeDecorate;
import com.vladsch.flexmark.util.ast.DoNotTrim;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public class SoftLineBreak extends Node implements DoNotAttributeDecorate, DoNotTrim, TextContainer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public SoftLineBreak() {
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        iSequenceBuilder.add(getChars());
        return false;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void setChars(BasedSequence basedSequence) {
        super.setChars(basedSequence);
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void setCharsFromContent() {
        super.setCharsFromContent();
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void setCharsFromContentOnly() {
        super.setCharsFromContentOnly();
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void setCharsFromSegments() {
        super.setCharsFromSegments();
    }

    public SoftLineBreak(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
