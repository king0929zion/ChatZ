package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.ReferenceNode;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.PrefixedSubSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class Reference extends LinkNodeBase implements ReferenceNode<ReferenceRepository, Reference, RefNode> {
    protected BasedSequence closingMarker;
    protected BasedSequence openingMarker;
    protected BasedSequence reference;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Reference(com.vladsch.flexmark.util.sequence.BasedSequence r5, com.vladsch.flexmark.util.sequence.BasedSequence r6, com.vladsch.flexmark.util.sequence.BasedSequence r7) {
        /*
            r4 = this;
            com.vladsch.flexmark.util.sequence.BasedSequence r0 = com.vladsch.flexmark.util.sequence.BasedSequence.NULL
            r4.<init>(r0)
            r4.openingMarker = r0
            r4.reference = r0
            r4.closingMarker = r0
            r0 = 0
            r1 = 1
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = r5.subSequence(r0, r1)
            r4.openingMarker = r2
            int r2 = r5.length()
            int r2 = r2 + (-2)
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = r5.subSequence(r1, r2)
            com.vladsch.flexmark.util.sequence.IRichSequence r2 = r2.trim()
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = (com.vladsch.flexmark.util.sequence.BasedSequence) r2
            r4.reference = r2
            int r2 = r5.length()
            int r2 = r2 + (-2)
            int r3 = r5.length()
            com.vladsch.flexmark.util.sequence.BasedSequence r5 = r5.subSequence(r2, r3)
            r4.closingMarker = r5
            r4.setUrlChars(r6)
            if (r7 == 0) goto L5a
            com.vladsch.flexmark.util.sequence.BasedSequence r5 = r7.subSequence(r0, r1)
            r4.titleOpeningMarker = r5
            int r5 = r7.length()
            int r5 = r5 - r1
            com.vladsch.flexmark.util.sequence.BasedSequence r5 = r7.subSequence(r1, r5)
            r4.title = r5
            int r5 = r7.length()
            int r5 = r5 - r1
            int r6 = r7.length()
            com.vladsch.flexmark.util.sequence.BasedSequence r5 = r7.subSequence(r5, r6)
            r4.titleClosingMarker = r5
        L5a:
            r4.setCharsFromContent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.ast.Reference.<init>(com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.BasedSequence, com.vladsch.flexmark.util.sequence.BasedSequence):void");
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getAnchorMarker() {
        return this.anchorMarker;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getAnchorRef() {
        return this.anchorRef;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        Node.delimitedSegmentSpanChars(sb, this.openingMarker, this.reference, this.closingMarker, "ref");
        Node.delimitedSegmentSpanChars(sb, this.urlOpeningMarker, this.url, this.urlClosingMarker, "url");
        Node.delimitedSegmentSpanChars(sb, this.titleOpeningMarker, this.title, this.titleClosingMarker, Attribute.TITLE_ATTR);
    }

    public BasedSequence getClosingMarker() {
        return this.closingMarker;
    }

    public BasedSequence getOpeningMarker() {
        return this.openingMarker;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getPageRef() {
        return this.pageRef;
    }

    public BasedSequence getReference() {
        return this.reference;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return new BasedSequence[]{this.openingMarker, this.reference, this.closingMarker, this.urlOpeningMarker, this.url, this.pageRef, this.anchorMarker, this.anchorRef, this.urlClosingMarker, this.titleOpeningMarker, this.title, this.titleClosingMarker};
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegmentsForChars() {
        BasedSequence basedSequence = this.openingMarker;
        BasedSequence basedSequence2 = this.reference;
        BasedSequence basedSequence3 = this.closingMarker;
        return new BasedSequence[]{basedSequence, basedSequence2, basedSequence3, PrefixedSubSequence.prefixOf(SequenceUtils.SPACE, basedSequence3.getEmptySuffix()), this.urlOpeningMarker, this.pageRef, this.anchorMarker, this.anchorRef, this.urlClosingMarker, this.titleOpeningMarker, this.title, this.titleClosingMarker};
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getTitle() {
        return this.title;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getTitleClosingMarker() {
        return this.titleClosingMarker;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getTitleOpeningMarker() {
        return this.titleOpeningMarker;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getUrl() {
        return this.url;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getUrlClosingMarker() {
        return this.urlClosingMarker;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public BasedSequence getUrlOpeningMarker() {
        return this.urlOpeningMarker;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setAnchorMarker(BasedSequence basedSequence) {
        this.anchorMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setAnchorRef(BasedSequence basedSequence) {
        this.anchorRef = basedSequence;
    }

    public void setClosingMarker(BasedSequence basedSequence) {
        this.closingMarker = basedSequence;
    }

    public void setOpeningMarker(BasedSequence basedSequence) {
        this.openingMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setPageRef(BasedSequence basedSequence) {
        this.pageRef = basedSequence;
    }

    public void setReference(BasedSequence basedSequence) {
        this.reference = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setTitle(BasedSequence basedSequence) {
        this.title = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setTitleClosingMarker(BasedSequence basedSequence) {
        this.titleClosingMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setTitleOpeningMarker(BasedSequence basedSequence) {
        this.titleOpeningMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setUrl(BasedSequence basedSequence) {
        this.url = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setUrlClosingMarker(BasedSequence basedSequence) {
        this.urlClosingMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.ast.LinkNodeBase
    public void setUrlOpeningMarker(BasedSequence basedSequence) {
        this.urlOpeningMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public String toStringAttributes() {
        return "reference=" + ((Object) this.reference) + ", url=" + ((Object) this.url);
    }

    @Override // java.lang.Comparable
    public int compareTo(Reference reference) {
        return SequenceUtils.compare(getReference(), reference.getReference(), true);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.ast.ReferenceNode
    public RefNode getReferencingNode(Node node) {
        if (node instanceof RefNode) {
            return (RefNode) node;
        }
        return null;
    }
}
