package com.vladsch.flexmark.util.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class IndexedItemSetMapBase<K, S, M> implements IndexedItemSetMap<K, S, M> {
    protected final HashMap<K, S> bag;

    public IndexedItemSetMapBase() {
        this(0);
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public boolean addItem(M m3, int i6) {
        K mapKey = mapKey(m3);
        S s5 = this.bag.get(mapKey);
        if (s5 == null) {
            s5 = newSet();
            this.bag.put(mapKey, s5);
        }
        return addSetItem(s5, i6);
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public abstract boolean addSetItem(S s5, int i6);

    @Override // java.util.Map
    public void clear() {
        this.bag.clear();
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public boolean containsItem(M m3, int i6) {
        S s5 = this.bag.get(mapKey(m3));
        return s5 != null && containsSetItem(s5, i6);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.bag.containsKey(obj);
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public abstract boolean containsSetItem(S s5, int i6);

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.bag.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, S>> entrySet() {
        return this.bag.entrySet();
    }

    @Override // java.util.Map
    public S get(Object obj) {
        return this.bag.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.bag.keySet();
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public abstract K mapKey(M m3);

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public abstract S newSet();

    @Override // java.util.Map
    public S put(K k3, S s5) {
        return this.bag.put(k3, s5);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends S> map) {
        this.bag.putAll(map);
    }

    @Override // java.util.Map
    public S remove(Object obj) {
        return this.bag.remove(obj);
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public boolean removeItem(M m3, int i6) {
        S s5 = this.bag.get(mapKey(m3));
        return s5 != null && removeSetItem(s5, i6);
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public abstract boolean removeSetItem(S s5, int i6);

    @Override // java.util.Map
    public int size() {
        return this.bag.size();
    }

    @Override // java.util.Map
    public Collection<S> values() {
        return this.bag.values();
    }

    public IndexedItemSetMapBase(int i6) {
        this.bag = new HashMap<>();
    }
}
