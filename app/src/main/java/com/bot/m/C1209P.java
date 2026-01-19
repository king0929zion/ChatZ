package m;

import F0.k0;
import F0.n0;
import e1.AbstractC0960b;
import h0.C1026c;
import h0.InterfaceC1028e;
import l4.InterfaceC1193a;
import n.q0;
import n.r0;
import n.y0;

/* renamed from: m.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209P extends AbstractC1216X {

    /* renamed from: A, reason: collision with root package name */
    public long f12748A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1028e f12749B;

    /* renamed from: C, reason: collision with root package name */
    public final C1208O f12750C;

    /* renamed from: D, reason: collision with root package name */
    public final C1208O f12751D;

    /* renamed from: s, reason: collision with root package name */
    public y0 f12752s;

    /* renamed from: t, reason: collision with root package name */
    public r0 f12753t;

    /* renamed from: u, reason: collision with root package name */
    public r0 f12754u;

    /* renamed from: v, reason: collision with root package name */
    public r0 f12755v;

    /* renamed from: w, reason: collision with root package name */
    public C1210Q f12756w;

    /* renamed from: x, reason: collision with root package name */
    public C1211S f12757x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1193a f12758y;

    /* renamed from: z, reason: collision with root package name */
    public C1201H f12759z;

    public C1209P(y0 y0Var, r0 r0Var, r0 r0Var2, r0 r0Var3, C1210Q c1210q, C1211S c1211s, InterfaceC1193a interfaceC1193a, C1201H c1201h) {
        super(0);
        this.f12752s = y0Var;
        this.f12753t = r0Var;
        this.f12754u = r0Var2;
        this.f12755v = r0Var3;
        this.f12756w = c1210q;
        this.f12757x = c1211s;
        this.f12758y = interfaceC1193a;
        this.f12759z = c1201h;
        this.f12748A = AbstractC1196C.a;
        AbstractC0960b.b(0, 0, 15);
        this.f12750C = new C1208O(this, 0);
        this.f12751D = new C1208O(this, 1);
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        this.f12748A = AbstractC1196C.a;
    }

    public final InterfaceC1028e O0() {
        InterfaceC1028e interfaceC1028e;
        InterfaceC1028e interfaceC1028e2;
        if (this.f12752s.f().a(EnumC1199F.f12714c, EnumC1199F.f12715e)) {
            C1197D c1197d = this.f12756w.a.f12788c;
            if (c1197d != null && (interfaceC1028e2 = c1197d.a) != null) {
                return interfaceC1028e2;
            }
            C1197D c1197d2 = this.f12757x.a.f12788c;
            if (c1197d2 != null) {
                return c1197d2.a;
            }
            return null;
        }
        C1197D c1197d3 = this.f12757x.a.f12788c;
        if (c1197d3 != null && (interfaceC1028e = c1197d3.a) != null) {
            return interfaceC1028e;
        }
        C1197D c1197d4 = this.f12756w.a.f12788c;
        if (c1197d4 != null) {
            return c1197d4.a;
        }
        return null;
    }

    @Override // m.AbstractC1216X, H0.InterfaceC0170z
    public final F0.W d(F0.X x5, F0.U u5, long j3) {
        o0.O o5;
        long j4;
        long j5;
        if (this.f12752s.a.k() == this.f12752s.f13280d.getValue()) {
            this.f12749B = null;
        } else if (this.f12749B == null) {
            InterfaceC1028e O02 = O0();
            if (O02 == null) {
                O02 = C1026c.f11786c;
            }
            this.f12749B = O02;
        }
        boolean d02 = x5.d0();
        Y3.w wVar = Y3.w.f9813c;
        if (d02) {
            k0 w5 = u5.w(j3);
            long j6 = (w5.f1485c << 32) | (w5.f1486e & 4294967295L);
            this.f12748A = j6;
            return x5.D((int) (j6 >> 32), (int) (4294967295L & j6), wVar, new n0(w5, 5));
        }
        if (!((Boolean) this.f12758y.b()).booleanValue()) {
            k0 w6 = u5.w(j3);
            return x5.D(w6.f1485c, w6.f1486e, wVar, new n0(w6, 6));
        }
        C1201H c1201h = this.f12759z;
        r0 r0Var = c1201h.a;
        r0 r0Var2 = c1201h.f12725b;
        y0 y0Var = c1201h.f12726c;
        C1210Q c1210q = c1201h.f12727d;
        d0 d0Var = c1210q.a;
        C1211S c1211s = c1201h.f12728e;
        r0 r0Var3 = c1201h.f12729f;
        q0 a = r0Var != null ? r0Var.a(new C1202I(c1210q, c1211s, 0), new C1202I(c1210q, c1211s, 1)) : null;
        q0 a6 = r0Var2 != null ? r0Var2.a(new C1202I(c1210q, c1211s, 2), new C1202I(c1210q, c1211s, 3)) : null;
        if (y0Var.a.k() == EnumC1199F.f12714c) {
            C1217Y c1217y = d0Var.f12789d;
            if (c1217y != null) {
                o5 = new o0.O(c1217y.f12767b);
            } else {
                C1217Y c1217y2 = c1211s.a.f12789d;
                if (c1217y2 != null) {
                    o5 = new o0.O(c1217y2.f12767b);
                }
                o5 = null;
            }
        } else {
            C1217Y c1217y3 = c1211s.a.f12789d;
            if (c1217y3 != null) {
                o5 = new o0.O(c1217y3.f12767b);
            } else {
                C1217Y c1217y4 = d0Var.f12789d;
                if (c1217y4 != null) {
                    o5 = new o0.O(c1217y4.f12767b);
                }
                o5 = null;
            }
        }
        c.f fVar = new c.f(a, a6, r0Var3 != null ? r0Var3.a(C1221c.f12777l, new c.f(o5, c1210q, c1211s, 6)) : null, 5);
        k0 w7 = u5.w(j3);
        long j7 = (w7.f1485c << 32) | (w7.f1486e & 4294967295L);
        long j8 = !e1.l.b(this.f12748A, AbstractC1196C.a) ? this.f12748A : j7;
        r0 r0Var4 = this.f12753t;
        q0 a7 = r0Var4 != null ? r0Var4.a(this.f12750C, new C1207N(this, j8, 0)) : null;
        if (a7 != null) {
            j7 = ((e1.l) a7.getValue()).a;
        }
        long d6 = AbstractC0960b.d(j3, j7);
        r0 r0Var5 = this.f12754u;
        long j9 = r0Var5 != null ? ((e1.j) r0Var5.a(C1221c.f12778m, new C1207N(this, j8, 1)).getValue()).a : 0L;
        r0 r0Var6 = this.f12755v;
        if (r0Var6 != null) {
            j4 = 4294967295L;
            j5 = ((e1.j) r0Var6.a(this.f12751D, new C1207N(this, j8, 2)).getValue()).a;
        } else {
            j4 = 4294967295L;
            j5 = 0;
        }
        InterfaceC1028e interfaceC1028e = this.f12749B;
        return x5.D((int) (d6 >> 32), (int) (d6 & j4), wVar, new C1206M(w7, e1.j.e(interfaceC1028e != null ? interfaceC1028e.a(j8, d6, e1.m.f11576c) : 0L, j5), j9, fVar));
    }
}
