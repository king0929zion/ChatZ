package D;

import H0.C0158m;
import O.InterfaceC0326p;
import Q.C0405d2;
import Q.C0416g1;
import Q.D1;
import Q.s3;
import S0.C0543e;
import S0.C0545g;
import S0.C0554p;
import X0.C0683a;
import Z2.AbstractC0783w;
import a3.C0811I;
import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.lifecycle.InterfaceC0846u;
import b0.C0873f;
import b3.C0889e;
import b4.InterfaceC0905c;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d1.C0934a;
import f0.C0987j;
import f0.C0996s;
import h0.InterfaceC1027d;
import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.C1283r;
import m4.C1285t;
import m4.C1288w;
import n.C1332k;
import n0.C1354c;
import n0.C1356e;
import o0.AbstractC1404o;
import o0.C1389K;
import o4.AbstractC1410a;
import q.AbstractC1490b;
import q.C1492d;
import q0.AbstractC1499e;
import q0.C1496b;
import q0.InterfaceC1498d;
import r.B1;
import r.C1515D;
import r.C1521G;
import r.E1;
import r.InterfaceC1563e1;
import r.h2;
import v.AbstractC1787b;
import v.InterfaceC1802i0;
import x.C1856g;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0091s implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1151c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1154g;

    public /* synthetic */ C0091s(int i6, Object obj, Object obj2, l4.c cVar) {
        this.f1151c = i6;
        this.f1153f = obj;
        this.f1152e = cVar;
        this.f1154g = obj2;
    }

    private final Object a(Object obj) {
        F0.X x5 = (F0.X) this.f1152e;
        R.L l3 = (R.L) this.f1153f;
        F0.k0 k0Var = (F0.k0) this.f1154g;
        F0.j0 j0Var = (F0.j0) obj;
        float d6 = x5.d0() ? l3.f6705r.d().d(l3.f6705r.f6831h.getValue()) : l3.f6705r.f();
        r.X0 x02 = l3.f6707t;
        float f6 = x02 == r.X0.f14184e ? d6 : 0.0f;
        if (x02 != r.X0.f14183c) {
            d6 = 0.0f;
        }
        j0Var.f1484c = true;
        j0Var.h(k0Var, AbstractC1410a.K(f6), AbstractC1410a.K(d6), S.l.f7374V);
        j0Var.f1484c = false;
        return X3.y.a;
    }

    private final Object e(Object obj) {
        R2.A a = (R2.A) this.f1152e;
        m0.n nVar = (m0.n) this.f1153f;
        X2.L l3 = (X2.L) this.f1154g;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue || a != R2.A.f6855e) {
            l3.n(booleanValue);
        } else {
            ((m0.q) nVar).b(true);
            l3.m(R2.A.f6854c);
        }
        return X3.y.a;
    }

    private final Object g(Object obj) {
        List list = (List) this.f1152e;
        List list2 = (List) this.f1153f;
        l4.e eVar = (l4.e) this.f1154g;
        C1856g c1856g = (C1856g) obj;
        AbstractC1276k.f(c1856g, "$this$LazyColumn");
        c1856g.o(list.size(), new C0069g0(14, new S2.Y(16), list), new P2.S(list, 11), new C0873f(new P2.W0(list, list2, eVar, 2), true, 802480018));
        return X3.y.a;
    }

    private final Object h(Object obj) {
        List list = (List) this.f1153f;
        T.d1 d1Var = (T.d1) this.f1154g;
        l4.c cVar = (l4.c) this.f1152e;
        C1856g c1856g = (C1856g) obj;
        AbstractC1276k.f(c1856g, "$this$LazyColumn");
        if (((Boolean) d1Var.getValue()).booleanValue()) {
            C1856g.n(c1856g, null, AbstractC0783w.f10414d0, 3);
        }
        c1856g.o(list.size(), new C0069g0(16, new S2.Y(20), list), new P2.S(list, 13), new C0873f(new U2.n(list, 2, cVar), true, 802480018));
        return X3.y.a;
    }

    private final Object k(Object obj) {
        List list = (List) this.f1153f;
        C0811I c0811i = (C0811I) this.f1154g;
        l4.c cVar = (l4.c) this.f1152e;
        C1856g c1856g = (C1856g) obj;
        AbstractC1276k.f(c1856g, "$this$LazyColumn");
        c1856g.o(list.size(), new C0069g0(17, new S2.Y(21), list), new P2.S(list, 14), new C0873f(new P2.W0(list, c0811i, cVar, 3), true, 802480018));
        return X3.y.a;
    }

    private final Object l(Object obj) {
        e0.d dVar = (e0.d) this.f1152e;
        e0.i iVar = (e0.i) this.f1154g;
        k.M m3 = dVar.f11554e;
        Object obj2 = this.f1153f;
        if (!m3.b(obj2)) {
            dVar.f11553c.remove(obj2);
            m3.m(obj2, iVar);
            return new J1.n(dVar, obj2, iVar, 2);
        }
        throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
    }

    private final Object o(Object obj) {
        C1515D c1515d = (C1515D) this.f1152e;
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) this.f1153f;
        B1 b1 = (B1) this.f1154g;
        float floatValue = ((Float) obj).floatValue();
        float f6 = c1515d.f13996t ? 1.0f : -1.0f;
        E1 e12 = c1515d.f13995s;
        long e6 = e12.e(e12.h(f6 * floatValue));
        E1 e13 = b1.a;
        float g3 = e12.g(e12.e(e13.c(e13.f14022k, e6, 1))) * f6;
        if (Math.abs(g3) < Math.abs(floatValue)) {
            interfaceC1922e0.f(AbstractC1888A.a("Scroll animation cancelled because scroll was not consumed (" + g3 + " < " + floatValue + ')', null));
        }
        return X3.y.a;
    }

    private final Object p(Object obj) {
        C1285t c1285t = (C1285t) this.f1152e;
        InterfaceC1563e1 interfaceC1563e1 = (InterfaceC1563e1) this.f1153f;
        C1285t c1285t2 = (C1285t) this.f1154g;
        C1332k c1332k = (C1332k) obj;
        float floatValue = ((Number) c1332k.f13171e.getValue()).floatValue() - c1285t.f12970c;
        float a = interfaceC1563e1.a(floatValue);
        c1285t.f12970c = ((Number) c1332k.f13171e.getValue()).floatValue();
        c1285t2.f12970c = ((Number) c1332k.a.f12988b.f(c1332k.f13172f)).floatValue();
        if (Math.abs(floatValue - a) > 0.5f) {
            c1332k.a();
        }
        return X3.y.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // l4.c
    public final Object f(Object obj) {
        o0.q qVar;
        C0543e c0543e;
        Integer e6;
        Integer d6;
        Integer d7;
        Integer e7;
        S0.L l3;
        S0.L l5;
        d1 d1Var;
        d1 d1Var2;
        S0.L l6;
        S0.L l7;
        d1 d1Var3;
        d1 d1Var4;
        Integer d8;
        Integer e8;
        Integer e9;
        Integer d9;
        X0.v vVar;
        M.q qVar2;
        X0.v vVar2;
        List actions;
        C0873f c0873f;
        boolean shouldShowIcon;
        int i6 = this.f1151c;
        int i7 = 6;
        int i8 = 3;
        int i9 = 4;
        final int i10 = 2;
        InterfaceC0905c interfaceC0905c = null;
        X3.y yVar = X3.y.a;
        int i11 = 0;
        Object obj2 = this.f1154g;
        Object obj3 = this.f1153f;
        Object obj4 = this.f1152e;
        final int i12 = 1;
        switch (i6) {
            case 0:
                l4.c cVar = (l4.c) obj4;
                T.X x5 = (T.X) obj2;
                X0.v vVar3 = (X0.v) obj;
                ((T.X) obj3).setValue(vVar3);
                boolean b5 = AbstractC1276k.b((String) x5.getValue(), vVar3.a.f7630e);
                C0545g c0545g = vVar3.a;
                x5.setValue(c0545g.f7630e);
                if (!b5) {
                    cVar.f(c0545g.f7630e);
                }
                return yVar;
            case 1:
                o0.s sVar = null;
                C0098v0 c0098v0 = (C0098v0) obj4;
                X0.v vVar4 = (X0.v) obj3;
                X0.p pVar = (X0.p) obj2;
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                d1 d10 = c0098v0.d();
                if (d10 != null) {
                    o0.q g3 = interfaceC1498d.g0().g();
                    long j3 = ((S0.O) c0098v0.f1181A.getValue()).a;
                    long j4 = ((S0.O) c0098v0.f1182B.getValue()).a;
                    S0.L l8 = d10.a;
                    C0554p c0554p = l8.f7599b;
                    S0.K k3 = l8.a;
                    L1.d dVar = c0098v0.f1206y;
                    long j5 = c0098v0.f1207z;
                    if (!S0.O.c(j3)) {
                        dVar.e(j5);
                        int b6 = pVar.b(S0.O.f(j3));
                        int b7 = pVar.b(S0.O.e(j3));
                        if (b6 != b7) {
                            g3.e(l8.k(b6, b7), dVar);
                        }
                    } else if (!S0.O.c(j4)) {
                        long b8 = k3.f7590b.b();
                        o0.s sVar2 = new o0.s(b8);
                        if (b8 != 16) {
                            sVar = sVar2;
                        }
                        long j6 = sVar != null ? sVar.a : o0.s.f13475b;
                        dVar.e(o0.s.c(o0.s.e(j6) * 0.2f, j6));
                        int b9 = pVar.b(S0.O.f(j4));
                        int b10 = pVar.b(S0.O.e(j4));
                        if (b9 != b10) {
                            g3.e(l8.k(b9, b10), dVar);
                        }
                    } else if (!S0.O.c(vVar4.f9125b)) {
                        dVar.e(j5);
                        long j7 = vVar4.f9125b;
                        int b11 = pVar.b(S0.O.f(j7));
                        int b12 = pVar.b(S0.O.e(j7));
                        if (b11 != b12) {
                            g3.e(l8.k(b11, b12), dVar);
                        }
                    }
                    if (l8.d() && k3.f7594f != 3) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        long j8 = l8.f7600c;
                        C1354c a = AbstractC1117a.a(0L, (Float.floatToRawIntBits((int) (j8 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j8 & 4294967295L)) & 4294967295L));
                        g3.h();
                        o0.q.q(g3, a);
                    }
                    S0.G g6 = k3.f7590b.a;
                    d1.l lVar = g6.f7582m;
                    d1.o oVar = g6.a;
                    if (lVar == null) {
                        lVar = d1.l.f11393b;
                    }
                    d1.l lVar2 = lVar;
                    C1389K c1389k = g6.f7583n;
                    if (c1389k == null) {
                        c1389k = C1389K.f13435d;
                    }
                    C1389K c1389k2 = c1389k;
                    AbstractC1499e abstractC1499e = g6.f7585p;
                    if (abstractC1499e == null) {
                        abstractC1499e = q0.g.a;
                    }
                    AbstractC1499e abstractC1499e2 = abstractC1499e;
                    try {
                        AbstractC1404o c6 = oVar.c();
                        d1.n nVar = d1.n.a;
                        try {
                            if (c6 != null) {
                                qVar = g3;
                                c0554p.j(qVar, c6, oVar != nVar ? oVar.a() : 1.0f, c1389k2, lVar2, abstractC1499e2);
                            } else {
                                qVar = g3;
                                c0554p.i(qVar, oVar != nVar ? oVar.b() : o0.s.f13475b, c1389k2, lVar2, abstractC1499e2);
                            }
                            if (i11 != 0) {
                                qVar.p();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i11 != 0) {
                                g3.p();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return yVar;
            case 2:
                C1283r c1283r = (C1283r) obj4;
                C0543e c0543e2 = (C0543e) obj3;
                S0.G g7 = (S0.G) obj2;
                C0543e c0543e3 = (C0543e) obj;
                if (c1283r.f12968c) {
                    Object obj5 = c0543e3.a;
                    int i13 = c0543e3.f7627c;
                    int i14 = c0543e3.f7626b;
                    if ((obj5 instanceof S0.G) && i14 == c0543e2.f7626b && i13 == c0543e2.f7627c) {
                        if (g7 == null) {
                            g7 = new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65535);
                        }
                        c0543e = new C0543e(i14, i13, g7);
                        c1283r.f12968c = c0543e2.equals(c0543e3);
                        return c0543e;
                    }
                }
                c0543e = c0543e3;
                c1283r.f12968c = c0543e2.equals(c0543e3);
                return c0543e;
            case 3:
                l4.c cVar2 = (l4.c) obj4;
                X0.A a6 = (X0.A) ((C1288w) obj2).f12973c;
                X0.v h3 = ((M.q) obj3).h((List) obj);
                if (a6 != null) {
                    a6.a(null, h3);
                }
                cVar2.f(h3);
                return yVar;
            case 4:
                N0 n02 = (N0) obj3;
                C1283r c1283r2 = (C1283r) obj2;
                O.E0 e02 = (O.E0) obj;
                switch (((EnumC0083n0) obj4).ordinal()) {
                    case 0:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (S0.O.c(e02.f3937f)) {
                                e02.i();
                            } else if (e02.f()) {
                                int f6 = S0.O.f(e02.f3937f);
                                e02.q(f6, f6);
                            } else {
                                int e10 = S0.O.e(e02.f3937f);
                                e02.q(e10, e10);
                            }
                        }
                        return yVar;
                    case 1:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (S0.O.c(e02.f3937f)) {
                                e02.m();
                            } else if (e02.f()) {
                                int e11 = S0.O.e(e02.f3937f);
                                e02.q(e11, e11);
                            } else {
                                int f7 = S0.O.f(e02.f3937f);
                                e02.q(f7, f7);
                            }
                        }
                        return yVar;
                    case 2:
                        O.S0 s02 = e02.f3936e;
                        s02.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                s02.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (d6 = e02.d()) != null) {
                                    int intValue = d6.intValue();
                                    e02.q(intValue, intValue);
                                }
                            } else {
                                s02.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (e6 = e02.e()) != null) {
                                    int intValue2 = e6.intValue();
                                    e02.q(intValue2, intValue2);
                                }
                            }
                        }
                        return yVar;
                    case 3:
                        O.S0 s03 = e02.f3936e;
                        s03.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                s03.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (e7 = e02.e()) != null) {
                                    int intValue3 = e7.intValue();
                                    e02.q(intValue3, intValue3);
                                }
                            } else {
                                s03.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (d7 = e02.d()) != null) {
                                    int intValue4 = d7.intValue();
                                    e02.q(intValue4, intValue4);
                                }
                            }
                        }
                        return yVar;
                    case 4:
                        e02.j();
                        return yVar;
                    case AbstractC1787b.f15290g /* 5 */:
                        e02.l();
                        return yVar;
                    case 6:
                        e02.o();
                        return yVar;
                    case 7:
                        e02.n();
                        return yVar;
                    case 8:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                e02.o();
                            } else {
                                e02.n();
                            }
                        }
                        return yVar;
                    case AbstractC1787b.f15287d /* 9 */:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                e02.n();
                            } else {
                                e02.o();
                            }
                        }
                        return yVar;
                    case AbstractC1787b.f15289f /* 10 */:
                        if (e02.f3938g.f7630e.length() > 0 && (l3 = e02.f3934c) != null) {
                            int g8 = e02.g(l3, -1);
                            e02.q(g8, g8);
                        }
                        return yVar;
                    case 11:
                        if (e02.f3938g.f7630e.length() > 0 && (l5 = e02.f3934c) != null) {
                            int g9 = e02.g(l5, 1);
                            e02.q(g9, g9);
                        }
                        return yVar;
                    case 12:
                    case 48:
                        return yVar;
                    case 13:
                        if (e02.f3938g.f7630e.length() > 0 && (d1Var = e02.f3940i) != null) {
                            int h6 = e02.h(d1Var, -1);
                            e02.q(h6, h6);
                        }
                        return yVar;
                    case 14:
                        if (e02.f3938g.f7630e.length() > 0 && (d1Var2 = e02.f3940i) != null) {
                            int h7 = e02.h(d1Var2, 1);
                            e02.q(h7, h7);
                        }
                        return yVar;
                    case 15:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            e02.q(0, 0);
                        }
                        return yVar;
                    case PegdownExtensions.AUTOLINKS /* 16 */:
                        e02.f3936e.a = null;
                        C0545g c0545g2 = e02.f3938g;
                        if (c0545g2.f7630e.length() > 0) {
                            int length = c0545g2.f7630e.length();
                            e02.q(length, length);
                        }
                        return yVar;
                    case 17:
                        n02.f839b.d(false);
                        return yVar;
                    case 18:
                        n02.f839b.p();
                        return yVar;
                    case 19:
                        n02.f839b.f();
                        return yVar;
                    case 20:
                        List a7 = e02.a(new A2.a(i7));
                        if (a7 != null) {
                            n02.a(a7);
                        }
                        return yVar;
                    case 21:
                        List a8 = e02.a(new A2.a(7));
                        if (a8 != null) {
                            n02.a(a8);
                        }
                        return yVar;
                    case 22:
                        List a9 = e02.a(new A2.a(8));
                        if (a9 != null) {
                            n02.a(a9);
                        }
                        return yVar;
                    case 23:
                        List a10 = e02.a(new A2.a(9));
                        if (a10 != null) {
                            n02.a(a10);
                        }
                        return yVar;
                    case 24:
                        List a11 = e02.a(new A2.a(10));
                        if (a11 != null) {
                            n02.a(a11);
                        }
                        return yVar;
                    case 25:
                        List a12 = e02.a(new A2.a(11));
                        if (a12 != null) {
                            n02.a(a12);
                        }
                        return yVar;
                    case 26:
                        e02.f3936e.a = null;
                        C0545g c0545g3 = e02.f3938g;
                        if (c0545g3.f7630e.length() > 0) {
                            e02.q(0, c0545g3.f7630e.length());
                        }
                        return yVar;
                    case 27:
                        e02.i();
                        e02.p();
                        return yVar;
                    case 28:
                        e02.m();
                        e02.p();
                        return yVar;
                    case 29:
                        if (e02.f3938g.f7630e.length() > 0 && (l6 = e02.f3934c) != null) {
                            int g10 = e02.g(l6, -1);
                            e02.q(g10, g10);
                        }
                        e02.p();
                        return yVar;
                    case 30:
                        if (e02.f3938g.f7630e.length() > 0 && (l7 = e02.f3934c) != null) {
                            int g11 = e02.g(l7, 1);
                            e02.q(g11, g11);
                        }
                        e02.p();
                        return yVar;
                    case 31:
                        if (e02.f3938g.f7630e.length() > 0 && (d1Var3 = e02.f3940i) != null) {
                            int h8 = e02.h(d1Var3, -1);
                            e02.q(h8, h8);
                        }
                        e02.p();
                        return yVar;
                    case 32:
                        if (e02.f3938g.f7630e.length() > 0 && (d1Var4 = e02.f3940i) != null) {
                            int h9 = e02.h(d1Var4, 1);
                            e02.q(h9, h9);
                        }
                        e02.p();
                        return yVar;
                    case 33:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            e02.q(0, 0);
                        }
                        e02.p();
                        return yVar;
                    case 34:
                        e02.f3936e.a = null;
                        C0545g c0545g4 = e02.f3938g;
                        if (c0545g4.f7630e.length() > 0) {
                            int length2 = c0545g4.f7630e.length();
                            e02.q(length2, length2);
                        }
                        e02.p();
                        return yVar;
                    case 35:
                        O.S0 s04 = e02.f3936e;
                        s04.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                s04.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (e8 = e02.e()) != null) {
                                    int intValue5 = e8.intValue();
                                    e02.q(intValue5, intValue5);
                                }
                            } else {
                                s04.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (d8 = e02.d()) != null) {
                                    int intValue6 = d8.intValue();
                                    e02.q(intValue6, intValue6);
                                }
                            }
                        }
                        e02.p();
                        return yVar;
                    case 36:
                        O.S0 s05 = e02.f3936e;
                        s05.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                s05.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (d9 = e02.d()) != null) {
                                    int intValue7 = d9.intValue();
                                    e02.q(intValue7, intValue7);
                                }
                            } else {
                                s05.a = null;
                                if (e02.f3938g.f7630e.length() > 0 && (e9 = e02.e()) != null) {
                                    int intValue8 = e9.intValue();
                                    e02.q(intValue8, intValue8);
                                }
                            }
                        }
                        e02.p();
                        return yVar;
                    case 37:
                        e02.j();
                        e02.p();
                        return yVar;
                    case 38:
                        e02.l();
                        e02.p();
                        return yVar;
                    case 39:
                        e02.o();
                        e02.p();
                        return yVar;
                    case 40:
                        e02.n();
                        e02.p();
                        return yVar;
                    case 41:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                e02.o();
                            } else {
                                e02.n();
                            }
                        }
                        e02.p();
                        return yVar;
                    case 42:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            if (e02.f()) {
                                e02.n();
                            } else {
                                e02.o();
                            }
                        }
                        e02.p();
                        return yVar;
                    case 43:
                        e02.f3936e.a = null;
                        if (e02.f3938g.f7630e.length() > 0) {
                            long j9 = e02.f3937f;
                            int i15 = S0.O.f7611c;
                            int i16 = (int) (j9 & 4294967295L);
                            e02.q(i16, i16);
                        }
                        return yVar;
                    case 44:
                        if (n02.f842e) {
                            c1283r2.f12968c = n02.a.f1205x.f869e.f1199r.b(n02.f849l);
                        } else {
                            n02.a(Y4.l.H(new C0683a(SequenceUtils.EOL, 1)));
                        }
                        return yVar;
                    case 45:
                        if (n02.f842e) {
                            c1283r2.f12968c = false;
                        } else {
                            n02.a(Y4.l.H(new C0683a("\t", 1)));
                        }
                        return yVar;
                    case 46:
                        m1 m1Var = n02.f845h;
                        if (m1Var != null) {
                            m1Var.a(X0.v.a(e02.f3939h, e02.f3938g, e02.f3937f, 4));
                        }
                        m1 m1Var2 = n02.f845h;
                        if (m1Var2 != null) {
                            M.q qVar3 = m1Var2.a;
                            if (qVar3 == null || (qVar2 = (M.q) qVar3.f3179e) == null) {
                                vVar = null;
                            } else {
                                m1Var2.a = qVar2;
                                m1Var2.f1067c -= ((X0.v) qVar3.f3180f).a.f7630e.length();
                                m1Var2.f1066b = new M.q(4, m1Var2.f1066b, (X0.v) qVar3.f3180f);
                                vVar = (X0.v) qVar2.f3180f;
                            }
                            if (vVar != null) {
                                n02.f848k.f(vVar);
                            }
                        }
                        return yVar;
                    case 47:
                        m1 m1Var3 = n02.f845h;
                        if (m1Var3 != null) {
                            M.q qVar4 = m1Var3.f1066b;
                            if (qVar4 != null) {
                                m1Var3.f1066b = (M.q) qVar4.f3179e;
                                X0.v vVar5 = (X0.v) qVar4.f3180f;
                                m1Var3.a = new M.q(4, m1Var3.a, vVar5);
                                m1Var3.f1067c = vVar5.a.f7630e.length() + m1Var3.f1067c;
                                vVar2 = (X0.v) qVar4.f3180f;
                            } else {
                                vVar2 = null;
                            }
                            if (vVar2 != null) {
                                n02.f848k.f(vVar2);
                            }
                        }
                        return yVar;
                    default:
                        throw new RuntimeException();
                }
            case AbstractC1787b.f15290g /* 5 */:
                Context context = (Context) obj3;
                G.g gVar = (G.g) obj2;
                C1492d c1492d = (C1492d) obj;
                Object r42 = ((G.c) obj4).a;
                int size = r42.size();
                int i17 = 0;
                while (i17 < size) {
                    G.b bVar = (G.b) r42.get(i17);
                    int i18 = 5;
                    if (bVar instanceof G.d) {
                        G.d dVar2 = (G.d) bVar;
                        C1492d.b(c1492d, new B4.D(dVar2, i18), ((G.d) bVar).f1638c == 0 ? null : new C0873f(new I.n(dVar2, 0), true, -1930700965), new r(i9, dVar2, gVar), 6);
                    } else {
                        if (bVar instanceof G.h) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                G.h hVar = (G.h) bVar;
                                if (context != null) {
                                    int i19 = hVar.f1646c;
                                    TextClassification textClassification = hVar.f1645b;
                                    if (i19 < 0) {
                                        B4.D d11 = new B4.D(textClassification, i7);
                                        Drawable icon = textClassification.getIcon();
                                        C1492d.b(c1492d, d11, icon != null ? new C0873f(new I.n(icon, i12), true, -1123224187) : null, new r(i18, context, textClassification), 6);
                                    } else {
                                        actions = textClassification.getActions();
                                        RemoteAction remoteAction = (RemoteAction) actions.get(i19);
                                        boolean z5 = i19 == 0;
                                        B4.D d12 = new B4.D(remoteAction, 7);
                                        if (!z5) {
                                            shouldShowIcon = remoteAction.shouldShowIcon();
                                            if (!shouldShowIcon) {
                                                c0873f = null;
                                                C1492d.b(c1492d, d12, c0873f, new A.b(remoteAction, 8), 6);
                                            }
                                        }
                                        c0873f = new C0873f(new I.n(remoteAction, 2), true, -1261173016);
                                        C1492d.b(c1492d, d12, c0873f, new A.b(remoteAction, 8), 6);
                                    }
                                }
                            }
                        } else if (bVar instanceof G.f) {
                            c1492d.a.add(AbstractC1490b.f13920b);
                        }
                        i17++;
                        i9 = 4;
                    }
                    i17++;
                    i9 = 4;
                }
                return yVar;
            case 6:
                C0996s c0996s = (C0996s) obj4;
                I1.j jVar = (I1.j) obj3;
                c0996s.add(jVar);
                return new J1.n((J1.r) obj2, jVar, c0996s, 0);
            case 7:
                M2.A a13 = (M2.A) obj;
                AbstractC1276k.f(a13, "it");
                return M2.A.a(a13, null, null, Y3.m.z0((List) obj4, Y4.l.H(((StringBuilder) obj3).toString())), null, L2.e.f3075f, L2.f.f3082e, (Long) ((C1288w) obj2).f12973c, null, null, 395);
            case 8:
                StringBuilder sb = (StringBuilder) obj2;
                M2.A a14 = (M2.A) obj;
                AbstractC1276k.f(a14, "it");
                String sb2 = ((StringBuilder) obj4).toString();
                AbstractC1276k.e(sb2, "toString(...)");
                return M2.A.a(a14, null, sb2, null, null, L2.e.f3075f, (!((List) obj3).isEmpty() || sb.length() > 0) ? L2.f.f3083f : L2.f.f3081c, null, null, null, 461);
            case AbstractC1787b.f15287d /* 9 */:
                C1283r c1283r3 = (C1283r) obj2;
                B0.y yVar2 = (B0.y) obj;
                if (((InterfaceC0326p) obj4).f(yVar2.f483c, (O.H) obj3)) {
                    yVar2.a();
                    c1283r3.f12968c = true;
                }
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                final O.N0 n03 = (O.N0) obj4;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) obj3;
                Context context2 = (Context) obj2;
                F.a aVar = (F.a) obj;
                aVar.a();
                k.I i20 = aVar.a;
                F0 f02 = F0.Autofill;
                boolean z6 = (S0.O.c(n03.n().f9125b) || !n03.j() || n03.f3998g == null) ? false : true;
                r rVar = new r(interfaceC1942y, new O.F0(n03, interfaceC0905c, i12));
                Resources resources = context2.getResources();
                O.v0 v0Var = new O.v0(rVar, null, 1);
                if (z6) {
                    i20.a(new G.d(G.e.a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, v0Var));
                }
                F0 f03 = F0.Autofill;
                boolean z7 = (S0.O.c(n03.n().f9125b) || n03.f3998g == null) ? false : true;
                r rVar2 = new r(interfaceC1942y, new O.F0(n03, interfaceC0905c, i10));
                Resources resources2 = context2.getResources();
                O.v0 v0Var2 = new O.v0(rVar2, null, 1);
                if (z7) {
                    i20.a(new G.d(G.e.f1640b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, v0Var2));
                }
                F0 f04 = F0.Autofill;
                boolean z8 = n03.j() && ((Boolean) n03.f4014w.getValue()).booleanValue() && n03.f3998g != null;
                r rVar3 = new r(interfaceC1942y, new O.F0(n03, interfaceC0905c, i8));
                Resources resources3 = context2.getResources();
                O.v0 v0Var3 = new O.v0(rVar3, null, 1);
                if (z8) {
                    i20.a(new G.d(G.e.f1641c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, v0Var3));
                }
                F0 f05 = F0.Autofill;
                boolean z9 = S0.O.d(n03.n().f9125b) != n03.n().a.f7630e.length();
                final int i21 = 0;
                InterfaceC1193a interfaceC1193a = new InterfaceC1193a() { // from class: O.Q0
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i21) {
                            case 0:
                                return Boolean.valueOf(!n03.f3992A);
                            case 1:
                                N0 n04 = n03;
                                X0.v e12 = N0.e(n04.n().a, S0.F.b(0, n04.n().a.f7630e.length()));
                                n04.f3994c.f(e12);
                                long j10 = e12.f9125b;
                                n04.f4013v = new S0.O(j10);
                                n04.f4011t = X0.v.a(n04.f4011t, null, j10, 5);
                                n04.h(true);
                                return X3.y.a;
                            default:
                                InterfaceC1193a interfaceC1193a2 = n03.f3997f;
                                if (interfaceC1193a2 != null) {
                                    interfaceC1193a2.b();
                                }
                                return X3.y.a;
                        }
                    }
                };
                InterfaceC1193a interfaceC1193a2 = new InterfaceC1193a() { // from class: O.Q0
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i12) {
                            case 0:
                                return Boolean.valueOf(!n03.f3992A);
                            case 1:
                                N0 n04 = n03;
                                X0.v e12 = N0.e(n04.n().a, S0.F.b(0, n04.n().a.f7630e.length()));
                                n04.f3994c.f(e12);
                                long j10 = e12.f9125b;
                                n04.f4013v = new S0.O(j10);
                                n04.f4011t = X0.v.a(n04.f4011t, null, j10, 5);
                                n04.h(true);
                                return X3.y.a;
                            default:
                                InterfaceC1193a interfaceC1193a22 = n03.f3997f;
                                if (interfaceC1193a22 != null) {
                                    interfaceC1193a22.b();
                                }
                                return X3.y.a;
                        }
                    }
                };
                Resources resources4 = context2.getResources();
                O.v0 v0Var4 = new O.v0(interfaceC1193a2, interfaceC1193a, 1);
                if (z9) {
                    i20.a(new G.d(G.e.f1642d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, v0Var4));
                }
                F0 f06 = F0.Autofill;
                boolean z10 = n03.j() && S0.O.c(n03.n().f9125b);
                InterfaceC1193a interfaceC1193a3 = new InterfaceC1193a() { // from class: O.Q0
                    @Override // l4.InterfaceC1193a
                    public final Object b() {
                        switch (i10) {
                            case 0:
                                return Boolean.valueOf(!n03.f3992A);
                            case 1:
                                N0 n04 = n03;
                                X0.v e12 = N0.e(n04.n().a, S0.F.b(0, n04.n().a.f7630e.length()));
                                n04.f3994c.f(e12);
                                long j10 = e12.f9125b;
                                n04.f4013v = new S0.O(j10);
                                n04.f4011t = X0.v.a(n04.f4011t, null, j10, 5);
                                n04.h(true);
                                return X3.y.a;
                            default:
                                InterfaceC1193a interfaceC1193a22 = n03.f3997f;
                                if (interfaceC1193a22 != null) {
                                    interfaceC1193a22.b();
                                }
                                return X3.y.a;
                        }
                    }
                };
                Resources resources5 = context2.getResources();
                O.v0 v0Var5 = new O.v0(interfaceC1193a3, null, 1);
                if (z10) {
                    i20.a(new G.d(f06.f761c, resources5.getString(f06.f762e), f06.f763f, v0Var5));
                }
                aVar.a();
                return yVar;
            case 11:
                C1856g c1856g = (C1856g) obj;
                AbstractC1276k.f(c1856g, "$this$LazyRow");
                List list = ((L2.c) obj4).f3060d;
                c1856g.o(list.size(), null, new P2.S(list, 1), new C0873f(new P2.W0(list, (C0889e) obj3, (List) obj2, i11), true, 2039820996));
                return yVar;
            case 12:
                C0405d2 c0405d2 = (C0405d2) obj3;
                AbstractC1888A.y((InterfaceC1942y) obj4, null, new C0416g1(c0405d2, ((Float) obj).floatValue(), null), 3).S(new Q.Z0(c0405d2, (InterfaceC1193a) obj2, i12));
                return yVar;
            case 13:
                InterfaceC1802i0 interfaceC1802i0 = (InterfaceC1802i0) obj3;
                InterfaceC1027d interfaceC1027d = (InterfaceC1027d) obj2;
                H0.L l9 = (H0.L) obj;
                long j10 = ((C1356e) ((R.e0) obj4).get()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                if (intBitsToFloat > S.l.f7374V) {
                    float e03 = l9.e0(D1.a);
                    C1496b c1496b = l9.f1765c;
                    float a15 = interfaceC1027d.a(AbstractC1410a.K(intBitsToFloat), AbstractC1410a.K((Float.intBitsToFloat((int) (c1496b.c() >> 32)) - r9) - l9.e0(interfaceC1802i0.d(l9.getLayoutDirection()))), l9.getLayoutDirection()) + l9.e0(interfaceC1802i0.b(l9.getLayoutDirection()));
                    float f8 = 2;
                    float f9 = intBitsToFloat / f8;
                    float f10 = a15 + f9;
                    float f11 = (f10 - f9) - e03;
                    float f12 = f11 < S.l.f7374V ? 0.0f : f11;
                    float f13 = f10 + f9 + e03;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (c1496b.c() >> 32));
                    float f14 = f13 > intBitsToFloat2 ? intBitsToFloat2 : f13;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    float f15 = (-intBitsToFloat3) / f8;
                    float f16 = intBitsToFloat3 / f8;
                    C0158m c0158m = c1496b.f13944e;
                    long j11 = c0158m.j();
                    c0158m.g().h();
                    try {
                        ((C0158m) ((C0987j) c0158m.f1972e).f11690e).g().m(f12, f15, f14, f16, 0);
                        l9.b();
                    } finally {
                        AbstractC1135a.q(c0158m, j11);
                    }
                } else {
                    l9.b();
                }
                return yVar;
            case 14:
                InterfaceC0846u interfaceC0846u = (InterfaceC0846u) obj3;
                L1.f fVar = new L1.f((l4.c) obj4, i12);
                interfaceC0846u.g().a(fVar);
                return new J1.n((InterfaceC1193a) obj2, interfaceC0846u, fVar, i12);
            case 15:
                r rVar4 = new r(20, (InterfaceC1942y) obj3, (s3) obj2);
                s4.e[] eVarArr = P0.v.a;
                ((P0.x) obj).a(P0.l.f4468c, new P0.a((String) obj4, rVar4));
                return yVar;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return a(obj);
            case 17:
                return e(obj);
            case 18:
                return g(obj);
            case 19:
                return h(obj);
            case 20:
                return k(obj);
            case 21:
                return l(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            default:
                return ConversationDao_Impl.a((String) obj4, (String) obj3, (String) obj2, (X1.a) obj);
        }
    }

    public /* synthetic */ C0091s(Object obj, Object obj2, Object obj3, int i6) {
        this.f1151c = i6;
        this.f1152e = obj;
        this.f1153f = obj2;
        this.f1154g = obj3;
    }

    public /* synthetic */ C0091s(List list, Object obj, l4.c cVar, int i6) {
        this.f1151c = i6;
        this.f1153f = list;
        this.f1154g = obj;
        this.f1152e = cVar;
    }

    public /* synthetic */ C0091s(C1285t c1285t, InterfaceC1563e1 interfaceC1563e1, C1285t c1285t2, C1521G c1521g) {
        this.f1151c = 23;
        this.f1152e = c1285t;
        this.f1153f = interfaceC1563e1;
        this.f1154g = c1285t2;
    }

    public /* synthetic */ C0091s(C1515D c1515d, h2 h2Var, InterfaceC1922e0 interfaceC1922e0, B1 b1) {
        this.f1151c = 22;
        this.f1152e = c1515d;
        this.f1153f = interfaceC1922e0;
        this.f1154g = b1;
    }
}
