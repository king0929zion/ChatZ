package com.vladsch.flexmark.util.collection.iteration;

/* loaded from: classes.dex */
public interface ReversibleIndexedIterable<E> extends ReversibleIterable<E> {
    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    ReversibleIndexedIterator<E> iterator();

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    ReversibleIndexedIterable<E> reversed();

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    ReversibleIndexedIterator<E> reversedIterator();
}
