package n;

import P2.C0343a0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import Z2.C0782v0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import f0.C0990m;

/* loaded from: classes.dex */
public abstract class C0 {
    public static final C0990m a = new C0990m(5);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f12980b = X3.a.c(X3.g.f9391e, new C0782v0(18));

    public static final void a(y0 y0Var, u0 u0Var, Object obj, Object obj2, InterfaceC1351z interfaceC1351z, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(867041821);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(y0Var) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(u0Var) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= (i6 & PegdownExtensions.STRIKETHROUGH) == 0 ? c0626q.f(obj) : c0626q.h(obj) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= (i6 & 4096) == 0 ? c0626q.f(obj2) : c0626q.h(obj2) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= (32768 & i6) == 0 ? c0626q.f(interfaceC1351z) : c0626q.h(interfaceC1351z) ? 16384 : 8192;
        }
        if (!c0626q.S(i7 & 1, (i7 & 9363) != 9362)) {
            c0626q.V();
        } else if (y0Var.g()) {
            u0Var.g(obj, obj2, interfaceC1351z);
        } else {
            u0Var.h(obj2, interfaceC1351z);
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0343a0(y0Var, u0Var, obj, obj2, interfaceC1351z, i6, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [m4.l, l4.c] */
    public static final r0 b(y0 y0Var, E0 e02, String str, C0626q c0626q, int i6, int i7) {
        q0 q0Var;
        if ((i7 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f6 = c0626q.f(y0Var);
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (f6 || P5 == obj) {
            P5 = new r0(y0Var, e02, str);
            c0626q.m0(P5);
        }
        r0 r0Var = (r0) P5;
        boolean f7 = c0626q.f(y0Var) | c0626q.h(r0Var);
        Object P6 = c0626q.P();
        if (f7 || P6 == obj) {
            P6 = new Z2.X(8, y0Var, r0Var);
            c0626q.m0(P6);
        }
        T.r.d(r0Var, (l4.c) P6, c0626q);
        if (y0Var.g() && (q0Var = (q0) r0Var.f13222b.getValue()) != null) {
            y0 y0Var2 = r0Var.f13223c;
            q0Var.f13218c.g(q0Var.f13220f.f(y0Var2.f().b()), q0Var.f13220f.f(y0Var2.f().c()), (InterfaceC1351z) q0Var.f13219e.f(y0Var2.f()));
        }
        return r0Var;
    }

    public static final u0 c(y0 y0Var, Object obj, Object obj2, InterfaceC1351z interfaceC1351z, E0 e02, C0626q c0626q, int i6) {
        boolean f6 = c0626q.f(y0Var);
        Object P5 = c0626q.P();
        Object obj3 = C0616l.a;
        if (f6 || P5 == obj3) {
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h3 = AbstractC0997t.h(e6);
            try {
                AbstractC1343r abstractC1343r = (AbstractC1343r) e02.a.f(obj2);
                abstractC1343r.d();
                P5 = new u0(y0Var, obj, abstractC1343r, e02);
                AbstractC0997t.k(e6, h3, e7);
                c0626q.m0(P5);
            } catch (Throwable th) {
                AbstractC0997t.k(e6, h3, e7);
                throw th;
            }
        }
        u0 u0Var = (u0) P5;
        a(y0Var, u0Var, obj, obj2, interfaceC1351z, c0626q, 0);
        boolean f7 = c0626q.f(y0Var) | c0626q.f(u0Var);
        Object P6 = c0626q.P();
        if (f7 || P6 == obj3) {
            P6 = new Z2.X(6, y0Var, u0Var);
            c0626q.m0(P6);
        }
        T.r.d(u0Var, (l4.c) P6, c0626q);
        return u0Var;
    }

    public static final y0 d(N3.s sVar, String str, C0626q c0626q, int i6) {
        int i7 = (i6 & 14) ^ 6;
        boolean z5 = true;
        boolean z6 = (i7 > 4 && c0626q.f(sVar)) || (i6 & 6) == 4;
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (z6 || P5 == obj) {
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h3 = AbstractC0997t.h(e6);
            try {
                Object y0Var = new y0(sVar, null, str);
                AbstractC0997t.k(e6, h3, e7);
                c0626q.m0(y0Var);
                P5 = y0Var;
            } catch (Throwable th) {
                AbstractC0997t.k(e6, h3, e7);
                throw th;
            }
        }
        y0 y0Var2 = (y0) P5;
        if (sVar instanceof C1321e0) {
            c0626q.b0(-1357607479);
            C1321e0 c1321e0 = (C1321e0) sVar;
            Object value = c1321e0.f13135c.getValue();
            Object value2 = c1321e0.f13134b.getValue();
            if ((i7 <= 4 || !c0626q.f(sVar)) && (i6 & 6) != 4) {
                z5 = false;
            }
            Object P6 = c0626q.P();
            if (z5 || P6 == obj) {
                P6 = new A0(sVar, null);
                c0626q.m0(P6);
            }
            T.r.h(value, value2, (l4.e) P6, c0626q);
            c0626q.p(false);
        } else {
            c0626q.b0(-1357145920);
            y0Var2.a(sVar.l(), c0626q, 0);
            c0626q.p(false);
        }
        boolean f6 = c0626q.f(y0Var2);
        Object P7 = c0626q.P();
        if (f6 || P7 == obj) {
            P7 = new z0(y0Var2, 0);
            c0626q.m0(P7);
        }
        T.r.d(y0Var2, (l4.c) P7, c0626q);
        return y0Var2;
    }

    public static final y0 e(Object obj, String str, C0626q c0626q, int i6, int i7) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        Object P5 = c0626q.P();
        C0602e c0602e = C0616l.a;
        if (P5 == c0602e) {
            P5 = new y0(new C1304M(obj), null, str);
            c0626q.m0(P5);
        }
        y0 y0Var = (y0) P5;
        y0Var.a(obj, c0626q, (i6 & 8) | 48 | (i6 & 14));
        Object P6 = c0626q.P();
        if (P6 == c0602e) {
            P6 = new z0(y0Var, 1);
            c0626q.m0(P6);
        }
        T.r.d(y0Var, (l4.c) P6, c0626q);
        return y0Var;
    }
}
