package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class HtmlInline extends HtmlInlineBase {
    public HtmlInline() {
    }

    @Override // com.vladsch.flexmark.ast.HtmlInlineBase, com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        astExtraChars(sb);
    }

    @Override // com.vladsch.flexmark.ast.HtmlInlineBase, com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public HtmlInline(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
