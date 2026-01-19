package a3;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: a3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809G {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10621c;

    public C0809G(String str, List list, boolean z5) {
        AbstractC1276k.f(list, "models");
        this.a = list;
        this.f10620b = z5;
        this.f10621c = str;
    }

    public static C0809G a(C0809G c0809g, boolean z5, String str) {
        List list = c0809g.a;
        c0809g.getClass();
        AbstractC1276k.f(list, "models");
        return new C0809G(str, list, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0809G)) {
            return false;
        }
        C0809G c0809g = (C0809G) obj;
        return AbstractC1276k.b(this.a, c0809g.a) && this.f10620b == c0809g.f10620b && AbstractC1276k.b(this.f10621c, c0809g.f10621c);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f10620b);
        String str = this.f10621c;
        return d6 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProviderModelsState(models=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.f10620b);
        sb.append(", errorMessage=");
        return B3.e.s(sb, this.f10621c, ")");
    }

    public /* synthetic */ C0809G() {
        this(null, Y3.v.f9812c, false);
    }
}
