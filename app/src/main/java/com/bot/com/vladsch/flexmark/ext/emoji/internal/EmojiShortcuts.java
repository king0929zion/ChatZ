package com.vladsch.flexmark.ext.emoji.internal;

import com.vladsch.flexmark.ext.emoji.internal.EmojiReference;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class EmojiShortcuts {
    private static final HashMap<String, EmojiReference.Emoji> emojiShortcuts = new HashMap<>();
    private static final HashMap<String, EmojiReference.Emoji> emojiURIs = new HashMap<>();
    private static final HashMap<EmojiReference.Emoji, String> emojiUnicodeChars = new HashMap<>();
    public static final String gitHubUrlPrefix = "https://github.githubassets.com/images/icons/emoji/";

    public static String extractFileName(String str) {
        String name = new File(str).getName();
        int indexOf = name.indexOf(".png");
        return indexOf >= 0 ? name.substring(0, indexOf) : name;
    }

    public static EmojiReference.Emoji getEmojiFromShortcut(String str) {
        updateEmojiShortcuts();
        return emojiShortcuts.get(str);
    }

    public static EmojiReference.Emoji getEmojiFromURI(String str) {
        updateEmojiURIs();
        return emojiURIs.get(extractFileName(str));
    }

    public static HashMap<String, EmojiReference.Emoji> getEmojiShortcuts() {
        updateEmojiShortcuts();
        return emojiShortcuts;
    }

    public static HashMap<String, EmojiReference.Emoji> getEmojiURIs() {
        updateEmojiShortcuts();
        return emojiURIs;
    }

    public static synchronized String getUnicodeChars(EmojiReference.Emoji emoji) {
        synchronized (EmojiShortcuts.class) {
            if (emoji != null) {
                try {
                    if (emoji.unicodeChars != null) {
                        String str = emojiUnicodeChars.get(emoji);
                        if (str == null) {
                            String[] split = emoji.unicodeChars.replace("U+", FlexmarkHtmlConverter.DEFAULT_NODE).split(SequenceUtils.SPACE);
                            StringBuilder sb = new StringBuilder(16);
                            for (String str2 : split) {
                                sb.appendCodePoint(Integer.parseInt(str2, 16));
                            }
                            str = sb.toString();
                            emojiUnicodeChars.put(emoji, str);
                        }
                        return str;
                    }
                } finally {
                }
            }
            return null;
        }
    }

    private static synchronized void updateEmojiShortcuts() {
        synchronized (EmojiShortcuts.class) {
            if (emojiShortcuts.isEmpty()) {
                for (EmojiReference.Emoji emoji : EmojiReference.getEmojiList()) {
                    String str = emoji.shortcut;
                    if (str != null) {
                        emojiShortcuts.put(str, emoji);
                    }
                }
            }
        }
    }

    private static synchronized void updateEmojiURIs() {
        synchronized (EmojiShortcuts.class) {
            try {
                if (emojiURIs.isEmpty()) {
                    for (EmojiReference.Emoji emoji : EmojiReference.getEmojiList()) {
                        String str = emoji.emojiCheatSheetFile;
                        if (str != null) {
                            emojiURIs.put(extractFileName(str), emoji);
                        }
                        String str2 = emoji.githubFile;
                        if (str2 != null) {
                            emojiURIs.put(extractFileName(str2), emoji);
                        }
                        String str3 = emoji.unicodeSampleFile;
                        if (str3 != null) {
                            emojiURIs.put(extractFileName(str3), emoji);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
