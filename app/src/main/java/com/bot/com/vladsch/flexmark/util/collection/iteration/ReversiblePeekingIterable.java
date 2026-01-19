package com.vladsch.flexmark.util.collection.iteration;

/* loaded from: classes.dex */
public interface ReversiblePeekingIterable<E> extends ReversibleIterable<E> {
    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    ReversiblePeekingIterator<E> iterator();

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    ReversiblePeekingIterable<E> reversed();

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    ReversiblePeekingIterator<E> reversedIterator();
}
