package k;

import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151E {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f12447b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12448c;

    /* renamed from: d, reason: collision with root package name */
    public int f12449d;

    /* renamed from: e, reason: collision with root package name */
    public int f12450e;

    /* renamed from: f, reason: collision with root package name */
    public int f12451f;

    public C1151E(int i6) {
        this.a = V.a;
        this.f12447b = AbstractC1172t.a;
        this.f12448c = AbstractC1180a.f12635c;
        if (i6 >= 0) {
            f(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12450e = 0;
        long[] jArr = this.a;
        if (jArr != V.a) {
            Y3.k.p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i6 = this.f12449d;
            int i7 = i6 >> 3;
            long j3 = 255 << ((i6 & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j3)) | j3;
        }
        Y3.k.o0(null, this.f12448c, 0, this.f12449d);
        this.f12451f = V.a(this.f12449d) - this.f12450e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f12449d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f12447b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1151E.b(long):boolean");
    }

    public final int c(long j3) {
        long j4;
        long j5;
        int i6;
        int i7;
        long j6;
        long[] jArr;
        long[] jArr2;
        long j7;
        Object[] objArr;
        int i8;
        long[] jArr3;
        int i9 = -862048943;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12449d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr4 = this.a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j8 = ((jArr4[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr4[i16] >>> i17);
            long j9 = i12;
            int i19 = i15;
            int i20 = 0;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                int i21 = i9;
                if (this.f12447b[numberOfTrailingZeros] == j3) {
                    return numberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i9 = i21;
            }
            int i22 = i9;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int d6 = d(i11);
                if (this.f12451f != 0 || ((this.a[d6 >> 3] >> ((d6 & 7) << 3)) & 255) == 254) {
                    j4 = 255;
                    j5 = j9;
                    i6 = 0;
                    i7 = 1;
                    j6 = 128;
                } else {
                    int i23 = this.f12449d;
                    if (i23 > 8) {
                        j6 = 128;
                        if (Long.compareUnsigned(this.f12450e * 32, i23 * 25) <= 0) {
                            long[] jArr5 = this.a;
                            int i24 = this.f12449d;
                            long[] jArr6 = this.f12447b;
                            Object[] objArr2 = this.f12448c;
                            int i25 = (i24 + 7) >> 3;
                            j4 = 255;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j12 = jArr5[i26] & (-9187201950435737472L);
                                jArr5[i26] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i26++;
                                i18 = i18;
                                i20 = i20;
                                j9 = j9;
                            }
                            j5 = j9;
                            i6 = i20;
                            int i27 = i18;
                            char c6 = 7;
                            int u02 = Y3.k.u0(jArr5);
                            int i28 = u02 - 1;
                            long j13 = 72057594037927935L;
                            jArr5[i28] = (jArr5[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[u02] = jArr5[i6];
                            int i29 = i6;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j14 = (jArr5[i30] >> i31) & 255;
                                if (j14 != 128 && j14 == 254) {
                                    int hashCode2 = Long.hashCode(jArr6[i29]) * i22;
                                    int i32 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int d7 = d(i32);
                                    int i33 = i32 & i24;
                                    char c7 = c6;
                                    if (((d7 - i33) & i24) / 8 == ((i29 - i33) & i24) / 8) {
                                        int i34 = i27;
                                        j7 = j13;
                                        jArr5[i30] = ((r9 & 127) << i31) | (jArr5[i30] & (~(255 << i31)));
                                        jArr5[jArr5.length - i34] = (jArr5[i6] & j7) | Long.MIN_VALUE;
                                        i29++;
                                        i27 = i34;
                                        c6 = c7;
                                    } else {
                                        int i35 = i27;
                                        j7 = j13;
                                        int i36 = d7 >> 3;
                                        long j15 = jArr5[i36];
                                        int i37 = (d7 & 7) << 3;
                                        if (((j15 >> i37) & 255) == 128) {
                                            i8 = i35;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i36] = (j15 & (~(255 << i37))) | ((r9 & 127) << i37);
                                            jArr5[i30] = (jArr5[i30] & (~(255 << i31))) | (128 << i31);
                                            jArr3[d7] = jArr3[i29];
                                            jArr3[i29] = 0;
                                            objArr[d7] = objArr[i29];
                                            objArr[i29] = null;
                                        } else {
                                            objArr = objArr2;
                                            i8 = i35;
                                            jArr3 = jArr6;
                                            jArr5[i36] = ((r9 & 127) << i37) | (j15 & (~(255 << i37)));
                                            long j16 = jArr3[d7];
                                            jArr3[d7] = jArr3[i29];
                                            jArr3[i29] = j16;
                                            Object obj = objArr[d7];
                                            objArr[d7] = objArr[i29];
                                            objArr[i29] = obj;
                                            i29--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i6] & j7) | Long.MIN_VALUE;
                                        i29++;
                                        jArr6 = jArr3;
                                        i27 = i8;
                                        c6 = c7;
                                        objArr2 = objArr;
                                    }
                                    j13 = j7;
                                } else {
                                    i29++;
                                }
                            }
                            i7 = i27;
                            this.f12451f = V.a(this.f12449d) - this.f12450e;
                            d6 = d(i11);
                        }
                    } else {
                        j6 = 128;
                    }
                    j4 = 255;
                    j5 = j9;
                    i6 = 0;
                    i7 = 1;
                    int b5 = V.b(this.f12449d);
                    long[] jArr7 = this.a;
                    long[] jArr8 = this.f12447b;
                    Object[] objArr3 = this.f12448c;
                    int i38 = this.f12449d;
                    f(b5);
                    long[] jArr9 = this.a;
                    long[] jArr10 = this.f12447b;
                    Object[] objArr4 = this.f12448c;
                    int i39 = this.f12449d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr7[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j6) {
                            long j17 = jArr8[i40];
                            int hashCode3 = Long.hashCode(j17) * i22;
                            int i41 = hashCode3 ^ (hashCode3 << 16);
                            int d8 = d(i41 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j18 = i41 & 127;
                            int i42 = d8 >> 3;
                            int i43 = (d8 & 7) << 3;
                            long j19 = (jArr[i42] & (~(255 << i43))) | (j18 << i43);
                            jArr[i42] = j19;
                            jArr[(((d8 - 7) & i39) + (i39 & 7)) >> 3] = j19;
                            jArr10[d8] = j17;
                            objArr4[d8] = objArr3[i40];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i40++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    d6 = d(i11);
                }
                this.f12450e++;
                int i44 = this.f12451f;
                long[] jArr11 = this.a;
                int i45 = d6 >> 3;
                long j20 = jArr11[i45];
                int i46 = (d6 & 7) << 3;
                if (((j20 >> i46) & j4) != j6) {
                    i7 = i6;
                }
                this.f12451f = i44 - i7;
                int i47 = this.f12449d;
                long j21 = (j20 & (~(j4 << i46))) | (j5 << i46);
                jArr11[i45] = j21;
                jArr11[(((d6 - 7) & i47) + (i47 & 7)) >> 3] = j21;
                return d6;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i9 = i22;
        }
    }

    public final int d(int i6) {
        int i7 = this.f12449d;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i8 + (Long.numberOfTrailingZeros(j4) >> 3)) & i7;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f12449d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f12447b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r0 = r14.f12448c
            r0 = r0[r10]
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1151E.e(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof k.C1151E
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            k.E r1 = (k.C1151E) r1
            int r3 = r1.f12450e
            int r5 = r0.f12450e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f12447b
            java.lang.Object[] r5 = r0.f12448c
            long[] r6 = r0.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.e(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.e(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r15 = r2
            r16 = r3
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L76:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r15 = r2
            r16 = r3
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L87:
            r15 = r2
        L88:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1151E.equals(java.lang.Object):boolean");
    }

    public final void f(int i6) {
        long[] jArr;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12449d = max;
        if (max == 0) {
            jArr = V.a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Y3.k.p0(jArr, -9187201950435737472L);
        }
        this.a = jArr;
        int i7 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j3)) | j3;
        this.f12451f = V.a(this.f12449d) - this.f12450e;
        this.f12447b = new long[max];
        this.f12448c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f12449d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f12447b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L99
            r10 = -1
        L66:
            r0 = 0
            if (r10 < 0) goto L98
            int r1 = r14.f12450e
            int r1 = r1 + (-1)
            r14.f12450e = r1
            long[] r1 = r14.a
            int r2 = r14.f12449d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r1 = r14.f12448c
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L98:
            return r0
        L99:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1151E.g(long):java.lang.Object");
    }

    public final void h(long j3, Object obj) {
        int c6 = c(j3);
        this.f12447b[c6] = j3;
        this.f12448c[c6] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f12447b;
        Object[] objArr = this.f12448c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            long j3 = jArr2[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        int i10 = (i6 << 3) + i9;
                        long j4 = jArr[i10];
                        Object obj = objArr[i10];
                        i7 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j4);
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return i7;
                }
            }
            if (i6 == length) {
                return i7;
            }
            i6++;
        }
    }

    public final String toString() {
        int i6;
        int i7;
        if (this.f12450e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f12447b;
        Object[] objArr = this.f12448c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                long j3 = jArr2[i8];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((255 & j3) < 128) {
                            int i12 = (i8 << 3) + i11;
                            i7 = i8;
                            long j4 = jArr[i12];
                            Object obj = objArr[i12];
                            sb.append(j4);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i9++;
                            if (i9 < this.f12450e) {
                                sb.append(", ");
                            }
                        } else {
                            i7 = i8;
                        }
                        j3 >>= 8;
                        i11++;
                        i8 = i7;
                    }
                    int i13 = i8;
                    if (i10 != 8) {
                        break;
                    }
                    i6 = i13;
                } else {
                    i6 = i8;
                }
                if (i6 == length) {
                    break;
                }
                i8 = i6 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ C1151E() {
        this(6);
    }
}
