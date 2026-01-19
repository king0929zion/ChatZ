package com.vladsch.flexmark.util.format;

/* loaded from: classes.dex */
public final class ColumnSort {
    public final int column;
    public final Sort sort;

    private ColumnSort(int i6, Sort sort) {
        this.column = i6;
        this.sort = sort;
    }

    public static ColumnSort columnSort(int i6, Sort sort) {
        return new ColumnSort(i6, sort);
    }

    public static ColumnSort columnSort(int i6, boolean z5, boolean z6, boolean z7) {
        if (!z6) {
            return new ColumnSort(i6, z5 ? Sort.DESCENDING : Sort.ASCENDING);
        }
        if (z7) {
            return new ColumnSort(i6, z5 ? Sort.DESCENDING_NUMERIC_LAST : Sort.ASCENDING_NUMERIC_LAST);
        }
        return new ColumnSort(i6, z5 ? Sort.DESCENDING_NUMERIC : Sort.ASCENDING_NUMERIC);
    }
}
