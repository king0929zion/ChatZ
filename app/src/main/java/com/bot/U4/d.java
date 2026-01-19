package U4;

import B0.B;
import d5.C0949i;
import d5.I;
import d5.q;
import java.io.IOException;
import java.net.ProtocolException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: e, reason: collision with root package name */
    public final long f8694e;

    /* renamed from: f, reason: collision with root package name */
    public long f8695f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8697h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8698i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B f8699j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(B b5, I i6, long j3) {
        super(i6);
        AbstractC1276k.f(i6, "delegate");
        this.f8699j = b5;
        this.f8694e = j3;
        this.f8696g = true;
        if (j3 == 0) {
            c(null);
        }
    }

    @Override // d5.q, d5.I
    public final long W(long j3, C0949i c0949i) {
        AbstractC1276k.f(c0949i, "sink");
        if (this.f8698i) {
            throw new IllegalStateException("closed");
        }
        try {
            long W5 = this.f11498c.W(j3, c0949i);
            if (this.f8696g) {
                this.f8696g = false;
            }
            if (W5 == -1) {
                c(null);
                return -1L;
            }
            long j4 = this.f8695f + W5;
            long j5 = this.f8694e;
            if (j5 == -1 || j4 <= j5) {
                this.f8695f = j4;
                if (j4 == j5) {
                    c(null);
                }
                return W5;
            }
            throw new ProtocolException("expected " + j5 + " bytes but received " + j4);
        } catch (IOException e6) {
            throw c(e6);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f8697h) {
            return iOException;
        }
        this.f8697h = true;
        if (iOException == null && this.f8696g) {
            this.f8696g = false;
        }
        return this.f8699j.a(true, false, iOException);
    }

    @Override // d5.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8698i) {
            return;
        }
        this.f8698i = true;
        try {
            super.close();
            c(null);
        } catch (IOException e6) {
            throw c(e6);
        }
    }
}
