package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Paragraph extends Block implements TextContainer {
    private static final int[] EMPTY_INDENTS = new int[0];
    private boolean hasTableSeparator;
    private int[] lineIndents;
    private boolean trailingBlankLine;

    public Paragraph() {
        this.lineIndents = EMPTY_INDENTS;
        this.trailingBlankLine = false;
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public void collectEndText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        if (this.trailingBlankLine) {
            iSequenceBuilder.add(SequenceUtils.EOL);
        }
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        return true;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        super.getAstExtra(sb);
        if (this.trailingBlankLine) {
            sb.append(" isTrailingBlankLine");
        }
    }

    public int getLineIndent(int i6) {
        return this.lineIndents[i6];
    }

    public int[] getLineIndents() {
        return this.lineIndents;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public boolean hasTableSeparator() {
        return this.hasTableSeparator;
    }

    public boolean isTrailingBlankLine() {
        return this.trailingBlankLine;
    }

    @Override // com.vladsch.flexmark.util.ast.ContentNode
    public void setContent(BasedSequence basedSequence, List<BasedSequence> list) {
        super.setContent(basedSequence, list);
    }

    public void setHasTableSeparator(boolean z5) {
        this.hasTableSeparator = z5;
    }

    public void setLineIndents(List<Integer> list) {
        this.lineIndents = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            this.lineIndents[i6] = it.next().intValue();
            i6++;
        }
    }

    public void setTrailingBlankLine(boolean z5) {
        this.trailingBlankLine = z5;
    }

    public void setContent(BasedSequence basedSequence, List<BasedSequence> list, List<Integer> list2) {
        super.setContent(basedSequence, list);
        if (list.size() == list2.size()) {
            setLineIndents(list2);
            return;
        }
        throw new IllegalArgumentException("line segments and line indents have to be of the same size");
    }

    public Paragraph(BasedSequence basedSequence) {
        super(basedSequence);
        this.lineIndents = EMPTY_INDENTS;
        this.trailingBlankLine = false;
    }

    public void setLineIndents(int[] iArr) {
        this.lineIndents = iArr;
    }

    @Override // com.vladsch.flexmark.util.ast.ContentNode
    public void setContent(List<BasedSequence> list) {
        super.setContent(list);
    }

    public Paragraph(BasedSequence basedSequence, List<BasedSequence> list, List<Integer> list2) {
        super(basedSequence, list);
        this.lineIndents = EMPTY_INDENTS;
        this.trailingBlankLine = false;
        if (list.size() == list2.size()) {
            setLineIndents(list2);
            return;
        }
        throw new IllegalArgumentException("line segments and line indents have to be of the same size");
    }

    @Override // com.vladsch.flexmark.util.ast.ContentNode
    public void setContent(BlockContent blockContent) {
        super.setContent(blockContent);
        setLineIndents(blockContent.getLineIndents());
    }

    public void setContent(BlockContent blockContent, int i6, int i7) {
        super.setContent(blockContent.getLines().subList(i6, i7));
        setLineIndents(blockContent.getLineIndents().subList(i6, i7));
    }

    public void setContent(Paragraph paragraph, int i6, int i7) {
        super.setContent(paragraph.getContentLines(i6, i7));
        if (i7 > i6) {
            int i8 = i7 - i6;
            int[] iArr = new int[i8];
            System.arraycopy(paragraph.lineIndents, i6, iArr, 0, i8);
            this.lineIndents = iArr;
            return;
        }
        this.lineIndents = EMPTY_INDENTS;
    }

    public Paragraph(BasedSequence basedSequence, List<BasedSequence> list, int[] iArr) {
        super(basedSequence, list);
        this.lineIndents = EMPTY_INDENTS;
        this.trailingBlankLine = false;
        if (list.size() == iArr.length) {
            this.lineIndents = iArr;
            return;
        }
        throw new IllegalArgumentException("line segments and line indents have to be of the same size");
    }

    public Paragraph(BlockContent blockContent) {
        super(blockContent);
        this.lineIndents = EMPTY_INDENTS;
        this.trailingBlankLine = false;
        setLineIndents(blockContent.getLineIndents());
    }
}
