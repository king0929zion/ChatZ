package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.PrefixedSubSequence;
import com.vladsch.flexmark.util.sequence.ReplacedTextMapper;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public final class Text extends Node implements TextContainer {
    public Text() {
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        if (BitFieldSet.any(i6, TextContainer.F_NODE_TEXT)) {
            iSequenceBuilder.append((CharSequence) getChars());
            return false;
        }
        BasedSequence unescape = Escaping.unescape(getChars(), new ReplacedTextMapper(getChars()));
        if (unescape.isEmpty()) {
            return false;
        }
        iSequenceBuilder.append((CharSequence) unescape);
        return false;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public void getAstExtra(StringBuilder sb) {
        astExtraChars(sb);
        if (getChars() instanceof PrefixedSubSequence) {
            Node.astChars(sb, getChars(), "text");
        }
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public String toStringAttributes() {
        return "text=" + ((Object) getChars());
    }

    public Text(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public Text(String str) {
        super(BasedSequence.of(str));
    }

    public Text(String str, BasedSequence basedSequence) {
        super(PrefixedSubSequence.prefixOf(str, basedSequence));
    }
}
