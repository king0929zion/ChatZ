package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.HtmlInnerBlock;
import com.vladsch.flexmark.ast.HtmlInnerBlockComment;

/* loaded from: classes.dex */
public interface HtmlInnerVisitor {
    void visit(HtmlInnerBlock htmlInnerBlock);

    void visit(HtmlInnerBlockComment htmlInnerBlockComment);
}
