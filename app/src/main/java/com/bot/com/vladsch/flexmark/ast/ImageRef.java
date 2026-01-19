package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class ImageRef extends RefNode {
    public ImageRef() {
    }

    @Override // com.vladsch.flexmark.ast.RefNode
    public void setTextChars(BasedSequence basedSequence) {
        int length = basedSequence.length();
        this.textOpeningMarker = basedSequence.subSequence(0, 2);
        int i6 = length - 1;
        this.text = basedSequence.subSequence(2, i6).trim();
        this.textClosingMarker = basedSequence.subSequence(i6, length);
    }

    public ImageRef(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public ImageRef(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4, BasedSequence basedSequence5, BasedSequence basedSequence6) {
        super(basedSequence, basedSequence2, basedSequence3, basedSequence4, basedSequence5, basedSequence6);
    }

    public ImageRef(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4, BasedSequence basedSequence5, BasedSequence basedSequence6, BasedSequence basedSequence7) {
        super(basedSequence, basedSequence2, basedSequence3, basedSequence4, basedSequence5, basedSequence6, basedSequence7);
    }

    public ImageRef(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3) {
        super(basedSequence, basedSequence2, basedSequence3);
    }

    public ImageRef(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4) {
        super(basedSequence, basedSequence2, basedSequence3, basedSequence4);
    }

    public ImageRef(BasedSequence basedSequence, BasedSequence basedSequence2, BasedSequence basedSequence3, BasedSequence basedSequence4, BasedSequence basedSequence5) {
        super(basedSequence, basedSequence2, basedSequence3, basedSequence4, basedSequence5);
    }
}
