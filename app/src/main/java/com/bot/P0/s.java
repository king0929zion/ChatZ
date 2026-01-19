package P0;

import F0.AbstractC0137z;
import H0.A0;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.InterfaceC0155j;
import H0.J;
import H0.i0;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import h0.AbstractC1040q;
import java.util.List;
import k.AbstractC1168o;
import k.C1147A;
import k.M;
import m4.AbstractC1276k;
import n0.C1354c;

/* loaded from: classes.dex */
public abstract class s {
    public static final C1354c a = new C1354c(S.l.f7374V, S.l.f7374V, 10.0f, 10.0f);

    public static final p a(J j3, boolean z5) {
        AbstractC1040q abstractC1040q = j3.f1721J.f1919f;
        InterfaceC0155j interfaceC0155j = null;
        if ((abstractC1040q.f11809g & 8) != 0) {
            loop0: while (true) {
                if (abstractC1040q == null) {
                    break;
                }
                if ((abstractC1040q.f11808f & 8) != 0) {
                    AbstractC1040q abstractC1040q2 = abstractC1040q;
                    V.e eVar = null;
                    while (abstractC1040q2 != null) {
                        if (abstractC1040q2 instanceof A0) {
                            interfaceC0155j = abstractC1040q2;
                            break loop0;
                        }
                        if ((abstractC1040q2.f11808f & 8) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                            int i6 = 0;
                            for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                if ((abstractC1040q3.f11808f & 8) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        abstractC1040q2 = abstractC1040q3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC1040q2 != null) {
                                            eVar.b(abstractC1040q2);
                                            abstractC1040q2 = null;
                                        }
                                        eVar.b(abstractC1040q3);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                        abstractC1040q2 = AbstractC0157l.e(eVar);
                    }
                }
                if ((abstractC1040q.f11809g & 8) == 0) {
                    break;
                }
                abstractC1040q = abstractC1040q.f11811i;
            }
        }
        AbstractC1276k.c(interfaceC0155j);
        AbstractC1040q abstractC1040q4 = ((AbstractC1040q) ((A0) interfaceC0155j)).f11806c;
        m x5 = j3.x();
        if (x5 == null) {
            x5 = new m();
        }
        return new p(abstractC1040q4, z5, j3, x5);
    }

    public static final C1147A b(r rVar, l4.c cVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            p a6 = rVar.a();
            J j3 = a6.f4498c;
            if (j3.I() && j3.H()) {
                C1147A c1147a = new C1147A(48);
                A3.c cVar2 = new A3.c(17, (byte) 0);
                e1.k h02 = h5.e.h0(a6.g());
                ((Region) cVar2.f119e).set(h02.a, h02.f11573b, h02.f11574c, h02.f11575d);
                c(cVar2, a6, c1147a, cVar, a6, new A3.c(17, (byte) 0));
                return c1147a;
            }
            C1147A c1147a2 = AbstractC1168o.a;
            AbstractC1276k.d(c1147a2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c1147a2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(A3.c cVar, p pVar, C1147A c1147a, l4.c cVar2, p pVar2, A3.c cVar3) {
        C1354c r12;
        J j3;
        p pVar3 = pVar;
        int i6 = pVar3.f4502g;
        A3.c cVar4 = cVar3;
        Region region = (Region) cVar4.f119e;
        J j4 = pVar2.f4498c;
        int i7 = pVar2.f4502g;
        boolean z5 = (j4.I() && j4.H()) ? false : true;
        A3.c cVar5 = cVar;
        Region region2 = (Region) cVar5.f119e;
        if (!region2.isEmpty() || i7 == i6) {
            if (!z5 || pVar2.f4500e) {
                InterfaceC0155j f6 = pVar2.f();
                if (f6 == null) {
                    r12 = j4.f1721J.f1916c.r1();
                } else {
                    AbstractC1040q abstractC1040q = ((AbstractC1040q) f6).f11806c;
                    Object g3 = pVar2.f4499d.f4492c.g(l.f4467b);
                    if (g3 == null) {
                        g3 = null;
                    }
                    boolean z6 = g3 != null;
                    if (!abstractC1040q.f11806c.f11819q) {
                        r12 = C1354c.f13294e;
                    } else if (z6) {
                        r12 = AbstractC0157l.t(abstractC1040q, 8).r1();
                    } else {
                        i0 t5 = AbstractC0157l.t(abstractC1040q, 8);
                        r12 = AbstractC0137z.h(t5).Q(t5, true);
                    }
                }
                e1.k h02 = h5.e.h0(r12);
                region.set(h02.a, h02.f11573b, h02.f11574c, h02.f11575d);
                if (i7 == i6) {
                    i7 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (pVar2.f4500e) {
                        p l3 = pVar2.l();
                        c1147a.i(i7, new q(pVar2, h5.e.h0((l3 == null || (j3 = l3.f4498c) == null || !j3.I()) ? a : l3.g())));
                        return;
                    } else {
                        if (i7 == -1) {
                            Rect bounds = region.getBounds();
                            c1147a.i(i7, new q(pVar2, new e1.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c1147a.i(i7, new q(pVar2, new e1.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j5 = p.j(4, pVar2);
                int size = j5.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) cVar2.f(j5.get(size))).booleanValue()) {
                        c(cVar5, pVar3, c1147a, cVar2, (p) j5.get(size), cVar4);
                    }
                    size--;
                    cVar5 = cVar;
                    pVar3 = pVar;
                    cVar4 = cVar3;
                }
                if (f(pVar2)) {
                    region2.op(h02.a, h02.f11573b, h02.f11574c, h02.f11575d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(m mVar, w wVar) {
        Object g3 = mVar.f4492c.g(wVar);
        if (g3 == null) {
            return null;
        }
        return g3;
    }

    public static final boolean e(p pVar) {
        i0 d6 = pVar.d();
        m mVar = pVar.f4499d;
        if (d6 != null ? d6.e1() : false) {
            return true;
        }
        w wVar = t.a;
        if (mVar.f4492c.c(t.f4537p)) {
            return true;
        }
        return mVar.f4492c.c(t.f4536o);
    }

    public static final boolean f(p pVar) {
        if (!e(pVar)) {
            m mVar = pVar.f4499d;
            if (mVar.f4494f) {
                return true;
            }
            M m3 = mVar.f4492c;
            Object[] objArr = m3.f12485b;
            Object[] objArr2 = m3.f12486c;
            long[] jArr = m3.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr[i6];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((255 & j3) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                if (((w) obj).f4550c) {
                                    return true;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
        }
        return false;
    }
}
