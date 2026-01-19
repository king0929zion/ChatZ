package com.vladsch.flexmark.util.format;

/* loaded from: classes.dex */
public enum TextAlignment {
    LEFT,
    CENTER,
    RIGHT,
    JUSTIFIED;

    public static TextAlignment getAlignment(String str) {
        for (TextAlignment textAlignment : values()) {
            if (textAlignment.name().equalsIgnoreCase(str)) {
                return textAlignment;
            }
        }
        return LEFT;
    }
}
