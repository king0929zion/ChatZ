package F4;

import X3.y;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import m4.C1274i;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends C1274i implements l4.f {

    /* renamed from: l, reason: collision with root package name */
    public static final a f1607l = new C1274i(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j3 = bVar.a;
        y yVar = y.a;
        if (j3 <= 0) {
            ((e) fVar).f1625h = yVar;
            return yVar;
        }
        C4.g gVar = new C4.g(1, fVar, bVar);
        AbstractC1276k.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        InterfaceC0910h interfaceC0910h = eVar.f1621c;
        eVar.f1623f = AbstractC1888A.p(interfaceC0910h).c(j3, gVar, interfaceC0910h);
        return yVar;
    }
}
