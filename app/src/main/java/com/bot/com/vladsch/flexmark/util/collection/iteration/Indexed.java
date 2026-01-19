package com.vladsch.flexmark.util.collection.iteration;

/* loaded from: classes.dex */
public interface Indexed<E> {
    E get(int i6);

    int modificationCount();

    void removeAt(int i6);

    void set(int i6, E e6);

    int size();
}
