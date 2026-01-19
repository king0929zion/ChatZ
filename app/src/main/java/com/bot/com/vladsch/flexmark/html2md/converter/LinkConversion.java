package com.vladsch.flexmark.html2md.converter;

/* loaded from: classes.dex */
public enum LinkConversion {
    NONE,
    MARKDOWN_EXPLICIT,
    MARKDOWN_REFERENCE,
    TEXT,
    HTML;

    public boolean isParsed() {
        return this != HTML;
    }

    public boolean isReference() {
        return this == MARKDOWN_REFERENCE;
    }

    public boolean isSuppressed() {
        return this == NONE;
    }

    public boolean isTextOnly() {
        return this == TEXT;
    }
}
