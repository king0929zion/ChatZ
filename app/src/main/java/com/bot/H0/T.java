package H0;

import F0.InterfaceC0134w;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class T extends S implements F0.U {

    /* renamed from: r, reason: collision with root package name */
    public final i0 f1805r;

    /* renamed from: t, reason: collision with root package name */
    public LinkedHashMap f1807t;

    /* renamed from: v, reason: collision with root package name */
    public F0.W f1809v;

    /* renamed from: w, reason: collision with root package name */
    public final k.H f1810w;

    /* renamed from: s, reason: collision with root package name */
    public long f1806s = 0;

    /* renamed from: u, reason: collision with root package name */
    public final F0.T f1808u = new F0.T(this);

    public T(i0 i0Var) {
        this.f1805r = i0Var;
        k.H h3 = k.S.a;
        this.f1810w = new k.H();
    }

    public static final void L0(T t5, F0.W w5) {
        LinkedHashMap linkedHashMap;
        if (w5 != null) {
            t5.s0((w5.d() & 4294967295L) | (w5.e() << 32));
        } else {
            t5.s0(0L);
        }
        if (!AbstractC1276k.b(t5.f1809v, w5) && w5 != null && ((((linkedHashMap = t5.f1807t) != null && !linkedHashMap.isEmpty()) || !w5.b().isEmpty()) && !AbstractC1276k.b(w5.b(), t5.f1807t))) {
            W w6 = t5.f1805r.f1954r.f1722K.f1782q;
            AbstractC1276k.c(w6);
            w6.f1836v.f();
            LinkedHashMap linkedHashMap2 = t5.f1807t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                t5.f1807t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(w5.b());
        }
        t5.f1809v = w5;
    }

    @Override // H0.S
    public final S A0() {
        i0 i0Var = this.f1805r.f1955s;
        if (i0Var != null) {
            return i0Var.U0();
        }
        return null;
    }

    @Override // H0.S
    public final InterfaceC0134w B0() {
        return this.f1808u;
    }

    @Override // H0.S
    public final boolean C0() {
        return this.f1809v != null;
    }

    @Override // H0.S
    public final J D0() {
        return this.f1805r.f1954r;
    }

    @Override // H0.S
    public final F0.W E0() {
        F0.W w5 = this.f1809v;
        if (w5 != null) {
            return w5;
        }
        throw B3.e.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // H0.S
    public final S F0() {
        i0 i0Var = this.f1805r.f1956t;
        if (i0Var != null) {
            return i0Var.U0();
        }
        return null;
    }

    @Override // H0.S
    public final long G0() {
        return this.f1806s;
    }

    @Override // F0.k0, F0.U
    public final Object H() {
        return this.f1805r.H();
    }

    @Override // H0.S
    public final void K0() {
        m0(this.f1806s, S.l.f7374V, null);
    }

    public void M0() {
        E0().c();
    }

    public final void N0(long j3) {
        if (!e1.j.c(this.f1806s, j3)) {
            this.f1806s = j3;
            i0 i0Var = this.f1805r;
            W w5 = i0Var.f1954r.f1722K.f1782q;
            if (w5 != null) {
                w5.z0();
            }
            S.I0(i0Var);
        }
        if (this.f1801n) {
            return;
        }
        z0(E0());
    }

    public final long O0(T t5, boolean z5) {
        long j3 = 0;
        T t6 = this;
        while (!t6.equals(t5)) {
            if (!t6.f1799l || !z5) {
                j3 = e1.j.e(j3, t6.f1806s);
            }
            i0 i0Var = t6.f1805r.f1956t;
            AbstractC1276k.c(i0Var);
            t6 = i0Var.U0();
            AbstractC1276k.c(t6);
        }
        return j3;
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1805r.a();
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1805r.b0();
    }

    @Override // H0.S, F0.r
    public final boolean d0() {
        return true;
    }

    @Override // F0.r
    public final e1.m getLayoutDirection() {
        return this.f1805r.f1954r.f1715D;
    }

    @Override // F0.k0
    public final void m0(long j3, float f6, l4.c cVar) {
        N0(j3);
        if (this.f1800m) {
            return;
        }
        M0();
    }
}
