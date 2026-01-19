package D1;

import A4.InterfaceC0007h;
import T.C0621n0;
import X3.y;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.G;
import androidx.lifecycle.O;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import d4.i;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class d extends i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f1260h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1261i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O f1262j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EnumC0842p f1263k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0910h f1264l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f1265m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(O o5, EnumC0842p enumC0842p, InterfaceC0910h interfaceC0910h, InterfaceC0007h interfaceC0007h, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f1262j = o5;
        this.f1263k = enumC0842p;
        this.f1264l = interfaceC0910h;
        this.f1265m = interfaceC0007h;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d) p((InterfaceC0905c) obj2, (C0621n0) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d dVar = new d(this.f1262j, this.f1263k, this.f1264l, this.f1265m, interfaceC0905c);
        dVar.f1261i = obj;
        return dVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object l3;
        int i6 = this.f1260h;
        y yVar = y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        c cVar = new c(this.f1264l, this.f1265m, (C0621n0) this.f1261i, null);
        this.f1260h = 1;
        EnumC0842p enumC0842p = EnumC0842p.f10876e;
        EnumC0842p enumC0842p2 = this.f1263k;
        if (enumC0842p2 == enumC0842p) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        O o5 = this.f1262j;
        EnumC0842p g3 = o5.g();
        EnumC0842p enumC0842p3 = EnumC0842p.f10875c;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (g3 == enumC0842p3 || (l3 = AbstractC1888A.l(new G(o5, enumC0842p2, cVar, null), this)) != enumC0927a) {
            l3 = yVar;
        }
        return l3 == enumC0927a ? enumC0927a : yVar;
    }
}
