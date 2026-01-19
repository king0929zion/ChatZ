package com.vladsch.flexmark.ext.wikilink;

import com.vladsch.flexmark.ast.LinkRefDerived;
import com.vladsch.flexmark.util.ast.DoNotDecorate;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.ReplacedTextMapper;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public class WikiNode extends Node implements DoNotDecorate, TextContainer, LinkRefDerived {
    public static final char SEPARATOR_CHAR = '|';
    protected BasedSequence anchorMarker;
    protected BasedSequence anchorRef;
    protected BasedSequence closingMarker;
    protected BasedSequence link;
    protected final boolean linkIsFirst;
    protected BasedSequence openingMarker;
    protected BasedSequence pageRef;
    protected BasedSequence text;
    protected BasedSequence textSeparatorMarker;

    public WikiNode(boolean z5) {
        BasedSequence basedSequence = BasedSequence.NULL;
        this.openingMarker = basedSequence;
        this.link = basedSequence;
        this.pageRef = basedSequence;
        this.anchorMarker = basedSequence;
        this.anchorRef = basedSequence;
        this.textSeparatorMarker = basedSequence;
        this.text = basedSequence;
        this.closingMarker = basedSequence;
        this.linkIsFirst = z5;
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        BasedSequence pageRef;
        int i7 = i6 & TextContainer.F_LINK_TEXT_TYPE;
        if (i7 == 1) {
            pageRef = getPageRef();
        } else if (i7 == 2) {
            pageRef = getAnchorRef();
        } else if (i7 == 3) {
            pageRef = getLink();
        } else {
            if (i7 != 4) {
                return true;
            }
            pageRef = BasedSequence.NULL;
        }
        if (i7 == 4) {
            iSequenceBuilder.append((CharSequence) getChars());
            return false;
        }
        iSequenceBuilder.append((CharSequence) Escaping.unescape(pageRef, new ReplacedTextMapper(pageRef)));
        return false;
    }

    public BasedSequence getAnchorMarker() {
        return this.anchorMarker;
    }

    public BasedSequence getAnchorRef() {
        return this.anchorRef;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        if (this.linkIsFirst) {
            Node.segmentSpanChars(sb, this.openingMarker, "linkOpen");
            Node.segmentSpanChars(sb, this.text, "text");
            Node.segmentSpanChars(sb, this.textSeparatorMarker, "textSep");
            Node.segmentSpanChars(sb, this.link, "link");
            if (this.pageRef.isNotNull()) {
                Node.segmentSpanChars(sb, this.pageRef, "pageRef");
            }
            if (this.anchorMarker.isNotNull()) {
                Node.segmentSpanChars(sb, this.anchorMarker, "anchorMarker");
            }
            if (this.anchorRef.isNotNull()) {
                Node.segmentSpanChars(sb, this.anchorRef, "anchorRef");
            }
            Node.segmentSpanChars(sb, this.closingMarker, "linkClose");
            return;
        }
        Node.segmentSpanChars(sb, this.openingMarker, "linkOpen");
        Node.segmentSpanChars(sb, this.link, "link");
        if (this.pageRef.isNotNull()) {
            Node.segmentSpanChars(sb, this.pageRef, "pageRef");
        }
        if (this.anchorMarker.isNotNull()) {
            Node.segmentSpanChars(sb, this.anchorMarker, "anchorMarker");
        }
        if (this.anchorRef.isNotNull()) {
            Node.segmentSpanChars(sb, this.anchorRef, "anchorRef");
        }
        Node.segmentSpanChars(sb, this.textSeparatorMarker, "textSep");
        Node.segmentSpanChars(sb, this.text, "text");
        Node.segmentSpanChars(sb, this.closingMarker, "linkClose");
    }

    public BasedSequence getClosingMarker() {
        return this.closingMarker;
    }

    public BasedSequence getLink() {
        return this.link;
    }

    public BasedSequence getOpeningMarker() {
        return this.openingMarker;
    }

    public BasedSequence getPageRef() {
        return this.pageRef;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return this.linkIsFirst ? new BasedSequence[]{this.openingMarker, this.link, this.pageRef, this.anchorMarker, this.anchorRef, this.textSeparatorMarker, this.text, this.closingMarker} : new BasedSequence[]{this.openingMarker, this.text, this.textSeparatorMarker, this.link, this.pageRef, this.anchorMarker, this.anchorRef, this.closingMarker};
    }

    public BasedSequence getText() {
        return this.text;
    }

    public BasedSequence getTextSeparatorMarker() {
        return this.textSeparatorMarker;
    }

    public boolean isLinkIsFirst() {
        return this.linkIsFirst;
    }

    @Override // com.vladsch.flexmark.ast.LinkRefDerived
    public boolean isTentative() {
        return false;
    }

    public void setAnchorMarker(BasedSequence basedSequence) {
        this.anchorMarker = basedSequence;
    }

    public void setAnchorRef(BasedSequence basedSequence) {
        this.anchorRef = basedSequence;
    }

    public void setClosingMarker(BasedSequence basedSequence) {
        this.closingMarker = basedSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r5.pageRef = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setLink(com.vladsch.flexmark.util.sequence.BasedSequence r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r5.link = r6
            if (r7 != 0) goto L7
            r5.pageRef = r6
            return
        L7:
            r7 = -1
            r0 = r7
        L9:
            r1 = 35
            r2 = 1
            int r0 = r0 + r2
            int r0 = r6.indexOf(r1, r0)
            r1 = 0
            if (r0 == r7) goto L2f
            if (r8 == 0) goto L2f
            if (r0 <= 0) goto L2f
            int r3 = r0 + (-1)
            char r3 = r6.charAt(r3)
            r4 = 92
            if (r3 != r4) goto L2f
            com.vladsch.flexmark.util.sequence.BasedSequence r3 = r6.subSequence(r1, r0)
            com.vladsch.flexmark.util.misc.CharPredicate r4 = com.vladsch.flexmark.util.misc.CharPredicate.BACKSLASH
            int r3 = r3.countTrailing(r4)
            r3 = r3 & r2
            if (r3 == r2) goto L9
        L2f:
            if (r0 >= 0) goto L34
            r5.pageRef = r6
            return
        L34:
            com.vladsch.flexmark.util.sequence.BasedSequence r7 = r6.subSequence(r1, r0)
            r5.pageRef = r7
            int r7 = r0 + 1
            com.vladsch.flexmark.util.sequence.BasedSequence r8 = r6.subSequence(r0, r7)
            r5.anchorMarker = r8
            com.vladsch.flexmark.util.sequence.IRichSequence r6 = r6.subSequence(r7)
            com.vladsch.flexmark.util.sequence.BasedSequence r6 = (com.vladsch.flexmark.util.sequence.BasedSequence) r6
            r5.anchorRef = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.ext.wikilink.WikiNode.setLink(com.vladsch.flexmark.util.sequence.BasedSequence, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        r11 = r11.subSequence(r1, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setLinkChars(com.vladsch.flexmark.util.sequence.BasedSequence r11, boolean r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            int r0 = r11.length()
            boolean r1 = r10 instanceof com.vladsch.flexmark.ext.wikilink.WikiImage
            r2 = 2
            if (r1 == 0) goto Lb
            r1 = 3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            r3 = 0
            com.vladsch.flexmark.util.sequence.BasedSequence r4 = r11.subSequence(r3, r1)
            r10.openingMarker = r4
            int r4 = r0 + (-2)
            com.vladsch.flexmark.util.sequence.BasedSequence r0 = r11.subSequence(r4, r0)
            r10.closingMarker = r0
            boolean r0 = r10.linkIsFirst
            r5 = 92
            r6 = 124(0x7c, float:1.74E-43)
            r7 = -1
            r8 = 1
            if (r0 == 0) goto L4b
            int r0 = r11.length()
            int r0 = r0 - r2
        L2a:
            int r0 = r0 - r8
            int r0 = r11.lastIndexOf(r6, r0)
            if (r0 == r7) goto L6c
            if (r13 == 0) goto L6c
            if (r0 <= 0) goto L6c
            int r2 = r0 + (-1)
            char r2 = r11.charAt(r2)
            if (r2 != r5) goto L6c
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = r11.subSequence(r3, r0)
            com.vladsch.flexmark.util.misc.CharPredicate r9 = com.vladsch.flexmark.util.misc.CharPredicate.BACKSLASH
            int r2 = r2.countTrailing(r9)
            r2 = r2 & r8
            if (r2 == r8) goto L2a
            goto L6c
        L4b:
            r0 = r7
        L4c:
            int r0 = r0 + r8
            int r0 = r11.indexOf(r6, r0)
            if (r0 == r7) goto L6c
            if (r13 == 0) goto L6c
            if (r0 <= 0) goto L6c
            int r2 = r0 + (-1)
            char r2 = r11.charAt(r2)
            if (r2 != r5) goto L6c
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = r11.subSequence(r3, r0)
            com.vladsch.flexmark.util.misc.CharPredicate r9 = com.vladsch.flexmark.util.misc.CharPredicate.BACKSLASH
            int r2 = r2.countTrailing(r9)
            r2 = r2 & r8
            if (r2 == r8) goto L4c
        L6c:
            if (r0 >= 0) goto L73
            com.vladsch.flexmark.util.sequence.BasedSequence r11 = r11.subSequence(r1, r4)
            goto L95
        L73:
            int r13 = r0 + 1
            com.vladsch.flexmark.util.sequence.BasedSequence r2 = r11.subSequence(r0, r13)
            r10.textSeparatorMarker = r2
            boolean r2 = r10.linkIsFirst
            if (r2 == 0) goto L8b
            com.vladsch.flexmark.util.sequence.BasedSequence r0 = r11.subSequence(r1, r0)
            com.vladsch.flexmark.util.sequence.BasedSequence r11 = r11.subSequence(r13, r4)
            r10.text = r11
            r11 = r0
            goto L95
        L8b:
            com.vladsch.flexmark.util.sequence.BasedSequence r0 = r11.subSequence(r1, r0)
            r10.text = r0
            com.vladsch.flexmark.util.sequence.BasedSequence r11 = r11.subSequence(r13, r4)
        L95:
            r10.setLink(r11, r12, r14)
            com.vladsch.flexmark.util.sequence.BasedSequence r11 = r10.text
            boolean r11 = r11.isNull()
            if (r11 == 0) goto Lae
            if (r12 == 0) goto Lae
            com.vladsch.flexmark.util.sequence.BasedSequence r11 = r10.anchorMarker
            boolean r11 = r11.isNull()
            if (r11 != 0) goto Lae
            com.vladsch.flexmark.util.sequence.BasedSequence r11 = r10.pageRef
            r10.text = r11
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.ext.wikilink.WikiNode.setLinkChars(com.vladsch.flexmark.util.sequence.BasedSequence, boolean, boolean, boolean):void");
    }

    public void setOpeningMarker(BasedSequence basedSequence) {
        this.openingMarker = basedSequence;
    }

    public void setPageRef(BasedSequence basedSequence) {
        this.pageRef = basedSequence;
    }

    public void setText(BasedSequence basedSequence) {
        this.text = basedSequence;
    }

    public void setTextSeparatorMarker(BasedSequence basedSequence) {
        this.textSeparatorMarker = basedSequence;
    }

    public WikiNode(BasedSequence basedSequence, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(basedSequence);
        BasedSequence basedSequence2 = BasedSequence.NULL;
        this.openingMarker = basedSequence2;
        this.link = basedSequence2;
        this.pageRef = basedSequence2;
        this.anchorMarker = basedSequence2;
        this.anchorRef = basedSequence2;
        this.textSeparatorMarker = basedSequence2;
        this.text = basedSequence2;
        this.closingMarker = basedSequence2;
        this.linkIsFirst = z5;
        setLinkChars(basedSequence, z6, z7, z8);
    }
}
