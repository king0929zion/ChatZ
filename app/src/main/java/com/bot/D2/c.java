package D2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1273b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1274c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1275d;

    public c(boolean z5, boolean z6, Integer num, b bVar) {
        AbstractC1276k.f(bVar, "strategy");
        this.a = z5;
        this.f1273b = z6;
        this.f1274c = num;
        this.f1275d = bVar;
    }

    public final Integer a() {
        return this.f1274c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.f1273b == cVar.f1273b && AbstractC1276k.b(this.f1274c, cVar.f1274c) && this.f1275d == cVar.f1275d;
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(Boolean.hashCode(this.a) * 31, 31, this.f1273b);
        Integer num = this.f1274c;
        return this.f1275d.hashCode() + ((d6 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "ReasoningSupport(supported=" + this.a + ", forced=" + this.f1273b + ", maxBudget=" + this.f1274c + ", strategy=" + this.f1275d + ")";
    }

    public /* synthetic */ c() {
        this(false, false, null, b.f1267e);
    }
}
