package com.vladsch.flexmark.util.collection;

import java.util.function.Function;

/* loaded from: classes.dex */
public class CopyOnWriteRef<T> {
    private final Function<T, T> copyFunction;
    private int referenceCount = 0;
    private T value;

    public CopyOnWriteRef(T t5, Function<T, T> function) {
        this.value = t5;
        this.copyFunction = function;
    }

    public T getImmutable() {
        T t5 = this.value;
        if (t5 != null) {
            this.referenceCount++;
        }
        return t5;
    }

    public T getMutable() {
        if (this.referenceCount > 0) {
            this.value = this.copyFunction.apply(this.value);
            this.referenceCount = 0;
        }
        return this.value;
    }

    public T getPeek() {
        return this.value;
    }

    public boolean isMutable() {
        return this.referenceCount == 0;
    }

    public void setValue(T t5) {
        this.referenceCount = 0;
        this.value = this.copyFunction.apply(t5);
    }
}
