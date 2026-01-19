package d5;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import j1.AbstractC1135a;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* renamed from: d5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949i implements InterfaceC0951k, InterfaceC0950j, Cloneable, ByteChannel {

    /* renamed from: c, reason: collision with root package name */
    public D f11481c;

    /* renamed from: e, reason: collision with root package name */
    public long f11482e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [d5.i, java.lang.Object] */
    @Override // d5.InterfaceC0951k
    public final String A(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("limit < 0: ", j3).toString());
        }
        long j4 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
        long j5 = j((byte) 10, 0L, j4);
        if (j5 != -1) {
            return e5.a.a(j5, this);
        }
        if (j4 < this.f11482e && h(j4 - 1) == 13 && h(j4) == 10) {
            return e5.a.a(j4, this);
        }
        ?? obj = new Object();
        d(obj, 0L, Math.min(32, this.f11482e));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f11482e, j3) + " content=" + obj.k(obj.f11482e).e() + (char) 8230);
    }

    public final C0952l E(int i6) {
        if (i6 == 0) {
            return C0952l.f11483g;
        }
        AbstractC0942b.e(this.f11482e, 0L, i6);
        D d6 = this.f11481c;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            AbstractC1276k.c(d6);
            int i10 = d6.f11448c;
            int i11 = d6.f11447b;
            if (i10 == i11) {
                throw new AssertionError("s.limit == s.pos");
            }
            i8 += i10 - i11;
            i9++;
            d6 = d6.f11451f;
        }
        byte[][] bArr = new byte[i9];
        int[] iArr = new int[i9 * 2];
        D d7 = this.f11481c;
        int i12 = 0;
        while (i7 < i6) {
            AbstractC1276k.c(d7);
            bArr[i12] = d7.a;
            i7 += d7.f11448c - d7.f11447b;
            iArr[i12] = Math.min(i7, i6);
            iArr[i12 + i9] = d7.f11447b;
            d7.f11449d = true;
            i12++;
            d7 = d7.f11451f;
        }
        return new F(bArr, iArr);
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j F(String str) {
        g0(str);
        return this;
    }

    public final D H(int i6) {
        if (i6 < 1 || i6 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        D d6 = this.f11481c;
        if (d6 == null) {
            D b5 = E.b();
            this.f11481c = b5;
            b5.f11452g = b5;
            b5.f11451f = b5;
            return b5;
        }
        D d7 = d6.f11452g;
        AbstractC1276k.c(d7);
        if (d7.f11448c + i6 <= 8192 && d7.f11450e) {
            return d7;
        }
        D b6 = E.b();
        d7.b(b6);
        return b6;
    }

    @Override // d5.InterfaceC0951k
    public final long K(A a) {
        long j3 = this.f11482e;
        if (j3 > 0) {
            a.T(j3, this);
        }
        return j3;
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j L(long j3) {
        Y(j3);
        return this;
    }

    public final void N(C0952l c0952l) {
        AbstractC1276k.f(c0952l, "byteString");
        c0952l.r(this, c0952l.d());
    }

    public final void O(byte[] bArr, int i6) {
        AbstractC1276k.f(bArr, "source");
        int i7 = 0;
        long j3 = i6;
        AbstractC0942b.e(bArr.length, 0, j3);
        while (i7 < i6) {
            D H3 = H(1);
            int min = Math.min(i6 - i7, 8192 - H3.f11448c);
            int i8 = i7 + min;
            Y3.k.f0(H3.f11448c, i7, i8, bArr, H3.a);
            H3.f11448c += min;
            i7 = i8;
        }
        this.f11482e += j3;
    }

    @Override // d5.InterfaceC0951k
    public final boolean P(long j3) {
        return this.f11482e >= j3;
    }

    public final long Q(I i6) {
        AbstractC1276k.f(i6, "source");
        long j3 = 0;
        while (true) {
            long W5 = i6.W(8192L, this);
            if (W5 == -1) {
                return j3;
            }
            j3 += W5;
        }
    }

    @Override // d5.InterfaceC0951k
    public final String R() {
        return A(Long.MAX_VALUE);
    }

    public final void S(int i6) {
        D H3 = H(1);
        byte[] bArr = H3.a;
        int i7 = H3.f11448c;
        H3.f11448c = i7 + 1;
        bArr[i7] = (byte) i6;
        this.f11482e++;
    }

    @Override // d5.G
    public final void T(long j3, C0949i c0949i) {
        D b5;
        AbstractC1276k.f(c0949i, "source");
        if (c0949i == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0942b.e(c0949i.f11482e, 0L, j3);
        while (j3 > 0) {
            D d6 = c0949i.f11481c;
            AbstractC1276k.c(d6);
            int i6 = d6.f11448c;
            D d7 = c0949i.f11481c;
            AbstractC1276k.c(d7);
            long j4 = i6 - d7.f11447b;
            int i7 = 0;
            if (j3 < j4) {
                D d8 = this.f11481c;
                D d9 = d8 != null ? d8.f11452g : null;
                if (d9 != null && d9.f11450e) {
                    if ((d9.f11448c + j3) - (d9.f11449d ? 0 : d9.f11447b) <= 8192) {
                        D d10 = c0949i.f11481c;
                        AbstractC1276k.c(d10);
                        d10.d(d9, (int) j3);
                        c0949i.f11482e -= j3;
                        this.f11482e += j3;
                        return;
                    }
                }
                D d11 = c0949i.f11481c;
                AbstractC1276k.c(d11);
                int i8 = (int) j3;
                if (i8 <= 0 || i8 > d11.f11448c - d11.f11447b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i8 >= 1024) {
                    b5 = d11.c();
                } else {
                    b5 = E.b();
                    byte[] bArr = d11.a;
                    byte[] bArr2 = b5.a;
                    int i9 = d11.f11447b;
                    Y3.k.f0(0, i9, i9 + i8, bArr, bArr2);
                }
                b5.f11448c = b5.f11447b + i8;
                d11.f11447b += i8;
                D d12 = d11.f11452g;
                AbstractC1276k.c(d12);
                d12.b(b5);
                c0949i.f11481c = b5;
            }
            D d13 = c0949i.f11481c;
            AbstractC1276k.c(d13);
            long j5 = d13.f11448c - d13.f11447b;
            c0949i.f11481c = d13.a();
            D d14 = this.f11481c;
            if (d14 == null) {
                this.f11481c = d13;
                d13.f11452g = d13;
                d13.f11451f = d13;
            } else {
                D d15 = d14.f11452g;
                AbstractC1276k.c(d15);
                d15.b(d13);
                D d16 = d13.f11452g;
                if (d16 == d13) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC1276k.c(d16);
                if (d16.f11450e) {
                    int i10 = d13.f11448c - d13.f11447b;
                    D d17 = d13.f11452g;
                    AbstractC1276k.c(d17);
                    int i11 = 8192 - d17.f11448c;
                    D d18 = d13.f11452g;
                    AbstractC1276k.c(d18);
                    if (!d18.f11449d) {
                        D d19 = d13.f11452g;
                        AbstractC1276k.c(d19);
                        i7 = d19.f11447b;
                    }
                    if (i10 <= i11 + i7) {
                        D d20 = d13.f11452g;
                        AbstractC1276k.c(d20);
                        d13.d(d20, i10);
                        d13.a();
                        E.a(d13);
                    }
                }
            }
            c0949i.f11482e -= j5;
            this.f11482e += j5;
            j3 -= j5;
        }
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        long j4 = this.f11482e;
        if (j4 == 0) {
            return -1L;
        }
        if (j3 > j4) {
            j3 = j4;
        }
        c0949i.T(j3, this);
        return j3;
    }

    public final void Y(long j3) {
        if (j3 == 0) {
            S(48);
            return;
        }
        long j4 = (j3 >>> 1) | j3;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i6 = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + 3) / 4);
        D H3 = H(i6);
        byte[] bArr = H3.a;
        int i7 = H3.f11448c;
        for (int i8 = (i7 + i6) - 1; i8 >= i7; i8--) {
            bArr[i8] = e5.a.a[(int) (15 & j3)];
            j3 >>>= 4;
        }
        H3.f11448c += i6;
        this.f11482e += i6;
    }

    @Override // d5.InterfaceC0951k
    public final void a0(long j3) {
        if (this.f11482e < j3) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Type inference failed for: r0v7, types: [d5.i, java.lang.Object] */
    @Override // d5.InterfaceC0951k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0() {
        /*
            r15 = this;
            long r0 = r15.f11482e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            d5.D r7 = r15.f11481c
            m4.AbstractC1276k.c(r7)
            byte[] r8 = r7.a
            int r9 = r7.f11447b
            int r10 = r7.f11448c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            d5.i r0 = new d5.i
            r0.<init>()
            r0.Y(r4)
            r0.S(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.y()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = e5.b.a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            d5.D r8 = r7.a()
            r15.f11481c = r8
            d5.E.a(r7)
            goto L9c
        L9a:
            r7.f11447b = r9
        L9c:
            if (r6 != 0) goto La2
            d5.D r7 = r15.f11481c
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f11482e
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f11482e = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.C0949i.b0():long");
    }

    public final long c() {
        long j3 = this.f11482e;
        if (j3 == 0) {
            return 0L;
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        D d7 = d6.f11452g;
        AbstractC1276k.c(d7);
        return (d7.f11448c >= 8192 || !d7.f11450e) ? j3 : j3 - (r3 - d7.f11447b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d5.i, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f11482e == 0) {
            return obj;
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        D c6 = d6.c();
        obj.f11481c = c6;
        c6.f11452g = c6;
        c6.f11451f = c6;
        for (D d7 = d6.f11451f; d7 != d6; d7 = d7.f11451f) {
            D d8 = c6.f11452g;
            AbstractC1276k.c(d8);
            AbstractC1276k.c(d7);
            d8.b(d7.c());
        }
        obj.f11482e = this.f11482e;
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, d5.G
    public final void close() {
    }

    public final void d(C0949i c0949i, long j3, long j4) {
        AbstractC1276k.f(c0949i, "out");
        long j5 = j3;
        AbstractC0942b.e(this.f11482e, j5, j4);
        if (j4 == 0) {
            return;
        }
        c0949i.f11482e += j4;
        D d6 = this.f11481c;
        while (true) {
            AbstractC1276k.c(d6);
            long j6 = d6.f11448c - d6.f11447b;
            if (j5 < j6) {
                break;
            }
            j5 -= j6;
            d6 = d6.f11451f;
        }
        D d7 = d6;
        long j7 = j4;
        while (j7 > 0) {
            AbstractC1276k.c(d7);
            D c6 = d7.c();
            int i6 = c6.f11447b + ((int) j5);
            c6.f11447b = i6;
            c6.f11448c = Math.min(i6 + ((int) j7), c6.f11448c);
            D d8 = c0949i.f11481c;
            if (d8 == null) {
                c6.f11452g = c6;
                c6.f11451f = c6;
                c0949i.f11481c = c6;
            } else {
                D d9 = d8.f11452g;
                AbstractC1276k.c(d9);
                d9.b(c6);
            }
            j7 -= c6.f11448c - c6.f11447b;
            d7 = d7.f11451f;
            j5 = 0;
        }
    }

    public final void d0(int i6) {
        D H3 = H(4);
        byte[] bArr = H3.a;
        int i7 = H3.f11448c;
        bArr[i7] = (byte) ((i6 >>> 24) & 255);
        bArr[i7 + 1] = (byte) ((i6 >>> 16) & 255);
        bArr[i7 + 2] = (byte) ((i6 >>> 8) & 255);
        bArr[i7 + 3] = (byte) (i6 & 255);
        H3.f11448c = i7 + 4;
        this.f11482e += 4;
    }

    public final void e0(int i6) {
        D H3 = H(2);
        byte[] bArr = H3.a;
        int i7 = H3.f11448c;
        bArr[i7] = (byte) ((i6 >>> 8) & 255);
        bArr[i7 + 1] = (byte) (i6 & 255);
        H3.f11448c = i7 + 2;
        this.f11482e += 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0949i)) {
            return false;
        }
        long j3 = this.f11482e;
        C0949i c0949i = (C0949i) obj;
        if (j3 != c0949i.f11482e) {
            return false;
        }
        if (j3 == 0) {
            return true;
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        D d7 = c0949i.f11481c;
        AbstractC1276k.c(d7);
        int i6 = d6.f11447b;
        int i7 = d7.f11447b;
        long j4 = 0;
        while (j4 < this.f11482e) {
            long min = Math.min(d6.f11448c - i6, d7.f11448c - i7);
            long j5 = 0;
            while (j5 < min) {
                int i8 = i6 + 1;
                int i9 = i7 + 1;
                if (d6.a[i6] != d7.a[i7]) {
                    return false;
                }
                j5++;
                i6 = i8;
                i7 = i9;
            }
            if (i6 == d6.f11448c) {
                d6 = d6.f11451f;
                AbstractC1276k.c(d6);
                i6 = d6.f11447b;
            }
            if (i7 == d7.f11448c) {
                d7 = d7.f11451f;
                AbstractC1276k.c(d7);
                i7 = d7.f11447b;
            }
            j4 += min;
        }
        return true;
    }

    public final boolean f() {
        return this.f11482e == 0;
    }

    public final void f0(int i6, int i7, String str) {
        char charAt;
        AbstractC1276k.f(str, "string");
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "beginIndex < 0: ").toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(B3.e.k("endIndex < beginIndex: ", i7, i6, " < ").toString());
        }
        if (i7 > str.length()) {
            StringBuilder k3 = AbstractC1135a.k("endIndex > string.length: ", i7, " > ");
            k3.append(str.length());
            throw new IllegalArgumentException(k3.toString().toString());
        }
        while (i6 < i7) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128) {
                D H3 = H(1);
                byte[] bArr = H3.a;
                int i8 = H3.f11448c - i6;
                int min = Math.min(i7, 8192 - i8);
                int i9 = i6 + 1;
                bArr[i6 + i8] = (byte) charAt2;
                while (true) {
                    i6 = i9;
                    if (i6 >= min || (charAt = str.charAt(i6)) >= 128) {
                        break;
                    }
                    i9 = i6 + 1;
                    bArr[i6 + i8] = (byte) charAt;
                }
                int i10 = H3.f11448c;
                int i11 = (i8 + i6) - i10;
                H3.f11448c = i10 + i11;
                this.f11482e += i11;
            } else {
                if (charAt2 < 2048) {
                    D H5 = H(2);
                    byte[] bArr2 = H5.a;
                    int i12 = H5.f11448c;
                    bArr2[i12] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i12 + 1] = (byte) ((charAt2 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS);
                    H5.f11448c = i12 + 2;
                    this.f11482e += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    D H6 = H(3);
                    byte[] bArr3 = H6.a;
                    int i13 = H6.f11448c;
                    bArr3[i13] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i13 + 1] = (byte) ((63 & (charAt2 >> 6)) | PegdownExtensions.FENCED_CODE_BLOCKS);
                    bArr3[i13 + 2] = (byte) ((charAt2 & '?') | PegdownExtensions.FENCED_CODE_BLOCKS);
                    H6.f11448c = i13 + 3;
                    this.f11482e += 3;
                } else {
                    int i14 = i6 + 1;
                    char charAt3 = i14 < i7 ? str.charAt(i14) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        S(63);
                        i6 = i14;
                    } else {
                        int i15 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + PegdownExtensions.SUPPRESS_HTML_BLOCKS;
                        D H7 = H(4);
                        byte[] bArr4 = H7.a;
                        int i16 = H7.f11448c;
                        bArr4[i16] = (byte) ((i15 >> 18) | 240);
                        bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
                        bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
                        bArr4[i16 + 3] = (byte) ((i15 & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
                        H7.f11448c = i16 + 4;
                        this.f11482e += 4;
                        i6 += 2;
                    }
                }
                i6++;
            }
        }
    }

    @Override // d5.InterfaceC0950j, d5.G, java.io.Flushable
    public final void flush() {
    }

    public final void g0(String str) {
        AbstractC1276k.f(str, "string");
        f0(0, str.length(), str);
    }

    public final byte h(long j3) {
        AbstractC0942b.e(this.f11482e, j3, 1L);
        D d6 = this.f11481c;
        if (d6 == null) {
            AbstractC1276k.c(null);
            throw null;
        }
        long j4 = this.f11482e;
        if (j4 - j3 < j3) {
            while (j4 > j3) {
                d6 = d6.f11452g;
                AbstractC1276k.c(d6);
                j4 -= d6.f11448c - d6.f11447b;
            }
            return d6.a[(int) ((d6.f11447b + j3) - j4)];
        }
        long j5 = 0;
        while (true) {
            int i6 = d6.f11448c;
            int i7 = d6.f11447b;
            long j6 = (i6 - i7) + j5;
            if (j6 > j3) {
                return d6.a[(int) ((i7 + j3) - j5)];
            }
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
            j5 = j6;
        }
    }

    public final void h0(int i6) {
        if (i6 < 128) {
            S(i6);
            return;
        }
        if (i6 < 2048) {
            D H3 = H(2);
            byte[] bArr = H3.a;
            int i7 = H3.f11448c;
            bArr[i7] = (byte) ((i6 >> 6) | 192);
            bArr[i7 + 1] = (byte) ((i6 & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
            H3.f11448c = i7 + 2;
            this.f11482e += 2;
            return;
        }
        if (55296 <= i6 && i6 < 57344) {
            S(63);
            return;
        }
        if (i6 < 65536) {
            D H5 = H(3);
            byte[] bArr2 = H5.a;
            int i8 = H5.f11448c;
            bArr2[i8] = (byte) ((i6 >> 12) | 224);
            bArr2[i8 + 1] = (byte) (((i6 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
            bArr2[i8 + 2] = (byte) ((i6 & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
            H5.f11448c = i8 + 3;
            this.f11482e += 3;
            return;
        }
        if (i6 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC0942b.j(i6)));
        }
        D H6 = H(4);
        byte[] bArr3 = H6.a;
        int i9 = H6.f11448c;
        bArr3[i9] = (byte) ((i6 >> 18) | 240);
        bArr3[i9 + 1] = (byte) (((i6 >> 12) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
        bArr3[i9 + 2] = (byte) (((i6 >> 6) & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
        bArr3[i9 + 3] = (byte) ((i6 & 63) | PegdownExtensions.FENCED_CODE_BLOCKS);
        H6.f11448c = i9 + 4;
        this.f11482e += 4;
    }

    public final int hashCode() {
        D d6 = this.f11481c;
        if (d6 == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i7 = d6.f11448c;
            for (int i8 = d6.f11447b; i8 < i7; i8++) {
                i6 = (i6 * 31) + d6.a[i8];
            }
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
        } while (d6 != this.f11481c);
        return i6;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(byte b5, long j3, long j4) {
        D d6;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.f11482e + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.f11482e;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (d6 = this.f11481c) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                d6 = d6.f11452g;
                AbstractC1276k.c(d6);
                j6 -= d6.f11448c - d6.f11447b;
            }
            while (j6 < j4) {
                byte[] bArr = d6.a;
                int min = (int) Math.min(d6.f11448c, (d6.f11447b + j4) - j6);
                for (int i6 = (int) ((d6.f11447b + j3) - j6); i6 < min; i6++) {
                    if (bArr[i6] == b5) {
                        return (i6 - d6.f11447b) + j6;
                    }
                }
                j6 += d6.f11448c - d6.f11447b;
                d6 = d6.f11451f;
                AbstractC1276k.c(d6);
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (d6.f11448c - d6.f11447b) + j5;
            if (j7 > j3) {
                break;
            }
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
            j5 = j7;
        }
        while (j5 < j4) {
            byte[] bArr2 = d6.a;
            int min2 = (int) Math.min(d6.f11448c, (d6.f11447b + j4) - j5);
            for (int i7 = (int) ((d6.f11447b + j3) - j5); i7 < min2; i7++) {
                if (bArr2[i7] == b5) {
                    return (i7 - d6.f11447b) + j5;
                }
            }
            j5 += d6.f11448c - d6.f11447b;
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
            j3 = j5;
        }
        return -1L;
    }

    @Override // d5.InterfaceC0951k
    public final C0952l k(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(B3.e.m("byteCount: ", j3).toString());
        }
        if (this.f11482e < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new C0952l(r(j3));
        }
        C0952l E5 = E((int) j3);
        skip(j3);
        return E5;
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j m(C0952l c0952l) {
        N(c0952l);
        return this;
    }

    public final long p(C0952l c0952l) {
        int i6;
        int i7;
        AbstractC1276k.f(c0952l, "targetBytes");
        D d6 = this.f11481c;
        if (d6 == null) {
            return -1L;
        }
        long j3 = this.f11482e;
        long j4 = 0;
        if (j3 < 0) {
            while (j3 > 0) {
                d6 = d6.f11452g;
                AbstractC1276k.c(d6);
                j3 -= d6.f11448c - d6.f11447b;
            }
            if (c0952l.d() == 2) {
                byte i8 = c0952l.i(0);
                byte i9 = c0952l.i(1);
                while (j3 < this.f11482e) {
                    byte[] bArr = d6.a;
                    i6 = (int) ((d6.f11447b + j4) - j3);
                    int i10 = d6.f11448c;
                    while (i6 < i10) {
                        byte b5 = bArr[i6];
                        if (b5 != i8 && b5 != i9) {
                            i6++;
                        }
                        i7 = d6.f11447b;
                    }
                    j4 = (d6.f11448c - d6.f11447b) + j3;
                    d6 = d6.f11451f;
                    AbstractC1276k.c(d6);
                    j3 = j4;
                }
                return -1L;
            }
            byte[] h3 = c0952l.h();
            while (j3 < this.f11482e) {
                byte[] bArr2 = d6.a;
                i6 = (int) ((d6.f11447b + j4) - j3);
                int i11 = d6.f11448c;
                while (i6 < i11) {
                    byte b6 = bArr2[i6];
                    for (byte b7 : h3) {
                        if (b6 == b7) {
                            i7 = d6.f11447b;
                        }
                    }
                    i6++;
                }
                j4 = (d6.f11448c - d6.f11447b) + j3;
                d6 = d6.f11451f;
                AbstractC1276k.c(d6);
                j3 = j4;
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j5 = (d6.f11448c - d6.f11447b) + j3;
            if (j5 > 0) {
                break;
            }
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
            j3 = j5;
        }
        if (c0952l.d() == 2) {
            byte i12 = c0952l.i(0);
            byte i13 = c0952l.i(1);
            while (j3 < this.f11482e) {
                byte[] bArr3 = d6.a;
                i6 = (int) ((d6.f11447b + j4) - j3);
                int i14 = d6.f11448c;
                while (i6 < i14) {
                    byte b8 = bArr3[i6];
                    if (b8 != i12 && b8 != i13) {
                        i6++;
                    }
                    i7 = d6.f11447b;
                }
                j4 = (d6.f11448c - d6.f11447b) + j3;
                d6 = d6.f11451f;
                AbstractC1276k.c(d6);
                j3 = j4;
            }
            return -1L;
        }
        byte[] h6 = c0952l.h();
        while (j3 < this.f11482e) {
            byte[] bArr4 = d6.a;
            i6 = (int) ((d6.f11447b + j4) - j3);
            int i15 = d6.f11448c;
            while (i6 < i15) {
                byte b9 = bArr4[i6];
                for (byte b10 : h6) {
                    if (b9 == b10) {
                        i7 = d6.f11447b;
                    }
                }
                i6++;
            }
            j4 = (d6.f11448c - d6.f11447b) + j3;
            d6 = d6.f11451f;
            AbstractC1276k.c(d6);
            j3 = j4;
        }
        return -1L;
        return (i6 - i7) + j3;
    }

    public final boolean q(long j3, C0952l c0952l) {
        AbstractC1276k.f(c0952l, "bytes");
        int d6 = c0952l.d();
        if (j3 >= 0 && d6 >= 0 && this.f11482e - j3 >= d6 && c0952l.d() >= d6) {
            for (int i6 = 0; i6 < d6; i6++) {
                if (h(i6 + j3) == c0952l.i(i6)) {
                }
            }
            return true;
        }
        return false;
    }

    public final byte[] r(long j3) {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(B3.e.m("byteCount: ", j3).toString());
        }
        if (this.f11482e < j3) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j3];
        AbstractC1276k.f(bArr, "sink");
        int i6 = 0;
        while (i6 < bArr.length) {
            int read = read(bArr, i6, bArr.length - i6);
            if (read == -1) {
                throw new EOFException();
            }
            i6 += read;
        }
        return bArr;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1276k.f(byteBuffer, "sink");
        D d6 = this.f11481c;
        if (d6 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), d6.f11448c - d6.f11447b);
        byteBuffer.put(d6.a, d6.f11447b, min);
        int i6 = d6.f11447b + min;
        d6.f11447b = i6;
        this.f11482e -= min;
        if (i6 == d6.f11448c) {
            this.f11481c = d6.a();
            E.a(d6);
        }
        return min;
    }

    @Override // d5.InterfaceC0951k
    public final byte readByte() {
        if (this.f11482e == 0) {
            throw new EOFException();
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        int i6 = d6.f11447b;
        int i7 = d6.f11448c;
        int i8 = i6 + 1;
        byte b5 = d6.a[i6];
        this.f11482e--;
        if (i8 != i7) {
            d6.f11447b = i8;
            return b5;
        }
        this.f11481c = d6.a();
        E.a(d6);
        return b5;
    }

    @Override // d5.InterfaceC0951k
    public final int readInt() {
        if (this.f11482e < 4) {
            throw new EOFException();
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        int i6 = d6.f11447b;
        int i7 = d6.f11448c;
        if (i7 - i6 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = d6.a;
        int i8 = i6 + 3;
        int i9 = ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 2] & 255) << 8);
        int i10 = i6 + 4;
        int i11 = (bArr[i8] & 255) | i9;
        this.f11482e -= 4;
        if (i10 != i7) {
            d6.f11447b = i10;
            return i11;
        }
        this.f11481c = d6.a();
        E.a(d6);
        return i11;
    }

    @Override // d5.InterfaceC0951k
    public final short readShort() {
        if (this.f11482e < 2) {
            throw new EOFException();
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        int i6 = d6.f11447b;
        int i7 = d6.f11448c;
        if (i7 - i6 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = d6.a;
        int i8 = i6 + 1;
        int i9 = (bArr[i6] & 255) << 8;
        int i10 = i6 + 2;
        int i11 = (bArr[i8] & 255) | i9;
        this.f11482e -= 2;
        if (i10 == i7) {
            this.f11481c = d6.a();
            E.a(d6);
        } else {
            d6.f11447b = i10;
        }
        return (short) i11;
    }

    public final short s() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // d5.InterfaceC0951k
    public final void skip(long j3) {
        while (j3 > 0) {
            D d6 = this.f11481c;
            if (d6 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j3, d6.f11448c - d6.f11447b);
            long j4 = min;
            this.f11482e -= j4;
            j3 -= j4;
            int i6 = d6.f11447b + min;
            d6.f11447b = i6;
            if (i6 == d6.f11448c) {
                this.f11481c = d6.a();
                E.a(d6);
            }
        }
    }

    @Override // d5.I
    public final K timeout() {
        return K.f11458d;
    }

    public final String toString() {
        long j3 = this.f11482e;
        if (j3 <= 2147483647L) {
            return E((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f11482e).toString());
    }

    public final String u(long j3, Charset charset) {
        AbstractC1276k.f(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(B3.e.m("byteCount: ", j3).toString());
        }
        if (this.f11482e < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        D d6 = this.f11481c;
        AbstractC1276k.c(d6);
        int i6 = d6.f11447b;
        if (i6 + j3 > d6.f11448c) {
            return new String(r(j3), charset);
        }
        int i7 = (int) j3;
        String str = new String(d6.a, i6, i7, charset);
        int i8 = d6.f11447b + i7;
        d6.f11447b = i8;
        this.f11482e -= j3;
        if (i8 == d6.f11448c) {
            this.f11481c = d6.a();
            E.a(d6);
        }
        return str;
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j write(byte[] bArr) {
        m13write(bArr);
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j writeByte(int i6) {
        S(i6);
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j writeInt(int i6) {
        d0(i6);
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final /* bridge */ /* synthetic */ InterfaceC0950j writeShort(int i6) {
        e0(i6);
        return this;
    }

    @Override // d5.InterfaceC0951k
    public final C0949i x() {
        return this;
    }

    public final String y() {
        return u(this.f11482e, AbstractC1763a.a);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1276k.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i6 = remaining;
        while (i6 > 0) {
            D H3 = H(1);
            int min = Math.min(i6, 8192 - H3.f11448c);
            byteBuffer.get(H3.a, H3.f11448c, min);
            i6 -= min;
            H3.f11448c += min;
        }
        this.f11482e += remaining;
        return remaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m13write(byte[] bArr) {
        AbstractC1276k.f(bArr, "source");
        O(bArr, bArr.length);
    }

    public final int read(byte[] bArr, int i6, int i7) {
        AbstractC1276k.f(bArr, "sink");
        AbstractC0942b.e(bArr.length, i6, i7);
        D d6 = this.f11481c;
        if (d6 == null) {
            return -1;
        }
        int min = Math.min(i7, d6.f11448c - d6.f11447b);
        byte[] bArr2 = d6.a;
        int i8 = d6.f11447b;
        Y3.k.f0(i6, i8, i8 + min, bArr2, bArr);
        int i9 = d6.f11447b + min;
        d6.f11447b = i9;
        this.f11482e -= min;
        if (i9 == d6.f11448c) {
            this.f11481c = d6.a();
            E.a(d6);
        }
        return min;
    }
}
