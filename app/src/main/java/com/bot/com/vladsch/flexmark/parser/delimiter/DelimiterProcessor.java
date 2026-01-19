package com.vladsch.flexmark.parser.delimiter;

import com.vladsch.flexmark.parser.InlineParser;
import com.vladsch.flexmark.parser.core.delimiter.Delimiter;
import com.vladsch.flexmark.util.ast.Node;

/* loaded from: classes.dex */
public interface DelimiterProcessor {
    boolean canBeCloser(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10);

    boolean canBeOpener(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10);

    char getClosingCharacter();

    int getDelimiterUse(DelimiterRun delimiterRun, DelimiterRun delimiterRun2);

    int getMinLength();

    char getOpeningCharacter();

    void process(Delimiter delimiter, Delimiter delimiter2, int i6);

    boolean skipNonOpenerCloser();

    Node unmatchedDelimiterNode(InlineParser inlineParser, DelimiterRun delimiterRun);
}
