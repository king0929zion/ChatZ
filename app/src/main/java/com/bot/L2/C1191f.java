package l2;

import d5.C0949i;
import d5.G;
import d5.p;
import java.io.IOException;

/* renamed from: l2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191f extends p {

    /* renamed from: e, reason: collision with root package name */
    public final W0.e f12706e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12707f;

    public C1191f(G g3, W0.e eVar) {
        super(g3);
        this.f12706e = eVar;
    }

    @Override // d5.p, d5.G
    public final void T(long j3, C0949i c0949i) {
        if (this.f12707f) {
            c0949i.skip(j3);
            return;
        }
        try {
            super.T(j3, c0949i);
        } catch (IOException e6) {
            this.f12707f = true;
            this.f12706e.f(e6);
        }
    }

    @Override // d5.p, d5.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e6) {
            this.f12707f = true;
            this.f12706e.f(e6);
        }
    }

    @Override // d5.p, d5.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e6) {
            this.f12707f = true;
            this.f12706e.f(e6);
        }
    }
}
