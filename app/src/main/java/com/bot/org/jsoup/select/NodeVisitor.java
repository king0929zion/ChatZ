package org.jsoup.select;

import org.jsoup.nodes.Node;

@FunctionalInterface
/* loaded from: classes.dex */
public interface NodeVisitor {
    /* renamed from: head */
    void mo11head(Node node, int i6);

    default void tail(Node node, int i6) {
    }
}
