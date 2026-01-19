package m;

import j1.AbstractC1135a;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d0 {
    public final C1212T a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f12787b;

    /* renamed from: c, reason: collision with root package name */
    public final C1197D f12788c;

    /* renamed from: d, reason: collision with root package name */
    public final C1217Y f12789d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12790e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f12791f;

    public d0(C1212T c1212t, b0 b0Var, C1197D c1197d, C1217Y c1217y, boolean z5, Map map) {
        this.a = c1212t;
        this.f12787b = b0Var;
        this.f12788c = c1197d;
        this.f12789d = c1217y;
        this.f12790e = z5;
        this.f12791f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return AbstractC1276k.b(this.a, d0Var.a) && AbstractC1276k.b(this.f12787b, d0Var.f12787b) && AbstractC1276k.b(this.f12788c, d0Var.f12788c) && AbstractC1276k.b(this.f12789d, d0Var.f12789d) && this.f12790e == d0Var.f12790e && AbstractC1276k.b(this.f12791f, d0Var.f12791f);
    }

    public final int hashCode() {
        C1212T c1212t = this.a;
        int hashCode = (c1212t == null ? 0 : c1212t.hashCode()) * 31;
        b0 b0Var = this.f12787b;
        int hashCode2 = (hashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        C1197D c1197d = this.f12788c;
        int hashCode3 = (hashCode2 + (c1197d == null ? 0 : c1197d.hashCode())) * 31;
        C1217Y c1217y = this.f12789d;
        return this.f12791f.hashCode() + AbstractC1135a.d((hashCode3 + (c1217y != null ? c1217y.hashCode() : 0)) * 961, 31, this.f12790e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.f12787b + ", changeSize=" + this.f12788c + ", scale=" + this.f12789d + ", veil=null, hold=" + this.f12790e + ", effectsMap=" + this.f12791f + ')';
    }

    public /* synthetic */ d0(C1212T c1212t, b0 b0Var, C1197D c1197d, C1217Y c1217y, LinkedHashMap linkedHashMap, int i6) {
        this((i6 & 1) != 0 ? null : c1212t, (i6 & 2) != 0 ? null : b0Var, (i6 & 4) != 0 ? null : c1197d, (i6 & 8) != 0 ? null : c1217y, (i6 & 32) == 0, (i6 & 64) != 0 ? Y3.w.f9813c : linkedHashMap);
    }
}
