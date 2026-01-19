package com.vladsch.flexmark.util.misc;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Pair<K, V> implements Paired<K, V> {
    private final K first;
    private final V second;

    public Pair(K k3, V v5) {
        this.first = k3;
        this.second = v5;
    }

    public static <K1, V1> Pair<K1, V1> of(K1 k12, V1 v12) {
        return new Pair<>(k12, v12);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (Objects.equals(this.first, entry.getKey())) {
            return Objects.equals(this.second, entry.getValue());
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.misc.Paired
    public K getFirst() {
        return this.first;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.first;
    }

    @Override // com.vladsch.flexmark.util.misc.Paired
    public V getSecond() {
        return this.second;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.second;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K k3 = this.first;
        int hashCode = (k3 != null ? k3.hashCode() : 0) * 31;
        V v5 = this.second;
        return hashCode + (v5 != null ? v5.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v5) {
        throw new IllegalStateException("setValue not supported");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        K k3 = this.first;
        if (k3 == null) {
            sb.append("null");
        } else {
            sb.append(k3);
        }
        sb.append(", ");
        V v5 = this.second;
        if (v5 == null) {
            sb.append("null");
        } else {
            sb.append(v5);
        }
        sb.append(')');
        return sb.toString();
    }
}
