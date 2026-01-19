package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.io.Reader;

/* loaded from: classes.dex */
public interface IParse {
    DataHolder getOptions();

    Node parse(BasedSequence basedSequence);

    Node parse(String str);

    Node parseReader(Reader reader);

    boolean transferReferences(Document document, Document document2, Boolean bool);
}
