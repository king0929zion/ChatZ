package z4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.C1928k;
import x4.D0;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2052c implements D0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f16331c = AbstractC2059j.f16367p;

    /* renamed from: e, reason: collision with root package name */
    public C1928k f16332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2057h f16333f;

    public C2052c(C2057h c2057h) {
        this.f16333f = c2057h;
    }

    @Override // x4.D0
    public final void a(C4.s sVar, int i6) {
        C1928k c1928k = this.f16332e;
        if (c1928k != null) {
            c1928k.a(sVar, i6);
        }
    }

    public final Object b(d4.c cVar) {
        p pVar;
        Boolean bool;
        Object obj = this.f16331c;
        boolean z5 = true;
        if (obj == AbstractC2059j.f16367p || obj == AbstractC2059j.f16363l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2057h.f16347j;
            C2057h c2057h = this.f16333f;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(c2057h);
            while (true) {
                if (c2057h.x()) {
                    this.f16331c = AbstractC2059j.f16363l;
                    Throwable q3 = c2057h.q();
                    if (q3 != null) {
                        int i6 = C4.t.a;
                        throw q3;
                    }
                    z5 = false;
                } else {
                    long andIncrement = C2057h.f16343f.getAndIncrement(c2057h);
                    long j3 = AbstractC2059j.f16353b;
                    long j4 = andIncrement / j3;
                    int i7 = (int) (andIncrement % j3);
                    if (pVar2.f715f != j4) {
                        pVar = c2057h.o(j4, pVar2);
                        if (pVar == null) {
                            continue;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    Object I5 = c2057h.I(pVar, i7, andIncrement, null);
                    C4.u uVar = AbstractC2059j.f16364m;
                    if (I5 == uVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    C4.u uVar2 = AbstractC2059j.f16366o;
                    if (I5 == uVar2) {
                        if (andIncrement < c2057h.u()) {
                            pVar.a();
                        }
                        pVar2 = pVar;
                    } else {
                        if (I5 == AbstractC2059j.f16365n) {
                            C2057h c2057h2 = this.f16333f;
                            C1928k s5 = AbstractC1888A.s(Y4.d.K(cVar));
                            try {
                                this.f16332e = s5;
                                Object I6 = c2057h2.I(pVar, i7, andIncrement, this);
                                if (I6 == uVar) {
                                    a(pVar, i7);
                                } else {
                                    if (I6 == uVar2) {
                                        if (andIncrement < c2057h2.u()) {
                                            pVar.a();
                                        }
                                        p pVar3 = (p) C2057h.f16347j.get(c2057h2);
                                        while (true) {
                                            if (c2057h2.x()) {
                                                C1928k c1928k = this.f16332e;
                                                AbstractC1276k.c(c1928k);
                                                this.f16332e = null;
                                                this.f16331c = AbstractC2059j.f16363l;
                                                Throwable q5 = c2057h.q();
                                                if (q5 == null) {
                                                    c1928k.k(Boolean.FALSE);
                                                } else {
                                                    c1928k.k(X3.a.b(q5));
                                                }
                                            } else {
                                                long andIncrement2 = C2057h.f16343f.getAndIncrement(c2057h2);
                                                long j5 = AbstractC2059j.f16353b;
                                                long j6 = andIncrement2 / j5;
                                                int i8 = (int) (andIncrement2 % j5);
                                                if (pVar3.f715f != j6) {
                                                    p o5 = c2057h2.o(j6, pVar3);
                                                    if (o5 != null) {
                                                        pVar3 = o5;
                                                    }
                                                }
                                                Object I7 = c2057h2.I(pVar3, i8, andIncrement2, this);
                                                if (I7 == AbstractC2059j.f16364m) {
                                                    a(pVar3, i8);
                                                    break;
                                                }
                                                if (I7 == AbstractC2059j.f16366o) {
                                                    if (andIncrement2 < c2057h2.u()) {
                                                        pVar3.a();
                                                    }
                                                } else {
                                                    if (I7 == AbstractC2059j.f16365n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    pVar3.a();
                                                    this.f16331c = I7;
                                                    this.f16332e = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        pVar.a();
                                        this.f16331c = I6;
                                        this.f16332e = null;
                                        bool = Boolean.TRUE;
                                    }
                                    s5.e(bool, null);
                                }
                                return s5.s();
                            } catch (Throwable th) {
                                s5.D();
                                throw th;
                            }
                        }
                        pVar.a();
                        this.f16331c = I5;
                    }
                }
            }
        }
        return Boolean.valueOf(z5);
    }

    public final Object c() {
        Object obj = this.f16331c;
        C4.u uVar = AbstractC2059j.f16367p;
        if (obj == uVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f16331c = uVar;
        if (obj != AbstractC2059j.f16363l) {
            return obj;
        }
        Throwable r5 = this.f16333f.r();
        int i6 = C4.t.a;
        throw r5;
    }
}
