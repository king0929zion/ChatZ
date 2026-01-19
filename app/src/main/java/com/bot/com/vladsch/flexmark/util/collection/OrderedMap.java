package com.vladsch.flexmark.util.collection;

import B3.e;
import com.vladsch.flexmark.util.collection.iteration.Indexed;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterable;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class OrderedMap<K, V> implements Map<K, V>, Iterable<Map.Entry<K, V>> {
    private final CollectionHost<K> host;
    boolean inUpdate;
    private Indexed<Map.Entry<K, V>> indexedEntryProxy;
    private Indexed<V> indexedValueProxy;
    final OrderedSet<K> keySet;
    private final ArrayList<V> valueList;

    /* loaded from: classes.dex */
    public class EntryCollectionHost<KK extends K, VV extends V> implements CollectionHost<Map.Entry<KK, VV>> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public /* synthetic */ EntryCollectionHost(OrderedMap orderedMap, int i6) {
            this();
        }

        @Override // com.vladsch.flexmark.util.collection.CollectionHost
        public void addingNulls(int i6) {
            OrderedMap.this.keySet.addNulls(i6);
        }

        @Override // com.vladsch.flexmark.util.collection.CollectionHost
        public void clearing() {
            OrderedMap.this.keySet.clear();
        }

        @Override // com.vladsch.flexmark.util.collection.CollectionHost
        public int getIteratorModificationCount() {
            return OrderedMap.this.getModificationCount();
        }

        @Override // com.vladsch.flexmark.util.collection.CollectionHost
        public boolean skipHostUpdate() {
            return OrderedMap.this.inUpdate;
        }

        private EntryCollectionHost() {
        }

        @Override // com.vladsch.flexmark.util.collection.CollectionHost
        public void adding(int i6, Map.Entry<KK, VV> entry, Object obj) {
            OrderedMap.this.keySet.add(entry.getKey(), entry.getValue());
        }

        @Override // com.vladsch.flexmark.util.collection.CollectionHost
        public Object removing(int i6, Map.Entry<KK, VV> entry) {
            OrderedMap.this.keySet.removeIndex(i6);
            return entry;
        }
    }

    public OrderedMap() {
        this(0, null);
    }

    public void addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void addNull() {
        addNulls(this.valueList.size());
    }

    public void addNulls(int i6) {
        if (i6 < this.valueList.size()) {
            throw new IllegalArgumentException(e.k("addNulls(", i6, this.valueList.size(), ") called when valueList size is "));
        }
        while (this.valueList.size() <= i6) {
            this.valueList.add(null);
        }
    }

    public void adding(int i6, K k3, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        CollectionHost<K> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.adding(i6, k3, obj);
        }
        this.valueList.add(obj);
    }

    public void addingNull(int i6) {
        CollectionHost<K> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.addingNulls(i6);
        }
        addNulls(i6);
    }

    @Override // java.util.Map
    public void clear() {
        this.keySet.clear();
    }

    public void clearing() {
        CollectionHost<K> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.clearing();
        }
        this.valueList.clear();
    }

    public V computeIfMissing(K k3, Function<? super K, ? extends V> function) {
        int indexOf = this.keySet.indexOf(k3);
        if (indexOf != -1) {
            return this.valueList.get(indexOf);
        }
        V apply = function.apply(k3);
        this.keySet.add(k3, apply);
        return apply;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.keySet.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.keySet.isValidIndex(this.valueList.indexOf(obj));
    }

    public List<Map.Entry<K, V>> entries() {
        ArrayList arrayList = new ArrayList();
        ReversibleIndexedIterator<Map.Entry<K, V>> entryIterator = entryIterator();
        while (entryIterator.hasNext()) {
            arrayList.add(entryIterator.next());
        }
        return arrayList;
    }

    public ReversibleIterable<Map.Entry<K, V>> entryIterable() {
        return new IndexedIterable(getIndexedEntryProxy(), this.keySet.indexIterable());
    }

    public ReversibleIndexedIterator<Map.Entry<K, V>> entryIterator() {
        return new IndexedIterator(getIndexedEntryProxy(), this.keySet.indexIterator());
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderedMap orderedMap = (OrderedMap) obj;
        if (size() != orderedMap.size()) {
            return false;
        }
        return entrySet().equals(orderedMap.entrySet());
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super Map.Entry<K, V>> consumer) {
        ReversibleIndexedIterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int indexOf = this.keySet.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.valueList.get(indexOf);
    }

    public Map.Entry<K, V> getEntry(int i6) {
        return new MapEntry(this.keySet.getValue(i6), this.valueList.get(i6));
    }

    public Indexed<Map.Entry<K, V>> getIndexedEntryProxy() {
        Indexed<Map.Entry<K, V>> indexed = this.indexedEntryProxy;
        if (indexed != null) {
            return indexed;
        }
        Indexed<Map.Entry<K, V>> indexed2 = new Indexed<Map.Entry<K, V>>() { // from class: com.vladsch.flexmark.util.collection.OrderedMap.2
            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public int modificationCount() {
                return OrderedMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public void removeAt(int i6) {
                OrderedMap.this.keySet.removeIndexHosted(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public int size() {
                return OrderedMap.this.size();
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public Map.Entry<K, V> get(int i6) {
                return OrderedMap.this.getEntry(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public void set(int i6, Map.Entry<K, V> entry) {
                throw new UnsupportedOperationException();
            }
        };
        this.indexedEntryProxy = indexed2;
        return indexed2;
    }

    public Indexed<V> getIndexedValueProxy() {
        Indexed<V> indexed = this.indexedValueProxy;
        if (indexed != null) {
            return indexed;
        }
        Indexed<V> indexed2 = new Indexed<V>() { // from class: com.vladsch.flexmark.util.collection.OrderedMap.3
            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public V get(int i6) {
                return (V) OrderedMap.this.getValue(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public int modificationCount() {
                return OrderedMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public void removeAt(int i6) {
                OrderedMap.this.keySet.removeIndexHosted(i6);
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public void set(int i6, V v5) {
                throw new UnsupportedOperationException();
            }

            @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
            public int size() {
                return OrderedMap.this.size();
            }
        };
        this.indexedValueProxy = indexed2;
        return indexed2;
    }

    public K getKey(int i6) {
        if (this.keySet.isValidIndex(i6)) {
            return this.keySet.getValueList().get(i6);
        }
        return null;
    }

    public int getModificationCount() {
        return this.keySet.getModificationCount();
    }

    public V getValue(int i6) {
        if (this.keySet.isValidIndex(i6)) {
            return this.valueList.get(i6);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.valueList.hashCode() + (this.keySet.hashCode() * 31);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.keySet.isEmpty();
    }

    public ReversibleIterable<K> keyIterable() {
        return this.keySet.iterable();
    }

    public ReversibleIndexedIterator<K> keyIterator() {
        return this.keySet.iterator();
    }

    public List<K> keys() {
        return this.keySet.values();
    }

    @Override // java.util.Map
    public V put(K k3, V v5) {
        int indexOf = this.keySet.indexOf(k3);
        if (indexOf == -1) {
            this.keySet.add(k3, v5);
            return null;
        }
        V v6 = this.valueList.get(indexOf);
        this.valueList.set(indexOf, v5);
        return v6;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return (V) this.keySet.removeHosted(obj);
    }

    public Object removing(int i6, K k3) {
        CollectionHost<K> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.removing(i6, k3);
        }
        return this.valueList.get(i6);
    }

    public ReversibleIterable<Map.Entry<K, V>> reversedEntryIterable() {
        return new IndexedIterable(getIndexedEntryProxy(), this.keySet.reversedIndexIterable());
    }

    public ReversibleIndexedIterator<Map.Entry<K, V>> reversedEntryIterator() {
        return new IndexedIterator(getIndexedEntryProxy(), this.keySet.reversedIndexIterator());
    }

    public ReversibleIterable<Map.Entry<K, V>> reversedIterable() {
        return reversedEntryIterable();
    }

    public ReversibleIndexedIterator<Map.Entry<K, V>> reversedIterator() {
        return reversedEntryIterator();
    }

    public ReversibleIterable<K> reversedKeyIterable() {
        return this.keySet.reversedIterable();
    }

    public ReversibleIndexedIterator<K> reversedKeyIterator() {
        return this.keySet.reversedIterator();
    }

    public ReversibleIterable<V> reversedValueIterable() {
        return new IndexedIterable(getIndexedValueProxy(), this.keySet.reversedIndexIterable());
    }

    public ReversibleIndexedIterator<V> reversedValueIterator() {
        return new IndexedIterator(getIndexedValueProxy(), this.keySet.reversedIndexIterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.keySet.size();
    }

    public ReversibleIterable<V> valueIterable() {
        return new IndexedIterable(getIndexedValueProxy(), this.keySet.indexIterable());
    }

    public ReversibleIndexedIterator<V> valueIterator() {
        return new IndexedIterator(getIndexedValueProxy(), this.keySet.indexIterator());
    }

    @Override // java.util.Map
    public Collection<V> values() {
        if (!this.keySet.isSparse()) {
            return this.valueList;
        }
        ArrayList arrayList = new ArrayList(this.keySet.size());
        ReversibleIterator<Integer> indexIterator = this.keySet.indexIterator();
        while (indexIterator.hasNext()) {
            arrayList.add(this.valueList.get(indexIterator.next().intValue()));
        }
        return arrayList;
    }

    public OrderedMap(int i6) {
        this(i6, null);
    }

    @Override // java.util.Map
    public OrderedSet<Map.Entry<K, V>> entrySet() {
        this.inUpdate = true;
        OrderedSet<Map.Entry<K, V>> orderedSet = new OrderedSet<>(this.keySet.size(), new EntryCollectionHost(this, 0));
        ReversibleIndexedIterator<Map.Entry<K, V>> entryIterator = entryIterator();
        while (entryIterator.hasNext()) {
            orderedSet.add(entryIterator.next());
        }
        this.inUpdate = false;
        return orderedSet;
    }

    @Override // java.lang.Iterable
    public ReversibleIndexedIterator<Map.Entry<K, V>> iterator() {
        return entryIterator();
    }

    @Override // java.util.Map
    public OrderedSet<K> keySet() {
        return this.keySet;
    }

    public OrderedMap(CollectionHost<K> collectionHost) {
        this(0, collectionHost);
    }

    public OrderedMap(int i6, CollectionHost<K> collectionHost) {
        this.valueList = new ArrayList<>(i6);
        this.host = collectionHost;
        this.indexedEntryProxy = null;
        this.indexedValueProxy = null;
        this.keySet = new OrderedSet<>(i6, new CollectionHost<K>() { // from class: com.vladsch.flexmark.util.collection.OrderedMap.1
            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void adding(int i7, K k3, Object obj) {
                OrderedMap.this.adding(i7, k3, obj);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void addingNulls(int i7) {
                OrderedMap.this.addingNull(i7);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public void clearing() {
                OrderedMap.this.clearing();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public int getIteratorModificationCount() {
                return OrderedMap.this.getModificationCount();
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public Object removing(int i7, K k3) {
                return OrderedMap.this.removing(i7, k3);
            }

            @Override // com.vladsch.flexmark.util.collection.CollectionHost
            public boolean skipHostUpdate() {
                return OrderedMap.this.inUpdate;
            }
        });
    }
}
