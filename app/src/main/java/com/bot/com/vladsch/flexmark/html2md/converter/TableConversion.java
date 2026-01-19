package com.vladsch.flexmark.html2md.converter;

/* loaded from: classes.dex */
public enum TableConversion {
    NONE,
    MARKDOWN,
    MARKDOWN_NO_SINGLE_CELL,
    MARKDOWN_MACROS,
    MARKDOWN_MACROS_NO_SINGLE_CELL,
    TEXT,
    HTML;

    public boolean isMacros() {
        return this == MARKDOWN_MACROS || this == MARKDOWN_MACROS_NO_SINGLE_CELL;
    }

    public boolean isParsed() {
        return this != HTML;
    }

    public boolean isSuppressed() {
        return this == NONE;
    }

    public boolean isTextOnly() {
        return this == TEXT;
    }

    public boolean isUnwrapSingleCell() {
        return this == MARKDOWN_NO_SINGLE_CELL || this == MARKDOWN_MACROS_NO_SINGLE_CELL;
    }
}
