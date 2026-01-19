package io.ktor.utils.io.jvm.javaio;

import i4.AbstractC1120d;
import io.ktor.utils.io.t;
import io.ktor.utils.io.y;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import m4.AbstractC1276k;
import x4.InterfaceC1900M;
import x4.InterfaceC1914a0;
import x4.InterfaceC1922e0;
import x4.g0;
import x4.l0;

/* loaded from: classes.dex */
public final class h extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public final y f12208c;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f12209e;

    /* renamed from: f, reason: collision with root package name */
    public final g f12210f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f12211g;

    public h(InterfaceC1922e0 interfaceC1922e0, y yVar) {
        AbstractC1276k.f(yVar, "channel");
        this.f12208c = yVar;
        this.f12209e = new g0(interfaceC1922e0);
        this.f12210f = new g(interfaceC1922e0, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((t) this.f12208c).n();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            AbstractC1120d.e(this.f12208c);
            g0 g0Var = this.f12209e;
            g0Var.getClass();
            if (l0.f15714c.get(g0Var) instanceof InterfaceC1914a0) {
                this.f12209e.f(null);
            }
            g gVar = this.f12210f;
            InterfaceC1900M interfaceC1900M = gVar.f12197c;
            if (interfaceC1900M != null) {
                interfaceC1900M.dispose();
            }
            gVar.f12196b.k(X3.a.b(new CancellationException("Stream closed")));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.f12211g;
            if (bArr == null) {
                bArr = new byte[1];
                this.f12211g = bArr;
            }
            int b5 = this.f12210f.b(bArr, 0, 1);
            if (b5 == -1) {
                return -1;
            }
            if (b5 == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + b5 + " bytes.").toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i7) {
        g gVar;
        gVar = this.f12210f;
        AbstractC1276k.c(bArr);
        return gVar.b(bArr, i6, i7);
    }
}
