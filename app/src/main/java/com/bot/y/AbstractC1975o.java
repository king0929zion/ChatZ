package y;

import D.C0072i;
import F0.AbstractC0137z;
import N1.C0290l;
import O.C0316k;
import Q.C0398c;
import T.AbstractC0623o0;
import T.C0602e;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.e1;
import Z2.C0741a0;
import Z2.C0789z;
import Z2.L0;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e0.InterfaceC0958c;
import f0.AbstractC0983f;
import f0.AbstractC0997t;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import l4.InterfaceC1193a;
import r.C1609u;
import r.X0;
import u.AbstractC1734b;

/* renamed from: y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1975o {
    public static final C1948E[] a = new C1948E[0];

    /* renamed from: b, reason: collision with root package name */
    public static final H0.C f15905b = new H0.C(7);

    public static final void a(final InterfaceC1193a interfaceC1193a, final InterfaceC1041r interfaceC1041r, final b0 b0Var, final T t5, C0626q c0626q, final int i6) {
        c0626q.d0(1055276397);
        int i7 = (c0626q.h(interfaceC1193a) ? 4 : 2) | i6 | (c0626q.f(interfaceC1041r) ? 32 : 16) | (c0626q.f(b0Var) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.f(t5) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1171) != 1170)) {
            final T.X E5 = T.r.E(interfaceC1193a, c0626q);
            c(AbstractC0874g.c(-933153643, new l4.f() { // from class: y.Q
                @Override // l4.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    InterfaceC1041r c6;
                    InterfaceC0958c interfaceC0958c = (InterfaceC0958c) obj;
                    C0626q c0626q2 = (C0626q) obj2;
                    ((Integer) obj3).getClass();
                    Object P5 = c0626q2.P();
                    C0602e c0602e = C0616l.a;
                    if (P5 == c0602e) {
                        P5 = new C1956M(interfaceC0958c, new C1958O(E5, 0));
                        c0626q2.m0(P5);
                    }
                    final C1956M c1956m = (C1956M) P5;
                    Object P6 = c0626q2.P();
                    if (P6 == c0602e) {
                        P6 = new F0.v0(new e0.k(c1956m));
                        c0626q2.m0(P6);
                    }
                    final F0.v0 v0Var = (F0.v0) P6;
                    final b0 b0Var2 = b0.this;
                    if (b0Var2 != null) {
                        c0626q2.b0(1743490539);
                        c0626q2.b0(887527095);
                        final r0 r0Var = t0.a;
                        if (r0Var != null) {
                            c0626q2.b0(1345554384);
                            c0626q2.p(false);
                        } else {
                            c0626q2.b0(1345603457);
                            View view = (View) c0626q2.j(AndroidCompositionLocals_androidKt.f10784f);
                            boolean f6 = c0626q2.f(view);
                            Object P7 = c0626q2.P();
                            if (f6 || P7 == c0602e) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                P7 = tag instanceof r0 ? (r0) tag : null;
                                if (P7 == null) {
                                    P7 = new ViewOnAttachStateChangeListenerC1962b(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, P7);
                                }
                                c0626q2.m0(P7);
                            }
                            r0Var = (r0) P7;
                            c0626q2.p(false);
                        }
                        c0626q2.p(false);
                        Object[] objArr = {b0Var2, c1956m, v0Var, r0Var};
                        boolean f7 = c0626q2.f(b0Var2) | c0626q2.h(c1956m) | c0626q2.h(v0Var) | c0626q2.h(r0Var);
                        Object P8 = c0626q2.P();
                        if (f7 || P8 == c0602e) {
                            P8 = new l4.c() { // from class: y.P
                                @Override // l4.c
                                public final Object f(Object obj4) {
                                    C0290l c0290l = new C0290l(c1956m, v0Var, r0Var);
                                    b0 b0Var3 = b0.this;
                                    b0Var3.f15838c = c0290l;
                                    return new D.Y(b0Var3, 15);
                                }
                            };
                            c0626q2.m0(P8);
                        }
                        T.r.e(objArr, (l4.c) P8, c0626q2);
                    } else {
                        c0626q2.b0(1737291469);
                    }
                    c0626q2.p(false);
                    int i8 = c0.a;
                    InterfaceC1041r interfaceC1041r2 = interfaceC1041r;
                    if (b0Var2 != null && (c6 = interfaceC1041r2.c(new w0(b0Var2))) != null) {
                        interfaceC1041r2 = c6;
                    }
                    boolean f8 = c0626q2.f(c1956m);
                    T t6 = t5;
                    boolean f9 = f8 | c0626q2.f(t6);
                    Object P9 = c0626q2.P();
                    if (f9 || P9 == c0602e) {
                        P9 = new I.m(27, c1956m, t6);
                        c0626q2.m0(P9);
                    }
                    AbstractC0137z.a(v0Var, interfaceC1041r2, (l4.e) P9, c0626q2, 8);
                    return X3.y.a;
                }
            }, c0626q), c0626q, 6);
        } else {
            c0626q.V();
        }
        C0627q0 t6 = c0626q.t();
        if (t6 != null) {
            t6.f8193d = new l4.e(interfaceC1041r, b0Var, t5, i6) { // from class: y.S

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f15810e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ b0 f15811f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ T f15812g;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(1);
                    AbstractC1975o.a(InterfaceC1193a.this, this.f15810e, this.f15811f, this.f15812g, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void b(Object obj, int i6, Y y5, C0873f c0873f, C0626q c0626q, int i7) {
        int i8;
        c0626q.d0(872548579);
        if ((i7 & 6) == 0) {
            i8 = (c0626q.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0626q.d(i6) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0626q.h(y5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0626q.h(c0873f) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if (c0626q.S(i8 & 1, (i8 & 1171) != 1170)) {
            boolean f6 = c0626q.f(obj) | c0626q.f(y5);
            Object P5 = c0626q.P();
            Object obj2 = C0616l.a;
            if (f6 || P5 == obj2) {
                P5 = new X(obj, y5);
                c0626q.m0(P5);
            }
            X x5 = (X) P5;
            x5.f15820c = i6;
            C0607g0 c0607g0 = x5.f15824g;
            AbstractC0623o0 abstractC0623o0 = F0.i0.a;
            X x6 = (X) c0626q.j(abstractC0623o0);
            AbstractC0983f e6 = AbstractC0997t.e();
            l4.c e7 = e6 != null ? e6.e() : null;
            AbstractC0983f h3 = AbstractC0997t.h(e6);
            try {
                if (x6 != ((X) c0607g0.getValue())) {
                    c0607g0.setValue(x6);
                    if (x5.f15821d > 0) {
                        X x7 = x5.f15822e;
                        if (x7 != null) {
                            x7.b();
                        }
                        if (x6 != null) {
                            x6.a();
                        } else {
                            x6 = null;
                        }
                        x5.f15822e = x6;
                    }
                }
                AbstractC0997t.k(e6, h3, e7);
                boolean f7 = c0626q.f(x5);
                Object P6 = c0626q.P();
                if (f7 || P6 == obj2) {
                    P6 = new W0.e(x5, 18);
                    c0626q.m0(P6);
                }
                T.r.d(x5, (l4.c) P6, c0626q);
                T.r.a(abstractC0623o0.a(x5), c0873f, c0626q, ((i8 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC0997t.k(e6, h3, e7);
                throw th;
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new L0(obj, i6, y5, c0873f, i7);
        }
    }

    public static final void c(C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(-709502251);
        if (c0626q.S(i6 & 1, (i6 & 3) != 2)) {
            e1 e1Var = e0.h.a;
            e0.f fVar = (e0.f) c0626q.j(e1Var);
            e0.d f6 = e0.l.f(c0626q);
            Object[] objArr = {fVar};
            e0.k kVar = new e0.k(0, new C0789z(24), new Z2.X(24, fVar, f6));
            boolean h3 = c0626q.h(fVar) | c0626q.h(f6);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0741a0(6, fVar, f6);
                c0626q.m0(P5);
            }
            o0 o0Var = (o0) e0.l.c(objArr, kVar, (InterfaceC1193a) P5, c0626q, 0);
            T.r.a(e1Var.a(o0Var), AbstractC0874g.c(-412824043, new I.m(28, c0873f, o0Var), c0626q), c0626q, 56);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0398c(c0873f, i6, 5);
        }
    }

    public static final void d(InterfaceC1957N interfaceC1957N, Object obj, int i6, Object obj2, C0626q c0626q, int i7) {
        c0626q.d0(1439843069);
        int i8 = (c0626q.f(interfaceC1957N) ? 4 : 2) | i7 | (c0626q.f(obj) ? 32 : 16) | (c0626q.d(i6) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.f(obj2) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i8 & 1, (i8 & 1171) != 1170)) {
            ((InterfaceC0958c) obj).f(obj2, AbstractC0874g.c(980966366, new C0072i(i6, obj2, interfaceC1957N), c0626q), c0626q, 48);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new D.e1(interfaceC1957N, obj, i6, obj2, i7);
        }
    }

    public static final int e(int i6, V.e eVar) {
        int i7 = eVar.f8761f - 1;
        int i8 = 0;
        while (i8 < i7) {
            int i9 = ((i7 - i8) / 2) + i8;
            Object[] objArr = eVar.f8759c;
            int i10 = ((C1969i) objArr[i9]).a;
            if (i10 != i6) {
                if (i10 < i6) {
                    i8 = i9 + 1;
                    if (i6 < ((C1969i) objArr[i8]).a) {
                    }
                } else {
                    i7 = i9 - 1;
                }
            }
            return i9;
        }
        return i8;
    }

    public static final List f(InterfaceC1957N interfaceC1957N, Y y5, C1609u c1609u) {
        r4.e eVar;
        V.e eVar2 = c1609u.a;
        if (!(eVar2.f8761f != 0) && y5.f15825c.isEmpty()) {
            return Y3.v.f9812c;
        }
        ArrayList arrayList = new ArrayList();
        if (c1609u.a.f8761f != 0) {
            int i6 = eVar2.f8761f;
            if (i6 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar2.f8759c;
            int i7 = ((C1973m) objArr[0]).a;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((C1973m) objArr[i8]).a;
                if (i9 < i7) {
                    i7 = i9;
                }
            }
            if (i7 < 0) {
                AbstractC1734b.a("negative minIndex");
            }
            int i10 = eVar2.f8761f;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar2.f8759c;
            int i11 = ((C1973m) objArr2[0]).f15892b;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = ((C1973m) objArr2[i12]).f15892b;
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            eVar = new r4.e(i7, Math.min(i11, interfaceC1957N.a() - 1), 1);
        } else {
            eVar = r4.g.f14686g;
        }
        int size = y5.f15825c.size();
        for (int i14 = 0; i14 < size; i14++) {
            X x5 = (X) y5.get(i14);
            int h3 = h(x5.f15820c, x5.a, interfaceC1957N);
            int i15 = eVar.f14679c;
            if ((h3 > eVar.f14680e || i15 > h3) && h3 >= 0 && h3 < interfaceC1957N.a()) {
                arrayList.add(Integer.valueOf(h3));
            }
        }
        int i16 = eVar.f14679c;
        int i17 = eVar.f14680e;
        if (i16 <= i17) {
            while (true) {
                arrayList.add(Integer.valueOf(i16));
                if (i16 == i17) {
                    break;
                }
                i16++;
            }
        }
        return arrayList;
    }

    public static T.X g() {
        return new C0607g0(X3.y.a, C0602e.f8080g);
    }

    public static final int h(int i6, Object obj, InterfaceC1957N interfaceC1957N) {
        int e6;
        return (obj == null || interfaceC1957N.a() == 0 || (i6 < interfaceC1957N.a() && obj.equals(interfaceC1957N.b(i6))) || (e6 = interfaceC1957N.e(obj)) == -1) ? i6 : e6;
    }

    public static final InterfaceC1041r k(InterfaceC1978s interfaceC1978s, C1609u c1609u, X0 x02) {
        return new C1974n(interfaceC1978s, c1609u, x02);
    }

    public static final InterfaceC1041r l(InterfaceC1041r interfaceC1041r, s4.c cVar, i0 i0Var, X0 x02, boolean z5) {
        return interfaceC1041r.c(new j0(cVar, i0Var, x02, z5));
    }

    public abstract C0316k i();

    public Object j(int i6) {
        Object f6;
        C1969i b5 = i().b(i6);
        int i7 = i6 - b5.a;
        l4.c key = b5.f15877c.getKey();
        return (key == null || (f6 = key.f(Integer.valueOf(i7))) == null) ? new C1967g(i6) : f6;
    }
}
