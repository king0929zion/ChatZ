package z3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class v {
    public static final N3.a a = new N3.a("ApplicationPluginRegistry");

    public static final Object a(t3.d dVar) {
        B3.j jVar = J.f16246b;
        AbstractC1276k.f(dVar, "<this>");
        Object b5 = b(dVar, jVar);
        if (b5 != null) {
            return b5;
        }
        throw new IllegalStateException("Plugin " + jVar + " is not installed. Consider using `install(" + J.f16247c + ")` in client config first.");
    }

    public static final Object b(t3.d dVar, u uVar) {
        AbstractC1276k.f(dVar, "<this>");
        AbstractC1276k.f(uVar, "plugin");
        N3.j jVar = (N3.j) dVar.f14929l.e(a);
        if (jVar != null) {
            return jVar.e(uVar.getKey());
        }
        return null;
    }
}
