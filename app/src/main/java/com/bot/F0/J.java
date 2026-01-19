package F0;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements w0 {

    /* renamed from: c, reason: collision with root package name */
    public e1.m f1425c = e1.m.f11577e;

    /* renamed from: e, reason: collision with root package name */
    public float f1426e;

    /* renamed from: f, reason: collision with root package name */
    public float f1427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f1428g;

    public J(Q q3) {
        this.f1428g = q3;
    }

    @Override // F0.X
    public final W E(int i6, int i7, Map map, l4.c cVar, l4.c cVar2) {
        if ((i6 & (-16777216)) != 0 || ((-16777216) & i7) != 0) {
            E0.a.b("Size(" + i6 + " x " + i7 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new I(i6, i7, map, cVar, this, this.f1428g, cVar2);
    }

    @Override // F0.w0
    public final List J(Object obj, l4.e eVar) {
        Q q3 = this.f1428g;
        q3.h();
        H0.J j3 = q3.f1442c;
        H0.F f6 = j3.f1722K.f1769d;
        H0.F f7 = H0.F.f1698f;
        H0.F f8 = H0.F.f1696c;
        if (f6 != f8 && f6 != f7 && f6 != H0.F.f1697e && f6 != H0.F.f1699g) {
            E0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        k.M m3 = q3.f1448j;
        Object g3 = m3.g(obj);
        if (g3 == null) {
            g3 = (H0.J) q3.f1451m.k(obj);
            if (g3 != null) {
                if (q3.f1456r <= 0) {
                    E0.a.b("Check failed.");
                }
                q3.f1456r--;
            } else {
                g3 = q3.n(obj);
                if (g3 == null) {
                    int i6 = q3.f1445g;
                    H0.J j4 = new H0.J(2);
                    j3.f1750u = true;
                    j3.B(i6, j4);
                    j3.f1750u = false;
                    g3 = j4;
                }
            }
            m3.m(obj, g3);
        }
        H0.J j5 = (H0.J) g3;
        if (Y3.m.r0(j3.o(), q3.f1445g) != j5) {
            int i7 = ((V.e) ((V.b) j3.o()).f8751e).i(j5);
            if (i7 < q3.f1445g) {
                E0.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i8 = q3.f1445g;
            if (i8 != i7) {
                q3.j(i7, i8);
            }
        }
        q3.f1445g++;
        q3.m(j5, obj, false, eVar);
        return (f6 == f8 || f6 == f7) ? j5.m() : j5.l();
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f1426e;
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f1427f;
    }

    @Override // F0.r
    public final boolean d0() {
        H0.F f6 = this.f1428g.f1442c.f1722K.f1769d;
        return f6 == H0.F.f1699g || f6 == H0.F.f1697e;
    }

    @Override // F0.r
    public final e1.m getLayoutDirection() {
        return this.f1425c;
    }
}
