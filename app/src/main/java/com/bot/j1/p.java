package J1;

import T.X;
import b4.InterfaceC0905c;
import f0.C0996s;
import java.util.List;
import java.util.Set;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class p extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f2854h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f2855i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0996s f2856j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(X x5, r rVar, C0996s c0996s, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2854h = x5;
        this.f2855i = rVar;
        this.f2856j = c0996s;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        p pVar = (p) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        pVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new p(this.f2854h, this.f2855i, this.f2856j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        for (I1.j jVar : (Set) this.f2854h.getValue()) {
            r rVar = this.f2855i;
            if (!((List) rVar.b().f2556e.f201c.getValue()).contains(jVar) && !this.f2856j.contains(jVar)) {
                rVar.b().c(jVar);
            }
        }
        return X3.y.a;
    }
}
