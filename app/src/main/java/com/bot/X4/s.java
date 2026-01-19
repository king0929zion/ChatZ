package X4;

import com.vladsch.flexmark.util.format.TableCell;
import d5.C;
import d5.C0949i;
import d5.C0952l;
import d5.InterfaceC0951k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class s implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f9502g;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0951k f9503c;

    /* renamed from: e, reason: collision with root package name */
    public final r f9504e;

    /* renamed from: f, reason: collision with root package name */
    public final c f9505f;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        AbstractC1276k.e(logger, "getLogger(Http2::class.java.name)");
        f9502g = logger;
    }

    public s(C c6) {
        AbstractC1276k.f(c6, "source");
        this.f9503c = c6;
        r rVar = new r(c6);
        this.f9504e = rVar;
        this.f9505f = new c(rVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x024e, code lost:
    
        throw new java.io.IOException(B3.e.h(r13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(boolean r24, X4.k r25) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.s.c(boolean, X4.k):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9503c.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [d5.i, java.lang.Object] */
    public final void d(k kVar, int i6, int i7, int i8) {
        int i9;
        boolean z5;
        long j3;
        boolean z6;
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z7 = (i7 & 1) != 0;
        if ((i7 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i7 & 8) != 0) {
            byte readByte = this.f9503c.readByte();
            byte[] bArr = R4.b.a;
            i9 = readByte & 255;
        } else {
            i9 = 0;
        }
        int a = q.a(i6, i7, i9);
        InterfaceC0951k interfaceC0951k = this.f9503c;
        AbstractC1276k.f(interfaceC0951k, "source");
        o oVar = (o) kVar.f9452f;
        long j4 = 0;
        if (i8 == 0 || (i8 & 1) != 0) {
            w d6 = oVar.d(i8);
            if (d6 == null) {
                ((o) kVar.f9452f).q(i8, 2);
                long j5 = a;
                ((o) kVar.f9452f).j(j5);
                interfaceC0951k.skip(j5);
            } else {
                byte[] bArr2 = R4.b.a;
                u uVar = d6.f9524i;
                long j6 = a;
                uVar.getClass();
                long j7 = j6;
                while (true) {
                    if (j7 <= j4) {
                        w wVar = uVar.f9515i;
                        byte[] bArr3 = R4.b.a;
                        wVar.f9517b.j(j6);
                        break;
                    }
                    synchronized (uVar.f9515i) {
                        z5 = uVar.f9511e;
                        j3 = j4;
                        z6 = uVar.f9513g.f11482e + j7 > uVar.f9510c;
                    }
                    if (z6) {
                        interfaceC0951k.skip(j7);
                        uVar.f9515i.e(4);
                        break;
                    }
                    if (z5) {
                        interfaceC0951k.skip(j7);
                        break;
                    }
                    long W5 = interfaceC0951k.W(j7, uVar.f9512f);
                    if (W5 == -1) {
                        throw new EOFException();
                    }
                    j7 -= W5;
                    w wVar2 = uVar.f9515i;
                    synchronized (wVar2) {
                        try {
                            if (uVar.f9514h) {
                                C0949i c0949i = uVar.f9512f;
                                c0949i.skip(c0949i.f11482e);
                            } else {
                                C0949i c0949i2 = uVar.f9513g;
                                boolean z8 = c0949i2.f11482e == j3;
                                c0949i2.Q(uVar.f9512f);
                                if (z8) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j4 = j3;
                }
                if (z7) {
                    d6.i(R4.b.f7079b, true);
                }
            }
        } else {
            Object obj = new Object();
            long j8 = a;
            interfaceC0951k.a0(j8);
            interfaceC0951k.W(j8, obj);
            oVar.f9474l.c(new l(oVar.f9468f + '[' + i8 + "] onData", oVar, i8, obj, a, z7), 0L);
        }
        this.f9503c.skip(i9);
    }

    public final List f(int i6, int i7, int i8, int i9) {
        r rVar = this.f9504e;
        rVar.f9500h = i6;
        rVar.f9497e = i6;
        rVar.f9501i = i7;
        rVar.f9498f = i8;
        rVar.f9499g = i9;
        c cVar = this.f9505f;
        C c6 = cVar.f9427c;
        ArrayList arrayList = cVar.f9426b;
        while (!c6.c()) {
            byte readByte = c6.readByte();
            byte[] bArr = R4.b.a;
            int i10 = readByte & 255;
            if (i10 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e6 = cVar.e(i10, 127);
                int i11 = e6 - 1;
                if (i11 >= 0) {
                    C0711b[] c0711bArr = e.a;
                    if (i11 <= c0711bArr.length - 1) {
                        arrayList.add(c0711bArr[i11]);
                    }
                }
                int length = cVar.f9429e + 1 + (i11 - e.a.length);
                if (length >= 0) {
                    C0711b[] c0711bArr2 = cVar.f9428d;
                    if (length < c0711bArr2.length) {
                        C0711b c0711b = c0711bArr2[length];
                        AbstractC1276k.c(c0711b);
                        arrayList.add(c0711b);
                    }
                }
                throw new IOException(B3.e.h(e6, "Header index too large "));
            }
            if (i10 == 64) {
                C0711b[] c0711bArr3 = e.a;
                C0952l d6 = cVar.d();
                e.a(d6);
                cVar.c(new C0711b(d6, cVar.d()));
            } else if ((readByte & 64) == 64) {
                cVar.c(new C0711b(cVar.b(cVar.e(i10, 63) - 1), cVar.d()));
            } else if ((readByte & 32) == 32) {
                int e7 = cVar.e(i10, 31);
                cVar.a = e7;
                if (e7 < 0 || e7 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + cVar.a);
                }
                int i12 = cVar.f9431g;
                if (e7 < i12) {
                    if (e7 == 0) {
                        Y3.k.o0(null, r7, 0, cVar.f9428d.length);
                        cVar.f9429e = cVar.f9428d.length - 1;
                        cVar.f9430f = 0;
                        cVar.f9431g = 0;
                    } else {
                        cVar.a(i12 - e7);
                    }
                }
            } else if (i10 == 16 || i10 == 0) {
                C0711b[] c0711bArr4 = e.a;
                C0952l d7 = cVar.d();
                e.a(d7);
                arrayList.add(new C0711b(d7, cVar.d()));
            } else {
                arrayList.add(new C0711b(cVar.b(cVar.e(i10, 15) - 1), cVar.d()));
            }
        }
        List J0 = Y3.m.J0(arrayList);
        arrayList.clear();
        return J0;
    }

    public final void h(k kVar, int i6, int i7, int i8) {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i9 = 0;
        int i10 = 1;
        boolean z5 = (i7 & 1) != 0;
        if ((i7 & 8) != 0) {
            byte readByte = this.f9503c.readByte();
            byte[] bArr = R4.b.a;
            i9 = readByte & 255;
        }
        if ((i7 & 32) != 0) {
            InterfaceC0951k interfaceC0951k = this.f9503c;
            interfaceC0951k.readInt();
            interfaceC0951k.readByte();
            byte[] bArr2 = R4.b.a;
            i6 -= 5;
        }
        List f6 = f(q.a(i6, i7, i9), i9, i7, i8);
        o oVar = (o) kVar.f9452f;
        if (i8 != 0 && (i8 & 1) == 0) {
            oVar.f9474l.c(new m(oVar.f9468f + '[' + i8 + "] onHeaders", oVar, i8, f6, z5), 0L);
            return;
        }
        synchronized (oVar) {
            w d6 = oVar.d(i8);
            if (d6 != null) {
                d6.i(R4.b.u(f6), z5);
                return;
            }
            if (oVar.f9471i) {
                return;
            }
            if (i8 <= oVar.f9469g) {
                return;
            }
            if (i8 % 2 == oVar.f9470h % 2) {
                return;
            }
            w wVar = new w(i8, oVar, false, z5, R4.b.u(f6));
            oVar.f9469g = i8;
            oVar.f9467e.put(Integer.valueOf(i8), wVar);
            oVar.f9472j.e().c(new i(oVar.f9468f + '[' + i8 + "] onStream", oVar, wVar, i10), 0L);
        }
    }

    public final void j(k kVar, int i6, int i7, int i8) {
        int i9;
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i7 & 8) != 0) {
            byte readByte = this.f9503c.readByte();
            byte[] bArr = R4.b.a;
            i9 = readByte & 255;
        } else {
            i9 = 0;
        }
        int readInt = this.f9503c.readInt() & TableCell.NOT_TRACKED;
        List f6 = f(q.a(i6 - 4, i7, i9), i9, i7, i8);
        o oVar = (o) kVar.f9452f;
        synchronized (oVar) {
            if (oVar.f9465B.contains(Integer.valueOf(readInt))) {
                oVar.q(readInt, 2);
                return;
            }
            oVar.f9465B.add(Integer.valueOf(readInt));
            oVar.f9474l.c(new m(oVar.f9468f + '[' + readInt + "] onRequest", oVar, readInt, f6), 0L);
        }
    }
}
