package f0;

import java.util.Arrays;
import java.util.HashMap;
import k.N;
import m4.AbstractC1276k;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980c extends C0979b {

    /* renamed from: o, reason: collision with root package name */
    public final C0979b f11674o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11675p;

    public C0980c(long j3, C0989l c0989l, l4.c cVar, l4.c cVar2, C0979b c0979b) {
        super(j3, c0989l, cVar, cVar2);
        this.f11674o = c0979b;
        c0979b.k();
    }

    @Override // f0.C0979b, f0.AbstractC0983f
    public final void c() {
        if (this.f11681c) {
            return;
        }
        super.c();
        if (this.f11675p) {
            return;
        }
        this.f11675p = true;
        this.f11674o.l();
    }

    @Override // f0.C0979b
    public final AbstractC0997t w() {
        C0980c c0980c;
        C0979b c0979b = this.f11674o;
        if (c0979b.f11673m || c0979b.f11681c) {
            return new C0984g(this);
        }
        N n3 = this.f11668h;
        long j3 = this.f11680b;
        HashMap b5 = n3 != null ? AbstractC0992o.b(c0979b.g(), this, this.f11674o.d()) : null;
        Object obj = AbstractC0992o.f11707c;
        synchronized (obj) {
            try {
                AbstractC0992o.c(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (n3 == null || n3.f12492d == 0) {
                    c0980c = this;
                    a();
                } else {
                    c0980c = this;
                    AbstractC0997t z5 = c0980c.z(this.f11674o.g(), n3, b5, this.f11674o.d());
                    if (!z5.equals(C0985h.f11684c)) {
                        return z5;
                    }
                    N x5 = c0980c.f11674o.x();
                    if (x5 != null) {
                        x5.k(n3);
                    } else {
                        c0980c.f11674o.B(n3);
                        c0980c.f11668h = null;
                    }
                }
                if (AbstractC1276k.h(c0980c.f11674o.g(), j3) < 0) {
                    c0980c.f11674o.v();
                }
                C0979b c0979b2 = c0980c.f11674o;
                c0979b2.r(c0979b2.d().b(j3).a(c0980c.f11670j));
                c0980c.f11674o.A(j3);
                C0979b c0979b3 = c0980c.f11674o;
                int i6 = c0980c.f11682d;
                c0980c.f11682d = -1;
                if (i6 >= 0) {
                    int[] iArr = c0979b3.f11671k;
                    AbstractC1276k.f(iArr, "<this>");
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i6;
                    c0979b3.f11671k = copyOf;
                } else {
                    c0979b3.getClass();
                }
                C0979b c0979b4 = c0980c.f11674o;
                C0989l c0989l = c0980c.f11670j;
                c0979b4.getClass();
                synchronized (obj) {
                    c0979b4.f11670j = c0979b4.f11670j.d(c0989l);
                    C0979b c0979b5 = c0980c.f11674o;
                    int[] iArr2 = c0980c.f11671k;
                    c0979b5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c0979b5.f11671k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            AbstractC1276k.c(copyOf2);
                            iArr2 = copyOf2;
                        }
                        c0979b5.f11671k = iArr2;
                    }
                }
                c0980c.f11673m = true;
                if (!c0980c.f11675p) {
                    c0980c.f11675p = true;
                    c0980c.f11674o.l();
                }
                return C0985h.f11684c;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
