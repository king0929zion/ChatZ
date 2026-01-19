package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.ast.util.ReferenceRepository;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataNotNullValueFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements DataNotNullValueFactory {
    @Override // com.vladsch.flexmark.util.data.DataNotNullValueFactory, com.vladsch.flexmark.util.data.DataValueFactory
    public final Object apply(DataHolder dataHolder) {
        return new ReferenceRepository(dataHolder);
    }
}
