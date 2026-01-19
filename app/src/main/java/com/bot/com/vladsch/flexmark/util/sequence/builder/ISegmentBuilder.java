package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.Range;
import com.vladsch.flexmark.util.sequence.builder.ISegmentBuilder;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface ISegmentBuilder<S extends ISegmentBuilder<S>> extends Iterable<Object> {
    public static final int F_DEFAULT;
    public static final int F_INCLUDE_ANCHORS;
    public static final int F_TRACK_FIRST256;
    public static final Options O_INCLUDE_ANCHORS;
    public static final Options O_TRACK_FIRST256;

    /* loaded from: classes.dex */
    public enum Options {
        INCLUDE_ANCHORS,
        TRACK_FIRST256
    }

    static {
        Options options = Options.INCLUDE_ANCHORS;
        O_INCLUDE_ANCHORS = options;
        Options options2 = Options.TRACK_FIRST256;
        O_TRACK_FIRST256 = options2;
        int intMask = BitFieldSet.intMask(options);
        F_INCLUDE_ANCHORS = intMask;
        int intMask2 = BitFieldSet.intMask(options2);
        F_TRACK_FIRST256 = intMask2;
        F_DEFAULT = intMask | intMask2;
    }

    S append(int i6, int i7);

    S append(Range range);

    S append(CharSequence charSequence);

    S appendAnchor(int i6);

    Range getBaseSubSequenceRange();

    int getEndOffset();

    int getOptions();

    Iterable<Seg> getSegments();

    int getSpan();

    int getStartOffset();

    CharSequence getText();

    int getTextFirst256Length();

    int getTextFirst256Segments();

    int getTextLength();

    int getTextSegments();

    int getTextSpaceLength();

    int getTextSpaceSegments();

    boolean haveOffsets();

    boolean isBaseSubSequenceRange();

    boolean isEmpty();

    boolean isIncludeAnchors();

    boolean isTrackTextFirst256();

    @Override // java.lang.Iterable
    Iterator<Object> iterator();

    int length();

    int noAnchorsSize();

    int size();

    String toString(CharSequence charSequence);

    String toStringWithRanges(CharSequence charSequence);

    String toStringWithRangesVisibleWhitespace(CharSequence charSequence);
}
