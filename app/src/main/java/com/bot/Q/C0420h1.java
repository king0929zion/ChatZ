package Q;

import b4.InterfaceC0905c;

/* renamed from: Q.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420h1 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ float f5840h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.c f5841i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420h1(InterfaceC0905c interfaceC0905c, l4.c cVar) {
        super(3, interfaceC0905c);
        this.f5841i = cVar;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        C0420h1 c0420h1 = new C0420h1((InterfaceC0905c) obj3, this.f5841i);
        c0420h1.f5840h = floatValue;
        X3.y yVar = X3.y.a;
        c0420h1.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f5841i.f(new Float(this.f5840h));
        return X3.y.a;
    }
}
