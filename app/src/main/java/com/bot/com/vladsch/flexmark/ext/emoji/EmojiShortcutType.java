package com.vladsch.flexmark.ext.emoji;

/* loaded from: classes.dex */
public enum EmojiShortcutType {
    EMOJI_CHEAT_SHEET(true, false),
    GITHUB(false, true),
    ANY_EMOJI_CHEAT_SHEET_PREFERRED(true, true),
    ANY_GITHUB_PREFERRED(true, true);

    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final boolean isEmojiCheatSheet;
    public final boolean isGitHub;

    /* renamed from: com.vladsch.flexmark.ext.emoji.EmojiShortcutType$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vladsch$flexmark$ext$emoji$EmojiShortcutType;

        static {
            int[] iArr = new int[EmojiShortcutType.values().length];
            $SwitchMap$com$vladsch$flexmark$ext$emoji$EmojiShortcutType = iArr;
            try {
                iArr[EmojiShortcutType.EMOJI_CHEAT_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$ext$emoji$EmojiShortcutType[EmojiShortcutType.GITHUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$ext$emoji$EmojiShortcutType[EmojiShortcutType.ANY_EMOJI_CHEAT_SHEET_PREFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vladsch$flexmark$ext$emoji$EmojiShortcutType[EmojiShortcutType.ANY_GITHUB_PREFERRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    EmojiShortcutType(boolean z5, boolean z6) {
        this.isEmojiCheatSheet = z5;
        this.isGitHub = z6;
    }

    public String getPreferred(String str, String str2) {
        int i6 = AnonymousClass1.$SwitchMap$com$vladsch$flexmark$ext$emoji$EmojiShortcutType[ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        return null;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                } else if (str != null) {
                    return str;
                }
            }
            return str2;
        }
        return str;
    }
}
