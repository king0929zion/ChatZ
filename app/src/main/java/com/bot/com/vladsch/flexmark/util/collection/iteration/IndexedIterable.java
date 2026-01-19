package com.vladsch.flexmark.util.collection.iteration;

import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;

/* loaded from: classes.dex */
public class IndexedIterable<R, S, I extends ReversibleIterable<Integer>> implements ReversibleIndexedIterable<R> {
    private final Indexed<S> items;
    private final ReversibleIterable<Integer> iterable;

    public IndexedIterable(Indexed<S> indexed, I i6) {
        this.items = indexed;
        this.iterable = i6;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public boolean isReversed() {
        return this.iterable.isReversed();
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIndexedIterable<R> reversed() {
        return new IndexedIterable(this.items, this.iterable.reversed());
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIndexedIterator<R> reversedIterator() {
        return new IndexedIterator(this.items, this.iterable.reversedIterator());
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    public ReversibleIndexedIterator<R> iterator() {
        return new IndexedIterator(this.items, this.iterable.iterator());
    }
}
