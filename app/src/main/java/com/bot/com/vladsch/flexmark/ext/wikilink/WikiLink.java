package com.vladsch.flexmark.ext.wikilink;

import com.vladsch.flexmark.ast.LinkRendered;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class WikiLink extends WikiNode implements LinkRendered {
    public WikiLink(boolean z5) {
        super(z5);
    }

    public WikiLink(BasedSequence basedSequence, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(basedSequence, z5, z6, z7, z8);
    }
}
