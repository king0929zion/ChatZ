package com.vladsch.flexmark.ext.superscript;

import com.vladsch.flexmark.ext.emoji.a;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class SuperscriptVisitorExt {
    public static <V extends SuperscriptVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(Superscript.class, new a(v5, 4))};
    }
}
