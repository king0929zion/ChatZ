package d5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class s implements I {

    /* renamed from: c, reason: collision with root package name */
    public byte f11500c;

    /* renamed from: e, reason: collision with root package name */
    public final C f11501e;

    /* renamed from: f, reason: collision with root package name */
    public final Inflater f11502f;

    /* renamed from: g, reason: collision with root package name */
    public final t f11503g;

    /* renamed from: h, reason: collision with root package name */
    public final CRC32 f11504h;

    public s(I i6) {
        AbstractC1276k.f(i6, "source");
        C c6 = new C(i6);
        this.f11501e = c6;
        Inflater inflater = new Inflater(true);
        this.f11502f = inflater;
        this.f11503g = new t(c6, inflater);
        this.f11504h = new CRC32();
    }

    public static void c(int i6, int i7, String str) {
        if (i7 == i6) {
            return;
        }
        throw new IOException(str + ": actual 0x" + AbstractC1776n.V(8, AbstractC0942b.j(i7)) + " != expected 0x" + AbstractC1776n.V(8, AbstractC0942b.j(i6)));
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        s sVar = this;
        AbstractC1276k.f(c0949i, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        if (j3 == 0) {
            return 0L;
        }
        byte b5 = sVar.f11500c;
        CRC32 crc32 = sVar.f11504h;
        C c6 = sVar.f11501e;
        if (b5 == 0) {
            c6.a0(10L);
            C0949i c0949i2 = c6.f11445e;
            byte h3 = c0949i2.h(3L);
            boolean z5 = ((h3 >> 1) & 1) == 1;
            if (z5) {
                sVar.d(c0949i2, 0L, 10L);
            }
            c(8075, c6.readShort(), "ID1ID2");
            c6.skip(8L);
            if (((h3 >> 2) & 1) == 1) {
                c6.a0(2L);
                if (z5) {
                    d(c0949i2, 0L, 2L);
                }
                long s5 = c0949i2.s() & 65535;
                c6.a0(s5);
                if (z5) {
                    d(c0949i2, 0L, s5);
                }
                c6.skip(s5);
            }
            if (((h3 >> 3) & 1) == 1) {
                long d6 = c6.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d6 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    d(c0949i2, 0L, d6 + 1);
                }
                c6.skip(d6 + 1);
            }
            if (((h3 >> 4) & 1) == 1) {
                long d7 = c6.d((byte) 0, 0L, Long.MAX_VALUE);
                if (d7 == -1) {
                    throw new EOFException();
                }
                if (z5) {
                    sVar = this;
                    sVar.d(c0949i2, 0L, d7 + 1);
                } else {
                    sVar = this;
                }
                c6.skip(d7 + 1);
            } else {
                sVar = this;
            }
            if (z5) {
                c(c6.j(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            sVar.f11500c = (byte) 1;
        }
        if (sVar.f11500c == 1) {
            long j4 = c0949i.f11482e;
            long W5 = sVar.f11503g.W(j3, c0949i);
            if (W5 != -1) {
                sVar.d(c0949i, j4, W5);
                return W5;
            }
            sVar.f11500c = (byte) 2;
        }
        if (sVar.f11500c == 2) {
            c(c6.f(), (int) crc32.getValue(), "CRC");
            c(c6.f(), (int) sVar.f11502f.getBytesWritten(), "ISIZE");
            sVar.f11500c = (byte) 3;
            if (!c6.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11503g.close();
    }

    public final void d(C0949i c0949i, long j3, long j4) {
        D d6 = c0949i.f11481c;
        AbstractC1276k.c(d6);
        while (true) {
            int i6 = d6.f11448c;
            int i7 = d6.f11447b;
            if (j3 < i6 - i7) {
                break;
            }
            j3 -= i6 - i7;
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
        }
        while (j4 > 0) {
            int min = (int) Math.min(d6.f11448c - r6, j4);
            this.f11504h.update(d6.a, (int) (d6.f11447b + j3), min);
            j4 -= min;
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
            j3 = 0;
        }
    }

    @Override // d5.I
    public final K timeout() {
        return this.f11501e.f11444c.timeout();
    }
}
