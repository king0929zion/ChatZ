package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.parser.ListOptions;
import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public interface ParagraphItemContainer {
    boolean isItemParagraph(Paragraph paragraph);

    boolean isParagraphInTightListItem(Paragraph paragraph);

    boolean isParagraphWrappingDisabled(Paragraph paragraph, ListOptions listOptions, DataHolder dataHolder);
}
