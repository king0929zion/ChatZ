package D;

import F0.InterfaceC0134w;
import S0.AbstractC0546h;
import S0.C0545g;
import T.C0607g0;
import T.C0627q0;

/* renamed from: D.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098v0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0607g0 f1181A;

    /* renamed from: B, reason: collision with root package name */
    public final C0607g0 f1182B;
    public G0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0627q0 f1183b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.S0 f1184c;

    /* renamed from: d, reason: collision with root package name */
    public final M.q f1185d;

    /* renamed from: e, reason: collision with root package name */
    public X0.A f1186e;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f1187f;

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f1188g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0134w f1189h;

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f1190i;

    /* renamed from: j, reason: collision with root package name */
    public C0545g f1191j;

    /* renamed from: k, reason: collision with root package name */
    public final C0607g0 f1192k;

    /* renamed from: l, reason: collision with root package name */
    public final C0607g0 f1193l;

    /* renamed from: m, reason: collision with root package name */
    public final C0607g0 f1194m;

    /* renamed from: n, reason: collision with root package name */
    public final C0607g0 f1195n;

    /* renamed from: o, reason: collision with root package name */
    public final C0607g0 f1196o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1197p;

    /* renamed from: q, reason: collision with root package name */
    public final C0607g0 f1198q;

    /* renamed from: r, reason: collision with root package name */
    public final C0092s0 f1199r;

    /* renamed from: s, reason: collision with root package name */
    public final C0607g0 f1200s;

    /* renamed from: t, reason: collision with root package name */
    public final C0607g0 f1201t;

    /* renamed from: u, reason: collision with root package name */
    public l4.c f1202u;

    /* renamed from: v, reason: collision with root package name */
    public final Q f1203v;

    /* renamed from: w, reason: collision with root package name */
    public final Q f1204w;

    /* renamed from: x, reason: collision with root package name */
    public final Q f1205x;

    /* renamed from: y, reason: collision with root package name */
    public final L1.d f1206y;

    /* renamed from: z, reason: collision with root package name */
    public long f1207z;

    public C0098v0(G0 g02, C0627q0 c0627q0, I0.S0 s02) {
        this.a = g02;
        this.f1183b = c0627q0;
        this.f1184c = s02;
        M.q qVar = new M.q(29, false);
        C0545g c0545g = AbstractC0546h.a;
        long j3 = S0.O.f7610b;
        X0.v vVar = new X0.v(c0545g, j3, (S0.O) null);
        qVar.f3179e = vVar;
        qVar.f3180f = new X0.h(c0545g, vVar.f9125b);
        this.f1185d = qVar;
        Boolean bool = Boolean.FALSE;
        this.f1187f = T.r.A(bool);
        this.f1188g = T.r.A(new e1.f(0));
        this.f1190i = T.r.A(null);
        this.f1192k = T.r.A(EnumC0075j0.f1042c);
        this.f1193l = T.r.A(bool);
        this.f1194m = T.r.A(bool);
        this.f1195n = T.r.A(bool);
        this.f1196o = T.r.A(bool);
        this.f1197p = true;
        this.f1198q = T.r.A(Boolean.TRUE);
        this.f1199r = new C0092s0(s02);
        this.f1200s = T.r.A(bool);
        this.f1201t = T.r.A(bool);
        this.f1202u = new A2.a(5);
        this.f1203v = new Q(this, 2);
        this.f1204w = new Q(this, 3);
        this.f1205x = new Q(this, 4);
        this.f1206y = o0.y.g();
        this.f1207z = o0.s.f13481h;
        this.f1181A = T.r.A(new S0.O(j3));
        this.f1182B = T.r.A(new S0.O(j3));
    }

    public final EnumC0075j0 a() {
        return (EnumC0075j0) this.f1192k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f1187f.getValue()).booleanValue();
    }

    public final InterfaceC0134w c() {
        InterfaceC0134w interfaceC0134w = this.f1189h;
        if (interfaceC0134w == null || !interfaceC0134w.j()) {
            return null;
        }
        return interfaceC0134w;
    }

    public final d1 d() {
        return (d1) this.f1190i.getValue();
    }

    public final void e(long j3) {
        this.f1182B.setValue(new S0.O(j3));
    }

    public final void f(long j3) {
        this.f1181A.setValue(new S0.O(j3));
    }
}
