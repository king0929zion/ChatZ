package z3;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.InputStream;
import m4.AbstractC1276k;
import u3.C1759c;

/* renamed from: z3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2044n extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.jvm.javaio.h f16286c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q3.f f16287e;

    public C2044n(io.ktor.utils.io.jvm.javaio.h hVar, Q3.f fVar) {
        this.f16286c = hVar;
        this.f16287e = fVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f16286c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f16286c.close();
        Y4.d.u(((C1759c) this.f16287e.f6466c).e());
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f16286c.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        AbstractC1276k.f(bArr, FlexmarkHtmlConverter.B_NODE);
        return this.f16286c.read(bArr, i6, i7);
    }
}
