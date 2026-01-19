package com.vladsch.flexmark.util.collection;

import java.util.function.BiFunction;

/* loaded from: classes.dex */
public class BoundedMaxAggregator implements BiFunction<Integer, Integer, Integer> {
    public final int maxBound;

    public BoundedMaxAggregator(int i6) {
        this.maxBound = i6;
    }

    @Override // java.util.function.BiFunction
    public Integer apply(Integer num, Integer num2) {
        return (num2 == null || num2.intValue() >= this.maxBound) ? num : MaxAggregator.INSTANCE.apply(num, num2);
    }
}
