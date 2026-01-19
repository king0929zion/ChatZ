package com.vladsch.flexmark.ast.util;

import com.vladsch.flexmark.ast.HtmlInnerBlock;
import com.vladsch.flexmark.ast.HtmlInnerBlockComment;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class HtmlInnerVisitorExt {
    public static <V extends HtmlInnerVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(HtmlInnerBlock.class, new c(v5, 0)), new VisitHandler(HtmlInnerBlockComment.class, new c(v5, 1))};
    }
}
