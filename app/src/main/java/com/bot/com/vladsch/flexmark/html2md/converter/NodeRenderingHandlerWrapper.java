package com.vladsch.flexmark.html2md.converter;

import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
class NodeRenderingHandlerWrapper<N extends Node> {
    public final NodeRenderingHandlerWrapper<N> myPreviousRenderingHandler;
    public final HtmlNodeRendererHandler<N> myRenderingHandler;

    public NodeRenderingHandlerWrapper(HtmlNodeRendererHandler<N> htmlNodeRendererHandler, NodeRenderingHandlerWrapper<N> nodeRenderingHandlerWrapper) {
        this.myRenderingHandler = htmlNodeRendererHandler;
        this.myPreviousRenderingHandler = nodeRenderingHandlerWrapper;
    }
}
