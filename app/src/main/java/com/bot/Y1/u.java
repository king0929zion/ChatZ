package y1;

import B0.H;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.nio.ByteBuffer;
import z1.C2016a;
import z1.C2017b;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f16003d = new ThreadLocal();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final H f16004b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f16005c = 0;

    public u(H h3, int i6) {
        this.f16004b = h3;
        this.a = i6;
    }

    public final int a(int i6) {
        C2016a b5 = b();
        int a = b5.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b5.f10524g;
        int i7 = a + b5.f10521c;
        return byteBuffer.getInt((i6 * 4) + byteBuffer.getInt(i7) + i7 + 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [Z3.e, java.lang.Object] */
    public final C2016a b() {
        ThreadLocal threadLocal = f16003d;
        C2016a c2016a = (C2016a) threadLocal.get();
        C2016a c2016a2 = c2016a;
        if (c2016a == null) {
            Z3.e eVar = new Z3.e();
            threadLocal.set(eVar);
            c2016a2 = eVar;
        }
        C2017b c2017b = (C2017b) this.f16004b.f391c;
        int a = c2017b.a(6);
        if (a != 0) {
            int i6 = a + c2017b.f10521c;
            int i7 = (this.a * 4) + ((ByteBuffer) c2017b.f10524g).getInt(i6) + i6 + 4;
            int i8 = ((ByteBuffer) c2017b.f10524g).getInt(i7) + i7;
            ByteBuffer byteBuffer = (ByteBuffer) c2017b.f10524g;
            c2016a2.f10524g = byteBuffer;
            if (byteBuffer != null) {
                c2016a2.f10521c = i8;
                int i9 = i8 - byteBuffer.getInt(i8);
                c2016a2.f10522e = i9;
                c2016a2.f10523f = ((ByteBuffer) c2016a2.f10524g).getShort(i9);
                return c2016a2;
            }
            c2016a2.f10521c = 0;
            c2016a2.f10522e = 0;
            c2016a2.f10523f = 0;
        }
        return c2016a2;
    }

    public final String toString() {
        int i6;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2016a b5 = b();
        int a = b5.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b5.f10524g).getInt(a + b5.f10521c) : 0));
        sb.append(", codepoints:");
        C2016a b6 = b();
        int a6 = b6.a(16);
        if (a6 != 0) {
            int i7 = a6 + b6.f10521c;
            i6 = ((ByteBuffer) b6.f10524g).getInt(((ByteBuffer) b6.f10524g).getInt(i7) + i7);
        } else {
            i6 = 0;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            sb.append(Integer.toHexString(a(i8)));
            sb.append(SequenceUtils.SPACE);
        }
        return sb.toString();
    }
}
