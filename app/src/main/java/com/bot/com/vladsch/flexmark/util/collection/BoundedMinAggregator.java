package com.vladsch.flexmark.util.collection;

import java.util.function.BiFunction;

/* loaded from: classes.dex */
public class BoundedMinAggregator implements BiFunction<Integer, Integer, Integer> {
    public final int minBound;

    public BoundedMinAggregator(int i6) {
        this.minBound = i6;
    }

    @Override // java.util.function.BiFunction
    public Integer apply(Integer num, Integer num2) {
        return (num2 == null || num2.intValue() <= this.minBound) ? num : MinAggregator.INSTANCE.apply(num, num2);
    }
}
