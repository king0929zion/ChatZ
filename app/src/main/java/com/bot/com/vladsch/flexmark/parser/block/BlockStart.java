package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.parser.internal.BlockStartImpl;

/* loaded from: classes.dex */
public abstract class BlockStart {
    public static BlockStart none() {
        return null;
    }

    public static BlockStart of(BlockParser... blockParserArr) {
        return new BlockStartImpl(blockParserArr);
    }

    public abstract BlockStart atColumn(int i6);

    public abstract BlockStart atIndex(int i6);

    public abstract BlockStart replaceActiveBlockParser();
}
