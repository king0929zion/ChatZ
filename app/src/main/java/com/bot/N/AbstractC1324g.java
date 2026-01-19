package n;

import T.C0616l;
import T.C0626q;
import T.d1;
import Z2.C0741a0;
import i4.AbstractC1120d;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import z4.InterfaceC2061l;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1324g {
    public static final C1327h0 a = AbstractC1318d.r(S.l.f7374V, S.l.f7374V, null, 7);

    static {
        Object obj = N0.a;
        AbstractC1318d.r(S.l.f7374V, S.l.f7374V, new e1.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final d1 a(float f6, InterfaceC1351z interfaceC1351z, C0626q c0626q, int i6, int i7) {
        return c(new e1.f(f6), AbstractC1318d.f13116l, interfaceC1351z, null, (i7 & 4) != 0 ? "DpAnimation" : "drawerExtraWidth", c0626q, ((i6 << 3) & 896) | ((i6 << 6) & 57344), 8);
    }

    public static final d1 b(float f6, InterfaceC1351z interfaceC1351z, String str, C0626q c0626q, int i6, int i7) {
        Float valueOf = Float.valueOf(0.01f);
        if ((i7 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (interfaceC1351z == a) {
            c0626q.b0(1144089983);
            boolean c6 = c0626q.c(0.01f);
            Object P5 = c0626q.P();
            if (c6 || P5 == C0616l.a) {
                P5 = AbstractC1318d.r(S.l.f7374V, S.l.f7374V, valueOf, 3);
                c0626q.m0(P5);
            }
            interfaceC1351z = (C1327h0) P5;
            c0626q.p(false);
        } else {
            c0626q.b0(1144199909);
            c0626q.p(false);
        }
        return c(Float.valueOf(f6), AbstractC1318d.f13114j, interfaceC1351z, valueOf, str2, c0626q, (i6 << 3) & 57344, 0);
    }

    public static final d1 c(Object obj, E0 e02, InterfaceC1334l interfaceC1334l, Float f6, String str, C0626q c0626q, int i6, int i7) {
        if ((i7 & 8) != 0) {
            f6 = null;
        }
        Object P5 = c0626q.P();
        Object obj2 = C0616l.a;
        if (P5 == obj2) {
            P5 = T.r.A(null);
            c0626q.m0(P5);
        }
        T.X x5 = (T.X) P5;
        Object P6 = c0626q.P();
        if (P6 == obj2) {
            P6 = new C1316c(obj, e02, f6);
            c0626q.m0(P6);
        }
        C1316c c1316c = (C1316c) P6;
        T.X E5 = T.r.E(null, c0626q);
        if (f6 != null && (interfaceC1334l instanceof C1327h0)) {
            C1327h0 c1327h0 = (C1327h0) interfaceC1334l;
            if (!AbstractC1276k.b(c1327h0.f13160c, f6)) {
                interfaceC1334l = new C1327h0(c1327h0.a, c1327h0.f13159b, f6);
            }
        }
        T.X E6 = T.r.E(interfaceC1334l, c0626q);
        Object P7 = c0626q.P();
        if (P7 == obj2) {
            P7 = AbstractC1120d.a(-1, 6, null);
            c0626q.m0(P7);
        }
        InterfaceC2061l interfaceC2061l = (InterfaceC2061l) P7;
        boolean h3 = c0626q.h(interfaceC2061l) | c0626q.h(obj);
        Object P8 = c0626q.P();
        if (h3 || P8 == obj2) {
            P8 = new C0741a0(2, interfaceC2061l, obj);
            c0626q.m0(P8);
        }
        T.r.j((InterfaceC1193a) P8, c0626q);
        boolean h6 = c0626q.h(interfaceC2061l) | c0626q.h(c1316c) | c0626q.f(E6) | c0626q.f(E5);
        Object P9 = c0626q.P();
        if (h6 || P9 == obj2) {
            Object c1322f = new C1322f(interfaceC2061l, c1316c, E6, E5, null);
            c0626q.m0(c1322f);
            P9 = c1322f;
        }
        T.r.f(c0626q, interfaceC2061l, (l4.e) P9);
        d1 d1Var = (d1) x5.getValue();
        return d1Var == null ? c1316c.f13093c : d1Var;
    }
}
