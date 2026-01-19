package O;

import F0.InterfaceC0134w;
import T.C0607g0;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import n0.C1353b;
import n0.C1354c;
import u.AbstractC1734b;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4018c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0332s0 f4019e;

    public /* synthetic */ O(C0332s0 c0332s0, int i6) {
        this.f4018c = i6;
        this.f4019e = c0332s0;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        F f6;
        F f7;
        switch (this.f4018c) {
            case 0:
                return new D.Y(this.f4019e, 4);
            case 1:
                long longValue = ((Long) obj).longValue();
                C0332s0 c0332s0 = this.f4019e;
                if (c0332s0.a.a().b(longValue)) {
                    c0332s0.i();
                    c0332s0.l(null);
                }
                return X3.y.a;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                C0332s0 c0332s02 = this.f4019e;
                G f8 = c0332s02.f();
                if (f8 != null && (f7 = f8.a) != null && longValue2 == f7.f3942c) {
                    c0332s02.f4205p.setValue(null);
                }
                G f9 = c0332s02.f();
                if (f9 != null && (f6 = f9.f3945b) != null && longValue2 == f6.f3942c) {
                    c0332s02.f4206q.setValue(null);
                }
                if (c0332s02.a.a().b(longValue2)) {
                    c0332s02.o();
                }
                return X3.y.a;
            case 3:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) obj;
                C0332s0 c0332s03 = this.f4019e;
                C1354c c1354c = (C1354c) c0332s03.f4199j.getValue();
                if (c1354c == null) {
                    return null;
                }
                InterfaceC0134w interfaceC0134w2 = c0332s03.f4201l;
                if (interfaceC0134w2 != null) {
                    return J.i.e(c1354c, interfaceC0134w2, interfaceC0134w);
                }
                AbstractC1734b.d("Required value was null.");
                throw new RuntimeException();
            case 4:
                InterfaceC0134w interfaceC0134w3 = (InterfaceC0134w) obj;
                C0332s0 c0332s04 = this.f4019e;
                c0332s04.f4201l = interfaceC0134w3;
                if (((Boolean) c0332s04.f4198i.getValue()).booleanValue() && c0332s04.f() != null) {
                    C1353b c1353b = interfaceC0134w3 != null ? new C1353b(interfaceC0134w3.e(0L)) : null;
                    if (!AbstractC1276k.b(c0332s04.f4200k, c1353b)) {
                        c0332s04.f4200k = c1353b;
                        c0332s04.m();
                        c0332s04.o();
                    }
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                C0332s0 c0332s05 = this.f4019e;
                C0607g0 c0607g0 = c0332s05.f4198i;
                EnumC1245A enumC1245A = (EnumC1245A) obj;
                if (!enumC1245A.a() && ((Boolean) c0607g0.getValue()).booleanValue()) {
                    c0332s05.i();
                }
                c0607g0.setValue(Boolean.valueOf(enumC1245A.a()));
                return X3.y.a;
            case 6:
                this.f4019e.k(((Boolean) obj).booleanValue());
                return X3.y.a;
            case 7:
                this.f4019e.l((G) obj);
                return X3.y.a;
            default:
                long longValue3 = ((Long) obj).longValue();
                C0332s0 c0332s06 = this.f4019e;
                boolean b5 = c0332s06.a.a().b(longValue3);
                X3.y yVar = X3.y.a;
                if (b5) {
                    c0332s06.f4202m.setValue(yVar);
                    c0332s06.m();
                    c0332s06.o();
                }
                return yVar;
        }
    }
}
