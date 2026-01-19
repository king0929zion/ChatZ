package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.parser.LinkRefProcessorFactory;
import java.util.List;

/* loaded from: classes.dex */
public class LinkRefProcessorData {
    public final int maxNesting;
    public final int[] nestingIndex;
    public final List<LinkRefProcessorFactory> processors;

    public LinkRefProcessorData(List<LinkRefProcessorFactory> list, int i6, int[] iArr) {
        this.processors = list;
        this.maxNesting = i6;
        this.nestingIndex = iArr;
    }
}
