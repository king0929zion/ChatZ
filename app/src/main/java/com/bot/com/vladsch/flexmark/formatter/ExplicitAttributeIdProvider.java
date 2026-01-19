package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public interface ExplicitAttributeIdProvider {
    void addExplicitId(Node node, String str, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter);
}
