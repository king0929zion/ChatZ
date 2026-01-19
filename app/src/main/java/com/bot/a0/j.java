package A0;

import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0149f0;
import H0.F0;
import H0.J;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import m4.AbstractC1276k;
import n0.C1353b;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class j extends AbstractC1040q implements F0, a {

    /* renamed from: r, reason: collision with root package name */
    public a f52r;

    /* renamed from: s, reason: collision with root package name */
    public e f53s;

    /* renamed from: t, reason: collision with root package name */
    public j f54t;

    /* renamed from: u, reason: collision with root package name */
    public final String f55u;

    public j(a aVar, e eVar) {
        this.f52r = aVar;
        this.f53s = eVar == null ? new e() : eVar;
        this.f55u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        e eVar = this.f53s;
        eVar.a = this;
        eVar.f39b = null;
        this.f54t = null;
        eVar.f40c = new b(this, 1);
        eVar.f41d = A0();
    }

        @Override // h0.AbstractC1040q
    public final void F0() {
        Object obj = new Object();
        AbstractC0157l.z(this, new k(obj, 0));
        j jVar = (j) ((F0) obj.f12973c);
        this.f54t = jVar;
        e eVar = this.f53s;
        eVar.f39b = jVar;
        if (eVar.a == this) {
            eVar.a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                            public final InterfaceC1942y M0() {
        j jVar;
        F0 f02;
        C0149f0 c0149f0;
        if (this.f11819q) {
            if (!this.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = this.f11806c.f11810h;
            J v5 = AbstractC0157l.v(this);
            loop0: while (true) {
                if (v5 == null) {
                    f02 = null;
                    break;
                }
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q;
                            int r6 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof F0) {
                                    f02 = (F0) abstractC0156k;
                                    if (AbstractC1276k.b(m(), f02.m()) && j.class == f02.getClass()) {
                                        break loop0;
                                    }
                                } else if ((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r6 = r6;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
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
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
            }
            jVar = (j) f02;
        } else {
            jVar = null;
        }
        InterfaceC1942y M02 = jVar != null ? jVar.M0() : null;
        if (M02 != null && AbstractC1888A.w(M02)) {
            return M02;
        }
        InterfaceC1942y interfaceC1942y = this.f53s.f41d;
        if (interfaceC1942y != null) {
            return interfaceC1942y;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                                @Override // A0.a
    public final long a0(long j3, int i6) {
        C0149f0 c0149f0;
        boolean z5 = this.f11819q;
        j jVar = null;
        if (z5 && z5) {
            if (!this.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = this.f11806c.f11810h;
            J v5 = AbstractC0157l.v(this);
            loop0: while (true) {
                if (v5 == null) {
                    break;
                }
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q;
                            int r5 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof F0) {
                                    Object r32 = (F0) abstractC0156k;
                                    if (AbstractC1276k.b(m(), r32.m()) && j.class == r32.getClass()) {
                                        jVar = r32;
                                        break loop0;
                                    }
                                } else if ((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                                    int i7 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r5 = r5;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                            i7++;
                                            r5 = r5;
                                            if (i7 == 1) {
                                                abstractC0156k = abstractC1040q2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r5.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r5.b(abstractC1040q2);
                                            }
                                        }
                                        abstractC1040q2 = abstractC1040q2.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r5 = r5;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r5);
                            }
                        }
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
            }
            jVar = jVar;
        }
        long a02 = jVar != null ? jVar.a0(j3, i6) : 0L;
        return C1353b.f(a02, this.f52r.a0(C1353b.e(j3, a02), i6));
    }

    @Override // H0.F0
    public final Object m() {
        return this.f55u;
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                                @Override // A0.a
    public final long s0(long j3, long j4, int i6) {
        C0149f0 c0149f0;
        long s02 = this.f52r.s0(j3, j4, i6);
        boolean z5 = this.f11819q;
        j jVar = null;
        if (z5 && z5) {
            if (!this.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = this.f11806c.f11810h;
            J v5 = AbstractC0157l.v(this);
            loop0: while (true) {
                if (v5 == null) {
                    break;
                }
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.ATXHEADERSPACE) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q;
                            int r5 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof F0) {
                                    Object r32 = (F0) abstractC0156k;
                                    if (AbstractC1276k.b(m(), r32.m()) && j.class == r32.getClass()) {
                                        jVar = r32;
                                        break loop0;
                                    }
                                } else if ((abstractC0156k.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                                    int i7 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r5 = r5;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & PegdownExtensions.ATXHEADERSPACE) != 0) {
                                            i7++;
                                            r5 = r5;
                                            if (i7 == 1) {
                                                abstractC0156k = abstractC1040q2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r5.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r5.b(abstractC1040q2);
                                            }
                                        }
                                        abstractC1040q2 = abstractC1040q2.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r5 = r5;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r5);
                            }
                        }
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
            }
            jVar = jVar;
        }
        j jVar2 = jVar;
        return C1353b.f(s02, jVar2 != null ? jVar2.s0(C1353b.f(j3, s02), C1353b.e(j4, s02), i6) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f2, code lost:
    
        if (r3 == r8) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
                                                                                                @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(long r17, b4.InterfaceC0905c r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.j.y0(long, b4.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
                    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(long r18, long r20, b4.InterfaceC0905c r22) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.j.z(long, long, b4.c):java.lang.Object");
    }
}
