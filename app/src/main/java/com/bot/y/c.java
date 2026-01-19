package Y;

import Y3.AbstractC0738e;

/* loaded from: classes.dex */
public class c extends AbstractC0738e implements W.d {

    /* renamed from: f, reason: collision with root package name */
    public static final c f9543f = new c(n.f9569e, 0);

    /* renamed from: c, reason: collision with root package name */
    public final n f9544c;

    /* renamed from: e, reason: collision with root package name */
    public final int f9545e;

    public c(n nVar, int i6) {
        this.f9544c = nVar;
        this.f9545e = i6;
    }

    @Override // W.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, Z.a aVar) {
        C0.c u5 = this.f9544c.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return u5 == null ? this : new c((n) u5.f649c, this.f9545e + u5.f648b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f9544c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f9544c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
