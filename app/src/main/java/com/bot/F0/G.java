package F0;

import H0.C0139a0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class G implements w0, X {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f1410c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f1411e;

    public G(Q q3) {
        this.f1411e = q3;
        this.f1410c = q3.f1449k;
    }

    @Override // e1.InterfaceC0961c
    public final float A(long j3) {
        return this.f1410c.A(j3);
    }

    @Override // F0.X
    public final W D(int i6, int i7, Map map, l4.c cVar) {
        return this.f1410c.E(i6, i7, map, null, cVar);
    }

    @Override // F0.X
    public final W E(int i6, int i7, Map map, l4.c cVar, l4.c cVar2) {
        return this.f1410c.E(i6, i7, map, cVar, cVar2);
    }

    @Override // F0.w0
    public final List J(Object obj, l4.e eVar) {
        Q q3 = this.f1411e;
        H0.J j3 = q3.f1442c;
        k.M m3 = q3.f1448j;
        H0.J j4 = (H0.J) m3.g(obj);
        if (j4 != null && ((V.e) ((V.b) j3.o()).f8751e).i(j4) < q3.f1445g) {
            return j4.m();
        }
        k.M m5 = q3.f1453o;
        k.M m6 = q3.f1451m;
        V.e eVar2 = q3.f1454p;
        if (eVar2.f8761f < q3.f1446h) {
            E0.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        H0.J j5 = (H0.J) m3.g(obj);
        int i6 = eVar2.f8761f;
        int i7 = q3.f1446h;
        if (i6 == i7) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f8759c;
            Object obj2 = objArr[i7];
            objArr[i7] = obj;
        }
        q3.f1446h++;
        boolean b5 = m6.b(obj);
        if (b5 || j5 != null) {
            if (!b5 && j5 != null) {
                q3.j(((V.e) ((V.b) j3.o()).f8751e).i(j5), ((V.e) ((V.b) j3.o()).f8751e).f8761f);
                q3.f1456r++;
                m3.k(obj);
                m6.m(obj, j5);
                m5.m(obj, q3.f(obj));
                if (j3.H()) {
                    q3.h();
                }
            }
            H0.J j6 = (H0.J) m6.g(obj);
            H h3 = j6 != null ? (H) q3.f1447i.g(j6) : null;
            if (h3 != null && h3.f1414d) {
                q3.m(j6, obj, false, eVar);
            }
        } else {
            q3.k(obj, eVar, false);
            m5.m(obj, q3.f(obj));
        }
        H0.J j7 = (H0.J) m6.g(obj);
        if (j7 == null) {
            return Y3.v.f9812c;
        }
        List v02 = j7.f1722K.f1781p.v0();
        V.b bVar = (V.b) v02;
        int i8 = ((V.e) bVar.f8751e).f8761f;
        for (int i9 = 0; i9 < i8; i9++) {
            ((C0139a0) bVar.get(i9)).f1869i.f1767b = true;
        }
        return v02;
    }

    @Override // e1.InterfaceC0961c
    public final long O(float f6) {
        return this.f1410c.O(f6);
    }

    @Override // e1.InterfaceC0961c
    public final float T(int i6) {
        return this.f1410c.T(i6);
    }

    @Override // e1.InterfaceC0961c
    public final float V(float f6) {
        return f6 / this.f1410c.a();
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1410c.f1426e;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1410c.f1427f;
    }

    @Override // F0.r
    public final boolean d0() {
        return this.f1410c.d0();
    }

    @Override // e1.InterfaceC0961c
    public final float e0(float f6) {
        return this.f1410c.a() * f6;
    }

    @Override // F0.r
    public final e1.m getLayoutDirection() {
        return this.f1410c.f1425c;
    }

    @Override // e1.InterfaceC0961c
    public final int l0(float f6) {
        return this.f1410c.l0(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long r0(long j3) {
        return this.f1410c.r0(j3);
    }

    @Override // e1.InterfaceC0961c
    public final long s(float f6) {
        return this.f1410c.s(f6);
    }

    @Override // e1.InterfaceC0961c
    public final long t(long j3) {
        return this.f1410c.t(j3);
    }

    @Override // e1.InterfaceC0961c
    public final float u0(long j3) {
        return this.f1410c.u0(j3);
    }
}
