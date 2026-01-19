package n;

import T.C0616l;
import T.C0626q;
import Z2.C0745c0;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import f0.C0990m;
import h0.C1026c;
import h0.InterfaceC1042s;
import l4.InterfaceC1193a;
import org.jsoup.internal.SharedConstants;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1318d {
    public static final C1338n a = new C1338n(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C1340o f13106b = new C1340o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C1341p f13107c = new C1341p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C1342q f13108d = new C1342q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C1338n f13109e = new C1338n(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C1340o f13110f = new C1340o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C1341p f13111g = new C1341p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final C1342q f13112h = new C1342q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f13113i = new float[91];

    /* renamed from: j, reason: collision with root package name */
    public static final E0 f13114j = new E0(new C0990m(7), new C0990m(24));

    /* renamed from: k, reason: collision with root package name */
    public static final E0 f13115k = new E0(new C0990m(8), new C0990m(9));

    /* renamed from: l, reason: collision with root package name */
    public static final E0 f13116l = new E0(new C0990m(10), new C0990m(11));

    /* renamed from: m, reason: collision with root package name */
    public static final E0 f13117m = new E0(new C0990m(12), new C0990m(13));

    /* renamed from: n, reason: collision with root package name */
    public static final E0 f13118n = new E0(new C0990m(14), new C0990m(15));

    /* renamed from: o, reason: collision with root package name */
    public static final E0 f13119o = new E0(new C0990m(16), new C0990m(17));

    /* renamed from: p, reason: collision with root package name */
    public static final E0 f13120p = new E0(new C0990m(18), new C0990m(19));

    /* renamed from: q, reason: collision with root package name */
    public static final E0 f13121q = new E0(new C0990m(20), new C0990m(21));

    /* renamed from: r, reason: collision with root package name */
    public static final E0 f13122r = new E0(new C0990m(22), new C0990m(23));

    public static C1316c a(float f6) {
        return new C1316c(Float.valueOf(f6), f13114j, Float.valueOf(0.01f), 8);
    }

    public static C1336m b(float f6, float f7, int i6) {
        if ((i6 & 2) != 0) {
            f7 = S.l.f7374V;
        }
        return new C1336m(f13114j, Float.valueOf(f6), new C1338n(f7), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f6, float f7, float f8, InterfaceC1334l interfaceC1334l, l4.e eVar, d4.i iVar) {
        Float f9 = new Float(f6);
        Float f10 = new Float(f7);
        Float f11 = new Float(f8);
        E0 e02 = f13114j;
        l4.c cVar = e02.a;
        AbstractC1343r abstractC1343r = (AbstractC1343r) cVar.f(f11);
        if (abstractC1343r == null) {
            abstractC1343r = ((AbstractC1343r) cVar.f(f9)).c();
        }
        AbstractC1343r abstractC1343r2 = abstractC1343r;
        Object d6 = d(new C1336m(e02, f9, abstractC1343r2, 56), new o0(interfaceC1334l, e02, f9, f10, abstractC1343r2), Long.MIN_VALUE, new C0745c0(1, eVar), iVar);
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (d6 != enumC0927a) {
            d6 = yVar;
        }
        return d6 == enumC0927a ? d6 : yVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(3:(1:(1:11)(2:54|55))(1:56)|12|13)(8:57|(11:67|68|69|70|71|72|73|74|(2:76|(1:78)(2:81|82))(1:83)|(1:80)|29)(7:59|60|61|62|15|16|(7:18|19|20|21|22|23|(1:34)(2:25|(2:31|32)(1:27)))(2:48|49))|66|39|(1:41)|42|(1:46)|47)|14|15|16|(0)(0)))|92|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0183, code lost:
    
        if (T.r.w(r9.o()).a(r9, r5) == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        if (T.r.w(r9.o()).a(r9, new P2.r(r5, 7)) == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018d, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120 A[Catch: CancellationException -> 0x018c, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x018c, blocks: (B:16:0x010b, B:18:0x0120), top: B:15:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v5, types: [m4.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(n.C1336m r23, n.InterfaceC1326h r24, long r25, final l4.c r27, d4.c r28) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.AbstractC1318d.d(n.m, n.h, long, l4.c, d4.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(float f6, float f7, InterfaceC1334l interfaceC1334l, l4.e eVar, d4.i iVar, int i6) {
        if ((i6 & 8) != 0) {
            interfaceC1334l = r(S.l.f7374V, S.l.f7374V, null, 7);
        }
        return c(f6, f7, S.l.f7374V, interfaceC1334l, eVar, iVar);
    }

    public static final Object f(C1336m c1336m, C1347v c1347v, boolean z5, l4.c cVar, d4.c cVar2) {
        Object d6 = d(c1336m, new C1346u(c1347v, c1336m.f13185c, c1336m.f13186e.getValue(), c1336m.f13187f), z5 ? c1336m.f13188g : Long.MIN_VALUE, cVar, cVar2);
        return d6 == EnumC0927a.f11114c ? d6 : X3.y.a;
    }

    public static final C1297F g(C1300I c1300i, float f6, float f7, C1296E c1296e, String str, C0626q c0626q, int i6, int i7) {
        Float valueOf = Float.valueOf(f6);
        Float valueOf2 = Float.valueOf(f7);
        int i8 = (i6 & 1022) | SharedConstants.DefaultBufferSize | ((i6 << 3) & 458752);
        Object P5 = c0626q.P();
        Object obj = C0616l.a;
        if (P5 == obj) {
            P5 = new C1297F(c1300i, valueOf, valueOf2, c1296e);
            c0626q.m0(P5);
        }
        C1297F c1297f = (C1297F) P5;
        boolean z5 = true;
        boolean z6 = (((i8 & 112) ^ 48) > 32 && c0626q.h(valueOf)) || (i8 & 48) == 32;
        if ((((i8 & 896) ^ 384) <= 256 || !c0626q.h(valueOf2)) && (i8 & 384) != 256) {
            z5 = false;
        }
        boolean h3 = z6 | z5 | c0626q.h(c1296e);
        Object P6 = c0626q.P();
        if (h3 || P6 == obj) {
            Object j02 = new P2.J0(valueOf, c1297f, valueOf2, c1296e, 8);
            c0626q.m0(j02);
            P6 = j02;
        }
        T.r.j((InterfaceC1193a) P6, c0626q);
        boolean h6 = c0626q.h(c1300i);
        Object P7 = c0626q.P();
        if (h6 || P7 == obj) {
            P7 = new Z2.X(4, c1300i, c1297f);
            c0626q.m0(P7);
        }
        T.r.d(c1297f, (l4.c) P7, c0626q);
        return c1297f;
    }

    public static final Object h(C1336m c1336m, Float f6, InterfaceC1334l interfaceC1334l, boolean z5, l4.c cVar, d4.c cVar2) {
        Object d6 = d(c1336m, new o0(interfaceC1334l, c1336m.f13185c, c1336m.f13186e.getValue(), f6, c1336m.f13187f), z5 ? c1336m.f13188g : Long.MIN_VALUE, cVar, cVar2);
        return d6 == EnumC0927a.f11114c ? d6 : X3.y.a;
    }

    public static /* synthetic */ Object i(C1336m c1336m, Float f6, C1327h0 c1327h0, boolean z5, l4.c cVar, d4.c cVar2, int i6) {
        if ((i6 & 2) != 0) {
            c1327h0 = r(S.l.f7374V, S.l.f7374V, null, 7);
        }
        C1327h0 c1327h02 = c1327h0;
        if ((i6 & 8) != 0) {
            cVar = new C0990m(4);
        }
        return h(c1336m, f6, c1327h02, z5, cVar, cVar2);
    }

    public static final float j(C1347v c1347v, float f6, float f7) {
        InterfaceC1293B interfaceC1293B = c1347v.a;
        C1338n c1338n = new C1338n(S.l.f7374V);
        int b5 = c1338n.b();
        int i6 = 0;
        while (i6 < b5) {
            c1338n.e(interfaceC1293B.n(i6 == 0 ? f6 : 0.0f, i6 == 0 ? f7 : 0.0f), i6);
            i6++;
        }
        return c1338n.a;
    }

    public static final AbstractC1343r k(AbstractC1343r abstractC1343r) {
        AbstractC1343r c6 = abstractC1343r.c();
        int b5 = c6.b();
        for (int i6 = 0; i6 < b5; i6++) {
            c6.e(abstractC1343r.a(i6), i6);
        }
        return c6;
    }

    public static C1336m l(C1336m c1336m, float f6, float f7, int i6) {
        if ((i6 & 1) != 0) {
            f6 = ((Number) c1336m.f13186e.getValue()).floatValue();
        }
        if ((i6 & 2) != 0) {
            f7 = ((C1338n) c1336m.f13187f).a;
        }
        return new C1336m(c1336m.f13185c, Float.valueOf(f6), new C1338n(f7), c1336m.f13188g, c1336m.f13189h, c1336m.f13190i);
    }

    public static final void m(C1332k c1332k, long j3, float f6, InterfaceC1326h interfaceC1326h, C1336m c1336m, l4.c cVar) {
        long b5 = f6 == S.l.f7374V ? interfaceC1326h.b() : ((float) (j3 - c1332k.f13169c)) / f6;
        c1332k.f13173g = j3;
        c1332k.f13171e.setValue(interfaceC1326h.f(b5));
        c1332k.f13172f = interfaceC1326h.d(b5);
        if (interfaceC1326h.e(b5)) {
            c1332k.f13174h = c1332k.f13173g;
            c1332k.f13175i.setValue(Boolean.FALSE);
        }
        t(c1332k, c1336m);
        cVar.f(c1332k);
    }

    public static final float n(InterfaceC0910h interfaceC0910h) {
        InterfaceC1042s interfaceC1042s = (InterfaceC1042s) interfaceC0910h.r(C1026c.f11801s);
        float E5 = interfaceC1042s != null ? interfaceC1042s.E() : 1.0f;
        if (E5 >= S.l.f7374V) {
            return E5;
        }
        AbstractC1309S.b("negative scale factor");
        return E5;
    }

    public static C1296E o(InterfaceC1348w interfaceC1348w, EnumC1310T enumC1310T, int i6) {
        if ((i6 & 2) != 0) {
            enumC1310T = EnumC1310T.f13041c;
        }
        return new C1296E(interfaceC1348w, enumC1310T, 0);
    }

    public static final C1300I p(String str, C0626q c0626q, int i6) {
        Object P5 = c0626q.P();
        if (P5 == C0616l.a) {
            P5 = new C1300I();
            c0626q.m0(P5);
        }
        C1300I c1300i = (C1300I) P5;
        c1300i.a(0, c0626q);
        return c1300i;
    }

    public static C1323f0 q() {
        return new C1323f0(0);
    }

    public static C1327h0 r(float f6, float f7, Object obj, int i6) {
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i6 & 2) != 0) {
            f7 = 1500.0f;
        }
        if ((i6 & 4) != 0) {
            obj = null;
        }
        return new C1327h0(f6, f7, obj);
    }

    public static D0 s(int i6, int i7, InterfaceC1349x interfaceC1349x) {
        if ((i7 & 1) != 0) {
            i6 = 300;
        }
        int i8 = (i7 & 2) != 0 ? 0 : 90;
        if ((i7 & 4) != 0) {
            interfaceC1349x = AbstractC1350y.a;
        }
        return new D0(i6, i8, interfaceC1349x);
    }

    public static final void t(C1332k c1332k, C1336m c1336m) {
        c1336m.f13186e.setValue(c1332k.f13171e.getValue());
        AbstractC1343r abstractC1343r = c1336m.f13187f;
        AbstractC1343r abstractC1343r2 = c1332k.f13172f;
        int b5 = abstractC1343r.b();
        for (int i6 = 0; i6 < b5; i6++) {
            abstractC1343r.e(abstractC1343r2.a(i6), i6);
        }
        c1336m.f13189h = c1332k.f13174h;
        c1336m.f13188g = c1332k.f13173g;
        c1336m.f13190i = ((Boolean) c1332k.f13175i.getValue()).booleanValue();
    }
}
