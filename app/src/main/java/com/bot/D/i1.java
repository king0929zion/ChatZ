package D;

import B0.AbstractC0047x;
import B0.InterfaceC0045v;
import I0.AbstractC0204q0;
import I0.C0172a0;
import S0.AbstractC0552n;
import S0.C0541c;
import S0.C0542d;
import S0.C0543e;
import S0.C0545g;
import T.C0601d0;
import T.C0607g0;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0996s;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.InterfaceC1193a;
import p.AbstractC1464z;
import t.C1682j;
import v.AbstractC1806l;

/* loaded from: classes.dex */
public final class i1 {
    public final C0607g0 a = T.r.A(null);

    /* renamed from: b, reason: collision with root package name */
    public C0545g f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final C0996s f1039c;

    public i1(C0545g c0545g) {
        A2.a aVar = new A2.a(13);
        c0545g.getClass();
        C0542d c0542d = new C0542d(c0545g);
        ArrayList arrayList = c0542d.f7625f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            List list = (List) aVar.f(((C0541c) arrayList.get(i6)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                C0543e c0543e = (C0543e) list.get(i7);
                arrayList3.add(new C0541c(c0543e.a, c0543e.f7626b, c0543e.f7627c, c0543e.f7628d));
            }
            Y3.r.c0(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f1038b = c0542d.i();
        this.f1039c = new C0996s();
    }

    public static C0543e c(C0543e c0543e, S0.L l3) {
        int c6 = l3.f7599b.c(r3.f7652f - 1, false);
        if (c0543e.f7626b < c6) {
            return C0543e.a(c0543e, null, Math.min(c0543e.f7627c, c6), 11);
        }
        return null;
    }

    public final void a(int i6, C0626q c0626q) {
        char c6;
        c0626q.d0(1154651354);
        char c7 = 2;
        int i7 = (c0626q.h(this) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            Object obj = (C0172a0) c0626q.j(AbstractC0204q0.f2368r);
            C0545g c0545g = this.f1038b;
            List a = c0545g.a(c0545g.f7630e.length());
            int size = a.size();
            int i8 = 0;
            while (i8 < size) {
                C0543e c0543e = (C0543e) a.get(i8);
                int i9 = c0543e.f7626b;
                Object obj2 = c0543e.a;
                if (i9 != c0543e.f7627c) {
                    c0626q.b0(725478935);
                    Object P5 = c0626q.P();
                    Object obj3 = C0616l.a;
                    if (P5 == obj3) {
                        P5 = new C1682j();
                        c0626q.m0(P5);
                    }
                    C1682j c1682j = (C1682j) P5;
                    c6 = c7;
                    InterfaceC1041r o5 = o0.y.o(C1038o.a, new C0086p(5, this, c0543e));
                    Object P6 = c0626q.P();
                    if (P6 == obj3) {
                        P6 = new A2.a(14);
                        c0626q.m0(P6);
                    }
                    InterfaceC1041r o6 = AbstractC1464z.o(P0.n.a(o5, false, (l4.c) P6).c(new l1(new f1(this, c0543e))), c1682j);
                    InterfaceC0045v.a.getClass();
                    InterfaceC1041r g3 = AbstractC0047x.g(o6, AbstractC0047x.f480c);
                    boolean h3 = c0626q.h(this) | c0626q.f(c0543e) | c0626q.h(obj);
                    Object P7 = c0626q.P();
                    if (h3 || P7 == obj3) {
                        P7 = new A.g(this, c0543e, obj, 1);
                        c0626q.m0(P7);
                    }
                    AbstractC1806l.a(AbstractC1464z.l(g3, c1682j, (InterfaceC1193a) P7), c0626q, 0);
                    AbstractC0552n abstractC0552n = (AbstractC0552n) obj2;
                    S0.M a6 = abstractC0552n.a();
                    if (a6 == null || (a6.a == null && a6.f7604b == null && a6.f7605c == null && a6.f7606d == null)) {
                        c0626q.b0(716130110);
                    } else {
                        c0626q.b0(726303039);
                        Object P8 = c0626q.P();
                        if (P8 == obj3) {
                            P8 = new C0100w0(c1682j);
                            c0626q.m0(P8);
                        }
                        C0100w0 c0100w0 = (C0100w0) P8;
                        Object P9 = c0626q.P();
                        if (P9 == obj3) {
                            P9 = new g1(c0100w0, null);
                            c0626q.m0(P9);
                        }
                        T.r.f(c0626q, X3.y.a, (l4.e) P9);
                        C0601d0 c0601d0 = c0100w0.f1223b;
                        C0601d0 c0601d02 = c0100w0.f1223b;
                        Boolean valueOf = Boolean.valueOf((c0601d0.g() & 2) != 0);
                        Boolean valueOf2 = Boolean.valueOf((c0601d02.g() & 1) != 0);
                        Boolean valueOf3 = Boolean.valueOf((c0601d02.g() & 4) != 0);
                        S0.M a7 = abstractC0552n.a();
                        S0.G g6 = a7 != null ? a7.a : null;
                        S0.M a8 = abstractC0552n.a();
                        S0.G g7 = a8 != null ? a8.f7604b : null;
                        S0.M a9 = abstractC0552n.a();
                        S0.G g8 = a9 != null ? a9.f7605c : null;
                        S0.M a10 = abstractC0552n.a();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, g6, g7, g8, a10 != null ? a10.f7606d : null};
                        boolean h6 = c0626q.h(this) | c0626q.f(c0543e);
                        Object P10 = c0626q.P();
                        if (h6 || P10 == obj3) {
                            P10 = new C0086p(this, c0543e, c0100w0, 4);
                            c0626q.m0(P10);
                        }
                        b(objArr, (l4.c) P10, c0626q, (i7 << 6) & 896);
                    }
                    c0626q.p(false);
                } else {
                    c6 = c7;
                    c0626q.b0(716130110);
                }
                c0626q.p(false);
                i8++;
                c7 = c6;
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new B4.D(i6, 4, this);
        }
    }

    public final void b(Object[] objArr, l4.c cVar, C0626q c0626q, int i6) {
        c0626q.d0(-2083052099);
        int i7 = (i6 & 48) == 0 ? (c0626q.h(cVar) ? 32 : 16) | i6 : i6;
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(this) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        c0626q.Z(-358306546, Integer.valueOf(objArr.length));
        int i8 = i7 | (c0626q.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i8 |= c0626q.h(obj) ? 4 : 0;
        }
        c0626q.p(false);
        if ((i8 & 14) == 0) {
            i8 |= 2;
        }
        if (c0626q.S(i8 & 1, (i8 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cVar);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h3 = c0626q.h(this) | ((i8 & 112) == 32);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new A(this, cVar, 1);
                c0626q.m0(P5);
            }
            T.r.e(array, (l4.c) P5, c0626q);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(this, objArr, cVar, i6, 0);
        }
    }
}
