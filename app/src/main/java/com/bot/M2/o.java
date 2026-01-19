package M2;

import I2.E;
import X2.C0696k;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3364h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3365i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f3366j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0696k f3367k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f3368l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f3369m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f3370n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, C0696k c0696k, List list2, t tVar, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3366j = list;
        this.f3367k = c0696k;
        this.f3368l = list2;
        this.f3369m = tVar;
        this.f3370n = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((o) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        o oVar = new o(this.f3366j, this.f3367k, this.f3368l, this.f3369m, this.f3370n, interfaceC0905c);
        oVar.f3365i = obj;
        return oVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f3365i;
        int i6 = this.f3364h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        List list = this.f3366j;
        ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1888A.f(interfaceC1942y, null, new n(this.f3367k, (E) it.next(), this.f3368l, this.f3369m, this.f3370n, null), 3));
        }
        this.f3365i = null;
        this.f3364h = 1;
        Object g3 = AbstractC1888A.g(arrayList, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return g3 == enumC0927a ? enumC0927a : g3;
    }
}
