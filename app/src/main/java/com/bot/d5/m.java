package d5;

import java.util.concurrent.locks.ReentrantLock;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class m implements I {

    /* renamed from: c, reason: collision with root package name */
    public final u f11487c;

    /* renamed from: e, reason: collision with root package name */
    public long f11488e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11489f;

    public m(u uVar, long j3) {
        this.f11487c = uVar;
        this.f11488e = j3;
    }

    @Override // d5.I
    public final long W(long j3, C0949i c0949i) {
        long j4;
        long j5;
        int i6;
        AbstractC1276k.f(c0949i, "sink");
        if (this.f11489f) {
            throw new IllegalStateException("closed");
        }
        u uVar = this.f11487c;
        long j6 = this.f11488e;
        if (j3 < 0) {
            throw new IllegalArgumentException(B3.e.m("byteCount < 0: ", j3).toString());
        }
        long j7 = j3 + j6;
        long j8 = j6;
        while (true) {
            if (j8 >= j7) {
                j4 = -1;
                break;
            }
            D H3 = c0949i.H(1);
            byte[] bArr = H3.a;
            int i7 = H3.f11448c;
            j4 = -1;
            int min = (int) Math.min(j7 - j8, 8192 - i7);
            synchronized (uVar) {
                AbstractC1276k.f(bArr, "array");
                uVar.f11512g.seek(j8);
                i6 = 0;
                while (true) {
                    if (i6 >= min) {
                        break;
                    }
                    int read = uVar.f11512g.read(bArr, i7, min - i6);
                    if (read != -1) {
                        i6 += read;
                    } else if (i6 == 0) {
                        i6 = -1;
                    }
                }
            }
            if (i6 == -1) {
                if (H3.f11447b == H3.f11448c) {
                    c0949i.f11481c = H3.a();
                    E.a(H3);
                }
                if (j6 == j8) {
                    j5 = -1;
                }
            } else {
                H3.f11448c += i6;
                long j9 = i6;
                j8 += j9;
                c0949i.f11482e += j9;
            }
        }
        j5 = j8 - j6;
        if (j5 != j4) {
            this.f11488e += j5;
        }
        return j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u uVar = this.f11487c;
        if (this.f11489f) {
            return;
        }
        this.f11489f = true;
        ReentrantLock reentrantLock = uVar.f11511f;
        reentrantLock.lock();
        try {
            int i6 = uVar.f11510e - 1;
            uVar.f11510e = i6;
            if (i6 == 0) {
                if (uVar.f11509c) {
                    synchronized (uVar) {
                        uVar.f11512g.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // d5.I
    public final K timeout() {
        return K.f11458d;
    }
}
