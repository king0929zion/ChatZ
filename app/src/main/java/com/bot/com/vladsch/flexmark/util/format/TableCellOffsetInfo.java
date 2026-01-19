package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.collection.BoundedMaxAggregator;
import com.vladsch.flexmark.util.collection.BoundedMinAggregator;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public class TableCellOffsetInfo {
    private static final HashMap<TableSectionType, Integer> DEFAULT_STOP_POINTS_MAP;
    public static final int ROW_END = 8;
    public static final int ROW_START = 1;
    public static final int TEXT_END = 4;
    public static final int TEXT_START = 2;
    public final int column;
    public final Integer insideColumn;
    public final Integer insideOffset;
    public final int offset;
    public final int row;
    public final TableSection section;
    public final MarkdownTable table;
    public final TableCell tableCell;
    public final TableRow tableRow;

    static {
        HashMap<TableSectionType, Integer> hashMap = new HashMap<>();
        DEFAULT_STOP_POINTS_MAP = hashMap;
        hashMap.put(TableSectionType.HEADER, 4);
        hashMap.put(TableSectionType.SEPARATOR, 6);
        hashMap.put(TableSectionType.BODY, 4);
        hashMap.put(TableSectionType.CAPTION, 4);
    }

    public TableCellOffsetInfo(int i6, MarkdownTable markdownTable, TableSection tableSection, TableRow tableRow, TableCell tableCell, int i7, int i8, Integer num, Integer num2) {
        this.offset = i6;
        this.table = markdownTable;
        this.section = tableSection;
        this.tableRow = tableRow;
        this.tableCell = tableCell;
        this.row = i7;
        this.column = i8;
        this.insideColumn = num;
        this.insideOffset = num2;
    }

    private static int getStopOffset(int i6, final MarkdownTable markdownTable, final Map<TableSectionType, Integer> map, boolean z5) {
        final Integer[] numArr = {null};
        if (map == null) {
            map = DEFAULT_STOP_POINTS_MAP;
        }
        final BiFunction boundedMinAggregator = z5 ? new BoundedMinAggregator(i6) : new BoundedMaxAggregator(i6);
        markdownTable.forAllSectionRows(new TableRowManipulator() { // from class: com.vladsch.flexmark.util.format.j
            @Override // com.vladsch.flexmark.util.format.TableRowManipulator
            public final int apply(TableRow tableRow, int i7, ArrayList arrayList, int i8) {
                int lambda$getStopOffset$0;
                lambda$getStopOffset$0 = TableCellOffsetInfo.lambda$getStopOffset$0(MarkdownTable.this, map, numArr, boundedMinAggregator, tableRow, i7, arrayList, i8);
                return lambda$getStopOffset$0;
            }
        });
        Integer num = numArr[0];
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static boolean haveRowEnd(int i6) {
        return (i6 & 8) != 0;
    }

    private static boolean haveRowStart(int i6) {
        return (i6 & 1) != 0;
    }

    private static boolean haveStopPoint(int i6, int i7) {
        return (i6 & i7) != 0;
    }

    private static boolean haveTextEnd(int i6) {
        return (i6 & 4) != 0;
    }

    private static boolean haveTextStart(int i6) {
        return (i6 & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getStopOffset$0(MarkdownTable markdownTable, Map map, Integer[] numArr, BiFunction biFunction, TableRow tableRow, int i6, ArrayList arrayList, int i7) {
        int intValue;
        TableSection allRowsSection = markdownTable.getAllRowsSection(i6);
        if (!tableRow.cells.isEmpty() && map.containsKey(allRowsSection.sectionType) && (intValue = ((Integer) map.get(allRowsSection.sectionType)).intValue()) != 0) {
            TableCell tableCell = null;
            int startOffset = tableRow.cells.get(0).getStartOffset(null);
            int endOffset = tableRow.cells.get(r9.size() - 1).getEndOffset();
            if (haveRowStart(intValue)) {
                numArr[0] = (Integer) biFunction.apply(numArr[0], Integer.valueOf(startOffset));
            }
            if (haveStopPoint(intValue, 6)) {
                for (TableCell tableCell2 : tableRow.cells) {
                    if (haveTextStart(intValue)) {
                        numArr[0] = (Integer) biFunction.apply(numArr[0], Integer.valueOf(tableCell2.getTextStartOffset(tableCell)));
                    }
                    if (haveTextEnd(intValue)) {
                        numArr[0] = (Integer) biFunction.apply(numArr[0], Integer.valueOf(tableCell2.getTextEndOffset(tableCell)));
                    }
                    tableCell = tableCell2;
                }
            }
            if (haveRowEnd(intValue)) {
                numArr[0] = (Integer) biFunction.apply(numArr[0], Integer.valueOf(endOffset));
            }
        }
        return 0;
    }

    public boolean canDeleteColumn() {
        return this.insideColumn != null && this.table.getMinColumnsWithoutColumns(true, this.column) > 0;
    }

    public boolean canDeleteRow() {
        if (this.tableRow == null) {
            return false;
        }
        TableSection tableSection = this.section;
        MarkdownTable markdownTable = this.table;
        if (tableSection != markdownTable.separator) {
            return this.table.header.rows.size() + markdownTable.body.rows.size() > 1;
        }
        return false;
    }

    public boolean getInsideColumn() {
        return this.insideColumn != null;
    }

    public TableCell getPreviousCell() {
        return getPreviousCell(1);
    }

    public boolean isAfterCaption() {
        return isCaptionLine() && isAfterCells();
    }

    public boolean isAfterCells() {
        TableRow tableRow = this.tableRow;
        return tableRow != null && this.tableCell != null && this.insideColumn == null && this.column == tableRow.cells.size() && this.offset >= this.tableCell.getEndOffset();
    }

    public boolean isBeforeCaption() {
        return isCaptionLine() && isBeforeCells();
    }

    public boolean isBeforeCells() {
        TableRow tableRow = this.tableRow;
        return tableRow != null && this.tableCell != null && this.insideColumn == null && this.column < tableRow.cells.size() && this.offset <= this.tableCell.getStartOffset(getPreviousCell());
    }

    public boolean isCaptionLine() {
        return (this.tableRow instanceof TableCaptionRow) && this.section == this.table.caption;
    }

    public boolean isFirstCell() {
        return getInsideColumn() && this.column == 0;
    }

    public boolean isInCellSpan() {
        TableCell tableCell;
        return this.tableRow != null && (tableCell = this.tableCell) != null && this.insideColumn == null && this.offset >= tableCell.getStartOffset(getPreviousCell()) && this.offset < this.tableCell.getEndOffset();
    }

    public boolean isInsideCaption() {
        return isCaptionLine() && getInsideColumn();
    }

    public boolean isInsideCell() {
        return (this.tableRow == null || this.tableCell == null || this.insideColumn == null) ? false : true;
    }

    public boolean isLastCell() {
        return getInsideColumn() && this.column + 1 == this.tableRow.cells.size();
    }

    public boolean isLastRow() {
        return this.row + 1 == this.table.getAllRowsCount();
    }

    public boolean isSeparatorLine() {
        return this.section.sectionType == TableSectionType.SEPARATOR;
    }

    public TableCellOffsetInfo nextCellOffset(Integer num) {
        if (!getInsideColumn() || this.column + 1 >= this.tableRow.cells.size()) {
            return null;
        }
        TableCell previousCell = getPreviousCell();
        TableCell previousCell2 = getPreviousCell(2);
        if (num == null) {
            TableCell tableCell = this.tableCell;
            Integer num2 = this.insideOffset;
            previousCell.textToInsideOffset(tableCell.insideToTextOffset(num2 == null ? 0 : num2.intValue(), previousCell2), previousCell2);
        }
        return this.table.getCellOffsetInfo(Utils.maxLimit(previousCell.getCellSize(previousCell2), Utils.minLimit(0, num.intValue())) + previousCell.getTextStartOffset(previousCell2));
    }

    public TableCellOffsetInfo nextOffsetStop(Map<TableSectionType, Integer> map) {
        int stopOffset = getStopOffset(this.offset, this.table, map, true);
        if (stopOffset != -1) {
            return this.table.getCellOffsetInfo(stopOffset);
        }
        List<TableRow> allSectionRows = this.table.getAllSectionRows();
        List<TableCell> list = allSectionRows.get(allSectionRows.size() - 1).cells;
        TableCell tableCell = list.get(list.size() - 1);
        int endOffset = tableCell.getEndOffset();
        BasedSequence baseSequence = tableCell.text.getBaseSequence();
        int endOfLineAnyEOL = baseSequence.endOfLineAnyEOL(endOffset);
        MarkdownTable markdownTable = this.table;
        if (endOfLineAnyEOL != -1) {
            endOffset = baseSequence.eolStartLength(endOfLineAnyEOL) + endOfLineAnyEOL;
        }
        return markdownTable.getCellOffsetInfo(endOffset);
    }

    public TableCellOffsetInfo nextRowOffset(Integer num) {
        if (this.row + 1 >= this.table.getAllRowsCount()) {
            return null;
        }
        TableRow tableRow = this.table.getAllRows().get(this.row + 1);
        if (!getInsideColumn() || this.column >= tableRow.cells.size()) {
            if (isBeforeCells()) {
                return this.table.getCellOffsetInfo(tableRow.cells.get(0).getStartOffset(null));
            }
            MarkdownTable markdownTable = this.table;
            List<TableCell> list = tableRow.cells;
            return markdownTable.getCellOffsetInfo(list.get(list.size() - 1).getEndOffset());
        }
        TableCell tableCell = tableRow.cells.get(this.column);
        TableCell previousCell = getPreviousCell(tableRow, 1);
        if (num == null) {
            TableCell tableCell2 = this.tableCell;
            Integer num2 = this.insideOffset;
            tableCell.textToInsideOffset(tableCell2.insideToTextOffset(num2 == null ? 0 : num2.intValue(), previousCell), previousCell);
        }
        return this.table.getCellOffsetInfo(Utils.maxLimit(tableCell.getCellSize(previousCell), Utils.minLimit(0, num.intValue())) + tableCell.getTextStartOffset(previousCell));
    }

    public TableCellOffsetInfo previousCellOffset(Integer num) {
        if (!getInsideColumn() || this.column <= 0) {
            return null;
        }
        TableCell previousCell = getPreviousCell();
        TableCell previousCell2 = getPreviousCell(2);
        if (num == null) {
            TableCell tableCell = this.tableCell;
            Integer num2 = this.insideOffset;
            previousCell.textToInsideOffset(tableCell.insideToTextOffset(num2 == null ? 0 : num2.intValue(), previousCell2), previousCell2);
        }
        return this.table.getCellOffsetInfo(Utils.maxLimit(previousCell.getCellSize(previousCell2), Utils.minLimit(0, num.intValue())) + previousCell.getTextStartOffset(previousCell2));
    }

    public TableCellOffsetInfo previousOffsetStop(Map<TableSectionType, Integer> map) {
        int stopOffset = getStopOffset(this.offset, this.table, map, false);
        if (stopOffset != -1) {
            return this.table.getCellOffsetInfo(stopOffset);
        }
        MarkdownTable markdownTable = this.table;
        return markdownTable.getCellOffsetInfo(markdownTable.getTableStartOffset());
    }

    public TableCellOffsetInfo previousRowOffset(Integer num) {
        if (this.row <= 0) {
            return null;
        }
        TableRow tableRow = this.table.getAllRows().get(this.row - 1);
        if (!getInsideColumn() || this.column >= tableRow.cells.size()) {
            if (isBeforeCells()) {
                return this.table.getCellOffsetInfo(tableRow.cells.get(0).getStartOffset(null));
            }
            return this.table.getCellOffsetInfo(tableRow.cells.get(r0.size() - 1).getEndOffset());
        }
        TableCell previousCell = getPreviousCell();
        TableCell previousCell2 = getPreviousCell(2);
        if (num == null) {
            TableCell tableCell = this.tableCell;
            Integer num2 = this.insideOffset;
            previousCell.textToInsideOffset(tableCell.insideToTextOffset(num2 == null ? 0 : num2.intValue(), previousCell2), previousCell2);
        }
        return this.table.getCellOffsetInfo(Utils.maxLimit(previousCell.getCellSize(previousCell2), Utils.minLimit(0, num.intValue())) + previousCell.getTextStartOffset(previousCell2));
    }

    public String toString() {
        int i6 = this.offset;
        int i7 = this.row;
        int i8 = this.column;
        Integer num = this.insideColumn;
        Integer num2 = this.insideOffset;
        StringBuilder j3 = AbstractC1135a.j(i6, "CellOffsetInfo{ offset=", i7, ", row=", ", column=");
        j3.append(i8);
        j3.append(", insideColumn=");
        j3.append(num);
        j3.append(", insideOffset=");
        j3.append(num2);
        j3.append("}");
        return j3.toString();
    }

    public TableCell getPreviousCell(int i6) {
        return getPreviousCell(this.tableRow, i6);
    }

    public TableCell getPreviousCell(TableRow tableRow, int i6) {
        int i7 = this.column;
        if (i7 < i6 || tableRow == null) {
            return null;
        }
        return tableRow.cells.get(i7 - i6);
    }
}
