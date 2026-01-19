package b0;

import T.AbstractC0623o0;
import T.InterfaceC0617l0;
import T.g1;

/* renamed from: b0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878k extends Y.c implements InterfaceC0617l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final C0878k f10988g = new Y.c(Y.n.f9569e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [Y.e, b0.j] */
    @Override // Y.c
    /* renamed from: a */
    public final Y.e builder() {
        ?? eVar = new Y.e(this);
        eVar.f10987j = this;
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y.e, b0.j, W.c] */
    @Override // Y.c, W.d
    public final W.c builder() {
        ?? eVar = new Y.e(this);
        eVar.f10987j = this;
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [b0.k, Y.c] */
    public final C0878k c(AbstractC0623o0 abstractC0623o0, g1 g1Var) {
        C0.c u5 = this.f9544c.u(abstractC0623o0.hashCode(), 0, abstractC0623o0, g1Var);
        return u5 == null ? this : new Y.c((Y.n) u5.f649c, this.f9545e + u5.f648b);
    }

    @Override // Y.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0623o0) {
            return super.containsKey((AbstractC0623o0) obj);
        }
        return false;
    }

    @Override // Y3.AbstractC0738e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof g1) {
            return super.containsValue((g1) obj);
        }
        return false;
    }

    @Override // Y.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0623o0) {
            return (g1) super.get((AbstractC0623o0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0623o0) ? obj2 : (g1) super.getOrDefault((AbstractC0623o0) obj, (g1) obj2);
    }
}
