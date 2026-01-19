package N;

import D.AbstractC0090r0;
import S0.C0539a;
import S0.F;
import S0.P;
import Y3.v;
import a1.C0795c;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import e1.InterfaceC0961c;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public P f3535b;

    /* renamed from: c, reason: collision with root package name */
    public W0.d f3536c;

    /* renamed from: d, reason: collision with root package name */
    public int f3537d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3538e;

    /* renamed from: f, reason: collision with root package name */
    public int f3539f;

    /* renamed from: g, reason: collision with root package name */
    public int f3540g;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0961c f3542i;

    /* renamed from: j, reason: collision with root package name */
    public C0539a f3543j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3544k;

    /* renamed from: l, reason: collision with root package name */
    public long f3545l;

    /* renamed from: m, reason: collision with root package name */
    public b f3546m;

    /* renamed from: n, reason: collision with root package name */
    public S0.t f3547n;

    /* renamed from: o, reason: collision with root package name */
    public e1.m f3548o;

    /* renamed from: s, reason: collision with root package name */
    public long f3552s;

    /* renamed from: h, reason: collision with root package name */
    public long f3541h = a.a;

    /* renamed from: p, reason: collision with root package name */
    public long f3549p = AbstractC0960b.h(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f3550q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f3551r = -1;

    public e(String str, P p5, W0.d dVar, int i6, boolean z5, int i7, int i8) {
        this.a = str;
        this.f3535b = p5;
        this.f3536c = dVar;
        this.f3537d = i6;
        this.f3538e = z5;
        this.f3539f = i7;
        this.f3540g = i8;
        long j3 = 0;
        this.f3545l = (j3 & 4294967295L) | (j3 << 32);
    }

    public static long f(e eVar, long j3, e1.m mVar) {
        P p5 = eVar.f3535b;
        b bVar = eVar.f3546m;
        InterfaceC0961c interfaceC0961c = eVar.f3542i;
        AbstractC1276k.c(interfaceC0961c);
        b E5 = Y4.d.E(bVar, mVar, p5, interfaceC0961c, eVar.f3536c);
        eVar.f3546m = E5;
        return E5.a(j3, eVar.f3540g);
    }

    public final int a(int i6, e1.m mVar) {
        int i7 = this.f3550q;
        int i8 = this.f3551r;
        if (i6 == i7 && i7 != -1) {
            return i8;
        }
        long a = AbstractC0960b.a(0, i6, 0, TableCell.NOT_TRACKED);
        if (this.f3540g > 1) {
            a = f(this, a, mVar);
        }
        S0.t e6 = e(mVar);
        long q3 = s4.j.q(e6.c(), this.f3537d, a, this.f3538e);
        boolean z5 = this.f3538e;
        int i9 = this.f3537d;
        int i10 = this.f3539f;
        int o5 = AbstractC0090r0.o(new C0539a((C0795c) e6, ((z5 || !(i9 == 2 || i9 == 4 || i9 == 5)) && i10 >= 1) ? i10 : 1, i9, q3).b());
        int i11 = C0959a.i(a);
        if (o5 < i11) {
            o5 = i11;
        }
        this.f3550q = i6;
        this.f3551r = o5;
        return o5;
    }

    public final boolean b(long j3, e1.m mVar) {
        S0.t tVar;
        this.f3552s = (this.f3552s << 2) | 3;
        boolean z5 = true;
        long f6 = this.f3540g > 1 ? f(this, j3, mVar) : j3;
        C0539a c0539a = this.f3543j;
        boolean z6 = false;
        if (c0539a != null && (tVar = this.f3547n) != null && !tVar.a() && mVar == this.f3548o && (C0959a.b(f6, this.f3549p) || (C0959a.h(f6) == C0959a.h(this.f3549p) && C0959a.j(f6) == C0959a.j(this.f3549p) && C0959a.g(f6) >= c0539a.b() && !c0539a.f7617d.f8314d))) {
            if (!C0959a.b(f6, this.f3549p)) {
                C0539a c0539a2 = this.f3543j;
                AbstractC1276k.c(c0539a2);
                this.f3545l = AbstractC0960b.d(f6, (AbstractC0090r0.o(Math.min(c0539a2.a.f10561i.c(), c0539a2.d())) << 32) | (AbstractC0090r0.o(c0539a2.b()) & 4294967295L));
                if (this.f3537d == 3 || (((int) (r12 >> 32)) >= c0539a2.d() && ((int) (4294967295L & r12)) >= c0539a2.b())) {
                    z5 = false;
                }
                this.f3544k = z5;
                this.f3549p = f6;
            }
            return false;
        }
        S0.t e6 = e(mVar);
        long q3 = s4.j.q(e6.c(), this.f3537d, f6, this.f3538e);
        boolean z7 = this.f3538e;
        int i6 = this.f3537d;
        int i7 = this.f3539f;
        C0539a c0539a3 = new C0539a((C0795c) e6, ((z7 || !(i6 == 2 || i6 == 4 || i6 == 5)) && i7 >= 1) ? i7 : 1, i6, q3);
        this.f3549p = f6;
        this.f3545l = AbstractC0960b.d(f6, (AbstractC0090r0.o(c0539a3.b()) & 4294967295L) | (AbstractC0090r0.o(c0539a3.d()) << 32));
        if (this.f3537d != 3 && (((int) (r1 >> 32)) < c0539a3.d() || ((int) (r1 & 4294967295L)) < c0539a3.b())) {
            z6 = true;
        }
        this.f3544k = z6;
        this.f3543j = c0539a3;
        return true;
    }

    public final void c() {
        this.f3543j = null;
        this.f3547n = null;
        this.f3548o = null;
        this.f3550q = -1;
        this.f3551r = -1;
        this.f3549p = AbstractC0960b.h(0, 0, 0, 0);
        long j3 = 0;
        this.f3545l = (j3 & 4294967295L) | (j3 << 32);
        this.f3544k = false;
    }

    public final void d(InterfaceC0961c interfaceC0961c) {
        long j3;
        InterfaceC0961c interfaceC0961c2 = this.f3542i;
        if (interfaceC0961c != null) {
            int i6 = a.f3510b;
            j3 = a.a(interfaceC0961c.a(), interfaceC0961c.b0());
        } else {
            j3 = a.a;
        }
        if (interfaceC0961c2 == null) {
            this.f3542i = interfaceC0961c;
            this.f3541h = j3;
        } else if (interfaceC0961c == null || this.f3541h != j3) {
            this.f3542i = interfaceC0961c;
            this.f3541h = j3;
            this.f3552s = (this.f3552s << 2) | 1;
            c();
        }
    }

    public final S0.t e(e1.m mVar) {
        S0.t tVar = this.f3547n;
        if (tVar == null || mVar != this.f3548o || tVar.a()) {
            this.f3548o = mVar;
            String str = this.a;
            P h3 = F.h(this.f3535b, mVar);
            InterfaceC0961c interfaceC0961c = this.f3542i;
            AbstractC1276k.c(interfaceC0961c);
            W0.d dVar = this.f3536c;
            v vVar = v.f9812c;
            tVar = new C0795c(str, h3, vVar, vVar, dVar, interfaceC0961c);
        }
        this.f3547n = tVar;
        return tVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f3543j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.f3541h));
        sb.append(", history=");
        sb.append(this.f3552s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
