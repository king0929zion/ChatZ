package e5;

import B3.q;
import Y3.B;
import Y3.C;
import Y3.m;
import androidx.lifecycle.N;
import d5.C0949i;
import d5.F;
import d5.y;
import i4.AbstractC1120d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import m4.C1288w;
import u4.AbstractC1776n;
import u4.u;

/* loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c6);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = y.f11513e;
        y r5 = N.r("/");
        X3.i[] iVarArr = {new X3.i(r5, new g(r5, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(C.H(1));
        B.a0(linkedHashMap, iVarArr);
        for (g gVar : m.G0(arrayList, new q(8))) {
            if (((g) linkedHashMap.put(gVar.a, gVar)) == null) {
                while (true) {
                    y yVar = gVar.a;
                    y b5 = yVar.b();
                    if (b5 != null) {
                        g gVar2 = (g) linkedHashMap.get(b5);
                        if (gVar2 != null) {
                            gVar2.f11625q.add(yVar);
                            break;
                        }
                        g gVar3 = new g(b5, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(b5, gVar3);
                        gVar3.f11625q.add(yVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i6) {
        AbstractC1120d.g(16);
        String num = Integer.toString(i6, 16);
        AbstractC1276k.e(num, "toString(...)");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [m4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, m4.v] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, m4.v] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, m4.v] */
    /* JADX WARN: Type inference failed for: r8v9, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [m4.w, java.lang.Object] */
    public static final g d(d5.C c6) {
        int f6 = c6.f();
        if (f6 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(f6));
        }
        c6.skip(4L);
        short j3 = c6.j();
        int i6 = j3 & 65535;
        if ((j3 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i6));
        }
        int j4 = c6.j() & 65535;
        int j5 = c6.j() & 65535;
        int j6 = c6.j() & 65535;
        long f7 = c6.f() & 4294967295L;
        Object obj = new Object();
        obj.f12972c = c6.f() & 4294967295L;
        Object obj2 = new Object();
        obj2.f12972c = c6.f() & 4294967295L;
        int j7 = c6.j() & 65535;
        int j8 = c6.j() & 65535;
        int j9 = 65535 & c6.j();
        c6.skip(8L);
        Object obj3 = new Object();
        obj3.f12972c = c6.f() & 4294967295L;
        String p5 = c6.p(j7);
        if (AbstractC1776n.H(p5, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = obj2.f12972c == 4294967295L ? 8 : 0L;
        if (obj.f12972c == 4294967295L) {
            j10 += 8;
        }
        if (obj3.f12972c == 4294967295L) {
            j10 += 8;
        }
        Object obj4 = new Object();
        Object obj5 = new Object();
        Object obj6 = new Object();
        Object obj7 = new Object();
        e(c6, j8, new i(obj7, j10, obj2, c6, obj, obj3, obj4, obj5, obj6));
        if (j10 > 0 && !obj7.f12968c) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String p6 = c6.p(j9);
        String str = y.f11513e;
        return new g(N.r("/").d(p5), u.w(p5, "/", false), p6, f7, obj.f12972c, obj2.f12972c, j4, obj3.f12972c, j6, j5, (Long) obj4.f12973c, (Long) obj5.f12973c, (Long) obj6.f12973c, 57344);
    }

    public static final void e(d5.C c6, int i6, l4.e eVar) {
        C0949i c0949i = c6.f11445e;
        long j3 = i6;
        while (j3 != 0) {
            if (j3 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int j4 = c6.j() & 65535;
            long j5 = c6.j() & 65535;
            long j6 = j3 - 4;
            if (j6 < j5) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c6.a0(j5);
            long j7 = c0949i.f11482e;
            eVar.m(Integer.valueOf(j4), Long.valueOf(j5));
            long j8 = (c0949i.f11482e + j5) - j7;
            if (j8 < 0) {
                throw new IOException(B3.e.h(j4, "unsupported zip: too many bytes processed for "));
            }
            if (j8 > 0) {
                c0949i.skip(j8);
            }
            j3 = j6 - j5;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [m4.w, java.lang.Object] */
    public static final g f(d5.C c6, g gVar) {
        int f6 = c6.f();
        if (f6 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(f6));
        }
        c6.skip(2L);
        short j3 = c6.j();
        int i6 = j3 & 65535;
        if ((j3 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i6));
        }
        c6.skip(18L);
        int j4 = c6.j() & 65535;
        c6.skip(c6.j() & 65535);
        if (gVar == null) {
            c6.skip(j4);
            return null;
        }
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        e(c6, j4, new h(c6, (C1288w) obj, (C1288w) obj2, (C1288w) obj3));
        return new g(gVar.a, gVar.f11610b, gVar.f11611c, gVar.f11612d, gVar.f11613e, gVar.f11614f, gVar.f11615g, gVar.f11616h, gVar.f11617i, gVar.f11618j, gVar.f11619k, gVar.f11620l, gVar.f11621m, (Integer) obj.f12973c, (Integer) obj2.f12973c, (Integer) obj3.f12973c);
    }

    public static final int g(F f6, int i6) {
        int i7;
        int[] iArr = f6.f11456i;
        int i8 = i6 + 1;
        int length = f6.f11455h.length;
        AbstractC1276k.f(iArr, "<this>");
        int i9 = length - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i7 = (i10 + i9) >>> 1;
                int i11 = iArr[i7];
                if (i11 >= i8) {
                    if (i11 <= i8) {
                        break;
                    }
                    i9 = i7 - 1;
                } else {
                    i10 = i7 + 1;
                }
            } else {
                i7 = (-i10) - 1;
                break;
            }
        }
        return i7 >= 0 ? i7 : ~i7;
    }
}
