package n;

import m4.AbstractC1276k;

/* renamed from: n.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331j0 implements F0 {

    /* renamed from: c, reason: collision with root package name */
    public final F0 f13166c;

    /* renamed from: e, reason: collision with root package name */
    public final long f13167e;

    public C1331j0(F0 f02, long j3) {
        this.f13166c = f02;
        this.f13167e = j3;
    }

    @Override // n.F0
    public final boolean a() {
        return this.f13166c.a();
    }

    @Override // n.F0
    public final long b(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return this.f13166c.b(abstractC1343r, abstractC1343r2, abstractC1343r3) + this.f13167e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1331j0)) {
            return false;
        }
        C1331j0 c1331j0 = (C1331j0) obj;
        return c1331j0.f13167e == this.f13167e && AbstractC1276k.b(c1331j0.f13166c, this.f13166c);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13167e) + (this.f13166c.hashCode() * 31);
    }

    @Override // n.F0
    public final AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        long j4 = this.f13167e;
        return j3 < j4 ? abstractC1343r : this.f13166c.i(j3 - j4, abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    @Override // n.F0
    public final AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        long j4 = this.f13167e;
        return j3 < j4 ? abstractC1343r3 : this.f13166c.q(j3 - j4, abstractC1343r, abstractC1343r2, abstractC1343r3);
    }
}
