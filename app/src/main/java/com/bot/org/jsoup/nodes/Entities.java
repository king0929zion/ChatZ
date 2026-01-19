package org.jsoup.nodes;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

/* loaded from: classes.dex */
public class Entities {
    private static Document.OutputSettings DefaultOutput = null;
    static final int codepointRadix = 36;
    private static final int empty = -1;
    private static final String emptyName = "";
    private static final char[] codeDelims = {',', ';'};
    private static final HashMap<String, String> multipoints = new HashMap<>();

    /* renamed from: org.jsoup.nodes.Entities$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jsoup$nodes$Entities$CoreCharset;

        static {
            int[] iArr = new int[CoreCharset.values().length];
            $SwitchMap$org$jsoup$nodes$Entities$CoreCharset = iArr;
            try {
                iArr[CoreCharset.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jsoup$nodes$Entities$CoreCharset[CoreCharset.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum CoreCharset {
        ascii,
        utf,
        fallback;

        public static CoreCharset byName(String str) {
            return str.equals("US-ASCII") ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    /* loaded from: classes.dex */
    public enum EscapeMode {
        xhtml(EntitiesData.xmlPoints, 4),
        base(EntitiesData.basePoints, 106),
        extended(EntitiesData.fullPoints, 2125);

        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;

        EscapeMode(String str, int i6) {
            Entities.load(this, str, i6);
        }

        private int size() {
            return this.nameKeys.length;
        }

        public int codepointForName(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (binarySearch >= 0) {
                return this.codeVals[binarySearch];
            }
            return -1;
        }

        public String nameForCodepoint(int i6) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i6);
            if (binarySearch < 0) {
                return "";
            }
            String[] strArr = this.nameVals;
            if (binarySearch < strArr.length - 1) {
                int i7 = binarySearch + 1;
                if (this.codeKeys[i7] == i6) {
                    return strArr[i7];
                }
            }
            return strArr[binarySearch];
        }
    }

    private Entities() {
    }

    private static void appendEncoded(Appendable appendable, EscapeMode escapeMode, int i6) {
        String nameForCodepoint = escapeMode.nameForCodepoint(i6);
        if ("".equals(nameForCodepoint)) {
            appendable.append("&#x").append(Integer.toHexString(i6)).append(';');
        } else {
            appendable.append('&').append(nameForCodepoint).append(';');
        }
    }

    private static boolean canEncode(CoreCharset coreCharset, char c6, CharsetEncoder charsetEncoder) {
        int i6 = AnonymousClass1.$SwitchMap$org$jsoup$nodes$Entities$CoreCharset[coreCharset.ordinal()];
        if (i6 == 1) {
            return c6 < 128;
        }
        if (i6 != 2) {
            return charsetEncoder.canEncode(c6);
        }
        return true;
    }

    public static int codepointsForName(String str, int[] iArr) {
        String str2 = multipoints.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int codepointForName = EscapeMode.extended.codepointForName(str);
        if (codepointForName == -1) {
            return 0;
        }
        iArr[0] = codepointForName;
        return 1;
    }

    public static String escape(String str, Document.OutputSettings outputSettings) {
        if (str == null) {
            return "";
        }
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            escape(borrowBuilder, str, outputSettings, false, false, false, false);
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e6) {
            throw new SerializationException(e6);
        }
    }

    public static String getByName(String str) {
        String str2 = multipoints.get(str);
        if (str2 != null) {
            return str2;
        }
        int codepointForName = EscapeMode.extended.codepointForName(str);
        return codepointForName != -1 ? new String(new int[]{codepointForName}, 0, 1) : "";
    }

    public static boolean isBaseNamedEntity(String str) {
        return EscapeMode.base.codepointForName(str) != -1;
    }

    public static boolean isNamedEntity(String str) {
        return EscapeMode.extended.codepointForName(str) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void load(EscapeMode escapeMode, String str, int i6) {
        int i7;
        escapeMode.nameKeys = new String[i6];
        escapeMode.codeVals = new int[i6];
        escapeMode.codeKeys = new int[i6];
        escapeMode.nameVals = new String[i6];
        CharacterReader characterReader = new CharacterReader(str);
        int i8 = 0;
        while (!characterReader.isEmpty()) {
            try {
                String consumeTo = characterReader.consumeTo('=');
                characterReader.advance();
                int parseInt = Integer.parseInt(characterReader.consumeToAny(codeDelims), codepointRadix);
                char current = characterReader.current();
                characterReader.advance();
                if (current == ',') {
                    i7 = Integer.parseInt(characterReader.consumeTo(';'), codepointRadix);
                    characterReader.advance();
                } else {
                    i7 = -1;
                }
                int parseInt2 = Integer.parseInt(characterReader.consumeTo('&'), codepointRadix);
                characterReader.advance();
                escapeMode.nameKeys[i8] = consumeTo;
                escapeMode.codeVals[i8] = parseInt;
                escapeMode.codeKeys[parseInt2] = parseInt;
                escapeMode.nameVals[parseInt2] = consumeTo;
                if (i7 != -1) {
                    multipoints.put(consumeTo, new String(new int[]{parseInt, i7}, 0, 2));
                }
                i8++;
            } catch (Throwable th) {
                characterReader.close();
                throw th;
            }
        }
        Validate.isTrue(i8 == i6, "Unexpected count of entities loaded");
        characterReader.close();
    }

    public static String unescape(String str) {
        return unescape(str, false);
    }

    public static String unescape(String str, boolean z5) {
        return Parser.unescapeEntities(str, z5);
    }

    public static String escape(String str) {
        if (DefaultOutput == null) {
            DefaultOutput = new Document.OutputSettings();
        }
        return escape(str, DefaultOutput);
    }

    public static void escape(Appendable appendable, String str, Document.OutputSettings outputSettings, boolean z5, boolean z6, boolean z7, boolean z8) {
        EscapeMode escapeMode = outputSettings.escapeMode();
        CharsetEncoder encoder = outputSettings.encoder();
        CoreCharset coreCharset = outputSettings.coreCharset;
        int length = str.length();
        int i6 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            if (z6) {
                if (StringUtil.isWhitespace(codePointAt)) {
                    if ((!z7 || z10) && !z11) {
                        if (z8) {
                            z9 = true;
                        } else {
                            appendable.append(SequenceUtils.SPC);
                            z11 = true;
                        }
                    }
                    i6 += Character.charCount(codePointAt);
                } else {
                    if (z9) {
                        appendable.append(SequenceUtils.SPC);
                        z9 = false;
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    z10 = true;
                }
            }
            if (codePointAt < 65536) {
                char c6 = (char) codePointAt;
                if (c6 == '\t' || c6 == '\n' || c6 == '\r') {
                    appendable.append(c6);
                } else if (c6 != '\"') {
                    if (c6 == '&') {
                        appendable.append("&amp;");
                    } else if (c6 != '<') {
                        if (c6 != '>') {
                            if (c6 != 160) {
                                if (c6 >= ' ' && canEncode(coreCharset, c6, encoder)) {
                                    appendable.append(c6);
                                } else {
                                    appendEncoded(appendable, escapeMode, codePointAt);
                                }
                            } else if (escapeMode != EscapeMode.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (!z5) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c6);
                        }
                    } else if (z5 && escapeMode != EscapeMode.xhtml && outputSettings.syntax() != Document.OutputSettings.Syntax.xml) {
                        appendable.append(c6);
                    } else {
                        appendable.append("&lt;");
                    }
                } else if (z5) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c6);
                }
            } else {
                String str2 = new String(Character.toChars(codePointAt));
                if (encoder.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    appendEncoded(appendable, escapeMode, codePointAt);
                }
            }
            i6 += Character.charCount(codePointAt);
        }
    }
}
