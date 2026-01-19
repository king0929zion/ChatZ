package org.jsoup.parser;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

/* loaded from: classes.dex */
public final class CharacterReader {
    static final char EOF = 65535;
    static final int maxBufferLen = 32768;
    private static final int maxStringCacheLen = 12;
    private static final int minReadAheadLen = 1024;
    static final int readAheadLimit = 24576;
    private static final int stringCacheSize = 512;
    private int bufLength;
    private int bufMark;
    private int bufPos;
    private int bufSplitPoint;
    private char[] charBuf;
    private int lastIcIndex;
    private String lastIcSeq;
    private int lineNumberOffset;
    private ArrayList<Integer> newlinePositions;
    private boolean readFully;
    private Reader reader;
    private int readerPos;
    private String[] stringCache;

    public CharacterReader(Reader reader, int i6) {
        this.bufMark = -1;
        this.stringCache = new String[512];
        this.newlinePositions = null;
        this.lineNumberOffset = 1;
        Validate.notNull(reader);
        Validate.isTrue(reader.markSupported());
        this.reader = reader;
        this.charBuf = new char[Math.min(i6, 32768)];
        bufferUp();
    }

    private void bufferUp() {
        int i6;
        int i7;
        boolean z5;
        if (this.readFully || (i6 = this.bufPos) < this.bufSplitPoint) {
            return;
        }
        int i8 = this.bufMark;
        if (i8 != -1) {
            i7 = i6 - i8;
            i6 = i8;
        } else {
            i7 = 0;
        }
        try {
            long j3 = i6;
            long skip = this.reader.skip(j3);
            this.reader.mark(32768);
            int i9 = 0;
            while (true) {
                z5 = true;
                if (i9 > 1024) {
                    break;
                }
                Reader reader = this.reader;
                char[] cArr = this.charBuf;
                int read = reader.read(cArr, i9, cArr.length - i9);
                if (read == -1) {
                    this.readFully = true;
                }
                if (read <= 0) {
                    break;
                } else {
                    i9 += read;
                }
            }
            this.reader.reset();
            if (i9 > 0) {
                if (skip != j3) {
                    z5 = false;
                }
                Validate.isTrue(z5);
                this.bufLength = i9;
                this.readerPos += i6;
                this.bufPos = i7;
                if (this.bufMark != -1) {
                    this.bufMark = 0;
                }
                this.bufSplitPoint = Math.min(i9, readAheadLimit);
            }
            scanBufferForNewlines();
            this.lastIcSeq = null;
        } catch (IOException e6) {
            throw new UncheckedIOException(e6);
        }
    }

    private static String cacheString(char[] cArr, String[] strArr, int i6, int i7) {
        if (i7 > maxStringCacheLen) {
            return new String(cArr, i6, i7);
        }
        if (i7 < 1) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + cArr[i6 + i9];
        }
        int i10 = i8 & 511;
        String str = strArr[i10];
        if (str != null && rangeEquals(cArr, i6, i7, str)) {
            return str;
        }
        String str2 = new String(cArr, i6, i7);
        strArr[i10] = str2;
        return str2;
    }

    private boolean isEmptyNoBufferUp() {
        return this.bufPos >= this.bufLength;
    }

    private int lineNumIndex(int i6) {
        if (!isTrackNewlines()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.newlinePositions, Integer.valueOf(i6));
        return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
    }

    public static boolean rangeEquals(char[] cArr, int i6, int i7, String str) {
        if (i7 != str.length()) {
            return false;
        }
        int i8 = 0;
        while (true) {
            int i9 = i7 - 1;
            if (i7 == 0) {
                return true;
            }
            int i10 = i6 + 1;
            int i11 = i8 + 1;
            if (cArr[i6] != str.charAt(i8)) {
                return false;
            }
            i6 = i10;
            i7 = i9;
            i8 = i11;
        }
    }

    private void scanBufferForNewlines() {
        if (isTrackNewlines()) {
            if (this.newlinePositions.size() > 0) {
                int lineNumIndex = lineNumIndex(this.readerPos);
                if (lineNumIndex == -1) {
                    lineNumIndex = 0;
                }
                Integer num = this.newlinePositions.get(lineNumIndex);
                num.intValue();
                this.lineNumberOffset += lineNumIndex;
                this.newlinePositions.clear();
                this.newlinePositions.add(num);
            }
            for (int i6 = this.bufPos; i6 < this.bufLength; i6++) {
                if (this.charBuf[i6] == '\n') {
                    this.newlinePositions.add(Integer.valueOf(this.readerPos + 1 + i6));
                }
            }
        }
    }

    public void advance() {
        this.bufPos++;
    }

    public void close() {
        Reader reader = this.reader;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.reader = null;
            this.charBuf = null;
            this.stringCache = null;
            throw th;
        }
        this.reader = null;
        this.charBuf = null;
        this.stringCache = null;
    }

    public int columnNumber() {
        return columnNumber(pos());
    }

    public char consume() {
        bufferUp();
        char c6 = isEmptyNoBufferUp() ? EOF : this.charBuf[this.bufPos];
        this.bufPos++;
        return c6;
    }

    public String consumeAttributeQuoted(boolean z5) {
        int i6 = this.bufPos;
        int i7 = this.bufLength;
        char[] cArr = this.charBuf;
        int i8 = i6;
        while (i8 < i7) {
            char c6 = cArr[i8];
            if (c6 == 0) {
                break;
            }
            if (c6 != '\"') {
                if (c6 == '&') {
                    break;
                }
                if (c6 == '\'' && z5) {
                    break;
                }
                i8++;
            } else {
                if (!z5) {
                    break;
                }
                i8++;
            }
        }
        this.bufPos = i8;
        return i8 > i6 ? cacheString(this.charBuf, this.stringCache, i6, i8 - i6) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public String consumeData() {
        int i6 = this.bufPos;
        int i7 = this.bufLength;
        char[] cArr = this.charBuf;
        int i8 = i6;
        while (i8 < i7) {
            char c6 = cArr[i8];
            if (c6 == 0 || c6 == '&' || c6 == '<') {
                break;
            }
            i8++;
        }
        this.bufPos = i8;
        return i8 > i6 ? cacheString(this.charBuf, this.stringCache, i6, i8 - i6) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public String consumeDigitSequence() {
        int i6;
        char c6;
        bufferUp();
        int i7 = this.bufPos;
        while (true) {
            i6 = this.bufPos;
            if (i6 >= this.bufLength || (c6 = this.charBuf[i6]) < '0' || c6 > '9') {
                break;
            }
            this.bufPos = i6 + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i7, i6 - i7);
    }

    public String consumeHexSequence() {
        int i6;
        char c6;
        bufferUp();
        int i7 = this.bufPos;
        while (true) {
            i6 = this.bufPos;
            if (i6 >= this.bufLength || (((c6 = this.charBuf[i6]) < '0' || c6 > '9') && ((c6 < 'A' || c6 > 'F') && (c6 < 'a' || c6 > 'f')))) {
                break;
            }
            this.bufPos = i6 + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i7, i6 - i7);
    }

    public String consumeLetterSequence() {
        char c6;
        bufferUp();
        int i6 = this.bufPos;
        while (true) {
            int i7 = this.bufPos;
            if (i7 >= this.bufLength || (((c6 = this.charBuf[i7]) < 'A' || c6 > 'Z') && ((c6 < 'a' || c6 > 'z') && !Character.isLetter(c6)))) {
                break;
            }
            this.bufPos++;
        }
        return cacheString(this.charBuf, this.stringCache, i6, this.bufPos - i6);
    }

    public String consumeLetterThenDigitSequence() {
        char c6;
        bufferUp();
        int i6 = this.bufPos;
        while (true) {
            int i7 = this.bufPos;
            if (i7 >= this.bufLength || (((c6 = this.charBuf[i7]) < 'A' || c6 > 'Z') && ((c6 < 'a' || c6 > 'z') && !Character.isLetter(c6)))) {
                break;
            }
            this.bufPos++;
        }
        while (!isEmptyNoBufferUp()) {
            char[] cArr = this.charBuf;
            int i8 = this.bufPos;
            char c7 = cArr[i8];
            if (c7 < '0' || c7 > '9') {
                break;
            }
            this.bufPos = i8 + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i6, this.bufPos - i6);
    }

    public String consumeRawData() {
        int i6 = this.bufPos;
        int i7 = this.bufLength;
        char[] cArr = this.charBuf;
        int i8 = i6;
        while (i8 < i7) {
            char c6 = cArr[i8];
            if (c6 == 0 || c6 == '<') {
                break;
            }
            i8++;
        }
        this.bufPos = i8;
        return i8 > i6 ? cacheString(this.charBuf, this.stringCache, i6, i8 - i6) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public String consumeTagName() {
        bufferUp();
        int i6 = this.bufPos;
        int i7 = this.bufLength;
        char[] cArr = this.charBuf;
        int i8 = i6;
        while (i8 < i7) {
            char c6 = cArr[i8];
            if (c6 == '\t' || c6 == '\n' || c6 == maxStringCacheLen || c6 == '\r' || c6 == ' ' || c6 == '/' || c6 == '<' || c6 == '>') {
                break;
            }
            i8++;
        }
        this.bufPos = i8;
        return i8 > i6 ? cacheString(this.charBuf, this.stringCache, i6, i8 - i6) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public String consumeTo(char c6) {
        int nextIndexOf = nextIndexOf(c6);
        if (nextIndexOf != -1) {
            String cacheString = cacheString(this.charBuf, this.stringCache, this.bufPos, nextIndexOf);
            this.bufPos += nextIndexOf;
            return cacheString;
        }
        return consumeToEnd();
    }

    public String consumeToAny(char... cArr) {
        bufferUp();
        int i6 = this.bufPos;
        int i7 = this.bufLength;
        char[] cArr2 = this.charBuf;
        int i8 = i6;
        loop0: while (i8 < i7) {
            for (char c6 : cArr) {
                if (cArr2[i8] == c6) {
                    break loop0;
                }
            }
            i8++;
        }
        this.bufPos = i8;
        return i8 > i6 ? cacheString(this.charBuf, this.stringCache, i6, i8 - i6) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public String consumeToAnySorted(char... cArr) {
        bufferUp();
        int i6 = this.bufPos;
        int i7 = this.bufLength;
        char[] cArr2 = this.charBuf;
        int i8 = i6;
        while (i8 < i7 && Arrays.binarySearch(cArr, cArr2[i8]) < 0) {
            i8++;
        }
        this.bufPos = i8;
        return i8 > i6 ? cacheString(this.charBuf, this.stringCache, i6, i8 - i6) : FlexmarkHtmlConverter.DEFAULT_NODE;
    }

    public String consumeToEnd() {
        bufferUp();
        char[] cArr = this.charBuf;
        String[] strArr = this.stringCache;
        int i6 = this.bufPos;
        String cacheString = cacheString(cArr, strArr, i6, this.bufLength - i6);
        this.bufPos = this.bufLength;
        return cacheString;
    }

    public boolean containsIgnoreCase(String str) {
        if (str.equals(this.lastIcSeq)) {
            int i6 = this.lastIcIndex;
            if (i6 == -1) {
                return false;
            }
            if (i6 >= this.bufPos) {
                return true;
            }
        }
        this.lastIcSeq = str;
        Locale locale = Locale.ENGLISH;
        int nextIndexOf = nextIndexOf(str.toLowerCase(locale));
        if (nextIndexOf > -1) {
            this.lastIcIndex = this.bufPos + nextIndexOf;
            return true;
        }
        int nextIndexOf2 = nextIndexOf(str.toUpperCase(locale));
        boolean z5 = nextIndexOf2 > -1;
        this.lastIcIndex = z5 ? this.bufPos + nextIndexOf2 : -1;
        return z5;
    }

    public char current() {
        bufferUp();
        return isEmptyNoBufferUp() ? EOF : this.charBuf[this.bufPos];
    }

    public boolean isEmpty() {
        bufferUp();
        return this.bufPos >= this.bufLength;
    }

    public boolean isTrackNewlines() {
        return this.newlinePositions != null;
    }

    public int lineNumber() {
        return lineNumber(pos());
    }

    public void mark() {
        if (this.bufLength - this.bufPos < 1024) {
            this.bufSplitPoint = 0;
        }
        bufferUp();
        this.bufMark = this.bufPos;
    }

    public boolean matchConsume(String str) {
        bufferUp();
        if (!matches(str)) {
            return false;
        }
        this.bufPos = str.length() + this.bufPos;
        return true;
    }

    public boolean matchConsumeIgnoreCase(String str) {
        if (!matchesIgnoreCase(str)) {
            return false;
        }
        this.bufPos = str.length() + this.bufPos;
        return true;
    }

    public boolean matches(char c6) {
        return !isEmpty() && this.charBuf[this.bufPos] == c6;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        bufferUp();
        char c6 = this.charBuf[this.bufPos];
        for (char c7 : cArr) {
            if (c7 == c6) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArr) {
        bufferUp();
        return !isEmpty() && Arrays.binarySearch(cArr, this.charBuf[this.bufPos]) >= 0;
    }

    public boolean matchesAsciiAlpha() {
        if (isEmpty()) {
            return false;
        }
        char c6 = this.charBuf[this.bufPos];
        if (c6 < 'A' || c6 > 'Z') {
            return c6 >= 'a' && c6 <= 'z';
        }
        return true;
    }

    public boolean matchesDigit() {
        char c6;
        return !isEmpty() && (c6 = this.charBuf[this.bufPos]) >= '0' && c6 <= '9';
    }

    public boolean matchesIgnoreCase(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.bufLength - this.bufPos) {
            return false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (Character.toUpperCase(str.charAt(i6)) != Character.toUpperCase(this.charBuf[this.bufPos + i6])) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c6 = this.charBuf[this.bufPos];
        if (c6 < 'A' || c6 > 'Z') {
            return (c6 >= 'a' && c6 <= 'z') || Character.isLetter(c6);
        }
        return true;
    }

    public int nextIndexOf(char c6) {
        bufferUp();
        for (int i6 = this.bufPos; i6 < this.bufLength; i6++) {
            if (c6 == this.charBuf[i6]) {
                return i6 - this.bufPos;
            }
        }
        return -1;
    }

    public int pos() {
        return this.readerPos + this.bufPos;
    }

    public String posLineCol() {
        return lineNumber() + ":" + columnNumber();
    }

    public boolean readFully() {
        return this.readFully;
    }

    public void rewindToMark() {
        int i6 = this.bufMark;
        if (i6 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.bufPos = i6;
        unmark();
    }

    public String toString() {
        int i6 = this.bufLength;
        int i7 = this.bufPos;
        return i6 - i7 < 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : new String(this.charBuf, i7, i6 - i7);
    }

    public void trackNewlines(boolean z5) {
        if (z5 && this.newlinePositions == null) {
            this.newlinePositions = new ArrayList<>(409);
            scanBufferForNewlines();
        } else {
            if (z5) {
                return;
            }
            this.newlinePositions = null;
        }
    }

    public void unconsume() {
        int i6 = this.bufPos;
        if (i6 < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.bufPos = i6 - 1;
    }

    public void unmark() {
        this.bufMark = -1;
    }

    public int columnNumber(int i6) {
        int lineNumIndex;
        if (isTrackNewlines() && (lineNumIndex = lineNumIndex(i6)) != -1) {
            return (i6 - this.newlinePositions.get(lineNumIndex).intValue()) + 1;
        }
        return i6 + 1;
    }

    public int lineNumber(int i6) {
        if (!isTrackNewlines()) {
            return 1;
        }
        int lineNumIndex = lineNumIndex(i6);
        if (lineNumIndex == -1) {
            return this.lineNumberOffset;
        }
        return lineNumIndex + this.lineNumberOffset + 1;
    }

    public boolean matches(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.bufLength - this.bufPos) {
            return false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (str.charAt(i6) != this.charBuf[this.bufPos + i6]) {
                return false;
            }
        }
        return true;
    }

    public boolean rangeEquals(int i6, int i7, String str) {
        return rangeEquals(this.charBuf, i6, i7, str);
    }

    public String consumeTo(String str) {
        int nextIndexOf = nextIndexOf(str);
        if (nextIndexOf != -1) {
            String cacheString = cacheString(this.charBuf, this.stringCache, this.bufPos, nextIndexOf);
            this.bufPos += nextIndexOf;
            return cacheString;
        }
        if (this.bufLength - this.bufPos < str.length()) {
            return consumeToEnd();
        }
        int length = (this.bufLength - str.length()) + 1;
        char[] cArr = this.charBuf;
        String[] strArr = this.stringCache;
        int i6 = this.bufPos;
        String cacheString2 = cacheString(cArr, strArr, i6, length - i6);
        this.bufPos = length;
        return cacheString2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2 = r1 + 1;
        r4 = (r9.length() + r2) - 1;
        r5 = r8.bufLength;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 >= r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 > r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 >= r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r9.charAt(r3) != r8.charBuf[r5]) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r5 = r5 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return r1 - r8.bufPos;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 != r8.charBuf[r1]) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 >= r8.bufLength) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 == r8.charBuf[r1]) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int nextIndexOf(java.lang.CharSequence r9) {
        /*
            r8 = this;
            r8.bufferUp()
            r0 = 0
            char r0 = r9.charAt(r0)
            int r1 = r8.bufPos
        La:
            int r2 = r8.bufLength
            if (r1 >= r2) goto L49
            char[] r2 = r8.charBuf
            char r2 = r2[r1]
            r3 = 1
            if (r0 == r2) goto L21
        L15:
            int r1 = r1 + r3
            int r2 = r8.bufLength
            if (r1 >= r2) goto L21
            char[] r2 = r8.charBuf
            char r2 = r2[r1]
            if (r0 == r2) goto L21
            goto L15
        L21:
            int r2 = r1 + 1
            int r4 = r9.length()
            int r4 = r4 + r2
            int r4 = r4 - r3
            int r5 = r8.bufLength
            if (r1 >= r5) goto L47
            if (r4 > r5) goto L47
            r5 = r2
        L30:
            if (r5 >= r4) goto L41
            char r6 = r9.charAt(r3)
            char[] r7 = r8.charBuf
            char r7 = r7[r5]
            if (r6 != r7) goto L41
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L30
        L41:
            if (r5 != r4) goto L47
            int r9 = r8.bufPos
            int r1 = r1 - r9
            return r1
        L47:
            r1 = r2
            goto La
        L49:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence):int");
    }

    public CharacterReader(Reader reader) {
        this(reader, 32768);
    }

    public CharacterReader(String str) {
        this(new StringReader(str), str.length());
    }
}
