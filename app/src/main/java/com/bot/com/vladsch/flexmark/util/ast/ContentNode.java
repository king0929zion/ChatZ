package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SegmentedSequence;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ContentNode implements Node implements Content {
    protected List<BasedSequence> lineSegments;

    public ContentNode() {
        this.lineSegments = BasedSequence.EMPTY_LIST;
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public BasedSequence getContentChars() {
        return this.lineSegments.isEmpty() ? BasedSequence.NULL : SegmentedSequence.create(this.lineSegments.get(0), this.lineSegments);
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public List<BasedSequence> getContentLines() {
        return this.lineSegments;
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public BasedSequence getLineChars(int i6) {
        return this.lineSegments.get(i6);
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public int getLineCount() {
        return this.lineSegments.size();
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public BasedSequence getSpanningChars() {
        return getSpanningChars(this.lineSegments);
    }

    public void setContent(BasedSequence basedSequence, List<BasedSequence> list) {
        setChars(basedSequence);
        this.lineSegments = list;
    }

    public void setContentLine(int i6, BasedSequence basedSequence) {
        ArrayList arrayList = new ArrayList(this.lineSegments);
        arrayList.set(i6, basedSequence);
        this.lineSegments = arrayList;
        setCharsFromContent();
    }

    public void setContentLines(List<BasedSequence> list) {
        this.lineSegments = list;
    }

    private static BasedSequence getSpanningChars(List<BasedSequence> list) {
        return list.isEmpty() ? BasedSequence.NULL : list.get(0).baseSubSequence(list.get(0).getStartOffset(), list.get(list.size() - 1).getEndOffset());
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public BasedSequence getContentChars(int i6, int i7) {
        return this.lineSegments.isEmpty() ? BasedSequence.NULL : SegmentedSequence.create(this.lineSegments.get(0), getContentLines(i6, i7));
    }

    @Override // com.vladsch.flexmark.util.ast.Content
    public List<BasedSequence> getContentLines(int i6, int i7) {
        return this.lineSegments.subList(i6, i7);
    }

    public ContentNode(BasedSequence basedSequence) {
        super(basedSequence);
        this.lineSegments = BasedSequence.EMPTY_LIST;
    }

    public void setContent(List<BasedSequence> list) {
        this.lineSegments = list;
        setChars(getSpanningChars());
    }

    public ContentNode(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence);
        BasedSequence basedSequence2 = BasedSequence.NULL;
        this.lineSegments = list;
    }

    public void setContent(BlockContent blockContent) {
        setChars(blockContent.getSpanningChars());
        this.lineSegments = blockContent.getLines();
    }

    public ContentNode(List<BasedSequence> list) {
        this(getSpanningChars(list), list);
    }

    public ContentNode(BlockContent blockContent) {
        this(blockContent.getSpanningChars(), blockContent.getLines());
    }
}
