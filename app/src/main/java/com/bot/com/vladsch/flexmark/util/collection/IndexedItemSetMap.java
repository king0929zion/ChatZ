package com.vladsch.flexmark.util.collection;

import java.util.Map;

/* loaded from: classes.dex */
public interface IndexedItemSetMap<M, S, K> extends Map<M, S> {
    boolean addItem(K k3, int i6);

    boolean addSetItem(S s5, int i6);

    boolean containsItem(K k3, int i6);

    boolean containsSetItem(S s5, int i6);

    M mapKey(K k3);

    S newSet();

    boolean removeItem(K k3, int i6);

    boolean removeSetItem(S s5, int i6);
}
