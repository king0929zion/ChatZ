package com.vladsch.flexmark.util.format;

/* loaded from: classes.dex */
public class TableSeparatorSection extends TableSection {
    public static final TableCell DEFAULT_CELL = new TableCell("---", 1, 1);

    public TableSeparatorSection(TableSectionType tableSectionType) {
        super(tableSectionType);
    }

    @Override // com.vladsch.flexmark.util.format.TableSection
    public TableCell defaultCell() {
        return DEFAULT_CELL;
    }

    @Override // com.vladsch.flexmark.util.format.TableSection
    public TableRow defaultRow() {
        return new TableSeparatorRow();
    }
}
