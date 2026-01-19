package v;

import e1.InterfaceC0961c;
import j1.AbstractC1135a;

/* renamed from: v.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1777A implements F0 {
    public final int a;

    public C1777A(int i6) {
        this.a = i6;
    }

    @Override // v.F0
    public final int a(InterfaceC0961c interfaceC0961c) {
        return 0;
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
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777A)) {
            return false;
        }
        C1777A c1777a = (C1777A) obj;
        c1777a.getClass();
        return this.a == c1777a.a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return AbstractC1135a.i(new StringBuilder("Insets(left=0, top="), this.a, ", right=0, bottom=0)");
    }
}
