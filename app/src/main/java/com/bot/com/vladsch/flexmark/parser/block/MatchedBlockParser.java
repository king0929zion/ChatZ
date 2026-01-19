package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public interface MatchedBlockParser {
    BlockParser getBlockParser();

    BasedSequence getParagraphContent();

    MutableDataHolder getParagraphDataHolder();

    List<Integer> getParagraphEolLengths();

    List<BasedSequence> getParagraphLines();
}
