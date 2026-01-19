package B0;

import H0.AbstractC0157l;
import H0.C0151g0;
import H0.C0159n;
import H0.D0;
import H0.F0;
import H0.InterfaceC0154i;
import H0.w0;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;

/* renamed from: B0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0032h implements  F0, w0, InterfaceC0154i {

    /* renamed from: r, reason: collision with root package name */
    public C0159n f449r;

    /* renamed from: s, reason: collision with root package name */
    public C0025a f450s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f451t;

    public AbstractC0032h(C0025a c0025a, C0159n c0159n) {
        this.f449r = c0159n;
        this.f450s = c0025a;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        Q0();
    }

    @Override // H0.w0
    public final void L() {
        Q0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.w, java.lang.Object] */
    public final void M0() {
        C0025a c0025a;
        Object obj = new Object();
        AbstractC0157l.z(this, new C0031g(obj, 0));
        AbstractC0032h abstractC0032h = (AbstractC0032h) obj.f12973c;
        if (abstractC0032h == null || (c0025a = abstractC0032h.f450s) == null) {
            c0025a = this.f450s;
        }
        N0(c0025a);
    }

    public abstract void N0(InterfaceC0045v interfaceC0045v);

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.r, java.lang.Object] */
    public final void O0() {
        Object obj = new Object();
        obj.f12968c = true;
        AbstractC0157l.B(this, new C0030f(obj));
        if (obj.f12968c) {
            M0();
        }
    }

    public abstract boolean P0(int i6);

    /* JADX WARN: Type inference failed for: r0v3, types: [m4.w, java.lang.Object] */
    public final void Q0() {
        if (this.f451t) {
            this.f451t = false;
            if (this.f11819q) {
                Object obj = new Object();
                AbstractC0157l.z(this, new A0.k(obj, 1));
                AbstractC0032h abstractC0032h = (AbstractC0032h) obj.f12973c;
                if (abstractC0032h != null) {
                    abstractC0032h.M0();
                } else {
                    N0(null);
                }
            }
        }
    }

    @Override // H0.w0
    public final long p() {
        C0159n c0159n = this.f449r;
        if (c0159n == null) {
            return D0.a;
        }
        InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
        int i6 = D0.f1691b;
        return C0151g0.c(interfaceC0961c.l0(c0159n.a), interfaceC0961c.l0(c0159n.f1975b), interfaceC0961c.l0(c0159n.f1976c), interfaceC0961c.l0(c0159n.f1977d));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // H0.w0
    public final void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        if (enumC0041q == EnumC0041q.f476e) {
            Object r32 = c0040p.a;
            int size = r32.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (P0(((y) r32.get(i6)).f489i)) {
                    int i7 = c0040p.f474f;
                    if (i7 == 4) {
                        this.f451t = true;
                        O0();
                        return;
                    } else {
                        if (i7 == 5) {
                            Q0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
