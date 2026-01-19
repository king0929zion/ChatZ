package com.vladsch.flexmark.ext.tables;

/* loaded from: classes.dex */
public interface TableVisitor {
    void visit(TableBlock tableBlock);

    void visit(TableBody tableBody);

    void visit(TableCaption tableCaption);

    void visit(TableCell tableCell);

    void visit(TableHead tableHead);

    void visit(TableRow tableRow);

    void visit(TableSeparator tableSeparator);
}
