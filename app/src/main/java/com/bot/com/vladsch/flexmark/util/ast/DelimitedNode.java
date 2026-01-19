package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public interface DelimitedNode extends TextContainer {
    @Override // com.vladsch.flexmark.util.ast.TextContainer
    default boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        if (!BitFieldSet.any(i6, TextContainer.F_NODE_TEXT)) {
            return true;
        }
        iSequenceBuilder.append((CharSequence) getText());
        return false;
    }

    BasedSequence getChars();

    BasedSequence getClosingMarker();

    BasedSequence getOpeningMarker();

    BasedSequence getText();

    void setClosingMarker(BasedSequence basedSequence);

    void setOpeningMarker(BasedSequence basedSequence);

    void setText(BasedSequence basedSequence);
}
