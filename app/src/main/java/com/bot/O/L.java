package O;

import F0.InterfaceC0134w;
import S0.C0545g;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.ListIterator;
import k.AbstractC1171s;
import k.C1151E;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1353b;
import n0.C1354c;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3976c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0332s0 f3977e;

    public /* synthetic */ L(C0332s0 c0332s0, int i6) {
        this.f3976c = i6;
        this.f3977e = c0332s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, m4.v] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        InterfaceC0134w interfaceC0134w;
        C1354c c1354c;
        int i6;
        ArrayList arrayList;
        boolean z5;
        InterfaceC0134w c6;
        int[] iArr;
        int i7;
        ArrayList arrayList2;
        boolean z6;
        ArrayList arrayList3;
        long j3;
        int i8;
        InterfaceC1942y interfaceC1942y;
        ArrayList arrayList4;
        G g3;
        int i9;
        int i10;
        X3.y yVar;
        int i11 = this.f3976c;
        X3.y yVar2 = X3.y.a;
        C0332s0 c0332s0 = this.f3977e;
        switch (i11) {
            case 0:
                C1353b c1353b = (C1353b) c0332s0.f4206q.getValue();
                return new C1353b(c1353b != null ? c1353b.a : 9205357640488583168L);
            case 1:
                C1353b c1353b2 = (C1353b) c0332s0.f4205p.getValue();
                return new C1353b(c1353b2 != null ? c1353b2.a : 9205357640488583168L);
            case 2:
                c0332s0.i();
                return yVar2;
            case 3:
                z0 z0Var = c0332s0.a;
                c0332s0.f4202m.getValue();
                if (c0332s0.f() != null && (interfaceC0134w = c0332s0.f4201l) != null && interfaceC0134w.j()) {
                    ArrayList c7 = z0Var.c(c0332s0.j());
                    ArrayList arrayList5 = new ArrayList(c7.size());
                    int size = c7.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        r rVar = (r) c7.get(i12);
                        G g6 = (G) z0Var.a().e(rVar.a);
                        X3.i iVar = g6 != null ? new X3.i(rVar, g6) : null;
                        if (iVar != null) {
                            arrayList5.add(iVar);
                        }
                    }
                    int size2 = arrayList5.size();
                    ArrayList arrayList6 = arrayList5;
                    arrayList6 = arrayList5;
                    if (size2 != 0 && size2 != 1) {
                        arrayList6 = Y4.l.I(Y3.m.o0(arrayList5), Y3.m.w0(arrayList5));
                    }
                    if (!arrayList6.isEmpty()) {
                        boolean isEmpty = arrayList6.isEmpty();
                        C1354c c1354c2 = AbstractC0336u0.a;
                        if (isEmpty) {
                            c1354c = c1354c2;
                        } else {
                            int size3 = arrayList6.size();
                            int i13 = 0;
                            float f6 = Float.POSITIVE_INFINITY;
                            float f7 = Float.POSITIVE_INFINITY;
                            float f8 = Float.NEGATIVE_INFINITY;
                            float f9 = Float.NEGATIVE_INFINITY;
                            ArrayList arrayList7 = arrayList6;
                            while (i13 < size3) {
                                X3.i iVar2 = (X3.i) arrayList7.get(i13);
                                r rVar2 = (r) iVar2.f9393c;
                                G g7 = (G) iVar2.f9394e;
                                int i14 = g7.a.f3941b;
                                int i15 = g7.f3945b.f3941b;
                                if (i14 == i15 || (c6 = rVar2.c()) == null) {
                                    i6 = size3;
                                    arrayList = arrayList7;
                                    z5 = r8;
                                } else {
                                    boolean z7 = r8;
                                    int min = Math.min(i14, i15);
                                    int max = Math.max(i14, i15) - r9;
                                    if (min == max) {
                                        iArr = new int[r9];
                                        iArr[z7 ? 1 : 0] = min;
                                    } else {
                                        int[] iArr2 = new int[2];
                                        iArr2[z7 ? 1 : 0] = min;
                                        iArr2[r9] = max;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    int i16 = z7 ? 1 : 0;
                                    float f10 = Float.POSITIVE_INFINITY;
                                    float f11 = Float.POSITIVE_INFINITY;
                                    float f12 = Float.NEGATIVE_INFINITY;
                                    float f13 = Float.NEGATIVE_INFINITY;
                                    ArrayList arrayList8 = arrayList7;
                                    while (i16 < length) {
                                        int i17 = iArr[i16];
                                        S0.L l3 = (S0.L) rVar2.f4182c.b();
                                        C1354c c1354c3 = C1354c.f13294e;
                                        if (l3 == null) {
                                            i7 = size3;
                                            arrayList3 = arrayList8;
                                        } else {
                                            i7 = size3;
                                            int length2 = l3.a.a.f7630e.length();
                                            ArrayList arrayList9 = arrayList8;
                                            arrayList3 = arrayList9;
                                            if (length2 >= 1) {
                                                Object r42 = z7;
                                                c1354c3 = l3.b(AbstractC1117a.f(i17, r42, length2 - 1));
                                                z6 = r42;
                                                arrayList2 = arrayList9;
                                                C1354c c1354c4 = c1354c3;
                                                f10 = Math.min(f10, c1354c4.a);
                                                f11 = Math.min(f11, c1354c4.f13295b);
                                                f12 = Math.max(f12, c1354c4.f13296c);
                                                f13 = Math.max(f13, c1354c4.f13297d);
                                                i16++;
                                                z7 = z6;
                                                size3 = i7;
                                                arrayList8 = arrayList2;
                                            }
                                        }
                                        z6 = z7;
                                        arrayList2 = arrayList3;
                                        C1354c c1354c42 = c1354c3;
                                        f10 = Math.min(f10, c1354c42.a);
                                        f11 = Math.min(f11, c1354c42.f13295b);
                                        f12 = Math.max(f12, c1354c42.f13296c);
                                        f13 = Math.max(f13, c1354c42.f13297d);
                                        i16++;
                                        z7 = z6;
                                        size3 = i7;
                                        arrayList8 = arrayList2;
                                    }
                                    i6 = size3;
                                    arrayList = arrayList8;
                                    z5 = z7;
                                    long floatToRawIntBits = Float.floatToRawIntBits(f12);
                                    long R5 = interfaceC0134w.R(c6, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
                                    long R6 = interfaceC0134w.R(c6, (Float.floatToRawIntBits(f13) & 4294967295L) | (floatToRawIntBits << 32));
                                    f6 = Math.min(f6, Float.intBitsToFloat((int) (R5 >> 32)));
                                    f7 = Math.min(f7, Float.intBitsToFloat((int) (R5 & 4294967295L)));
                                    f8 = Math.max(f8, Float.intBitsToFloat((int) (R6 >> 32)));
                                    f9 = Math.max(f9, Float.intBitsToFloat((int) (R6 & 4294967295L)));
                                }
                                i13++;
                                r8 = z5;
                                size3 = i6;
                                arrayList7 = arrayList;
                                r9 = 1;
                            }
                            c1354c = new C1354c(f6, f7, f8, f9);
                        }
                        if (!c1354c.equals(c1354c2)) {
                            C1354c f14 = AbstractC0336u0.A(interfaceC0134w).f(c1354c);
                            if (f14.f13296c - f14.a >= S.l.f7374V && f14.f13297d - f14.f13295b >= S.l.f7374V) {
                                C1354c j4 = f14.j(interfaceC0134w.U(0L));
                                return C1354c.b(j4, S.l.f7374V, S.l.f7374V, (AbstractC0305e0.f4105b * 4) + j4.f13297d, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                C0332s0 c0332s02 = this.f3977e;
                c0332s02.f4213x = true;
                c0332s02.o();
                c0332s02.f4207r.setValue(null);
                c0332s02.f4208s.setValue(null);
                if (c0332s02.f4210u && c0332s02.h()) {
                    long j5 = 0;
                    Object obj = new Object();
                    Object obj2 = new Object();
                    Object obj3 = new Object();
                    z0 z0Var2 = c0332s02.a;
                    ArrayList c8 = z0Var2.c(c0332s02.j());
                    ListIterator listIterator = c8.listIterator(c8.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            j3 = j5;
                            G g8 = (G) z0Var2.a().e(((r) listIterator.previous()).a);
                            if (g8 == null || g8.a.f3941b == g8.f3945b.f3941b) {
                                j5 = j3;
                            } else {
                                i8 = listIterator.nextIndex();
                            }
                        } else {
                            j3 = j5;
                            i8 = -1;
                        }
                    }
                    if (i8 != -1) {
                        int size4 = c8.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size4) {
                                r rVar3 = (r) c8.get(i18);
                                G g9 = (G) z0Var2.a().e(rVar3.a);
                                if (g9 != null) {
                                    C0545g d6 = rVar3.d();
                                    long b5 = S0.F.b(g9.a.f3941b, g9.f3945b.f3941b);
                                    r9 = i18 < i8 ? 0 : 1;
                                    long j6 = rVar3.a;
                                    if (r9 != 0) {
                                        obj.f12973c = d6;
                                        obj2.f12973c = new S0.O(b5);
                                        obj3.f12972c = j6;
                                    }
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                    Object obj4 = obj.f12973c;
                    if (obj4 != null && obj2.f12973c != null && obj3.f12972c != j3 && ((CharSequence) obj4).length() > 0 && (interfaceC1942y = c0332s02.f4211v) != null) {
                        AbstractC1888A.y(interfaceC1942y, null, new C0330r0(c0332s02, obj, obj2, obj3, null), 3);
                    }
                }
                c0332s02.f4210u = false;
                return yVar2;
            case AbstractC1787b.f15290g /* 5 */:
                c0332s0.b();
                if (c0332s0.g()) {
                    c0332s0.i();
                }
                return yVar2;
            case 6:
                return Boolean.valueOf((c0332s0.f4213x && c0332s0.g()) ? false : true);
            default:
                z0 z0Var3 = c0332s0.a;
                ArrayList c9 = z0Var3.c(c0332s0.j());
                if (c9.isEmpty()) {
                    return yVar2;
                }
                C1151E c1151e = AbstractC1171s.a;
                C1151E c1151e2 = new C1151E();
                int size5 = c9.size();
                int i19 = 0;
                G g10 = null;
                G g11 = null;
                while (i19 < size5) {
                    r rVar4 = (r) c9.get(i19);
                    long j7 = rVar4.a;
                    S0.L l5 = (S0.L) rVar4.f4182c.b();
                    if (l5 == null) {
                        arrayList4 = c9;
                        i9 = size5;
                        i10 = i19;
                        yVar = yVar2;
                        g3 = null;
                    } else {
                        int length3 = l5.a.a.f7630e.length();
                        arrayList4 = c9;
                        i9 = size5;
                        i10 = i19;
                        yVar = yVar2;
                        g3 = new G(new F(l5.a(0), 0, j7), new F(l5.a(Math.max(length3 - 1, 0)), length3, j7), false);
                    }
                    if (g3 != null) {
                        if (g10 == null) {
                            g10 = g3;
                        }
                        long j8 = rVar4.a;
                        int c10 = c1151e2.c(j8);
                        Object[] objArr = c1151e2.f12448c;
                        Object obj5 = objArr[c10];
                        c1151e2.f12447b[c10] = j8;
                        objArr[c10] = g3;
                        g11 = g3;
                    }
                    i19 = i10 + 1;
                    c9 = arrayList4;
                    size5 = i9;
                    yVar2 = yVar;
                }
                X3.y yVar3 = yVar2;
                if (c1151e2.f12450e == 0) {
                    return yVar3;
                }
                if (g10 != g11) {
                    AbstractC1276k.c(g10);
                    F f15 = g10.a;
                    AbstractC1276k.c(g11);
                    g10 = new G(f15, g11.f3945b, false);
                }
                z0Var3.f4273k.setValue(c1151e2);
                c0332s0.f4193d.f(g10);
                c0332s0.f4209t = null;
                return yVar3;
        }
    }
}
