package F0;

import e1.C0959a;
import i4.AbstractC1117a;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: c, reason: collision with root package name */
    public int f1485c;

    /* renamed from: e, reason: collision with root package name */
    public int f1486e;

    /* renamed from: f, reason: collision with root package name */
    public long f1487f;

    /* renamed from: g, reason: collision with root package name */
    public long f1488g = m0.a;

    /* renamed from: h, reason: collision with root package name */
    public long f1489h = 0;

    public k0() {
        long j3 = 0;
        this.f1487f = (j3 & 4294967295L) | (j3 << 32);
    }

    public Object H() {
        return null;
    }

    public abstract int f0(AbstractC0107a abstractC0107a);

    public int i0() {
        return (int) (this.f1487f & 4294967295L);
    }

    public int j0() {
        return (int) (this.f1487f >> 32);
    }

    public final void k0() {
        this.f1485c = AbstractC1117a.f((int) (this.f1487f >> 32), C0959a.j(this.f1488g), C0959a.h(this.f1488g));
        this.f1486e = AbstractC1117a.f((int) (this.f1487f & 4294967295L), C0959a.i(this.f1488g), C0959a.g(this.f1488g));
        int i6 = this.f1485c;
        long j3 = this.f1487f;
        this.f1489h = (((i6 - ((int) (j3 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j3 & 4294967295L))) / 2));
    }

    public abstract void m0(long j3, float f6, l4.c cVar);

    public void p0(long j3, float f6, r0.b bVar) {
        m0(j3, f6, null);
    }

    public final void s0(long j3) {
        if (e1.l.b(this.f1487f, j3)) {
            return;
        }
        this.f1487f = j3;
        k0();
    }

    public final void t0(long j3) {
        if (C0959a.b(this.f1488g, j3)) {
            return;
        }
        this.f1488g = j3;
        k0();
    }
}
