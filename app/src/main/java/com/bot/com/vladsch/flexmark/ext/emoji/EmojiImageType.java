package com.vladsch.flexmark.ext.emoji;

/* loaded from: classes.dex */
public enum EmojiImageType {
    IMAGE_ONLY(false, true),
    UNICODE_FALLBACK_TO_IMAGE(true, true),
    UNICODE_ONLY(true, false);

    public final boolean isImage;
    public final boolean isUnicode;

    EmojiImageType(boolean z5, boolean z6) {
        this.isUnicode = z5;
        this.isImage = z6;
    }
}
