package y;

import T.C0607g0;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class X {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f15819b;

    /* renamed from: d, reason: collision with root package name */
    public int f15821d;

    /* renamed from: e, reason: collision with root package name */
    public X f15822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15823f;

    /* renamed from: c, reason: collision with root package name */
    public int f15820c = -1;

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f15824g = T.r.A(null);

    public X(Object obj, Y y5) {
        this.a = obj;
        this.f15819b = y5;
    }

    public final X a() {
        if (this.f15823f) {
            AbstractC1734b.c("Pin should not be called on an already disposed item ");
        }
        if (this.f15821d == 0) {
            this.f15819b.f15825c.add(this);
            X x5 = (X) this.f15824g.getValue();
            if (x5 != null) {
                x5.a();
            } else {
                x5 = null;
            }
            this.f15822e = x5;
        }
        this.f15821d++;
        return this;
    }

    public final void b() {
        if (this.f15823f) {
            return;
        }
        if (this.f15821d <= 0) {
            AbstractC1734b.c("Release should only be called once");
        }
        int i6 = this.f15821d - 1;
        this.f15821d = i6;
        if (i6 == 0) {
            this.f15819b.f15825c.remove(this);
            X x5 = this.f15822e;
            if (x5 != null) {
                x5.b();
            }
            this.f15822e = null;
        }
    }
}
