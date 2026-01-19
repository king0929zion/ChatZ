package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import java.util.Objects;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class TableVisitorExt {
    public static <V extends TableVisitor> VisitHandler<?>[] VISIT_HANDLERS(final V v5) {
        Objects.requireNonNull(v5);
        final int i6 = 0;
        final int i7 = 1;
        final int i8 = 2;
        final int i9 = 3;
        final int i10 = 4;
        final int i11 = 5;
        final int i12 = 6;
        return new VisitHandler[]{new VisitHandler(TableBlock.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i6) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableHead.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i7) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableSeparator.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i8) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableBody.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i9) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableRow.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i10) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableCell.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i11) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableCaption.class, new Visitor() { // from class: com.vladsch.flexmark.ext.tables.b
            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i12) {
                    case 0:
                        v5.visit((TableBlock) node);
                        return;
                    case 1:
                        v5.visit((TableHead) node);
                        return;
                    case 2:
                        v5.visit((TableSeparator) node);
                        return;
                    case 3:
                        v5.visit((TableBody) node);
                        return;
                    case 4:
                        v5.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        v5.visit((TableCell) node);
                        return;
                    default:
                        v5.visit((TableCaption) node);
                        return;
                }
            }
        })};
    }
}
