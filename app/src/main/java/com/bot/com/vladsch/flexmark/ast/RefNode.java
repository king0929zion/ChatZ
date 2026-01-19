package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.DoNotLinkDecorate;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.ReferencingNode;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.ReplacedTextMapper;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public abstract class RefNode extends Node implements LinkRefDerived, ReferencingNode<ReferenceRepository, Reference>, DoNotLinkDecorate, TextContainer {
    protected boolean isDefined;
    protected BasedSequence reference;
    protected BasedSequence referenceClosingMarker;
    protected BasedSequence referenceOpeningMarker;
    protected BasedSequence text;
    protected BasedSequence textClosingMarker;
    protected BasedSequence textOpeningMarker;

    public RefNode() {
        BasedSequence basedSequence = BasedSequence.NULL;
        this.textOpeningMarker = basedSequence;
        this.text = basedSequence;
        this.textClosingMarker = basedSequence;
        this.referenceOpeningMarker = basedSequence;
        this.reference = basedSequence;
        this.referenceClosingMarker = basedSequence;
        this.isDefined = false;
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        BasedSequence pageRef;
        int i7 = TextContainer.F_LINK_TEXT_TYPE & i6;
        if (i7 != 0) {
            Reference referenceNode = getReferenceNode(getDocument());
            if (i7 == 4) {
                iSequenceBuilder.append((CharSequence) getChars());
            } else {
                if (referenceNode == null) {
                    return true;
                }
                if (i7 == 1) {
                    pageRef = referenceNode.getPageRef();
                } else if (i7 == 2) {
                    pageRef = referenceNode.getAnchorRef();
                } else {
                    if (i7 != 3) {
                        return true;
                    }
                    pageRef = referenceNode.getUrl();
                }
                ReplacedTextMapper replacedTextMapper = new ReplacedTextMapper(pageRef);
                iSequenceBuilder.append((CharSequence) Escaping.percentDecodeUrl(Escaping.unescape(pageRef, replacedTextMapper), replacedTextMapper));
            }
            return false;
        }
        long j3 = i6;
        int i8 = TextContainer.F_FOR_HEADING_ID;
        if (BitFieldSet.any(j3, i8) && (this instanceof ImageRef)) {
            return false;
        }
        if (BitFieldSet.any(j3, i8)) {
            int i9 = TextContainer.F_NO_TRIM_REF_TEXT_START;
            int i10 = TextContainer.F_NO_TRIM_REF_TEXT_END;
            if (BitFieldSet.any(j3, i9 | i10)) {
                BasedSequence[] segments = getSegments();
                if (BitFieldSet.any(j3, i9)) {
                    iSequenceBuilder.append((CharSequence) getChars().baseSubSequence(segments[0].getEndOffset(), segments[1].getStartOffset()));
                }
                nodeVisitor.visitChildren(this);
                if (BitFieldSet.any(j3, i10)) {
                    iSequenceBuilder.append((CharSequence) getChars().baseSubSequence(segments[1].getEndOffset(), segments[2].getStartOffset()));
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        if (isReferenceTextCombined()) {
            Node.delimitedSegmentSpanChars(sb, this.referenceOpeningMarker, this.reference, this.referenceClosingMarker, "reference");
            Node.delimitedSegmentSpanChars(sb, this.textOpeningMarker, this.text, this.textClosingMarker, "text");
        } else {
            Node.delimitedSegmentSpanChars(sb, this.textOpeningMarker, this.text, this.textClosingMarker, "text");
            Node.delimitedSegmentSpanChars(sb, this.referenceOpeningMarker, this.reference, this.referenceClosingMarker, "reference");
        }
    }

    public BasedSequence getDummyReference() {
        return isDummyReference() ? getChars().baseSubSequence(this.textOpeningMarker.getStartOffset(), this.textClosingMarker.getEndOffset()) : BasedSequence.NULL;
    }

    @Override // com.vladsch.flexmark.util.ast.ReferencingNode
    public BasedSequence getReference() {
        return this.reference;
    }

    public BasedSequence getReferenceClosingMarker() {
        return this.referenceClosingMarker;
    }

    public BasedSequence getReferenceOpeningMarker() {
        return this.referenceOpeningMarker;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return isReferenceTextCombined() ? new BasedSequence[]{this.referenceOpeningMarker, this.reference, this.referenceClosingMarker, this.textOpeningMarker, this.text, this.textClosingMarker} : new BasedSequence[]{this.textOpeningMarker, this.text, this.textClosingMarker, this.referenceOpeningMarker, this.reference, this.referenceClosingMarker};
    }

    public BasedSequence getText() {
        return this.text;
    }

    public BasedSequence getTextClosingMarker() {
        return this.textClosingMarker;
    }

    public BasedSequence getTextOpeningMarker() {
        return this.textOpeningMarker;
    }

    @Override // com.vladsch.flexmark.util.ast.ReferencingNode
    public boolean isDefined() {
        return this.isDefined;
    }

    public boolean isDummyReference() {
        BasedSequence basedSequence = this.textOpeningMarker;
        BasedSequence basedSequence2 = BasedSequence.NULL;
        return (basedSequence == basedSequence2 || this.text != basedSequence2 || this.textClosingMarker == basedSequence2) ? false : true;
    }

    public boolean isReferenceTextCombined() {
        return this.text == BasedSequence.NULL;
    }

    @Override // com.vladsch.flexmark.ast.LinkRefDerived
    public boolean isTentative() {
        return !this.isDefined;
    }

    public void setDefined(boolean z5) {
        this.isDefined = z5;
    }

    public void setReference(BasedSequence basedSequence) {
        this.reference = basedSequence;
    }

    public void setReferenceChars(BasedSequence basedSequence) {
        int length = basedSequence.length();
        int i6 = basedSequence.charAt(0) == '!' ? 2 : 1;
        this.referenceOpeningMarker = basedSequence.subSequence(0, i6);
        int i7 = length - 1;
        this.reference = basedSequence.subSequence(i6, i7).trim();
        this.referenceClosingMarker = basedSequence.subSequence(i7, length);
    }

    public void setReferenceClosingMarker(BasedSequence basedSequence) {
        this.referenceClosingMarker = basedSequence;
    }

    public void setReferenceOpeningMarker(BasedSequence basedSequence) {
        this.referenceOpeningMarker = basedSequence;
    }

    public void setText(BasedSequence basedSequence) {
        this.text = basedSequence;
    }

    public void setTextChars(BasedSequence basedSequence) {
        int length = basedSequence.length();
        this.textOpeningMarker = basedSequence.subSequence(0, 1);
        int i6 = length - 1;
        this.text = basedSequence.subSequence(1, i6).trim();
        this.textClosingMarker = basedSequence.subSequence(i6, length);
    }

    public void setTextClosingMarker(BasedSequence basedSequence) {
        this.textClosingMarker = basedSequence;
    }

    public void setTextOpeningMarker(BasedSequence basedSequence) {
        this.textOpeningMarker = basedSequence;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public String toStringAttributes() {
        return "text=" + ((Object) this.text) + ", reference=" + ((Object) this.reference);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.ast.ReferencingNode
    public Reference getReferenceNode(Document document) {
        return getReferenceNode(Parser.REFERENCES.get(document));
    }

    @Override // com.vladsch.flexmark.util.ast.ReferencingNode
    public Reference getReferenceNode(ReferenceRepository referenceRepository) {
        if (referenceRepository == null) {
            return null;
        }
        return referenceRepository.get(referenceRepository.normalizeKey(this.reference));
    }

    public RefNode(BasedSequence basedSequence) {
        super(basedSequence);
        BasedSequence basedSequence2 = BasedSequence.NULL;
        this.textOpeningMarker = basedSequence2;
        this.text = basedSequence2;
        this.textClosingMarker = basedSequence2;
        this.referenceOpeningMarker = basedSequence2;
        this.reference = basedSequence2;
        this.referenceClosingMarker = basedSequence2;
        this.isDefined = false;
    }

    public RefNode(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4, BasedSequence basedSequence5, BasedSequence basedSequence6) {
        super(basedSequence.baseSubSequence(basedSequence.getStartOffset(), basedSequence6.getEndOffset()));
        BasedSequence basedSequence7 = BasedSequence.NULL;
        this.isDefined = false;
        this.textOpeningMarker = basedSequence;
        this.text = basedSequence2;
        this.textClosingMarker = basedSequence3;
        this.referenceOpeningMarker = basedSequence4;
        this.reference = basedSequence5;
        this.referenceClosingMarker = basedSequence6;
    }

    public RefNode(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4, BasedSequence basedSequence5, BasedSequence basedSequence6, BasedSequence basedSequence7) {
        super(basedSequence);
        BasedSequence basedSequence8 = BasedSequence.NULL;
        this.isDefined = false;
        this.textOpeningMarker = basedSequence2;
        this.text = basedSequence3;
        this.textClosingMarker = basedSequence4;
        this.referenceOpeningMarker = basedSequence5;
        this.reference = basedSequence6;
        this.referenceClosingMarker = basedSequence7;
    }

    public RefNode(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3) {
        super(basedSequence.baseSubSequence(basedSequence.getStartOffset(), basedSequence3.getEndOffset()));
        BasedSequence basedSequence4 = BasedSequence.NULL;
        this.referenceOpeningMarker = basedSequence4;
        this.reference = basedSequence4;
        this.referenceClosingMarker = basedSequence4;
        this.isDefined = false;
        this.textOpeningMarker = basedSequence;
        this.text = basedSequence2;
        this.textClosingMarker = basedSequence3;
    }

    public RefNode(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4) {
        super(basedSequence);
        BasedSequence basedSequence5 = BasedSequence.NULL;
        this.referenceOpeningMarker = basedSequence5;
        this.reference = basedSequence5;
        this.referenceClosingMarker = basedSequence5;
        this.isDefined = false;
        this.textOpeningMarker = basedSequence2;
        this.text = basedSequence3;
        this.textClosingMarker = basedSequence4;
    }

    public RefNode(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4, BasedSequence basedSequence5) {
        super(basedSequence.baseSubSequence(basedSequence.getStartOffset(), basedSequence5.getEndOffset()));
        this.reference = BasedSequence.NULL;
        this.isDefined = false;
        this.textOpeningMarker = basedSequence;
        this.text = basedSequence2;
        this.textClosingMarker = basedSequence3;
        this.referenceOpeningMarker = basedSequence4;
        this.referenceClosingMarker = basedSequence5;
    }
}
