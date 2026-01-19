package m0;

import B0.C0028d;
import F0.InterfaceC0134w;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.InterfaceC0154i;
import H0.InterfaceC0155j;
import H0.InterfaceC0169y;
import H0.J;
import H0.m0;
import I0.AbstractC0204q0;
import I0.C0208t;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.os.Trace;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import n0.C1354c;
import o4.AbstractC1410a;
import x0.C1861a;
import x0.C1863c;
import x0.InterfaceC1862b;

/* loaded from: classes.dex */
public final class C extends AbstractC1040q implements InterfaceC0154i, InterfaceC0169y, m0, G0.c, InterfaceC0155j {

    /* renamed from: r */
    public final boolean f12872r;

    /* renamed from: s */
    public final l4.e f12873s;

    /* renamed from: t */
    public boolean f12874t;

    /* renamed from: u */
    public boolean f12875u;

    /* renamed from: v */
    public final int f12876v;

    public C(int i6, l4.e eVar, int i7) {
        i6 = (i7 & 1) != 0 ? 1 : i6;
        boolean z5 = (i7 & 2) == 0;
        eVar = (i7 & 4) != 0 ? null : eVar;
        this.f12872r = z5;
        this.f12873s = eVar;
        this.f12876v = i6;
    }

    public static /* synthetic */ boolean U0(C c6) {
        return c6.T0(7);
    }

    @Override // h0.AbstractC1040q
    public final boolean B0() {
        return false;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        int ordinal = R0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                n focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner();
                C f6 = AbstractC1249d.f(this);
                if (f6 == null || !f6.f12872r) {
                    return;
                }
                q qVar = (q) focusOwner;
                qVar.a.H();
                qVar.f12901d.a();
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                return;
            }
        }
        q qVar2 = (q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner();
        qVar2.d(8, true, false);
        if (this.f12872r) {
            qVar2.a.H();
        }
        qVar2.f12901d.a();
    }

    @Override // h0.AbstractC1040q
    public final void G0() {
        if (R0().b()) {
            ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner()).d(8, true, true);
        }
    }

    public final boolean M0(int i6) {
        int ordinal = AbstractC1249d.w(this, i6).ordinal();
        if (ordinal == 0) {
            return AbstractC1249d.x(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [V.e] */
    public final void N0(EnumC1245A enumC1245A, EnumC1245A enumC1245A2) {
        C0149f0 c0149f0;
        l4.e eVar;
        q qVar = (q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner();
        C h3 = qVar.h();
        if (!enumC1245A.equals(enumC1245A2) && (eVar = this.f12873s) != null) {
            eVar.m(enumC1245A, enumC1245A2);
        }
        AbstractC1040q abstractC1040q = this.f11806c;
        if (!abstractC1040q.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q2 = this.f11806c;
        J v5 = AbstractC0157l.v(this);
        while (v5 != null) {
            if ((v5.f1721J.f1919f.f11809g & 5120) != 0) {
                while (abstractC1040q2 != null) {
                    int i6 = abstractC1040q2.f11808f;
                    if ((i6 & 5120) != 0) {
                        if (abstractC1040q2 != abstractC1040q && (i6 & PegdownExtensions.ANCHORLINKS) != 0) {
                            return;
                        }
                        if ((i6 & 4096) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q2;
                            ?? r6 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof h) {
                                    h hVar = (h) abstractC0156k;
                                    if (h3 == qVar.h()) {
                                        hVar.H(enumC1245A2);
                                    }
                                } else if ((abstractC0156k.f11808f & 4096) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q3 = abstractC0156k.f1964s;
                                    int i7 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r6 = r6;
                                    while (abstractC1040q3 != null) {
                                        if ((abstractC1040q3.f11808f & 4096) != 0) {
                                            i7++;
                                            r6 = r6;
                                            if (i7 == 1) {
                                                abstractC0156k = abstractC1040q3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r6.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r6.b(abstractC1040q3);
                                            }
                                        }
                                        abstractC1040q3 = abstractC1040q3.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r6 = r6;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r6);
                            }
                        }
                    }
                    abstractC1040q2 = abstractC1040q2.f11810h;
                }
            }
            v5 = v5.v();
            abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m0.u, java.lang.Object, m0.s] */
    /* JADX WARN: Type inference failed for: r6v10, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [m0.v] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [V.e] */
    public final u O0() {
        boolean z5;
        C0149f0 c0149f0;
        ?? obj = new Object();
        obj.a = true;
        w wVar = w.f12920b;
        obj.f12909b = wVar;
        obj.f12910c = wVar;
        obj.f12911d = wVar;
        obj.f12912e = wVar;
        obj.f12913f = wVar;
        obj.f12914g = wVar;
        obj.f12915h = wVar;
        obj.f12916i = wVar;
        obj.f12917j = t.f12906f;
        obj.f12918k = t.f12907g;
        obj.f12919l = r.a;
        int i6 = this.f12876v;
        if (i6 == 1) {
            z5 = true;
        } else if (i6 == 0) {
            z5 = !(((C1861a) ((C1863c) ((InterfaceC1862b) AbstractC0157l.h(this, AbstractC0204q0.f2363m))).a.getValue()).a == 1);
        } else {
            if (i6 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z5 = false;
        }
        obj.a = z5;
        AbstractC1040q abstractC1040q = this.f11806c;
        if (!abstractC1040q.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q2 = this.f11806c;
        J v5 = AbstractC0157l.v(this);
        loop0: while (v5 != null) {
            if ((v5.f1721J.f1919f.f11809g & 3072) != 0) {
                while (abstractC1040q2 != null) {
                    int i7 = abstractC1040q2.f11808f;
                    if ((i7 & 3072) != 0) {
                        if (abstractC1040q2 != abstractC1040q && (i7 & PegdownExtensions.ANCHORLINKS) != 0) {
                            break loop0;
                        }
                        if ((i7 & 2048) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q2;
                            ?? r8 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof v) {
                                    ((v) abstractC0156k).e(obj);
                                } else if ((abstractC0156k.f11808f & 2048) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q3 = abstractC0156k.f1964s;
                                    int i8 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r8 = r8;
                                    while (abstractC1040q3 != null) {
                                        if ((abstractC1040q3.f11808f & 2048) != 0) {
                                            i8++;
                                            r8 = r8;
                                            if (i8 == 1) {
                                                abstractC0156k = abstractC1040q3;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r8.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r8.b(abstractC1040q3);
                                            }
                                        }
                                        abstractC1040q3 = abstractC1040q3.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r8 = r8;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r8);
                            }
                        }
                    }
                    abstractC1040q2 = abstractC1040q2.f11810h;
                }
            }
            v5 = v5.v();
            abstractC1040q2 = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
        }
        return obj;
    }

    public final C1354c P0(InterfaceC0134w interfaceC0134w) {
        C1354c c1354c = O0().f12919l;
        return c1354c != r.a ? interfaceC0134w == null ? c1354c : c1354c.j(interfaceC0134w.l(AbstractC0157l.u(this), 0L)) : interfaceC0134w != null ? interfaceC0134w.Q(AbstractC0157l.u(this), false) : AbstractC1117a.a(0L, AbstractC1410a.S(AbstractC0157l.u(this).f1487f));
    }

    public final y.r Q0() {
        C0149f0 c0149f0;
        Object obj;
        if (!this.f11806c.f11819q) {
            E0.a.b("visitAncestors called on an unattached node");
        }
        AbstractC1040q abstractC1040q = this.f11806c.f11810h;
        J v5 = AbstractC0157l.v(this);
        while (true) {
            if (v5 == null) {
                break;
            }
            if ((v5.f1721J.f1919f.f11809g & 8388640) != 0) {
                while (abstractC1040q != null) {
                    int i6 = abstractC1040q.f11808f;
                    if ((i6 & 8388640) != 0) {
                        if ((8388608 & i6) != 0) {
                            if (!(abstractC1040q instanceof y.r)) {
                                if (abstractC1040q instanceof AbstractC0156k) {
                                    AbstractC1040q abstractC1040q2 = null;
                                    for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                        if (abstractC1040q3 instanceof y.r) {
                                            abstractC1040q2 = abstractC1040q3;
                                        }
                                    }
                                    abstractC1040q = abstractC1040q2;
                                } else {
                                    abstractC1040q = null;
                                }
                            }
                            y.r rVar = (y.r) abstractC1040q;
                            if (rVar != null) {
                                return rVar;
                            }
                        } else if ((i6 & 32) != 0) {
                            if (abstractC1040q instanceof G0.c) {
                                obj = abstractC1040q;
                            } else if (abstractC1040q instanceof AbstractC0156k) {
                                obj = null;
                                for (AbstractC1040q abstractC1040q4 = ((AbstractC0156k) abstractC1040q).f1964s; abstractC1040q4 != null; abstractC1040q4 = abstractC1040q4.f11811i) {
                                    if (abstractC1040q4 instanceof G0.c) {
                                        obj = abstractC1040q4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            G0.c cVar = (G0.c) obj;
                            if (cVar != null) {
                                cVar.Y().getClass();
                            }
                        }
                    }
                    abstractC1040q = abstractC1040q.f11810h;
                }
            }
            v5 = v5.v();
            abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
        }
        return null;
    }

    public final EnumC1245A R0() {
        C h3;
        C0149f0 c0149f0;
        boolean z5 = this.f11819q;
        EnumC1245A enumC1245A = EnumC1245A.f12870f;
        if (!z5 || (h3 = ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner()).h()) == null) {
            return enumC1245A;
        }
        if (this == h3) {
            return EnumC1245A.f12868c;
        }
        if (h3.f11819q) {
            if (!h3.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = h3.f11806c.f11810h;
            J v5 = AbstractC0157l.v(h3);
            while (v5 != null) {
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                            AbstractC1040q abstractC1040q2 = abstractC1040q;
                            V.e eVar = null;
                            while (abstractC1040q2 != null) {
                                if (abstractC1040q2 instanceof C) {
                                    if (this == ((C) abstractC1040q2)) {
                                        return EnumC1245A.f12869e;
                                    }
                                } else if ((abstractC1040q2.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                                    int i6 = 0;
                                    for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                        if ((abstractC1040q3.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
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
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
            }
        }
        return enumC1245A;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m4.w, java.lang.Object] */
    public final void S0() {
        int ordinal = R0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                return;
            }
        }
        ?? obj = new Object();
        AbstractC0157l.r(this, new C0028d(8, obj, this));
        Object obj2 = obj.f12973c;
        if (obj2 == null) {
            AbstractC1276k.k("focusProperties");
            throw null;
        }
        if (((s) obj2).b()) {
            return;
        }
        ((q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(this)).getFocusOwner()).b(true);
    }

    public final boolean T0(int i6) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean M02 = O0().a ? M0(i6) : AbstractC1249d.h(this, i6, new C0208t(i6, 4));
            Trace.endSection();
            return M02;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // H0.m0
    public final void i0() {
        S0();
    }

    @Override // H0.InterfaceC0169y
    public final void o(InterfaceC0134w interfaceC0134w) {
    }
}
