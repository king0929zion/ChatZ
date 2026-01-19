package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public interface LinkRefProcessor {
    BasedSequence adjustInlineText(Document document, Node node);

    boolean allowDelimiters(BasedSequence basedSequence, Document document, Node node);

    Node createNode(BasedSequence basedSequence);

    int getBracketNestingLevel();

    boolean getWantExclamationPrefix();

    boolean isMatch(BasedSequence basedSequence);

    void updateNodeElements(Document document, Node node);
}
