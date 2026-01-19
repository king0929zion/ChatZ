package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeTracker;

/* loaded from: classes.dex */
public interface PostProcessor {
    void process(NodeTracker nodeTracker, Node node);

    Document processDocument(Document document);
}
