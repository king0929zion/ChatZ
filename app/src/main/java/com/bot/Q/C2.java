package Q;

import T.C0599c0;
import T.C0601d0;
import T.C0607g0;
import c4.EnumC0927a;
import i4.AbstractC1117a;
import l4.InterfaceC1193a;
import r.C1589n0;
import r.C1604s0;
import r.InterfaceC1616w0;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class C2 implements InterfaceC1616w0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f5179c;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1193a f5180e;

    /* renamed from: f, reason: collision with root package name */
    public final r4.d f5181f;

    /* renamed from: g, reason: collision with root package name */
    public final C0599c0 f5182g;

    /* renamed from: h, reason: collision with root package name */
    public l4.c f5183h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5184i = true;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f5185j;

    /* renamed from: k, reason: collision with root package name */
    public final C0601d0 f5186k;

    /* renamed from: l, reason: collision with root package name */
    public final C0601d0 f5187l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5188m;

    /* renamed from: n, reason: collision with root package name */
    public final C0601d0 f5189n;

    /* renamed from: o, reason: collision with root package name */
    public final C0601d0 f5190o;

    /* renamed from: p, reason: collision with root package name */
    public final r.X0 f5191p;

    /* renamed from: q, reason: collision with root package name */
    public final C0607g0 f5192q;

    /* renamed from: r, reason: collision with root package name */
    public final A.b f5193r;

    /* renamed from: s, reason: collision with root package name */
    public final C0599c0 f5194s;

    /* renamed from: t, reason: collision with root package name */
    public final C0599c0 f5195t;

    /* renamed from: u, reason: collision with root package name */
    public final B2 f5196u;

    /* renamed from: v, reason: collision with root package name */
    public final p.C0 f5197v;

    public C2(float f6, int i6, InterfaceC1193a interfaceC1193a, r4.d dVar) {
        float[] fArr;
        this.f5179c = i6;
        this.f5180e = interfaceC1193a;
        this.f5181f = dVar;
        this.f5182g = new C0599c0(f6);
        if (i6 == 0) {
            fArr = new float[0];
        } else {
            int i7 = i6 + 2;
            float[] fArr2 = new float[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                fArr2[i8] = i8 / (i6 + 1);
            }
            fArr = fArr2;
        }
        this.f5185j = fArr;
        this.f5186k = new C0601d0(0);
        this.f5187l = new C0601d0(0);
        this.f5189n = new C0601d0(0);
        this.f5190o = new C0601d0(0);
        this.f5191p = r.X0.f14184e;
        this.f5192q = T.r.A(Boolean.FALSE);
        this.f5193r = new A.b(this, 27);
        r4.d dVar2 = this.f5181f;
        float f7 = dVar2.a;
        float f8 = dVar2.f14678b - f7;
        this.f5194s = new C0599c0(Y3.C.B(S.l.f7374V, S.l.f7374V, AbstractC1117a.e(f8 == S.l.f7374V ? 0.0f : (f6 - f7) / f8, S.l.f7374V, 1.0f)));
        this.f5195t = new C0599c0(S.l.f7374V);
        this.f5196u = new B2(this, 0);
        this.f5197v = new p.C0();
    }

    public final void a(float f6) {
        float max;
        float min;
        if (this.f5191p == r.X0.f14183c) {
            float g3 = this.f5187l.g();
            C0601d0 c0601d0 = this.f5190o;
            max = Math.max(g3 - (c0601d0.g() / 2.0f), S.l.f7374V);
            min = Math.min(c0601d0.g() / 2.0f, max);
        } else {
            float g6 = this.f5186k.g();
            C0601d0 c0601d02 = this.f5189n;
            max = Math.max(g6 - (c0601d02.g() / 2.0f), S.l.f7374V);
            min = Math.min(c0601d02.g() / 2.0f, max);
        }
        C0599c0 c0599c0 = this.f5194s;
        float g7 = c0599c0.g() + f6;
        C0599c0 c0599c02 = this.f5195t;
        c0599c0.h(c0599c02.g() + g7);
        c0599c02.h(S.l.f7374V);
        float e6 = AbstractC0492z2.e(c0599c0.g(), this.f5185j, min, max);
        r4.d dVar = this.f5181f;
        float f7 = max - min;
        float B5 = Y3.C.B(dVar.a, dVar.f14678b, AbstractC1117a.e(f7 == S.l.f7374V ? 0.0f : (e6 - min) / f7, S.l.f7374V, 1.0f));
        if (B5 == this.f5182g.g()) {
            return;
        }
        l4.c cVar = this.f5183h;
        if (cVar != null) {
            cVar.f(Float.valueOf(B5));
        } else {
            c(B5);
        }
    }

    public final float b() {
        r4.d dVar = this.f5181f;
        float f6 = dVar.a;
        float f7 = dVar.f14678b;
        float e6 = AbstractC1117a.e(this.f5182g.g(), f6, f7);
        float f8 = f7 - f6;
        return AbstractC1117a.e(f8 == S.l.f7374V ? 0.0f : (e6 - f6) / f8, S.l.f7374V, 1.0f);
    }

    public final void c(float f6) {
        if (this.f5184i) {
            r4.d dVar = this.f5181f;
            float f7 = dVar.a;
            float f8 = dVar.f14678b;
            f6 = AbstractC0492z2.e(AbstractC1117a.e(f6, f7, f8), this.f5185j, f7, f8);
        }
        this.f5182g.h(f6);
    }

    @Override // r.InterfaceC1616w0
    public final Object g(C1604s0 c1604s0, C1589n0 c1589n0) {
        Object l3 = AbstractC1888A.l(new A2(this, c1604s0, null), c1589n0);
        return l3 == EnumC0927a.f11114c ? l3 : X3.y.a;
    }
}
