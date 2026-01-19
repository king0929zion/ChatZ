package com.vladsch.flexmark.ext.tables.internal;

import com.vladsch.flexmark.util.ast.DoNotDecorate;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TableColumnSeparator extends Node implements DoNotDecorate {
    public TableColumnSeparator() {
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

    public TableColumnSeparator(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public TableColumnSeparator(String str) {
        super(BasedSequence.of(str));
    }
}
