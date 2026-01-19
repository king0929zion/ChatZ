package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.parser.delimiter.DelimiterProcessor;
import com.vladsch.flexmark.parser.internal.LinkRefProcessorData;
import com.vladsch.flexmark.util.data.DataHolder;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface InlineParserFactory {
    InlineParser inlineParser(DataHolder dataHolder, BitSet bitSet, BitSet bitSet2, Map<Character, DelimiterProcessor> map, LinkRefProcessorData linkRefProcessorData, List<InlineParserExtensionFactory> list);
}
