package v;

import e1.C0959a;
import j1.AbstractC1135a;
import k.C1165l;

/* renamed from: v.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1782F {
    public final void a(F0.U u5, F0.U u6, long j3) {
        long m3 = AbstractC1787b.m(j3, Y.f15277c);
        if (u5 != null) {
            int o5 = u5.o(C0959a.g(m3));
            new C1165l(C1165l.a(o5, u5.a0(o5)));
        }
        if (u6 != null) {
            int o6 = u6.o(C0959a.g(m3));
            new C1165l(C1165l.a(o6, u6.a0(o6)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782F)) {
            return false;
        }
        ((C1782F) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC1135a.b(0, EnumC1780D.f15205c.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + EnumC1780D.f15205c + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
