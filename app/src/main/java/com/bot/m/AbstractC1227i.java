package m;

import H0.C0148f;
import H0.C0150g;
import H0.C0162q;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0996s;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1033j;
import h0.C1038o;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import java.util.ListIterator;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.C0;
import n.r0;
import n.y0;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1227i {
    public static final long a;

    static {
        long j3 = Integer.MIN_VALUE;
        a = (j3 & 4294967295L) | (j3 << 32);
    }

    public static final void a(String str, InterfaceC1041r interfaceC1041r, l4.c cVar, InterfaceC1028e interfaceC1028e, String str2, l4.c cVar2, C0873f c0873f, C0626q c0626q, int i6) {
        InterfaceC1041r interfaceC1041r2;
        InterfaceC1028e interfaceC1028e2;
        l4.c cVar3;
        c0626q.d0(1501828832);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | 199728;
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            C1033j c1033j = C1026c.f11786c;
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = C1221c.f12771f;
                c0626q.m0(P5);
            }
            cVar3 = (l4.c) P5;
            y0 e6 = C0.e(str, str2, c0626q, (i7 & 14) | 48, 0);
            C1038o c1038o = C1038o.a;
            b(e6, c1038o, cVar, c1033j, cVar3, c0873f, c0626q, 224688);
            interfaceC1041r2 = c1038o;
            interfaceC1028e2 = c1033j;
        } else {
            c0626q.V();
            interfaceC1041r2 = interfaceC1041r;
            interfaceC1028e2 = interfaceC1028e;
            cVar3 = cVar2;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C1222d(str, interfaceC1041r2, cVar, interfaceC1028e2, str2, cVar3, c0873f, i6);
        }
    }

    public static final void b(y0 y0Var, InterfaceC1041r interfaceC1041r, l4.c cVar, InterfaceC1028e interfaceC1028e, l4.c cVar2, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        l4.c cVar3;
        C0626q c0626q2;
        C1237s c1237s;
        C0996s c0996s;
        C1237s c1237s2;
        r0 r0Var;
        boolean z5;
        y0 y0Var2 = y0Var;
        l4.c cVar4 = cVar;
        c0626q.d0(511725103);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(y0Var2) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(cVar4) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.f(interfaceC1028e) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.h(cVar2) ? 16384 : 8192;
        }
        C0873f c0873f2 = c0873f;
        if ((196608 & i6) == 0) {
            i7 |= c0626q.h(c0873f2) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            e1.m mVar = (e1.m) c0626q.j(AbstractC0204q0.f2364n);
            int i8 = i7 & 14;
            boolean z6 = i8 == 4;
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (z6 || P5 == obj) {
                P5 = new C1237s(y0Var2, interfaceC1028e, mVar);
                c0626q.m0(P5);
            }
            C1237s c1237s3 = (C1237s) P5;
            boolean z7 = i8 == 4;
            Object P6 = c0626q.P();
            Object obj2 = P6;
            if (z7 || P6 == obj) {
                Object[] objArr = {y0Var2.a.k()};
                C0996s c0996s2 = new C0996s();
                c0996s2.addAll(Y3.k.B0(objArr));
                c0626q.m0(c0996s2);
                obj2 = c0996s2;
            }
            C0996s c0996s3 = (C0996s) obj2;
            boolean z8 = i8 == 4;
            Object P7 = c0626q.P();
            if (z8 || P7 == obj) {
                long[] jArr = k.V.a;
                P7 = new k.M();
                c0626q.m0(P7);
            }
            k.M m3 = (k.M) P7;
            N3.s sVar = y0Var2.a;
            C0607g0 c0607g0 = y0Var2.f13280d;
            if (!c0996s3.contains(sVar.k())) {
                c0996s3.clear();
                c0996s3.add(sVar.k());
            }
            if (AbstractC1276k.b(sVar.k(), c0607g0.getValue())) {
                if (c0996s3.size() != 1 || !AbstractC1276k.b(c0996s3.get(0), sVar.k())) {
                    c0996s3.clear();
                    c0996s3.add(sVar.k());
                }
                if (m3.f12488e != 1 || m3.c(sVar.k())) {
                    m3.a();
                }
                c1237s3.f12831b = interfaceC1028e;
                c1237s3.f12832c = mVar;
            }
            if (!AbstractC1276k.b(sVar.k(), c0607g0.getValue()) && !c0996s3.contains(c0607g0.getValue())) {
                ListIterator listIterator = c0996s3.listIterator();
                int i9 = 0;
                while (true) {
                    C0162q c0162q = (C0162q) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!c0162q.hasNext()) {
                        i9 = -1;
                        break;
                    } else {
                        if (AbstractC1276k.b(cVar2.f(c0162q.next()), cVar2.f(c0607g0.getValue()))) {
                            break;
                        }
                        i9++;
                        listIterator = listIterator2;
                    }
                }
                if (i9 == -1) {
                    c0996s3.add(c0607g0.getValue());
                } else {
                    c0996s3.set(i9, c0607g0.getValue());
                }
            }
            if (m3.c(c0607g0.getValue()) && m3.c(sVar.k())) {
                c0626q.b0(1925931827);
                c0626q.p(false);
                cVar3 = cVar4;
                c1237s = c1237s3;
            } else {
                c0626q.b0(1966410449);
                m3.a();
                int size = c0996s3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = c0996s3.get(i10);
                    C1237s c1237s4 = c1237s3;
                    m3.m(obj3, AbstractC0874g.c(-23915175, new C1224f(y0Var2, obj3, cVar4, c1237s4, c0996s3, c0873f2), c0626q));
                    c1237s3 = c1237s4;
                    i10++;
                    cVar4 = cVar4;
                    y0Var2 = y0Var;
                    c0873f2 = c0873f;
                }
                cVar3 = cVar4;
                c1237s = c1237s3;
                c0626q.p(false);
            }
            boolean f6 = c0626q.f(y0Var.f()) | c0626q.f(c1237s);
            Object P8 = c0626q.P();
            if (f6 || P8 == obj) {
                P8 = (C1198E) cVar3.f(c1237s);
                c0626q.m0(P8);
            }
            C1198E c1198e = (C1198E) P8;
            y0 y0Var3 = c1237s.a;
            boolean f7 = c0626q.f(c1237s);
            Object P9 = c0626q.P();
            if (f7 || P9 == obj) {
                P9 = T.r.A(Boolean.FALSE);
                c0626q.m0(P9);
            }
            T.X x5 = (T.X) P9;
            T.X E5 = T.r.E(c1198e.f12713d, c0626q);
            if (AbstractC1276k.b(y0Var3.a.k(), y0Var3.f13280d.getValue())) {
                x5.setValue(Boolean.FALSE);
            } else if (E5.getValue() != null) {
                x5.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) x5.getValue()).booleanValue();
            InterfaceC1041r interfaceC1041r2 = C1038o.a;
            if (booleanValue) {
                c0626q.b0(1353077497);
                C1237s c1237s5 = c1237s;
                c0996s = c0996s3;
                c0626q2 = c0626q;
                c1237s2 = c1237s5;
                r0Var = C0.b(c1237s5.a, AbstractC1318d.f13121q, null, c0626q2, 0, 2);
                boolean f8 = c0626q2.f(r0Var);
                Object P10 = c0626q2.P();
                if (f8 || P10 == obj) {
                    P10 = l0.h.d(interfaceC1041r2);
                    c0626q2.m0(P10);
                }
                interfaceC1041r2 = (InterfaceC1041r) P10;
                c0626q2.p(false);
            } else {
                c0996s = c0996s3;
                c0626q2 = c0626q;
                c1237s2 = c1237s;
                c0626q2.b0(1353343539);
                c0626q2.p(false);
                r0Var = null;
                c1237s2.f12835f = null;
            }
            InterfaceC1041r c6 = interfaceC1041r.c(interfaceC1041r2.c(new C1232n(r0Var, E5, c1237s2)));
            Object P11 = c0626q2.P();
            if (P11 == obj) {
                P11 = new C1229k(c1237s2);
                c0626q2.m0(P11);
            }
            C1229k c1229k = (C1229k) P11;
            int hashCode = Long.hashCode(c0626q2.f8164T);
            InterfaceC0617l0 l3 = c0626q2.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q2, c6);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q2.f0();
            if (c0626q2.f8163S) {
                c0626q2.k(c0148f);
            } else {
                c0626q2.p0();
            }
            T.r.G(c0626q2, c1229k, C0150g.f1928f);
            T.r.G(c0626q2, l3, C0150g.f1927e);
            T.r.x(c0626q2, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q2, C0150g.f1930h);
            T.r.G(c0626q2, c7, C0150g.f1926d);
            c0626q2.b0(-860173498);
            int size2 = c0996s.size();
            int i11 = 0;
            while (i11 < size2) {
                C0996s c0996s4 = c0996s;
                Object obj4 = c0996s4.get(i11);
                c0626q2.Z(-2026002954, cVar2.f(obj4));
                l4.e eVar = (l4.e) m3.g(obj4);
                if (eVar == null) {
                    c0626q2.b0(1618454323);
                    z5 = false;
                } else {
                    z5 = false;
                    c0626q2.b0(-2026001778);
                    eVar.m(c0626q2, 0);
                }
                c0626q2.p(z5);
                c0626q2.p(z5);
                i11++;
                c0996s = c0996s4;
            }
            c0626q2.p(false);
            c0626q2.p(true);
        } else {
            cVar3 = cVar4;
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new C1225g(y0Var, interfaceC1041r, cVar3, interfaceC1028e, cVar2, c0873f, i6);
        }
    }

    public static final C1198E c(C1210Q c1210q, C1211S c1211s) {
        return new C1198E(c1210q, c1211s, S.l.f7374V, new a0(C1226h.f12810f));
    }
}
