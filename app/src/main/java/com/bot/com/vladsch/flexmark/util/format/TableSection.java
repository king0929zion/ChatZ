package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TableSection {
    public final TableSectionType sectionType;
    public final ArrayList<TableRow> rows = new ArrayList<>();
    protected int row = 0;
    protected int column = 0;

    public TableSection(TableSectionType tableSectionType) {
        this.sectionType = tableSectionType;
    }

    private CharSequence dumpRows() {
        StringBuilder sb = new StringBuilder();
        ArrayList<TableRow> arrayList = this.rows;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            TableRow tableRow = arrayList.get(i6);
            i6++;
            sb.append("  ");
            sb.append(tableRow.toString());
            sb.append(SequenceUtils.EOL);
        }
        return sb;
    }

    public TableCell defaultCell() {
        return TableCell.NULL;
    }

    public TableRow defaultRow() {
        return new TableRow();
    }

    public TableRow expandTo(int i6) {
        return expandTo(i6, (TableCell) null);
    }

    public TableRow get(int i6) {
        return expandTo(i6, (TableCell) null);
    }

    public int getColumn() {
        return this.column;
    }

    public int getMaxColumns() {
        ArrayList<TableRow> arrayList = this.rows;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            TableRow tableRow = arrayList.get(i7);
            i7++;
            int spannedColumns = tableRow.getSpannedColumns();
            if (i6 < spannedColumns) {
                i6 = spannedColumns;
            }
        }
        return i6;
    }

    public int getMinColumns() {
        ArrayList<TableRow> arrayList = this.rows;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            TableRow tableRow = arrayList.get(i7);
            i7++;
            int spannedColumns = tableRow.getSpannedColumns();
            if (i6 > spannedColumns || i6 == 0) {
                i6 = spannedColumns;
            }
        }
        return i6;
    }

    public int getRow() {
        return this.row;
    }

    public ArrayList<TableRow> getRows() {
        return this.rows;
    }

    public void nextRow() {
        this.row++;
        this.column = 0;
    }

    public void normalize() {
        ArrayList<TableRow> arrayList = this.rows;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            TableRow tableRow = arrayList.get(i6);
            i6++;
            tableRow.normalize();
        }
    }

    public void setCell(int i6, int i7, TableCell tableCell) {
        expandTo(i6).set(i7, tableCell);
    }

    public String toString() {
        return getClass().getName().substring(getClass().getPackage().getName().length() + 1) + "[sectionType=" + this.sectionType + ", rows=[\n" + ((Object) dumpRows()) + "]";
    }

    public TableRow expandTo(int i6, TableCell tableCell) {
        while (i6 >= this.rows.size()) {
            this.rows.add(defaultRow());
        }
        return this.rows.get(i6);
    }

    public TableRow expandTo(int i6, int i7) {
        return expandTo(i6, i7, null);
    }

    public TableRow expandTo(int i6, int i7, TableCell tableCell) {
        while (i6 >= this.rows.size()) {
            TableRow defaultRow = defaultRow();
            defaultRow.expandTo(i7, tableCell);
            this.rows.add(defaultRow);
        }
        return this.rows.get(i6).expandTo(i7);
    }
}
