package com.vladsch.flexmark.util.collection;

import java.util.BitSet;
import java.util.function.Function;

/* loaded from: classes.dex */
public class IndexedItemBitSetMap<K, M> extends IndexedItemSetMapBase<K, BitSet, M> {
    private final Function<M, K> computable;

    public IndexedItemBitSetMap(Function<M, K> function) {
        this(function, 0);
    }

    public Function<M, K> getComputable() {
        return this.computable;
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMapBase, com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public K mapKey(M m3) {
        return this.computable.apply(m3);
    }

    public IndexedItemBitSetMap(Function<M, K> function, int i6) {
        super(i6);
        this.computable = function;
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMapBase, com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public boolean addSetItem(BitSet bitSet, int i6) {
        boolean z5 = bitSet.get(i6);
        bitSet.set(i6);
        return z5;
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMapBase, com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public boolean containsSetItem(BitSet bitSet, int i6) {
        return bitSet.get(i6);
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMapBase, com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public BitSet newSet() {
        return new BitSet();
    }

    @Override // com.vladsch.flexmark.util.collection.IndexedItemSetMapBase, com.vladsch.flexmark.util.collection.IndexedItemSetMap
    public boolean removeSetItem(BitSet bitSet, int i6) {
        boolean z5 = bitSet.get(i6);
        bitSet.clear(i6);
        return z5;
    }
}
