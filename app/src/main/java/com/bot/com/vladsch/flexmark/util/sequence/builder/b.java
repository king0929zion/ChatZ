package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats;
import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return Objects.isNull((SegmentedSequenceStats.StatsEntry) obj);
    }
}
