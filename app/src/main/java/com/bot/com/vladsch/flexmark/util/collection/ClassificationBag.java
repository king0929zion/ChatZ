package com.vladsch.flexmark.util.collection;

import com.vladsch.flexmark.util.collection.iteration.BitSetIterable;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public class ClassificationBag<K, V> {
    final IndexedItemBitSetMap<K, V> bag;
    final CollectionHost<V> host;
    private final OrderedSet<V> items;

    public ClassificationBag(Function<V, K> function) {
        this(0, function);
    }

    public boolean add(V v5) {
        return this.items.add(v5);
    }

    @SafeVarargs
    public final BitSet categoriesBitSet(K... kArr) {
        BitSet bitSet = new BitSet();
        for (K k3 : kArr) {
            BitSet bitSet2 = this.bag.get(k3);
            if (bitSet2 != null) {
                bitSet.or(bitSet2);
            }
        }
        return bitSet;
    }

    public void clear() {
        this.items.clear();
    }

    public boolean contains(V v5) {
        return this.items.contains(v5);
    }

    public boolean containsCategory(K k3) {
        BitSet bitSet = this.bag.get(k3);
        return (bitSet == null || bitSet.isEmpty()) ? false : true;
    }

    public int getCategoryCount(K k3) {
        BitSet bitSet = this.bag.get(k3);
        if (bitSet == null) {
            return 0;
        }
        return bitSet.cardinality();
    }

    @SafeVarargs
    public final <X> ReversibleIterable<X> getCategoryItems(Class<? extends X> cls, K... kArr) {
        return new IndexedIterable(this.items.getConcurrentModsIndexedProxy(), new BitSetIterable(categoriesBitSet(kArr), false));
    }

    @SafeVarargs
    public final <X> ReversibleIterable<X> getCategoryItemsReversed(Class<? extends X> cls, K... kArr) {
        return new IndexedIterable(this.items.getConcurrentModsIndexedProxy(), new BitSetIterable(categoriesBitSet(kArr), true));
    }

    public Map<K, BitSet> getCategoryMap() {
        return this.bag;
    }

    public BitSet getCategorySet(K k3) {
        return this.bag.get(k3);
    }

    public OrderedSet<V> getItems() {
        return this.items;
    }

    public int getModificationCount() {
        return this.items.getModificationCount();
    }

    public boolean remove(V v5) {
        return this.items.remove(v5);
    }

    public ClassificationBag(Function<V, K> function, CollectionHost<V> collectionHost) {
        this(0, function, collectionHost);
    }

    public final <X> ReversibleIterable<X> getCategoryItems(Class<? extends X> cls, Collection<? extends K> collection) {
        return new IndexedIterable(this.items.getConcurrentModsIndexedProxy(), new BitSetIterable(categoriesBitSet(collection), false));
    }

    public final <X> ReversibleIterable<X> getCategoryItemsReversed(Class<? extends X> cls, Collection<? extends K> collection) {
        return new IndexedIterable(this.items.getConcurrentModsIndexedProxy(), new BitSetIterable(categoriesBitSet(collection), true));
    }

    public boolean remove(int i6) {
        return this.items.removeIndex(i6);
    }

    public ClassificationBag(int i6, Function<V, K> function) {
        this(i6, function, null);
    }

    public final <X> ReversibleIterable<X> getCategoryItems(Class<? extends X> cls, BitSet bitSet) {
        return new IndexedIterable(this.items.getConcurrentModsIndexedProxy(), new BitSetIterable(bitSet, false));
    }

    public final <X> ReversibleIterable<X> getCategoryItemsReversed(Class<? extends X> cls, BitSet bitSet) {
        return new IndexedIterable(this.items.getConcurrentModsIndexedProxy(), new BitSetIterable(bitSet, true));
    }

    public ClassificationBag(int i6, Function<V, K> function, CollectionHost<V> collectionHost) {
        this.host = collectionHost;
        this.items = new OrderedSet<>(i6, new CollectionHost<V>() { // from class: com.vladsch.flexmark.util.collection.ClassificationBag.1
            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void adding(int i7, V v5, Object obj) {
                CollectionHost<V> collectionHost2 = ClassificationBag.this.host;
                if (collectionHost2 != null && !collectionHost2.skipHostUpdate()) {
                    ClassificationBag.this.host.adding(i7, v5, obj);
                }
                if (v5 != null) {
                    ClassificationBag.this.bag.addItem(v5, i7);
                }
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void addingNulls(int i7) {
                CollectionHost<V> collectionHost2 = ClassificationBag.this.host;
                if (collectionHost2 == null || collectionHost2.skipHostUpdate()) {
                    return;
                }
                ClassificationBag.this.host.addingNulls(i7);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void clearing() {
                CollectionHost<V> collectionHost2 = ClassificationBag.this.host;
                if (collectionHost2 != null && !collectionHost2.skipHostUpdate()) {
                    ClassificationBag.this.host.clearing();
                }
                ClassificationBag.this.bag.clear();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public int getIteratorModificationCount() {
                return ClassificationBag.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public Object removing(int i7, V v5) {
                CollectionHost<V> collectionHost2 = ClassificationBag.this.host;
                if (collectionHost2 != null && !collectionHost2.skipHostUpdate()) {
                    ClassificationBag.this.host.removing(i7, v5);
                }
                if (v5 == null) {
                    return null;
                }
                ClassificationBag.this.bag.removeItem(v5, i7);
                return null;
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public boolean skipHostUpdate() {
                return false;
            }
        });
        this.bag = new IndexedItemBitSetMap<>(function);
    }

    public final BitSet categoriesBitSet(Collection<? extends K> collection) {
        BitSet bitSet = new BitSet();
        Iterator<? extends K> it = collection.iterator();
        while (it.hasNext()) {
            BitSet bitSet2 = this.bag.get(it.next());
            if (bitSet2 != null) {
                bitSet.or(bitSet2);
            }
        }
        return bitSet;
    }
}
