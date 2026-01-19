package com.vladsch.flexmark.ext.wikilink.internal;

import com.vladsch.flexmark.ext.emoji.Emoji;
import com.vladsch.flexmark.ext.emoji.internal.EmojiNodeFormatter;
import com.vladsch.flexmark.ext.wikilink.WikiImage;
import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.NodeFormatter;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.NodeFormattingHandler;
import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements NodeFormattingHandler.CustomNodeFormatter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NodeFormatter f11290b;

    public /* synthetic */ a(NodeFormatter nodeFormatter, int i6) {
        this.a = i6;
        this.f11290b = nodeFormatter;
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormattingHandler.CustomNodeFormatter
    public final void render(Node node, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        switch (this.a) {
            case 0:
                ((WikiLinkNodeFormatter) this.f11290b).render((WikiLink) node, nodeFormatterContext, markdownWriter);
                return;
            case 1:
                ((WikiLinkNodeFormatter) this.f11290b).render((WikiImage) node, nodeFormatterContext, markdownWriter);
                return;
            default:
                ((EmojiNodeFormatter) this.f11290b).render((Emoji) node, nodeFormatterContext, markdownWriter);
                return;
        }
    }
}
