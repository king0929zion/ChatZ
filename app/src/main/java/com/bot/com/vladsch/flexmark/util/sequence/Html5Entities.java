package com.vladsch.flexmark.util.sequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Html5Entities {
    private static final String ENTITY_PATH = "/com/vladsch/flexmark/util/sequence/entities.properties";
    private static final Map<String, String> NAMED_CHARACTER_REFERENCES = readEntities();
    private static final Pattern NUMERIC_PATTERN = Pattern.compile("^&#[Xx]?");

    public static BasedSequence entityToSequence(BasedSequence basedSequence) {
        Matcher matcher = NUMERIC_PATTERN.matcher(basedSequence);
        BasedSequence subSequence = basedSequence.subSequence(0, 0);
        if (!matcher.find()) {
            String str = NAMED_CHARACTER_REFERENCES.get(basedSequence.subSequence(1, basedSequence.length() - 1).toString());
            return str != null ? PrefixedSubSequence.prefixOf(str, subSequence) : basedSequence;
        }
        try {
            int parseInt = Integer.parseInt(basedSequence.subSequence(matcher.end(), basedSequence.length() - 1).toString(), matcher.end() == 2 ? 10 : 16);
            return parseInt == 0 ? PrefixedSubSequence.prefixOf("�", subSequence) : PrefixedSubSequence.prefixOf(Arrays.toString(Character.toChars(parseInt)), subSequence);
        } catch (IllegalArgumentException unused) {
            return PrefixedSubSequence.prefixOf("�", subSequence);
        }
    }

    public static String entityToString(String str) {
        Matcher matcher = NUMERIC_PATTERN.matcher(str);
        if (!matcher.find()) {
            String str2 = NAMED_CHARACTER_REFERENCES.get(str.substring(1, str.length() - 1));
            return str2 != null ? str2 : str;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }

    private static Map<String, String> readEntities() {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Html5Entities.class.getResourceAsStream(ENTITY_PATH), StandardCharsets.UTF_8));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    hashMap.put("NewLine", SequenceUtils.EOL);
                    return hashMap;
                }
                if (readLine.length() != 0) {
                    int indexOf = readLine.indexOf("=");
                    hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                }
            }
        } catch (IOException e6) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e6);
        }
    }
}
