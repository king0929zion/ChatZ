package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public interface Content {
    BasedSequence getContentChars();

    BasedSequence getContentChars(int i6, int i7);

    List<BasedSequence> getContentLines();

    List<BasedSequence> getContentLines(int i6, int i7);

    BasedSequence getLineChars(int i6);

    int getLineCount();

    BasedSequence getSpanningChars();
}
