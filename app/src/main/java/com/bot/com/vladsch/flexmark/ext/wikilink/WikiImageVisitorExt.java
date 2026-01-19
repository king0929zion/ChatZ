package com.vladsch.flexmark.ext.wikilink;

import com.vladsch.flexmark.ext.emoji.a;
import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class WikiImageVisitorExt {
    public static <V extends WikiImageVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(WikiImage.class, new a(v5, 5))};
    }
}
