package com.vladsch.flexmark.util.dependency;

import com.vladsch.flexmark.ast.util.g;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterator;
import com.vladsch.flexmark.util.misc.Ref;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public class DependencyResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends Dependent> List<List<D>> resolveDependencies(List<D> list, Function<DependentItemMap<D>, DependentItemMap<D>> function, Function<? super D, Class<?>> function2) {
        if (list.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        if (list.size() == 1) {
            return Collections.singletonList(list);
        }
        DependentItemMap<D> dependentItemMap = new DependentItemMap<>(list.size());
        if (function2 == null) {
            function2 = new g(8);
        }
        for (D d6 : list) {
            Class<?> apply = function2.apply(d6);
            if (dependentItemMap.containsKey(apply)) {
                throw new IllegalStateException("Dependent class " + apply + " is duplicated. Only one instance can be present in the list");
            }
            dependentItemMap.put(apply, new DependentItem(dependentItemMap.size(), d6, function2.apply(d6), d6.affectsGlobalScope()));
        }
        Iterator it = dependentItemMap.iterator();
        while (it.hasNext()) {
            DependentItem dependentItem = (DependentItem) ((Map.Entry) it.next()).getValue();
            Set<Class<?>> afterDependents = ((Dependent) dependentItem.dependent).getAfterDependents();
            if (afterDependents != null && afterDependents.size() > 0) {
                for (Class<?> cls : afterDependents) {
                    if (cls == LastDependent.class) {
                        ReversibleIterator it2 = dependentItemMap.valueIterable().iterator();
                        while (it2.hasNext()) {
                            DependentItem dependentItem2 = (DependentItem) it2.next();
                            if (dependentItem2 != null && dependentItem2 != dependentItem) {
                                dependentItem.addDependency(dependentItem2);
                                dependentItem2.addDependent(dependentItem);
                            }
                        }
                    } else {
                        DependentItem dependentItem3 = dependentItemMap.get(cls);
                        if (dependentItem3 != null) {
                            dependentItem.addDependency(dependentItem3);
                            dependentItem3.addDependent(dependentItem);
                        }
                    }
                }
            }
            Set<Class<?>> beforeDependents = ((Dependent) dependentItem.dependent).getBeforeDependents();
            if (beforeDependents != null && beforeDependents.size() > 0) {
                for (Class<?> cls2 : beforeDependents) {
                    if (cls2 == FirstDependent.class) {
                        ReversibleIterator it3 = dependentItemMap.valueIterable().iterator();
                        while (it3.hasNext()) {
                            DependentItem dependentItem4 = (DependentItem) it3.next();
                            if (dependentItem4 != null && dependentItem4 != dependentItem) {
                                dependentItem4.addDependency(dependentItem);
                                dependentItem.addDependent(dependentItem4);
                            }
                        }
                    } else {
                        DependentItem dependentItem5 = dependentItemMap.get(cls2);
                        if (dependentItem5 != null) {
                            dependentItem5.addDependency(dependentItem);
                            dependentItem.addDependent(dependentItem5);
                        }
                    }
                }
            }
        }
        if (function != null) {
            dependentItemMap = function.apply(dependentItemMap);
        }
        int size = dependentItemMap.size();
        BitSet bitSet = new BitSet(size);
        Ref ref = new Ref(bitSet);
        Iterator valueIterator = dependentItemMap.valueIterator();
        while (valueIterator.hasNext()) {
            DependentItem dependentItem6 = (DependentItem) valueIterator.next();
            if (!dependentItem6.hasDependencies()) {
                ((BitSet) ref.value).set(dependentItem6.index);
            }
        }
        BitSet bitSet2 = new BitSet(size);
        bitSet2.set(0, dependentItemMap.size());
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
                DependentItem value = dependentItemMap.getValue(nextSetBit);
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
                        if (!dependentItemMap.getValue(nextSetBit2).removeDependency(value)) {
                            if (value.isGlobalScope) {
                                bitSet3.set(nextSetBit2);
                            } else {
                                bitSet.set(nextSetBit2);
                            }
                        }
                    }
                }
            }
            arrayList.add(arrayList2);
            bitSet = bitSet3;
        }
        if (bitSet2.nextSetBit(0) == -1) {
            return arrayList;
        }
        throw new IllegalStateException("have dependents with dependency cycles" + bitSet2);
    }

    public static <D extends Dependent> List<D> resolveFlatDependencies(List<D> list, Function<DependentItemMap<D>, DependentItemMap<D>> function, Function<? super D, Class<?>> function2) {
        List resolveDependencies = resolveDependencies(list, function, function2);
        if (resolveDependencies.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        int i6 = 0;
        if (resolveDependencies.size() == 1) {
            return (List) resolveDependencies.get(0);
        }
        Iterator it = resolveDependencies.iterator();
        while (it.hasNext()) {
            i6 += ((List) it.next()).size();
        }
        ArrayList arrayList = new ArrayList(i6);
        Iterator it2 = resolveDependencies.iterator();
        while (it2.hasNext()) {
            arrayList.addAll((List) it2.next());
        }
        return arrayList;
    }
}
