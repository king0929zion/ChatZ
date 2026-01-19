package com.vladsch.flexmark.util.format;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public interface NumericSuffixPredicate extends Predicate<String> {
    default boolean sortSuffix(String str) {
        return true;
    }
}
