package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.NodeContext;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;

/* loaded from: classes.dex */
public interface NodeContext<N, C extends NodeContext<N, C>> {
    N getCurrentNode();

    DataHolder getOptions();

    C getSubContext();

    C getSubContext(DataHolder dataHolder);

    C getSubContext(DataHolder dataHolder, ISequenceBuilder<?, ?> iSequenceBuilder);
}
