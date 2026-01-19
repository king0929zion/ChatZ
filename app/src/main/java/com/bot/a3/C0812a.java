package a3;

import Y2.EnumC0731u;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812a {
    public final EnumC0731u a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10635b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10636c;

    public C0812a(EnumC0731u enumC0731u, List list, String str, int i6) {
        enumC0731u = (i6 & 1) != 0 ? EnumC0731u.f9773c : enumC0731u;
        list = (i6 & 2) != 0 ? Y3.v.f9812c : list;
        str = (i6 & 4) != 0 ? null : str;
        AbstractC1276k.f(list, "tools");
        this.a = enumC0731u;
        this.f10635b = list;
        this.f10636c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0812a)) {
            return false;
        }
        C0812a c0812a = (C0812a) obj;
        return this.a == c0812a.a && AbstractC1276k.b(this.f10635b, c0812a.f10635b) && AbstractC1276k.b(this.f10636c, c0812a.f10636c);
    }

    public final int hashCode() {
        int e6 = AbstractC1135a.e(this.f10635b, this.a.hashCode() * 31, 31);
        String str = this.f10636c;
        return e6 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("McpConnectionResult(status=");
        sb.append(this.a);
        sb.append(", tools=");
        sb.append(this.f10635b);
        sb.append(", errorMessage=");
        return B3.e.s(sb, this.f10636c, ")");
    }
}
