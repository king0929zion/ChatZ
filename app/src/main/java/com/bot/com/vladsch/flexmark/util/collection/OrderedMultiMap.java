package com.vladsch.flexmark.util.collection;

import com.vladsch.flexmark.util.collection.iteration.BitSetIterable;
import com.vladsch.flexmark.util.collection.iteration.BitSetIterator;
import com.vladsch.flexmark.util.collection.iteration.Indexed;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterable;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;
import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.misc.Paired;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class OrderedMultiMap<K, V> implements Map<K, V>, Iterable<Map.Entry<K, V>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final CollectionHost<Paired<K, V>> host;
    private Indexed<Map.Entry<K, V>> indexedProxy;
    boolean isInKeyUpdate;
    boolean isInValueUpdate;
    private final OrderedSet<K> keySet;
    private final OrderedSet<V> valueSet;

    public OrderedMultiMap() {
        this(0, null);
    }

    private boolean addKeyValue(K k3, V v5) {
        int indexOf = this.keySet.indexOf(k3);
        int indexOf2 = this.valueSet.indexOf(v5);
        if (indexOf == -1 && indexOf2 == -1) {
            this.isInKeyUpdate = true;
            this.isInValueUpdate = true;
            CollectionHost<Paired<K, V>> collectionHost = this.host;
            if (collectionHost != null && !collectionHost.skipHostUpdate()) {
                this.host.adding(this.keySet.getValueList().size(), new Pair(k3, v5), null);
            }
            if (k3 == null) {
                this.keySet.addNull();
            } else {
                this.keySet.add(k3, v5);
            }
            if (k3 == null) {
                this.valueSet.addNull();
            } else {
                this.valueSet.add(v5, k3);
            }
            this.isInValueUpdate = false;
            this.isInKeyUpdate = false;
            return true;
        }
        if (indexOf == -1) {
            this.isInKeyUpdate = true;
            this.isInValueUpdate = true;
            CollectionHost<Paired<K, V>> collectionHost2 = this.host;
            if (collectionHost2 != null && !collectionHost2.skipHostUpdate()) {
                this.host.adding(indexOf2, new Pair(k3, v5), null);
            }
            if (k3 == null) {
                this.keySet.removeIndex(indexOf2);
            } else {
                this.keySet.setValueAt(indexOf2, k3, v5);
            }
            this.isInValueUpdate = false;
            this.isInKeyUpdate = false;
            return true;
        }
        if (indexOf2 == -1) {
            this.isInKeyUpdate = true;
            this.isInValueUpdate = true;
            CollectionHost<Paired<K, V>> collectionHost3 = this.host;
            if (collectionHost3 != null && !collectionHost3.skipHostUpdate()) {
                this.host.adding(indexOf, new Pair(k3, v5), null);
            }
            if (k3 == null) {
                this.valueSet.removeIndex(indexOf2);
            } else {
                this.valueSet.setValueAt(indexOf, v5, k3);
            }
            this.isInValueUpdate = false;
            return true;
        }
        if (indexOf2 == indexOf) {
            return false;
        }
        throw new IllegalStateException("keySet[" + indexOf + "]=" + k3 + " and valueSet[" + indexOf2 + "]=" + v5 + " are out of sync");
    }

    private BitSet getKeyValueIntersectionSet() {
        BitSet bitSet = new BitSet(this.keySet.size());
        bitSet.or(this.keySet.getValidIndices());
        bitSet.and(this.valueSet.getValidIndices());
        return bitSet;
    }

    private BitSet getKeyValueUnionSet() {
        BitSet bitSet = new BitSet(this.keySet.size());
        bitSet.or(this.keySet.getValidIndices());
        bitSet.or(this.valueSet.getValidIndices());
        return bitSet;
    }

    public void addNullEntry(int i6) {
        this.isInKeyUpdate = true;
        this.isInValueUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.addingNulls(i6);
        }
        this.keySet.addNulls(i6);
        this.valueSet.addNulls(i6);
        this.isInValueUpdate = false;
        this.isInKeyUpdate = false;
    }

    public void addingKey(int i6, K k3, Object obj) {
        this.isInValueUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.adding(i6, new Pair(k3, obj), null);
        }
        if (obj == null) {
            this.valueSet.addNulls(i6);
        } else {
            this.valueSet.add(obj);
        }
        this.isInValueUpdate = false;
    }

    public void addingNullKey(int i6) {
        this.isInValueUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.addingNulls(i6);
        }
        while (valueSet().size() <= i6) {
            this.valueSet.add(null);
        }
        this.isInValueUpdate = false;
    }

    public void addingNullValue(int i6) {
        this.isInKeyUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.addingNulls(i6);
        }
        while (this.keySet.size() <= i6) {
            this.keySet.add(null);
        }
        this.isInKeyUpdate = false;
    }

    public void addingValue(int i6, V v5, Object obj) {
        this.isInKeyUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.adding(i6, new Pair(obj, v5), null);
        }
        if (obj == null) {
            this.keySet.addNulls(i6);
        } else {
            this.keySet.add(obj);
        }
        this.isInKeyUpdate = false;
    }

    @Override // java.util.Map
    public void clear() {
        this.isInValueUpdate = true;
        this.isInKeyUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.clearing();
        }
        this.keySet.clear();
        this.valueSet.clear();
        this.isInKeyUpdate = false;
        this.isInValueUpdate = false;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.keySet.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.keySet.isValidIndex(this.valueSet.indexOf(obj));
    }

    public ReversibleIterable<Map.Entry<K, V>> entrySetIterable() {
        return new IndexedIterable(getIndexedProxy(), new BitSetIterable(getKeyValueUnionSet()));
    }

    public ReversibleIndexedIterator<Map.Entry<K, V>> entrySetIterator() {
        return new IndexedIterator(getIndexedProxy(), new BitSetIterator(getKeyValueUnionSet()));
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderedMultiMap orderedMultiMap = (OrderedMultiMap) obj;
        if (size() != orderedMultiMap.size()) {
            return false;
        }
        return entrySet().equals(orderedMultiMap.entrySet());
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super Map.Entry<K, V>> consumer) {
        ReversibleIndexedIterator<Map.Entry<K, V>> entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            consumer.accept(entrySetIterator.next());
        }
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getKeyValue(obj);
    }

    public Map.Entry<K, V> getEntry(int i6) {
        return new MapEntry(this.keySet.getValueOrNull(i6), this.valueSet.getValueOrNull(i6));
    }

    public Indexed<Map.Entry<K, V>> getIndexedProxy() {
        Indexed<Map.Entry<K, V>> indexed = this.indexedProxy;
        if (indexed != null) {
            return indexed;
        }
        Indexed<Map.Entry<K, V>> indexed2 = new Indexed<Map.Entry<K, V>>() { // from class: com.vladsch.flexmark.util.collection.OrderedMultiMap.3
            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public int modificationCount() {
                return OrderedMultiMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public void removeAt(int i6) {
                OrderedMultiMap.this.removeEntryIndex(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public int size() {
                return OrderedMultiMap.this.size();
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public Map.Entry<K, V> get(int i6) {
                return OrderedMultiMap.this.getEntry(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public void set(int i6, Map.Entry<K, V> entry) {
                throw new UnsupportedOperationException();
            }
        };
        this.indexedProxy = indexed2;
        return indexed2;
    }

    public K getKey(int i6) {
        if (this.keySet.isValidIndex(i6)) {
            return this.keySet.getValueList().get(i6);
        }
        return null;
    }

    public V getKeyValue(Object obj) {
        int indexOf = this.keySet.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.valueSet.getValue(indexOf);
    }

    public int getModificationCount() {
        return (int) (this.keySet.getModificationCount() + this.valueSet.getModificationCount());
    }

    public V getValue(int i6) {
        if (this.valueSet.isValidIndex(i6)) {
            return this.valueSet.getValue(i6);
        }
        return null;
    }

    public K getValueKey(Object obj) {
        int indexOf = this.valueSet.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.keySet.getValue(indexOf);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.valueSet.hashCode() + (this.keySet.hashCode() * 31);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.keySet.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySetIterator();
    }

    public ReversibleIterable<K> keyIterable() {
        return new IndexedIterable(this.keySet.getIndexedProxy(), this.keySet.indexIterable());
    }

    public ReversibleIndexedIterator<K> keyIterator() {
        return keySet().iterator();
    }

    public OrderedSet<Map.Entry<K, V>> keyValueEntrySet() {
        this.isInValueUpdate = true;
        this.isInKeyUpdate = true;
        OrderedSet<Map.Entry<K, V>> orderedSet = new OrderedSet<>(this.keySet.size(), new CollectionHost<Map.Entry<K, V>>() { // from class: com.vladsch.flexmark.util.collection.OrderedMultiMap.4
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void addingNulls(int i6) {
                OrderedMultiMap.this.addNullEntry(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void clearing() {
                OrderedMultiMap.this.clear();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public int getIteratorModificationCount() {
                return OrderedMultiMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public boolean skipHostUpdate() {
                OrderedMultiMap orderedMultiMap = OrderedMultiMap.this;
                return orderedMultiMap.isInKeyUpdate || orderedMultiMap.isInValueUpdate;
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void adding(int i6, Map.Entry<K, V> entry, Object obj) {
                OrderedMultiMap.this.putKeyValue(entry.getKey(), entry.getValue());
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public Object removing(int i6, Map.Entry<K, V> entry) {
                if (OrderedMultiMap.this.removeEntryIndex(i6, entry.getKey(), entry.getValue())) {
                    return entry;
                }
                return null;
            }
        });
        ReversibleIndexedIterator<Map.Entry<K, V>> entrySetIterator = entrySetIterator();
        while (entrySetIterator.hasNext()) {
            orderedSet.add(entrySetIterator.next());
        }
        this.isInValueUpdate = false;
        this.isInKeyUpdate = false;
        return orderedSet;
    }

    public Collection<K> keys() {
        if (!this.keySet.isSparse()) {
            return this.keySet;
        }
        ArrayList arrayList = new ArrayList(this.valueSet.size());
        arrayList.addAll(this.keySet);
        return arrayList;
    }

    @Override // java.util.Map
    public V put(K k3, V v5) {
        return putKeyValue(k3, v5);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        putAllKeyValues(map);
    }

    public void putAllKeyValues(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void putAllValueKeys(Map<? extends V, ? extends K> map) {
        for (Map.Entry<? extends V, ? extends K> entry : map.entrySet()) {
            putValueKey(entry.getKey(), entry.getValue());
        }
    }

    public boolean putEntry(Map.Entry<K, V> entry) {
        return addKeyValue(entry.getKey(), entry.getValue());
    }

    public V putKeyValue(K k3, V v5) {
        if (addKeyValue(k3, v5)) {
            return null;
        }
        return v5;
    }

    public boolean putKeyValueEntry(Map.Entry<K, V> entry) {
        return addKeyValue(entry.getKey(), entry.getValue());
    }

    public boolean putKeyValuePair(Paired<K, V> paired) {
        return addKeyValue(paired.getFirst(), paired.getSecond());
    }

    public K putValueKey(V v5, K k3) {
        if (addKeyValue(k3, v5)) {
            return null;
        }
        return k3;
    }

    public boolean putValueKeyEntry(Map.Entry<V, K> entry) {
        return addKeyValue(entry.getValue(), entry.getKey());
    }

    public boolean putValueKeyPair(Paired<V, K> paired) {
        return addKeyValue(paired.getSecond(), paired.getFirst());
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return removeKey(obj);
    }

    public Map.Entry<K, V> removeEntry(Map.Entry<K, V> entry) {
        if (removeEntryIndex(-1, entry.getKey(), entry.getValue())) {
            return entry;
        }
        return null;
    }

    public boolean removeEntryIndex(int i6) {
        return removeEntryIndex(i6, this.keySet.getValueOrNull(i6), this.valueSet.getValueOrNull(i6));
    }

    public V removeKey(Object obj) {
        int indexOf;
        this.isInKeyUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate() && (indexOf = this.keySet.indexOf(obj)) != -1) {
            this.host.removing(indexOf, new Pair(obj, this.valueSet.isValidIndex(indexOf) ? this.valueSet.getValue(indexOf) : null));
        }
        V v5 = (V) this.keySet.removeHosted(obj);
        this.isInKeyUpdate = false;
        return v5;
    }

    public K removeValue(Object obj) {
        this.isInValueUpdate = true;
        int indexOf = this.valueSet.indexOf(obj);
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate() && indexOf != -1) {
            this.host.removing(indexOf, new Pair(this.keySet.isValidIndex(indexOf) ? this.keySet.getValue(indexOf) : null, obj));
        }
        K k3 = (K) this.valueSet.removeHosted(obj);
        this.isInValueUpdate = false;
        return k3;
    }

    public Object removingKey(int i6, K k3) {
        this.isInValueUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.removing(i6, new Pair(k3, null));
        }
        Object removeIndexHosted = this.valueSet.removeIndexHosted(i6);
        this.isInValueUpdate = false;
        return removeIndexHosted;
    }

    public Object removingValue(int i6, V v5) {
        this.isInKeyUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.removing(i6, new Pair(null, v5));
        }
        Object removeIndexHosted = this.keySet.removeIndexHosted(i6);
        this.isInKeyUpdate = false;
        return removeIndexHosted;
    }

    public ReversibleIterable<Map.Entry<K, V>> reversedEntrySetIterable() {
        return new IndexedIterable(getIndexedProxy(), new BitSetIterable(getKeyValueUnionSet()));
    }

    public ReversibleIndexedIterator<Map.Entry<K, V>> reversedEntrySetIterator() {
        return new IndexedIterator(getIndexedProxy(), new BitSetIterator(getKeyValueUnionSet(), true));
    }

    public ReversibleIterable<K> reversedKeyIterable() {
        return new IndexedIterable(this.keySet.getIndexedProxy(), this.keySet.reversedIndexIterable());
    }

    public ReversibleIndexedIterator<K> reversedKeyIterator() {
        return keySet().reversedIterator();
    }

    public ReversibleIterable<V> reversedValueIterable() {
        return new IndexedIterable(this.valueSet.getIndexedProxy(), this.valueSet.reversedIndexIterable());
    }

    public ReversibleIndexedIterator<V> reversedValueIterator() {
        return this.valueSet.reversedIterator();
    }

    @Override // java.util.Map
    public int size() {
        return this.keySet.size();
    }

    public ReversibleIterable<V> valueIterable() {
        return new IndexedIterable(this.valueSet.getIndexedProxy(), this.valueSet.indexIterable());
    }

    public ReversibleIndexedIterator<V> valueIterator() {
        return this.valueSet.iterator();
    }

    public OrderedSet<V> valueSet() {
        return this.valueSet;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        if (!this.keySet.isSparse()) {
            return this.valueSet;
        }
        ArrayList arrayList = new ArrayList(this.keySet.size());
        arrayList.addAll(this.valueSet);
        return arrayList;
    }

    public OrderedMultiMap(int i6) {
        this(i6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeEntryIndex(int i6, K k3, V v5) {
        int indexOf = this.keySet.indexOf(k3);
        int indexOf2 = this.valueSet.indexOf(v5);
        if (indexOf != indexOf2) {
            throw new IllegalStateException("keySet[" + indexOf + "]=" + k3 + " and valueSet[" + indexOf2 + "]=" + v5 + " are out of sync");
        }
        if (i6 != -1 && indexOf != i6) {
            StringBuilder j3 = AbstractC1135a.j(i6, "removeEntryIndex ", indexOf, " does not match keySet[", "]=");
            j3.append(k3);
            j3.append(" and valueSet[");
            j3.append(indexOf2);
            j3.append("]=");
            j3.append(v5);
            j3.append(" are out of sync");
            throw new IllegalStateException(j3.toString());
        }
        if (indexOf == -1) {
            return false;
        }
        this.isInKeyUpdate = true;
        this.isInValueUpdate = true;
        CollectionHost<Paired<K, V>> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.removing(indexOf, new Pair(k3, v5));
        }
        this.keySet.removeHosted(k3);
        this.valueSet.removeHosted(v5);
        this.isInValueUpdate = false;
        this.isInKeyUpdate = false;
        return true;
    }

    @Override // java.util.Map
    public OrderedSet<Map.Entry<K, V>> entrySet() {
        return keyValueEntrySet();
    }

    @Override // java.util.Map
    public OrderedSet<K> keySet() {
        return this.keySet;
    }

    public OrderedMultiMap(CollectionHost<Paired<K, V>> collectionHost) {
        this(0, collectionHost);
    }

    public OrderedMultiMap(int i6, CollectionHost<Paired<K, V>> collectionHost) {
        this.host = collectionHost;
        this.indexedProxy = null;
        this.valueSet = new OrderedSet<>(i6, new CollectionHost<V>() { // from class: com.vladsch.flexmark.util.collection.OrderedMultiMap.1
            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void adding(int i7, V v5, Object obj) {
                OrderedMultiMap.this.addingValue(i7, v5, obj);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void addingNulls(int i7) {
                OrderedMultiMap.this.addingNullValue(i7);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void clearing() {
                OrderedMultiMap.this.clear();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public int getIteratorModificationCount() {
                return OrderedMultiMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public Object removing(int i7, V v5) {
                return OrderedMultiMap.this.removingValue(i7, v5);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public boolean skipHostUpdate() {
                return OrderedMultiMap.this.isInKeyUpdate;
            }
        });
        this.keySet = new OrderedSet<>(i6, new CollectionHost<K>() { // from class: com.vladsch.flexmark.util.collection.OrderedMultiMap.2
            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void adding(int i7, K k3, Object obj) {
                OrderedMultiMap.this.addingKey(i7, k3, obj);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void addingNulls(int i7) {
                OrderedMultiMap.this.addingNullKey(i7);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void clearing() {
                OrderedMultiMap.this.clear();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public int getIteratorModificationCount() {
                return OrderedMultiMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public Object removing(int i7, K k3) {
                return OrderedMultiMap.this.removingKey(i7, k3);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public boolean skipHostUpdate() {
                return OrderedMultiMap.this.isInValueUpdate;
            }
        });
    }
}
