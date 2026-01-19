package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public interface BlockQuoteLike {
    BasedSequence getChars();

    Document getDocument();

    Node getFirstChild();

    BasedSequence getOpeningMarker();
}
