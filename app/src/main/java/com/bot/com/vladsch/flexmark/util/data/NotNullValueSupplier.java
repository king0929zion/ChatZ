package com.vladsch.flexmark.util.data;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public interface NotNullValueSupplier<T> extends Supplier<T> {
    @Override // java.util.function.Supplier
    T get();
}
