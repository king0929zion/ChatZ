package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.AttributablePart;
import com.vladsch.flexmark.html.renderer.LinkStatus;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.HtmlAppendableBase;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.TagRange;

/* loaded from: classes.dex */
public class HtmlWriter extends HtmlAppendableBase<HtmlWriter> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private NodeRendererContext context;
    private AttributablePart useAttributes;

    public HtmlWriter(int i6, int i7) {
        super(i6, i7);
    }

    public NodeRendererContext getContext() {
        return this.context;
    }

    public void setContext(NodeRendererContext nodeRendererContext) {
        this.context = nodeRendererContext;
    }

    public HtmlWriter srcPos() {
        NodeRendererContext nodeRendererContext = this.context;
        return nodeRendererContext == null ? this : srcPos(nodeRendererContext.getCurrentNode().getChars());
    }

    public HtmlWriter srcPosWithEOL() {
        NodeRendererContext nodeRendererContext = this.context;
        return nodeRendererContext == null ? this : srcPosWithEOL(nodeRendererContext.getCurrentNode().getChars());
    }

    public HtmlWriter srcPosWithTrailingEOL() {
        NodeRendererContext nodeRendererContext = this.context;
        return nodeRendererContext == null ? this : srcPosWithTrailingEOL(nodeRendererContext.getCurrentNode().getChars());
    }

    public HtmlWriter(HtmlWriter htmlWriter, boolean z5) {
        super(htmlWriter, z5);
        this.context = htmlWriter.context;
    }

    public HtmlWriter srcPos(BasedSequence basedSequence) {
        if (!basedSequence.isNotNull()) {
            return this;
        }
        BasedSequence trimEOL = basedSequence.trimEOL();
        return srcPos(trimEOL.getStartOffset(), trimEOL.getEndOffset());
    }

    public HtmlWriter srcPosWithEOL(BasedSequence basedSequence) {
        return basedSequence.isNotNull() ? srcPos(basedSequence.getStartOffset(), basedSequence.getEndOffset()) : this;
    }

    public HtmlWriter srcPosWithTrailingEOL(BasedSequence basedSequence) {
        char charAt;
        if (!basedSequence.isNotNull()) {
            return this;
        }
        int endOffset = basedSequence.getEndOffset();
        BasedSequence baseSequence = basedSequence.getBaseSequence();
        while (endOffset < baseSequence.length() && ((charAt = baseSequence.charAt(endOffset)) == ' ' || charAt == '\t')) {
            endOffset++;
        }
        if (endOffset < baseSequence.length() && baseSequence.charAt(endOffset) == '\r') {
            endOffset++;
        }
        if (endOffset < baseSequence.length() && baseSequence.charAt(endOffset) == '\n') {
            endOffset++;
        }
        return srcPos(basedSequence.getStartOffset(), endOffset);
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.html.HtmlAppendable
    public HtmlWriter tag(CharSequence charSequence, boolean z5) {
        Attributes attributes;
        String str;
        int i6;
        int i7;
        AttributablePart attributablePart = this.useAttributes;
        if (attributablePart != null) {
            NodeRendererContext nodeRendererContext = this.context;
            if (nodeRendererContext != null) {
                attributes = nodeRendererContext.extendRenderingNodeAttributes(attributablePart, getAttributes());
                str = attributes.getValue(this.context.getHtmlOptions().sourcePositionAttribute);
            } else {
                attributes = new Attributes();
                str = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            if (!str.isEmpty()) {
                int indexOf = str.indexOf(45);
                int i8 = -1;
                if (indexOf != -1) {
                    try {
                        i7 = Integer.parseInt(str.substring(0, indexOf));
                    } catch (Throwable unused) {
                        i7 = -1;
                    }
                    try {
                        i8 = Integer.parseInt(str.substring(indexOf + 1));
                    } catch (Throwable unused2) {
                    }
                    i6 = i8;
                    i8 = i7;
                } else {
                    i6 = -1;
                }
                if (i8 >= 0 && i8 < i6) {
                    HtmlRenderer.TAG_RANGES.get(this.context.getDocument()).add(new TagRange(charSequence, i8, i6));
                }
            }
            setAttributes(attributes);
            this.useAttributes = null;
        }
        super.tag(charSequence, z5);
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.HtmlAppendableBase, com.vladsch.flexmark.util.html.HtmlAppendable
    public HtmlWriter withAttr() {
        return withAttr(AttributablePart.NODE);
    }

    public HtmlWriter(int i6, int i7, boolean z5, boolean z6) {
        this(null, i6, i7, z5, z6);
    }

    public HtmlWriter withAttr(AttributablePart attributablePart) {
        super.withAttr();
        this.useAttributes = attributablePart;
        return this;
    }

    public HtmlWriter(Appendable appendable, int i6, int i7, boolean z5, boolean z6) {
        super(appendable, i6, i7);
        setSuppressOpenTagLine(z5);
        setSuppressCloseTagLine(z6);
    }

    public HtmlWriter srcPos(int i6, int i7) {
        NodeRendererContext nodeRendererContext;
        if (i6 <= i7 && (nodeRendererContext = this.context) != null && !nodeRendererContext.getHtmlOptions().sourcePositionAttribute.isEmpty()) {
            super.attr((CharSequence) this.context.getHtmlOptions().sourcePositionAttribute, (CharSequence) (i6 + "-" + i7));
        }
        return this;
    }

    public HtmlWriter withAttr(LinkStatus linkStatus) {
        attr(Attribute.LINK_STATUS_ATTR, (CharSequence) linkStatus.getName());
        return withAttr(AttributablePart.LINK);
    }

    public HtmlWriter withAttr(ResolvedLink resolvedLink) {
        return withAttr(resolvedLink.getStatus());
    }
}
