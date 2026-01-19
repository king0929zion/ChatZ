package y4;

import C4.g;
import C4.o;
import Z2.X;
import android.os.Handler;
import android.os.Looper;
import b4.InterfaceC0910h;
import java.util.concurrent.CancellationException;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.AbstractC1939v;
import x4.C1928k;
import x4.InterfaceC1893F;
import x4.InterfaceC1900M;
import x4.p0;

/* renamed from: y4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1998d extends AbstractC1939v implements InterfaceC1893F {

    /* renamed from: f, reason: collision with root package name */
    public final Handler f16020f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16021g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16022h;

    /* renamed from: i, reason: collision with root package name */
    public final C1998d f16023i;

    public C1998d(Handler handler, String str, boolean z5) {
        this.f16020f = handler;
        this.f16021g = str;
        this.f16022h = z5;
        this.f16023i = z5 ? this : new C1998d(handler, str, true);
    }

    @Override // x4.InterfaceC1893F
    public final InterfaceC1900M c(long j3, final Runnable runnable, InterfaceC0910h interfaceC0910h) {
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f16020f.postDelayed(runnable, j3)) {
            return new InterfaceC1900M() { // from class: y4.c
                @Override // x4.InterfaceC1900M
                public final void dispose() {
                    C1998d.this.f16020f.removeCallbacks(runnable);
                }
            };
        }
        h0(interfaceC0910h, runnable);
        return p0.f15721c;
    }

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        if (this.f16020f.post(runnable)) {
            return;
        }
        h0(interfaceC0910h, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1998d)) {
            return false;
        }
        C1998d c1998d = (C1998d) obj;
        return c1998d.f16020f == this.f16020f && c1998d.f16022h == this.f16022h;
    }

    @Override // x4.AbstractC1939v
    public final boolean f0(InterfaceC0910h interfaceC0910h) {
        return (this.f16022h && AbstractC1276k.b(Looper.myLooper(), this.f16020f.getLooper())) ? false : true;
    }

    @Override // x4.AbstractC1939v
    public AbstractC1939v g0(int i6) {
        C4.a.a(i6);
        return this;
    }

    public final void h0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        AbstractC1888A.i(interfaceC0910h, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        E4.e eVar = AbstractC1898K.a;
        E4.d.f1360f.d0(interfaceC0910h, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f16020f) ^ (this.f16022h ? 1231 : 1237);
    }

    @Override // x4.InterfaceC1893F
    public final void p(long j3, C1928k c1928k) {
        g gVar = new g(4, c1928k, this);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f16020f.postDelayed(gVar, j3)) {
            c1928k.v(new X(25, this, gVar));
        } else {
            h0(c1928k.f15708h, gVar);
        }
    }

    @Override // x4.AbstractC1939v
    public final String toString() {
        C1998d c1998d;
        String str;
        E4.e eVar = AbstractC1898K.a;
        C1998d c1998d2 = o.a;
        if (this == c1998d2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c1998d = c1998d2.f16023i;
            } catch (UnsupportedOperationException unused) {
                c1998d = null;
            }
            str = this == c1998d ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f16021g;
        if (str2 == null) {
            str2 = this.f16020f.toString();
        }
        return this.f16022h ? B3.e.n(str2, ".immediate") : str2;
    }

    public C1998d(Handler handler) {
        this(handler, null, false);
    }
}
