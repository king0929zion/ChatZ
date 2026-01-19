package com.vladsch.flexmark.util.dependency;

import com.vladsch.flexmark.util.collection.CollectionHost;
import com.vladsch.flexmark.util.collection.OrderedMap;

/* loaded from: classes.dex */
public class DependentItemMap<D> extends OrderedMap<Class<?>, DependentItem<D>> {
    public DependentItemMap() {
    }

    public DependentItemMap(int i6) {
        super(i6);
    }

    public DependentItemMap(CollectionHost<Class<?>> collectionHost) {
        super(collectionHost);
    }

    public DependentItemMap(int i6, CollectionHost<Class<?>> collectionHost) {
        super(i6, collectionHost);
    }
}
