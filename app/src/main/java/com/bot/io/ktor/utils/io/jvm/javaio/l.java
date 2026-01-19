package io.ktor.utils.io.jvm.javaio;

import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import x4.AbstractC1939v;

/* loaded from: classes.dex */
public final class l extends AbstractC1939v {

    /* renamed from: f, reason: collision with root package name */
    public static final l f12217f = new AbstractC1939v();

    @Override // x4.AbstractC1939v
    public final void d0(InterfaceC0910h interfaceC0910h, Runnable runnable) {
        AbstractC1276k.f(interfaceC0910h, "context");
        AbstractC1276k.f(runnable, "block");
        runnable.run();
    }

    @Override // x4.AbstractC1939v
    public final boolean f0(InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(interfaceC0910h, "context");
        return true;
    }
}
