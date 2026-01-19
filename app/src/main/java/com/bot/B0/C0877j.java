package b0;

import T.AbstractC0623o0;
import T.g1;

/* renamed from: b0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877j extends Y.e {

    /* renamed from: j, reason: collision with root package name */
    public C0878k f10987j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a0.b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Y.c] */
    @Override // Y.e, W.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0878k build() {
        Y.n nVar = this.f9551f;
        C0878k c0878k = this.f10987j;
        Y.n nVar2 = c0878k.f9544c;
        C0878k c0878k2 = c0878k;
        if (nVar != nVar2) {
            this.f9550e = new Object();
            c0878k2 = new Y.c(this.f9551f, this.f9554i);
        }
        this.f10987j = c0878k2;
        return c0878k2;
    }

    @Override // Y.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0623o0) {
            return super.containsKey((AbstractC0623o0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof g1) {
            return super.containsValue((g1) obj);
        }
        return false;
    }

    @Override // Y.e, java.util.AbstractMap, java.util.Map
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

    @Override // Y.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0623o0) {
            return (g1) super.remove((AbstractC0623o0) obj);
        }
        return null;
    }
}
