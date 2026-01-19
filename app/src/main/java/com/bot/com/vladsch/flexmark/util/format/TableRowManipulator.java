package com.vladsch.flexmark.util.format;

import java.util.ArrayList;

/* loaded from: classes.dex */
public interface TableRowManipulator {
    public static final int BREAK = Integer.MIN_VALUE;

    int apply(TableRow tableRow, int i6, ArrayList<TableRow> arrayList, int i7);
}
