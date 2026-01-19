package O4;

import B0.C0028d;
import H0.AbstractC0157l;
import H0.i0;
import Z2.C0741a0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import m4.C1274i;
import p.C1422a0;
import p.C1424b0;
import t.C1676d;
import t.C1677e;
import t.C1682j;
import x4.AbstractC1888A;
import y.X;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends C1274i implements l4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4339l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i6, Object obj, Class cls, String str, String str2, int i7, int i8, int i9) {
        super(i6, obj, cls, str, str2, i7, i8);
        this.f4339l = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, t.d, t.i] */
    /* JADX WARN: Type inference failed for: r6v6, types: [m4.w, java.lang.Object] */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        boolean b5;
        boolean b6;
        switch (this.f4339l) {
            case 0:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                AbstractC1276k.f(serialDescriptor, "p0");
                k kVar = (k) this.f12958e;
                kVar.getClass();
                boolean z5 = !serialDescriptor.k(intValue) && serialDescriptor.j(intValue).c();
                kVar.f4340b = z5;
                return Boolean.valueOf(z5);
            case 1:
                EnumC1245A enumC1245A = (EnumC1245A) obj;
                EnumC1245A enumC1245A2 = (EnumC1245A) obj2;
                h1.u uVar = (h1.u) this.f12958e;
                if (uVar.f11819q && (b5 = enumC1245A2.b()) != enumC1245A.b()) {
                    X x5 = null;
                    if (b5) {
                        Object obj3 = new Object();
                        AbstractC0157l.r(uVar, new C0028d(6, obj3, uVar));
                        X x6 = (X) obj3.f12973c;
                        if (x6 != null) {
                            x6.a();
                            x5 = x6;
                        }
                        uVar.f11902u = x5;
                    } else {
                        X x7 = uVar.f11902u;
                        if (x7 != null) {
                            x7.b();
                        }
                        uVar.f11902u = null;
                    }
                }
                return X3.y.a;
            default:
                EnumC1245A enumC1245A3 = (EnumC1245A) obj;
                EnumC1245A enumC1245A4 = (EnumC1245A) obj2;
                C1424b0 c1424b0 = (C1424b0) this.f12958e;
                if (c1424b0.f11819q && (b6 = enumC1245A4.b()) != enumC1245A3.b()) {
                    l4.c cVar = c1424b0.f13678u;
                    if (cVar != null) {
                        cVar.f(Boolean.valueOf(b6));
                    }
                    if (b6) {
                        AbstractC1888A.y(c1424b0.A0(), null, new C1422a0(c1424b0, null), 3);
                        Object obj4 = new Object();
                        AbstractC0157l.r(c1424b0, new C0741a0(4, obj4, c1424b0));
                        X x8 = (X) obj4.f12973c;
                        if (x8 != null) {
                            x8.a();
                        } else {
                            x8 = null;
                        }
                        c1424b0.f13680w = x8;
                        i0 i0Var = c1424b0.f13681x;
                        if (i0Var != null && i0Var.W0().f11819q) {
                            c1424b0.Q0();
                        }
                    } else {
                        X x9 = c1424b0.f13680w;
                        if (x9 != null) {
                            x9.b();
                        }
                        c1424b0.f13680w = null;
                        c1424b0.Q0();
                    }
                    AbstractC0157l.m(c1424b0);
                    C1682j c1682j = c1424b0.f13677t;
                    if (c1682j != null) {
                        if (b6) {
                            C1676d c1676d = c1424b0.f13679v;
                            if (c1676d != null) {
                                c1424b0.P0(c1682j, new C1677e(c1676d));
                                c1424b0.f13679v = null;
                            }
                            Object obj5 = new Object();
                            c1424b0.P0(c1682j, obj5);
                            c1424b0.f13679v = obj5;
                        } else {
                            C1676d c1676d2 = c1424b0.f13679v;
                            if (c1676d2 != null) {
                                c1424b0.P0(c1682j, new C1677e(c1676d2));
                                c1424b0.f13679v = null;
                            }
                        }
                    }
                }
                return X3.y.a;
        }
    }
}
