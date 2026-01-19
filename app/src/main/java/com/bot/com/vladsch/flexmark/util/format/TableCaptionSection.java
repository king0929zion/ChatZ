package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.BasedSequence;

/* loaded from: classes.dex */
public class TableCaptionSection extends TableSection {
    public static final TableCell DEFAULT_CELL;
    public static final TableCell NULL_CELL;

    static {
        BasedSequence basedSequence = BasedSequence.NULL;
        NULL_CELL = new TableCell(null, basedSequence, basedSequence, basedSequence, 1, 0);
        DEFAULT_CELL = new TableCell(null, "[", FlexmarkHtmlConverter.DEFAULT_NODE, "]", 1, 1);
    }

    public TableCaptionSection(TableSectionType tableSectionType) {
        super(tableSectionType);
    }

    @Override // com.vladsch.flexmark.util.format.TableSection
    public TableCell defaultCell() {
        return DEFAULT_CELL;
    }

    @Override // com.vladsch.flexmark.util.format.TableSection
    public TableRow defaultRow() {
        return new TableCaptionRow();
    }
}
