package P1;

import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class a implements InterfaceC0908f {

    /* renamed from: e, reason: collision with root package name */
    public static final F2.h f4552e = new F2.h(13);

    /* renamed from: c, reason: collision with root package name */
    public final u f4553c;

    public a(u uVar) {
        AbstractC1276k.f(uVar, "connectionWrapper");
        this.f4553c = uVar;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return f4552e;
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
