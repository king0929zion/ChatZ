package com.vladsch.flexmark.util.collection;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MapEntry<K, V> implements Map.Entry<K, V> {
    private final K key;
    private final V value;

    public MapEntry(K k3, V v5) {
        this.key = k3;
        this.value = v5;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapEntry.class != obj.getClass()) {
            return false;
        }
        MapEntry mapEntry = (MapEntry) obj;
        if (Objects.equals(this.key, mapEntry.key)) {
            return Objects.equals(this.value, mapEntry.value);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        V v5 = this.value;
        return hashCode + (v5 != null ? v5.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v5) {
        throw new UnsupportedOperationException();
    }
}
