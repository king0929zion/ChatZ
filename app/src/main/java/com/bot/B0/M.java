package B0;

import D.AbstractC0090r0;
import D.EnumC0083n0;
import F0.AbstractC0137z;
import F0.InterfaceC0134w;
import O.C0332s0;
import T.InterfaceC0604f;
import m4.AbstractC1276k;
import o0.C1382D;
import x4.C1928k;
import z0.C2014b;

/* loaded from: classes.dex */
public final class M implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f400c;

    /* renamed from: e, reason: collision with root package name */
    public Object f401e;

    @Override // l4.c
    public final Object f(Object obj) {
        boolean z5;
        switch (this.f400c) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                I i6 = (I) this.f401e;
                if (i6 != null) {
                    i6.f396c = booleanValue;
                }
                return X3.y.a;
            case 1:
                float[] fArr = ((C1382D) obj).a;
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f401e;
                if (interfaceC0134w.j()) {
                    AbstractC0137z.h(interfaceC0134w).L(interfaceC0134w, fArr);
                }
                return X3.y.a;
            case 2:
                if (AbstractC0090r0.a.a(((C2014b) obj).a) == EnumC0083n0.COPY) {
                    ((C0332s0) this.f401e).b();
                    z5 = true;
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 3:
                ((InterfaceC0604f) this.f401e).cancel();
                return X3.y.a;
            case 4:
                Z2.C c6 = (Z2.C) obj;
                AbstractC1276k.f(c6, "it");
                return Boolean.valueOf(AbstractC1276k.b(c6.a, ((Z2.C) this.f401e).a));
            default:
                C1928k c1928k = (C1928k) this.f401e;
                X3.y yVar = X3.y.a;
                c1928k.k(yVar);
                return yVar;
        }
    }

    public /* synthetic */ M(Object obj, int i6) {
        this.f400c = i6;
        this.f401e = obj;
    }
}
