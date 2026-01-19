package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.util.ast.Block;

/* loaded from: classes.dex */
public interface BlockPreProcessor {
    void preProcess(ParserState parserState, Block block);
}
