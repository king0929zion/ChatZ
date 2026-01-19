package com.vladsch.flexmark.util.collection;

/* loaded from: classes.dex */
public interface CollectionHost<K> {
    void adding(int i6, K k3, Object obj);

    void addingNulls(int i6);

    void clearing();

    int getIteratorModificationCount();

    Object removing(int i6, K k3);

    boolean skipHostUpdate();
}
