package com.vladsch.flexmark.util.collection.iteration;

import java.util.List;

/* loaded from: classes.dex */
public class Reverse<T> implements ReversibleIterable<T> {
    private final boolean isReversed;
    private final List<T> list;

    /* loaded from: classes.dex */
    public static class ReversedListIterator<T> implements ReversibleIterator<T> {
        private int index;
        private final boolean isReversed;
        private final List<T> list;

        public ReversedListIterator(List<T> list, boolean z5) {
            this.list = list;
            this.isReversed = z5;
            if (z5) {
                this.index = list.size() != 0 ? list.size() - 1 : -1;
            } else {
                this.index = list.size() != 0 ? 0 : -1;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index != -1;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
        public boolean isReversed() {
            return this.isReversed;
        }

        @Override // java.util.Iterator
        public T next() {
            T t5 = this.list.get(this.index);
            int i6 = this.index;
            if (i6 != -1) {
                if (this.isReversed) {
                    this.index = i6 - 1;
                    return t5;
                }
                if (i6 == this.list.size() - 1) {
                    this.index = -1;
                    return t5;
                }
                this.index++;
            }
            return t5;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public Reverse(List<T> list) {
        this(list, true);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public boolean isReversed() {
        return this.isReversed;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIterable<T> reversed() {
        return new Reverse(this.list, !this.isReversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIterator<T> reversedIterator() {
        return new ReversedListIterator(this.list, !this.isReversed);
    }

    public Reverse(List<T> list, boolean z5) {
        this.list = list;
        this.isReversed = z5;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    public ReversibleIterator<T> iterator() {
        return new ReversedListIterator(this.list, this.isReversed);
    }
}
