package com.vladsch.flexmark.util.misc;

import java.util.Map;

/* loaded from: classes.dex */
public interface Paired<K, V> extends Map.Entry<K, V> {
    default K component1() {
        return getFirst();
    }

    default V component2() {
        return getSecond();
    }

    K getFirst();

    V getSecond();
}
