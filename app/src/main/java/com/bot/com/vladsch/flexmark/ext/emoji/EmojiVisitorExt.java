package com.vladsch.flexmark.ext.emoji;

import com.vladsch.flexmark.util.ast.VisitHandler;
import java.util.Objects;

/* loaded from: classes.dex */
public class EmojiVisitorExt {
    public static <V extends EmojiVisitor> VisitHandler<?>[] VISIT_HANDLERS(V v5) {
        Objects.requireNonNull(v5);
        return new VisitHandler[]{new VisitHandler(Emoji.class, new a(v5, 0))};
    }
}
