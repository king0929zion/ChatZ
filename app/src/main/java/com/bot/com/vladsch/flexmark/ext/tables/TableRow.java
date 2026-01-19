package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.util.ast.LineBreakNode;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class TableRow extends Node implements LineBreakNode {
    private int rowNumber;

    public TableRow() {
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        super.getAstExtra(sb);
        if (this.rowNumber != 0) {
            sb.append(" rowNumber=");
            sb.append(this.rowNumber);
        }
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public void setRowNumber(int i6) {
        this.rowNumber = i6;
    }

    public TableRow(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
