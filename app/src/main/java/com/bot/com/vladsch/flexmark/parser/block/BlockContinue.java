package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.parser.internal.BlockContinueImpl;

/* loaded from: classes.dex */
public class BlockContinue {
    public static BlockContinue atColumn(int i6) {
        return new BlockContinueImpl(-1, i6, false);
    }

    public static BlockContinue atIndex(int i6) {
        return new BlockContinueImpl(i6, -1, false);
    }

    public static BlockContinue finished() {
        return new BlockContinueImpl(-1, -1, true);
    }

    public static BlockContinue none() {
        return null;
    }
}
