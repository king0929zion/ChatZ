package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/* loaded from: classes.dex */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;
    private static final String[] ElementSelectorChars = {"*|", "|", "_", "-"};
    private static final String[] CssIdentifierChars = {"-", "_"};

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private String consumeEscapedCssIdentifier(String... strArr) {
        int i6 = this.pos;
        boolean z5 = false;
        while (!isEmpty()) {
            if (this.queue.charAt(this.pos) == '\\' && remainingLength() > 1) {
                this.pos += 2;
                z5 = true;
            } else {
                if (!matchesCssIdentifier(strArr)) {
                    break;
                }
                this.pos++;
            }
        }
        String substring = this.queue.substring(i6, this.pos);
        return z5 ? unescape(substring) : substring;
    }

    public static String escapeCssIdentifier(String str) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        TokenQueue tokenQueue = new TokenQueue(str);
        while (!tokenQueue.isEmpty()) {
            if (tokenQueue.matchesCssIdentifier(ElementSelectorChars)) {
                borrowBuilder.append(tokenQueue.consume());
            } else {
                borrowBuilder.append(ESC);
                borrowBuilder.append(tokenQueue.consume());
            }
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    private boolean matchesCssIdentifier(String... strArr) {
        return matchesWord() || matchesAny(strArr);
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        char c6 = 0;
        for (char c7 : str.toCharArray()) {
            if (c7 != '\\') {
                borrowBuilder.append(c7);
            } else if (c6 == '\\') {
                borrowBuilder.append(c7);
                c6 = 0;
            }
            c6 = c7;
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    public void addFirst(String str) {
        this.queue = str + this.queue.substring(this.pos);
        this.pos = 0;
    }

    public void advance() {
        if (isEmpty()) {
            return;
        }
        this.pos++;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[LOOP:0: B:2:0x0009->B:24:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EDGE_INSN: B:25:0x0055->B:26:0x0055 BREAK  A[LOOP:0: B:2:0x0009->B:24:0x0079], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String chompBalanced(char r12, char r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r5 = r0
            r6 = r5
            r2 = r1
            r3 = r2
            r4 = r3
            r7 = r4
            r8 = r7
        L9:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L10
            goto L55
        L10:
            char r9 = r11.consume()
            r10 = 92
            if (r2 == r10) goto L42
            r10 = 39
            if (r9 != r10) goto L23
            if (r9 == r12) goto L23
            if (r3 != 0) goto L23
            r4 = r4 ^ 1
            goto L2d
        L23:
            r10 = 34
            if (r9 != r10) goto L2d
            if (r9 == r12) goto L2d
            if (r4 != 0) goto L2d
            r3 = r3 ^ 1
        L2d:
            if (r4 != 0) goto L53
            if (r3 != 0) goto L53
            if (r8 == 0) goto L34
            goto L53
        L34:
            if (r9 != r12) goto L3d
            int r7 = r7 + 1
            if (r5 != r0) goto L4d
            int r5 = r11.pos
            goto L4d
        L3d:
            if (r9 != r13) goto L4d
            int r7 = r7 + (-1)
            goto L4d
        L42:
            r10 = 81
            if (r9 != r10) goto L48
            r8 = 1
            goto L4d
        L48:
            r10 = 69
            if (r9 != r10) goto L4d
            r8 = r1
        L4d:
            if (r7 <= 0) goto L53
            if (r2 == 0) goto L53
            int r6 = r11.pos
        L53:
            if (r7 > 0) goto L79
        L55:
            if (r6 < 0) goto L5e
            java.lang.String r12 = r11.queue
            java.lang.String r12 = r12.substring(r5, r6)
            goto L60
        L5e:
            java.lang.String r12 = ""
        L60:
            if (r7 <= 0) goto L78
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Did not find balanced marker at '"
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r0 = "'"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            org.jsoup.helper.Validate.fail(r13)
        L78:
            return r12
        L79:
            r2 = r9
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.queue;
        int i6 = this.pos;
        this.pos = i6 + 1;
        return str.charAt(i6);
    }

    public String consumeCssIdentifier() {
        return consumeEscapedCssIdentifier(CssIdentifierChars);
    }

    public String consumeElementSelector() {
        return consumeEscapedCssIdentifier(ElementSelectorChars);
    }

    public String consumeTo(String str) {
        int indexOf = this.queue.indexOf(str, this.pos);
        if (indexOf == -1) {
            return remainder();
        }
        String substring = this.queue.substring(this.pos, indexOf);
        this.pos = substring.length() + this.pos;
        return substring;
    }

    public String consumeToAny(String... strArr) {
        int i6 = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i6, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int i6 = this.pos;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.queue.indexOf(substring, this.pos);
                int i7 = this.pos;
                int i8 = indexOf - i7;
                if (i8 == 0) {
                    this.pos = i7 + 1;
                } else if (i8 < 0) {
                    this.pos = this.queue.length();
                } else {
                    this.pos = i7 + i8;
                }
            } else {
                this.pos++;
            }
        }
        return this.queue.substring(i6, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z5 = false;
        while (matchesWhitespace()) {
            this.pos++;
            z5 = true;
        }
        return z5;
    }

    public String consumeWord() {
        int i6 = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i6, this.pos);
    }

    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos = str.length() + this.pos;
        return true;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos));
    }

    public String remainder() {
        String substring = this.queue.substring(this.pos);
        this.pos = this.queue.length();
        return substring;
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }

    public void consume(String str) {
        if (matches(str)) {
            int length = str.length();
            if (length <= remainingLength()) {
                this.pos += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c6 : cArr) {
            if (this.queue.charAt(this.pos) == c6) {
                return true;
            }
        }
        return false;
    }
}
