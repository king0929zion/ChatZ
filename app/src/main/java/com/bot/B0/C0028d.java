package B0;

import H0.A0;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.i0;
import I0.Q0;
import android.view.KeyEvent;
import h0.AbstractC1040q;
import i4.AbstractC1117a;
import l0.C1183c;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;
import m4.C1288w;
import n0.C1354c;
import o0.C1387I;
import o4.AbstractC1410a;
import u1.C1754d;
import v.AbstractC1787b;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0028d(int i6, Object obj, Object obj2) {
        super(0);
        this.f436e = i6;
        this.f437f = obj;
        this.f438g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.e] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        boolean dispatchKeyEvent;
        P0.p pVar;
        H0.J j3;
        C1354c c1354c;
        switch (this.f436e) {
            case 0:
                ((C0029e) this.f437f).d((AbstractC1040q) this.f438g);
                return X3.y.a;
            case 1:
                C0149f0 c0149f0 = ((H0.J) this.f437f).f1721J;
                C1288w c1288w = (C1288w) this.f438g;
                if ((c0149f0.f1919f.f11809g & 8) != 0) {
                    for (AbstractC1040q abstractC1040q = c0149f0.f1918e; abstractC1040q != null; abstractC1040q = abstractC1040q.f11810h) {
                        if ((abstractC1040q.f11808f & 8) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q;
                            ?? r42 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof A0) {
                                    A0 a02 = (A0) abstractC0156k;
                                    if (a02.N()) {
                                        P0.m mVar = new P0.m();
                                        c1288w.f12973c = mVar;
                                        mVar.f4495g = true;
                                    }
                                    if (a02.x0()) {
                                        ((P0.m) c1288w.f12973c).f4494f = true;
                                    }
                                    a02.I((P0.x) c1288w.f12973c);
                                } else if ((abstractC0156k.f11808f & 8) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r42 = r42;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & 8) != 0) {
                                            i6++;
                                            r42 = r42;
                                            if (i6 == 1) {
                                                abstractC0156k = abstractC1040q2;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r42.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r42.b(abstractC1040q2);
                                            }
                                        }
                                        abstractC1040q2 = abstractC1040q2.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r42 = r42;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r42);
                            }
                        }
                    }
                }
                return X3.y.a;
            case 2:
                l4.c cVar = (l4.c) this.f437f;
                C1387I c1387i = i0.f1933Q;
                cVar.f(c1387i);
                i0 i0Var = (i0) this.f438g;
                o0.L l3 = i0Var.f1944G;
                o0.L l5 = c1387i.f13425p;
                boolean z5 = l3 != l5;
                boolean z6 = i0Var.f1945H;
                boolean z7 = c1387i.f13426q;
                boolean z8 = z6 != z7;
                if (z5 || z8) {
                    i0Var.f1944G = l5;
                    i0Var.f1945H = z7;
                    if (i0Var.f1946I && (z8 || (z7 && z5))) {
                        i0Var.f1954r.F();
                    }
                }
                i0Var.f1946I = true;
                c1387i.f13433x = c1387i.f13425p.a(c1387i.f13428s, c1387i.f13430u, c1387i.f13429t);
                return X3.y.a;
            case 3:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f438g);
                return Boolean.valueOf(dispatchKeyEvent);
            case 4:
                I0.D d6 = (I0.D) this.f438g;
                Q0 q02 = (Q0) this.f437f;
                P0.j jVar = q02.f2239h;
                P0.j jVar2 = q02.f2240i;
                Float f6 = q02.f2237f;
                Float f7 = q02.f2238g;
                float floatValue = (jVar == null || f6 == null) ? 0.0f : ((Number) jVar.a.b()).floatValue() - f6.floatValue();
                float floatValue2 = (jVar2 == null || f7 == null) ? 0.0f : ((Number) jVar2.a.b()).floatValue() - f7.floatValue();
                if (floatValue != S.l.f7374V || floatValue2 != S.l.f7374V) {
                    int t5 = d6.t(q02.f2235c);
                    P0.q qVar = (P0.q) d6.l().b(d6.f2164o);
                    if (qVar != null) {
                        try {
                            C1754d c1754d = d6.f2166q;
                            if (c1754d != null) {
                                c1754d.a.setBoundsInScreen(d6.d(qVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    P0.q qVar2 = (P0.q) d6.l().b(d6.f2165p);
                    if (qVar2 != null) {
                        try {
                            C1754d c1754d2 = d6.f2167r;
                            if (c1754d2 != null) {
                                c1754d2.a.setBoundsInScreen(d6.d(qVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    d6.f2156g.invalidate();
                    P0.q qVar3 = (P0.q) d6.l().b(t5);
                    if (qVar3 != null && (pVar = qVar3.a) != null && (j3 = pVar.f4498c) != null) {
                        if (jVar != null) {
                            d6.f2169t.i(t5, jVar);
                        }
                        if (jVar2 != null) {
                            d6.f2170u.i(t5, jVar2);
                        }
                        d6.p(j3);
                    }
                }
                if (jVar != null) {
                    q02.f2237f = (Float) jVar.a.b();
                }
                if (jVar2 != null) {
                    q02.f2238g = (Float) jVar2.a.b();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f437f;
                if (interfaceC1193a != null && (c1354c = (C1354c) interfaceC1193a.b()) != null) {
                    return c1354c;
                }
                i0 i0Var2 = (i0) this.f438g;
                if (!i0Var2.W0().f11819q) {
                    i0Var2 = null;
                }
                if (i0Var2 != null) {
                    return AbstractC1117a.a(0L, AbstractC1410a.S(i0Var2.f1487f));
                }
                return null;
            case 6:
                ((C1288w) this.f437f).f12973c = AbstractC0157l.h((h1.u) this.f438g, F0.i0.a);
                return X3.y.a;
            case 7:
                ((C1183c) this.f437f).f12642t.f((l0.d) this.f438g);
                return X3.y.a;
            default:
                ((C1288w) this.f437f).f12973c = ((m0.C) this.f438g).O0();
                return X3.y.a;
        }
    }
}
