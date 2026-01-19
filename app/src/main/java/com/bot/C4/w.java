package C4;

import b4.C0911i;
import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import x4.u0;

/* loaded from: classes.dex */
public final class w implements u0 {

    /* renamed from: c, reason: collision with root package name */
    public final Object f718c;

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f719e;

    /* renamed from: f, reason: collision with root package name */
    public final x f720f;

    public w(P1.u uVar, ThreadLocal threadLocal) {
        this.f718c = uVar;
        this.f719e = threadLocal;
        this.f720f = new x(threadLocal);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    public final void a(Object obj) {
        this.f719e.set(obj);
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return this.f720f;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return this.f720f.equals(interfaceC0909g) ? C0911i.f11057c : this;
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        if (this.f720f.equals(interfaceC0909g)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f718c + ", threadLocal = " + this.f719e + ')';
    }

    @Override // x4.u0
    public final Object u(InterfaceC0910h interfaceC0910h) {
        ThreadLocal threadLocal = this.f719e;
        Object obj = threadLocal.get();
        threadLocal.set(this.f718c);
        return obj;
    }
}
