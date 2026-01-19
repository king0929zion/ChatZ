package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;

/* loaded from: classes.dex */
class NodeRenderingHandlerWrapper {
    public final NodeRenderingHandlerWrapper myPreviousRenderingHandler;
    public final NodeRenderingHandler<?> myRenderingHandler;

    public NodeRenderingHandlerWrapper(NodeRenderingHandler<?> nodeRenderingHandler, NodeRenderingHandlerWrapper nodeRenderingHandlerWrapper) {
        this.myRenderingHandler = nodeRenderingHandler;
        this.myPreviousRenderingHandler = nodeRenderingHandlerWrapper;
    }
}
