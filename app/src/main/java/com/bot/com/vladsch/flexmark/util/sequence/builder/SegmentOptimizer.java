package com.vladsch.flexmark.util.sequence.builder;

import java.util.Arrays;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public interface SegmentOptimizer extends BiFunction<CharSequence, Object[], Object[]> {
    static Object[] insert(Object[] objArr, int i6) {
        if (i6 >= objArr.length) {
            return Arrays.copyOf(objArr, objArr.length + 1);
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        if (i6 == 0) {
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return objArr2;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i6);
        System.arraycopy(objArr, i6, objArr2, i6 + 1, objArr.length - i6);
        return objArr2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.BiFunction
    Object[] apply(CharSequence charSequence, Object[] objArr);
}
