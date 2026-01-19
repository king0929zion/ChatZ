package c;

import B0.C0033i;
import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f11093h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11094i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, boolean z5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11093h = nVar;
        this.f11094i = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        o oVar = (o) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        oVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new o(this.f11093h, this.f11094i, interfaceC0905c);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [m4.i, l4.a] */
    @Override // d4.a
    public final Object r(Object obj) {
        C0033i c0033i;
        X3.a.e(obj);
        n nVar = this.f11093h;
        boolean z5 = this.f11094i;
        if (!z5 && !nVar.f11092g && nVar.a && (c0033i = nVar.f11091f) != null) {
            c0033i.h();
        }
        nVar.a = z5;
        ?? r32 = nVar.f10957c;
        if (r32 != 0) {
            r32.b();
        }
        return y.a;
    }
}
