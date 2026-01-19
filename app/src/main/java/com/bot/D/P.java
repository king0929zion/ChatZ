package D;

import H0.C0158m;
import R2.EnumC0527g;
import S0.C0554p;
import S2.C0559b;
import S2.C0561c;
import S2.C0563d;
import T.C0607g0;
import android.os.Bundle;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import f0.C0987j;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;
import m4.C1283r;
import m4.C1285t;
import n.AbstractC1318d;
import n.C1297F;
import n.C1300I;
import n.C1316c;
import n.C1332k;
import n.C1336m;
import o0.AbstractC1404o;
import o0.C1389K;
import q0.AbstractC1499e;
import q0.C1496b;
import r.AbstractC1532L0;
import r.B1;
import v.AbstractC1787b;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f862c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f866h;

    public /* synthetic */ P(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f862c = i6;
        this.f863e = obj;
        this.f864f = obj2;
        this.f865g = obj3;
        this.f866h = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r8v0, types: [m4.w, java.lang.Object] */
    @Override // l4.c
    public final Object f(Object obj) {
        int i6;
        List list;
        List list2;
        Object obj2;
        int i7;
        switch (this.f862c) {
            case 0:
                C0098v0 c0098v0 = (C0098v0) this.f863e;
                X0.w wVar = (X0.w) this.f864f;
                X0.v vVar = (X0.v) this.f865g;
                X0.k kVar = (X0.k) this.f866h;
                if (c0098v0.b()) {
                    M.q qVar = c0098v0.f1185d;
                    Q q3 = c0098v0.f1203v;
                    Q q5 = c0098v0.f1204w;
                    Object obj3 = new Object();
                    C0091s c0091s = new C0091s(3, qVar, (Object) obj3, q3);
                    X0.q qVar2 = wVar.a;
                    qVar2.e(vVar, kVar, c0091s, q5);
                    X0.A a = new X0.A(wVar, qVar2);
                    wVar.f9127b.set(a);
                    obj3.f12973c = a;
                    c0098v0.f1186e = a;
                }
                return new Object();
            case 1:
                C1283r c1283r = (C1283r) this.f863e;
                L1.i iVar = (L1.i) this.f864f;
                I1.v vVar2 = (I1.v) this.f865g;
                Bundle bundle = (Bundle) this.f866h;
                I1.j jVar = (I1.j) obj;
                AbstractC1276k.f(jVar, "it");
                c1283r.f12968c = true;
                iVar.a(vVar2, bundle, jVar, Y3.v.f9812c);
                return X3.y.a;
            case 2:
                StringBuilder sb = (StringBuilder) this.f863e;
                List list3 = (List) this.f864f;
                List list4 = (List) this.f865g;
                Long l3 = (Long) this.f866h;
                M2.A a6 = (M2.A) obj;
                AbstractC1276k.f(a6, "it");
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "toString(...)");
                return M2.A.a(a6, null, sb2, Y3.m.J0(list3), Y3.m.J0(list4), L2.e.f3076g, !list3.isEmpty() ? L2.f.f3083f : L2.f.f3081c, null, l3, null, 321);
            case 3:
                InterfaceC0846u interfaceC0846u = (InterfaceC0846u) this.f863e;
                final T.X x5 = (T.X) this.f864f;
                final T.X x6 = (T.X) this.f865g;
                final T.X x7 = (T.X) this.f866h;
                AbstractC1276k.f((T.H) obj, "$this$DisposableEffect");
                InterfaceC0844s interfaceC0844s = new InterfaceC0844s() { // from class: P2.i0
                    @Override // androidx.lifecycle.InterfaceC0844s
                    public final void d(InterfaceC0846u interfaceC0846u2, EnumC0841o enumC0841o) {
                        if (enumC0841o == EnumC0841o.ON_STOP) {
                            boolean z5 = false;
                            if (e1.f.b(((e1.f) T.X.this.getValue()).f11571c, 0) > 0 && !((C0344b) x6.getValue()).f4827b) {
                                z5 = true;
                            }
                            x7.setValue(Boolean.valueOf(z5));
                        }
                    }
                };
                interfaceC0846u.g().a(interfaceC0844s);
                return new V0(6, interfaceC0846u, interfaceC0844s);
            case 4:
                String str = (String) this.f863e;
                String str2 = (String) this.f864f;
                String str3 = (String) this.f865g;
                String str4 = (String) this.f866h;
                EnumC0527g enumC0527g = (EnumC0527g) obj;
                AbstractC1276k.f(enumC0527g, "stringKey");
                int ordinal = enumC0527g.ordinal();
                if (ordinal == 0) {
                    return str;
                }
                if (ordinal == 1) {
                    return str2;
                }
                if (ordinal == 2) {
                    return str3;
                }
                if (ordinal == 3) {
                    return str4;
                }
                throw new RuntimeException();
            case AbstractC1787b.f15290g /* 5 */:
                List list5 = (List) this.f863e;
                List list6 = (List) this.f865g;
                List list7 = (List) this.f866h;
                H0.L l5 = (H0.L) obj;
                AbstractC1276k.f(l5, "$this$drawWithContent");
                C1496b c1496b = l5.f1765c;
                l5.b();
                int size = list5.size();
                Object r42 = this.f864f;
                int[] iArr = {r42.size(), list6.size(), list7.size()};
                int i8 = 0;
                for (int i9 = 0; i9 < 3; i9++) {
                    size = Math.min(size, iArr[i9]);
                }
                while (i8 < size) {
                    C0559b c0559b = (C0559b) r42.get(i8);
                    C0561c c0561c = (C0561c) list6.get(i8);
                    C0563d c0563d = (C0563d) list7.get(i8);
                    float floatValue = ((Number) c0559b.a.d()).floatValue();
                    if (floatValue > S.l.f7374V) {
                        long floatToRawIntBits = (Float.floatToRawIntBits(c0563d.a) << 32) | (Float.floatToRawIntBits(((Number) c0559b.f7737b.d()).floatValue() + (c0563d.f7743b - c0561c.f7740b)) & 4294967295L);
                        S0.L l6 = c0561c.a;
                        C0554p c0554p = l6.f7599b;
                        S0.K k3 = l6.a;
                        long j3 = o0.s.f13481h;
                        S0.G g3 = k3.f7590b.a;
                        C1389K c1389k = g3.f7583n;
                        d1.l lVar = g3.f7582m;
                        AbstractC1499e abstractC1499e = g3.f7585p;
                        list = list6;
                        C0158m c0158m = c1496b.f13944e;
                        list2 = list7;
                        obj2 = r42;
                        long j4 = c0158m.j();
                        c0158m.g().h();
                        i6 = size;
                        try {
                            C0987j c0987j = (C0987j) c0158m.f1972e;
                            i7 = i8;
                            c0987j.G(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                            if (l6.d() && k3.f7594f != 3) {
                                long j5 = l6.f7600c;
                                ((C0158m) c0987j.f11690e).g().m(S.l.f7374V, S.l.f7374V, (int) (j5 >> 32), (int) (j5 & 4294967295L), 1);
                            }
                            S0.P p5 = k3.f7590b;
                            AbstractC1404o c6 = p5.a.a.c();
                            if (c6 == null || j3 != 16) {
                                o0.q g6 = c1496b.f13944e.g();
                                if (j3 == 16) {
                                    j3 = p5.b();
                                }
                                c0554p.i(g6, Y3.C.J(floatValue, j3), c1389k, lVar, abstractC1499e);
                            } else {
                                o0.q g7 = c1496b.f13944e.g();
                                if (Float.isNaN(floatValue)) {
                                    floatValue = p5.a.a.a();
                                }
                                c0554p.j(g7, c6, floatValue, c1389k, lVar, abstractC1499e);
                            }
                            AbstractC1135a.q(c0158m, j4);
                        } catch (Throwable th) {
                            AbstractC1135a.q(c0158m, j4);
                            throw th;
                        }
                    } else {
                        i6 = size;
                        list = list6;
                        list2 = list7;
                        obj2 = r42;
                        i7 = i8;
                    }
                    i8 = i7 + 1;
                    list6 = list;
                    list7 = list2;
                    r42 = obj2;
                    size = i6;
                }
                return X3.y.a;
            case 6:
                C1316c c1316c = (C1316c) this.f863e;
                C1336m c1336m = (C1336m) this.f864f;
                l4.c cVar = (l4.c) this.f865g;
                C1283r c1283r2 = (C1283r) this.f866h;
                C1332k c1332k = (C1332k) obj;
                AbstractC1318d.t(c1332k, c1316c.f13093c);
                C0607g0 c0607g0 = c1332k.f13171e;
                Object a7 = C1316c.a(c1316c, c0607g0.getValue());
                if (!AbstractC1276k.b(a7, c0607g0.getValue())) {
                    c1316c.f13093c.f13186e.setValue(a7);
                    c1336m.f13186e.setValue(a7);
                    if (cVar != null) {
                        cVar.f(c1316c);
                    }
                    c1332k.a();
                    c1283r2.f12968c = true;
                } else if (cVar != null) {
                    cVar.f(c1316c);
                }
                return X3.y.a;
            case 7:
                T.X x8 = (T.X) this.f863e;
                C1300I c1300i = (C1300I) this.f864f;
                C1285t c1285t = (C1285t) this.f865g;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f866h;
                long longValue = ((Long) obj).longValue();
                T.d1 d1Var = (T.d1) x8.getValue();
                long longValue2 = d1Var != null ? ((Number) d1Var.getValue()).longValue() : longValue;
                long j6 = c1300i.f13006c;
                V.e eVar = c1300i.a;
                if (j6 == Long.MIN_VALUE || c1285t.f12970c != AbstractC1318d.n(interfaceC1942y.c())) {
                    c1300i.f13006c = longValue;
                    Object[] objArr = eVar.f8759c;
                    int i10 = eVar.f8761f;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C1297F) objArr[i11]).f12994i = true;
                    }
                    c1285t.f12970c = AbstractC1318d.n(interfaceC1942y.c());
                }
                float f6 = c1285t.f12970c;
                if (f6 == S.l.f7374V) {
                    Object[] objArr2 = eVar.f8759c;
                    int i12 = eVar.f8761f;
                    for (int i13 = 0; i13 < i12; i13++) {
                        C1297F c1297f = (C1297F) objArr2[i13];
                        c1297f.f12991f.setValue(c1297f.f12992g.f13204c);
                        c1297f.f12994i = true;
                    }
                } else {
                    long j7 = ((float) (longValue2 - c1300i.f13006c)) / f6;
                    Object[] objArr3 = eVar.f8759c;
                    int i14 = eVar.f8761f;
                    boolean z5 = true;
                    for (int i15 = 0; i15 < i14; i15++) {
                        C1297F c1297f2 = (C1297F) objArr3[i15];
                        if (!c1297f2.f12993h) {
                            c1297f2.f12996k.f13005b.setValue(Boolean.FALSE);
                            if (c1297f2.f12994i) {
                                c1297f2.f12994i = false;
                                c1297f2.f12995j = j7;
                            }
                            long j8 = j7 - c1297f2.f12995j;
                            c1297f2.f12991f.setValue(c1297f2.f12992g.f(j8));
                            c1297f2.f12993h = c1297f2.f12992g.e(j8);
                        }
                        if (!c1297f2.f12993h) {
                            z5 = false;
                        }
                    }
                    c1300i.f13007d.setValue(Boolean.valueOf(!z5));
                }
                return X3.y.a;
            default:
                C1285t c1285t2 = (C1285t) this.f863e;
                M1.b bVar = (M1.b) this.f864f;
                B1 b1 = (B1) this.f865g;
                J0 j02 = (J0) this.f866h;
                C1332k c1332k2 = (C1332k) obj;
                float floatValue2 = ((Number) c1332k2.f13171e.getValue()).floatValue() - c1285t2.f12970c;
                if (!AbstractC1532L0.a(floatValue2)) {
                    if (!AbstractC1532L0.a(floatValue2 - bVar.c(b1, floatValue2))) {
                        c1332k2.a();
                        return X3.y.a;
                    }
                    c1285t2.f12970c += floatValue2;
                }
                if (((Boolean) j02.f(Float.valueOf(c1285t2.f12970c))).booleanValue()) {
                    c1332k2.a();
                }
                return X3.y.a;
        }
    }
}
