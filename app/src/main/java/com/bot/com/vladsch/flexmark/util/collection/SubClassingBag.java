package com.vladsch.flexmark.util.collection;

import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class SubClassingBag<T> {
    private final ClassificationBag<Class<?>, T> items;
    private final HashMap<Class<?>, BitSet> subClassMap = new HashMap<>();

    public SubClassingBag(ClassificationBag<Class<?>, T> classificationBag, HashMap<Class<?>, List<Class<?>>> hashMap) {
        this.items = classificationBag;
        for (Class<?> cls : hashMap.keySet()) {
            BitSet categoriesBitSet = this.items.categoriesBitSet(hashMap.get(cls));
            if (!categoriesBitSet.isEmpty()) {
                this.subClassMap.put(cls, categoriesBitSet);
            }
        }
    }

    public boolean contains(T t5) {
        return this.items.contains(t5);
    }

    public boolean containsType(Class<?> cls) {
        return this.items.containsCategory(cls);
    }

    public OrderedSet<T> getItems() {
        return this.items.getItems();
    }

    public int getTypeCount(Class<?> cls) {
        BitSet bitSet = this.subClassMap.get(cls);
        if (bitSet == null) {
            return 0;
        }
        return bitSet.cardinality();
    }

    public BitSet getTypeSet(Class<?> cls) {
        return this.subClassMap.get(cls);
    }

    public final <X> ReversibleIterable<X> itemsOfType(Class<X> cls, Class<?>... clsArr) {
        return this.items.getCategoryItems(cls, typeBitSet((Class<?>) cls, clsArr));
    }

    public final <X> ReversibleIterable<X> reversedItemsOfType(Class<X> cls, Class<?>... clsArr) {
        return this.items.getCategoryItemsReversed(cls, typeBitSet((Class<?>) cls, clsArr));
    }

    public final BitSet typeBitSet(Class<?> cls, Class<?>... clsArr) {
        BitSet bitSet = new BitSet();
        for (Class<?> cls2 : clsArr) {
            if (cls.isAssignableFrom(cls2) && this.subClassMap.containsKey(cls2)) {
                bitSet.or(this.subClassMap.get(cls2));
            }
        }
        return bitSet;
    }

    public final <X> ReversibleIterable<X> itemsOfType(Class<X> cls, Collection<Class<?>> collection) {
        return this.items.getCategoryItems(cls, typeBitSet((Class<?>) cls, collection));
    }

    public final <X> ReversibleIterable<X> reversedItemsOfType(Class<X> cls, Collection<Class<?>> collection) {
        return this.items.getCategoryItemsReversed(cls, typeBitSet((Class<?>) cls, collection));
    }

    public final BitSet typeBitSet(Class<?> cls, Collection<Class<?>> collection) {
        BitSet bitSet = new BitSet();
        for (Class<?> cls2 : collection) {
            if (cls.isAssignableFrom(cls2) && this.subClassMap.containsKey(cls2)) {
                bitSet.or(this.subClassMap.get(cls2));
            }
        }
        return bitSet;
    }
}
