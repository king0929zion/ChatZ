package com.vladsch.flexmark.util.html.ui;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.awt.Font;
import java.util.Locale;

/* loaded from: classes.dex */
public class FontStyler extends HtmlStylerBase<Font> {
    @Override // com.vladsch.flexmark.util.html.ui.HtmlStylerBase, com.vladsch.flexmark.util.html.ui.HtmlStyler
    public String getStyle(Font font) {
        if (font == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        Locale locale = Locale.US;
        return "font-family:" + font.getFamily() + ";font-size:" + font.getSize() + "pt;font-style:normal;font-weight:normal";
    }
}
