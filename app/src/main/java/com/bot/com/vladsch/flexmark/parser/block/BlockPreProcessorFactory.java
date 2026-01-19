package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface BlockPreProcessorFactory extends Function<ParserState, BlockPreProcessor>, Dependent {
    @Override // java.util.function.Function
    BlockPreProcessor apply(ParserState parserState);

    Set<Class<? extends Block>> getBlockTypes();
}
