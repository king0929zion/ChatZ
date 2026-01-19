package com.vladsch.flexmark.html2md.converter;

import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public interface CustomHtmlNodeRenderer<N extends Node> {
    void render(N n3, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter);
}
