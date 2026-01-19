package v;

import e1.InterfaceC0961c;
import m4.AbstractC1276k;

/* renamed from: v.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1788b0 implements F0 {
    public final F0 a;

    public C1788b0(F0 f02) {
        this.a = f02;
    }

    @Override // v.F0
    public final int a(InterfaceC0961c interfaceC0961c) {
        return this.a.a(interfaceC0961c);
    }

    @Override // v.F0
    public final int b(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return 0;
    }

    @Override // v.F0
    public final int c(InterfaceC0961c interfaceC0961c, e1.m mVar) {
        return 0;
    }

    @Override // v.F0
    public final int d(InterfaceC0961c interfaceC0961c) {
        return this.a.d(interfaceC0961c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1788b0) {
            return AbstractC1276k.b(this.a, ((C1788b0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(48) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i6 = AbstractC1787b.f15287d;
        if ((48 & i6) == i6) {
            AbstractC1787b.F("Start", sb3);
        }
        int i7 = AbstractC1787b.f15289f;
        if ((48 & i7) == i7) {
            AbstractC1787b.F("Left", sb3);
        }
        AbstractC1787b.F("Top", sb3);
        int i8 = AbstractC1787b.f15288e;
        if ((48 & i8) == i8) {
            AbstractC1787b.F("End", sb3);
        }
        int i9 = AbstractC1787b.f15290g;
        if ((48 & i9) == i9) {
            AbstractC1787b.F("Right", sb3);
        }
        AbstractC1787b.F("Bottom", sb3);
        String sb4 = sb3.toString();
        AbstractC1276k.e(sb4, "toString(...)");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
