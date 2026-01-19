package X4;

import com.vladsch.flexmark.util.format.TableCell;
import d5.C0949i;
import d5.InterfaceC0950j;
import j1.AbstractC1135a;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f9530i = Logger.getLogger(f.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0950j f9531c;

    /* renamed from: e, reason: collision with root package name */
    public final C0949i f9532e;

    /* renamed from: f, reason: collision with root package name */
    public int f9533f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9534g;

    /* renamed from: h, reason: collision with root package name */
    public final d f9535h;

    /* JADX WARN: Type inference failed for: r2v1, types: [d5.i, java.lang.Object] */
    public x(d5.A a) {
        AbstractC1276k.f(a, "sink");
        this.f9531c = a;
        ?? obj = new Object();
        this.f9532e = obj;
        this.f9533f = 16384;
        this.f9535h = new d(obj);
    }

    public final synchronized void c(A a) {
        try {
            AbstractC1276k.f(a, "peerSettings");
            if (this.f9534g) {
                throw new IOException("closed");
            }
            int i6 = this.f9533f;
            int i7 = a.a;
            if ((i7 & 32) != 0) {
                i6 = a.f9416b[5];
            }
            this.f9533f = i6;
            if (((i7 & 2) != 0 ? a.f9416b[1] : -1) != -1) {
                d dVar = this.f9535h;
                int i8 = (i7 & 2) != 0 ? a.f9416b[1] : -1;
                dVar.getClass();
                int min = Math.min(i8, 16384);
                int i9 = dVar.f9434d;
                if (i9 != min) {
                    if (min < i9) {
                        dVar.f9432b = Math.min(dVar.f9432b, min);
                    }
                    dVar.f9433c = true;
                    dVar.f9434d = min;
                    int i10 = dVar.f9438h;
                    if (min < i10) {
                        if (min == 0) {
                            C0711b[] c0711bArr = dVar.f9435e;
                            Y3.k.o0(null, c0711bArr, 0, c0711bArr.length);
                            dVar.f9436f = dVar.f9435e.length - 1;
                            dVar.f9437g = 0;
                            dVar.f9438h = 0;
                        } else {
                            dVar.a(i10 - min);
                        }
                    }
                }
            }
            f(0, 0, 4, 1);
            this.f9531c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f9534g = true;
        this.f9531c.close();
    }

    public final synchronized void d(boolean z5, int i6, C0949i c0949i, int i7) {
        if (this.f9534g) {
            throw new IOException("closed");
        }
        f(i6, i7, 0, z5 ? 1 : 0);
        if (i7 > 0) {
            InterfaceC0950j interfaceC0950j = this.f9531c;
            AbstractC1276k.c(c0949i);
            interfaceC0950j.T(i7, c0949i);
        }
    }

    public final void f(int i6, int i7, int i8, int i9) {
        Level level = Level.FINE;
        Logger logger = f9530i;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i6, i7, i8, i9));
        }
        if (i7 > this.f9533f) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f9533f + ": " + i7).toString());
        }
        if ((Integer.MIN_VALUE & i6) != 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "reserved bit set: ").toString());
        }
        byte[] bArr = R4.b.a;
        InterfaceC0950j interfaceC0950j = this.f9531c;
        AbstractC1276k.f(interfaceC0950j, "<this>");
        interfaceC0950j.writeByte((i7 >>> 16) & 255);
        interfaceC0950j.writeByte((i7 >>> 8) & 255);
        interfaceC0950j.writeByte(i7 & 255);
        interfaceC0950j.writeByte(i8 & 255);
        interfaceC0950j.writeByte(i9 & 255);
        interfaceC0950j.writeInt(i6 & TableCell.NOT_TRACKED);
    }

    public final synchronized void flush() {
        if (this.f9534g) {
            throw new IOException("closed");
        }
        this.f9531c.flush();
    }

    public final synchronized void h(byte[] bArr, int i6, int i7) {
        AbstractC1135a.o(i7, "errorCode");
        if (this.f9534g) {
            throw new IOException("closed");
        }
        if (M1.d.a(i7) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        f(0, bArr.length + 8, 7, 0);
        this.f9531c.writeInt(i6);
        this.f9531c.writeInt(M1.d.a(i7));
        if (bArr.length != 0) {
            this.f9531c.write(bArr);
        }
        this.f9531c.flush();
    }

    public final synchronized void j(boolean z5, int i6, ArrayList arrayList) {
        if (this.f9534g) {
            throw new IOException("closed");
        }
        this.f9535h.d(arrayList);
        long j3 = this.f9532e.f11482e;
        long min = Math.min(this.f9533f, j3);
        int i7 = j3 == min ? 4 : 0;
        if (z5) {
            i7 |= 1;
        }
        f(i6, (int) min, 1, i7);
        this.f9531c.T(min, this.f9532e);
        if (j3 > min) {
            long j4 = j3 - min;
            while (j4 > 0) {
                long min2 = Math.min(this.f9533f, j4);
                j4 -= min2;
                f(i6, (int) min2, 9, j4 == 0 ? 4 : 0);
                this.f9531c.T(min2, this.f9532e);
            }
        }
    }

    public final synchronized void p(int i6, int i7, boolean z5) {
        if (this.f9534g) {
            throw new IOException("closed");
        }
        f(0, 8, 6, z5 ? 1 : 0);
        this.f9531c.writeInt(i6);
        this.f9531c.writeInt(i7);
        this.f9531c.flush();
    }

    public final synchronized void q(int i6, int i7) {
        AbstractC1135a.o(i7, "errorCode");
        if (this.f9534g) {
            throw new IOException("closed");
        }
        if (M1.d.a(i7) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        f(i6, 4, 3, 0);
        this.f9531c.writeInt(M1.d.a(i7));
        this.f9531c.flush();
    }

    public final synchronized void r(long j3, int i6) {
        if (this.f9534g) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j3).toString());
        }
        f(i6, 4, 8, 0);
        this.f9531c.writeInt((int) j3);
        this.f9531c.flush();
    }
}
