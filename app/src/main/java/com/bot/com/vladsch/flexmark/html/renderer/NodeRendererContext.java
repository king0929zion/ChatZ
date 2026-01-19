package com.vladsch.flexmark.html.renderer;

import com.vladsch.flexmark.html.HtmlRendererOptions;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.MutableAttributes;

/* loaded from: classes.dex */
public interface NodeRendererContext extends LinkResolverContext {
    void delegateRender();

    void doNotRenderLinks();

    void doNotRenderLinks(boolean z5);

    void doRenderLinks();

    MutableAttributes extendRenderingNodeAttributes(AttributablePart attributablePart, Attributes attributes);

    MutableAttributes extendRenderingNodeAttributes(Node node, AttributablePart attributablePart, Attributes attributes);

    NodeRendererContext getDelegatedSubContext(boolean z5);

    HtmlRendererOptions getHtmlOptions();

    HtmlWriter getHtmlWriter();

    String getNodeId(Node node);

    RenderingPhase getRenderingPhase();

    NodeRendererContext getSubContext(boolean z5);

    boolean isDoNotRenderLinks();
}
