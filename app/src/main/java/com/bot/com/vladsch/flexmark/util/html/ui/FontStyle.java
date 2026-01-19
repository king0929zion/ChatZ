package com.vladsch.flexmark.util.html.ui;

/* loaded from: classes.dex */
public class FontStyle {
    public final int fontStyle;
    public static final FontStyle PLAIN = new FontStyle(0);
    public static final FontStyle BOLD = new FontStyle(1);
    public static final FontStyle ITALIC = new FontStyle(2);
    public static final FontStyle BOLD_ITALIC = new FontStyle(3);

    private FontStyle(int i6) {
        this.fontStyle = i6;
    }

    public static FontStyle of(int i6) {
        return (i6 & 3) == 3 ? BOLD_ITALIC : (i6 & 1) == 1 ? BOLD : (i6 & 2) == 2 ? ITALIC : PLAIN;
    }

    public boolean isBold() {
        return (this.fontStyle & 1) != 0;
    }

    public boolean isItalic() {
        return (this.fontStyle & 2) != 0;
    }
}
