package A1;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: c, reason: collision with root package name */
    public final DataInputStream f60c;

    /* renamed from: e, reason: collision with root package name */
    public int f61e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f62f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f63g;

    /* renamed from: h, reason: collision with root package name */
    public final int f64h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(byte[] r3) {
        /*
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r1 = 0
            r2.<init>(r0, r1)
            int r3 = r3.length
            r2.f64h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.b.<init>(byte[]):void");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f60c.available();
    }

    public final void c(int i6) {
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i6 - i7;
            DataInputStream dataInputStream = this.f60c;
            int skip = (int) dataInputStream.skip(i8);
            if (skip <= 0) {
                if (this.f63g == null) {
                    this.f63g = new byte[8192];
                }
                skip = dataInputStream.read(this.f63g, 0, Math.min(8192, i8));
                if (skip == -1) {
                    throw new EOFException(B3.e.l("Reached EOF while skipping ", i6, " bytes."));
                }
            }
            i7 += skip;
        }
        this.f61e += i7;
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f61e++;
        return this.f60c.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f61e++;
        return this.f60c.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f61e++;
        int read = this.f60c.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f61e += 2;
        return this.f60c.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i6, int i7) {
        this.f61e += i7;
        this.f60c.readFully(bArr, i6, i7);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f61e += 4;
        DataInputStream dataInputStream = this.f60c;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f62f;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f62f);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j3;
        long j4;
        this.f61e += 8;
        DataInputStream dataInputStream = this.f60c;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f62f;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j3 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j4 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f62f);
            }
            j3 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j4 = read8;
        }
        return j3 + j4;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f61e += 2;
        DataInputStream dataInputStream = this.f60c;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f62f;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f62f);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f61e += 2;
        return this.f60c.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f61e++;
        return this.f60c.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f61e += 2;
        DataInputStream dataInputStream = this.f60c;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f62f;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f62f);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i6) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int read = this.f60c.read(bArr, i6, i7);
        this.f61e += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f61e += bArr.length;
        this.f60c.readFully(bArr);
    }

    public b(InputStream inputStream, int i6) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f60c = dataInputStream;
        dataInputStream.mark(0);
        this.f61e = 0;
        this.f62f = byteOrder;
        this.f64h = inputStream instanceof b ? ((b) inputStream).f64h : -1;
    }
}
