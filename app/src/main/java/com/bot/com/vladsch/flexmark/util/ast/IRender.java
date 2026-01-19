package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public interface IRender {
    DataHolder getOptions();

    default String render(Node node) {
        StringBuilder sb = new StringBuilder();
        render(node, sb);
        return sb.toString();
    }

    void render(Node node, Appendable appendable);
}
