package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface InlineParserExtensionFactory extends Function<LightInlineParser, InlineParserExtension>, Dependent {
    @Override // java.util.function.Function
    InlineParserExtension apply(LightInlineParser lightInlineParser);

    CharSequence getCharacters();
}
