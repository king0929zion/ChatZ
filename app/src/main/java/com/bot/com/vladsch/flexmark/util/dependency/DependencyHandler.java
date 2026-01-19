package com.vladsch.flexmark.util.dependency;

import com.vladsch.flexmark.util.dependency.Dependent;
import com.vladsch.flexmark.util.dependency.ResolvedDependencies;
import com.vladsch.flexmark.util.misc.Ref;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* loaded from: classes.dex */
public abstract class DependencyHandler<D extends Dependent, S, R extends ResolvedDependencies<S>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public abstract R createResolvedDependencies(List<S> list);

    public abstract S createStage(List<D> list);

    public abstract Class getDependentClass(D d6);

    public DependentItemMap<D> prioritize(DependentItemMap<D> dependentItemMap) {
        return dependentItemMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public R resolveDependencies(List<D> list) {
        if (list.size() == 0) {
            return createResolvedDependencies(Collections.EMPTY_LIST);
        }
        if (list.size() == 1) {
            return createResolvedDependencies(Collections.singletonList(createStage(Collections.singletonList(list.get(0)))));
        }
        DependentItemMap<D> dependentItemMap = new DependentItemMap<>(list.size());
        for (D d6 : list) {
            Class dependentClass = getDependentClass(d6);
            if (dependentItemMap.containsKey(dependentClass)) {
                throw new IllegalStateException("Dependent class " + dependentClass + " is duplicated. Only one instance can be present in the list");
            }
            dependentItemMap.put(dependentClass, new DependentItem(dependentItemMap.size(), d6, getDependentClass(d6), d6.affectsGlobalScope()));
        }
        Iterator it = dependentItemMap.iterator();
        while (it.hasNext()) {
            DependentItem dependentItem = (DependentItem) ((Map.Entry) it.next()).getValue();
            Set<Class<?>> afterDependents = ((Dependent) dependentItem.dependent).getAfterDependents();
            if (afterDependents != null && afterDependents.size() > 0) {
                Iterator<Class<?>> it2 = afterDependents.iterator();
                while (it2.hasNext()) {
                    DependentItem dependentItem2 = dependentItemMap.get(it2.next());
                    if (dependentItem2 != null) {
                        dependentItem.addDependency(dependentItem2);
                        dependentItem2.addDependent(dependentItem);
                    }
                }
            }
            Set<Class<?>> beforeDependents = ((Dependent) dependentItem.dependent).getBeforeDependents();
            if (beforeDependents != null && beforeDependents.size() > 0) {
                Iterator<Class<?>> it3 = beforeDependents.iterator();
                while (it3.hasNext()) {
                    DependentItem dependentItem3 = dependentItemMap.get(it3.next());
                    if (dependentItem3 != null) {
                        dependentItem3.addDependency(dependentItem);
                        dependentItem.addDependent(dependentItem3);
                    }
                }
            }
        }
        DependentItemMap<D> prioritize = prioritize(dependentItemMap);
        int size = prioritize.size();
        BitSet bitSet = new BitSet(size);
        Ref ref = new Ref(bitSet);
        Iterator valueIterator = prioritize.valueIterator();
        while (valueIterator.hasNext()) {
            DependentItem dependentItem4 = (DependentItem) valueIterator.next();
            if (!dependentItem4.hasDependencies()) {
                ((BitSet) ref.value).set(dependentItem4.index);
            }
        }
        BitSet bitSet2 = new BitSet(size);
        bitSet2.set(0, prioritize.size());
        ArrayList arrayList = new ArrayList();
        while (bitSet.nextSetBit(0) != -1) {
            ArrayList arrayList2 = new ArrayList();
            BitSet bitSet3 = new BitSet();
            while (true) {
                int nextSetBit = bitSet.nextSetBit(0);
                if (nextSetBit < 0) {
                    break;
                }
                bitSet.clear(nextSetBit);
                DependentItem value = prioritize.getValue(nextSetBit);
                arrayList2.add((Dependent) value.dependent);
                bitSet2.clear(nextSetBit);
                if (!value.hasDependents()) {
                    if (value.isGlobalScope) {
                        bitSet3.or(bitSet);
                        break;
                    }
                } else {
                    while (true) {
                        int nextSetBit2 = value.dependents.nextSetBit(0);
                        if (nextSetBit2 < 0) {
                            break;
                        }
                        value.dependents.clear(nextSetBit2);
                        if (!prioritize.getValue(nextSetBit2).removeDependency(value)) {
                            if (value.isGlobalScope) {
                                bitSet3.set(nextSetBit2);
                            } else {
                                bitSet.set(nextSetBit2);
                            }
                        }
                    }
                }
            }
            arrayList.add(createStage(arrayList2));
            bitSet = bitSet3;
        }
        if (bitSet2.nextSetBit(0) == -1) {
            return createResolvedDependencies(arrayList);
        }
        throw new IllegalStateException("have dependents with dependency cycles" + bitSet2);
    }
}
