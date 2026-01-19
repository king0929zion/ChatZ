package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public class OrderedList extends ListBlock {
    private char delimiter;
    private int startNumber;

    public OrderedList() {
    }

    @Override // com.vladsch.flexmark.ast.ListBlock, com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        super.getAstExtra(sb);
        if (this.startNumber > 1) {
            sb.append(" start:");
            sb.append(this.startNumber);
        }
        sb.append(" delimiter:'");
        sb.append(this.delimiter);
        sb.append("'");
    }

    public char getDelimiter() {
        return this.delimiter;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public int getStartNumber() {
        return this.startNumber;
    }

    public void setDelimiter(char c6) {
        this.delimiter = c6;
    }

    public void setStartNumber(int i6) {
        this.startNumber = i6;
    }

    public OrderedList(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public OrderedList(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public OrderedList(BlockContent blockContent) {
        super(blockContent);
    }
}
