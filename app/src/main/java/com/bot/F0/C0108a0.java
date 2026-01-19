package F0;

import H0.AbstractC0157l;
import com.vladsch.flexmark.util.format.TableCell;
import e1.AbstractC0960b;
import e1.C0959a;
import f0.C0990m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k.AbstractC1168o;
import k.C1147A;
import k.C1148B;
import k.C1165l;
import l.AbstractC1180a;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.C1778B;
import v.C1779C;
import v.C1782F;
import v.C1784H;
import v.InterfaceC1797g;

/* renamed from: F0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108a0 implements V {
    public final C1784H a;

    public C0108a0(C1784H c1784h) {
        this.a = c1784h;
    }

    @Override // F0.V
    public final int a(r rVar, List list, int i6) {
        ArrayList i7 = AbstractC0157l.i(rVar);
        C1784H c1784h = this.a;
        C1782F c1782f = c1784h.f15246f;
        List list2 = (List) Y3.m.r0(i7, 1);
        U u5 = list2 != null ? (U) Y3.m.q0(list2) : null;
        List list3 = (List) Y3.m.r0(i7, 2);
        c1782f.a(u5, list3 != null ? (U) Y3.m.q0(list3) : null, AbstractC0960b.b(i6, 0, 13));
        List list4 = (List) Y3.m.q0(i7);
        if (list4 == null) {
            list4 = Y3.v.f9812c;
        }
        return C1784H.a(list4, i6, rVar.l0(c1784h.f15243c), rVar.l0(c1784h.f15245e), c1784h.f15246f);
    }

    @Override // F0.V
    public final int d(r rVar, List list, int i6) {
        ArrayList i7 = AbstractC0157l.i(rVar);
        C1784H c1784h = this.a;
        C1782F c1782f = c1784h.f15246f;
        List list2 = (List) Y3.m.r0(i7, 1);
        U u5 = list2 != null ? (U) Y3.m.q0(list2) : null;
        List list3 = (List) Y3.m.r0(i7, 2);
        c1782f.a(u5, list3 != null ? (U) Y3.m.q0(list3) : null, AbstractC0960b.b(i6, 0, 13));
        List list4 = (List) Y3.m.q0(i7);
        if (list4 == null) {
            list4 = Y3.v.f9812c;
        }
        return C1784H.a(list4, i6, rVar.l0(c1784h.f15243c), rVar.l0(c1784h.f15245e), c1784h.f15246f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.V
    public final W e(X x5, List list, long j3) {
        U u5;
        U u6;
        C1782F c1782f;
        V.e eVar;
        Iterator it;
        C1165l c1165l;
        k0 k0Var;
        C1778B c1778b;
        int i6;
        int i7;
        char c6;
        int i8;
        U u7;
        U u8;
        U u9;
        int i9;
        C1165l c1165l2;
        k0 k0Var2;
        C1165l c1165l3;
        int i10;
        C1165l c1165l4;
        int i11;
        int i12;
        Integer num;
        long a;
        long a6;
        ArrayList i13 = AbstractC0157l.i(x5);
        final C1784H c1784h = this.a;
        final C1782F c1782f2 = c1784h.f15246f;
        boolean isEmpty = i13.isEmpty();
        Y3.w wVar = Y3.w.f9813c;
        final int i14 = 0;
        if (!isEmpty) {
            if (C0959a.g(j3) != 0) {
                List list2 = (List) Y3.m.o0(i13);
                if (list2.isEmpty()) {
                    return x5.D(0, 0, wVar, new C0990m(26));
                }
                final int i15 = 1;
                List list3 = (List) Y3.m.r0(i13, 1);
                U u10 = list3 != null ? (U) Y3.m.q0(list3) : null;
                List list4 = (List) Y3.m.r0(i13, 2);
                U u11 = list4 != null ? (U) Y3.m.q0(list4) : null;
                list2.size();
                c1782f2.getClass();
                v.Y y5 = v.Y.f15277c;
                long D4 = AbstractC1787b.D(AbstractC1787b.o(AbstractC1787b.m(j3, y5), 10));
                if (u10 != null) {
                    AbstractC1787b.u(u10, c1784h, D4, new l4.c() { // from class: v.E
                        @Override // l4.c
                        public final Object f(Object obj) {
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            F0.k0 k0Var3 = (F0.k0) obj;
                            switch (i14) {
                                case 0:
                                    if (k0Var3 != null) {
                                        c1784h.getClass();
                                        i16 = k0Var3.j0();
                                        i17 = k0Var3.i0();
                                    } else {
                                        i16 = 0;
                                        i17 = 0;
                                    }
                                    new C1165l(C1165l.a(i16, i17));
                                    c1782f2.getClass();
                                    break;
                                default:
                                    if (k0Var3 != null) {
                                        c1784h.getClass();
                                        i18 = k0Var3.j0();
                                        i19 = k0Var3.i0();
                                    } else {
                                        i18 = 0;
                                        i19 = 0;
                                    }
                                    new C1165l(C1165l.a(i18, i19));
                                    c1782f2.getClass();
                                    break;
                            }
                            return X3.y.a;
                        }
                    });
                }
                if (u11 != null) {
                    AbstractC1787b.u(u11, c1784h, D4, new l4.c() { // from class: v.E
                        @Override // l4.c
                        public final Object f(Object obj) {
                            int i16;
                            int i17;
                            int i18;
                            int i19;
                            F0.k0 k0Var3 = (F0.k0) obj;
                            switch (i15) {
                                case 0:
                                    if (k0Var3 != null) {
                                        c1784h.getClass();
                                        i16 = k0Var3.j0();
                                        i17 = k0Var3.i0();
                                    } else {
                                        i16 = 0;
                                        i17 = 0;
                                    }
                                    new C1165l(C1165l.a(i16, i17));
                                    c1782f2.getClass();
                                    break;
                                default:
                                    if (k0Var3 != null) {
                                        c1784h.getClass();
                                        i18 = k0Var3.j0();
                                        i19 = k0Var3.i0();
                                    } else {
                                        i18 = 0;
                                        i19 = 0;
                                    }
                                    new C1165l(C1165l.a(i18, i19));
                                    c1782f2.getClass();
                                    break;
                            }
                            return X3.y.a;
                        }
                    });
                }
                Iterator it2 = list2.iterator();
                float f6 = c1784h.f15243c;
                float f7 = c1784h.f15245e;
                long m3 = AbstractC1787b.m(j3, y5);
                C1782F c1782f3 = c1784h.f15246f;
                V.e eVar2 = new V.e(new W[16]);
                int h3 = C0959a.h(m3);
                int j4 = C0959a.j(m3);
                int g3 = C0959a.g(m3);
                C1147A c1147a = AbstractC1168o.a;
                C1147A c1147a2 = new C1147A();
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(x5.e0(f6));
                int ceil2 = (int) Math.ceil(x5.e0(f7));
                long a7 = AbstractC0960b.a(0, h3, 0, g3);
                long D5 = AbstractC1787b.D(AbstractC1787b.o(a7, 14));
                if (it2.hasNext()) {
                    try {
                        u5 = (U) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        u5 = null;
                    }
                    u6 = u5;
                } else {
                    u6 = null;
                }
                if (u6 != null) {
                    if (AbstractC1787b.q(AbstractC1787b.p(u6)) == S.l.f7374V) {
                        AbstractC1787b.p(u6);
                        k0Var = u6.w(D5);
                        c1782f = c1782f3;
                        a6 = C1165l.a(k0Var.j0(), k0Var.i0());
                    } else {
                        c1782f = c1782f3;
                        int o5 = u6.o(TableCell.NOT_TRACKED);
                        a6 = C1165l.a(o5, u6.a0(o5));
                        k0Var = null;
                    }
                    eVar = eVar2;
                    it = it2;
                    c1165l = new C1165l(a6);
                } else {
                    c1782f = c1782f3;
                    eVar = eVar2;
                    it = it2;
                    c1165l = null;
                    k0Var = null;
                }
                Integer valueOf = c1165l != null ? Integer.valueOf((int) (c1165l.a >> 32)) : null;
                Integer valueOf2 = c1165l != null ? Integer.valueOf((int) (c1165l.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                V.e eVar3 = eVar;
                C1148B c1148b = new C1148B();
                C1779C c1779c = new C1779C(c1782f, m3, ceil, ceil2);
                C1165l c1165l5 = c1165l;
                C1778B b5 = c1779c.b(it.hasNext(), 0, C1165l.a(h3, g3), c1165l5, 0, 0, 0, false, false);
                if (b5.f15198b) {
                    c1778b = b5;
                    c1779c.a(c1778b, c1165l5 != null, -1, 0, h3, 0);
                } else {
                    c1778b = b5;
                }
                int i16 = j4;
                int i17 = g3;
                C1148B c1148b2 = c1148b;
                C1778B c1778b2 = c1778b;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                Integer num2 = valueOf2;
                Integer num3 = valueOf;
                U u12 = u6;
                int[] iArr3 = iArr2;
                k0 k0Var3 = k0Var;
                int[] iArr4 = iArr;
                int i26 = h3;
                while (!c1778b2.f15198b && u12 != null) {
                    AbstractC1276k.c(num3);
                    int intValue = num3.intValue();
                    AbstractC1276k.c(num2);
                    int intValue2 = num2.intValue();
                    int i27 = i21;
                    int i28 = i22 + intValue;
                    int max = Math.max(i18, intValue2);
                    int i29 = i26 - intValue;
                    int i30 = i19 + 1;
                    c1782f.getClass();
                    arrayList.add(u12);
                    c1147a2.i(i19, k0Var3);
                    u12.H();
                    int i31 = i30 - i23;
                    if (it.hasNext()) {
                        try {
                            u7 = (U) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            u7 = null;
                        }
                        u8 = u7;
                    } else {
                        u8 = null;
                    }
                    if (u8 != null) {
                        if (AbstractC1787b.q(AbstractC1787b.p(u8)) == S.l.f7374V) {
                            AbstractC1787b.p(u8);
                            k0 w5 = u8.w(D5);
                            a = C1165l.a(w5.j0(), w5.i0());
                            k0Var2 = w5;
                        } else {
                            int o6 = u8.o(TableCell.NOT_TRACKED);
                            a = C1165l.a(o6, u8.a0(o6));
                            k0Var2 = null;
                        }
                        u9 = u8;
                        i9 = i30;
                        c1165l2 = new C1165l(a);
                    } else {
                        u9 = u8;
                        i9 = i30;
                        c1165l2 = null;
                        k0Var2 = null;
                    }
                    Integer valueOf3 = c1165l2 != null ? Integer.valueOf(((int) (c1165l2.a >> 32)) + ceil) : null;
                    Integer valueOf4 = c1165l2 != null ? Integer.valueOf((int) (c1165l2.a & 4294967295L)) : null;
                    boolean hasNext = it.hasNext();
                    long a8 = C1165l.a(i29, i17);
                    if (c1165l2 == null) {
                        c1165l3 = c1165l2;
                        i10 = i29;
                        c1165l4 = null;
                    } else {
                        AbstractC1276k.c(valueOf3);
                        int intValue3 = valueOf3.intValue();
                        AbstractC1276k.c(valueOf4);
                        c1165l3 = c1165l2;
                        i10 = i29;
                        c1165l4 = new C1165l(C1165l.a(intValue3, valueOf4.intValue()));
                    }
                    C1778B b6 = c1779c.b(hasNext, i31, a8, c1165l4, i24, i25, max, false, false);
                    if (b6.a) {
                        int min = Math.min(Math.max(i16, i28), h3);
                        int i32 = i25 + max;
                        boolean z5 = c1165l3 != null;
                        C1779C c1779c2 = c1779c;
                        int i33 = i24;
                        c1779c2.a(b6, z5, i33, i32, i10, i31);
                        c1779c = c1779c2;
                        c1778b2 = b6;
                        int i34 = i27 + 1;
                        if (iArr3.length < i34) {
                            iArr3 = Arrays.copyOf(iArr3, Math.max(i34, (iArr3.length * 3) / 2));
                            AbstractC1276k.e(iArr3, "copyOf(...)");
                        }
                        iArr3[i27] = max;
                        i21 = i27 + 1;
                        i17 = (i17 - i32) - ceil2;
                        int i35 = i20 + 1;
                        i11 = min;
                        if (iArr4.length < i35) {
                            iArr4 = Arrays.copyOf(iArr4, Math.max(i35, (iArr4.length * 3) / 2));
                            AbstractC1276k.e(iArr4, "copyOf(...)");
                        }
                        iArr4[i20] = i9;
                        i20++;
                        num = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                        i24 = i33 + 1;
                        i25 = i32 + ceil2;
                        i23 = i9;
                        i10 = h3;
                        i12 = 0;
                        i18 = 0;
                    } else {
                        c1778b2 = b6;
                        i11 = i16;
                        i12 = i28;
                        i18 = max;
                        num = valueOf3;
                        i21 = i27;
                    }
                    num2 = valueOf4;
                    u12 = u9;
                    i19 = i9;
                    num3 = num;
                    i16 = i11;
                    i22 = i12;
                    k0Var3 = k0Var2;
                    i26 = i10;
                }
                int i36 = i21;
                int size = arrayList.size();
                k0[] k0VarArr = new k0[size];
                for (int i37 = 0; i37 < size; i37++) {
                    k0VarArr[i37] = c1147a2.b(i37);
                }
                int[] iArr5 = new int[i20];
                int[] iArr6 = new int[i20];
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                while (i39 < i20) {
                    int i41 = iArr4[i39];
                    if (i39 < 0 || i39 >= (i7 = i36)) {
                        AbstractC1180a.d("Index must be between 0 and size");
                        throw null;
                    }
                    int i42 = iArr3[i39];
                    C1148B c1148b3 = c1148b2;
                    if (c1148b3.b(i39)) {
                        i8 = i7;
                        c6 = 65535;
                    } else {
                        c6 = 65535;
                        if (C0959a.g(a7) == Integer.MAX_VALUE) {
                            i8 = i7;
                            i42 = Integer.MAX_VALUE;
                        } else {
                            i42 = C0959a.g(a7) - i40;
                            i8 = i7;
                        }
                    }
                    c1148b2 = c1148b3;
                    int i43 = i20;
                    int[] iArr7 = iArr5;
                    int i44 = i16;
                    W t5 = AbstractC1787b.t(c1784h, i44, C0959a.i(a7), C0959a.h(a7), i42, ceil, x5, arrayList, k0VarArr, i38, i41, iArr7, i39);
                    int e6 = t5.e();
                    int d6 = t5.d();
                    iArr6[i39] = d6;
                    i40 += d6;
                    int max2 = Math.max(i44, e6);
                    eVar3.b(t5);
                    i39++;
                    i16 = max2;
                    i38 = i41;
                    iArr5 = iArr7;
                    iArr4 = iArr4;
                    i20 = i43;
                    i36 = i8;
                    iArr3 = iArr3;
                }
                int[] iArr8 = iArr5;
                int i45 = 14;
                int i46 = i16;
                if (eVar3.f8761f == 0) {
                    i46 = 0;
                    i6 = 0;
                } else {
                    i6 = i40;
                }
                InterfaceC1797g interfaceC1797g = c1784h.f15242b;
                int l02 = ((eVar3.f8761f - 1) * x5.l0(interfaceC1797g.a())) + i6;
                int i47 = C0959a.i(m3);
                int g6 = C0959a.g(m3);
                if (l02 < i47) {
                    l02 = i47;
                }
                if (l02 <= g6) {
                    g6 = l02;
                }
                interfaceC1797g.b(x5, g6, iArr6, iArr8);
                int j5 = C0959a.j(m3);
                int h6 = C0959a.h(m3);
                if (i46 < j5) {
                    i46 = j5;
                }
                if (i46 <= h6) {
                    h6 = i46;
                }
                return x5.D(h6, g6, wVar, new W0.e(eVar3, i45));
            }
            c1782f2.getClass();
        }
        return x5.D(0, 0, wVar, new C0990m(26));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0108a0) && AbstractC1276k.b(this.a, ((C0108a0) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F0.V
    public final int h(r rVar, List list, int i6) {
        int i7;
        int[] iArr;
        List list2;
        long j3;
        int i8;
        long a;
        int i9;
        C1165l c1165l;
        ArrayList i10 = AbstractC0157l.i(rVar);
        C1784H c1784h = this.a;
        C1782F c1782f = c1784h.f15246f;
        int i11 = 1;
        List list3 = (List) Y3.m.r0(i10, 1);
        U u5 = list3 != null ? (U) Y3.m.q0(list3) : null;
        char c6 = 2;
        List list4 = (List) Y3.m.r0(i10, 2);
        c1782f.a(u5, list4 != null ? (U) Y3.m.q0(list4) : null, AbstractC0960b.b(0, i6, 7));
        List list5 = (List) Y3.m.q0(i10);
        if (list5 == null) {
            list5 = Y3.v.f9812c;
        }
        int l02 = rVar.l0(c1784h.f15243c);
        int l03 = rVar.l0(c1784h.f15245e);
        C1782F c1782f2 = c1784h.f15246f;
        long a6 = C1165l.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        int i12 = 0;
        while (i12 < size3) {
            U u6 = (U) list5.get(i12);
            char c7 = c6;
            int o5 = u6.o(i6);
            iArr2[i12] = o5;
            iArr3[i12] = u6.a0(o5);
            i12++;
            c6 = c7;
        }
        if (Integer.MAX_VALUE < list5.size()) {
            c1782f2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            c1782f2.getClass();
        }
        int min = Math.min(TableCell.NOT_TRACKED, list5.size());
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i13 += iArr2[i14];
        }
        int size4 = ((list5.size() - 1) * l02) + i13;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr3[0];
        int i16 = size2 - 1;
        if (1 <= i16) {
            int i17 = 1;
            i7 = 0;
            while (true) {
                int i18 = iArr3[i17];
                if (i15 < i18) {
                    i15 = i18;
                }
                if (i17 == i16) {
                    break;
                }
                i17++;
            }
        } else {
            i7 = 0;
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i19 = iArr2[i7];
        int i20 = size - 1;
        if (1 <= i20) {
            int i21 = 1;
            while (true) {
                int i22 = iArr2[i21];
                if (i19 < i22) {
                    i19 = i22;
                }
                if (i21 == i20) {
                    break;
                }
                i21++;
            }
        }
        int i23 = size4;
        while (i19 <= i23 && i15 != i6) {
            int i24 = (i19 + i23) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                a = a6;
                j3 = a;
                iArr = iArr2;
            } else {
                int i25 = i7;
                C1779C c1779c = new C1779C(c1782f2, AbstractC0960b.a(i25, i24, i25, TableCell.NOT_TRACKED), l02, l03);
                U u7 = (U) Y3.m.r0(list5, i25);
                int i26 = u7 != null ? iArr3[i25] : i25;
                if (u7 != null) {
                    i25 = iArr2[i25];
                }
                iArr = iArr2;
                int i27 = 0;
                if (c1779c.b(list5.size() > i11 ? i11 : 0, 0, C1165l.a(i24, TableCell.NOT_TRACKED), u7 == null ? null : new C1165l(C1165l.a(i25, i26)), 0, 0, 0, false, false).f15198b) {
                    c1782f2.getClass();
                    list2 = list5;
                    a = a6;
                    j3 = a;
                } else {
                    int size5 = list5.size();
                    int i28 = i24;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    while (true) {
                        if (i31 >= size5) {
                            list2 = list5;
                            j3 = a6;
                            i8 = i32;
                            break;
                        }
                        int i34 = i28 - i25;
                        int i35 = i31 + 1;
                        int max = Math.max(i30, i26);
                        U u8 = (U) Y3.m.r0(list5, i35);
                        i26 = u8 != null ? iArr3[i35] : 0;
                        if (u8 != null) {
                            list2 = list5;
                            i9 = iArr[i35] + l02;
                        } else {
                            list2 = list5;
                            i9 = 0;
                        }
                        boolean z5 = i31 + 2 < list2.size();
                        int i36 = i35 - i33;
                        int i37 = i29;
                        long a7 = C1165l.a(i34, TableCell.NOT_TRACKED);
                        if (u8 == null) {
                            j3 = a6;
                            c1165l = null;
                        } else {
                            j3 = a6;
                            c1165l = new C1165l(C1165l.a(i9, i26));
                        }
                        C1778B b5 = c1779c.b(z5, i36, a7, c1165l, i37, i27, max, false, false);
                        if (b5.a) {
                            int i38 = max + l03 + i27;
                            c1779c.a(b5, u8 != null, i37, i38, i34, i36);
                            i9 -= l02;
                            i29 = i37 + 1;
                            if (b5.f15198b) {
                                i27 = i38;
                                i8 = i35;
                                break;
                            }
                            i28 = i24;
                            i27 = i38;
                            i33 = i35;
                            i30 = 0;
                        } else {
                            i28 = i34;
                            i29 = i37;
                            i30 = max;
                        }
                        i25 = i9;
                        list5 = list2;
                        i31 = i35;
                        i32 = i31;
                        a6 = j3;
                    }
                    a = C1165l.a(i27 - l03, i8);
                }
            }
            i15 = (int) (a >> 32);
            int i39 = (int) (a & 4294967295L);
            if (i15 > i6 || i39 < min) {
                i19 = i24 + 1;
                if (i19 > i23) {
                    return i19;
                }
            } else {
                if (i15 >= i6) {
                    return i24;
                }
                i23 = i24 - 1;
            }
            size4 = i24;
            iArr2 = iArr;
            list5 = list2;
            a6 = j3;
            i11 = 1;
            i7 = 0;
        }
        return size4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // F0.V
    public final int j(r rVar, List list, int i6) {
        ArrayList i7 = AbstractC0157l.i(rVar);
        C1784H c1784h = this.a;
        C1782F c1782f = c1784h.f15246f;
        List list2 = (List) Y3.m.r0(i7, 1);
        U u5 = list2 != null ? (U) Y3.m.q0(list2) : null;
        List list3 = (List) Y3.m.r0(i7, 2);
        c1782f.a(u5, list3 != null ? (U) Y3.m.q0(list3) : null, AbstractC0960b.b(0, i6, 7));
        List list4 = (List) Y3.m.q0(i7);
        if (list4 == null) {
            list4 = Y3.v.f9812c;
        }
        int l02 = rVar.l0(c1784h.f15243c);
        int size = list4.size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < size) {
            int q3 = ((U) list4.get(i8)).q(i6) + l02;
            int i12 = i8 + 1;
            if (i12 - i10 == Integer.MAX_VALUE || i12 == list4.size()) {
                i9 = Math.max(i9, (i11 + q3) - l02);
                i10 = i8;
                i11 = 0;
            } else {
                i11 += q3;
            }
            i8 = i12;
        }
        return i9;
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
