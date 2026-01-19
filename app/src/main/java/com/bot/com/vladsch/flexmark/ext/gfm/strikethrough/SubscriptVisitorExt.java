package com.vladsch.flexmark.ext.gfm.strikethrough;

import com.vladsch.flexmark.ext.emoji.a;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class SubscriptVisitorExt {
    public static <V extends SubscriptVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(Subscript.class, new a(v5, 2))};
    }
}
