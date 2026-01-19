package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.DoNotDecorate;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public class FencedCodeBlock extends Block implements DoNotDecorate {
    private BasedSequence attributes;
    private BasedSequence closingMarker;
    private int fenceIndent;
    private BasedSequence info;
    private BasedSequence openingMarker;

    public FencedCodeBlock() {
        BasedSequence basedSequence = BasedSequence.NULL;
        this.openingMarker = basedSequence;
        this.info = basedSequence;
        this.attributes = basedSequence;
        this.closingMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        BasedSequence contentChars = getContentChars();
        int size = getContentLines().size();
        Node.segmentSpanChars(sb, this.openingMarker, "open");
        Node.segmentSpanChars(sb, this.info, "info");
        Node.segmentSpanChars(sb, this.attributes, "attributes");
        Node.segmentSpan(sb, contentChars, "content");
        sb.append(" lines[");
        sb.append(size);
        sb.append("]");
        Node.segmentSpanChars(sb, this.closingMarker, "close");
    }

    public BasedSequence getAttributes() {
        return this.attributes;
    }

    public BasedSequence getClosingFence() {
        return this.closingMarker;
    }

    public BasedSequence getClosingMarker() {
        return this.closingMarker;
    }

    public int getFenceIndent() {
        return this.fenceIndent;
    }

    public int getFenceLength() {
        return getInfo().length();
    }

    public BasedSequence getInfo() {
        return this.info;
    }

    public BasedSequence getInfoDelimitedByAny(CharPredicate charPredicate) {
        BasedSequence basedSequence = BasedSequence.NULL;
        if (!this.info.isNotNull() || this.info.isBlank()) {
            return basedSequence;
        }
        int indexOfAny = this.info.indexOfAny(charPredicate);
        return indexOfAny == -1 ? this.info : this.info.subSequence(0, indexOfAny);
    }

    public BasedSequence getOpeningFence() {
        return this.openingMarker;
    }

    public BasedSequence getOpeningMarker() {
        return this.openingMarker;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return new BasedSequence[]{this.openingMarker, this.info, this.attributes, getContentChars(), this.closingMarker};
    }

    public void setAttributes(BasedSequence basedSequence) {
        this.attributes = basedSequence;
    }

    public void setClosingMarker(BasedSequence basedSequence) {
        this.closingMarker = basedSequence;
    }

    public void setFenceIndent(int i6) {
        this.fenceIndent = i6;
    }

    public void setInfo(BasedSequence basedSequence) {
        this.info = basedSequence;
    }

    public void setOpeningMarker(BasedSequence basedSequence) {
        this.openingMarker = basedSequence;
    }

    public FencedCodeBlock(BasedSequence basedSequence) {
        super(basedSequence);
        BasedSequence basedSequence2 = BasedSequence.NULL;
        this.openingMarker = basedSequence2;
        this.info = basedSequence2;
        this.attributes = basedSequence2;
        this.closingMarker = basedSequence2;
    }

    public FencedCodeBlock(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, List<BasedSequence> list, BasedSequence basedSequence4) {
        super(basedSequence, list);
        this.attributes = BasedSequence.NULL;
        this.openingMarker = basedSequence2;
        this.info = basedSequence3;
        this.closingMarker = basedSequence4;
    }
}
