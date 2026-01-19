package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface ParagraphPreProcessorFactory extends Function<ParserState, ParagraphPreProcessor>, Dependent {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Function
    ParagraphPreProcessor apply(ParserState parserState);
}
