package com.vladsch.flexmark.parser.block;

/* loaded from: classes.dex */
public enum ParserPhase {
    NONE,
    STARTING,
    PARSE_BLOCKS,
    PRE_PROCESS_PARAGRAPHS,
    PRE_PROCESS_BLOCKS,
    PARSE_INLINES,
    DONE
}
