package U4;

import B0.B;
import d5.C0949i;
import d5.G;
import d5.p;
import java.io.IOException;
import java.net.ProtocolException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: e, reason: collision with root package name */
    public final long f8689e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8690f;

    /* renamed from: g, reason: collision with root package name */
    public long f8691g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B f8693i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B b5, G g3, long j3) {
        super(g3);
        AbstractC1276k.f(g3, "delegate");
        this.f8693i = b5;
        this.f8689e = j3;
    }

    @Override // d5.p, d5.G
    public final void T(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "source");
        if (this.f8692h) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f8689e;
        if (j4 == -1 || this.f8691g + j3 <= j4) {
            try {
                super.T(j3, c0949i);
                this.f8691g += j3;
                return;
            } catch (IOException e6) {
                throw c(e6);
            }
        }
        throw new ProtocolException("expected " + j4 + " bytes but received " + (this.f8691g + j3));
    }

    public final IOException c(IOException iOException) {
        if (this.f8690f) {
            return iOException;
        }
        this.f8690f = true;
        return this.f8693i.a(false, true, iOException);
    }

    @Override // d5.p, d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8692h) {
            return;
        }
        this.f8692h = true;
        long j3 = this.f8689e;
        if (j3 != -1 && this.f8691g != j3) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            c(null);
        } catch (IOException e6) {
            throw c(e6);
        }
    }

    @Override // d5.p, d5.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e6) {
            throw c(e6);
        }
    }
}
