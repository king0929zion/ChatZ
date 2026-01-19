package S0;

import P2.D0;
import a1.C0795c;
import e1.InterfaceC0961c;
import g1.AbstractC1016a;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class F {
    public static final e0.k a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0.k f7567b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0.k f7568c;

    /* renamed from: d, reason: collision with root package name */
    public static final e0.k f7569d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0.k f7570e;

    static {
        int i6 = 0;
        a = new e0.k(i6, new A(21), new z(24));
        f7567b = new e0.k(i6, new A(22), new z(25));
        f7568c = new e0.k(i6, new A(23), new z(26));
        f7569d = new e0.k(i6, new A(24), new z(27));
        f7570e = new e0.k(i6, new A(25), new z(28));
    }

    public static C0539a a(String str, P p5, long j3, InterfaceC0961c interfaceC0961c, W0.d dVar, int i6, int i7) {
        Y3.v vVar = Y3.v.f9812c;
        return new C0539a(new C0795c(str, p5, vVar, vVar, dVar, interfaceC0961c), i6, 1, j3);
    }

    public static final long b(int i6, int i7) {
        if (i6 < 0 || i7 < 0) {
            Y0.a.a("start and end cannot be negative. [start: " + i6 + ", end: " + i7 + ']');
        }
        long j3 = (i7 & 4294967295L) | (i6 << 32);
        int i8 = O.f7611c;
        return j3;
    }

    public static final long c(long j3, int i6) {
        int i7 = O.f7611c;
        int i8 = (int) (j3 >> 32);
        int i9 = i8 < 0 ? 0 : i8;
        if (i9 > i6) {
            i9 = i6;
        }
        int i10 = (int) (4294967295L & j3);
        int i11 = i10 >= 0 ? i10 : 0;
        if (i11 <= i6) {
            i6 = i11;
        }
        return (i9 == i8 && i6 == i10) ? j3 : b(i9, i6);
    }

    public static final int d(List list, int i6) {
        int i7;
        int i8 = ((r) Y3.m.w0(list)).f7658c;
        if (i6 > ((r) Y3.m.w0(list)).f7658c) {
            Y0.a.a("Index " + i6 + " should be less or equal than last line's end " + i8);
        }
        int size = list.size() - 1;
        int i9 = 0;
        while (true) {
            if (i9 > size) {
                i7 = -(i9 + 1);
                break;
            }
            i7 = (i9 + size) >>> 1;
            r rVar = (r) list.get(i7);
            char c6 = rVar.f7657b > i6 ? (char) 1 : rVar.f7658c <= i6 ? (char) 65535 : (char) 0;
            if (c6 >= 0) {
                if (c6 <= 0) {
                    break;
                }
                size = i7 - 1;
            } else {
                i9 = i7 + 1;
            }
        }
        if (i7 >= 0 && i7 < list.size()) {
            return i7;
        }
        StringBuilder k3 = AbstractC1135a.k("Found paragraph index ", i7, " should be in range [0, ");
        k3.append(list.size());
        k3.append(").\nDebug info: index=");
        k3.append(i6);
        k3.append(", paragraphs=[");
        k3.append(AbstractC1016a.a(list, null, new D0(22), 31));
        k3.append(']');
        Y0.a.a(k3.toString());
        return i7;
    }

    public static final int e(List list, int i6) {
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            r rVar = (r) list.get(i8);
            char c6 = rVar.f7659d > i6 ? (char) 1 : rVar.f7660e <= i6 ? (char) 65535 : (char) 0;
            if (c6 < 0) {
                i7 = i8 + 1;
            } else {
                if (c6 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final int f(ArrayList arrayList, float f6) {
        if (f6 <= S.l.f7374V) {
            return 0;
        }
        if (f6 >= ((r) Y3.m.w0(arrayList)).f7662g) {
            return Y4.l.C(arrayList);
        }
        int size = arrayList.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            r rVar = (r) arrayList.get(i7);
            char c6 = rVar.f7661f > f6 ? (char) 1 : rVar.f7662g <= f6 ? (char) 65535 : (char) 0;
            if (c6 < 0) {
                i6 = i7 + 1;
            } else {
                if (c6 <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final void g(ArrayList arrayList, long j3, l4.c cVar) {
        int size = arrayList.size();
        for (int d6 = d(arrayList, O.f(j3)); d6 < size; d6++) {
            r rVar = (r) arrayList.get(d6);
            if (rVar.f7657b >= O.e(j3)) {
                return;
            }
            if (rVar.f7657b != rVar.f7658c) {
                cVar.f(rVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final S0.P h(S0.P r30, e1.m r31) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.F.h(S0.P, e1.m):S0.P");
    }
}
