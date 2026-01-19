package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.ast.Paragraph;

/* loaded from: classes.dex */
public interface ParagraphPreProcessor {
    int preProcessBlock(Paragraph paragraph, ParserState parserState);
}
