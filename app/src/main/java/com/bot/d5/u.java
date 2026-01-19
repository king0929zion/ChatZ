package d5;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class u implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public boolean f11509c;

    /* renamed from: e, reason: collision with root package name */
    public int f11510e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f11511f = new ReentrantLock();

    /* renamed from: g, reason: collision with root package name */
    public final RandomAccessFile f11512g;

    public u(RandomAccessFile randomAccessFile) {
        this.f11512g = randomAccessFile;
    }

    public final m c(long j3) {
        ReentrantLock reentrantLock = this.f11511f;
        reentrantLock.lock();
        try {
            if (this.f11509c) {
                throw new IllegalStateException("closed");
            }
            this.f11510e++;
            reentrantLock.unlock();
            return new m(this, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f11511f;
        reentrantLock.lock();
        try {
            if (this.f11509c) {
                return;
            }
            this.f11509c = true;
            if (this.f11510e != 0) {
                return;
            }
            synchronized (this) {
                this.f11512g.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f11511f;
        reentrantLock.lock();
        try {
            if (this.f11509c) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f11512g.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
