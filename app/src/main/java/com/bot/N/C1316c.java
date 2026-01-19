package n;

import T.C0607g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i4.AbstractC1117a;
import m4.AbstractC1276k;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316c {
    public final E0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13092b;

    /* renamed from: c, reason: collision with root package name */
    public final C1336m f13093c;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f13094d;

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f13095e;

    /* renamed from: f, reason: collision with root package name */
    public final C1308Q f13096f;

    /* renamed from: g, reason: collision with root package name */
    public final C1327h0 f13097g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1343r f13098h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1343r f13099i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1343r f13100j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1343r f13101k;

    public C1316c(Object obj, E0 e02, Object obj2) {
        AbstractC1343r abstractC1343r;
        AbstractC1343r abstractC1343r2;
        this.a = e02;
        this.f13092b = obj2;
        C1336m c1336m = new C1336m(e02, obj, null, 60);
        this.f13093c = c1336m;
        this.f13094d = T.r.A(Boolean.FALSE);
        this.f13095e = T.r.A(obj);
        this.f13096f = new C1308Q();
        this.f13097g = new C1327h0(obj2);
        AbstractC1343r abstractC1343r3 = c1336m.f13187f;
        boolean z5 = abstractC1343r3 instanceof C1338n;
        if (z5) {
            abstractC1343r = AbstractC1318d.f13109e;
        } else if (abstractC1343r3 instanceof C1340o) {
            abstractC1343r = AbstractC1318d.f13110f;
        } else {
            abstractC1343r = abstractC1343r3 instanceof C1341p ? AbstractC1318d.f13111g : AbstractC1318d.f13112h;
        }
        this.f13098h = abstractC1343r;
        if (z5) {
            abstractC1343r2 = AbstractC1318d.a;
        } else if (abstractC1343r3 instanceof C1340o) {
            abstractC1343r2 = AbstractC1318d.f13106b;
        } else {
            abstractC1343r2 = abstractC1343r3 instanceof C1341p ? AbstractC1318d.f13107c : AbstractC1318d.f13108d;
        }
        this.f13099i = abstractC1343r2;
        this.f13100j = abstractC1343r;
        this.f13101k = abstractC1343r2;
    }

    public static final Object a(C1316c c1316c, Object obj) {
        E0 e02 = c1316c.a;
        AbstractC1343r abstractC1343r = c1316c.f13101k;
        AbstractC1343r abstractC1343r2 = c1316c.f13100j;
        if (!AbstractC1276k.b(abstractC1343r2, c1316c.f13098h) || !AbstractC1276k.b(abstractC1343r, c1316c.f13099i)) {
            AbstractC1343r abstractC1343r3 = (AbstractC1343r) e02.a.f(obj);
            int b5 = abstractC1343r3.b();
            boolean z5 = false;
            for (int i6 = 0; i6 < b5; i6++) {
                if (abstractC1343r3.a(i6) < abstractC1343r2.a(i6) || abstractC1343r3.a(i6) > abstractC1343r.a(i6)) {
                    abstractC1343r3.e(AbstractC1117a.e(abstractC1343r3.a(i6), abstractC1343r2.a(i6), abstractC1343r.a(i6)), i6);
                    z5 = true;
                }
            }
            if (z5) {
                return e02.f12988b.f(abstractC1343r3);
            }
        }
        return obj;
    }

    public static final void b(C1316c c1316c) {
        C1336m c1336m = c1316c.f13093c;
        c1336m.f13187f.d();
        c1336m.f13188g = Long.MIN_VALUE;
        c1316c.f13094d.setValue(Boolean.FALSE);
    }

    public static Object c(C1316c c1316c, Object obj, InterfaceC1334l interfaceC1334l, l4.c cVar, InterfaceC0905c interfaceC0905c, int i6) {
        if ((i6 & 2) != 0) {
            interfaceC1334l = c1316c.f13097g;
        }
        InterfaceC1334l interfaceC1334l2 = interfaceC1334l;
        Object f6 = c1316c.a.f12988b.f(c1316c.f13093c.f13187f);
        if ((i6 & 8) != 0) {
            cVar = null;
        }
        l4.c cVar2 = cVar;
        Object d6 = c1316c.d();
        E0 e02 = c1316c.a;
        return C1308Q.a(c1316c.f13096f, new C1312a(c1316c, f6, new o0(interfaceC1334l2, e02, d6, obj, (AbstractC1343r) e02.a.f(f6)), c1316c.f13093c.f13188g, cVar2, null), interfaceC0905c);
    }

    public final Object d() {
        return this.f13093c.f13186e.getValue();
    }

    public final Object e(InterfaceC0905c interfaceC0905c, Object obj) {
        Object a = C1308Q.a(this.f13096f, new C1314b(this, obj, null), interfaceC0905c);
        return a == EnumC0927a.f11114c ? a : X3.y.a;
    }

    public final Object f(d4.i iVar) {
        Object a = C1308Q.a(this.f13096f, new O.F0(this, null, 4), iVar);
        return a == EnumC0927a.f11114c ? a : X3.y.a;
    }

    public /* synthetic */ C1316c(Object obj, E0 e02, Object obj2, int i6) {
        this(obj, e02, (i6 & 4) != 0 ? null : obj2);
    }
}
