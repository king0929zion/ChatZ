package com.vladsch.flexmark.util.collection.iteration;

import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class BitSetIterator implements ReversibleIterator<Integer> {
    private final BitSet bitSet;
    private int last;
    private int next;
    private final boolean reversed;

    public BitSetIterator(BitSet bitSet) {
        this(bitSet, false);
    }

    @Override // java.util.Iterator
    public void forEachRemaining(Consumer<? super Integer> consumer) {
        while (hasNext()) {
            consumer.accept(next());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != -1;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
    public boolean isReversed() {
        return this.reversed;
    }

    @Override // java.util.Iterator
    public void remove() {
        int i6 = this.last;
        if (i6 == -1) {
            throw new NoSuchElementException();
        }
        this.bitSet.clear(i6);
    }

    public BitSetIterator(BitSet bitSet, boolean z5) {
        this.bitSet = bitSet;
        this.reversed = z5;
        this.next = z5 ? bitSet.previousSetBit(bitSet.length()) : bitSet.nextSetBit(0);
        this.last = -1;
    }

    @Override // java.util.Iterator
    public Integer next() {
        int i6 = this.next;
        int i7 = -1;
        if (i6 != -1) {
            this.last = i6;
            if (!this.reversed) {
                i7 = this.bitSet.nextSetBit(i6 + 1);
            } else if (i6 != 0) {
                i7 = this.bitSet.previousSetBit(i6 - 1);
            }
            this.next = i7;
            return Integer.valueOf(this.last);
        }
        throw new NoSuchElementException();
    }
}
