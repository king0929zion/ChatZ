package Q;

import D.C0103y;
import H0.C0146e;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import R.AbstractC0507l;
import T.C0599c0;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.InterfaceC0617l0;
import b0.C0873f;
import com.tencent.mmkv.R;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.Iterator;
import m4.AbstractC1276k;
import n0.C1353b;
import v.AbstractC1806l;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class V implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5538c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5539e;

    public /* synthetic */ V(Object obj, int i6) {
        this.f5538c = i6;
        this.f5539e = obj;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.lang.Iterable] */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        switch (this.f5538c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                B0.H h3 = (B0.H) this.f5539e;
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    String j3 = AbstractC0507l.j(R.string.m3c_dialog, c0626q);
                    InterfaceC1041r m3 = v.t0.m((InterfaceC1041r) h3.f392e, AbstractC0426j.a, S.l.f7374V, AbstractC0426j.f5892b, 10);
                    boolean f6 = c0626q.f(j3);
                    Object P5 = c0626q.P();
                    if (f6 || P5 == C0616l.a) {
                        P5 = new M2.b(j3, 2);
                        c0626q.m0(P5);
                    }
                    InterfaceC1041r c6 = m3.c(P0.n.a(C1038o.a, false, (l4.c) P5));
                    F0.V d6 = AbstractC1806l.d(C1026c.f11786c, true);
                    int hashCode = Long.hashCode(c0626q.f8164T);
                    InterfaceC0617l0 l3 = c0626q.l();
                    InterfaceC1041r c7 = AbstractC1024a.c(c0626q, c6);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f = C0150g.f1924b;
                    c0626q.f0();
                    if (c0626q.f8163S) {
                        c0626q.k(c0148f);
                    } else {
                        c0626q.p0();
                    }
                    T.r.G(c0626q, d6, C0150g.f1928f);
                    T.r.G(c0626q, l3, C0150g.f1927e);
                    C0146e c0146e = C0150g.f1929g;
                    if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                        B3.e.v(hashCode, c0626q, hashCode, c0146e);
                    }
                    T.r.G(c0626q, c7, C0150g.f1926d);
                    ((C0873f) h3.f394g).m(c0626q, 0);
                    c0626q.p(true);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object P6 = c0626q2.P();
                    if (P6 == C0616l.a) {
                        P6 = new P2.D0(6);
                        c0626q2.m0(P6);
                    }
                    InterfaceC1041r a = P0.n.a(C1038o.a, false, (l4.c) P6);
                    T.X x5 = (T.X) this.f5539e;
                    F0.V d7 = AbstractC1806l.d(C1026c.f11786c, false);
                    int hashCode2 = Long.hashCode(c0626q2.f8164T);
                    InterfaceC0617l0 l5 = c0626q2.l();
                    InterfaceC1041r c8 = AbstractC1024a.c(c0626q2, a);
                    InterfaceC0152h.a.getClass();
                    C0148f c0148f2 = C0150g.f1924b;
                    c0626q2.f0();
                    if (c0626q2.f8163S) {
                        c0626q2.k(c0148f2);
                    } else {
                        c0626q2.p0();
                    }
                    T.r.G(c0626q2, d7, C0150g.f1928f);
                    T.r.G(c0626q2, l5, C0150g.f1927e);
                    C0146e c0146e2 = C0150g.f1929g;
                    if (c0626q2.f8163S || !AbstractC1276k.b(c0626q2.P(), Integer.valueOf(hashCode2))) {
                        B3.e.v(hashCode2, c0626q2, hashCode2, c0146e2);
                    }
                    T.r.G(c0626q2, c8, C0150g.f1926d);
                    ((l4.e) x5.getValue()).m(c0626q2, 0);
                    c0626q2.p(true);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
            case 2:
                C0626q c0626q3 = (C0626q) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f3.b((String) this.f5539e, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q3, 0, 0, 262142);
                } else {
                    c0626q3.V();
                }
                return X3.y.a;
            case 3:
                C0626q c0626q4 = (C0626q) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (c0626q4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    f3.b(((I2) this.f5539e).a.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0626q4, 0, 0, 262142);
                } else {
                    c0626q4.V();
                }
                return X3.y.a;
            case 4:
                B0.y yVar = (B0.y) obj;
                long j4 = ((C1353b) obj2).a;
                AbstractC1276k.f(yVar, "change");
                yVar.a();
                Z2.B b5 = (Z2.B) this.f5539e;
                float intBitsToFloat = Float.intBitsToFloat((int) (j4 & 4294967295L));
                C0103y c0103y = b5.f9892e;
                C0607g0 c0607g0 = b5.f9894g;
                String str = (String) b5.f9893f.getValue();
                if (str != null) {
                    b5.a(((Number) c0607g0.getValue()).floatValue() + intBitsToFloat);
                    x.l g3 = b5.a.g();
                    Iterator it = g3.f15501k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (((x.m) obj3).f15517k.equals(str)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    if (((x.m) obj3) != null) {
                        float floatValue = ((Number) c0607g0.getValue()).floatValue() + r7.f15521o;
                        float f7 = r7.f15522p + floatValue;
                        float f8 = (floatValue + f7) / 2.0f;
                        Iterator it2 = g3.f15501k.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj4 = it2.next();
                                x.m mVar = (x.m) obj4;
                                if (!mVar.f15517k.equals(str)) {
                                    if (f8 >= mVar.f15521o && f8 <= r14 + mVar.f15522p) {
                                    }
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        x.m mVar2 = (x.m) obj4;
                        Object obj7 = mVar2 != null ? mVar2.f15517k : null;
                        String str2 = obj7 instanceof String ? (String) obj7 : null;
                        if (str2 != null) {
                            int intValue5 = ((Number) c0103y.f(str)).intValue();
                            int intValue6 = ((Number) c0103y.f(str2)).intValue();
                            if (intValue5 != -1 && intValue6 != -1 && intValue5 != intValue6) {
                                b5.f9890c.m(Integer.valueOf(intValue5), Integer.valueOf(intValue6));
                                b5.a(((Number) c0607g0.getValue()).floatValue() + (r7.f15521o - mVar2.f15521o));
                                b5.f9895h = true;
                            }
                        }
                        float f9 = g3.f15502l;
                        float f10 = g3.f15503m;
                        float f11 = floatValue < f9 ? floatValue - f9 : f7 > f10 ? f7 - f10 : 0.0f;
                        if (f11 != S.l.f7374V) {
                            AbstractC1888A.y(b5.f9889b, null, new Z2.A(b5, f11, null), 3);
                        }
                    }
                }
                return X3.y.a;
            default:
                B0.y yVar2 = (B0.y) obj;
                long j5 = ((C1353b) obj2).a;
                AbstractC1276k.f(yVar2, "change");
                yVar2.a();
                Z2.Z0 z02 = (Z2.Z0) this.f5539e;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
                Z2.A0 a02 = z02.f10136e;
                C0599c0 c0599c0 = z02.f10138g;
                String str3 = (String) z02.f10137f.getValue();
                if (str3 != null) {
                    c0599c0.h(c0599c0.g() + intBitsToFloat2);
                    x.l g6 = z02.a.g();
                    Iterator it3 = g6.f15501k.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj5 = it3.next();
                            if (((x.m) obj5).f15517k.equals(str3)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    x.m mVar3 = (x.m) obj5;
                    if (mVar3 != null) {
                        float g7 = c0599c0.g() + mVar3.f15521o;
                        float f12 = mVar3.f15522p + g7;
                        float f13 = (g7 + f12) / 2.0f;
                        Iterator it4 = g6.f15501k.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj6 = it4.next();
                                x.m mVar4 = (x.m) obj6;
                                if (!mVar4.f15517k.equals(str3)) {
                                    if (f13 >= mVar4.f15521o && f13 <= r14 + mVar4.f15522p) {
                                    }
                                }
                            } else {
                                obj6 = null;
                            }
                        }
                        x.m mVar5 = (x.m) obj6;
                        Object obj8 = mVar5 != null ? mVar5.f15517k : null;
                        String str4 = obj8 instanceof String ? (String) obj8 : null;
                        if (str4 != null) {
                            int intValue7 = ((Number) a02.f(str3)).intValue();
                            int intValue8 = ((Number) a02.f(str4)).intValue();
                            if (intValue7 != -1 && intValue8 != -1 && intValue7 != intValue8) {
                                float f14 = mVar3.f15521o - mVar5.f15521o;
                                z02.f10134c.m(Integer.valueOf(intValue7), Integer.valueOf(intValue8));
                                c0599c0.h(c0599c0.g() + f14);
                                z02.f10139h = true;
                            }
                        }
                        float f15 = g6.f15502l + (-r3);
                        float f16 = g6.f15503m - g6.f15506p;
                        float f17 = g7 < f15 ? (g7 - f15) * 0.5f : f12 > f16 ? (f12 - f16) * 0.5f : 0.0f;
                        if (f17 != S.l.f7374V) {
                            AbstractC1888A.y(z02.f10133b, null, new Z2.Y0(z02, f17, null), 3);
                        }
                    }
                }
                return X3.y.a;
        }
    }
}
