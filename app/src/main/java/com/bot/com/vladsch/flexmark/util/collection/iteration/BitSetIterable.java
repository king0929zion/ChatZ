package com.vladsch.flexmark.util.collection.iteration;

import java.util.BitSet;

/* loaded from: classes.dex */
public class BitSetIterable implements ReversibleIterable<Integer> {
    private final BitSet bitSet;
    private final boolean reversed;

    public BitSetIterable(BitSet bitSet) {
        this(bitSet, false);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public boolean isReversed() {
        return this.reversed;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIterable<Integer> reversed() {
        return new BitSetIterable(this.bitSet, !this.reversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversibleIterator<Integer> reversedIterator() {
        return new BitSetIterator(this.bitSet, !this.reversed);
    }

    public BitSetIterable(BitSet bitSet, boolean z5) {
        this.bitSet = bitSet;
        this.reversed = z5;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    public ReversibleIterator<Integer> iterator() {
        return new BitSetIterator(this.bitSet, this.reversed);
    }
}
