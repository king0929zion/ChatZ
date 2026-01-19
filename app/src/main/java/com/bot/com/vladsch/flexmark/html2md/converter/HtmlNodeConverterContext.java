package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.ast.Reference;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.format.NodeContext;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.sequence.LineAppendable;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

/* loaded from: classes.dex */
public interface HtmlNodeConverterContext extends NodeContext<Node, HtmlNodeConverterContext> {
    void appendOuterHtml(Node node);

    void delegateRender();

    String escapeSpecialChars(String str);

    void excludeAttributes(String... strArr);

    @Override // com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext
    Node getCurrentNode();

    Document getDocument();

    HashSet<Reference> getExternalReferences();

    com.vladsch.flexmark.util.ast.Document getForDocument();

    HtmlConverterPhase getFormattingPhase();

    HtmlConverterOptions getHtmlConverterOptions();

    HtmlMarkdownWriter getMarkdown();

    @Override // com.vladsch.flexmark.util.format.NodeContext, com.vladsch.flexmark.html.renderer.LinkResolverContext, com.vladsch.flexmark.html.renderer.LinkResolverBasicContext
    DataHolder getOptions();

    Reference getOrCreateReference(String str, String str2, String str3);

    HashMap<String, Reference> getReferenceIdToReferenceMap();

    HashMap<String, Reference> getReferenceUrlToReferenceMap();

    HtmlConverterState getState();

    Stack<HtmlConverterState> getStateStack();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.format.NodeContext
    HtmlNodeConverterContext getSubContext();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.format.NodeContext
    HtmlNodeConverterContext getSubContext(DataHolder dataHolder);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.format.NodeContext
    HtmlNodeConverterContext getSubContext(DataHolder dataHolder, ISequenceBuilder<?, ?> iSequenceBuilder);

    void inlineCode(Runnable runnable);

    boolean isInlineCode();

    boolean isTrace();

    Node next();

    Node next(int i6);

    int outputAttributes(LineAppendable lineAppendable, String str);

    com.vladsch.flexmark.util.ast.Node parseMarkdown(String str);

    Node peek();

    Node peek(int i6);

    void popState(LineAppendable lineAppendable);

    String prepareText(String str);

    String prepareText(String str, boolean z5);

    void processAttributes(Node node);

    void processConditional(ExtensionConversion extensionConversion, Node node, Runnable runnable);

    String processTextNodes(Node node);

    void processTextNodes(Node node, boolean z5);

    void processTextNodes(Node node, boolean z5, CharSequence charSequence);

    void processTextNodes(Node node, boolean z5, CharSequence charSequence, CharSequence charSequence2);

    void processUnwrapped(Node node);

    void processWrapped(Node node, Boolean bool, boolean z5);

    void pushState(Node node);

    void render(Node node);

    void renderChildren(Node node, boolean z5, Runnable runnable);

    void renderDefault(Node node);

    ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Attributes attributes, Boolean bool);

    ResolvedLink resolveLink(LinkType linkType, CharSequence charSequence, Boolean bool);

    void setInlineCode(boolean z5);

    void setTrace(boolean z5);

    void skip();

    void skip(int i6);

    void transferIdToParent();

    void transferToParentExcept(String... strArr);

    void transferToParentOnly(String... strArr);

    void wrapTextNodes(Node node, CharSequence charSequence, boolean z5);

    @Override // com.vladsch.flexmark.util.format.NodeContext
    /* bridge */ /* synthetic */ default HtmlNodeConverterContext getSubContext(DataHolder dataHolder, ISequenceBuilder iSequenceBuilder) {
        return getSubContext(dataHolder, (ISequenceBuilder<?, ?>) iSequenceBuilder);
    }
}
