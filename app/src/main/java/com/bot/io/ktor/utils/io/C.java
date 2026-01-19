package io.ktor.utils.io;

import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class C implements InterfaceC1942y {

    /* renamed from: c, reason: collision with root package name */
    public final t f12089c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f12090e;

    public C(InterfaceC1942y interfaceC1942y, t tVar) {
        AbstractC1276k.f(interfaceC1942y, "delegate");
        this.f12089c = tVar;
        this.f12090e = interfaceC1942y;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f12090e.c();
    }
}
