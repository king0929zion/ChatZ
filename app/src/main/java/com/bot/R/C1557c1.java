package r;

import b4.InterfaceC0905c;
import m4.C1285t;

/* renamed from: r.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557c1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1285t f14273i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f14274j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557c1(C1285t c1285t, float f6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14273i = c1285t;
        this.f14274j = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C1557c1 c1557c1 = (C1557c1) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj);
        X3.y yVar = X3.y.a;
        c1557c1.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1557c1 c1557c1 = new C1557c1(this.f14273i, this.f14274j, interfaceC0905c);
        c1557c1.f14272h = obj;
        return c1557c1;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f14273i.f12970c = ((InterfaceC1563e1) this.f14272h).a(this.f14274j);
        return X3.y.a;
    }
}
