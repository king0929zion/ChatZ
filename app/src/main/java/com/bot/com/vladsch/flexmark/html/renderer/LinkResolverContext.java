package com.vladsch.flexmark.html.renderer;

import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.html.Attributes;

/* loaded from: classes.dex */
public interface LinkResolverContext extends LinkResolverBasicContext {
    String encodeUrl(CharSequence charSequence);

    Node getCurrentNode();

    @Override // com.vladsch.flexmark.html.renderer.LinkResolverBasicContext
    Document getDocument();

    @Override // com.vladsch.flexmark.html.renderer.LinkResolverBasicContext
    DataHolder getOptions();

    void render(Node node);

    void renderChildren(Node node);

    ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Attributes attributes, Boolean bool);

    default ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Boolean bool) {
        return resolveLink(linkType, charSequence, null, bool);
    }
}
