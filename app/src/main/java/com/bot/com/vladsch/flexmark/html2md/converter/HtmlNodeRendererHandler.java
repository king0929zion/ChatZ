package com.vladsch.flexmark.html2md.converter;

import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public class HtmlNodeRendererHandler<N extends Node> implements CustomHtmlNodeRenderer<N> {
    protected final CustomHtmlNodeRenderer<N> myAdapter;
    protected final Class<? extends N> myClass;
    protected final String myTagName;

    public HtmlNodeRendererHandler(String str, Class<? extends N> cls, CustomHtmlNodeRenderer<N> customHtmlNodeRenderer) {
        this.myTagName = str;
        this.myClass = cls;
        this.myAdapter = customHtmlNodeRenderer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HtmlNodeRendererHandler htmlNodeRendererHandler = (HtmlNodeRendererHandler) obj;
            if (this.myClass == htmlNodeRendererHandler.myClass && this.myAdapter == htmlNodeRendererHandler.myAdapter) {
                return true;
            }
        }
        return false;
    }

    public CustomHtmlNodeRenderer<N> getNodeAdapter() {
        return this.myAdapter;
    }

    public Class<? extends N> getNodeType() {
        return this.myClass;
    }

    public String getTagName() {
        return this.myTagName;
    }

    public int hashCode() {
        return this.myAdapter.hashCode() + (this.myClass.hashCode() * 31);
    }

    @Override // com.vladsch.flexmark.html2md.converter.CustomHtmlNodeRenderer
    public void render(Node node, HtmlNodeConverterContext htmlNodeConverterContext, HtmlMarkdownWriter htmlMarkdownWriter) {
        this.myAdapter.render(node, htmlNodeConverterContext, htmlMarkdownWriter);
    }
}
