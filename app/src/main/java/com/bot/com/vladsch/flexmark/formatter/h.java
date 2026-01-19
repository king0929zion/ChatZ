package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.util.ast.Node;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$new$2;
        lambda$new$2 = NodeRepositoryFormatter.lambda$new$2((Node) obj, (Node) obj2);
        return lambda$new$2;
    }
}
