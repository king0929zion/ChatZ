package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.builder.IBasedSegmentBuilder;

/* loaded from: classes.dex */
public interface IBasedSegmentBuilder<S extends IBasedSegmentBuilder<S>> extends ISegmentBuilder<S> {
    BasedSequence getBaseSequence();

    String toStringChars();

    String toStringWithRanges();

    String toStringWithRangesVisibleWhitespace();
}
