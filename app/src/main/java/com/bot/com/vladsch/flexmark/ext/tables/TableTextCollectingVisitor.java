package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.ast.util.TextCollectingVisitor;

@Deprecated
/* loaded from: classes.dex */
public class TableTextCollectingVisitor extends TextCollectingVisitor {
    public static final Class<?>[] TABLE_LINE_BREAK_CLASSES = {TableBlock.class, TableRow.class, TableCaption.class};

    public TableTextCollectingVisitor(Class<?>... clsArr) {
        super(clsArr.length == 0 ? TABLE_LINE_BREAK_CLASSES : TextCollectingVisitor.concatArrays(TABLE_LINE_BREAK_CLASSES, clsArr));
    }
}
