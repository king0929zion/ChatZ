package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.util.ast.Node;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class NodeRendererSubContext implements NodeRendererContext {
    final HtmlWriter htmlWriter;
    NodeRenderingHandlerWrapper renderingHandlerWrapper;
    Node renderingNode = null;
    int doNotRenderLinksNesting = 0;

    public NodeRendererSubContext(HtmlWriter htmlWriter) {
        this.htmlWriter = htmlWriter;
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRendererContext
    public void doNotRenderLinks(boolean z5) {
        if (z5) {
            doNotRenderLinks();
        } else {
            doRenderLinks();
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRendererContext
    public void doRenderLinks() {
        int i6 = this.doNotRenderLinksNesting;
        if (i6 == 0) {
            throw new IllegalStateException("Not in do not render links context");
        }
        this.doNotRenderLinksNesting = i6 - 1;
    }

    public void flushTo(Appendable appendable, int i6) {
        flushTo(appendable, getHtmlOptions().maxBlankLines, i6);
    }

    public int getDoNotRenderLinksNesting() {
        return this.doNotRenderLinksNesting;
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRendererContext
    public HtmlWriter getHtmlWriter() {
        return this.htmlWriter;
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRendererContext
    public boolean isDoNotRenderLinks() {
        return this.doNotRenderLinksNesting != 0;
    }

    public void flushTo(Appendable appendable, int i6, int i7) {
        this.htmlWriter.line();
        try {
            this.htmlWriter.appendTo(appendable, i6, i7);
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRendererContext
    public void doNotRenderLinks() {
        this.doNotRenderLinksNesting++;
    }
}
