package com.vladsch.flexmark.parser;

import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.dependency.Dependent;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface PostProcessorFactory extends Function<Document, PostProcessor>, Dependent {
    @Override // java.util.function.Function
    PostProcessor apply(Document document);

    Map<Class<?>, Set<Class<?>>> getNodeTypes();
}
