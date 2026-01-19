package M4;

import i4.AbstractC1117a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import u4.AbstractC1766d;
import w4.C1849a;

/* loaded from: classes.dex */
public final class C0 implements KSerializer {
    public static final C0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3421b = new g0("kotlin.uuid.Uuid", K4.e.f2958m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String concat;
        String m3 = decoder.m();
        AbstractC1276k.f(m3, "uuidString");
        int length = m3.length();
        if (length == 32) {
            long b5 = AbstractC1766d.b(0, 16, m3);
            long b6 = AbstractC1766d.b(16, 32, m3);
            if (b5 != 0 || b6 != 0) {
                return new C1849a(b5, b6);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (m3.length() <= 64) {
                    concat = m3;
                } else {
                    String substring = m3.substring(0, 64);
                    AbstractC1276k.e(substring, "substring(...)");
                    concat = substring.concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(m3.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long b7 = AbstractC1766d.b(0, 8, m3);
            AbstractC1117a.b(8, m3);
            long b8 = AbstractC1766d.b(9, 13, m3);
            AbstractC1117a.b(13, m3);
            long b9 = AbstractC1766d.b(14, 18, m3);
            AbstractC1117a.b(18, m3);
            long b10 = AbstractC1766d.b(19, 23, m3);
            AbstractC1117a.b(23, m3);
            long j3 = (b8 << 16) | (b7 << 32) | b9;
            long b11 = AbstractC1766d.b(24, 36, m3) | (b10 << 48);
            if (j3 != 0 || b11 != 0) {
                return new C1849a(j3, b11);
            }
        }
        return C1849a.f15435f;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3421b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1849a c1849a = (C1849a) obj;
        AbstractC1276k.f(c1849a, "value");
        encoder.o(c1849a.toString());
    }
}
