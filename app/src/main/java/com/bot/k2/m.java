package k2;

import Q4.A;
import d5.AbstractC0942b;
import d5.C;
import d5.InterfaceC0951k;
import d5.y;
import i4.AbstractC1117a;
import java.io.Closeable;
import w2.AbstractC1835e;

/* loaded from: classes.dex */
public final class m extends A {

    /* renamed from: c, reason: collision with root package name */
    public final y f12622c;

    /* renamed from: e, reason: collision with root package name */
    public final d5.o f12623e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12624f;

    /* renamed from: g, reason: collision with root package name */
    public final Closeable f12625g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12626h;

    /* renamed from: i, reason: collision with root package name */
    public C f12627i;

    public m(y yVar, d5.o oVar, String str, Closeable closeable) {
        this.f12622c = yVar;
        this.f12623e = oVar;
        this.f12624f = str;
        this.f12625g = closeable;
    }

    @Override // Q4.A, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f12626h = true;
            C c6 = this.f12627i;
            if (c6 != null) {
                AbstractC1835e.a(c6);
            }
            Closeable closeable = this.f12625g;
            if (closeable != null) {
                AbstractC1835e.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Q4.A
    public final AbstractC1117a f() {
        return null;
    }

    @Override // Q4.A
    public final synchronized InterfaceC0951k h() {
        if (this.f12626h) {
            throw new IllegalStateException("closed");
        }
        C c6 = this.f12627i;
        if (c6 != null) {
            return c6;
        }
        C c7 = AbstractC0942b.c(this.f12623e.l(this.f12622c));
        this.f12627i = c7;
        return c7;
    }
}
