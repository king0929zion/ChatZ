package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.DoNotLinkDecorate;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.ReplacedTextMapper;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public abstract class LinkNode implements LinkNodeBase, DoNotLinkDecorate, TextContainer {
    public LinkNode() {
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
            pageRef = getUrl();
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
        ReplacedTextMapper replacedTextMapper = new ReplacedTextMapper(pageRef);
        iSequenceBuilder.append((CharSequence) Escaping.percentDecodeUrl(Escaping.unescape(pageRef, replacedTextMapper), replacedTextMapper));
        return false;
    }

    public LinkNode(BasedSequence basedSequence) {
        super(basedSequence);
    }
}
