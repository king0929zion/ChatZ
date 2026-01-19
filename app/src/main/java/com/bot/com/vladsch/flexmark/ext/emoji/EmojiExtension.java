package com.vladsch.flexmark.ext.emoji;

import com.vladsch.flexmark.ext.emoji.internal.EmojiDelimiterProcessor;
import com.vladsch.flexmark.ext.emoji.internal.EmojiJiraRenderer;
import com.vladsch.flexmark.ext.emoji.internal.EmojiNodeFormatter;
import com.vladsch.flexmark.ext.emoji.internal.EmojiNodeRenderer;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.DataKey;
import com.vladsch.flexmark.util.data.MutableDataHolder;

/* loaded from: classes.dex */
public class EmojiExtension implements Parser.ParserExtension, HtmlRenderer.HtmlRendererExtension, Formatter.FormatterExtension {
    public static final DataKey<String> ATTR_ALIGN = new DataKey<>("ATTR_ALIGN", "absmiddle");
    public static final DataKey<String> ATTR_IMAGE_SIZE = new DataKey<>("ATTR_IMAGE_SIZE", "20");
    public static final DataKey<String> ATTR_IMAGE_CLASS = new DataKey<>("ATTR_IMAGE_CLASS", FlexmarkHtmlConverter.DEFAULT_NODE);
    public static final DataKey<String> ROOT_IMAGE_PATH = new DataKey<>("ROOT_IMAGE_PATH", "/img/");
    public static final DataKey<EmojiShortcutType> USE_SHORTCUT_TYPE = new DataKey<>("USE_SHORTCUT_TYPE", EmojiShortcutType.EMOJI_CHEAT_SHEET);
    public static final DataKey<EmojiImageType> USE_IMAGE_TYPE = new DataKey<>("USE_IMAGE_TYPE", EmojiImageType.IMAGE_ONLY);
    public static final DataKey<Boolean> USE_UNICODE_FILE_NAMES = new DataKey<>("USE_UNICODE_FILE_NAMES", Boolean.FALSE);

    private EmojiExtension() {
    }

    public static EmojiExtension create() {
        return new EmojiExtension();
    }

    @Override // com.vladsch.flexmark.formatter.Formatter.FormatterExtension
    public void extend(Formatter.Builder builder) {
        builder.nodeFormatterFactory(new EmojiNodeFormatter.Factory());
    }

    @Override // com.vladsch.flexmark.parser.Parser.ParserExtension
    public void parserOptions(MutableDataHolder mutableDataHolder) {
    }

    @Override // com.vladsch.flexmark.html.HtmlRenderer.HtmlRendererExtension, com.vladsch.flexmark.formatter.Formatter.FormatterExtension
    public void rendererOptions(MutableDataHolder mutableDataHolder) {
    }

    @Override // com.vladsch.flexmark.parser.Parser.ParserExtension
    public void extend(Parser.Builder builder) {
        builder.customDelimiterProcessor(new EmojiDelimiterProcessor());
    }

    @Override // com.vladsch.flexmark.html.HtmlRenderer.HtmlRendererExtension
    public void extend(HtmlRenderer.Builder builder, String str) {
        if (builder.isRendererType("HTML")) {
            builder.nodeRendererFactory(new EmojiNodeRenderer.Factory());
        } else if (builder.isRendererType("JIRA")) {
            builder.nodeRendererFactory(new EmojiJiraRenderer.Factory());
        }
    }
}
