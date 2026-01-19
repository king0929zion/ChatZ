package H0;

import F0.C0118f0;
import I0.C0195m;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import h0.InterfaceC1039p;
import org.jsoup.internal.SharedConstants;

/* loaded from: classes.dex */
public abstract class j0 {
    public static final k.H a;

    static {
        k.H h3 = k.S.a;
        a = new k.H();
    }

    public static final void a(AbstractC1040q abstractC1040q, int i6, int i7) {
        if (!(abstractC1040q instanceof AbstractC0156k)) {
            b(abstractC1040q, i6 & abstractC1040q.f11808f, i7);
            return;
        }
        AbstractC0156k abstractC0156k = (AbstractC0156k) abstractC1040q;
        b(abstractC1040q, abstractC0156k.f1963r & i6, i7);
        int i8 = (~abstractC0156k.f1963r) & i6;
        for (AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11811i) {
            a(abstractC1040q2, i8, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(AbstractC1040q abstractC1040q, int i6, int i7) {
        if (i7 != 0 || abstractC1040q.B0()) {
            if ((i6 & 2) != 0 && (abstractC1040q instanceof InterfaceC0170z)) {
                AbstractC0157l.l((InterfaceC0170z) abstractC1040q);
                if (i7 == 2) {
                    AbstractC0157l.t(abstractC1040q, 2).i1();
                }
            }
            if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 && i7 != 2) {
                AbstractC0157l.v(abstractC1040q).E();
            }
            if ((4194304 & i6) != 0 && i7 != 2) {
                AbstractC0157l.v(abstractC1040q).W(false);
            }
            if ((i6 & PegdownExtensions.WIKILINKS) != 0 && (abstractC1040q instanceof InterfaceC0161p)) {
                if (i7 == 1) {
                    J v5 = AbstractC0157l.v(abstractC1040q);
                    v5.c0(v5.f1731T + 1);
                } else if (i7 == 2) {
                    AbstractC0157l.v(abstractC1040q).c0(r0.f1731T - 1);
                }
                if (i7 != 2) {
                    J v6 = AbstractC0157l.v(abstractC1040q);
                    if (v6.f1731T != 0 && !v6.p() && !v6.q() && !v6.f1730S) {
                        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = (ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(v6);
                        M.q qVar = viewTreeObserverOnGlobalLayoutListenerC0216x.f2440a0.f1846e;
                        qVar.getClass();
                        if (v6.f1731T > 0) {
                            ((V.e) qVar.f3179e).b(v6);
                            v6.f1730S = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0216x.I(null);
                    }
                }
            }
            if ((i6 & 4) != 0 && (abstractC1040q instanceof InterfaceC0160o)) {
                AbstractC0157l.k((InterfaceC0160o) abstractC1040q);
            }
            if ((i6 & 8) != 0 && (abstractC1040q instanceof A0)) {
                AbstractC0157l.v(abstractC1040q).f1751v = true;
            }
            if ((i6 & 64) != 0 && (abstractC1040q instanceof u0)) {
                N n3 = AbstractC0157l.v((u0) abstractC1040q).f1722K;
                n3.f1781p.f1881u = true;
                W w5 = n3.f1782q;
                if (w5 != null) {
                    w5.f1817A = true;
                }
            }
            if ((i6 & 2048) != 0 && (abstractC1040q instanceof m0.v)) {
                m0.v vVar = (m0.v) abstractC1040q;
                C0142c.f1888b = null;
                vVar.e(C0142c.a);
                if (C0142c.f1888b != null) {
                    AbstractC1040q abstractC1040q2 = (AbstractC1040q) vVar;
                    if (!abstractC1040q2.f11806c.f11819q) {
                        E0.a.b("visitChildren called on an unattached node");
                    }
                    V.e eVar = new V.e(new AbstractC1040q[16]);
                    AbstractC1040q abstractC1040q3 = abstractC1040q2.f11806c;
                    AbstractC1040q abstractC1040q4 = abstractC1040q3.f11811i;
                    if (abstractC1040q4 == null) {
                        AbstractC0157l.b(eVar, abstractC1040q3);
                    } else {
                        eVar.b(abstractC1040q4);
                    }
                    while (true) {
                        int i8 = eVar.f8761f;
                        if (i8 == 0) {
                            break;
                        }
                        AbstractC1040q abstractC1040q5 = (AbstractC1040q) eVar.k(i8 - 1);
                        if ((abstractC1040q5.f11809g & PegdownExtensions.ANCHORLINKS) == 0) {
                            AbstractC0157l.b(eVar, abstractC1040q5);
                        } else {
                            while (true) {
                                if (abstractC1040q5 == null) {
                                    break;
                                }
                                if ((abstractC1040q5.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                    V.e eVar2 = null;
                                    while (abstractC1040q5 != null) {
                                        if (abstractC1040q5 instanceof m0.C) {
                                            m0.C c6 = (m0.C) abstractC1040q5;
                                            m0.k kVar = ((m0.q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(c6)).getFocusOwner()).f12901d;
                                            if (kVar.f12893c.a(c6)) {
                                                kVar.a();
                                            }
                                        } else if ((abstractC1040q5.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q5 instanceof AbstractC0156k)) {
                                            int i9 = 0;
                                            for (AbstractC1040q abstractC1040q6 = ((AbstractC0156k) abstractC1040q5).f1964s; abstractC1040q6 != null; abstractC1040q6 = abstractC1040q6.f11811i) {
                                                if ((abstractC1040q6.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        abstractC1040q5 = abstractC1040q6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new V.e(new AbstractC1040q[16]);
                                                        }
                                                        if (abstractC1040q5 != null) {
                                                            eVar2.b(abstractC1040q5);
                                                            abstractC1040q5 = null;
                                                        }
                                                        eVar2.b(abstractC1040q6);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        abstractC1040q5 = AbstractC0157l.e(eVar2);
                                    }
                                } else {
                                    abstractC1040q5 = abstractC1040q5.f11811i;
                                }
                            }
                        }
                    }
                }
            }
            if ((i6 & 4096) == 0 || !(abstractC1040q instanceof m0.h)) {
                return;
            }
            m0.h hVar = (m0.h) abstractC1040q;
            m0.k kVar2 = ((m0.q) ((ViewTreeObserverOnGlobalLayoutListenerC0216x) AbstractC0157l.w(hVar)).getFocusOwner()).f12901d;
            if (kVar2.f12894d.a(hVar)) {
                kVar2.a();
            }
        }
    }

    public static final void c(AbstractC1040q abstractC1040q) {
        if (!abstractC1040q.f11819q) {
            E0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(abstractC1040q, -1, 0);
    }

    public static final int d(InterfaceC1039p interfaceC1039p) {
        int i6 = interfaceC1039p instanceof F0.D ? 3 : 1;
        if (interfaceC1039p instanceof l0.g) {
            i6 |= 4;
        }
        if (interfaceC1039p instanceof P0.b) {
            i6 |= 8;
        }
        if (interfaceC1039p instanceof B0.I) {
            i6 |= 16;
        }
        if (interfaceC1039p instanceof F0.g0) {
            i6 |= 64;
        }
        return interfaceC1039p instanceof M0.a ? 524288 | i6 : i6;
    }

    public static final int e(AbstractC1040q abstractC1040q) {
        int i6 = abstractC1040q.f11808f;
        if (i6 != 0) {
            return i6;
        }
        Class<?> cls = abstractC1040q.getClass();
        k.H h3 = a;
        int d6 = h3.d(cls);
        if (d6 >= 0) {
            return h3.f12462c[d6];
        }
        int i7 = abstractC1040q instanceof InterfaceC0170z ? 3 : 1;
        if (abstractC1040q instanceof InterfaceC0160o) {
            i7 |= 4;
        }
        if (abstractC1040q instanceof A0) {
            i7 |= 8;
        }
        if (abstractC1040q instanceof w0) {
            i7 |= 16;
        }
        if (abstractC1040q instanceof G0.c) {
            i7 |= 32;
        }
        if (abstractC1040q instanceof u0) {
            i7 |= 64;
        }
        if (abstractC1040q instanceof C0118f0) {
            i7 |= PegdownExtensions.FENCED_CODE_BLOCKS;
        } else if (abstractC1040q instanceof InterfaceC0169y) {
            i7 |= 4194432;
        }
        if (abstractC1040q instanceof InterfaceC0161p) {
            i7 |= PegdownExtensions.WIKILINKS;
        }
        if (abstractC1040q instanceof m0.C) {
            i7 |= PegdownExtensions.ANCHORLINKS;
        }
        if (abstractC1040q instanceof m0.v) {
            i7 |= 2048;
        }
        if (abstractC1040q instanceof m0.h) {
            i7 |= 4096;
        }
        if (abstractC1040q instanceof z0.e) {
            i7 |= 8192;
        }
        if (abstractC1040q instanceof C0195m) {
            i7 |= 16384;
        }
        if (abstractC1040q instanceof InterfaceC0154i) {
            i7 |= SharedConstants.DefaultBufferSize;
        }
        if (abstractC1040q instanceof F0) {
            i7 |= PegdownExtensions.ATXHEADERSPACE;
        }
        if (abstractC1040q instanceof M0.a) {
            i7 |= PegdownExtensions.SUBSCRIPT;
        }
        if (abstractC1040q instanceof y0.c) {
            i7 |= PegdownExtensions.TASKLISTITEMS;
        }
        if (abstractC1040q instanceof y.r) {
            i7 |= PegdownExtensions.EXTANCHORLINKS_WRAP;
        }
        h3.g(i7, cls);
        return i7;
    }

    public static final int f(AbstractC1040q abstractC1040q) {
        if (!(abstractC1040q instanceof AbstractC0156k)) {
            return e(abstractC1040q);
        }
        AbstractC0156k abstractC0156k = (AbstractC0156k) abstractC1040q;
        int i6 = abstractC0156k.f1963r;
        for (AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s; abstractC1040q2 != null; abstractC1040q2 = abstractC1040q2.f11811i) {
            i6 |= f(abstractC1040q2);
        }
        return i6;
    }

    public static final boolean g(int i6) {
        return ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) | ((i6 & PegdownExtensions.EXTANCHORLINKS) != 0);
    }
}
