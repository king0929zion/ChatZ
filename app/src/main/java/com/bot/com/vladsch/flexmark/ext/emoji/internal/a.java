package com.vladsch.flexmark.ext.emoji.internal;

import com.vladsch.flexmark.ext.emoji.Emoji;
import com.vladsch.flexmark.ext.ins.Ins;
import com.vladsch.flexmark.ext.ins.internal.InsJiraRenderer;
import com.vladsch.flexmark.ext.ins.internal.InsNodeRenderer;
import com.vladsch.flexmark.ext.superscript.Superscript;
import com.vladsch.flexmark.ext.superscript.internal.SuperscriptJiraRenderer;
import com.vladsch.flexmark.ext.superscript.internal.SuperscriptNodeRenderer;
import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.ext.wikilink.internal.WikiLinkJiraRenderer;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.util.ast.Node;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements NodeRenderingHandler.CustomNodeRenderer {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NodeRenderer f11284b;

    public /* synthetic */ a(NodeRenderer nodeRenderer, int i6) {
        this.a = i6;
        this.f11284b = nodeRenderer;
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderingHandler.CustomNodeRenderer
    public final void render(Node node, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        switch (this.a) {
            case 0:
                ((EmojiJiraRenderer) this.f11284b).render((Emoji) node, nodeRendererContext, htmlWriter);
                return;
            case 1:
                ((EmojiNodeRenderer) this.f11284b).render((Emoji) node, nodeRendererContext, htmlWriter);
                return;
            case 2:
                ((WikiLinkJiraRenderer) this.f11284b).render((WikiLink) node, nodeRendererContext, htmlWriter);
                return;
            case 3:
                InsJiraRenderer.a((InsJiraRenderer) this.f11284b, (Ins) node, nodeRendererContext, htmlWriter);
                return;
            case 4:
                InsNodeRenderer.a((InsNodeRenderer) this.f11284b, (Ins) node, nodeRendererContext, htmlWriter);
                return;
            case AbstractC1787b.f15290g /* 5 */:
                SuperscriptJiraRenderer.a((SuperscriptJiraRenderer) this.f11284b, (Superscript) node, nodeRendererContext, htmlWriter);
                return;
            default:
                SuperscriptNodeRenderer.a((SuperscriptNodeRenderer) this.f11284b, (Superscript) node, nodeRendererContext, htmlWriter);
                return;
        }
    }
}
