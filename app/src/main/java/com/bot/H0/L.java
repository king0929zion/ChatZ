package H0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import o0.AbstractC1404o;
import o0.C1395f;
import o0.C1397h;
import o0.C1400k;
import o4.AbstractC1410a;
import q0.AbstractC1499e;
import q0.C1495a;
import q0.C1496b;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public final class L implements InterfaceC1498d {

    /* renamed from: c, reason: collision with root package name */
    public final C1496b f1765c = new C1496b();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0160o f1766e;

    @Override // e1.InterfaceC0961c
    public final float A(long j3) {
        return this.f1765c.A(j3);
    }

    @Override // q0.InterfaceC1498d
    public final void B(long j3, float f6, long j4, AbstractC1499e abstractC1499e) {
        this.f1765c.B(j3, f6, j4, abstractC1499e);
    }

    @Override // q0.InterfaceC1498d
    public final void C(AbstractC1404o abstractC1404o, long j3, long j4, float f6, AbstractC1499e abstractC1499e, int i6) {
        this.f1765c.C(abstractC1404o, j3, j4, f6, abstractC1499e, i6);
    }

    @Override // q0.InterfaceC1498d
    public final void G(long j3, long j4, long j5, float f6, int i6) {
        this.f1765c.G(j3, j4, j5, f6, i6);
    }

    @Override // e1.InterfaceC0961c
    public final long O(float f6) {
        return this.f1765c.O(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float T(int i6) {
        return this.f1765c.T(i6);
    }

    @Override // e1.InterfaceC0961c
    public final float V(float f6) {
        return f6 / this.f1765c.a();
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1765c.a();
    }

    public final void b() {
        C1496b c1496b = this.f1765c;
        o0.q g3 = c1496b.f13944e.g();
        InterfaceC0155j interfaceC0155j = this.f1766e;
        if (interfaceC0155j == null) {
            throw B3.e.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC1040q abstractC1040q = (AbstractC1040q) interfaceC0155j;
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c.f11811i;
        if (abstractC1040q2 != null && (abstractC1040q2.f11809g & 4) != 0) {
            while (abstractC1040q2 != null) {
                int i6 = abstractC1040q2.f11808f;
                if ((i6 & 2) != 0) {
                    break;
                } else if ((i6 & 4) != 0) {
                    break;
                } else {
                    abstractC1040q2 = abstractC1040q2.f11811i;
                }
            }
        }
        abstractC1040q2 = null;
        if (abstractC1040q2 == null) {
            i0 t5 = AbstractC0157l.t(interfaceC0155j, 4);
            if (t5.W0() == abstractC1040q.f11806c) {
                t5 = t5.f1955s;
                AbstractC1276k.c(t5);
            }
            t5.l1(g3, (r0.b) c1496b.f13944e.f1973f);
            return;
        }
        V.e eVar = null;
        while (abstractC1040q2 != null) {
            if (abstractC1040q2 instanceof InterfaceC0160o) {
                InterfaceC0160o interfaceC0160o = (InterfaceC0160o) abstractC1040q2;
                r0.b bVar = (r0.b) c1496b.f13944e.f1973f;
                i0 t6 = AbstractC0157l.t(interfaceC0160o, 4);
                long S5 = AbstractC1410a.S(t6.f1487f);
                J j3 = t6.f1954r;
                j3.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(j3)).getSharedDrawScope().d(g3, S5, t6, interfaceC0160o, bVar);
            } else if ((abstractC1040q2.f11808f & 4) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                int i7 = 0;
                for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                    if ((abstractC1040q3.f11808f & 4) != 0) {
                        i7++;
                        if (i7 == 1) {
                            abstractC1040q2 = abstractC1040q3;
                        } else {
                            if (eVar == null) {
                                eVar = new V.e(new AbstractC1040q[16]);
                            }
                            if (abstractC1040q2 != null) {
                                eVar.b(abstractC1040q2);
                                abstractC1040q2 = null;
                            }
                            eVar.b(abstractC1040q3);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            abstractC1040q2 = AbstractC0157l.e(eVar);
        }
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1765c.b0();
    }

    @Override // q0.InterfaceC1498d
    public final long c() {
        return this.f1765c.c();
    }

    public final void d(o0.q qVar, long j3, i0 i0Var, InterfaceC0160o interfaceC0160o, r0.b bVar) {
        InterfaceC0160o interfaceC0160o2 = this.f1766e;
        this.f1766e = interfaceC0160o;
        e1.m mVar = i0Var.f1954r.f1715D;
        C1496b c1496b = this.f1765c;
        C0158m c0158m = c1496b.f13944e;
        C1495a c1495a = ((C1496b) c0158m.f1974g).f13943c;
        InterfaceC0961c interfaceC0961c = c1495a.a;
        e1.m mVar2 = c1495a.f13940b;
        o0.q g3 = c0158m.g();
        C0158m c0158m2 = c1496b.f13944e;
        long j4 = c0158m2.j();
        r0.b bVar2 = (r0.b) c0158m2.f1973f;
        c0158m2.q(i0Var);
        c0158m2.r(mVar);
        c0158m2.p(qVar);
        c0158m2.s(j3);
        c0158m2.f1973f = bVar;
        qVar.h();
        try {
            interfaceC0160o.k0(this);
            qVar.p();
            c0158m2.q(interfaceC0961c);
            c0158m2.r(mVar2);
            c0158m2.p(g3);
            c0158m2.s(j4);
            c0158m2.f1973f = bVar2;
            this.f1766e = interfaceC0160o2;
        } catch (Throwable th) {
            qVar.p();
            c0158m2.q(interfaceC0961c);
            c0158m2.r(mVar2);
            c0158m2.p(g3);
            c0158m2.s(j4);
            c0158m2.f1973f = bVar2;
            throw th;
        }
    }

    public final void e(AbstractC1404o abstractC1404o, long j3, long j4, long j5, float f6, AbstractC1499e abstractC1499e) {
        C1496b c1496b = this.f1765c;
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        c1496b.f13943c.f13941c.a(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), c1496b.d(abstractC1404o, abstractC1499e, f6, null, 3, 1));
    }

    @Override // e1.InterfaceC0961c
    public final float e0(float f6) {
        return this.f1765c.a() * f6;
    }

    @Override // q0.InterfaceC1498d
    public final C0158m g0() {
        return this.f1765c.f13944e;
    }

    @Override // q0.InterfaceC1498d
    public final e1.m getLayoutDirection() {
        return this.f1765c.f13943c.f13940b;
    }

    @Override // q0.InterfaceC1498d
    public final void h0(C1397h c1397h, AbstractC1404o abstractC1404o, float f6, AbstractC1499e abstractC1499e, int i6) {
        this.f1765c.h0(c1397h, abstractC1404o, f6, abstractC1499e, i6);
    }

    @Override // q0.InterfaceC1498d
    public final void i(long j3, long j4, long j5, long j6, AbstractC1499e abstractC1499e) {
        this.f1765c.i(j3, j4, j5, j6, abstractC1499e);
    }

    @Override // e1.InterfaceC0961c
    public final int l0(float f6) {
        return this.f1765c.l0(f6);
    }

    @Override // q0.InterfaceC1498d
    public final void n(C1395f c1395f, long j3, long j4, long j5, float f6, C1400k c1400k, int i6) {
        this.f1765c.n(c1395f, j3, j4, j5, f6, c1400k, i6);
    }

    @Override // q0.InterfaceC1498d
    public final long o0() {
        return this.f1765c.o0();
    }

    @Override // e1.InterfaceC0961c
    public final long r0(long j3) {
        return this.f1765c.r0(j3);
    }

    @Override // e1.InterfaceC0961c
    public final long s(float f6) {
        return this.f1765c.s(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long t(long j3) {
        return this.f1765c.t(j3);
    }

    @Override // e1.InterfaceC0961c
    public final float u0(long j3) {
        return this.f1765c.u0(j3);
    }

    @Override // q0.InterfaceC1498d
    public final void w0(long j3, long j4, long j5, float f6, int i6) {
        this.f1765c.w0(j3, j4, j5, f6, i6);
    }

    @Override // q0.InterfaceC1498d
    public final void x(long j3, float f6, float f7, long j4, long j5, AbstractC1499e abstractC1499e) {
        this.f1765c.x(j3, f6, f7, j4, j5, abstractC1499e);
    }

    @Override // q0.InterfaceC1498d
    public final void y(C1397h c1397h, long j3, AbstractC1499e abstractC1499e) {
        this.f1765c.y(c1397h, j3, abstractC1499e);
    }
}
