package com.vladsch.flexmark.ext.emoji.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiReference {
    public static final String EMOJI_REFERENCE_TXT = "/EmojiReference.txt";
    private static final String[] EMPTY_ARRAY = new String[0];
    private static ArrayList<Emoji> emojiList = null;
    public static final String githubUrl = "https://github.githubassets.com/images/icons/emoji/";

    /* loaded from: classes.dex */
    public static class Emoji {
        public String[] aliasShortcuts;
        public String[] browserTypes;
        public final String category;
        public final String emojiCheatSheetFile;
        public final String githubFile;
        public final String shortcut;
        public String subcategory;
        public final String unicodeChars;
        public final String unicodeCldr;
        public final String unicodeSampleFile;

        public Emoji(String str, String[] strArr, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String[] strArr2) {
            this.shortcut = str;
            this.aliasShortcuts = strArr;
            this.category = str2;
            this.subcategory = str3;
            this.emojiCheatSheetFile = str4;
            this.githubFile = str5;
            this.unicodeChars = str6;
            this.unicodeSampleFile = str7;
            this.unicodeCldr = str8;
            this.browserTypes = strArr2;
        }
    }

    /* loaded from: classes.dex */
    public enum EmojiBrowserType {
        APPL("appl"),
        DCM("dcm"),
        EMOJI_CHEAT_SHEET("emojis"),
        FB("fb"),
        GITHUB("github"),
        GMAIL("gmail"),
        GOOG("goog"),
        JOY("joy"),
        KDDI("kddi"),
        SAMS("sams"),
        SB("sb"),
        TWTR("twtr"),
        WIND("wind");

        public final String subdirectory;

        EmojiBrowserType(String str) {
            this.subdirectory = str;
        }
    }

    public static List<Emoji> getEmojiList() {
        if (emojiList == null) {
            emojiList = new ArrayList<>(3000);
            InputStream resourceAsStream = EmojiReference.class.getResourceAsStream(EMOJI_REFERENCE_TXT);
            if (resourceAsStream == null) {
                throw new IllegalStateException("Could not load /EmojiReference.txt classpath resource");
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8));
            try {
                bufferedReader.readLine();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split("\t");
                    try {
                        String str = split[0].charAt(0) == ' ' ? null : split[0];
                        String str2 = split[1].charAt(0) == ' ' ? null : split[1];
                        String str3 = split[2].charAt(0) == ' ' ? null : split[2];
                        String str4 = split[3].charAt(0) == ' ' ? null : split[3];
                        String str5 = split[4].charAt(0) == ' ' ? null : split[4];
                        String str6 = split[5].charAt(0) == ' ' ? null : split[5];
                        String str7 = split[6].charAt(0) == ' ' ? null : split[6];
                        emojiList.add(new Emoji(str, split[8].charAt(0) == ' ' ? EMPTY_ARRAY : split[8].split(","), str2, split[7].charAt(0) != ' ' ? split[7] : null, str3, str4, str5, str6, str7, split[9].charAt(0) == ' ' ? EMPTY_ARRAY : split[9].split(",")));
                    } catch (ArrayIndexOutOfBoundsException e6) {
                        throw new IllegalStateException("Error processing EmojiReference.txt", e6);
                    }
                }
            } catch (IOException e7) {
                throw new IllegalStateException("Error processing EmojiReference.txt", e7);
            }
        }
        return emojiList;
    }
}
