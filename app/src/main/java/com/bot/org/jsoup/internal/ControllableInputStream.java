package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.Validate;

/* loaded from: classes.dex */
public class ControllableInputStream extends FilterInputStream {
    private final BufferedInputStream buff;
    private final boolean capped;
    private boolean interrupted;
    private int markPos;
    private final int maxSize;
    private int remaining;
    private long startTime;
    private long timeout;

    private ControllableInputStream(BufferedInputStream bufferedInputStream, int i6) {
        super(bufferedInputStream);
        this.timeout = 0L;
        Validate.isTrue(i6 >= 0);
        this.buff = bufferedInputStream;
        this.capped = i6 != 0;
        this.maxSize = i6;
        this.remaining = i6;
        this.markPos = -1;
        this.startTime = System.nanoTime();
    }

    private boolean expired() {
        return this.timeout != 0 && System.nanoTime() - this.startTime > this.timeout;
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int i6) {
        Validate.isTrue(i6 >= 0, "maxSize must be 0 (unlimited) or larger");
        Validate.notNull(inputStream);
        boolean z5 = i6 > 0;
        int i7 = SharedConstants.DefaultBufferSize;
        if (z5 && i6 < 32768) {
            i7 = i6;
        }
        byte[] bArr = new byte[i7];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        while (true) {
            int read = inputStream.read(bArr, 0, z5 ? Math.min(i6, i7) : i7);
            if (read == -1) {
                break;
            }
            if (z5) {
                if (read >= i6) {
                    byteArrayOutputStream.write(bArr, 0, i6);
                    break;
                }
                i6 -= read;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    public static ControllableInputStream wrap(InputStream inputStream, int i6, int i7) {
        return inputStream instanceof ControllableInputStream ? (ControllableInputStream) inputStream : inputStream instanceof BufferedInputStream ? new ControllableInputStream((BufferedInputStream) inputStream, i7) : new ControllableInputStream(new BufferedInputStream(inputStream, i6), i7);
    }

    public BufferedInputStream inputStream() {
        return this.buff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i6) {
        super.mark(i6);
        this.markPos = this.maxSize - this.remaining;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.remaining = this.maxSize - this.markPos;
    }

    public ControllableInputStream timeout(long j3, long j4) {
        this.startTime = j3;
        this.timeout = j4 * 1000000;
        return this;
    }
}
