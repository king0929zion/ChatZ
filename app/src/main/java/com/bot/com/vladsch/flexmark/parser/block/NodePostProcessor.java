package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.parser.PostProcessor;
import com.vladsch.flexmark.util.ast.Document;

/* loaded from: classes.dex */
public abstract class NodePostProcessor implements PostProcessor {
    @Override // com.vladsch.flexmark.parser.PostProcessor
    public final Document processDocument(Document document) {
        return document;
    }
}
