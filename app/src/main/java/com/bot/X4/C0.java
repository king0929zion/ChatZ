package x4;

import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class C0 implements InterfaceC0908f, InterfaceC0909g {

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f15651c = new Object();

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return this;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return Y4.d.L(this, interfaceC0909g);
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        return Y4.d.F(this, interfaceC0909g);
    }
}
