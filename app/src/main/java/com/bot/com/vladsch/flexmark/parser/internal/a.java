package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.InlineParserFactory;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InlineParserFactory {
    @Override // com.vladsch.flexmark.parser.InlineParserFactory
    public final InlineParser inlineParser(DataHolder dataHolder, BitSet bitSet, BitSet bitSet2, Map map, LinkRefProcessorData linkRefProcessorData, List list) {
        return new CommonmarkInlineParser(dataHolder, bitSet, bitSet2, map, linkRefProcessorData, list);
    }
}
