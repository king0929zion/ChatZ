package com.vladsch.flexmark.ext.emoji.internal;

import com.vladsch.flexmark.ext.emoji.Emoji;
import com.vladsch.flexmark.html.HtmlWriter;
import com.vladsch.flexmark.html.renderer.LinkType;
import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.html.renderer.NodeRendererContext;
import com.vladsch.flexmark.html.renderer.NodeRendererFactory;
import com.vladsch.flexmark.html.renderer.NodeRenderingHandler;
import com.vladsch.flexmark.html.renderer.ResolvedLink;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class EmojiNodeRenderer implements NodeRenderer {
    final EmojiOptions myOptions;

    /* loaded from: classes.dex */
    public static class Factory implements NodeRendererFactory {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.renderer.NodeRendererFactory, java.util.function.Function
        public NodeRenderer apply(DataHolder dataHolder) {
            return new EmojiNodeRenderer(dataHolder);
        }
    }

    public EmojiNodeRenderer(DataHolder dataHolder) {
        this.myOptions = new EmojiOptions(dataHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Emoji emoji, NodeRendererContext nodeRendererContext, HtmlWriter htmlWriter) {
        String str;
        EmojiOptions emojiOptions = this.myOptions;
        EmojiResolvedShortcut emojiText = EmojiResolvedShortcut.getEmojiText(emoji, emojiOptions.useShortcutType, emojiOptions.useImageType, emojiOptions.rootImagePath, emojiOptions.useUnicodeFileNames);
        if (emojiText.emoji == null || (str = emojiText.emojiText) == null) {
            htmlWriter.text(":");
            nodeRendererContext.renderChildren(emoji);
            htmlWriter.text(":");
        } else {
            if (emojiText.isUnicode) {
                htmlWriter.text((CharSequence) str);
                return;
            }
            ResolvedLink resolveLink = nodeRendererContext.resolveLink(LinkType.IMAGE, str, null);
            htmlWriter.attr("src", (CharSequence) resolveLink.getUrl());
            htmlWriter.attr("alt", (CharSequence) emojiText.alt);
            if (!this.myOptions.attrImageSize.isEmpty()) {
                htmlWriter.attr("height", (CharSequence) this.myOptions.attrImageSize).attr((CharSequence) "width", (CharSequence) this.myOptions.attrImageSize);
            }
            if (!this.myOptions.attrAlign.isEmpty()) {
                htmlWriter.attr("align", (CharSequence) this.myOptions.attrAlign);
            }
            if (!this.myOptions.attrImageClass.isEmpty()) {
                htmlWriter.attr(Attribute.CLASS_ATTR, (CharSequence) this.myOptions.attrImageClass);
            }
            htmlWriter.withAttr(resolveLink);
            htmlWriter.tagVoid(FlexmarkHtmlConverter.IMG_NODE);
        }
    }

    @Override // com.vladsch.flexmark.html.renderer.NodeRenderer
    public Set<NodeRenderingHandler<?>> getNodeRenderingHandlers() {
        HashSet hashSet = new HashSet();
        hashSet.add(new NodeRenderingHandler(Emoji.class, new a(this, 1)));
        return hashSet;
    }
}
