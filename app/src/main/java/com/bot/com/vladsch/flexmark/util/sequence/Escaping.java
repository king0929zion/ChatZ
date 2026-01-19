package com.vladsch.flexmark.util.sequence;

import com.tencent.mmkv.MMKV;
import com.vladsch.flexmark.util.misc.CharPredicate;
import com.vladsch.flexmark.util.misc.Utils;
import j1.AbstractC1135a;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Escaping {
    public static final CharPredicate AMP_BACKSLASH_SET = null;
    private static final Pattern AMP_ONLY;
    private static final Pattern BACKSLASH_ONLY;
    private static final Pattern BACKSLASH_OR_AMP;
    private static final Pattern COLLAPSE_WHITESPACE;
    private static final Replacer COLLAPSE_WHITESPACE_REPLACER;
    private static final String ENTITY = "&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});";
    private static final Pattern ENTITY_ONLY;
    private static final Pattern ENTITY_OR_ESCAPED_CHAR;
    private static final Replacer ENTITY_REPLACER;
    public static final String ESCAPABLE = null;
    public static final String ESCAPABLE_CHARS = "\"#$%&'()*+,./:;<=>?@[]\\^_`{|}~-";
    private static final Pattern ESCAPED_CHAR;
    private static final Pattern ESCAPE_IN_URI;
    private static final Pattern ESCAPE_URI_DECODE;
    static final char[] HEX_DIGITS;
    private static final Replacer REMOVE_REPLACER;
    private static final Replacer UNESCAPE_REPLACER;
    private static final Replacer UNSAFE_CHAR_REPLACER;
    private static final Replacer URL_DECODE_REPLACER;
    private static final Replacer URL_ENCODE_REPLACER;
    private static final Pattern WHITESPACE;
    private static final String XML_SPECIAL = "[&<>\"]";
    private static final Pattern XML_SPECIAL_OR_ENTITY;
    private static final Pattern XML_SPECIAL_RE;
    private static Random random;

    /* loaded from: classes.dex */
    public abstract class Replacer {
        void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper);

        void replace(String str, StringBuilder sb);
    } {
        String s5 = AbstractC1135a.s("[!", ESCAPABLE_CHARS.replace("\\", "\\\\").replace("[", "\\[").replace("]", "\\]"), "]");
        ESCAPABLE = s5;
        BACKSLASH_ONLY = Pattern.compile("[\\\\]");
        ESCAPED_CHAR = Pattern.compile("\\\\" + s5, 2);
        BACKSLASH_OR_AMP = Pattern.compile("[\\\\&]");
        AMP_ONLY = Pattern.compile("[\\&]");
        ENTITY_OR_ESCAPED_CHAR = Pattern.compile("\\\\" + s5 + "|&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});", 2);
        ENTITY_ONLY = Pattern.compile(ENTITY, 2);
        XML_SPECIAL_RE = Pattern.compile(XML_SPECIAL);
        XML_SPECIAL_OR_ENTITY = Pattern.compile("&(?:#x[a-f0-9]{1,8}|#[0-9]{1,8}|[a-z][a-z0-9]{1,31});|[&<>\"]", 2);
        ESCAPE_IN_URI = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        ESCAPE_URI_DECODE = Pattern.compile("(%[a-fA-F0-9]{2})");
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        WHITESPACE = Pattern.compile("[ \t\r\n]+");
        COLLAPSE_WHITESPACE = Pattern.compile("[ \t]{2,}");
        UNSAFE_CHAR_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.1
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
                str.getClass();
                char c6 = 65535;
                switch (str.hashCode()) {
                    case 34:
                        if (str.equals("\"")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case 38:
                        if (str.equals("&")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case MMKV.ExpireInMinute /* 60 */:
                        if (str.equals("<")) {
                            c6 = 2;
                            break;
                        }
                        break;
                    case 62:
                        if (str.equals(">")) {
                            c6 = 3;
                            break;
                        }
                        break;
                }
                switch (c6) {
                    case 0:
                        sb.append("&quot;");
                        return;
                    case 1:
                        sb.append("&amp;");
                        return;
                    case 2:
                        sb.append("&lt;");
                        return;
                    case 3:
                        sb.append("&gt;");
                        return;
                    default:
                        sb.append(str);
                        return;
                }
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                String obj = basedSequence.subSequence(i6, i7).toString();
                obj.getClass();
                char c6 = 65535;
                switch (obj.hashCode()) {
                    case 34:
                        if (obj.equals("\"")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case 38:
                        if (obj.equals("&")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case MMKV.ExpireInMinute /* 60 */:
                        if (obj.equals("<")) {
                            c6 = 2;
                            break;
                        }
                        break;
                    case 62:
                        if (obj.equals(">")) {
                            c6 = 3;
                            break;
                        }
                        break;
                }
                switch (c6) {
                    case 0:
                        replacedTextMapper.addReplacedText(i6, i7, PrefixedSubSequence.prefixOf("&quot;", BasedSequence.NULL));
                        return;
                    case 1:
                        replacedTextMapper.addReplacedText(i6, i7, PrefixedSubSequence.prefixOf("&amp;", BasedSequence.NULL));
                        return;
                    case 2:
                        replacedTextMapper.addReplacedText(i6, i7, PrefixedSubSequence.prefixOf("&lt;", BasedSequence.NULL));
                        return;
                    case 3:
                        replacedTextMapper.addReplacedText(i6, i7, PrefixedSubSequence.prefixOf("&gt;", BasedSequence.NULL));
                        return;
                    default:
                        replacedTextMapper.addOriginalText(i6, i7);
                        return;
                }
            }
        };
        COLLAPSE_WHITESPACE_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.2
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
                sb.append(SequenceUtils.SPACE);
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                replacedTextMapper.addReplacedText(i6, i7, basedSequence.subSequence(i6, i6 + 1));
            }
        };
        UNESCAPE_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.3
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
                if (str.charAt(0) == '\\') {
                    sb.append((CharSequence) str, 1, str.length());
                } else {
                    sb.append(Html5Entities.entityToString(str));
                }
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                if (basedSequence.charAt(i6) == '\\') {
                    replacedTextMapper.addReplacedText(i6, i7, basedSequence.subSequence(i6 + 1, i7));
                } else {
                    replacedTextMapper.addReplacedText(i6, i7, Html5Entities.entityToSequence(basedSequence.subSequence(i6, i7)));
                }
            }
        };
        REMOVE_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.4
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                replacedTextMapper.addReplacedText(i6, i7, basedSequence.subSequence(i7, i7));
            }
        };
        ENTITY_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.5
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
                sb.append(Html5Entities.entityToString(str));
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                replacedTextMapper.addReplacedText(i6, i7, Html5Entities.entityToSequence(basedSequence.subSequence(i6, i7)));
            }
        };
        URL_ENCODE_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.6
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
                if (str.startsWith("%")) {
                    if (str.length() == 3) {
                        sb.append(str);
                        return;
                    } else {
                        sb.append("%25");
                        sb.append((CharSequence) str, 1, str.length());
                        return;
                    }
                }
                for (byte b5 : str.getBytes(StandardCharsets.UTF_8)) {
                    sb.append('%');
                    char[] cArr = Escaping.HEX_DIGITS;
                    sb.append(cArr[(b5 >> 4) & 15]);
                    sb.append(cArr[b5 & 15]);
                }
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                BasedSequence subSequence = basedSequence.subSequence(i6, i7);
                if (subSequence.startsWith("%")) {
                    if (subSequence.length() == 3) {
                        replacedTextMapper.addOriginalText(i6, i7);
                        return;
                    }
                    int i8 = i6 + 1;
                    replacedTextMapper.addReplacedText(i6, i8, PrefixedSubSequence.prefixOf("%25", BasedSequence.NULL));
                    replacedTextMapper.addOriginalText(i8, i7);
                    return;
                }
                byte[] bytes = subSequence.toString().getBytes(StandardCharsets.UTF_8);
                StringBuilder sb = new StringBuilder();
                for (byte b5 : bytes) {
                    sb.append('%');
                    char[] cArr = Escaping.HEX_DIGITS;
                    sb.append(cArr[(b5 >> 4) & 15]);
                    sb.append(cArr[b5 & 15]);
                }
                replacedTextMapper.addReplacedText(i6, i7, PrefixedSubSequence.prefixOf(sb.toString(), BasedSequence.NULL));
            }
        };
        URL_DECODE_REPLACER = new Replacer() { // from class: com.vladsch.flexmark.util.sequence.Escaping.7
            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(String str, StringBuilder sb) {
                sb.append(Utils.urlDecode(str, null));
            }

            @Override // com.vladsch.flexmark.util.sequence.Escaping.Replacer
            public void replace(BasedSequence basedSequence, int i6, int i7, ReplacedTextMapper replacedTextMapper) {
                replacedTextMapper.addReplacedText(i6, i7, PrefixedSubSequence.prefixOf(Utils.urlDecode(basedSequence.subSequence(i6, i7).toString(), null), BasedSequence.NULL));
            }
        };
        AMP_BACKSLASH_SET = CharPredicate.anyOf('\\', '&');
        random = new Random(9766L);
    }

    public static String collapseWhitespace(CharSequence charSequence, boolean z5) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        int length = charSequence.length();
        boolean z6 = false;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == ' ' || charAt == '\t' || charAt == '\n' || charAt == '\r') {
                z6 = true;
            } else {
                if (z6 && (!z5 || sb.length() > 0)) {
                    sb.append(SequenceUtils.SPC);
                }
                sb.append(charAt);
                z6 = false;
            }
        }
        if (z6 && !z5) {
            sb.append(SequenceUtils.SPC);
        }
        return sb.toString();
    }

    private static String encode(char c6) {
        if (c6 == '\"') {
            return "&quot;";
        }
        if (c6 == '<') {
            return "&lt;";
        }
        if (c6 == '>') {
            return "&gt;";
        }
        if (c6 == '&') {
            return "&amp;";
        }
        if (c6 != '\'') {
            return null;
        }
        return "&#39;";
    }

    public static String escapeHtml(CharSequence charSequence, boolean z5) {
        return replaceAll(z5 ? XML_SPECIAL_OR_ENTITY : XML_SPECIAL_RE, charSequence, UNSAFE_CHAR_REPLACER);
    }

    public static String normalizeEOL(CharSequence charSequence) {
        return normalizeEOL(charSequence, false);
    }

    public static String normalizeEndWithEOL(CharSequence charSequence) {
        return normalizeEOL(charSequence, true);
    }

    public static String normalizeReference(CharSequence charSequence, boolean z5) {
        return z5 ? collapseWhitespace((CharSequence) charSequence.toString(), true).toLowerCase() : collapseWhitespace((CharSequence) charSequence.toString(), true);
    }

    public static String normalizeReferenceChars(CharSequence charSequence, boolean z5) {
        if (charSequence.length() <= 1) {
            return String.valueOf(charSequence);
        }
        return normalizeReference(charSequence.subSequence(charSequence.charAt(0) == '!' ? 2 : 1, charSequence.length() - (charSequence.charAt(charSequence.length() - 1) == ':' ? 2 : 1)), z5);
    }

    public static String obfuscate(String str, boolean z5) {
        if (!z5) {
            random = new Random(0L);
        }
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            int nextInt = random.nextInt(5);
            if (nextInt == 0 || nextInt == 1) {
                sb.append("&#");
                sb.append((int) charAt);
                sb.append(';');
            } else if (nextInt == 2 || nextInt == 3) {
                sb.append("&#x");
                sb.append(Integer.toHexString(charAt));
                sb.append(';');
            } else if (nextInt == 4) {
                String encode = encode(charAt);
                if (encode != null) {
                    sb.append(encode);
                } else {
                    sb.append(charAt);
                }
            }
        }
        return sb.toString();
    }

    public static String percentDecodeUrl(CharSequence charSequence) {
        return replaceAll(ESCAPE_URI_DECODE, charSequence, URL_DECODE_REPLACER);
    }

    public static String percentEncodeUrl(CharSequence charSequence) {
        return replaceAll(ESCAPE_IN_URI, charSequence, URL_ENCODE_REPLACER);
    }

    public static BasedSequence removeAll(BasedSequence basedSequence, CharSequence charSequence, ReplacedTextMapper replacedTextMapper) {
        if (basedSequence.indexOf(charSequence) == -1) {
            return basedSequence;
        }
        return replaceAll(Pattern.compile("\\Q" + ((Object) charSequence) + "\\E"), basedSequence, REMOVE_REPLACER, replacedTextMapper);
    }

    private static String replaceAll(Pattern pattern, CharSequence charSequence, Replacer replacer) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.find()) {
            return String.valueOf(charSequence);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() + 16);
        int i6 = 0;
        do {
            sb.append(charSequence, i6, matcher.start());
            replacer.replace(matcher.group(), sb);
            i6 = matcher.end();
        } while (matcher.find());
        if (i6 != charSequence.length()) {
            sb.append(charSequence, i6, charSequence.length());
        }
        return sb.toString();
    }

    public static BasedSequence unescape(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return basedSequence.indexOfAny(AMP_BACKSLASH_SET) != -1 ? replaceAll(ENTITY_OR_ESCAPED_CHAR, basedSequence, UNESCAPE_REPLACER, replacedTextMapper) : basedSequence;
    }

    public static String unescapeHtml(CharSequence charSequence) {
        if (AMP_ONLY.matcher(charSequence).find()) {
            return replaceAll(ENTITY_ONLY, charSequence, ENTITY_REPLACER);
        }
        return String.valueOf(charSequence);
    }

    public static String unescapeString(CharSequence charSequence) {
        if (BACKSLASH_OR_AMP.matcher(charSequence).find()) {
            return replaceAll(ENTITY_OR_ESCAPED_CHAR, charSequence, UNESCAPE_REPLACER);
        }
        return String.valueOf(charSequence);
    }

    public static String normalizeEOL(CharSequence charSequence, boolean z5) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        int length = charSequence.length();
        boolean z6 = false;
        boolean z7 = false;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == '\r') {
                z7 = true;
            } else if (charAt == '\n') {
                sb.append(SequenceUtils.EOL);
                z7 = false;
                z6 = true;
            } else {
                if (z7) {
                    sb.append('\n');
                }
                sb.append(charAt);
                z6 = false;
                z7 = false;
            }
        }
        if (z5 && !z6) {
            sb.append('\n');
        }
        return sb.toString();
    }

    public static BasedSequence normalizeEndWithEOL(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return normalizeEOL(basedSequence, replacedTextMapper, true);
    }

    public static BasedSequence percentDecodeUrl(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return replaceAll(ESCAPE_URI_DECODE, basedSequence, URL_DECODE_REPLACER, replacedTextMapper);
    }

    public static BasedSequence percentEncodeUrl(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return replaceAll(ESCAPE_IN_URI, basedSequence, URL_ENCODE_REPLACER, replacedTextMapper);
    }

    public static BasedSequence escapeHtml(BasedSequence basedSequence, boolean z5, ReplacedTextMapper replacedTextMapper) {
        return replaceAll(z5 ? XML_SPECIAL_OR_ENTITY : XML_SPECIAL_RE, basedSequence, UNSAFE_CHAR_REPLACER, replacedTextMapper);
    }

    public static BasedSequence unescapeHtml(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return basedSequence.indexOf('&') != -1 ? replaceAll(ENTITY_ONLY, basedSequence, ENTITY_REPLACER, replacedTextMapper) : basedSequence;
    }

    public static String unescapeString(CharSequence charSequence, boolean z5) {
        if (z5) {
            if (BACKSLASH_OR_AMP.matcher(charSequence).find()) {
                return replaceAll(ESCAPED_CHAR, charSequence, UNESCAPE_REPLACER);
            }
            return String.valueOf(charSequence);
        }
        if (BACKSLASH_ONLY.matcher(charSequence).find()) {
            return replaceAll(ENTITY_OR_ESCAPED_CHAR, charSequence, UNESCAPE_REPLACER);
        }
        return String.valueOf(charSequence);
    }

    public static BasedSequence unescapeHtml(BasedSequence basedSequence, List<Range> list, ReplacedTextMapper replacedTextMapper) {
        return basedSequence.indexOf('&') != -1 ? replaceAll(ENTITY_ONLY, basedSequence, list, ENTITY_REPLACER, replacedTextMapper) : basedSequence;
    }

    public static BasedSequence collapseWhitespace(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return replaceAll(COLLAPSE_WHITESPACE, basedSequence, COLLAPSE_WHITESPACE_REPLACER, replacedTextMapper);
    }

    public static BasedSequence normalizeEOL(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper) {
        return normalizeEOL(basedSequence, replacedTextMapper, false);
    }

    public static BasedSequence normalizeEOL(BasedSequence basedSequence, ReplacedTextMapper replacedTextMapper, boolean z5) {
        int length = basedSequence.length();
        if (replacedTextMapper.isModified()) {
            replacedTextMapper.startNestedReplacement(basedSequence);
        }
        boolean z6 = false;
        int i6 = 0;
        boolean z7 = false;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = basedSequence.charAt(i7);
            if (charAt == '\r') {
                z6 = true;
            } else if (charAt == '\n') {
                if (z6) {
                    int i8 = i7 - 1;
                    if (i6 < i8) {
                        replacedTextMapper.addOriginalText(i6, i8);
                    }
                    z6 = false;
                    i6 = i7;
                    z7 = true;
                }
            } else if (z6) {
                int i9 = i7 - 1;
                if (i6 < i9) {
                    replacedTextMapper.addOriginalText(i6, i7 + 1);
                }
                replacedTextMapper.addReplacedText(i9, i7, BasedSequence.EOL);
                z6 = false;
                z7 = false;
                i6 = i7;
            }
        }
        if (!z6) {
            if (i6 < length) {
                replacedTextMapper.addOriginalText(i6, length);
            }
            if (!z7 && z5) {
                replacedTextMapper.addReplacedText(length - 1, length, BasedSequence.EOL);
            }
        }
        return replacedTextMapper.getReplacedSequence();
    }

    private static BasedSequence replaceAll(Pattern pattern, BasedSequence basedSequence, Replacer replacer, ReplacedTextMapper replacedTextMapper) {
        return replaceAll(pattern, basedSequence, 0, basedSequence.length(), replacer, replacedTextMapper);
    }

    private static BasedSequence replaceAll(Pattern pattern, BasedSequence basedSequence, int i6, int i7, Replacer replacer, ReplacedTextMapper replacedTextMapper) {
        Matcher matcher = pattern.matcher(basedSequence);
        matcher.region(i6, i7);
        int i8 = 0;
        matcher.useTransparentBounds(false);
        if (replacedTextMapper.isModified()) {
            replacedTextMapper.startNestedReplacement(basedSequence);
        }
        if (!matcher.find()) {
            replacedTextMapper.addOriginalText(0, basedSequence.length());
            return basedSequence;
        }
        do {
            replacedTextMapper.addOriginalText(i8, matcher.start());
            replacer.replace(basedSequence, matcher.start(), matcher.end(), replacedTextMapper);
            i8 = matcher.end();
        } while (matcher.find());
        if (i8 < basedSequence.length()) {
            replacedTextMapper.addOriginalText(i8, basedSequence.length());
        }
        return replacedTextMapper.getReplacedSequence();
    }

    private static BasedSequence replaceAll(Pattern pattern, BasedSequence basedSequence, List<Range> list, Replacer replacer, ReplacedTextMapper replacedTextMapper) {
        Matcher matcher = pattern.matcher(basedSequence);
        int i6 = 0;
        matcher.useTransparentBounds(false);
        if (replacedTextMapper.isModified()) {
            replacedTextMapper.startNestedReplacement(basedSequence);
        }
        for (Range range : list) {
            int rangeLimit = Utils.rangeLimit(range.getStart(), i6, basedSequence.length());
            matcher.region(rangeLimit, Utils.rangeLimit(range.getEnd(), rangeLimit, basedSequence.length()));
            while (matcher.find()) {
                replacedTextMapper.addOriginalText(i6, matcher.start());
                replacer.replace(basedSequence, matcher.start(), matcher.end(), replacedTextMapper);
                i6 = matcher.end();
            }
        }
        if (i6 < basedSequence.length()) {
            replacedTextMapper.addOriginalText(i6, basedSequence.length());
        }
        return replacedTextMapper.getReplacedSequence();
    }
}
