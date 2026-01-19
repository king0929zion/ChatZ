package com.vladsch.flexmark.ext.gfm.strikethrough.internal;

import com.vladsch.flexmark.ext.gfm.strikethrough.Strikethrough;
import com.vladsch.flexmark.ext.gfm.strikethrough.Subscript;
import com.vladsch.flexmark.ext.gfm.strikethrough.internal.StrikethroughYouTrackRenderer;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class StrikethroughYouTrackRenderer implements NodeRenderer {

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new StrikethroughYouTrackRenderer(dataHolder);
        }
    }

    public StrikethroughYouTrackRenderer(DataHolder dataHolder) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Strikethrough strikethrough, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("--");
        nodeRendererContext.renderChildren(strikethrough);
        htmlWriter.raw("--");
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        final int i6 = 0;
        hashSet.add(new NodeRenderingHandler(Strikethrough.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: f3.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrikethroughYouTrackRenderer f11761b; {
                this.f11761b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i6) {
                    case 0:
                        this.f11761b.render((Strikethrough) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11761b.render((Subscript) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }));
        final int i7 = 1;
        hashSet.add(new NodeRenderingHandler(Subscript.class, new NodeRenderingHandler.CustomNodeRenderer(this) { // from class: f3.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrikethroughYouTrackRenderer f11761b; {
                this.f11761b = this;
            }

            @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
            public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
                switch (i7) {
                    case 0:
                        this.f11761b.render((Strikethrough) node, nodeRendererContext, htmlWriter);
                        return;
                    default:
                        this.f11761b.render((Subscript) node, nodeRendererContext, htmlWriter);
                        return;
                }
            }
        }));
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Subscript subscript, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        htmlWriter.raw("~");
        nodeRendererContext.renderChildren(subscript);
        htmlWriter.raw("~");
    }
}
