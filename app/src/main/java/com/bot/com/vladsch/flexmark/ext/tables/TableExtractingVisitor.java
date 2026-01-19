package com.vladsch.flexmark.ext.tables;

import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.ast.Visitor;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.MarkdownTable;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.ArrayList;
import java.util.List;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class TableExtractingVisitor {
    private MarkdownTable myTable;
    private final List<MarkdownTable> myTables = new ArrayList();
    private final NodeVisitor myVisitor;
    private final TableFormatOptions options;

    public TableExtractingVisitor(DataHolder dataHolder) {
        final int i6 = 0;
        final int i7 = 1;
        final int i8 = 2;
        final int i9 = 3;
        final int i10 = 4;
        final int i11 = 5;
        final int i12 = 6;
        this.myVisitor = new NodeVisitor(new VisitHandler(TableBlock.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i6) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableHead.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i7) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableSeparator.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i8) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableBody.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i9) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableRow.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i10) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableCell.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i11) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }), new VisitHandler(TableCaption.class, new Visitor(this) { // from class: com.vladsch.flexmark.ext.tables.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TableExtractingVisitor f11285b;

            {
                this.f11285b = this;
            }

            @Override // com.vladsch.flexmark.util.ast.Visitor
            public final void visit(Node node) {
                switch (i12) {
                    case 0:
                        this.f11285b.visit((TableBlock) node);
                        return;
                    case 1:
                        this.f11285b.visit((TableHead) node);
                        return;
                    case 2:
                        this.f11285b.visit((TableSeparator) node);
                        return;
                    case 3:
                        this.f11285b.visit((TableBody) node);
                        return;
                    case 4:
                        this.f11285b.visit((TableRow) node);
                        return;
                    case AbstractC1787b.f15290g /* 5 */:
                        this.f11285b.visit((TableCell) node);
                        return;
                    default:
                        this.f11285b.visit((TableCaption) node);
                        return;
                }
            }
        }));
        this.options = new TableFormatOptions(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableBlock tableBlock) {
        this.myTable = new MarkdownTable(tableBlock.getChars(), this.options);
        this.myVisitor.visitChildren(tableBlock);
        this.myTables.add(this.myTable);
        this.myTable = null;
    }

    public MarkdownTable[] getTables(Node node) {
        this.myTable = null;
        this.myVisitor.visit(node);
        return (MarkdownTable[]) this.myTables.toArray(new MarkdownTable[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableHead tableHead) {
        this.myTable.setSeparator(false);
        this.myTable.setHeader(true);
        this.myVisitor.visitChildren(tableHead);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableSeparator tableSeparator) {
        this.myTable.setSeparator(true);
        this.myVisitor.visitChildren(tableSeparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableBody tableBody) {
        this.myTable.setSeparator(false);
        this.myTable.setHeader(false);
        this.myVisitor.visitChildren(tableBody);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableRow tableRow) {
        this.myVisitor.visitChildren(tableRow);
        if (this.myTable.isSeparator()) {
            return;
        }
        this.myTable.nextRow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableCaption tableCaption) {
        this.myTable.setCaptionWithMarkers(tableCaption, tableCaption.getOpeningMarker(), tableCaption.getText(), tableCaption.getClosingMarker());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void visit(TableCell tableCell) {
        BasedSequence text = tableCell.getText();
        if (this.options.trimCellWhitespace) {
            if (text.isBlank() && !text.isEmpty()) {
                text = text.subSequence(0, 1);
            } else {
                text = text.trim();
            }
        }
        this.myTable.addCell(new com.vladsch.flexmark.util.format.TableCell(tableCell, tableCell.getOpeningMarker(), text, tableCell.getClosingMarker(), 1, tableCell.getSpan(), tableCell.getAlignment() == null ? CellAlignment.NONE : tableCell.getAlignment().cellAlignment()));
    }
}
