package io.ktor.utils.io.internal;

import X3.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x4.InterfaceC1900M;
import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public final class a implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1922e0 f12164c;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1900M f12165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f12166f;

    public a(b bVar, InterfaceC1922e0 interfaceC1922e0) {
        this.f12166f = bVar;
        this.f12164c = interfaceC1922e0;
        InterfaceC1900M H3 = interfaceC1922e0.H(true, true, this);
        if (interfaceC1922e0.d()) {
            this.f12165e = H3;
        }
    }

    public final void a() {
        InterfaceC1900M interfaceC1900M = this.f12165e;
        if (interfaceC1900M != null) {
            this.f12165e = null;
            interfaceC1900M.dispose();
        }
    }

    @Override // l4.c
    public final Object f(Object obj) {
        b bVar;
        Throwable th = (Throwable) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f12168e;
        do {
            bVar = this.f12166f;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, this, null)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == this);
        a();
        if (th != null) {
            b.a(bVar, this.f12164c, th);
        }
        return y.a;
    }
}
