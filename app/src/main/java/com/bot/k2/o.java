package k2;

import Q4.A;
import d5.InterfaceC0951k;
import d5.v;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import w2.AbstractC1835e;

/* loaded from: classes.dex */
public final class o extends A {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1117a f12629c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12630e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0951k f12631f;

    public o(InterfaceC0951k interfaceC0951k, AbstractC1117a abstractC1117a) {
        this.f12629c = abstractC1117a;
        this.f12631f = interfaceC0951k;
    }

    @Override // Q4.A, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f12630e = true;
        InterfaceC0951k interfaceC0951k = this.f12631f;
        if (interfaceC0951k != null) {
            AbstractC1835e.a(interfaceC0951k);
        }
    }

    @Override // Q4.A
    public final AbstractC1117a f() {
        return this.f12629c;
    }

    @Override // Q4.A
    public final synchronized InterfaceC0951k h() {
        InterfaceC0951k interfaceC0951k;
        try {
            if (this.f12630e) {
                throw new IllegalStateException("closed");
            }
            interfaceC0951k = this.f12631f;
            if (interfaceC0951k == null) {
                v vVar = d5.o.a;
                AbstractC1276k.c(null);
                vVar.l(null);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC0951k;
    }
}
