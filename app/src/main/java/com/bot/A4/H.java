package A4;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class H extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f175h;

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((H) p((InterfaceC0905c) obj2, Integer.valueOf(((Number) obj).intValue()))).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A4.H, d4.i, b4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        ?? iVar = new d4.i(2, interfaceC0905c);
        iVar.f175h = ((Number) obj).intValue();
        return iVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Boolean.valueOf(this.f175h > 0);
    }
}
