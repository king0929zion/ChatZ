package com.vladsch.flexmark.ext.ins;

import com.vladsch.flexmark.ext.emoji.a;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class InsVisitorExt {
    public static <V extends InsVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(Ins.class, new a(v5, 3))};
    }
}
