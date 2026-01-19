package com.vladsch.flexmark.util.collection.iteration;

import com.vladsch.flexmark.util.collection.iteration.ReversibleIterator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class IndexedIterator<R, S, I extends ReversibleIterator<Integer>> implements ReversibleIndexedIterator<R> {
    private final Indexed<S> items;
    private final I iterator;
    private int lastIndex = -1;
    private int modificationCount;

    public IndexedIterator(Indexed<S> indexed, I i6) {
        this.items = indexed;
        this.iterator = i6;
        this.modificationCount = indexed.modificationCount();
    }

    @Override // java.util.Iterator
    public void forEachRemaining(Consumer<? super R> consumer) {
        while (hasNext()) {
            consumer.accept(next());
        }
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterator
    public int getIndex() {
        int i6 = this.lastIndex;
        if (i6 >= 0) {
            return i6;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
    public boolean isReversed() {
        return this.iterator.isReversed();
    }

    @Override // java.util.Iterator
    public R next() {
        if (this.modificationCount != this.items.modificationCount()) {
            throw new ConcurrentModificationException();
        }
        int intValue = ((Integer) this.iterator.next()).intValue();
        this.lastIndex = intValue;
        return this.items.get(intValue);
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.lastIndex == -1) {
            throw new NoSuchElementException();
        }
        if (this.modificationCount != this.items.modificationCount()) {
            throw new ConcurrentModificationException();
        }
        this.items.removeAt(this.lastIndex);
        this.lastIndex = -1;
        this.modificationCount = this.items.modificationCount();
    }
}
