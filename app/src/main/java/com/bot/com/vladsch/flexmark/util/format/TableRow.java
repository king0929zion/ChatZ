package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.format.MarkdownTable;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.PrefixedSubSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TableRow {
    protected int beforeOffset = TableCell.NOT_TRACKED;
    protected int afterOffset = TableCell.NOT_TRACKED;
    private boolean normalized = true;
    protected final List<TableCell> cells = new ArrayList();

    private CharSequence dumpCells() {
        StringBuilder sb = new StringBuilder();
        for (TableCell tableCell : this.cells) {
            sb.append("    ");
            sb.append(tableCell.toString());
            sb.append(SequenceUtils.EOL);
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$forAllCells$0(TableCellConsumer tableCellConsumer, TableCell tableCell, int i6, int i7, int i8) {
        tableCellConsumer.accept(tableCell, i6, i7);
        return 0;
    }

    public void addColumn(int i6) {
        this.cells.add(i6, defaultCell());
    }

    public void appendColumns(int i6) {
        appendColumns(i6, null);
    }

    public int columnOf(int i6) {
        return columnOfOrNull(Integer.valueOf(i6)).intValue();
    }

    public Integer columnOfOrNull(Integer num) {
        if (num == null) {
            return null;
        }
        int maxLimit = Utils.maxLimit(num.intValue(), this.cells.size());
        int i6 = 0;
        for (int i7 = 0; i7 < maxLimit; i7++) {
            i6 += this.cells.get(i7).columnSpan;
        }
        return Integer.valueOf(i6);
    }

    public TableCell defaultCell() {
        return new TableCell(SequenceUtils.SPACE, 1, 1);
    }

    public void deleteColumns(int i6, int i7) {
        if (i7 <= 0 || i6 < 0) {
            return;
        }
        normalizeIfNeeded();
        MarkdownTable.IndexSpanOffset indexOf = indexOf(i6);
        int i8 = indexOf.index;
        int i9 = indexOf.spanOffset;
        while (i8 < this.cells.size() && i7 > 0) {
            TableCell tableCell = this.cells.get(i8);
            this.cells.remove(i8);
            if (i9 > 0) {
                int i10 = tableCell.columnSpan;
                if (i10 - i9 > i7) {
                    this.cells.add(i8, tableCell.withColumnSpan(i10 - i7));
                    return;
                } else {
                    this.cells.add(i8, tableCell.withColumnSpan(i9));
                    i8++;
                }
            } else if (tableCell.columnSpan - i9 > i7) {
                this.cells.add(i8, defaultCell().withColumnSpan(tableCell.columnSpan - i7));
                return;
            }
            i7 -= tableCell.columnSpan - i9;
            i9 = 0;
        }
    }

    public TableRow expandTo(int i6) {
        return expandTo(i6, TableCell.NULL);
    }

    public void fillMissingColumns(Integer num, int i6) {
        int spannedColumns = getSpannedColumns();
        if (spannedColumns >= i6) {
            return;
        }
        int size = num == null ? this.cells.size() : num.intValue();
        int i7 = i6 - spannedColumns;
        if (num == null || num.intValue() >= spannedColumns) {
            size = this.cells.size();
        }
        TableCell defaultCell = defaultCell();
        TableCell tableCell = size > 0 ? this.cells.get(size - 1) : defaultCell;
        while (true) {
            int i8 = i7 - 1;
            if (i7 <= 0) {
                return;
            }
            int endOffset = tableCell.getEndOffset();
            tableCell = defaultCell.withText(PrefixedSubSequence.prefixOf(SequenceUtils.SPACE, tableCell.getLastSegment().getBaseSequence(), endOffset, endOffset));
            List<TableCell> list = this.cells;
            list.add(Math.min(size, list.size()), tableCell);
            size++;
            defaultCell = tableCell;
            i7 = i8;
        }
    }

    public void forAllCells(TableCellConsumer tableCellConsumer) {
        forAllCells(0, TableCell.NOT_TRACKED, tableCellConsumer);
    }

    public int getAfterOffset() {
        return this.afterOffset;
    }

    public int getBeforeOffset() {
        return this.beforeOffset;
    }

    public List<TableCell> getCells() {
        return this.cells;
    }

    public int getColumns() {
        return this.cells.size();
    }

    public int getSpannedColumns() {
        int i6 = 0;
        for (TableCell tableCell : this.cells) {
            if (tableCell != null) {
                i6 += tableCell.columnSpan;
            }
        }
        return i6;
    }

    public int getTotalColumns() {
        return getSpannedColumns();
    }

    public MarkdownTable.IndexSpanOffset indexOf(int i6) {
        return indexOfOrNull(Integer.valueOf(i6));
    }

    public MarkdownTable.IndexSpanOffset indexOfOrNull(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        Iterator<TableCell> it = this.cells.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            int i7 = it.next().columnSpan;
            if (i7 > intValue) {
                return new MarkdownTable.IndexSpanOffset(i6, intValue);
            }
            intValue -= i7;
            if (i7 > 0) {
                i6++;
            }
        }
        return new MarkdownTable.IndexSpanOffset(i6, 0);
    }

    public void insertColumns(int i6, int i7) {
        insertColumns(i6, i7, null);
    }

    public boolean isEmpty() {
        for (TableCell tableCell : this.cells) {
            if (tableCell != null && !tableCell.text.isBlank()) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmptyColumn(int i6) {
        int i7 = indexOf(i6).index;
        return i7 >= this.cells.size() || this.cells.get(i7).text.isBlank();
    }

    public void moveColumn(int i6, int i7) {
        if (i6 < 0 || i7 < 0) {
            return;
        }
        normalizeIfNeeded();
        int totalColumns = getTotalColumns();
        if (i6 >= totalColumns) {
            return;
        }
        if (i7 >= totalColumns) {
            i7 = totalColumns - 1;
        }
        if (i6 == i7 || i7 >= totalColumns) {
            return;
        }
        MarkdownTable.IndexSpanOffset indexOf = indexOf(i6);
        int i8 = indexOf.index;
        int i9 = indexOf.spanOffset;
        TableCell withColumnSpan = this.cells.get(i8).withColumnSpan(1);
        if (indexOf(i7).index != i8) {
            if (i9 > 0) {
                insertColumns((i6 <= i7 ? 1 : 0) + i7, 1, defaultCell());
            } else {
                insertColumns((i6 <= i7 ? 1 : 0) + i7, 1, withColumnSpan.withColumnSpan(1));
            }
            deleteColumns(i6 + (i7 <= i6 ? 1 : 0), 1);
        }
    }

    public void normalize() {
        int i6 = 0;
        while (i6 < this.cells.size()) {
            TableCell tableCell = this.cells.get(i6);
            if (tableCell == null || tableCell == TableCell.NULL) {
                this.cells.remove(i6);
            } else {
                i6++;
            }
        }
        this.normalized = true;
    }

    public void normalizeIfNeeded() {
        if (this.normalized) {
            return;
        }
        normalize();
    }

    public void set(int i6, TableCell tableCell) {
        expandTo(i6, null);
        this.cells.set(i6, tableCell);
    }

    public void setAfterOffset(int i6) {
        this.afterOffset = i6;
    }

    public void setBeforeOffset(int i6) {
        this.beforeOffset = i6;
    }

    public String toString() {
        return getClass().getName().substring(getClass().getPackage().getName().length() + 1) + "{ beforeOffset=" + this.beforeOffset + ", afterOffset=" + this.afterOffset + ", normalized=" + this.normalized + ", cells=[\n" + ((Object) dumpCells()) + "    ]\n  }";
    }

    public void appendColumns(int i6, TableCell tableCell) {
        if (tableCell == null || tableCell.columnSpan == 0) {
            tableCell = defaultCell();
        }
        for (int i7 = 0; i7 < i6; i7++) {
            List<TableCell> list = this.cells;
            list.add(list.size(), tableCell);
        }
    }

    public TableRow expandTo(int i6, TableCell tableCell) {
        if (tableCell == null || tableCell.columnSpan == 0) {
            this.normalized = false;
        }
        while (i6 >= this.cells.size()) {
            this.cells.add(tableCell);
        }
        return this;
    }

    public void forAllCells(int i6, TableCellConsumer tableCellConsumer) {
        forAllCells(i6, TableCell.NOT_TRACKED, tableCellConsumer);
    }

    public void insertColumns(int i6, int i7, TableCell tableCell) {
        if (i7 <= 0 || i6 < 0) {
            return;
        }
        normalizeIfNeeded();
        if (tableCell == null || tableCell.columnSpan == 0) {
            tableCell = defaultCell();
        }
        if (i6 >= getTotalColumns()) {
            appendColumns(i7, tableCell);
            return;
        }
        MarkdownTable.IndexSpanOffset indexOf = indexOf(i6);
        int i8 = indexOf.index;
        int i9 = indexOf.spanOffset;
        if (i9 <= 0 || i8 >= this.cells.size()) {
            for (int i10 = 0; i10 < i7; i10++) {
                this.cells.add(i8, tableCell);
            }
            return;
        }
        TableCell tableCell2 = this.cells.get(i8);
        if (!tableCell.text.isBlank() && i7 <= 1) {
            this.cells.remove(i8);
            this.cells.add(i8, tableCell2.withColumnSpan(i9));
            this.cells.add(i8 + 1, tableCell.withColumnSpan(Utils.minLimit(1, (tableCell2.columnSpan - i9) + 1)));
        } else {
            this.cells.remove(i8);
            this.cells.add(i8, tableCell2.withColumnSpan(tableCell2.columnSpan + i7));
        }
    }

    public void forAllCells(int i6, int i7, TableCellConsumer tableCellConsumer) {
        forAllCells(i6, i7, new h(tableCellConsumer, 3));
    }

    public void forAllCells(TableCellManipulator tableCellManipulator) {
        forAllCells(0, TableCell.NOT_TRACKED, tableCellManipulator);
    }

    public void forAllCells(int i6, TableCellManipulator tableCellManipulator) {
        forAllCells(i6, TableCell.NOT_TRACKED, tableCellManipulator);
    }

    public void forAllCells(int i6, int i7, TableCellManipulator tableCellManipulator) {
        int size = this.cells.size();
        if (i6 >= size || i7 <= 0) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            TableCell tableCell = this.cells.get(i8);
            if (i8 >= i6) {
                int apply = tableCellManipulator.apply(tableCell, i8, i10, i9);
                if (apply == Integer.MIN_VALUE) {
                    return;
                }
                if (apply < 0) {
                    i9 -= apply;
                    i7 += apply;
                } else {
                    i8 += apply + 1;
                    i10 += tableCell.columnSpan;
                    i7--;
                }
                size += apply;
                i9++;
                if (i7 <= 0) {
                    return;
                }
            } else {
                i8++;
                i9++;
                i10 += tableCell.columnSpan;
            }
        }
    }
}
