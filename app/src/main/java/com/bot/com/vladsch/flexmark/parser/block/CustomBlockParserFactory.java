package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.dependency.Dependent;
import com.vladsch.flexmark.util.sequence.mappers.SpecialLeadInHandler;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface CustomBlockParserFactory extends Function<DataHolder, BlockParserFactory>, Dependent {
    @Override // java.util.function.Function
    BlockParserFactory apply(DataHolder dataHolder);

    default SpecialLeadInHandler getLeadInHandler(DataHolder dataHolder) {
        return null;
    }
}
