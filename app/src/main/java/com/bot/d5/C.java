package d5;

import java.io.EOFException;
import java.nio.ByteBuffer;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public final class C implements InterfaceC0951k {

    /* renamed from: c, reason: collision with root package name */
    public final I f11444c;

    /* renamed from: e, reason: collision with root package name */
    public final C0949i f11445e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11446f;

    /* JADX WARN: Type inference failed for: r2v1, types: [d5.i, java.lang.Object] */
    public C(I i6) {
        AbstractC1276k.f(i6, "source");
        this.f11444c = i6;
        this.f11445e = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [d5.i, java.lang.Object] */
    @Override // d5.InterfaceC0951k
    public final String A(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("limit < 0: ", j3).toString());
        }
        long j4 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long d6 = d((byte) 10, 0L, j4);
        C0949i c0949i = this.f11445e;
        if (d6 != -1) {
            return e5.a.a(d6, c0949i);
        }
        if (j4 < Long.MAX_VALUE && P(j4) && c0949i.h(j4 - 1) == 13 && P(j4 + 1) && c0949i.h(j4) == 10) {
            return e5.a.a(j4, c0949i);
        }
        ?? obj = new Object();
        c0949i.d(obj, 0L, Math.min(32, c0949i.f11482e));
        throw new EOFException("\\n not found: limit=" + Math.min(c0949i.f11482e, j3) + " content=" + obj.k(obj.f11482e).e() + (char) 8230);
    }

    @Override // d5.InterfaceC0951k
    public final long K(A a) {
        C0949i c0949i;
        long j3 = 0;
        while (true) {
            I i6 = this.f11444c;
            c0949i = this.f11445e;
            if (i6.W(8192L, c0949i) == -1) {
                break;
            }
            long c6 = c0949i.c();
            if (c6 > 0) {
                j3 += c6;
                a.T(c6, c0949i);
            }
        }
        long j4 = c0949i.f11482e;
        if (j4 <= 0) {
            return j3;
        }
        long j5 = j3 + j4;
        a.T(j4, c0949i);
        return j5;
    }

    @Override // d5.InterfaceC0951k
    public final boolean P(long j3) {
        C0949i c0949i;
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        if (this.f11446f) {
            throw new IllegalStateException("closed");
        }
        do {
            c0949i = this.f11445e;
            if (c0949i.f11482e >= j3) {
                return true;
            }
        } while (this.f11444c.W(8192L, c0949i) != -1);
        return false;
    }

    @Override // d5.InterfaceC0951k
    public final String R() {
        return A(Long.MAX_VALUE);
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        if (this.f11446f) {
            throw new IllegalStateException("closed");
        }
        C0949i c0949i2 = this.f11445e;
        if (c0949i2.f11482e == 0 && this.f11444c.W(8192L, c0949i2) == -1) {
            return -1L;
        }
        return c0949i2.W(Math.min(j3, c0949i2.f11482e), c0949i);
    }

    @Override // d5.InterfaceC0951k
    public final void a0(long j3) {
        if (!P(j3)) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        i4.AbstractC1120d.g(16);
        r1 = java.lang.Integer.toString(r2, 16);
        m4.AbstractC1276k.e(r1, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // d5.InterfaceC0951k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0() {
        /*
            r6 = this;
            r0 = 1
            r6.a0(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.P(r2)
            d5.i r3 = r6.f11445e
            if (r2 == 0) goto L4e
            long r4 = (long) r0
            byte r2 = r3.h(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            i4.AbstractC1120d.g(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(...)"
            m4.AbstractC1276k.e(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4e:
            long r0 = r3.b0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.C.b0():long");
    }

    public final boolean c() {
        if (this.f11446f) {
            throw new IllegalStateException("closed");
        }
        C0949i c0949i = this.f11445e;
        return c0949i.f() && this.f11444c.W(8192L, c0949i) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f11446f) {
            return;
        }
        this.f11446f = true;
        this.f11444c.close();
        C0949i c0949i = this.f11445e;
        c0949i.skip(c0949i.f11482e);
    }

    public final long d(byte b5, long j3, long j4) {
        if (this.f11446f) {
            throw new IllegalStateException("closed");
        }
        if (0 > j4) {
            throw new IllegalArgumentException(B3.e.m("fromIndex=0 toIndex=", j4).toString());
        }
        long j5 = 0;
        while (j5 < j4) {
            C0949i c0949i = this.f11445e;
            byte b6 = b5;
            long j6 = j4;
            long j7 = c0949i.j(b6, j5, j6);
            if (j7 == -1) {
                long j8 = c0949i.f11482e;
                if (j8 >= j6 || this.f11444c.W(8192L, c0949i) == -1) {
                    break;
                }
                j5 = Math.max(j5, j8);
                b5 = b6;
                j4 = j6;
            } else {
                return j7;
            }
        }
        return -1L;
    }

    public final int f() {
        a0(4L);
        int readInt = this.f11445e.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final long h() {
        long j3;
        a0(8L);
        C0949i c0949i = this.f11445e;
        if (c0949i.f11482e < 8) {
            throw new EOFException();
        }
        D d6 = c0949i.f11481c;
        AbstractC1276k.c(d6);
        int i6 = d6.f11447b;
        int i7 = d6.f11448c;
        if (i7 - i6 < 8) {
            j3 = ((c0949i.readInt() & 4294967295L) << 32) | (4294967295L & c0949i.readInt());
        } else {
            byte[] bArr = d6.a;
            int i8 = i6 + 7;
            long j4 = ((bArr[i6 + 1] & 255) << 48) | ((bArr[i6] & 255) << 56) | ((bArr[i6 + 2] & 255) << 40) | ((bArr[i6 + 3] & 255) << 32) | ((bArr[i6 + 4] & 255) << 24) | ((bArr[i6 + 5] & 255) << 16) | ((bArr[i6 + 6] & 255) << 8);
            int i9 = i6 + 8;
            long j5 = j4 | (bArr[i8] & 255);
            c0949i.f11482e -= 8;
            if (i9 == i7) {
                c0949i.f11481c = d6.a();
                E.a(d6);
            } else {
                d6.f11447b = i9;
            }
            j3 = j5;
        }
        return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f11446f;
    }

    public final short j() {
        a0(2L);
        return this.f11445e.s();
    }

    @Override // d5.InterfaceC0951k
    public final C0952l k(long j3) {
        a0(j3);
        return this.f11445e.k(j3);
    }

    public final String p(long j3) {
        a0(j3);
        C0949i c0949i = this.f11445e;
        c0949i.getClass();
        return c0949i.u(j3, AbstractC1763a.a);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1276k.f(byteBuffer, "sink");
        C0949i c0949i = this.f11445e;
        if (c0949i.f11482e == 0 && this.f11444c.W(8192L, c0949i) == -1) {
            return -1;
        }
        return c0949i.read(byteBuffer);
    }

    @Override // d5.InterfaceC0951k
    public final byte readByte() {
        a0(1L);
        return this.f11445e.readByte();
    }

    @Override // d5.InterfaceC0951k
    public final int readInt() {
        a0(4L);
        return this.f11445e.readInt();
    }

    @Override // d5.InterfaceC0951k
    public final short readShort() {
        a0(2L);
        return this.f11445e.readShort();
    }

    @Override // d5.InterfaceC0951k
    public final void skip(long j3) {
        if (this.f11446f) {
            throw new IllegalStateException("closed");
        }
        while (j3 > 0) {
            C0949i c0949i = this.f11445e;
            if (c0949i.f11482e == 0 && this.f11444c.W(8192L, c0949i) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j3, c0949i.f11482e);
            c0949i.skip(min);
            j3 -= min;
        }
    }

    @Override // d5.I
    public final K timeout() {
        return this.f11444c.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f11444c + ')';
    }

    @Override // d5.InterfaceC0951k
    public final C0949i x() {
        return this.f11445e;
    }
}
