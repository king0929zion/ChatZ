package T;

import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: T.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0623o0 {
    public final T a;

    public AbstractC0623o0(InterfaceC1193a interfaceC1193a) {
        this.a = new T(interfaceC1193a);
    }

    public abstract C0625p0 a(Object obj);

    public g1 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g1 c(C0625p0 c0625p0, g1 g1Var) {
        I i6 = null;
        if (g1Var instanceof I) {
            if (c0625p0.f8142d) {
                i6 = (I) g1Var;
                i6.a.setValue(c0625p0.a());
            }
        } else if (g1Var instanceof f1) {
            if ((c0625p0.f8140b || c0625p0.f8143e != null) && !c0625p0.f8142d) {
                f1 f1Var = (f1) g1Var;
                if (AbstractC1276k.b(c0625p0.a(), f1Var.a)) {
                    i6 = f1Var;
                }
            }
        } else if (g1Var instanceof C) {
            c0625p0.getClass();
            l4.c cVar = ((C) g1Var).a;
        }
        if (i6 != null) {
            return i6;
        }
        if (!c0625p0.f8142d) {
            return new f1(c0625p0.a());
        }
        Object obj = c0625p0.f8143e;
        R0 r02 = c0625p0.f8141c;
        if (r02 == null) {
            r02 = C0602e.f8083j;
        }
        return new I(new C0607g0(obj, r02));
    }
}
