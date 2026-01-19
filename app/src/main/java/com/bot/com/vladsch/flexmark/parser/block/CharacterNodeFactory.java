package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.util.ast.Node;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public interface CharacterNodeFactory extends Supplier<Node> {
    boolean skipNext(char c6);

    boolean skipPrev(char c6);

    boolean wantSkippedWhitespace();
}
