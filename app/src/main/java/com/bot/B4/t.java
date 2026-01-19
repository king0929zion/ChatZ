package B4;

import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class t implements InterfaceC0910h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0910h f632c;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f633e;

    public t(InterfaceC0910h interfaceC0910h, Throwable th) {
        this.f632c = interfaceC0910h;
        this.f633e = th;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return this.f632c.Y(interfaceC0910h);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return this.f632c.h(interfaceC0909g);
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return this.f632c.q(obj, eVar);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        return this.f632c.r(interfaceC0909g);
    }
}
