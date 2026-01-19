package com.vladsch.flexmark.html2md.converter;

/* loaded from: classes.dex */
public enum ExtensionConversion {
    NONE,
    MARKDOWN,
    TEXT,
    HTML;

    public boolean isParsed() {
        return this != HTML;
    }

    public boolean isSuppressed() {
        return this == NONE;
    }

    public boolean isTextOnly() {
        return this == TEXT;
    }
}
