package com.vladsch.flexmark.ext.emoji.internal;

import B3.e;
import com.vladsch.flexmark.ext.emoji.Emoji;
import com.vladsch.flexmark.ext.emoji.EmojiImageType;
import com.vladsch.flexmark.ext.emoji.EmojiShortcutType;
import com.vladsch.flexmark.ext.emoji.internal.EmojiReference;
import com.vladsch.flexmark.html2md.converter.internal.HtmlConverterCoreNodeRenderer;
import j1.AbstractC1135a;

/* loaded from: classes.dex */
public class EmojiResolvedShortcut {
    public final String alt;
    public final EmojiReference.Emoji emoji;
    public final String emojiText;
    public final boolean isUnicode;

    public EmojiResolvedShortcut(EmojiReference.Emoji emoji, String str, boolean z5, String str2) {
        this.emoji = emoji;
        this.emojiText = str;
        this.isUnicode = z5;
        this.alt = str2;
    }

    public static EmojiResolvedShortcut getEmojiText(Emoji emoji, EmojiShortcutType emojiShortcutType, EmojiImageType emojiImageType, String str) {
        return getEmojiText(emoji.getText().toString(), emojiShortcutType, emojiImageType, str);
    }

    public static EmojiResolvedShortcut getEmojiText(Emoji emoji, EmojiShortcutType emojiShortcutType, EmojiImageType emojiImageType, String str, boolean z5) {
        return getEmojiText(emoji.getText().toString(), emojiShortcutType, emojiImageType, str, z5);
    }

    public static EmojiResolvedShortcut getEmojiText(String str, EmojiShortcutType emojiShortcutType, EmojiImageType emojiImageType, String str2) {
        return getEmojiText(str, emojiShortcutType, emojiImageType, str2, false);
    }

    public static EmojiResolvedShortcut getEmojiText(String str, EmojiShortcutType emojiShortcutType, EmojiImageType emojiImageType, String str2, boolean z5) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        EmojiReference.Emoji emojiFromShortcut = EmojiShortcuts.getEmojiFromShortcut(str);
        String str9 = null;
        boolean z6 = false;
        if (emojiFromShortcut != null) {
            String unicodeChars = (!emojiImageType.isUnicode || emojiFromShortcut.unicodeChars == null) ? null : EmojiShortcuts.getUnicodeChars(emojiFromShortcut);
            if (emojiImageType.isImage) {
                String f6 = (!emojiShortcutType.isGitHub || (str8 = emojiFromShortcut.githubFile) == null) ? null : AbstractC1135a.f("https://github.githubassets.com/images/icons/emoji/", str8);
                if (!emojiShortcutType.isEmojiCheatSheet || (str6 = emojiFromShortcut.emojiCheatSheetFile) == null) {
                    str5 = null;
                } else if (z5 && (str7 = emojiFromShortcut.unicodeSampleFile) != null) {
                    str5 = e.n(str2, str7);
                } else {
                    str5 = e.n(str2, str6);
                }
                str4 = emojiShortcutType.getPreferred(str5, f6);
            } else {
                str4 = null;
            }
            if (str4 != null || unicodeChars != null) {
                if (unicodeChars != null) {
                    z6 = true;
                    str9 = unicodeChars;
                } else {
                    str9 = str4;
                }
                str3 = HtmlConverterCoreNodeRenderer.EMOJI_ALT_PREFIX + emojiFromShortcut.category + ":" + emojiFromShortcut.shortcut;
                return new EmojiResolvedShortcut(emojiFromShortcut, str9, z6, str3);
            }
        }
        str3 = null;
        return new EmojiResolvedShortcut(emojiFromShortcut, str9, z6, str3);
    }
}
