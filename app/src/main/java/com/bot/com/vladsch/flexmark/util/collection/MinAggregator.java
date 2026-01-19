package com.vladsch.flexmark.util.collection;

import java.util.function.BiFunction;

/* loaded from: classes.dex */
public class MinAggregator implements BiFunction<Integer, Integer, Integer> {
    public static final MinAggregator INSTANCE = new MinAggregator();

    private MinAggregator() {
    }

    @Override // java.util.function.BiFunction
    public Integer apply(Integer num, Integer num2) {
        return (num2 == null || (num != null && num.intValue() <= num2.intValue())) ? num : num2;
    }
}
