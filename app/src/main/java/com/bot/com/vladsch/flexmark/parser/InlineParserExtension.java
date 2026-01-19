package com.vladsch.flexmark.parser;

/* loaded from: classes.dex */
public interface InlineParserExtension {
    void finalizeBlock(InlineParser inlineParser);

    void finalizeDocument(InlineParser inlineParser);

    boolean parse(LightInlineParser lightInlineParser);
}
