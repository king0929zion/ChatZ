package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface LinkRefProcessorFactory extends Function<Document, LinkRefProcessor> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Function
    LinkRefProcessor apply(Document document);

    int getBracketNestingLevel(DataHolder dataHolder);

    boolean getWantExclamationPrefix(DataHolder dataHolder);
}
