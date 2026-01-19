package n;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t0 implements s0 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13247b;

    public t0(Object obj, Object obj2) {
        this.a = obj;
        this.f13247b = obj2;
    }

    @Override // n.s0
    public final Object b() {
        return this.a;
    }

    @Override // n.s0
    public final Object c() {
        return this.f13247b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return AbstractC1276k.b(this.a, s0Var.b()) && AbstractC1276k.b(this.f13247b, s0Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f13247b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
