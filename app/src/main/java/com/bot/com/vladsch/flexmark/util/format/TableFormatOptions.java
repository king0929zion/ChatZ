package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.data.MutableDataSetter;
import com.vladsch.flexmark.util.data.NullableDataKey;
import com.vladsch.flexmark.util.format.options.DiscretionaryText;
import com.vladsch.flexmark.util.format.options.TableCaptionHandling;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class TableFormatOptions implements MutableDataSetter {
    public static final DataKey<CharWidthProvider> FORMAT_CHAR_WIDTH_PROVIDER;
    public static final DataKey<Boolean> FORMAT_TABLE_ADJUST_COLUMN_WIDTH;
    public static final DataKey<Boolean> FORMAT_TABLE_APPLY_COLUMN_ALIGNMENT;
    public static final DataKey<TableCaptionHandling> FORMAT_TABLE_CAPTION;
    public static final DataKey<DiscretionaryText> FORMAT_TABLE_CAPTION_SPACES;
    public static final DataKey<Boolean> FORMAT_TABLE_DUMP_TRACKING_OFFSETS;
    public static final DataKey<Boolean> FORMAT_TABLE_FILL_MISSING_COLUMNS;
    public static final NullableDataKey<Integer> FORMAT_TABLE_FILL_MISSING_MIN_COLUMN;
    public static final DataKey<String> FORMAT_TABLE_INDENT_PREFIX;
    public static final DataKey<Boolean> FORMAT_TABLE_LEAD_TRAIL_PIPES;
    public static final DataKey<DiscretionaryText> FORMAT_TABLE_LEFT_ALIGN_MARKER;
    public static final DataKey<TableManipulator> FORMAT_TABLE_MANIPULATOR;
    public static final DataKey<Integer> FORMAT_TABLE_MIN_SEPARATOR_COLUMN_WIDTH;
    public static final DataKey<Integer> FORMAT_TABLE_MIN_SEPARATOR_DASHES;
    public static final DataKey<Boolean> FORMAT_TABLE_SPACE_AROUND_PIPES;
    public static final DataKey<Boolean> FORMAT_TABLE_TRIM_CELL_WHITESPACE;
    public static final char INTELLIJ_DUMMY_IDENTIFIER_CHAR = 31;
    public final boolean adjustColumnWidth;
    public final boolean applyColumnAlignment;
    public final CharWidthProvider charWidthProvider;
    public final int colonWidth;
    public final int dashWidth;
    public final boolean dumpIntellijOffsets;
    public final boolean fillMissingColumns;
    public final TableCaptionHandling formatTableCaption;
    public final DiscretionaryText formatTableCaptionSpaces;
    public final Integer formatTableFillMissingMinColumn;
    public final String formatTableIndentPrefix;
    public final boolean leadTrailPipes;
    public final DiscretionaryText leftAlignMarker;
    public final int minSeparatorColumnWidth;
    public final int minSeparatorDashes;
    public final int pipeWidth;
    public final boolean spaceAroundPipes;
    public final int spacePad;
    public final int spaceWidth;
    public final TableManipulator tableManipulator;
    public final boolean trimCellWhitespace;
    public static final String INTELLIJ_DUMMY_IDENTIFIER = SequenceUtils.US_CHARS;
    public static final CharPredicate INTELLIJ_DUMMY_IDENTIFIER_SET = new k(0);

    static {
        Boolean bool = Boolean.TRUE;
        FORMAT_TABLE_LEAD_TRAIL_PIPES = new DataKey<>("FORMAT_TABLE_LEAD_TRAIL_PIPES", bool);
        FORMAT_TABLE_SPACE_AROUND_PIPES = new DataKey<>("FORMAT_TABLE_SPACE_AROUND_PIPES", bool);
        FORMAT_TABLE_ADJUST_COLUMN_WIDTH = new DataKey<>("FORMAT_TABLE_ADJUST_COLUMN_WIDTH", bool);
        FORMAT_TABLE_APPLY_COLUMN_ALIGNMENT = new DataKey<>("FORMAT_TABLE_APPLY_COLUMN_ALIGNMENT", bool);
        Boolean bool2 = Boolean.FALSE;
        FORMAT_TABLE_FILL_MISSING_COLUMNS = new DataKey<>("FORMAT_TABLE_FILL_MISSING_COLUMNS", bool2);
        FORMAT_TABLE_FILL_MISSING_MIN_COLUMN = new NullableDataKey<>("FORMAT_TABLE_FILL_MISSING_MIN_COLUMN", (Object) null);
        DiscretionaryText discretionaryText = DiscretionaryText.AS_IS;
        FORMAT_TABLE_LEFT_ALIGN_MARKER = new DataKey<>("FORMAT_TABLE_LEFT_ALIGN_MARKER", discretionaryText);
        FORMAT_TABLE_MIN_SEPARATOR_COLUMN_WIDTH = new DataKey<>("FORMAT_TABLE_MIN_SEPARATOR_COLUMN_WIDTH", 3);
        FORMAT_TABLE_MIN_SEPARATOR_DASHES = new DataKey<>("FORMAT_TABLE_MIN_SEPARATOR_DASHES", 1);
        FORMAT_TABLE_TRIM_CELL_WHITESPACE = new DataKey<>("FORMAT_TABLE_TRIM_CELL_WHITESPACE", bool);
        FORMAT_TABLE_CAPTION = new DataKey<>("FORMAT_TABLE_CAPTION", TableCaptionHandling.AS_IS);
        FORMAT_TABLE_CAPTION_SPACES = new DataKey<>("FORMAT_TABLE_CAPTION_SPACES", discretionaryText);
        FORMAT_TABLE_INDENT_PREFIX = new DataKey<>("FORMAT_TABLE_INDENT_PREFIX", FlexmarkHtmlConverter.DEFAULT_NODE);
        FORMAT_TABLE_MANIPULATOR = new DataKey<>("FORMAT_TABLE_MANIPULATOR", TableManipulator.NULL);
        FORMAT_CHAR_WIDTH_PROVIDER = new DataKey<>("FORMAT_CHAR_WIDTH_PROVIDER", CharWidthProvider.NULL);
        FORMAT_TABLE_DUMP_TRACKING_OFFSETS = new DataKey<>("FORMAT_TABLE_DUMP_TRACKING_OFFSETS", bool2);
    }

    public TableFormatOptions() {
        this(null);
    }

    public static /* synthetic */ boolean lambda$static$0(int i6) {
        return i6 == 31;
    }

    @Override // com.vladsch.flexmark.util.data.MutableDataSetter
    public MutableDataHolder setIn(MutableDataHolder mutableDataHolder) {
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_LEAD_TRAIL_PIPES, (DataKey<Boolean>) Boolean.valueOf(this.leadTrailPipes));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_SPACE_AROUND_PIPES, (DataKey<Boolean>) Boolean.valueOf(this.spaceAroundPipes));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_ADJUST_COLUMN_WIDTH, (DataKey<Boolean>) Boolean.valueOf(this.adjustColumnWidth));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_APPLY_COLUMN_ALIGNMENT, (DataKey<Boolean>) Boolean.valueOf(this.applyColumnAlignment));
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_FILL_MISSING_COLUMNS, (DataKey<Boolean>) Boolean.valueOf(this.fillMissingColumns));
        mutableDataHolder.set((NullableDataKey<NullableDataKey<Integer>>) FORMAT_TABLE_FILL_MISSING_MIN_COLUMN, (NullableDataKey<Integer>) this.formatTableFillMissingMinColumn);
        mutableDataHolder.set((DataKey<DataKey<DiscretionaryText>>) FORMAT_TABLE_LEFT_ALIGN_MARKER, (DataKey<DiscretionaryText>) this.leftAlignMarker);
        mutableDataHolder.set((DataKey<DataKey<Integer>>) FORMAT_TABLE_MIN_SEPARATOR_COLUMN_WIDTH, (DataKey<Integer>) Integer.valueOf(this.minSeparatorColumnWidth));
        mutableDataHolder.set((DataKey<DataKey<Integer>>) FORMAT_TABLE_MIN_SEPARATOR_DASHES, (DataKey<Integer>) Integer.valueOf(this.minSeparatorDashes));
        mutableDataHolder.set((DataKey<DataKey<CharWidthProvider>>) FORMAT_CHAR_WIDTH_PROVIDER, (DataKey<CharWidthProvider>) this.charWidthProvider);
        mutableDataHolder.set((DataKey<DataKey<TableCaptionHandling>>) FORMAT_TABLE_CAPTION, (DataKey<TableCaptionHandling>) this.formatTableCaption);
        mutableDataHolder.set((DataKey<DataKey<DiscretionaryText>>) FORMAT_TABLE_CAPTION_SPACES, (DataKey<DiscretionaryText>) this.formatTableCaptionSpaces);
        mutableDataHolder.set((DataKey<DataKey<String>>) FORMAT_TABLE_INDENT_PREFIX, (DataKey<String>) this.formatTableIndentPrefix);
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_TRIM_CELL_WHITESPACE, (DataKey<Boolean>) Boolean.valueOf(this.trimCellWhitespace));
        mutableDataHolder.set((DataKey<DataKey<TableManipulator>>) FORMAT_TABLE_MANIPULATOR, (DataKey<TableManipulator>) this.tableManipulator);
        mutableDataHolder.set((DataKey<DataKey<Boolean>>) FORMAT_TABLE_DUMP_TRACKING_OFFSETS, (DataKey<Boolean>) Boolean.valueOf(this.dumpIntellijOffsets));
        return mutableDataHolder;
    }

    public TableFormatOptions(DataHolder dataHolder) {
        this.leadTrailPipes = FORMAT_TABLE_LEAD_TRAIL_PIPES.get(dataHolder).booleanValue();
        boolean booleanValue = FORMAT_TABLE_SPACE_AROUND_PIPES.get(dataHolder).booleanValue();
        this.spaceAroundPipes = booleanValue;
        this.adjustColumnWidth = FORMAT_TABLE_ADJUST_COLUMN_WIDTH.get(dataHolder).booleanValue();
        this.applyColumnAlignment = FORMAT_TABLE_APPLY_COLUMN_ALIGNMENT.get(dataHolder).booleanValue();
        this.fillMissingColumns = FORMAT_TABLE_FILL_MISSING_COLUMNS.get(dataHolder).booleanValue();
        this.formatTableFillMissingMinColumn = FORMAT_TABLE_FILL_MISSING_MIN_COLUMN.get(dataHolder);
        this.leftAlignMarker = FORMAT_TABLE_LEFT_ALIGN_MARKER.get(dataHolder);
        this.minSeparatorColumnWidth = FORMAT_TABLE_MIN_SEPARATOR_COLUMN_WIDTH.get(dataHolder).intValue();
        this.minSeparatorDashes = FORMAT_TABLE_MIN_SEPARATOR_DASHES.get(dataHolder).intValue();
        CharWidthProvider charWidthProvider = FORMAT_CHAR_WIDTH_PROVIDER.get(dataHolder);
        this.charWidthProvider = charWidthProvider;
        this.formatTableCaption = FORMAT_TABLE_CAPTION.get(dataHolder);
        this.formatTableCaptionSpaces = FORMAT_TABLE_CAPTION_SPACES.get(dataHolder);
        this.formatTableIndentPrefix = FORMAT_TABLE_INDENT_PREFIX.get(dataHolder);
        this.trimCellWhitespace = FORMAT_TABLE_TRIM_CELL_WHITESPACE.get(dataHolder).booleanValue();
        this.tableManipulator = FORMAT_TABLE_MANIPULATOR.get(dataHolder);
        this.dumpIntellijOffsets = FORMAT_TABLE_DUMP_TRACKING_OFFSETS.get(dataHolder).booleanValue();
        int spaceWidth = charWidthProvider.getSpaceWidth();
        this.spaceWidth = spaceWidth;
        this.spacePad = booleanValue ? spaceWidth * 2 : 0;
        this.pipeWidth = charWidthProvider.getCharWidth(WikiNode.SEPARATOR_CHAR);
        this.colonWidth = charWidthProvider.getCharWidth(':');
        this.dashWidth = charWidthProvider.getCharWidth('-');
    }
}
