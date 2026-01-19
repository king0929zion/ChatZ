package B0;

import D.C0086p;
import D.Y;
import F0.AbstractC0107a;
import F0.C0;
import F0.C0128p;
import F0.D0;
import F0.E0;
import F0.F0;
import F0.InterfaceC0134w;
import H0.AbstractC0157l;
import H0.C0158m;
import H0.H0;
import H0.InterfaceC0138a;
import H0.i0;
import I0.AbstractC0217x0;
import I0.C0195m;
import I0.C0211u0;
import I0.C0219y0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import I3.AbstractC0238b;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import f0.C0987j;
import f0.C0996s;
import h0.InterfaceC1039p;
import j1.AbstractC1135a;
import java.util.List;
import java.util.Map;
import k.AbstractC1167n;
import k.C1147A;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import n.C1342q;
import n0.C1354c;
import o0.C1387I;
import o0.C1397h;
import org.jsoup.internal.SharedConstants;
import p0.AbstractC1467c;
import p0.C1468d;
import q0.InterfaceC1498d;
import v.AbstractC1787b;
import x3.C1883g;
import x4.AbstractC1888A;
import x4.C1928k;
import y.l0;
import z4.C2057h;

/* loaded from: classes.dex */
public final class G extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(Object obj, int i6) {
        super(1);
        this.f389e = i6;
        this.f390f = obj;
    }

    /* JADX WARN: Type inference failed for: r10v31, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [F0.k0, H0.a] */
    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f389e;
        int i7 = 0;
        X3.y yVar = X3.y.a;
        Object obj2 = this.f390f;
        switch (i6) {
            case 0:
                ((J) ((I) obj2).e()).f((MotionEvent) obj);
                return yVar;
            case 1:
                Throwable th = (Throwable) obj;
                V v5 = (V) obj2;
                C1928k c1928k = v5.f416f;
                if (c1928k != null) {
                    c1928k.w(th);
                }
                v5.f416f = null;
                return yVar;
            case 2:
                InterfaceC0138a interfaceC0138a = (InterfaceC0138a) obj;
                H0.K k3 = (H0.K) obj2;
                if (interfaceC0138a.p() != Integer.MAX_VALUE) {
                    if (interfaceC0138a.b().f1756b) {
                        interfaceC0138a.N();
                    }
                    for (Map.Entry entry : interfaceC0138a.b().f1763i.entrySet()) {
                        H0.K.a(k3, (AbstractC0107a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0138a.g());
                    }
                    i0 i0Var = interfaceC0138a.g().f1956t;
                    AbstractC1276k.c(i0Var);
                    while (!i0Var.equals(k3.a.g())) {
                        for (AbstractC0107a abstractC0107a : k3.b(i0Var).keySet()) {
                            H0.K.a(k3, abstractC0107a, k3.c(i0Var, abstractC0107a), i0Var);
                        }
                        i0Var = i0Var.f1956t;
                        AbstractC1276k.c(i0Var);
                    }
                }
                return yVar;
            case 3:
                ((V.e) obj2).b((InterfaceC1039p) obj);
                return Boolean.TRUE;
            case 4:
                return Boolean.valueOf(((m0.C) obj).T0(((m0.f) obj2).a));
            case AbstractC1787b.f15290g /* 5 */:
                H0.O o5 = (H0.O) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = ((C0195m) obj2).f2329s;
                if (viewTreeObserverOnGlobalLayoutListenerC0216x.getInsetsListener().f1512j.g() > 0) {
                    C1147A c1147a = E0.a;
                    o5.f1783c = true;
                    H0.S s5 = o5.f1786g;
                    InterfaceC0134w B02 = s5.B0();
                    if (e1.j.c(o5.f1784e, 9223372034707292159L)) {
                        o5.f1784e = Y3.C.Q(B02.r(0L));
                        o5.f1785f = B02.m();
                    }
                    s5.D0().f1722K.b();
                    long m3 = B02.m();
                    k.M m5 = viewTreeObserverOnGlobalLayoutListenerC0216x.getInsetsListener().f1511i;
                    int i8 = (int) (m3 >> 32);
                    int i9 = (int) (4294967295L & m3);
                    for (C0 c02 : E0.f1398b) {
                        Object g3 = m5.g(c02);
                        AbstractC1276k.c(g3);
                        F0 f02 = (F0) g3;
                        D0 d02 = (D0) c02;
                        E0.a(o5, d02.f1395c, f02.f1406h, i8, i9);
                        if (((Boolean) f02.f1400b.getValue()).booleanValue()) {
                            E0.a(o5, f02.f1404f, f02.f1408j, i8, i9);
                            E0.a(o5, f02.f1405g, f02.f1409k, i8, i9);
                        }
                        E0.a(o5, d02.f1396d, f02.f1407i, i8, i9);
                    }
                    k.I i10 = viewTreeObserverOnGlobalLayoutListenerC0216x.getInsetsListener().f1513k;
                    if (i10.i()) {
                        C0996s c0996s = viewTreeObserverOnGlobalLayoutListenerC0216x.getInsetsListener().f1514l;
                        Object[] objArr = i10.a;
                        int i11 = i10.f12466b;
                        while (i7 < i11) {
                            T.X x5 = (T.X) objArr[i7];
                            C0128p c0128p = (C0128p) c0996s.get(i7);
                            Rect rect = (Rect) x5.getValue();
                            o5.b(c0128p.b(), rect.left);
                            o5.b(c0128p.d(), rect.top);
                            o5.b(c0128p.c(), rect.right);
                            o5.b(c0128p.a(), rect.bottom);
                            i7++;
                        }
                    }
                }
                return yVar;
            case 6:
                return Boolean.valueOf(((AbstractC1167n) obj2).a(((P0.p) obj).f4502g));
            case 7:
                return Boolean.valueOf(I0.K.c((P0.p) obj, (Resources) obj2));
            case 8:
                return new Y((C0211u0) obj2, 2);
            case AbstractC1787b.f15287d /* 9 */:
                if (AbstractC0217x0.f2489b.compareAndSet(false, true)) {
                    ((C2057h) obj2).t(yVar);
                }
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                o0.q g6 = interfaceC1498d.g0().g();
                l4.e eVar = ((C0219y0) obj2).f2494g;
                if (eVar != null) {
                    eVar.m(g6, (r0.b) interfaceC1498d.g0().f1973f);
                }
                return yVar;
            case 11:
                X0.m mVar = (X0.m) obj;
                M.z zVar = mVar.f9114b;
                if (zVar != null) {
                    mVar.a(zVar);
                    mVar.f9114b = null;
                }
                I0.D0 d03 = (I0.D0) obj2;
                V.e eVar2 = d03.f2178d;
                Object[] objArr2 = eVar2.f8759c;
                int i12 = eVar2.f8761f;
                while (true) {
                    if (i7 >= i12) {
                        i7 = -1;
                    } else if (!AbstractC1276k.b((H0) objArr2[i7], mVar)) {
                        i7++;
                    }
                }
                if (i7 >= 0) {
                    eVar2.k(i7);
                }
                if (eVar2.f8761f == 0) {
                    d03.f2176b.b();
                }
                return yVar;
            case 12:
                byte byteValue = ((Number) obj).byteValue();
                StringBuilder sb = (StringBuilder) obj2;
                if (byteValue == 32) {
                    sb.append("%20");
                } else if (AbstractC0238b.a.contains(Byte.valueOf(byteValue)) || AbstractC0238b.f2738c.contains(Byte.valueOf(byteValue))) {
                    sb.append((char) byteValue);
                } else {
                    sb.append(AbstractC0238b.a(byteValue));
                }
                return yVar;
            case 13:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return yVar;
            case 14:
                P0.v.e((P0.x) obj, ((P0.i) obj2).a);
                return yVar;
            case 15:
                P0.v.c((P0.x) obj, (String) obj2);
                return yVar;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                ((List) obj).add((Float) ((l0) obj2).b());
                return true;
            case 17:
                ((H0.J) obj2).b0((InterfaceC0961c) obj);
                return yVar;
            case 18:
                C1354c c1354c = (C1354c) obj;
                h1.p pVar = (h1.p) obj2;
                if (pVar.f11819q) {
                    AbstractC1888A.y(pVar.A0(), null, new h1.o(pVar, c1354c, null), 3);
                }
                return yVar;
            case 19:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((io.ktor.utils.io.jvm.javaio.b) obj2).f12196b.k(X3.a.b(th2));
                }
                return yVar;
            case 20:
                k0.e eVar3 = (k0.e) obj;
                if (!eVar3.f11806c.f11819q) {
                    return H0.E0.f1693e;
                }
                k0.e eVar4 = eVar3.f12596s;
                H0.E0 e02 = H0.E0.f1692c;
                if (eVar4 != null) {
                    G g7 = new G((C0987j) obj2, 20);
                    if (g7.f(eVar4) == e02) {
                        AbstractC0157l.B(eVar4, g7);
                    }
                }
                eVar3.f12596s = null;
                eVar3.f12595r = null;
                return e02;
            case 21:
                H0.L l3 = (H0.L) obj;
                ((C0086p) obj2).f(l3);
                l3.b();
                return yVar;
            case 22:
                C1387I c1387i = (C1387I) obj;
                l0.o oVar = (l0.o) obj2;
                c1387i.l(c1387i.a() * oVar.a);
                c1387i.m(oVar.f12660b);
                c1387i.g(oVar.f12661c);
                c1387i.e(oVar.f12662d);
                c1387i.o(oVar.f12663e);
                return yVar;
            case 23:
                return Boolean.valueOf(AbstractC1276k.b(obj, obj2));
            case 24:
                C1342q c1342q = (C1342q) obj;
                float f6 = c1342q.f13215b;
                float f7 = S.l.f7374V;
                if (f6 < S.l.f7374V) {
                    f6 = 0.0f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                float f8 = c1342q.f13216c;
                if (f8 < -0.5f) {
                    f8 = -0.5f;
                }
                if (f8 > 0.5f) {
                    f8 = 0.5f;
                }
                float f9 = c1342q.f13217d;
                float f10 = f9 >= -0.5f ? f9 : -0.5f;
                float f11 = f10 <= 0.5f ? f10 : 0.5f;
                float f12 = c1342q.a;
                if (f12 >= S.l.f7374V) {
                    f7 = f12;
                }
                return new o0.s(o0.s.b(o0.y.b(f6, f8, f11, f7 <= 1.0f ? f7 : 1.0f, C1468d.f13860x), (AbstractC1467c) obj2));
            case 25:
                return new e1.j((0 & 4294967295L) | (((Number) ((AbstractC1277l) obj2).f(Integer.valueOf((int) (((e1.l) obj).a >> 32)))).intValue() << 32));
            case 26:
                C1387I c1387i2 = (C1387I) obj;
                o0.M m6 = (o0.M) obj2;
                c1387i2.j(m6.f13445r);
                c1387i2.k(m6.f13446s);
                c1387i2.d(m6.f13447t);
                c1387i2.q(m6.f13448u);
                c1387i2.r(m6.f13449v);
                c1387i2.l(m6.f13450w);
                float f13 = m6.f13451x;
                if (c1387i2.f13422m != f13) {
                    c1387i2.f13413c |= PegdownExtensions.ANCHORLINKS;
                    c1387i2.f13422m = f13;
                }
                float f14 = m6.f13452y;
                if (c1387i2.f13423n != f14) {
                    c1387i2.f13413c |= 2048;
                    c1387i2.f13423n = f14;
                }
                c1387i2.p(m6.f13453z);
                c1387i2.m(m6.f13438A);
                c1387i2.g(m6.f13439B);
                c1387i2.h(null);
                c1387i2.e(m6.f13440C);
                c1387i2.o(m6.f13441D);
                int i13 = m6.f13442E;
                if (c1387i2.f13427r != i13) {
                    c1387i2.f13413c |= SharedConstants.DefaultBufferSize;
                    c1387i2.f13427r = i13;
                }
                int i14 = m6.f13443F;
                if (c1387i2.f13432w != i14) {
                    c1387i2.f13413c |= PegdownExtensions.SUBSCRIPT;
                    c1387i2.f13432w = i14;
                }
                return yVar;
            case 27:
                InterfaceC1498d interfaceC1498d2 = (InterfaceC1498d) obj;
                r0.b bVar = (r0.b) obj2;
                C1397h c1397h = bVar.f14544l;
                if (bVar.f14546n && bVar.f14555w && c1397h != null) {
                    C0158m g02 = interfaceC1498d2.g0();
                    long j3 = g02.j();
                    g02.g().h();
                    try {
                        ((C0158m) ((C0987j) g02.f1972e).f11690e).g().f(c1397h);
                        bVar.c(interfaceC1498d2);
                    } finally {
                        AbstractC1135a.q(g02, j3);
                    }
                } else {
                    bVar.c(interfaceC1498d2);
                }
                return yVar;
            case 28:
                t3.d dVar = (t3.d) obj;
                AbstractC1276k.f(dVar, "scope");
                N3.j jVar = (N3.j) dVar.f14929l.a(z3.v.a, t3.e.f14932e);
                z3.u uVar = (z3.u) obj2;
                Object obj3 = dVar.f14931n.f14933b.get(uVar.getKey());
                AbstractC1276k.c(obj3);
                Object a = uVar.a((l4.c) obj3);
                uVar.b(a, dVar);
                jVar.f(uVar.getKey(), a);
                return yVar;
            default:
                ((C1883g) obj2).close();
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(l4.c cVar) {
        super(1);
        this.f389e = 25;
        this.f390f = (AbstractC1277l) cVar;
    }
}
