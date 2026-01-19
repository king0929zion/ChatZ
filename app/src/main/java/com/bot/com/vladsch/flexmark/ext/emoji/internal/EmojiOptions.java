package com.vladsch.flexmark.ext.emoji.internal;

import com.vladsch.flexmark.ext.emoji.EmojiExtension;
import com.vladsch.flexmark.ext.emoji.EmojiImageType;
import com.vladsch.flexmark.ext.emoji.EmojiShortcutType;
import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public class EmojiOptions {
    public final String attrAlign;
    public final String attrImageClass;
    public final String attrImageSize;
    public final String rootImagePath;
    public final EmojiImageType useImageType;
    public final EmojiShortcutType useShortcutType;
    public final boolean useUnicodeFileNames;

    public EmojiOptions(DataHolder dataHolder) {
        this.useShortcutType = EmojiExtension.USE_SHORTCUT_TYPE.get(dataHolder);
        this.attrAlign = EmojiExtension.ATTR_ALIGN.get(dataHolder);
        this.attrImageSize = EmojiExtension.ATTR_IMAGE_SIZE.get(dataHolder);
        this.rootImagePath = EmojiExtension.ROOT_IMAGE_PATH.get(dataHolder);
        this.useImageType = EmojiExtension.USE_IMAGE_TYPE.get(dataHolder);
        this.attrImageClass = EmojiExtension.ATTR_IMAGE_CLASS.get(dataHolder);
        this.useUnicodeFileNames = EmojiExtension.USE_UNICODE_FILE_NAMES.get(dataHolder).booleanValue();
    }
}
