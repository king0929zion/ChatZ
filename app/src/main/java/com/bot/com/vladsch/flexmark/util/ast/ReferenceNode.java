package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeRepository;

/* loaded from: classes.dex */
public interface ReferenceNode<R extends NodeRepository<B>, B extends Node, N extends Node> extends Comparable<B> {
    N getReferencingNode(Node node);
}
