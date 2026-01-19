package r;

import B0.C0040p;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import n.AbstractC1318d;
import n.C1347v;
import n.InterfaceC1334l;
import n0.C1353b;
import s.C1643g;
import y0.C1986a;

/* renamed from: r.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1573i {
    public static final p.O0 a = new p.O0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final C1347v f14347b = new C1347v(new androidx.lifecycle.N(18));

    /* renamed from: c, reason: collision with root package name */
    public static final p.O0 f14348c = new p.O0(8);

    public static final void a(A3.c cVar, y0.b bVar, X0 x02, C1986a c1986a, U4.n nVar, long j3) {
        float intBitsToFloat;
        ArrayList arrayList = nVar.f8749b;
        long j4 = bVar.f15960c;
        boolean z5 = bVar.f15961d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f15960c & 4294967295L));
        boolean z6 = bVar.f15965h;
        if (!z6 && z5) {
            nVar.a = 0;
            arrayList.clear();
        }
        if (!c(bVar) && (z6 || !z5)) {
            if (arrayList.size() == 3) {
                int i6 = nVar.a;
                nVar.a = i6 + 1;
                arrayList.set(i6, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (nVar.a == 3) {
                nVar.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((y0.b) arrayList.get(i7)).f15960c >> 32))));
            }
            intBitsToFloat2 = (float) Y3.m.i0(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((y0.b) arrayList.get(i8)).f15960c & 4294967295L))));
            }
            intBitsToFloat3 = (float) Y3.m.i0(arrayList3);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (x02 != null) {
            int i9 = c1986a.a;
            if (i9 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i9 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = x02 == X0.f14184e ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L) : (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((C0.b) cVar.f119e).a(bVar.f15959b, C1353b.f(floatToRawIntBits, j3));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, m4.t] */
    public static final Object b(C1606t c1606t, float f6, C1603s c1603s, C1517E c1517e, Object obj, InterfaceC1334l interfaceC1334l, d4.i iVar) {
        Object c6;
        float c7 = c1517e.c(obj);
        Object obj2 = new Object();
        obj2.f12970c = Float.isNaN(c1606t.f14472f.g()) ? S.l.f7374V : c1606t.f14472f.g();
        if (!Float.isNaN(c7)) {
            float f7 = obj2.f12970c;
            if (f7 != c7 && (c6 = AbstractC1318d.c(f7, c7, f6, interfaceC1334l, new I.m(23, c1603s, (Object) obj2), iVar)) == EnumC0927a.f11114c) {
                return c6;
            }
        }
        return X3.y.a;
    }

    public static final boolean c(y0.b bVar) {
        return bVar.f15965h && !bVar.f15961d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(l4.InterfaceC1193a r4, l4.e r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof r.C1561e
            if (r0 == 0) goto L13
            r0 = r6
            r.e r0 = (r.C1561e) r0
            int r1 = r0.f14295h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14295h = r1
            goto L18
        L13:
            r.e r0 = new r.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14294g
            int r1 = r0.f14295h
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)     // Catch: r.C1549a -> L41
            goto L41
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            X3.a.e(r6)
            r.h r6 = new r.h     // Catch: r.C1549a -> L41
            r1 = 0
            r6.<init>(r4, r5, r1)     // Catch: r.C1549a -> L41
            r0.f14295h = r2     // Catch: r.C1549a -> L41
            java.lang.Object r4 = x4.AbstractC1888A.l(r6, r0)     // Catch: r.C1549a -> L41
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r4 != r5) goto L41
            return r5
        L41:
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r.AbstractC1573i.d(l4.a, l4.e, d4.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean e(B0.V v5) {
        Object r5 = v5.f419i.f427v.a;
        int size = r5.size();
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (((B0.y) r5.get(i6)).f484d) {
                z5 = true;
                break;
            }
            i6++;
        }
        return !z5;
    }

    public static InterfaceC1041r f(InterfaceC1041r interfaceC1041r, C1606t c1606t, C1643g c1643g) {
        return interfaceC1041r.c(new C1555c(c1606t, Boolean.FALSE, c1643g));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (e(r6) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(B0.V r6, B0.EnumC0041q r7, d4.a r8) {
        /*
            boolean r0 = r8 instanceof r.C1622y0
            if (r0 == 0) goto L13
            r0 = r8
            r.y0 r0 = (r.C1622y0) r0
            int r1 = r0.f14521j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14521j = r1
            goto L18
        L13:
            r.y0 r0 = new r.y0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14520i
            int r1 = r0.f14521j
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            B0.q r6 = r0.f14519h
            B0.V r7 = r0.f14518g
            X3.a.e(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            X3.a.e(r8)
            boolean r8 = e(r6)
            if (r8 != 0) goto L65
        L3d:
            r0.f14518g = r6
            r0.f14519h = r7
            r0.f14521j = r2
            java.lang.Object r8 = r6.b(r7, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r8 != r1) goto L4c
            return r1
        L4c:
            B0.p r8 = (B0.C0040p) r8
            java.lang.Object r8 = r8.a
            int r1 = r8.size()
            r3 = 0
        L55:
            if (r3 >= r1) goto L65
            java.lang.Object r4 = r8.get(r3)
            B0.y r4 = (B0.y) r4
            boolean r4 = r4.f484d
            if (r4 == 0) goto L62
            goto L3d
        L62:
            int r3 = r3 + 1
            goto L55
        L65:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.AbstractC1573i.g(B0.V, B0.q, d4.a):java.lang.Object");
    }

    public static final Object h(B0.D d6, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        Object M02 = ((B0.X) d6).M0(new C1625z0(interfaceC0905c.o(), eVar, null), interfaceC0905c);
        return M02 == EnumC0927a.f11114c ? M02 : X3.y.a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final long i(C0040p c0040p, boolean z5) {
        Object r7 = c0040p.a;
        int size = r7.size();
        long j3 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            B0.y yVar = (B0.y) r7.get(i7);
            if (yVar.f484d && yVar.f488h) {
                j3 = C1353b.f(j3, z5 ? yVar.f483c : yVar.f487g);
                i6++;
            }
        }
        if (i6 == 0) {
            return 9205357640488583168L;
        }
        return C1353b.b(i6, j3);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final float j(C0040p c0040p, boolean z5) {
        long i6 = i(c0040p, z5);
        boolean c6 = C1353b.c(i6, 9205357640488583168L);
        float f6 = S.l.f7374V;
        if (c6) {
            return S.l.f7374V;
        }
        Object r8 = c0040p.a;
        int size = r8.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            B0.y yVar = (B0.y) r8.get(i8);
            if (yVar.f484d && yVar.f488h) {
                i7++;
                f6 = C1353b.d(C1353b.e(z5 ? yVar.f483c : yVar.f487g, i6)) + f6;
            }
        }
        return f6 / i7;
    }

    public static final long k(y0.b bVar, X0 x02, C1986a c1986a) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j3;
        if (x02 == null) {
            return bVar.f15960c;
        }
        int i6 = c1986a.a;
        if (i6 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.f15960c >> 32));
        } else {
            if (i6 != 2) {
                return bVar.f15960c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.f15960c & 4294967295L));
        }
        if (x02 == X0.f14184e) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(S.l.f7374V);
            j3 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(S.l.f7374V);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j3 = floatToRawIntBits3 << 32;
        }
        return j3 | (4294967295L & floatToRawIntBits);
    }

    public static final long l(y0.b bVar, X0 x02, C1986a c1986a) {
        float intBitsToFloat;
        long j3 = bVar.f15964g;
        if (x02 == null) {
            return j3;
        }
        int i6 = c1986a.a;
        if (i6 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        } else {
            if (i6 != 2) {
                return j3;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        if (x02 == X0.f14184e) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(S.l.f7374V) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, m4.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(r.InterfaceC1623y1 r4, float r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof r.C1554b1
            if (r0 == 0) goto L13
            r0 = r6
            r.b1 r0 = (r.C1554b1) r0
            int r1 = r0.f14248i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14248i = r1
            goto L18
        L13:
            r.b1 r0 = new r.b1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14247h
            int r1 = r0.f14248i
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            m4.t r4 = r0.f14246g
            X3.a.e(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            X3.a.e(r6)
            m4.t r6 = new m4.t
            r6.<init>()
            r.c1 r1 = new r.c1
            r3 = 0
            r1.<init>(r6, r5, r3)
            r0.f14246g = r6
            r0.f14248i = r2
            p.x0 r5 = p.x0.f13823c
            java.lang.Object r4 = r4.a(r5, r1, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r4 != r5) goto L4c
            return r5
        L4c:
            r4 = r6
        L4d:
            float r4 = r4.f12970c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.AbstractC1573i.m(r.y1, float, d4.c):java.lang.Object");
    }
}
