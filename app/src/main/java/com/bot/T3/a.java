package T3;

import Y3.C;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public static final CharBuffer a = CharBuffer.allocate(0);

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f8515b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        AbstractC1276k.c(allocate);
        f8515b = allocate;
    }

    public static final boolean a(CharsetEncoder charsetEncoder, V3.b bVar) {
        ByteBuffer byteBuffer = bVar.a;
        int i6 = bVar.f8663c;
        int i7 = bVar.f8665e - i6;
        ByteBuffer byteBuffer2 = S3.b.a;
        ByteBuffer S5 = C.S(byteBuffer, i6, i7);
        CoderResult encode = charsetEncoder.encode(a, S5, true);
        if (encode.isMalformed() || encode.isUnmappable()) {
            e(encode);
        }
        boolean isUnderflow = encode.isUnderflow();
        if (S5.limit() != i7) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        bVar.a(S5.position());
        return isUnderflow;
    }

    public static final int b(CharsetEncoder charsetEncoder, CharSequence charSequence, int i6, int i7, V3.b bVar) {
        AbstractC1276k.f(charSequence, FlexmarkHtmlConverter.INPUT_NODE);
        CharBuffer wrap = CharBuffer.wrap(charSequence, i6, i7);
        int remaining = wrap.remaining();
        ByteBuffer byteBuffer = bVar.a;
        int i8 = bVar.f8663c;
        int i9 = bVar.f8665e - i8;
        ByteBuffer byteBuffer2 = S3.b.a;
        ByteBuffer S5 = C.S(byteBuffer, i8, i9);
        CoderResult encode = charsetEncoder.encode(wrap, S5, false);
        if (encode.isMalformed() || encode.isUnmappable()) {
            e(encode);
        }
        if (S5.limit() != i9) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        bVar.a(S5.position());
        return remaining - wrap.remaining();
    }

    public static final byte[] c(CharsetEncoder charsetEncoder, String str, int i6) {
        AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
        if (i6 == str.length()) {
            byte[] bytes = str.getBytes(charsetEncoder.charset());
            AbstractC1276k.e(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String substring = str.substring(0, i6);
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
        AbstractC1276k.e(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    public static final String d(Charset charset) {
        AbstractC1276k.f(charset, "<this>");
        String name = charset.name();
        AbstractC1276k.e(name, "name()");
        return name;
    }

    public static final void e(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new b(message);
        }
    }
}
