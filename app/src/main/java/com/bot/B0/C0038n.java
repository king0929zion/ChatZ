package B0;

import F0.InterfaceC0134w;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.i0;
import H0.w0;
import h0.AbstractC1040q;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC1174v;
import k.C1173u;
import l.AbstractC1180a;
import m4.AbstractC1276k;
import n0.C1353b;

/* renamed from: B0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038n extends C0039o {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1040q f461c;

    /* renamed from: d, reason: collision with root package name */
    public final C0.c f462d;

    /* renamed from: e, reason: collision with root package name */
    public final C1173u f463e;

    /* renamed from: f, reason: collision with root package name */
    public i0 f464f;

    /* renamed from: g, reason: collision with root package name */
    public C0040p f465g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f466h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f467i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f468j;

    public C0038n(AbstractC1040q abstractC1040q) {
        this.f461c = abstractC1040q;
        C0.c cVar = new C0.c((char) 0, 0);
        cVar.f649c = new long[2];
        this.f462d = cVar;
        this.f463e = new C1173u(2);
        this.f467i = true;
        this.f468j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // B0.C0039o
    public final boolean a(C1173u c1173u, InterfaceC0134w interfaceC0134w, C0033i c0033i, boolean z5) {
        C1173u c1173u2;
        C0.c cVar;
        Object obj;
        boolean z6;
        boolean z7;
        C0040p c0040p;
        int i6;
        int i7;
        boolean z8;
        int i8;
        boolean z9;
        int i9;
        y yVar;
        List list;
        InterfaceC0134w interfaceC0134w2 = interfaceC0134w;
        boolean a = super.a(c1173u, interfaceC0134w, c0033i, z5);
        AbstractC0156k abstractC0156k = this.f461c;
        boolean z10 = true;
        if (abstractC0156k.f11819q) {
            ?? r8 = 0;
            while (abstractC0156k != 0) {
                if (abstractC0156k instanceof w0) {
                    this.f464f = AbstractC0157l.t((w0) abstractC0156k, 16);
                } else if ((abstractC0156k.f11808f & 16) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                    AbstractC1040q abstractC1040q = abstractC0156k.f1964s;
                    int i10 = 0;
                    abstractC0156k = abstractC0156k;
                    r8 = r8;
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & 16) != 0) {
                            i10++;
                            r8 = r8;
                            if (i10 == 1) {
                                abstractC0156k = abstractC1040q;
                            } else {
                                if (r8 == 0) {
                                    r8 = new V.e(new AbstractC1040q[16]);
                                }
                                if (abstractC0156k != 0) {
                                    r8.b(abstractC0156k);
                                    abstractC0156k = 0;
                                }
                                r8.b(abstractC1040q);
                            }
                        }
                        abstractC1040q = abstractC1040q.f11811i;
                        abstractC0156k = abstractC0156k;
                        r8 = r8;
                    }
                    if (i10 == 1) {
                    }
                }
                abstractC0156k = AbstractC0157l.e(r8);
            }
            if (this.f464f != null) {
                int e6 = c1173u.e();
                int i11 = 0;
                while (true) {
                    c1173u2 = this.f463e;
                    cVar = this.f462d;
                    if (i11 >= e6) {
                        break;
                    }
                    long b5 = c1173u.b(i11);
                    y yVar2 = (y) c1173u.f(i11);
                    if (cVar.c(b5)) {
                        boolean z11 = z10;
                        long j3 = yVar2.f487g;
                        long j4 = yVar2.f483c;
                        if ((((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z9 = z11;
                            List list2 = yVar2.f491k;
                            List list3 = Y3.v.f9812c;
                            if (list2 == null) {
                                list2 = list3;
                            }
                            ArrayList arrayList = new ArrayList(list2.size());
                            List list4 = yVar2.f491k;
                            if (list4 == null) {
                                list4 = list3;
                            }
                            z8 = a;
                            int size = list4.size();
                            i8 = e6;
                            int i12 = 0;
                            while (i12 < size) {
                                int i13 = size;
                                C0027c c0027c = (C0027c) list4.get(i12);
                                long j5 = b5;
                                long j6 = c0027c.f434b;
                                if ((((j6 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    yVar = yVar2;
                                    list = list4;
                                    long j7 = c0027c.a;
                                    i9 = i12;
                                    i0 i0Var = this.f464f;
                                    AbstractC1276k.c(i0Var);
                                    arrayList.add(new C0027c(j7, i0Var.l(interfaceC0134w2, j6), c0027c.f435c));
                                } else {
                                    i9 = i12;
                                    yVar = yVar2;
                                    list = list4;
                                }
                                i12 = i9 + 1;
                                list4 = list;
                                size = i13;
                                b5 = j5;
                                yVar2 = yVar;
                            }
                            long j8 = b5;
                            i0 i0Var2 = this.f464f;
                            AbstractC1276k.c(i0Var2);
                            long l3 = i0Var2.l(interfaceC0134w2, j3);
                            i0 i0Var3 = this.f464f;
                            AbstractC1276k.c(i0Var3);
                            y yVar3 = new y(yVar2.a, yVar2.f482b, i0Var3.l(interfaceC0134w2, j4), yVar2.f484d, yVar2.f485e, yVar2.f486f, l3, yVar2.f488h, yVar2.f489i, arrayList, yVar2.f490j, yVar2.f492l);
                            y yVar4 = yVar2.f495o;
                            if (yVar4 == null) {
                                yVar4 = yVar2;
                            }
                            yVar3.f495o = yVar4;
                            y yVar5 = yVar2.f495o;
                            if (yVar5 != null) {
                                yVar2 = yVar5;
                            }
                            yVar3.f495o = yVar2;
                            c1173u2.c(j8, yVar3);
                        } else {
                            z8 = a;
                            i8 = e6;
                            z9 = z11;
                        }
                    } else {
                        z8 = a;
                        i8 = e6;
                        z9 = z10;
                    }
                    i11++;
                    interfaceC0134w2 = interfaceC0134w;
                    z10 = z9;
                    a = z8;
                    e6 = i8;
                }
                boolean z12 = a;
                boolean z13 = z10;
                if (c1173u2.e() == 0) {
                    cVar.f648b = 0;
                    this.a.g();
                    return z13;
                }
                int i14 = cVar.f648b;
                while (true) {
                    i14--;
                    if (-1 >= i14) {
                        break;
                    }
                    long j9 = ((long[]) cVar.f649c)[i14];
                    if (c1173u.f12572c) {
                        int i15 = c1173u.f12575g;
                        long[] jArr = c1173u.f12573e;
                        Object[] objArr = c1173u.f12574f;
                        int i16 = 0;
                        for (int i17 = 0; i17 < i15; i17++) {
                            Object obj2 = objArr[i17];
                            if (obj2 != AbstractC1174v.a) {
                                if (i17 != i16) {
                                    jArr[i16] = jArr[i17];
                                    objArr[i16] = obj2;
                                    objArr[i17] = null;
                                }
                                i16++;
                            }
                        }
                        c1173u.f12572c = false;
                        c1173u.f12575g = i16;
                    }
                    if (AbstractC1180a.b(c1173u.f12573e, c1173u.f12575g, j9) < 0 && i14 < (i7 = cVar.f648b)) {
                        int i18 = i7 - 1;
                        int i19 = i14;
                        while (i19 < i18) {
                            long[] jArr2 = (long[]) cVar.f649c;
                            int i20 = i19 + 1;
                            jArr2[i19] = jArr2[i20];
                            i19 = i20;
                        }
                        cVar.f648b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c1173u2.e());
                int e7 = c1173u2.e();
                for (int i21 = 0; i21 < e7; i21++) {
                    arrayList2.add(c1173u2.f(i21));
                }
                C0040p c0040p2 = new C0040p(arrayList2, c0033i);
                int size2 = arrayList2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i22);
                    if (c0033i.b(((y) obj).a)) {
                        break;
                    }
                    i22++;
                }
                y yVar6 = (y) obj;
                if (yVar6 != null) {
                    boolean z14 = yVar6.f484d;
                    if (z5) {
                        z6 = false;
                        if (!this.f467i && (z14 || yVar6.f488h)) {
                            i0 i0Var4 = this.f464f;
                            AbstractC1276k.c(i0Var4);
                            long j10 = i0Var4.f1487f;
                            long j11 = yVar6.f483c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                            int i23 = (int) (j10 >> 32);
                            this.f467i = !((intBitsToFloat2 > ((float) ((int) (j10 & 4294967295L))) ? z13 : false) | (intBitsToFloat2 < S.l.f7374V ? z13 : false) | (intBitsToFloat > ((float) i23) ? z13 : false) | (intBitsToFloat < S.l.f7374V ? z13 : false));
                        }
                    } else {
                        z6 = false;
                        this.f467i = false;
                    }
                    boolean z15 = this.f467i;
                    boolean z16 = this.f466h;
                    if (z15 == z16 || !((i6 = c0040p2.f474f) == 3 || i6 == 4 || i6 == 5)) {
                        int i24 = c0040p2.f474f;
                        if (i24 == 4 && z16 && !this.f468j) {
                            c0040p2.f474f = 3;
                        } else if (i24 == 5 && z15 && z14) {
                            c0040p2.f474f = 3;
                        }
                    } else {
                        c0040p2.f474f = z15 ? 4 : 5;
                    }
                } else {
                    z6 = false;
                }
                if (!z12 && c0040p2.f474f == 3 && (c0040p = this.f465g) != null) {
                    ?? r12 = c0040p.a;
                    int size3 = r12.size();
                    ?? r42 = c0040p2.a;
                    if (size3 == r42.size()) {
                        int size4 = r42.size();
                        for (?? r5 = z6; r5 < size4; r5++) {
                            if (C1353b.c(((y) r12.get(r5)).f483c, ((y) r42.get(r5)).f483c)) {
                            }
                        }
                        z7 = z6;
                        this.f465g = c0040p2;
                        return z7;
                    }
                }
                z7 = z13;
                this.f465g = c0040p2;
                return z7;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // B0.C0039o
    public final void b(C0033i c0033i) {
        super.b(c0033i);
        C0040p c0040p = this.f465g;
        if (c0040p == null) {
            return;
        }
        this.f466h = this.f467i;
        ?? r12 = c0040p.a;
        int size = r12.size();
        for (int i6 = 0; i6 < size; i6++) {
            y yVar = (y) r12.get(i6);
            boolean z5 = yVar.f484d;
            long j3 = yVar.a;
            boolean b5 = c0033i.b(j3);
            boolean z6 = this.f467i;
            if ((!z5 && !b5) || (!z5 && !z6)) {
                this.f462d.i(j3);
            }
        }
        this.f467i = false;
        this.f468j = c0040p.f474f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [V.e] */
    public final void c() {
        V.e eVar = this.a;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            ((C0038n) objArr[i7]).c();
        }
        AbstractC0156k abstractC0156k = this.f461c;
        ?? r32 = 0;
        while (abstractC0156k != 0) {
            if (abstractC0156k instanceof w0) {
                ((w0) abstractC0156k).L();
            } else if ((abstractC0156k.f11808f & 16) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                AbstractC1040q abstractC1040q = abstractC0156k.f1964s;
                int i8 = 0;
                abstractC0156k = abstractC0156k;
                r32 = r32;
                while (abstractC1040q != null) {
                    if ((abstractC1040q.f11808f & 16) != 0) {
                        i8++;
                        r32 = r32;
                        if (i8 == 1) {
                            abstractC0156k = abstractC1040q;
                        } else {
                            if (r32 == 0) {
                                r32 = new V.e(new AbstractC1040q[16]);
                            }
                            if (abstractC0156k != 0) {
                                r32.b(abstractC0156k);
                                abstractC0156k = 0;
                            }
                            r32.b(abstractC1040q);
                        }
                    }
                    abstractC1040q = abstractC1040q.f11811i;
                    abstractC0156k = abstractC0156k;
                    r32 = r32;
                }
                if (i8 == 1) {
                }
            }
            abstractC0156k = AbstractC0157l.e(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(B0.C0033i r15) {
        /*
            r14 = this;
            k.u r0 = r14.f463e
            int r1 = r0.e()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto L83
        Ld:
            h0.q r1 = r14.f461c
            boolean r4 = r1.f11819q
            if (r4 != 0) goto L14
            goto La
        L14:
            B0.p r4 = r14.f465g
            m4.AbstractC1276k.c(r4)
            H0.i0 r5 = r14.f464f
            m4.AbstractC1276k.c(r5)
            long r5 = r5.f1487f
            r7 = r1
            r8 = r2
        L22:
            r9 = 1
            if (r7 == 0) goto L6c
            boolean r10 = r7 instanceof H0.w0
            if (r10 == 0) goto L31
            H0.w0 r7 = (H0.w0) r7
            B0.q r9 = B0.EnumC0041q.f477f
            r7.w(r4, r9, r5)
            goto L67
        L31:
            int r10 = r7.f11808f
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L67
            boolean r10 = r7 instanceof H0.AbstractC0156k
            if (r10 == 0) goto L67
            r10 = r7
            H0.k r10 = (H0.AbstractC0156k) r10
            h0.q r10 = r10.f1964s
            r12 = r3
        L42:
            if (r10 == 0) goto L64
            int r13 = r10.f11808f
            r13 = r13 & r11
            if (r13 == 0) goto L61
            int r12 = r12 + 1
            if (r12 != r9) goto L4f
            r7 = r10
            goto L61
        L4f:
            if (r8 != 0) goto L58
            V.e r8 = new V.e
            h0.q[] r13 = new h0.AbstractC1040q[r11]
            r8.<init>(r13)
        L58:
            if (r7 == 0) goto L5e
            r8.b(r7)
            r7 = r2
        L5e:
            r8.b(r10)
        L61:
            h0.q r10 = r10.f11811i
            goto L42
        L64:
            if (r12 != r9) goto L67
            goto L22
        L67:
            h0.q r7 = H0.AbstractC0157l.e(r8)
            goto L22
        L6c:
            boolean r1 = r1.f11819q
            if (r1 == 0) goto L83
            V.e r1 = r14.a
            java.lang.Object[] r4 = r1.f8759c
            int r1 = r1.f8761f
            r5 = r3
        L77:
            if (r5 >= r1) goto L83
            r6 = r4[r5]
            B0.n r6 = (B0.C0038n) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L77
        L83:
            r14.b(r15)
            int r15 = r0.f12575g
            java.lang.Object[] r1 = r0.f12574f
            r4 = r3
        L8b:
            if (r4 >= r15) goto L92
            r1[r4] = r2
            int r4 = r4 + 1
            goto L8b
        L92:
            r0.f12575g = r3
            r0.f12572c = r3
            r14.f464f = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0038n.d(B0.i):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(C0033i c0033i, boolean z5) {
        if (this.f463e.e() == 0) {
            return false;
        }
        AbstractC0156k abstractC0156k = this.f461c;
        if (!abstractC0156k.f11819q) {
            return false;
        }
        C0040p c0040p = this.f465g;
        AbstractC1276k.c(c0040p);
        i0 i0Var = this.f464f;
        AbstractC1276k.c(i0Var);
        long j3 = i0Var.f1487f;
        AbstractC0156k abstractC0156k2 = abstractC0156k;
        ?? r7 = 0;
        while (abstractC0156k2 != 0) {
            if (abstractC0156k2 instanceof w0) {
                ((w0) abstractC0156k2).w(c0040p, EnumC0041q.f475c, j3);
            } else if ((abstractC0156k2.f11808f & 16) != 0 && (abstractC0156k2 instanceof AbstractC0156k)) {
                AbstractC1040q abstractC1040q = abstractC0156k2.f1964s;
                int i6 = 0;
                abstractC0156k2 = abstractC0156k2;
                r7 = r7;
                while (abstractC1040q != null) {
                    if ((abstractC1040q.f11808f & 16) != 0) {
                        i6++;
                        r7 = r7;
                        if (i6 == 1) {
                            abstractC0156k2 = abstractC1040q;
                        } else {
                            if (r7 == 0) {
                                r7 = new V.e(new AbstractC1040q[16]);
                            }
                            if (abstractC0156k2 != 0) {
                                r7.b(abstractC0156k2);
                                abstractC0156k2 = 0;
                            }
                            r7.b(abstractC1040q);
                        }
                    }
                    abstractC1040q = abstractC1040q.f11811i;
                    abstractC0156k2 = abstractC0156k2;
                    r7 = r7;
                }
                if (i6 == 1) {
                }
            }
            abstractC0156k2 = AbstractC0157l.e(r7);
        }
        if (abstractC0156k.f11819q) {
            V.e eVar = this.a;
            Object[] objArr = eVar.f8759c;
            int i7 = eVar.f8761f;
            for (int i8 = 0; i8 < i7; i8++) {
                C0038n c0038n = (C0038n) objArr[i8];
                AbstractC1276k.c(this.f464f);
                c0038n.e(c0033i, z5);
            }
        }
        if (abstractC0156k.f11819q) {
            ?? r14 = 0;
            while (abstractC0156k != 0) {
                if (abstractC0156k instanceof w0) {
                    ((w0) abstractC0156k).w(c0040p, EnumC0041q.f476e, j3);
                } else if ((abstractC0156k.f11808f & 16) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                    int i9 = 0;
                    abstractC0156k = abstractC0156k;
                    r14 = r14;
                    while (abstractC1040q2 != null) {
                        if ((abstractC1040q2.f11808f & 16) != 0) {
                            i9++;
                            r14 = r14;
                            if (i9 == 1) {
                                abstractC0156k = abstractC1040q2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new V.e(new AbstractC1040q[16]);
                                }
                                if (abstractC0156k != 0) {
                                    r14.b(abstractC0156k);
                                    abstractC0156k = 0;
                                }
                                r14.b(abstractC1040q2);
                            }
                        }
                        abstractC1040q2 = abstractC1040q2.f11811i;
                        abstractC0156k = abstractC0156k;
                        r14 = r14;
                    }
                    if (i9 == 1) {
                    }
                }
                abstractC0156k = AbstractC0157l.e(r14);
            }
        }
        return true;
    }

    public final void f(long j3, k.I i6) {
        C0.c cVar = this.f462d;
        if (cVar.c(j3) && i6.g(this) < 0) {
            cVar.i(j3);
            this.f463e.d(j3);
        }
        V.e eVar = this.a;
        Object[] objArr = eVar.f8759c;
        int i7 = eVar.f8761f;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C0038n) objArr[i8]).f(j3, i6);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f461c + ", children=" + this.a + ", pointerIds=" + this.f462d + ')';
    }
}
