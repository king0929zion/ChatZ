package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public interface TableManipulator {
    public static final TableManipulator NULL = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(MarkdownTable markdownTable, Node node) {
    }

    void apply(MarkdownTable markdownTable, Node node);
}
