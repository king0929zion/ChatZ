package m;

import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;

/* renamed from: m.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211S {

    /* renamed from: b, reason: collision with root package name */
    public static final C1211S f12761b = new C1211S(new d0((C1212T) null, (b0) null, (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 127));

    /* renamed from: c, reason: collision with root package name */
    public static final C1211S f12762c = new C1211S(new d0((C1212T) null, (b0) null, (C1197D) null, (C1217Y) null, (LinkedHashMap) null, 95));
    public final d0 a;

    public C1211S(d0 d0Var) {
        this.a = d0Var;
    }

    public final C1211S a(C1211S c1211s) {
        d0 d0Var = c1211s.a;
        C1212T c1212t = d0Var.a;
        d0 d0Var2 = this.a;
        if (c1212t == null) {
            c1212t = d0Var2.a;
        }
        b0 b0Var = d0Var.f12787b;
        if (b0Var == null) {
            b0Var = d0Var2.f12787b;
        }
        C1197D c1197d = d0Var.f12788c;
        if (c1197d == null) {
            c1197d = d0Var2.f12788c;
        }
        C1217Y c1217y = d0Var.f12789d;
        if (c1217y == null) {
            c1217y = d0Var2.f12789d;
        }
        boolean z5 = d0Var.f12790e || d0Var2.f12790e;
        Map map = d0Var2.f12791f;
        Map map2 = d0Var.f12791f;
        AbstractC1276k.f(map, "<this>");
        AbstractC1276k.f(map2, "map");
        b0 b0Var2 = b0Var;
        C1197D c1197d2 = c1197d;
        C1217Y c1217y2 = c1217y;
        boolean z6 = z5;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C1211S(new d0(c1212t, b0Var2, c1197d2, c1217y2, z6, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1211S) && AbstractC1276k.b(((C1211S) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(f12761b)) {
            return "ExitTransition.None";
        }
        if (equals(f12762c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        d0 d0Var = this.a;
        C1212T c1212t = d0Var.a;
        sb.append(c1212t != null ? c1212t.toString() : null);
        sb.append(",\nSlide - ");
        b0 b0Var = d0Var.f12787b;
        sb.append(b0Var != null ? b0Var.toString() : null);
        sb.append(",\nShrink - ");
        C1197D c1197d = d0Var.f12788c;
        sb.append(c1197d != null ? c1197d.toString() : null);
        sb.append(",\nScale - ");
        C1217Y c1217y = d0Var.f12789d;
        sb.append(c1217y != null ? c1217y.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(d0Var.f12790e);
        return sb.toString();
    }
}
