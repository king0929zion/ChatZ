package com.vladsch.flexmark.ext.gfm.strikethrough;

import com.vladsch.flexmark.ext.emoji.a;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class StrikethroughVisitorExt {
    public static <V extends StrikethroughVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(Strikethrough.class, new a(v5, 1))};
    }
}
