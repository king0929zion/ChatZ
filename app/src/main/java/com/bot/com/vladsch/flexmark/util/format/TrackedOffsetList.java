package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.Seg;
import com.vladsch.flexmark.util.sequence.builder.tree.BasedOffsetTracker;
import com.vladsch.flexmark.util.sequence.builder.tree.OffsetInfo;
import com.vladsch.flexmark.util.sequence.builder.tree.SegmentOffsetTree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public class TrackedOffsetList implements List<TrackedOffset> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static TrackedOffsetList EMPTY_LIST = new TrackedOffsetList(BasedSequence.NULL, Collections.EMPTY_LIST);
    private final BasedSequence myBaseSeq;
    private final BasedOffsetTracker myBasedOffsetTracker;
    private final List<TrackedOffset> myTrackedOffsets;

    private TrackedOffsetList(BasedSequence basedSequence, List<TrackedOffset> list) {
        this.myBaseSeq = basedSequence;
        ArrayList arrayList = new ArrayList(list);
        this.myTrackedOffsets = arrayList;
        arrayList.sort(Comparator.comparing(new com.vladsch.flexmark.ast.util.g(9)));
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            TrackedOffset trackedOffset = (TrackedOffset) obj;
            arrayList2.add(Seg.segOf(trackedOffset.getOffset(), trackedOffset.getOffset() + 1));
        }
        this.myBasedOffsetTracker = BasedOffsetTracker.create(basedSequence, SegmentOffsetTree.build((Iterable<Seg>) arrayList2, (CharSequence) FlexmarkHtmlConverter.DEFAULT_NODE));
    }

    public static TrackedOffsetList create(BasedSequence basedSequence, List<TrackedOffset> list) {
        return list instanceof TrackedOffsetList ? (TrackedOffsetList) list : new TrackedOffsetList(basedSequence, list);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends TrackedOffset> collection) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.myTrackedOffsets.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.myTrackedOffsets.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.myTrackedOffsets.equals(obj);
    }

    public BasedSequence getBaseSeq() {
        return this.myBaseSeq;
    }

    public BasedOffsetTracker getBasedOffsetTracker() {
        return this.myBasedOffsetTracker;
    }

    public List<TrackedOffset> getTrackedOffsets() {
        return this.myTrackedOffsets;
    }

    public TrackedOffsetList getUnresolvedOffsets() {
        ArrayList arrayList = new ArrayList();
        for (TrackedOffset trackedOffset : this.myTrackedOffsets) {
            if (!trackedOffset.isResolved()) {
                arrayList.add(trackedOffset);
            }
        }
        return arrayList.isEmpty() ? EMPTY_LIST : new TrackedOffsetList(this.myBaseSeq, arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.myTrackedOffsets.hashCode();
    }

    public boolean haveUnresolved() {
        Iterator<TrackedOffset> it = this.myTrackedOffsets.iterator();
        while (it.hasNext()) {
            if (!it.next().isResolved()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.myTrackedOffsets.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.myTrackedOffsets.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<TrackedOffset> iterator() {
        return this.myTrackedOffsets.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.myTrackedOffsets.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<TrackedOffset> listIterator() {
        return this.myTrackedOffsets.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<TrackedOffset> unaryOperator) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.myTrackedOffsets.size();
    }

    @Override // java.util.List
    public void sort(Comparator<? super TrackedOffset> comparator) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Spliterator<TrackedOffset> spliterator() {
        return this.myTrackedOffsets.spliterator();
    }

    @Override // java.util.List
    public List<TrackedOffset> subList(int i6, int i7) {
        return this.myTrackedOffsets.subList(i6, i7);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.myTrackedOffsets.toArray();
    }

    public static TrackedOffsetList create(BasedSequence basedSequence, int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i6 : iArr) {
            arrayList.add(TrackedOffset.track(i6));
        }
        return new TrackedOffsetList(basedSequence, arrayList);
    }

    @Override // java.util.List
    public boolean addAll(int i6, Collection<? extends TrackedOffset> collection) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public TrackedOffset get(int i6) {
        return this.myTrackedOffsets.get(i6);
    }

    public TrackedOffsetList getTrackedOffsets(int i6, int i7) {
        int i8;
        int i9 = 0;
        OffsetInfo offsetInfo = this.myBasedOffsetTracker.getOffsetInfo(i6, i6 == i7);
        OffsetInfo offsetInfo2 = this.myBasedOffsetTracker.getOffsetInfo(i7, true);
        int i10 = offsetInfo.pos;
        int i11 = offsetInfo2.pos;
        if (i10 < 0 && i11 >= 0) {
            i8 = i11 + 1;
        } else {
            if (i10 < 0 || i11 < 0) {
                return EMPTY_LIST;
            }
            i8 = i11 + 1;
            i9 = i10;
        }
        int min = Math.min(this.myBasedOffsetTracker.size(), i8);
        if (i9 >= min) {
            return EMPTY_LIST;
        }
        if (this.myTrackedOffsets.get(i9).getOffset() < i6) {
            i9++;
        }
        if (this.myTrackedOffsets.get(min - 1).getOffset() > i7) {
            min--;
        }
        if (i9 >= min) {
            return EMPTY_LIST;
        }
        return new TrackedOffsetList(this.myBaseSeq, this.myTrackedOffsets.subList(i9, min));
    }

    @Override // java.util.List
    public ListIterator<TrackedOffset> listIterator(int i6) {
        return this.myTrackedOffsets.listIterator(i6);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public TrackedOffset remove(int i6) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List
    public TrackedOffset set(int i6, TrackedOffset trackedOffset) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.myTrackedOffsets.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(TrackedOffset trackedOffset) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }

    @Override // java.util.List
    public void add(int i6, TrackedOffset trackedOffset) {
        throw new IllegalStateException("Not supported. Immutable list.");
    }
}
