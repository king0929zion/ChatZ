package com.vladsch.flexmark.util.collection.iteration;

/* loaded from: classes.dex */
public interface ReversibleIterable<E> extends Iterable<E> {
    boolean isReversed();

    @Override // java.lang.Iterable
    ReversibleIterator<E> iterator();

    ReversibleIterable<E> reversed();

    ReversibleIterator<E> reversedIterator();
}
