package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class TableBody extends Node {
    public TableBody() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public TableBody(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
