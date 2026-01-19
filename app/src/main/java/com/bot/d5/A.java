package d5;

import java.nio.ByteBuffer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A implements InterfaceC0950j {

    /* renamed from: c, reason: collision with root package name */
    public final G f11440c;

    /* renamed from: e, reason: collision with root package name */
    public final C0949i f11441e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11442f;

    /* JADX WARN: Type inference failed for: r2v1, types: [d5.i, java.lang.Object] */
    public A(G g3) {
        AbstractC1276k.f(g3, "sink");
        this.f11440c = g3;
        this.f11441e = new Object();
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j F(String str) {
        AbstractC1276k.f(str, "string");
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.g0(str);
        c();
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j L(long j3) {
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.Y(j3);
        c();
        return this;
    }

    @Override // d5.G
    public final void T(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "source");
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.T(j3, c0949i);
        c();
    }

    public final InterfaceC0950j c() {
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        C0949i c0949i = this.f11441e;
        long c6 = c0949i.c();
        if (c6 > 0) {
            this.f11440c.T(c6, c0949i);
        }
        return this;
    }

    @Override // d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        G g3 = this.f11440c;
        if (this.f11442f) {
            return;
        }
        try {
            C0949i c0949i = this.f11441e;
            long j3 = c0949i.f11482e;
            if (j3 > 0) {
                g3.T(j3, c0949i);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            g3.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f11442f = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0950j d(long j3) {
        boolean z5;
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        C0949i c0949i = this.f11441e;
        c0949i.getClass();
        if (j3 == 0) {
            c0949i.S(48);
        } else {
            int i6 = 1;
            if (j3 < 0) {
                j3 = -j3;
                if (j3 < 0) {
                    c0949i.g0("-9223372036854775808");
                } else {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
            if (j3 >= 100000000) {
                i6 = j3 < 1000000000000L ? j3 < 10000000000L ? j3 < 1000000000 ? 9 : 10 : j3 < 100000000000L ? 11 : 12 : j3 < 1000000000000000L ? j3 < 10000000000000L ? 13 : j3 < 100000000000000L ? 14 : 15 : j3 < 100000000000000000L ? j3 < 10000000000000000L ? 16 : 17 : j3 < 1000000000000000000L ? 18 : 19;
            } else if (j3 >= 10000) {
                i6 = j3 < 1000000 ? j3 < 100000 ? 5 : 6 : j3 < 10000000 ? 7 : 8;
            } else if (j3 >= 100) {
                i6 = j3 < 1000 ? 3 : 4;
            } else if (j3 >= 10) {
                i6 = 2;
            }
            if (z5) {
                i6++;
            }
            D H3 = c0949i.H(i6);
            byte[] bArr = H3.a;
            int i7 = H3.f11448c + i6;
            while (j3 != 0) {
                long j4 = 10;
                i7--;
                bArr[i7] = e5.a.a[(int) (j3 % j4)];
                j3 /= j4;
            }
            if (z5) {
                bArr[i7 - 1] = 45;
            }
            H3.f11448c += i6;
            c0949i.f11482e += i6;
        }
        c();
        return this;
    }

    @Override // d5.InterfaceC0950j, d5.G, java.io.Flushable
    public final void flush() {
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        C0949i c0949i = this.f11441e;
        long j3 = c0949i.f11482e;
        G g3 = this.f11440c;
        if (j3 > 0) {
            g3.T(j3, c0949i);
        }
        g3.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f11442f;
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j m(C0952l c0952l) {
        AbstractC1276k.f(c0952l, "byteString");
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.N(c0952l);
        c();
        return this;
    }

    @Override // d5.G
    public final K timeout() {
        return this.f11440c.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f11440c + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1276k.f(byteBuffer, "source");
        if (!this.f11442f) {
            int write = this.f11441e.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j writeByte(int i6) {
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.S(i6);
        c();
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j writeInt(int i6) {
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.d0(i6);
        c();
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j writeShort(int i6) {
        if (this.f11442f) {
            throw new IllegalStateException("closed");
        }
        this.f11441e.e0(i6);
        c();
        return this;
    }

    @Override // d5.InterfaceC0950j
    public final InterfaceC0950j write(byte[] bArr) {
        if (!this.f11442f) {
            this.f11441e.m13write(bArr);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
