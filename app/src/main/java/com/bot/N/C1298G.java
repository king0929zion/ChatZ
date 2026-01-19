package n;

import b4.InterfaceC0905c;

/* renamed from: n.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1298G extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ float f12997h;

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1298G) p((InterfaceC0905c) obj2, Float.valueOf(((Number) obj).floatValue()))).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d4.i, n.G, b4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d4.i iVar = new d4.i(2, interfaceC0905c);
        iVar.f12997h = ((Number) obj).floatValue();
        return iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Boolean.valueOf(this.f12997h > S.l.f7374V);
    }
}
