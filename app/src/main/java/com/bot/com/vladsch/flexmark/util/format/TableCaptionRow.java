package com.vladsch.flexmark.util.format;

/* loaded from: classes.dex */
public class TableCaptionRow extends TableRow {
    @Override // com.vladsch.flexmark.util.format.TableRow
    public TableCell defaultCell() {
        return TableCaptionSection.NULL_CELL;
    }
}
