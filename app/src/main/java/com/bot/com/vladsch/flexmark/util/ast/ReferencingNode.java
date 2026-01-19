package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.ast.NodeRepository;
import com.vladsch.flexmark.util.ast.ReferenceNode;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public interface ReferencingNode<R extends NodeRepository<B>, B extends ReferenceNode> {
    BasedSequence getReference();

    B getReferenceNode(Document document);

    B getReferenceNode(R r5);

    boolean isDefined();
}
