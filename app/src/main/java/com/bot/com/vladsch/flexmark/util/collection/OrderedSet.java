package com.vladsch.flexmark.util.collection;

import com.vladsch.flexmark.util.collection.iteration.BitSetIterable;
import com.vladsch.flexmark.util.collection.iteration.BitSetIterator;
import com.vladsch.flexmark.util.collection.iteration.Indexed;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterable;
import com.vladsch.flexmark.util.collection.iteration.IndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIndexedIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterator;
import j1.AbstractC1135a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class OrderedSet<E> implements Set<E>, Iterable<E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Indexed<E> allowConcurrentModsIndexedProxy;
    private final CollectionHost<E> host;
    private Indexed<E> indexedProxy;
    private final HashMap<E, Integer> keyMap;
    private int modificationCount;
    private final BitSet validIndices;
    final ArrayList<E> valueList;

    /* loaded from: classes.dex */
    public class IndexedProxy implements Indexed<E> {
        private final boolean allowConcurrentMods;

        public IndexedProxy(boolean z5) {
            this.allowConcurrentMods = z5;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public E get(int i6) {
            return (E) OrderedSet.this.getValue(i6);
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public int modificationCount() {
            if (this.allowConcurrentMods) {
                return 0;
            }
            return OrderedSet.this.getIteratorModificationCount();
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public void removeAt(int i6) {
            OrderedSet.this.removeIndexHosted(i6);
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public void set(int i6, E e6) {
            OrderedSet.this.setValueAt(i6, e6, null);
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.Indexed
        public int size() {
            return OrderedSet.this.valueList.size();
        }
    }

    public OrderedSet() {
        this(0);
    }

    public static <T1> T1 ifNull(T1 t12, T1 t13) {
        return t12 == null ? t13 : t12;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e6) {
        return add(e6, null);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean[] zArr = {false};
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (add(it.next())) {
                zArr[0] = true;
            }
        }
        return zArr[0];
    }

    public void addNull() {
        addNulls(this.valueList.size());
    }

    public void addNulls(int i6) {
        CollectionHost<E> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.addingNulls(i6);
        }
        this.modificationCount++;
        while (this.valueList.size() <= i6) {
            this.valueList.add(null);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        CollectionHost<E> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.clearing();
        }
        this.modificationCount++;
        this.keyMap.clear();
        this.valueList.clear();
        this.validIndices.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.keyMap.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.keyMap.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public BitSet differenceBitSet(Iterable<? extends E> iterable) {
        return differenceBitSet(iterable.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderedSet orderedSet = (OrderedSet) obj;
        if (size() != orderedSet.size()) {
            return false;
        }
        ReversibleIndexedIterator<E> it = orderedSet.iterator();
        ReversibleIndexedIterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (!it2.next().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Indexed<E> getConcurrentModsIndexedProxy() {
        Indexed<E> indexed = this.allowConcurrentModsIndexedProxy;
        if (indexed != null) {
            return indexed;
        }
        IndexedProxy indexedProxy = new IndexedProxy(true);
        this.allowConcurrentModsIndexedProxy = indexedProxy;
        return indexedProxy;
    }

    public Indexed<E> getIndexedProxy() {
        Indexed<E> indexed = this.indexedProxy;
        if (indexed != null) {
            return indexed;
        }
        IndexedProxy indexedProxy = new IndexedProxy(false);
        this.indexedProxy = indexedProxy;
        return indexedProxy;
    }

    public int getIteratorModificationCount() {
        CollectionHost<E> collectionHost = this.host;
        return collectionHost != null ? collectionHost.getIteratorModificationCount() : this.modificationCount;
    }

    public int getModificationCount() {
        return this.modificationCount;
    }

    public BitSet getValidIndices() {
        return this.validIndices;
    }

    public E getValue(int i6) {
        validateIndex(i6);
        return this.valueList.get(i6);
    }

    public List<E> getValueList() {
        return this.valueList;
    }

    public E getValueOrNull(int i6) {
        if (isValidIndex(i6)) {
            return this.valueList.get(i6);
        }
        return null;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.validIndices.hashCode() + ((this.valueList.hashCode() + (this.keyMap.hashCode() * 31)) * 31);
    }

    public boolean inHostUpdate() {
        CollectionHost<E> collectionHost = this.host;
        return collectionHost != null && collectionHost.skipHostUpdate();
    }

    public BitSet indexBitSet(Iterable<? extends E> iterable) {
        BitSet bitSet = new BitSet();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            int indexOf = indexOf(it.next());
            if (indexOf != -1) {
                bitSet.set(indexOf);
            }
        }
        return bitSet;
    }

    public ReversibleIterable<Integer> indexIterable() {
        return new BitSetIterable(this.validIndices);
    }

    public ReversibleIterator<Integer> indexIterator() {
        return new BitSetIterator(this.validIndices);
    }

    public int indexOf(Object obj) {
        return ((Integer) ifNull(this.keyMap.get(obj), -1)).intValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.keyMap.isEmpty();
    }

    public boolean isSparse() {
        return this.validIndices.nextClearBit(0) < this.valueList.size();
    }

    public boolean isValidIndex(int i6) {
        return i6 >= 0 && i6 < this.valueList.size() && this.validIndices.get(i6);
    }

    public ReversibleIterable<E> iterable() {
        return new IndexedIterable(getIndexedProxy(), indexIterable());
    }

    public BitSet keyDifferenceBitSet(Iterable<? extends Map.Entry<? extends E, ?>> iterable) {
        return keyDifferenceBitSet(iterable.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return removeHosted(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean z5 = false;
        for (Object obj : collection) {
            if (this.keyMap.containsKey(obj) && remove(obj)) {
                z5 = true;
            }
        }
        return z5;
    }

    public Object removeHosted(Object obj) {
        Integer num = this.keyMap.get(obj);
        if (num == null) {
            return null;
        }
        return removeIndexHosted(num.intValue());
    }

    public boolean removeIndex(int i6) {
        return removeIndexHosted(i6) != null;
    }

    public Object removeIndexHosted(int i6) {
        validateIndex(i6);
        E e6 = this.valueList.get(i6);
        CollectionHost<E> collectionHost = this.host;
        Object removing = (collectionHost == null || collectionHost.skipHostUpdate()) ? e6 : this.host.removing(i6, e6);
        this.modificationCount++;
        this.keyMap.remove(e6);
        if (this.keyMap.size() != 0) {
            if (this.host == null && i6 == this.valueList.size() - 1) {
                this.valueList.remove(i6);
            }
            this.validIndices.clear(i6);
            return removing;
        }
        CollectionHost<E> collectionHost2 = this.host;
        if (collectionHost2 != null && !collectionHost2.skipHostUpdate()) {
            this.host.clearing();
        }
        this.valueList.clear();
        this.validIndices.clear();
        return removing;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        BitSet bitSet = new BitSet(this.valueList.size());
        boolean z5 = false;
        bitSet.set(0, this.valueList.size());
        bitSet.and(this.validIndices);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            int indexOf = indexOf(it.next());
            if (indexOf != -1) {
                bitSet.clear(indexOf);
            }
        }
        int size = this.valueList.size();
        if (size == 0) {
            return false;
        }
        while (true) {
            int i6 = size - 1;
            if (size <= 0 || (size = bitSet.previousSetBit(i6)) == -1) {
                break;
            }
            remove(this.valueList.get(size));
            z5 = true;
        }
        return z5;
    }

    public ReversibleIterable<Integer> reversedIndexIterable() {
        return new BitSetIterable(this.validIndices, true);
    }

    public ReversibleIterator<Integer> reversedIndexIterator() {
        return new BitSetIterator(this.validIndices, true);
    }

    public ReversibleIterable<E> reversedIterable() {
        return new IndexedIterable(getIndexedProxy(), reversedIndexIterable());
    }

    public ReversibleIndexedIterator<E> reversedIterator() {
        return new IndexedIterator(getIndexedProxy(), reversedIndexIterator());
    }

    public boolean setValueAt(int i6, E e6, Object obj) {
        int indexOf = indexOf(e6);
        if (indexOf != -1) {
            if (i6 == indexOf) {
                return false;
            }
            throw new IllegalStateException("Trying to add existing element " + e6 + "[" + indexOf + "] at index " + i6);
        }
        if (i6 < this.valueList.size()) {
            if (this.validIndices.get(i6)) {
                throw new IllegalStateException("Trying to add new element " + e6 + " at index " + i6 + ", already occupied by " + this.valueList.get(i6));
            }
        } else if (i6 > this.valueList.size()) {
            addNulls(i6 - 1);
        }
        CollectionHost<E> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.adding(i6, e6, obj);
        }
        this.keyMap.put(e6, Integer.valueOf(i6));
        this.valueList.set(i6, e6);
        this.validIndices.set(i6);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.keyMap.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.keyMap.size()];
        int i6 = -1;
        int i7 = -1;
        while (true) {
            i6++;
            if (i6 >= this.valueList.size()) {
                return objArr;
            }
            if (this.validIndices.get(i6)) {
                i7++;
                objArr[i7] = this.valueList.get(i6);
            }
        }
    }

    public void validateIndex(int i6) {
        if (isValidIndex(i6)) {
            return;
        }
        int size = this.valueList.size();
        boolean z5 = this.validIndices.get(i6);
        StringBuilder j3 = AbstractC1135a.j(i6, "Index ", size, " is not valid, size=", " validIndices[");
        j3.append(i6);
        j3.append("]=");
        j3.append(z5);
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public BitSet valueDifferenceBitSet(Iterable<? extends Map.Entry<?, ? extends E>> iterable) {
        return valueDifferenceBitSet(iterable.iterator());
    }

    public List<E> values() {
        if (!isSparse()) {
            return this.valueList;
        }
        ArrayList arrayList = new ArrayList();
        ReversibleIterator<E> it = iterable().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public OrderedSet(int i6) {
        this(i6, null);
    }

    public boolean add(E e6, Object obj) {
        if (this.keyMap.containsKey(e6)) {
            return false;
        }
        int size = this.valueList.size();
        CollectionHost<E> collectionHost = this.host;
        if (collectionHost != null && !collectionHost.skipHostUpdate()) {
            this.host.adding(size, e6, obj);
        }
        this.modificationCount++;
        this.keyMap.put(e6, Integer.valueOf(size));
        this.valueList.add(e6);
        this.validIndices.set(size);
        return true;
    }

    public BitSet differenceBitSet(Iterator<? extends E> it) {
        BitSet bitSet = new BitSet();
        int i6 = 0;
        while (it.hasNext()) {
            int indexOf = indexOf(it.next());
            if (indexOf != i6) {
                bitSet.set(indexOf);
            }
            i6++;
        }
        return bitSet;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public ReversibleIndexedIterator<E> iterator() {
        return new IndexedIterator(getIndexedProxy(), indexIterator());
    }

    public BitSet keyDifferenceBitSet(Iterator<? extends Map.Entry<? extends E, ?>> it) {
        BitSet bitSet = new BitSet();
        int i6 = 0;
        while (it.hasNext()) {
            int indexOf = indexOf(it.next().getKey());
            if (indexOf != i6) {
                bitSet.set(indexOf);
            }
            i6++;
        }
        return bitSet;
    }

    public BitSet valueDifferenceBitSet(Iterator<? extends Map.Entry<?, ? extends E>> it) {
        BitSet bitSet = new BitSet();
        int i6 = 0;
        while (it.hasNext()) {
            int indexOf = indexOf(it.next().getValue());
            if (indexOf != i6) {
                bitSet.set(indexOf);
            }
            i6++;
        }
        return bitSet;
    }

    public OrderedSet(CollectionHost<E> collectionHost) {
        this(0, collectionHost);
    }

    public OrderedSet(int i6, CollectionHost<E> collectionHost) {
        this.keyMap = new HashMap<>(i6);
        this.valueList = new ArrayList<>(i6);
        this.validIndices = new BitSet();
        this.host = collectionHost;
        this.modificationCount = Integer.MIN_VALUE;
        this.indexedProxy = null;
        this.allowConcurrentModsIndexedProxy = null;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.keyMap.size()) {
            tArr = tArr.getClass() == Object[].class ? (T[]) new Object[this.keyMap.size()] : (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.keyMap.size()));
        }
        int i6 = -1;
        int i7 = -1;
        while (true) {
            i6++;
            if (i6 >= this.valueList.size()) {
                break;
            }
            if (this.validIndices.get(i6)) {
                i7++;
                tArr[i7] = this.valueList.get(i6);
            }
        }
        int i8 = i7 + 1;
        if (tArr.length > i8) {
            tArr[i8] = null;
        }
        return tArr;
    }
}
