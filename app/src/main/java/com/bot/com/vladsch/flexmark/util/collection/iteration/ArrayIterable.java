package com.vladsch.flexmark.util.collection.iteration;

/* loaded from: classes.dex */
public class ArrayIterable<T> implements ReversibleIterable<T> {
    private final T[] array;
    private final int endIndex;
    private final boolean isReversed;
    private final int startIndex;

    /* loaded from: classes.dex */
    public static class MyIterator<E> implements ReversibleIterator<E> {
        private final E[] array;
        private final int endIndex;
        private int index;
        private final boolean isReversed;
        private final int startIndex;

        public MyIterator(E[] eArr, int i6, int i7, boolean z5) {
            this.isReversed = z5;
            this.array = eArr;
            this.startIndex = i6;
            this.endIndex = i7;
            this.index = z5 ? i7 : i6;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.isReversed ? this.index >= this.startIndex : this.index < this.endIndex;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
        public boolean isReversed() {
            return this.isReversed;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.isReversed) {
                E[] eArr = this.array;
                int i6 = this.index - 1;
                this.index = i6;
                return eArr[i6];
            }
            E[] eArr2 = this.array;
            int i7 = this.index;
            this.index = i7 + 1;
            return eArr2[i7];
        }
    }

    public ArrayIterable(T[] tArr) {
        this(tArr, 0, tArr.length, false);
    }

    public static <T> ArrayIterable<T> of(T[] tArr) {
        return new ArrayIterable<>(tArr);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public boolean isReversed() {
        return this.isReversed;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIterable<T> reversed() {
        return new ArrayIterable(this.array, this.startIndex, this.endIndex, !this.isReversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIterator<T> reversedIterator() {
        return new MyIterator(this.array, this.startIndex, this.endIndex, !this.isReversed);
    }

    public ArrayIterable(T[] tArr, int i6) {
        this(tArr, i6, tArr.length, false);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    public ReversibleIterator<T> iterator() {
        return new MyIterator(this.array, this.startIndex, this.endIndex, this.isReversed);
    }

    public ArrayIterable(T[] tArr, int i6, int i7) {
        this(tArr, i6, i7, false);
    }

    public ArrayIterable(T[] tArr, int i6, int i7, boolean z5) {
        this.array = tArr;
        this.startIndex = Math.min(i6, 0);
        this.endIndex = Math.max(i7, tArr.length);
        this.isReversed = z5;
    }
}
