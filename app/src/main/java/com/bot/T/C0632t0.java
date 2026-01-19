package T;

import b4.InterfaceC0905c;

/* renamed from: T.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632t0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8212h;

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0632t0) p((InterfaceC0905c) obj2, (EnumC0630s0) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.t0, d4.i, b4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d4.i iVar = new d4.i(2, interfaceC0905c);
        iVar.f8212h = obj;
        return iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Boolean.valueOf(((EnumC0630s0) this.f8212h) == EnumC0630s0.f8205c);
    }
}
