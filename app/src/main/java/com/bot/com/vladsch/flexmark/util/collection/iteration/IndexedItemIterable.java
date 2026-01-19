package com.vladsch.flexmark.util.collection.iteration;

/* loaded from: classes.dex */
public class IndexedItemIterable<R> implements ReversibleIndexedIterable<R> {
    private final Indexed<R> items;
    private final boolean reversed;

    public IndexedItemIterable(Indexed<R> indexed) {
        this(indexed, false);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public boolean isReversed() {
        return this.reversed;
    }

    public IndexedItemIterable(Indexed<R> indexed, boolean z5) {
        this.items = indexed;
        this.reversed = z5;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIndexedIterable<R> reversed() {
        return new IndexedItemIterable(this.items, !this.reversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIndexedIterator<R> reversedIterator() {
        return new IndexedItemIterator(this.items, !this.reversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    public ReversibleIndexedIterator<R> iterator() {
        return new IndexedItemIterator(this.items, this.reversed);
    }
}
