package com.vladsch.flexmark.formatter;

import java.util.Set;

/* loaded from: classes.dex */
public interface NodeFormatter {
    default char getBlockQuoteLikePrefixChar() {
        return (char) 0;
    }

    Set<Class<?>> getNodeClasses();

    Set<NodeFormattingHandler<?>> getNodeFormattingHandlers();
}
