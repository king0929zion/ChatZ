package com.vladsch.flexmark.jira.converter;

import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.jira.converter.internal.JiraConverterNodeRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public class JiraConverterExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension {
    private JiraConverterExtension() {
    }

    public static JiraConverterExtension create() {
        return new JiraConverterExtension();
    }

    @Override // com.vladsch.flexmark.parser.Parser.ParserExtension
    public void extend(Parser.Builder builder) {
    }

    @Override // com.vladsch.flexmark.parser.Parser.ParserExtension
    public void parserOptions(MutableDataHolder mutableDataHolder) {
    }

    @Override // com.vladsch.flexmark.html.HtmlRenderer.HtmlRendererExtension, com.vladsch.flexmark.formatter.Formatter.FormatterExtension
    public void rendererOptions(MutableDataHolder mutableDataHolder) {
        DataKey<String> dataKey = HtmlRenderer.TYPE;
        String str = dataKey.get(mutableDataHolder);
        if (str.equals("HTML")) {
            mutableDataHolder.set((DataKey<DataKey<String>>) dataKey, (DataKey<String>) "JIRA");
        } else if (!str.equals("JIRA")) {
            throw new IllegalStateException("Non HTML Renderer is already set to ".concat(str));
        }
    }

    @Override // com.vladsch.flexmark.html.HtmlRenderer.HtmlRendererExtension
    public void extend(HtmlRenderer.Builder builder, String str) {
        if (builder.isRendererType("JIRA")) {
            builder.nodeRendererFactory(new JiraConverterNodeRenderer.Factory());
            return;
        }
        throw new IllegalStateException(AbstractC1135a.f("Jira Converter Extension used with non Jira Renderer ", str));
    }
}
