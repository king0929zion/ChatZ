package com.vladsch.flexmark.util.html.ui;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

/* loaded from: classes.dex */
public class FontStyleStyler extends HtmlStylerBase<FontStyle> {
    @Override // com.vladsch.flexmark.util.html.ui.HtmlStylerBase, com.vladsch.flexmark.util.html.ui.HtmlStyler
    public String getStyle(FontStyle fontStyle) {
        if (fontStyle == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        return (fontStyle.isItalic() ? "font-style:italic;" : "font-style:normal;").concat(fontStyle.isBold() ? "font-weight:bold" : "font-weight:normal");
    }
}
