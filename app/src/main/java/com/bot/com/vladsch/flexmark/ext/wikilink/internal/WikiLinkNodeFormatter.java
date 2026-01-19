package com.vladsch.flexmark.ext.wikilink.internal;

import com.vladsch.flexmark.ext.wikilink.WikiImage;
import com.vladsch.flexmark.ext.wikilink.WikiLink;
import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.formatter.FormattingPhase;
import com.vladsch.flexmark.formatter.MarkdownWriter;
import com.vladsch.flexmark.formatter.NodeFormatter;
import com.vladsch.flexmark.formatter.NodeFormatterContext;
import com.vladsch.flexmark.formatter.NodeFormatterFactory;
import com.vladsch.flexmark.formatter.NodeFormattingHandler;
import com.vladsch.flexmark.formatter.PhasedNodeFormatter;
import com.vladsch.flexmark.formatter.RenderPurpose;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.mappers.SpaceMapper;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class WikiLinkNodeFormatter implements PhasedNodeFormatter {
    public static final HashSet<FormattingPhase> FORMATTING_PHASES = new HashSet<>(Arrays.asList(FormattingPhase.COLLECT, FormattingPhase.DOCUMENT_TOP));
    private Map<String, String> attributeUniquificationIdMap;
    private WikiLinkOptions options;

    /* renamed from: com.vladsch.flexmark.ext.wikilink.internal.WikiLinkNodeFormatter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose;

        static {
            int[] iArr = new int[RenderPurpose.values().length];
            $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose = iArr;
            try {
                iArr[RenderPurpose.TRANSLATION_SPANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED_SPANS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.TRANSLATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[RenderPurpose.FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Factory implements NodeFormatterFactory {
        @Override // com.vladsch.flexmark.formatter.NodeFormatterFactory
        public NodeFormatter create(DataHolder dataHolder) {
            return new WikiLinkNodeFormatter(dataHolder);
        }
    }

    public WikiLinkNodeFormatter(DataHolder dataHolder) {
    }

    private CharSequence escapePipeAnchors(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == '#') {
                WikiLinkOptions wikiLinkOptions = this.options;
                if (wikiLinkOptions.allowAnchors && wikiLinkOptions.allowAnchorEscape) {
                    sb.append('\\');
                }
            } else if (charAt == '\\') {
                sb.append('\\');
            } else if (charAt == '|' && this.options.allowPipeEscape) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb;
    }

    private CharSequence escapeUnescapedPipeAnchors(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder();
        boolean z5 = false;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt != '#') {
                if (charAt == '\\') {
                    z5 = !z5;
                } else if (charAt != '|') {
                    z5 = false;
                } else if (!z5 && this.options.allowPipeEscape) {
                    sb.append('\\');
                }
            } else if (!z5) {
                WikiLinkOptions wikiLinkOptions = this.options;
                if (wikiLinkOptions.allowAnchors && wikiLinkOptions.allowAnchorEscape) {
                    sb.append('\\');
                }
            }
            sb.append(charAt);
        }
        if (z5) {
            sb.append('\\');
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(WikiLink wikiLink, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.append((CharSequence) wikiLink.getOpeningMarker());
        if (wikiLink.isLinkIsFirst()) {
            renderLink(wikiLink, nodeFormatterContext, markdownWriter);
            renderText(wikiLink, nodeFormatterContext, markdownWriter);
        } else {
            renderText(wikiLink, nodeFormatterContext, markdownWriter);
            renderLink(wikiLink, nodeFormatterContext, markdownWriter);
        }
        markdownWriter.append((CharSequence) wikiLink.getClosingMarker());
    }

    private void renderLink(WikiNode wikiNode, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (!nodeFormatterContext.isTransformingText()) {
            if (nodeFormatterContext.getFormatterOptions().rightMargin > 0) {
                markdownWriter.append((CharSequence) wikiNode.getLink().toMapped(SpaceMapper.toNonBreakSpace));
                return;
            } else {
                markdownWriter.append((CharSequence) wikiNode.getLink());
                return;
            }
        }
        if (nodeFormatterContext.getRenderPurpose() == RenderPurpose.TRANSLATION_SPANS) {
            markdownWriter.appendNonTranslating(wikiNode.getPageRef());
            markdownWriter.append((CharSequence) wikiNode.getAnchorMarker());
            if (wikiNode.getAnchorRef().isNotNull()) {
                markdownWriter.append(nodeFormatterContext.transformAnchorRef(wikiNode.getPageRef(), wikiNode.getAnchorRef()));
                return;
            }
            return;
        }
        CharSequence transformNonTranslating = nodeFormatterContext.transformNonTranslating(null, wikiNode.getPageRef(), null, null);
        markdownWriter.append(escapeUnescapedPipeAnchors(transformNonTranslating));
        markdownWriter.append((CharSequence) wikiNode.getAnchorMarker());
        if (wikiNode.getAnchorRef().isNotNull()) {
            CharSequence transformAnchorRef = nodeFormatterContext.transformAnchorRef(wikiNode.getPageRef(), wikiNode.getAnchorRef());
            if (this.attributeUniquificationIdMap == null || nodeFormatterContext.getRenderPurpose() != RenderPurpose.TRANSLATED || nodeFormatterContext.getMergeContext() == null) {
                markdownWriter.append(transformAnchorRef);
                return;
            }
            String valueOf = String.valueOf(transformAnchorRef);
            if (transformNonTranslating.length() == 0) {
                valueOf = this.attributeUniquificationIdMap.getOrDefault(valueOf, valueOf);
            }
            markdownWriter.append((CharSequence) valueOf);
        }
    }

    private void renderText(WikiNode wikiNode, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        if (!nodeFormatterContext.isTransformingText()) {
            if (wikiNode.getText().isNotNull()) {
                if (wikiNode.isLinkIsFirst()) {
                    markdownWriter.append((CharSequence) wikiNode.getTextSeparatorMarker());
                }
                if (nodeFormatterContext.getFormatterOptions().rightMargin > 0) {
                    markdownWriter.append((CharSequence) wikiNode.getText().toMapped(SpaceMapper.toNonBreakSpace));
                } else {
                    nodeFormatterContext.renderChildren(wikiNode);
                }
                if (wikiNode.isLinkIsFirst()) {
                    return;
                }
                markdownWriter.append((CharSequence) wikiNode.getTextSeparatorMarker());
                return;
            }
            return;
        }
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$formatter$RenderPurpose[nodeFormatterContext.getRenderPurpose().ordinal()];
        if (i6 == 1 || i6 == 2) {
            if (wikiNode.isLinkIsFirst()) {
                markdownWriter.append(WikiNode.SEPARATOR_CHAR);
            }
            BasedSequence pageRef = wikiNode.getText().isNull() ? wikiNode.getPageRef() : wikiNode.getText();
            if (this.options.allowInlines) {
                nodeFormatterContext.renderChildren(wikiNode);
            } else {
                markdownWriter.appendTranslating(pageRef.unescape());
            }
            if (wikiNode.isLinkIsFirst()) {
                return;
            }
            markdownWriter.append(WikiNode.SEPARATOR_CHAR);
            return;
        }
        if (i6 != 3) {
            throw new IllegalStateException("Unexpected renderer purpose");
        }
        if (wikiNode.isLinkIsFirst()) {
            markdownWriter.append((CharSequence) wikiNode.getTextSeparatorMarker());
        }
        if (this.options.allowInlines) {
            nodeFormatterContext.renderChildren(wikiNode);
        } else {
            markdownWriter.append(escapePipeAnchors(nodeFormatterContext.transformTranslating(null, wikiNode.getText(), null, null)));
        }
        if (wikiNode.isLinkIsFirst()) {
            return;
        }
        markdownWriter.append((CharSequence) wikiNode.getTextSeparatorMarker());
    }

    @Override // com.vladsch.flexmark.formatter.PhasedNodeFormatter
    public Set<FormattingPhase> getFormattingPhases() {
        return FORMATTING_PHASES;
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<Class<?>> getNodeClasses() {
        return new HashSet(Arrays.asList(WikiLink.class, WikiImage.class));
    }

    @Override // com.vladsch.flexmark.formatter.NodeFormatter
    public Set<NodeFormattingHandler<?>> getNodeFormattingHandlers() {
        return new HashSet(Arrays.asList(new NodeFormattingHandler(WikiLink.class, new a(this, 0)), new NodeFormattingHandler(WikiImage.class, new a(this, 1))));
    }

    @Override // com.vladsch.flexmark.formatter.PhasedNodeFormatter
    public void renderDocument(NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter, Document document, FormattingPhase formattingPhase) {
        this.attributeUniquificationIdMap = Formatter.ATTRIBUTE_UNIQUIFICATION_ID_MAP.get(nodeFormatterContext.getTranslationStore());
        this.options = new WikiLinkOptions(document);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(WikiImage wikiImage, NodeFormatterContext nodeFormatterContext, MarkdownWriter markdownWriter) {
        markdownWriter.append((CharSequence) wikiImage.getOpeningMarker());
        if (wikiImage.isLinkIsFirst()) {
            renderLink(wikiImage, nodeFormatterContext, markdownWriter);
            renderText(wikiImage, nodeFormatterContext, markdownWriter);
        } else {
            renderText(wikiImage, nodeFormatterContext, markdownWriter);
            renderLink(wikiImage, nodeFormatterContext, markdownWriter);
        }
        markdownWriter.append((CharSequence) wikiImage.getClosingMarker());
    }
}
