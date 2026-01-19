package com.vladsch.flexmark.parser.delimiter;

import com.vladsch.flexmark.ast.Text;

/* loaded from: classes.dex */
public interface DelimiterRun {
    boolean canClose();

    boolean canOpen();

    char getDelimiterChar();

    DelimiterRun getNext();

    Text getNode();

    DelimiterRun getPrevious();

    int length();
}
