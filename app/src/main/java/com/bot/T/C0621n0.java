package T;

import b4.InterfaceC0910h;
import x4.InterfaceC1942y;

/* renamed from: T.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621n0 implements X, InterfaceC1942y {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f8131c;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0910h f8132e;

    public C0621n0(X x5, InterfaceC0910h interfaceC0910h) {
        this.f8131c = x5;
        this.f8132e = interfaceC0910h;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f8132e;
    }

    @Override // T.d1
    public final Object getValue() {
        return this.f8131c.getValue();
    }

    @Override // T.X
    public final void setValue(Object obj) {
        this.f8131c.setValue(obj);
    }
}
