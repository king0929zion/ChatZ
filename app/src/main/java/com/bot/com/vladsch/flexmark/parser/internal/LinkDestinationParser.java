package com.vladsch.flexmark.parser.internal;

import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.BitSet;

/* loaded from: classes.dex */
public class LinkDestinationParser {
    public final BitSet EXCLUDED_0_TO_SPACE_CHARS;
    public final BitSet JEKYLL_EXCLUDED_CHARS;
    public final BitSet PAREN_ESCAPABLE_CHARS;
    public final BitSet PAREN_EXCLUDED_CHARS;
    public final BitSet PAREN_QUOTE_CHARS;
    public final boolean allowMatchedParentheses;
    public final boolean intellijDummyIdentifier;
    public final boolean parseJekyllMacrosInUrls;
    public final boolean spaceInUrls;

    public LinkDestinationParser(boolean z5, boolean z6, boolean z7, boolean z8) {
        this.allowMatchedParentheses = z5 || z7;
        this.spaceInUrls = z6;
        this.parseJekyllMacrosInUrls = z7;
        this.intellijDummyIdentifier = z8;
        BitSet charSet = getCharSet((char) 0, SequenceUtils.SPC);
        this.EXCLUDED_0_TO_SPACE_CHARS = charSet;
        if (z8) {
            charSet.clear(31);
        }
        BitSet charSet2 = getCharSet("{}\\");
        this.JEKYLL_EXCLUDED_CHARS = charSet2;
        charSet2.or(charSet);
        charSet2.clear(32);
        charSet2.clear(9);
        BitSet charSet3 = getCharSet("()\\");
        this.PAREN_EXCLUDED_CHARS = charSet3;
        charSet3.or(charSet);
        this.PAREN_ESCAPABLE_CHARS = getCharSet(Escaping.ESCAPABLE_CHARS);
        this.PAREN_QUOTE_CHARS = getCharSet("\"'");
    }

    public static BitSet getCharSet(CharSequence charSequence) {
        BitSet bitSet = new BitSet(charSequence.length());
        int length = charSequence.length();
        for (int i6 = 0; i6 < length; i6++) {
            bitSet.set(charSequence.charAt(i6));
        }
        return bitSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r16.JEKYLL_EXCLUDED_CHARS.get(r11) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r10 = r10 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r16.JEKYLL_EXCLUDED_CHARS.get(r11) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dc, code lost:
    
        if (r16.PAREN_QUOTE_CHARS.get(r17.safeCharAt(r6)) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e5, code lost:
    
        if (r16.PAREN_EXCLUDED_CHARS.get(r11) == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.util.sequence.BasedSequence parseLinkDestination(com.vladsch.flexmark.util.sequence.BasedSequence r17, int r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.parser.internal.LinkDestinationParser.parseLinkDestination(com.vladsch.flexmark.util.sequence.BasedSequence, int):com.vladsch.flexmark.util.sequence.BasedSequence");
    }

    public static BitSet getCharSet(char c6, char c7) {
        BitSet bitSet = new BitSet();
        for (int i6 = c6; i6 <= c7; i6++) {
            bitSet.set(i6);
        }
        return bitSet;
    }
}
