package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.util.ast.DoNotCollectText;
import com.vladsch.flexmark.util.ast.DoNotDecorate;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class TableSeparator extends Node implements DoNotDecorate, DoNotCollectText {
    public TableSeparator() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public TableSeparator(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
