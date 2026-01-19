package k2;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f12618c;

    /* renamed from: e, reason: collision with root package name */
    public int f12619e = 1073741824;

    public i(InputStream inputStream) {
        this.f12618c = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f12619e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12618c.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f12618c.read();
        if (read == -1) {
            this.f12619e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j3) {
        return this.f12618c.skip(j3);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f12618c.read(bArr);
        if (read == -1) {
            this.f12619e = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int read = this.f12618c.read(bArr, i6, i7);
        if (read == -1) {
            this.f12619e = 0;
        }
        return read;
    }
}
