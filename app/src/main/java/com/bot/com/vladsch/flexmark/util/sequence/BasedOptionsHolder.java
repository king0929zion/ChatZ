package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.data.NullableDataKey;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats;

/* loaded from: classes.dex */
public abstract class BasedOptionsHolder {
    public static final int F_APPLICATION_OPTIONS = -65536;
    public static final int F_COLLECT_FIRST256_STATS = null;
    public static final int F_COLLECT_SEGMENTED_STATS = null;
    public static final int F_FULL_SEGMENTED_SEQUENCES = null;
    public static final int F_LIBRARY_OPTIONS = 65535;
    public static final int F_NO_ANCHORS = null;
    public static final int F_TREE_SEGMENTED_SEQUENCES = null;
    public static final Options O_COLLECT_FIRST256_STATS = null;
    public static final Options O_COLLECT_SEGMENTED_STATS = null;
    public static final Options O_FULL_SEGMENTED_SEQUENCES = null;
    public static final Options O_NO_ANCHORS = null;
    public static final Options O_TREE_SEGMENTED_SEQUENCES = null;
    public static final NullableDataKey<SegmentedSequenceStats> SEGMENTED_STATS;

    /* loaded from: classes.dex */
    public enum Options {
        COLLECT_SEGMENTED_STATS,
        COLLECT_FIRST256_STATS,
        NO_ANCHORS,
        FULL_SEGMENTED_SEQUENCES,
        TREE_SEGMENTED_SEQUENCES
    } {
        Options options = Options.COLLECT_SEGMENTED_STATS;
        O_COLLECT_SEGMENTED_STATS = options;
        Options options2 = Options.COLLECT_FIRST256_STATS;
        O_COLLECT_FIRST256_STATS = options2;
        Options options3 = Options.NO_ANCHORS;
        O_NO_ANCHORS = options3;
        Options options4 = Options.FULL_SEGMENTED_SEQUENCES;
        O_FULL_SEGMENTED_SEQUENCES = options4;
        Options options5 = Options.TREE_SEGMENTED_SEQUENCES;
        O_TREE_SEGMENTED_SEQUENCES = options5;
        F_COLLECT_SEGMENTED_STATS = BitFieldSet.intMask(options);
        F_COLLECT_FIRST256_STATS = BitFieldSet.intMask(options2);
        F_NO_ANCHORS = BitFieldSet.intMask(options3);
        F_FULL_SEGMENTED_SEQUENCES = BitFieldSet.intMask(options4);
        F_TREE_SEGMENTED_SEQUENCES = BitFieldSet.intMask(options5);
        SEGMENTED_STATS = new NullableDataKey<>("SEGMENTED_STATS", (Object) null);
    }

    static String optionsToString(int i6) {
        return BitFieldSet.of(Options.class, i6).toString();
    }

    boolean allOptions(int i6);

    boolean anyOptions(int i6);

    <T> T getOption(DataKeyBase<T> dataKeyBase);

    int getOptionFlags();

    DataHolder getOptions();
}
