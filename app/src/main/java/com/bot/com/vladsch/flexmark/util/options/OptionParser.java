package com.vladsch.flexmark.util.options;

import com.vladsch.flexmark.util.misc.Pair;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public interface OptionParser<T> {
    String getOptionName();

    String getOptionText(T t5, T t6);

    Pair<T, List<ParsedOption<T>>> parseOption(BasedSequence basedSequence, T t5, MessageProvider messageProvider);
}
