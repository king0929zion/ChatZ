package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;

@Deprecated
/* loaded from: classes.dex */
public final class ConstrainableInputStream extends BufferedInputStream {
    private final boolean capped;
    private boolean interrupted;
    private final int maxSize;
    private int remaining;
    private long startTime;
    private long timeout;

    private ConstrainableInputStream(InputStream inputStream, int i6, int i7) {
        super(inputStream, i6);
        this.timeout = 0L;
        Validate.isTrue(i7 >= 0);
        this.maxSize = i7;
        this.remaining = i7;
        this.capped = i7 != 0;
        this.startTime = System.nanoTime();
    }

    private boolean expired() {
        return this.timeout != 0 && System.nanoTime() - this.startTime > this.timeout;
    }

    public static ConstrainableInputStream wrap(InputStream inputStream, int i6, int i7) {
        return inputStream instanceof ConstrainableInputStream ? (ConstrainableInputStream) inputStream : new ConstrainableInputStream(inputStream, i6, i7);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i6, int i7) {
        int i8;
        if (this.interrupted || (this.capped && this.remaining <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.interrupted = true;
            return -1;
        }
        if (expired()) {
            throw new SocketTimeoutException("Read timeout");
        }
        if (this.capped && i7 > (i8 = this.remaining)) {
            i7 = i8;
        }
        try {
            int read = super.read(bArr, i6, i7);
            this.remaining -= read;
            return read;
        } catch (SocketTimeoutException unused) {
            return 0;
        }
    }

    public ByteBuffer readToByteBuffer(int i6) {
        return DataUtil.readToByteBuffer(this, i6);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.remaining = this.maxSize - ((BufferedInputStream) this).markpos;
    }

    public ConstrainableInputStream timeout(long j3, long j4) {
        this.startTime = j3;
        this.timeout = j4 * 1000000;
        return this;
    }
}
