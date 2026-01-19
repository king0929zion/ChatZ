package com.vladsch.flexmark.util.dependency;

import java.util.BitSet;

/* loaded from: classes.dex */
public class DependentItem<D> {
    BitSet dependencies;
    public final D dependent;
    public final Class<?> dependentClass;
    BitSet dependents;
    public final int index;
    public final boolean isGlobalScope;

    public DependentItem(int i6, D d6, Class<?> cls, boolean z5) {
        this.index = i6;
        this.dependent = d6;
        this.dependentClass = cls;
        this.isGlobalScope = z5;
    }

    public void addDependency(DependentItem<D> dependentItem) {
        if (this.dependencies == null) {
            this.dependencies = new BitSet();
        }
        this.dependencies.set(dependentItem.index);
    }

    public void addDependent(DependentItem<D> dependentItem) {
        if (this.dependents == null) {
            this.dependents = new BitSet();
        }
        this.dependents.set(dependentItem.index);
    }

    public boolean hasDependencies() {
        BitSet bitSet = this.dependencies;
        return (bitSet == null || bitSet.nextSetBit(0) == -1) ? false : true;
    }

    public boolean hasDependents() {
        BitSet bitSet = this.dependents;
        return (bitSet == null || bitSet.nextSetBit(0) == -1) ? false : true;
    }

    public boolean removeDependency(DependentItem<D> dependentItem) {
        BitSet bitSet = this.dependencies;
        if (bitSet != null) {
            bitSet.clear(dependentItem.index);
        }
        return hasDependencies();
    }

    public void removeDependent(DependentItem<D> dependentItem) {
        BitSet bitSet = this.dependents;
        if (bitSet != null) {
            bitSet.clear(dependentItem.index);
        }
    }

    public void addDependency(BitSet bitSet) {
        if (this.dependencies == null) {
            this.dependencies = new BitSet();
        }
        this.dependencies.or(bitSet);
    }

    public void addDependent(BitSet bitSet) {
        if (this.dependents == null) {
            this.dependents = new BitSet();
        }
        this.dependents.or(bitSet);
    }

    public void removeDependent(BitSet bitSet) {
        BitSet bitSet2 = this.dependents;
        if (bitSet2 != null) {
            bitSet2.andNot(bitSet);
        }
    }

    public boolean removeDependency(BitSet bitSet) {
        BitSet bitSet2 = this.dependencies;
        if (bitSet2 != null) {
            bitSet2.andNot(bitSet);
        }
        return hasDependencies();
    }
}
