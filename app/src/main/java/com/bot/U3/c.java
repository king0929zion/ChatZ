package U3;

import com.vladsch.flexmark.parser.PegdownExtensions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public final class c implements Appendable, Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final W3.e f8667c;

    /* renamed from: e, reason: collision with root package name */
    public V3.b f8668e;

    /* renamed from: f, reason: collision with root package name */
    public V3.b f8669f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f8670g;

    /* renamed from: h, reason: collision with root package name */
    public int f8671h;

    /* renamed from: i, reason: collision with root package name */
    public int f8672i;

    /* renamed from: j, reason: collision with root package name */
    public int f8673j;

    /* renamed from: k, reason: collision with root package name */
    public int f8674k;

    public c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V3.b.f8801i;
        g gVar = b.a;
        AbstractC1276k.f(gVar, "pool");
        this.f8667c = gVar;
        this.f8670g = S3.b.a;
    }

    public final void c() {
        V3.b bVar = this.f8669f;
        if (bVar != null) {
            this.f8671h = bVar.f8663c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        W3.e eVar = this.f8667c;
        V3.b j3 = j();
        if (j3 == null) {
            return;
        }
        V3.b bVar = j3;
        do {
            try {
                AbstractC1276k.f(bVar.a, "source");
                bVar = bVar.h();
            } finally {
                AbstractC1276k.f(eVar, "pool");
                while (j3 != null) {
                    V3.b f6 = j3.f();
                    j3.j(eVar);
                    j3 = f6;
                }
            }
        } while (bVar != null);
    }

    @Override // java.lang.Appendable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final c append(CharSequence charSequence, int i6, int i7) {
        if (charSequence == null) {
            return append("null", i6, i7);
        }
        Charset charset = AbstractC1763a.a;
        AbstractC1276k.f(charSequence, "text");
        AbstractC1276k.f(charset, "charset");
        if (charset == AbstractC1763a.a) {
            V3.b f6 = V3.c.f(this, 1, null);
            int i8 = i6;
            while (true) {
                try {
                    CharSequence charSequence2 = charSequence;
                    int i9 = i7;
                    int b5 = V3.c.b(f6.a, charSequence2, i8, i9, f6.f8663c, f6.f8665e);
                    int i10 = ((short) (b5 >>> 16)) & 65535;
                    i8 += i10;
                    f6.a(((short) (b5 & 65535)) & 65535);
                    int i11 = (i10 != 0 || i8 >= i9) ? i8 < i9 ? 1 : 0 : 8;
                    if (i11 <= 0) {
                        break;
                    }
                    f6 = V3.c.f(this, i11, f6);
                    charSequence = charSequence2;
                    i7 = i9;
                } finally {
                    c();
                }
            }
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            AbstractC1276k.e(newEncoder, "charset.newEncoder()");
            Y4.d.C(newEncoder, this, charSequence, i6, i7);
        }
        return this;
    }

    public final d f() {
        int i6 = (this.f8671h - this.f8673j) + this.f8674k;
        V3.b j3 = j();
        if (j3 != null) {
            return new d(j3, i6, this.f8667c);
        }
        d dVar = d.f8675k;
        return d.f8675k;
    }

    public final V3.b h(int i6) {
        V3.b bVar;
        int i7 = this.f8672i;
        int i8 = this.f8671h;
        if (i7 - i8 >= i6 && (bVar = this.f8669f) != null) {
            bVar.b(i8);
            return bVar;
        }
        V3.b bVar2 = (V3.b) this.f8667c.v();
        bVar2.e();
        if (bVar2.h() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        V3.b bVar3 = this.f8669f;
        if (bVar3 == null) {
            this.f8668e = bVar2;
            this.f8674k = 0;
        } else {
            bVar3.l(bVar2);
            int i9 = this.f8671h;
            bVar3.b(i9);
            this.f8674k = (i9 - this.f8673j) + this.f8674k;
        }
        this.f8669f = bVar2;
        this.f8674k = this.f8674k;
        this.f8670g = bVar2.a;
        this.f8671h = bVar2.f8663c;
        this.f8673j = bVar2.f8662b;
        this.f8672i = bVar2.f8665e;
        return bVar2;
    }

    public final V3.b j() {
        V3.b bVar = this.f8668e;
        if (bVar == null) {
            return null;
        }
        V3.b bVar2 = this.f8669f;
        if (bVar2 != null) {
            bVar2.b(this.f8671h);
        }
        this.f8668e = null;
        this.f8669f = null;
        this.f8671h = 0;
        this.f8672i = 0;
        this.f8673j = 0;
        this.f8674k = 0;
        this.f8670g = S3.b.a;
        return bVar;
    }

    public final String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) {
        int i6 = this.f8671h;
        int i7 = 4;
        if (this.f8672i - i6 >= 3) {
            ByteBuffer byteBuffer = this.f8670g;
            if (c6 >= 0 && c6 < 128) {
                byteBuffer.put(i6, (byte) c6);
                i7 = 1;
            } else if (128 <= c6 && c6 < 2048) {
                byteBuffer.put(i6, (byte) (((c6 >> 6) & 31) | 192));
                byteBuffer.put(i6 + 1, (byte) ((c6 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS));
                i7 = 2;
            } else if (2048 <= c6 && c6 < 0) {
                byteBuffer.put(i6, (byte) (((c6 >> '\f') & 15) | 224));
                byteBuffer.put(i6 + 1, (byte) (((c6 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS));
                byteBuffer.put(i6 + 2, (byte) ((c6 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS));
                i7 = 3;
            } else {
                if (0 > c6 || c6 >= 0) {
                    V3.c.c(c6);
                    throw null;
                }
                byteBuffer.put(i6, (byte) (((c6 >> 18) & 7) | 240));
                byteBuffer.put(i6 + 1, (byte) (((c6 >> '\f') & 63) | PegdownExtensions.FENCED_CODE_BLOCKS));
                byteBuffer.put(i6 + 2, (byte) (((c6 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS));
                byteBuffer.put(i6 + 3, (byte) ((c6 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS));
            }
            this.f8671h = i6 + i7;
            return this;
        }
        V3.b h3 = h(3);
        try {
            ByteBuffer byteBuffer2 = h3.a;
            int i8 = h3.f8663c;
            if (c6 >= 0 && c6 < 128) {
                byteBuffer2.put(i8, (byte) c6);
                i7 = 1;
            } else if (128 <= c6 && c6 < 2048) {
                byteBuffer2.put(i8, (byte) (((c6 >> 6) & 31) | 192));
                byteBuffer2.put(i8 + 1, (byte) ((c6 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS));
                i7 = 2;
            } else if (2048 <= c6 && c6 < 0) {
                byteBuffer2.put(i8, (byte) (((c6 >> '\f') & 15) | 224));
                byteBuffer2.put(i8 + 1, (byte) (((c6 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS));
                byteBuffer2.put(i8 + 2, (byte) ((c6 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS));
                i7 = 3;
            } else {
                if (0 > c6 || c6 >= 0) {
                    V3.c.c(c6);
                    throw null;
                }
                byteBuffer2.put(i8, (byte) (((c6 >> 18) & 7) | 240));
                byteBuffer2.put(i8 + 1, (byte) (((c6 >> '\f') & 63) | PegdownExtensions.FENCED_CODE_BLOCKS));
                byteBuffer2.put(i8 + 2, (byte) (((c6 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS));
                byteBuffer2.put(i8 + 3, (byte) ((c6 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS));
            }
            h3.a(i7);
            if (i7 >= 0) {
                c();
                return this;
            }
            throw new IllegalStateException("The returned value shouldn't be negative");
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
