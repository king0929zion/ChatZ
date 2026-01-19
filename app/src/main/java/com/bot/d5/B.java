package d5;

import com.vladsch.flexmark.util.format.TableCell;
import java.io.IOException;
import java.io.InputStream;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f11443c;

    public B(C c6) {
        this.f11443c = c6;
    }

    @Override // java.io.InputStream
    public final int available() {
        C c6 = this.f11443c;
        if (c6.f11446f) {
            throw new IOException("closed");
        }
        return (int) Math.min(c6.f11445e.f11482e, TableCell.NOT_TRACKED);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11443c.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        C c6 = this.f11443c;
        C0949i c0949i = c6.f11445e;
        if (c6.f11446f) {
            throw new IOException("closed");
        }
        if (c0949i.f11482e == 0 && c6.f11444c.W(8192L, c0949i) == -1) {
            return -1;
        }
        return c0949i.readByte() & 255;
    }

    public final String toString() {
        return this.f11443c + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        AbstractC1276k.f(bArr, "data");
        C c6 = this.f11443c;
        C0949i c0949i = c6.f11445e;
        if (!c6.f11446f) {
            AbstractC0942b.e(bArr.length, i6, i7);
            if (c0949i.f11482e == 0 && c6.f11444c.W(8192L, c0949i) == -1) {
                return -1;
            }
            return c0949i.read(bArr, i6, i7);
        }
        throw new IOException("closed");
    }
}
