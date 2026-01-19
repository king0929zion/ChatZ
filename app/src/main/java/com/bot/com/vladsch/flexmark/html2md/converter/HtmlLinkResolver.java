package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.html.renderer.ResolvedLink;
import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public interface HtmlLinkResolver {
    ResolvedLink resolveLink(Node node, HtmlNodeConverterContext htmlNodeConverterContext, ResolvedLink resolvedLink);
}
