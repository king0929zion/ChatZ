package N;

import D.AbstractC0090r0;
import S0.C0545g;
import S0.C0554p;
import S0.F;
import S0.K;
import S0.L;
import S0.P;
import Y3.v;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import e1.InterfaceC0961c;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d {
    public C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public W0.d f3519b;

    /* renamed from: c, reason: collision with root package name */
    public int f3520c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3521d;

    /* renamed from: e, reason: collision with root package name */
    public int f3522e;

    /* renamed from: f, reason: collision with root package name */
    public int f3523f;

    /* renamed from: g, reason: collision with root package name */
    public List f3524g;

    /* renamed from: h, reason: collision with root package name */
    public b f3525h;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0961c f3527j;

    /* renamed from: k, reason: collision with root package name */
    public P f3528k;

    /* renamed from: l, reason: collision with root package name */
    public E1.b f3529l;

    /* renamed from: m, reason: collision with root package name */
    public e1.m f3530m;

    /* renamed from: n, reason: collision with root package name */
    public L f3531n;

    /* renamed from: q, reason: collision with root package name */
    public long f3534q;

    /* renamed from: i, reason: collision with root package name */
    public long f3526i = a.a;

    /* renamed from: o, reason: collision with root package name */
    public int f3532o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f3533p = -1;

    public d(C0545g c0545g, P p5, W0.d dVar, int i6, boolean z5, int i7, int i8, List list) {
        this.a = c0545g;
        this.f3519b = dVar;
        this.f3520c = i6;
        this.f3521d = z5;
        this.f3522e = i7;
        this.f3523f = i8;
        this.f3524g = list;
        this.f3528k = p5;
    }

    public final int a(int i6, e1.m mVar) {
        int i7 = this.f3532o;
        int i8 = this.f3533p;
        if (i6 == i7 && i7 != -1) {
            return i8;
        }
        long a = AbstractC0960b.a(0, i6, 0, TableCell.NOT_TRACKED);
        if (this.f3523f > 1) {
            b bVar = this.f3525h;
            P p5 = this.f3528k;
            InterfaceC0961c interfaceC0961c = this.f3527j;
            AbstractC1276k.c(interfaceC0961c);
            b E5 = Y4.d.E(bVar, mVar, p5, interfaceC0961c, this.f3519b);
            this.f3525h = E5;
            a = E5.a(a, this.f3523f);
        }
        int o5 = AbstractC0090r0.o(b(a, mVar).f7651e);
        int i9 = C0959a.i(a);
        if (o5 < i9) {
            o5 = i9;
        }
        this.f3532o = i6;
        this.f3533p = o5;
        return o5;
    }

    public final C0554p b(long j3, e1.m mVar) {
        E1.b e6 = e(mVar);
        long q3 = s4.j.q(e6.c(), this.f3520c, j3, this.f3521d);
        boolean z5 = this.f3521d;
        int i6 = this.f3520c;
        int i7 = this.f3522e;
        return new C0554p(e6, q3, ((z5 || !(i6 == 2 || i6 == 4 || i6 == 5)) && i7 >= 1) ? i7 : 1, i6);
    }

    public final boolean c(long j3, e1.m mVar) {
        this.f3534q = (this.f3534q << 2) | 3;
        if (this.f3523f > 1) {
            b bVar = this.f3525h;
            P p5 = this.f3528k;
            InterfaceC0961c interfaceC0961c = this.f3527j;
            AbstractC1276k.c(interfaceC0961c);
            b E5 = Y4.d.E(bVar, mVar, p5, interfaceC0961c, this.f3519b);
            this.f3525h = E5;
            j3 = E5.a(j3, this.f3523f);
        }
        L l3 = this.f3531n;
        if (l3 != null) {
            C0554p c0554p = l3.f7599b;
            K k3 = l3.a;
            if (!c0554p.a.a()) {
                e1.m mVar2 = k3.f7596h;
                long j4 = k3.f7598j;
                if (mVar == mVar2 && (C0959a.b(j3, j4) || (C0959a.h(j3) == C0959a.h(j4) && C0959a.j(j3) == C0959a.j(j4) && C0959a.g(j3) >= c0554p.f7651e && !c0554p.f7649c))) {
                    L l5 = this.f3531n;
                    AbstractC1276k.c(l5);
                    if (C0959a.b(j3, l5.a.f7598j)) {
                        return false;
                    }
                    L l6 = this.f3531n;
                    AbstractC1276k.c(l6);
                    this.f3531n = f(mVar, j3, l6.f7599b);
                    return true;
                }
            }
        }
        this.f3531n = f(mVar, j3, b(j3, mVar));
        return true;
    }

    public final void d(InterfaceC0961c interfaceC0961c) {
        long j3;
        InterfaceC0961c interfaceC0961c2 = this.f3527j;
        if (interfaceC0961c != null) {
            int i6 = a.f3510b;
            j3 = a.a(interfaceC0961c.a(), interfaceC0961c.b0());
        } else {
            j3 = a.a;
        }
        if (interfaceC0961c2 == null) {
            this.f3527j = interfaceC0961c;
            this.f3526i = j3;
        } else if (interfaceC0961c == null || this.f3526i != j3) {
            this.f3527j = interfaceC0961c;
            this.f3526i = j3;
            this.f3534q = (this.f3534q << 2) | 1;
            this.f3529l = null;
            this.f3531n = null;
            this.f3533p = -1;
            this.f3532o = -1;
        }
    }

    public final E1.b e(e1.m mVar) {
        E1.b bVar = this.f3529l;
        if (bVar == null || mVar != this.f3530m || bVar.a()) {
            this.f3530m = mVar;
            C0545g c0545g = this.a;
            P h3 = F.h(this.f3528k, mVar);
            InterfaceC0961c interfaceC0961c = this.f3527j;
            AbstractC1276k.c(interfaceC0961c);
            W0.d dVar = this.f3519b;
            List list = this.f3524g;
            if (list == null) {
                list = v.f9812c;
            }
            bVar = new E1.b(c0545g, h3, list, interfaceC0961c, dVar);
        }
        this.f3529l = bVar;
        return bVar;
    }

    public final L f(e1.m mVar, long j3, C0554p c0554p) {
        float min = Math.min(c0554p.a.c(), c0554p.f7650d);
        C0545g c0545g = this.a;
        P p5 = this.f3528k;
        List list = this.f3524g;
        if (list == null) {
            list = v.f9812c;
        }
        int i6 = this.f3522e;
        boolean z5 = this.f3521d;
        int i7 = this.f3520c;
        InterfaceC0961c interfaceC0961c = this.f3527j;
        AbstractC1276k.c(interfaceC0961c);
        return new L(new K(c0545g, p5, list, i6, z5, i7, interfaceC0961c, mVar, this.f3519b, j3), c0554p, AbstractC0960b.d(j3, (AbstractC0090r0.o(min) << 32) | (AbstractC0090r0.o(c0554p.f7651e) & 4294967295L)));
    }

    public final String toString() {
        K k3;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        sb.append(this.f3531n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) a.b(this.f3526i));
        sb.append(", history=");
        sb.append(this.f3534q);
        sb.append(", constraints=");
        L l3 = this.f3531n;
        if (l3 != null && (k3 = l3.a) != null) {
            obj = new C0959a(k3.f7598j);
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
