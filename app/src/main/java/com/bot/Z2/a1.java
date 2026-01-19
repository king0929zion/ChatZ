package Z2;

import j1.AbstractC1135a;

/* loaded from: classes.dex */
public final class a1 {
    public final D2.e a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10145b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10146c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10147d;

    public a1(D2.e eVar, boolean z5, boolean z6, boolean z7) {
        this.a = eVar;
        this.f10145b = z5;
        this.f10146c = z6;
        this.f10147d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a == a1Var.a && this.f10145b == a1Var.f10145b && this.f10146c == a1Var.f10146c && this.f10147d == a1Var.f10147d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10147d) + AbstractC1135a.d(AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f10145b), 31, this.f10146c);
    }

    public final String toString() {
        return "SearchServiceItem(id=" + this.a + ", isSelected=" + this.f10145b + ", requiresApiKey=" + this.f10146c + ", isConfigured=" + this.f10147d + ")";
    }
}
