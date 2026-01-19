package P0;

import B0.G;
import F0.AbstractC0137z;
import H0.A0;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.J;
import H0.i0;
import h0.AbstractC1040q;
import java.util.ArrayList;
import java.util.List;
import k.M;
import n0.C1354c;

/* loaded from: classes.dex */
public final class p {
    public final AbstractC1040q a;

    /* renamed from: b */
    public final boolean f4497b;

    /* renamed from: c */
    public final J f4498c;

    /* renamed from: d */
    public final m f4499d;

    /* renamed from: e */
    public boolean f4500e;

    /* renamed from: f */
    public p f4501f;

    /* renamed from: g */
    public final int f4502g;

    public p(AbstractC1040q abstractC1040q, boolean z5, J j3, m mVar) {
        this.a = abstractC1040q;
        this.f4497b = z5;
        this.f4498c = j3;
        this.f4499d = mVar;
        this.f4502g = j3.f1734e;
    }

    public static /* synthetic */ List j(int i6, p pVar) {
        return pVar.i((i6 & 1) != 0 ? !pVar.f4497b : false, (i6 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                                    public final C1354c a(i0 i0Var) {
        AbstractC0156k abstractC0156k;
        p l3 = l();
        if (l3 == null) {
            return C1354c.f13294e;
        }
        AbstractC1040q abstractC1040q = l3.f4498c.f1721J.f1919f;
        if ((abstractC1040q.f11809g & 8) != 0) {
            loop0: while (abstractC1040q != null) {
                if ((abstractC1040q.f11808f & 8) != 0) {
                    abstractC0156k = abstractC1040q;
                    int r6 = 0;
                    while (abstractC0156k != 0) {
                        if (abstractC0156k instanceof A0) {
                            if (abstractC0156k.h()) {
                                break loop0;
                            }
                        } else if ((abstractC0156k.f11808f & 8) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                            AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                            int i6 = 0;
                            abstractC0156k = abstractC0156k;
                            r6 = r6;
                            while (abstractC1040q2 != null) {
                                if ((abstractC1040q2.f11808f & 8) != 0) {
                                    i6++;
                                    r6 = r6;
                                    if (i6 == 1) {
                                        abstractC0156k = abstractC1040q2;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC0156k != 0) {
                                            r6.b(abstractC0156k);
                                            abstractC0156k = 0;
                                        }
                                        r6.b(abstractC1040q2);
                                    }
                                }
                                abstractC1040q2 = abstractC1040q2.f11811i;
                                abstractC0156k = abstractC0156k;
                                r6 = r6;
                            }
                            if (i6 == 1) {
                            }
                        }
                        abstractC0156k = AbstractC0157l.e(r6);
                    }
                }
                if ((abstractC1040q.f11809g & 8) == 0) {
                    break;
                }
                abstractC1040q = abstractC1040q.f11811i;
            }
        }
        abstractC0156k = 0;
        A0 a02 = (A0) abstractC0156k;
        i0 t5 = a02 != null ? AbstractC0157l.t(a02, 8) : null;
        return t5 == null ? l3.a(i0Var) : t5.Q(i0Var, true);
    }

    public final p b(i iVar, l4.c cVar) {
        m mVar = new m();
        mVar.f4494f = false;
        mVar.f4495g = false;
        cVar.f(mVar);
        p pVar = new p(new o(cVar), false, new J(true, this.f4502g + (iVar != null ? 1000000000 : 2000000000)), mVar);
        pVar.f4500e = true;
        pVar.f4501f = this;
        return pVar;
    }

    public final void c(J j3, ArrayList arrayList) {
        V.e y5 = j3.y();
        Object[] objArr = y5.f8759c;
        int i6 = y5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            J j4 = (J) objArr[i7];
            if (j4.H() && !j4.f1732U) {
                if (j4.f1721J.d(8)) {
                    arrayList.add(s.a(j4, this.f4497b));
                } else {
                    c(j4, arrayList);
                }
            }
        }
    }

    public final i0 d() {
        if (!this.f4500e) {
            A0 f6 = f();
            return f6 != null ? AbstractC0157l.t(f6, 8) : this.f4498c.f1721J.f1916c;
        }
        p l3 = l();
        if (l3 != null) {
            return l3.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (pVar.n()) {
                arrayList2.add(pVar);
            } else if (!pVar.f4499d.f4495g) {
                pVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                                public final A0 f() {
        AbstractC1040q abstractC1040q;
        boolean z5 = this.f4499d.f4494f;
        J j3 = this.f4498c;
        Object obj = null;
        if (!z5) {
            AbstractC1040q abstractC1040q2 = j3.f1721J.f1919f;
            if ((abstractC1040q2.f11809g & 8) != 0) {
                loop3: while (abstractC1040q2 != null) {
                    if ((abstractC1040q2.f11808f & 8) != 0) {
                        abstractC1040q = abstractC1040q2;
                        V.e eVar = null;
                        while (abstractC1040q != null) {
                            if (abstractC1040q instanceof A0) {
                                if (((A0) abstractC1040q).h()) {
                                    obj = abstractC1040q;
                                }
                            } else if ((abstractC1040q.f11808f & 8) != 0 && (abstractC1040q instanceof AbstractC0156k)) {
                                int i6 = 0;
                                for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                    if ((abstractC1040q3.f11808f & 8) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC1040q = abstractC1040q3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q != null) {
                                                eVar.b(abstractC1040q);
                                                abstractC1040q = null;
                                            }
                                            eVar.b(abstractC1040q3);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC1040q = AbstractC0157l.e(eVar);
                        }
                    }
                    if ((abstractC1040q2.f11809g & 8) == 0) {
                        break;
                    }
                    abstractC1040q2 = abstractC1040q2.f11811i;
                }
            }
            return (A0) obj;
        }
        AbstractC1040q abstractC1040q4 = j3.f1721J.f1919f;
        if ((abstractC1040q4.f11809g & 8) != 0) {
            abstractC1040q = null;
            while (abstractC1040q4 != null) {
                if ((abstractC1040q4.f11808f & 8) != 0) {
                    AbstractC0156k abstractC0156k = abstractC1040q4;
                    int r7 = 0;
                    while (abstractC0156k != 0) {
                        if (abstractC0156k instanceof A0) {
                            Object r6 = (A0) abstractC0156k;
                            if (r6.h()) {
                                if (r6.x0()) {
                                    return r6;
                                }
                                if (abstractC1040q == null) {
                                    abstractC1040q = r6;
                                }
                            }
                        } else if ((abstractC0156k.f11808f & 8) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                            AbstractC1040q abstractC1040q5 = abstractC0156k.f1964s;
                            int i7 = 0;
                            abstractC0156k = abstractC0156k;
                            r7 = r7;
                            while (abstractC1040q5 != null) {
                                if ((abstractC1040q5.f11808f & 8) != 0) {
                                    i7++;
                                    r7 = r7;
                                    if (i7 == 1) {
                                        abstractC0156k = abstractC1040q5;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC0156k != 0) {
                                            r7.b(abstractC0156k);
                                            abstractC0156k = 0;
                                        }
                                        r7.b(abstractC1040q5);
                                    }
                                }
                                abstractC1040q5 = abstractC1040q5.f11811i;
                                abstractC0156k = abstractC0156k;
                                r7 = r7;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC0156k = AbstractC0157l.e(r7);
                    }
                }
                if ((abstractC1040q4.f11809g & 8) == 0) {
                    break;
                }
                abstractC1040q4 = abstractC1040q4.f11811i;
            }
            obj = abstractC1040q;
        }
        return (A0) obj;
    }

    public final C1354c g() {
        i0 d6 = d();
        if (d6 != null) {
            if (!d6.W0().f11819q) {
                d6 = null;
            }
            if (d6 != null) {
                return AbstractC0137z.h(d6).Q(d6, true);
            }
        }
        return C1354c.f13294e;
    }

    public final C1354c h() {
        i0 d6 = d();
        if (d6 != null) {
            if (!d6.W0().f11819q) {
                d6 = null;
            }
            if (d6 != null) {
                return AbstractC0137z.f(d6, true);
            }
        }
        return C1354c.f13294e;
    }

    public final List i(boolean z5, boolean z6) {
        if (!z5 && this.f4499d.f4495g) {
            return Y3.v.f9812c;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z6);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final m k() {
        boolean n3 = n();
        m mVar = this.f4499d;
        if (!n3) {
            return mVar;
        }
        m b5 = mVar.b();
        p(new ArrayList(), b5);
        return b5;
    }

    public final p l() {
        J j3;
        p pVar = this.f4501f;
        if (pVar != null) {
            return pVar;
        }
        J j4 = this.f4498c;
        boolean z5 = this.f4497b;
        if (z5) {
            j3 = j4.v();
            while (j3 != null) {
                m x5 = j3.x();
                if (x5 != null && x5.f4494f) {
                    break;
                }
                j3 = j3.v();
            }
        }
        j3 = null;
        if (j3 == null) {
            J v5 = j4.v();
            while (true) {
                if (v5 == null) {
                    j3 = null;
                    break;
                }
                if (v5.f1721J.d(8)) {
                    j3 = v5;
                    break;
                }
                v5 = v5.v();
            }
        }
        if (j3 == null) {
            return null;
        }
        return s.a(j3, z5);
    }

    public final m m() {
        return this.f4499d;
    }

    public final boolean n() {
        return this.f4497b && this.f4499d.f4494f;
    }

    public final boolean o() {
        if (this.f4500e || !j(4, this).isEmpty()) {
            return false;
        }
        J v5 = this.f4498c.v();
        while (true) {
            if (v5 == null) {
                v5 = null;
                break;
            }
            m x5 = v5.x();
            if (x5 != null && x5.f4494f) {
                break;
            }
            v5 = v5.v();
        }
        return v5 == null;
    }

    public final void p(ArrayList arrayList, m mVar) {
        if (this.f4499d.f4495g) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (!pVar.n()) {
                mVar.d(pVar.f4499d);
                pVar.p(arrayList, mVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z5) {
        if (this.f4500e) {
            return Y3.v.f9812c;
        }
        c(this.f4498c, arrayList);
        if (z5) {
            m mVar = this.f4499d;
            M m3 = mVar.f4492c;
            Object g3 = m3.g(t.f4546y);
            if (g3 == null) {
                g3 = null;
            }
            i iVar = (i) g3;
            if (iVar != null && mVar.f4494f && !arrayList.isEmpty()) {
                arrayList.add(b(iVar, new G(iVar, 14)));
            }
            w wVar = t.a;
            if (m3.c(wVar) && !arrayList.isEmpty() && mVar.f4494f) {
                Object g6 = m3.g(wVar);
                if (g6 == null) {
                    g6 = null;
                }
                List list = (List) g6;
                String str = list != null ? (String) Y3.m.q0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new G(str, 15)));
                }
            }
        }
        return arrayList;
    }
}
