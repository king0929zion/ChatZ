package com.vladsch.flexmark.util.format;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements TableRowManipulator, TableCellManipulator {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11358b;

    public /* synthetic */ h(Object obj, int i6) {
        this.a = i6;
        this.f11358b = obj;
    }

    @Override // com.vladsch.flexmark.util.format.TableCellManipulator
    public int apply(TableCell tableCell, int i6, int i7, int i8) {
        int lambda$forAllCells$0;
        lambda$forAllCells$0 = TableRow.lambda$forAllCells$0((TableCellConsumer) this.f11358b, tableCell, i6, i7, i8);
        return lambda$forAllCells$0;
    }

    @Override // com.vladsch.flexmark.util.format.TableRowManipulator
    public int apply(TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int lambda$transposed$8;
        int lambda$isEmptyRowAt$7;
        int lambda$sorted$9;
        switch (this.a) {
            case 0:
                lambda$transposed$8 = MarkdownTable.lambda$transposed$8((TableCell[][]) this.f11358b, tableRow, i6, arrayList, i7);
                return lambda$transposed$8;
            case 1:
                lambda$isEmptyRowAt$7 = MarkdownTable.lambda$isEmptyRowAt$7((boolean[]) this.f11358b, tableRow, i6, arrayList, i7);
                return lambda$isEmptyRowAt$7;
            default:
                lambda$sorted$9 = MarkdownTable.lambda$sorted$9((MarkdownTable) this.f11358b, tableRow, i6, arrayList, i7);
                return lambda$sorted$9;
        }
    }
}
