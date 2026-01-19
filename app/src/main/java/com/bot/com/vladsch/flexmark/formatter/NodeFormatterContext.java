package com.vladsch.flexmark.formatter;

import com.vladsch.flexmark.html.renderer.LinkResolverContext;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.NodeContext;
import com.vladsch.flexmark.util.format.TrackedOffsetList;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.Collection;

/* loaded from: classes.dex */
public interface NodeFormatterContext extends NodeContext<Node, NodeFormatterContext>, TranslationContext, LinkResolverContext, ExplicitAttributeIdProvider {
    void delegateRender();

    BasedSequence getBlockQuoteLikePrefixChars();

    CharPredicate getBlockQuoteLikePrefixPredicate();

    Document getDocument();

    FormatterOptions getFormatterOptions();

    FormattingPhase getFormattingPhase();

    MarkdownWriter getMarkdown();

    @Override // com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext, com.vladsch.flexmark.html.renderer.LinkResolverBasicContext
    DataHolder getOptions();

    TrackedOffsetList getTrackedOffsets();

    BasedSequence getTrackedSequence();

    boolean isRestoreTrackedSpaces();

    Iterable<? extends Node> nodesOfType(Collection<Class<?>> collection);

    Iterable<? extends Node> nodesOfType(Class<?>[] clsArr);

    void render(Node node);

    void renderChildren(Node node);

    Iterable<? extends Node> reversedNodesOfType(Collection<Class<?>> collection);

    Iterable<? extends Node> reversedNodesOfType(Class<?>[] clsArr);
}
