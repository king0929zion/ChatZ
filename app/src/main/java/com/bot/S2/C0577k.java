package S2;

import S0.C0542d;
import S0.C0551m;
import d1.C0934a;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import o0.C1389K;

/* renamed from: S2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577k {
    public static void a(C0542d c0542d, X x5, long j3, long j4, long j5, long j6, long j7, l4.c cVar) {
        int h3;
        AbstractC1276k.f(x5, "element");
        if (x5 instanceof V) {
            c0542d.e(((V) x5).a);
            return;
        }
        if (x5 instanceof A) {
            h3 = c0542d.h(new S0.G(0L, 0L, W0.k.f8836j, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65531));
            try {
                c(c0542d, ((A) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        if (x5 instanceof M) {
            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, new W0.i(1), (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65527));
            try {
                c(c0542d, ((M) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        if (x5 instanceof Q) {
            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, d1.l.f11395d, (C1389K) null, 61439));
            try {
                c(c0542d, ((Q) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        if (x5 instanceof S) {
            long j8 = e1.o.f11580c;
            if (!e1.o.a(j7, j8)) {
                s4.j.j(j7);
                j8 = s4.j.B(e1.o.c(j7) * 0.75f, j7 & 1095216660480L);
            }
            h3 = c0542d.h(new S0.G(0L, j8, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, new C0934a(-0.5f), (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65277));
            try {
                c(c0542d, ((S) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        if (x5 instanceof T) {
            long j9 = e1.o.f11580c;
            if (!e1.o.a(j7, j9)) {
                s4.j.j(j7);
                j9 = s4.j.B(e1.o.c(j7) * 0.75f, j7 & 1095216660480L);
            }
            h3 = c0542d.h(new S0.G(0L, j9, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, new C0934a(0.5f), (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65277));
            try {
                c(c0542d, ((T) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        if (x5 instanceof D) {
            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, j6, (d1.l) null, (C1389K) null, 63487));
            try {
                c(c0542d, ((D) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        boolean z5 = x5 instanceof G;
        d1.l lVar = d1.l.f11394c;
        if (z5) {
            C0574i0 c0574i0 = ((G) x5).f7700b;
            d1.l lVar2 = c0574i0.f7787f ? lVar : null;
            Float f6 = c0574i0.f7785d;
            long B5 = f6 != null ? s4.j.B(f6.floatValue(), 4294967296L) : e1.o.f11580c;
            o0.s sVar = c0574i0.a;
            long j10 = sVar != null ? sVar.a : o0.s.f13481h;
            o0.s sVar2 = c0574i0.f7783b;
            h3 = c0542d.h(new S0.G(j10, B5, c0574i0.f7784c, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, sVar2 != null ? sVar2.a : o0.s.f13481h, lVar2, (C1389K) null, 59384));
            try {
                c(c0542d, ((G) x5).a, j3, j4, j5, j6, j7, cVar);
                return;
            } finally {
            }
        }
        boolean z6 = x5 instanceof I;
        W0.m mVar = W0.p.f8844c;
        if (z6) {
            h3 = c0542d.h(new S0.G(j3, s4.j.z(15), W0.k.f8835i, (W0.i) null, (W0.j) null, mVar, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65496));
            try {
                c0542d.e(((I) x5).a);
                return;
            } finally {
            }
        }
        if (x5 instanceof N) {
            int g3 = c0542d.g(new C0551m(((N) x5).f7724b, null, 6));
            try {
                h3 = c0542d.h(new S0.G(j4, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, lVar, (C1389K) null, 61438));
                try {
                    c0542d.e(((N) x5).a);
                    return;
                } finally {
                }
            } finally {
                c0542d.f(g3);
            }
        }
        if (!(x5 instanceof H)) {
            if (!(x5 instanceof L)) {
                c0542d.e(x5.toString());
                return;
            }
            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, mVar, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, j5, (d1.l) null, (C1389K) null, 63455));
            try {
                c0542d.e(((L) x5).a);
                return;
            } finally {
            }
        }
        h3 = c0542d.h(new S0.G(o0.s.f13476c, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
        try {
            c0542d.e("[图片: " + ((H) x5).a + "]");
        } finally {
        }
    }

    public static void b(C0542d c0542d, List list, long j3, long j4, long j5, long j6, l4.c cVar, int i6) {
        long j7 = (i6 & 2) != 0 ? o0.s.f13476c : j3;
        long j8 = o0.s.f13480g;
        AbstractC1276k.f(list, "elements");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(c0542d, (X) it.next(), j7, j4, j8, j5, j6, cVar);
        }
    }

    public static void c(C0542d c0542d, String str, long j3, long j4, long j5, long j6, long j7, l4.c cVar) {
        int h3;
        l4.c cVar2 = cVar;
        for (X x5 : (List) cVar2.f(str)) {
            if (x5 instanceof V) {
                c0542d.e(((V) x5).a);
            } else {
                boolean z5 = x5 instanceof I;
                W0.m mVar = W0.p.f8844c;
                if (z5) {
                    h3 = c0542d.h(new S0.G(j3, s4.j.z(15), W0.k.f8835i, (W0.i) null, (W0.j) null, mVar, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65496));
                    try {
                        c0542d.e(((I) x5).a);
                        c0542d.f(h3);
                    } finally {
                    }
                } else {
                    boolean z6 = x5 instanceof N;
                    d1.l lVar = d1.l.f11394c;
                    if (z6) {
                        int g3 = c0542d.g(new C0551m(((N) x5).f7724b, null, 6));
                        try {
                            h3 = c0542d.h(new S0.G(j4, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, lVar, (C1389K) null, 61438));
                            try {
                                c0542d.e(((N) x5).a);
                                c0542d.f(h3);
                            } finally {
                            }
                        } finally {
                            c0542d.f(g3);
                        }
                    } else if (x5 instanceof A) {
                        h3 = c0542d.h(new S0.G(0L, 0L, W0.k.f8837k, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65531));
                        try {
                            c0542d.e(((A) x5).a);
                        } finally {
                        }
                    } else if (x5 instanceof M) {
                        h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, new W0.i(1), (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65527));
                        try {
                            c0542d.e(((M) x5).a);
                        } finally {
                        }
                    } else {
                        if (x5 instanceof Q) {
                            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, d1.l.f11395d, (C1389K) null, 61439));
                            try {
                                c(c0542d, ((Q) x5).a, j3, j4, j5, j6, j7, cVar2);
                                c0542d.f(h3);
                            } finally {
                            }
                        } else if (x5 instanceof S) {
                            long j8 = e1.o.f11580c;
                            if (!e1.o.a(j7, j8)) {
                                s4.j.j(j7);
                                j8 = s4.j.B(e1.o.c(j7) * 0.75f, j7 & 1095216660480L);
                            }
                            h3 = c0542d.h(new S0.G(0L, j8, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, new C0934a(-0.5f), (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65277));
                            try {
                                c(c0542d, ((S) x5).a, j3, j4, j5, j6, j7, cVar);
                                c0542d.f(h3);
                            } finally {
                            }
                        } else if (x5 instanceof T) {
                            long j9 = e1.o.f11580c;
                            if (!e1.o.a(j7, j9)) {
                                s4.j.j(j7);
                                j9 = s4.j.B(e1.o.c(j7) * 0.75f, j7 & 1095216660480L);
                            }
                            h3 = c0542d.h(new S0.G(0L, j9, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, new C0934a(0.5f), (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65277));
                            try {
                                c(c0542d, ((T) x5).a, j3, j4, j5, j6, j7, cVar);
                                c0542d.f(h3);
                            } finally {
                            }
                        } else if (x5 instanceof D) {
                            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, j6, (d1.l) null, (C1389K) null, 63487));
                            try {
                                c(c0542d, ((D) x5).a, j3, j4, j5, j6, j7, cVar);
                                c0542d.f(h3);
                            } finally {
                            }
                        } else if (x5 instanceof L) {
                            h3 = c0542d.h(new S0.G(0L, 0L, (W0.k) null, (W0.i) null, (W0.j) null, mVar, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, j5, (d1.l) null, (C1389K) null, 63455));
                            try {
                                c0542d.e(((L) x5).a);
                                c0542d.f(h3);
                            } finally {
                            }
                        } else if (x5 instanceof G) {
                            C0574i0 c0574i0 = ((G) x5).f7700b;
                            d1.l lVar2 = c0574i0.f7787f ? lVar : null;
                            Float f6 = c0574i0.f7785d;
                            long B5 = f6 != null ? s4.j.B(f6.floatValue(), 4294967296L) : e1.o.f11580c;
                            o0.s sVar = c0574i0.a;
                            long j10 = sVar != null ? sVar.a : o0.s.f13481h;
                            o0.s sVar2 = c0574i0.f7783b;
                            h3 = c0542d.h(new S0.G(j10, B5, c0574i0.f7784c, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, sVar2 != null ? sVar2.a : o0.s.f13481h, lVar2, (C1389K) null, 59384));
                            try {
                                c(c0542d, ((G) x5).a, j3, j4, j5, j6, j7, cVar);
                                c0542d.f(h3);
                            } finally {
                            }
                        } else {
                            c0542d.e(x5.toString());
                        }
                        cVar2 = cVar;
                    }
                }
            }
        }
    }
}
