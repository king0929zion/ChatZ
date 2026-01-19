package org.jsoup.helper;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.internal.ControllableInputStream;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: classes.dex */
public final class DataUtil {
    public static final Charset UTF_8;
    static final int boundaryLength = 32;
    private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    static final String defaultCharsetName;
    private static final int firstReadBufferSize = 5120;
    private static final char[] mimeBoundaryChars;

    /* loaded from: classes.dex */
    public static class BomCharset {
        private final String charset;
        private final boolean offset;

        public BomCharset(String str, boolean z5) {
            this.charset = str;
            this.offset = z5;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        UTF_8 = forName;
        defaultCharsetName = forName.name();
        mimeBoundaryChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    private DataUtil() {
    }

    public static void crossStreams(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[SharedConstants.DefaultBufferSize];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static BomCharset detectCharsetFromBom(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b5 = bArr[0];
        if ((b5 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b5 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new BomCharset("UTF-32", false);
        }
        if ((b5 == -2 && bArr[1] == -1) || (b5 == -1 && bArr[1] == -2)) {
            return new BomCharset("UTF-16", false);
        }
        if (b5 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new BomCharset("UTF-8", true);
        }
        return null;
    }

    public static ByteBuffer emptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }

    public static String getCharsetFromContentType(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = charsetPattern.matcher(str);
        if (matcher.find()) {
            return validateCharset(matcher.group(1).trim().replace("charset=", FlexmarkHtmlConverter.DEFAULT_NODE));
        }
        return null;
    }

    public static Document load(File file, String str, String str2) {
        return load(file, str, str2, Parser.htmlParser());
    }

    public static String mimeBoundary() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        Random random = new Random();
        for (int i6 = 0; i6 < 32; i6++) {
            char[] cArr = mimeBoundaryChars;
            borrowBuilder.append(cArr[random.nextInt(cArr.length)]);
        }
        return StringUtil.releaseBuilder(borrowBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.jsoup.nodes.Document parseInputStream(java.io.InputStream r17, java.lang.String r18, java.lang.String r19, org.jsoup.parser.Parser r20) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.parseInputStream(java.io.InputStream, java.lang.String, java.lang.String, org.jsoup.parser.Parser):org.jsoup.nodes.Document");
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i6) {
        return ControllableInputStream.readToByteBuffer(inputStream, i6);
    }

    private static String validateCharset(String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", FlexmarkHtmlConverter.DEFAULT_NODE);
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.jsoup.nodes.Document load(java.io.File r3, java.lang.String r4, java.lang.String r5, org.jsoup.parser.Parser r6) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.lang.String r1 = r3.getName()
            java.lang.String r1 = org.jsoup.internal.Normalizer.lowerCase(r1)
            java.lang.String r2 = ".gz"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L1d
            java.lang.String r2 = ".z"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L47
        L1d:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L2f
            r2 = 31
            if (r1 != r2) goto L31
            int r1 = r0.read()     // Catch: java.lang.Throwable -> L2f
            r2 = 139(0x8b, float:1.95E-43)
            if (r1 != r2) goto L31
            r1 = 1
            goto L32
        L2f:
            r3 = move-exception
            goto L4c
        L31:
            r1 = 0
        L32:
            r0.close()
            if (r1 == 0) goto L42
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r3)
            r0.<init>(r1)
            goto L47
        L42:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
        L47:
            org.jsoup.nodes.Document r3 = parseInputStream(r0, r4, r5, r6)
            return r3
        L4c:
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.DataUtil.load(java.io.File, java.lang.String, java.lang.String, org.jsoup.parser.Parser):org.jsoup.nodes.Document");
    }

    public static Document load(InputStream inputStream, String str, String str2) {
        return parseInputStream(inputStream, str, str2, Parser.htmlParser());
    }

    public static Document load(InputStream inputStream, String str, String str2, Parser parser) {
        return parseInputStream(inputStream, str, str2, parser);
    }
}
