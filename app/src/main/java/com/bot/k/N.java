package k;

import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class N {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12490b;

    /* renamed from: c, reason: collision with root package name */
    public int f12491c;

    /* renamed from: d, reason: collision with root package name */
    public int f12492d;

    /* renamed from: e, reason: collision with root package name */
    public int f12493e;

    public N(int i6) {
        this.a = V.a;
        this.f12490b = AbstractC1180a.f12635c;
        if (i6 >= 0) {
            f(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i6 = this.f12492d;
        this.f12490b[d(obj)] = obj;
        return this.f12492d != i6;
    }

    public final void b() {
        this.f12492d = 0;
        long[] jArr = this.a;
        if (jArr != V.a) {
            Y3.k.p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i6 = this.f12491c;
            int i7 = i6 >> 3;
            long j3 = 255 << ((i6 & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j3)) | j3;
        }
        Y3.k.o0(null, this.f12490b, 0, this.f12491c);
        this.f12493e = V.a(this.f12491c) - this.f12492d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12491c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12490b
            r15 = r15[r11]
            boolean r15 = m4.AbstractC1276k.b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: k.N.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        int i6;
        Object[] objArr;
        int i7;
        int i8 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f12491c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j7 = i11;
            int i17 = i11;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j9) >> 3)) & i12;
                int i18 = i8;
                if (AbstractC1276k.b(this.f12490b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i8 = i18;
            }
            int i19 = i8;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int e6 = e(i10);
                long j10 = 255;
                if (this.f12493e != 0 || ((this.a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j7;
                    j5 = 128;
                } else {
                    int i20 = this.f12491c;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compareUnsigned(this.f12492d * 32, i20 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i22 = this.f12491c;
                            Object[] objArr2 = this.f12490b;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            j5 = 128;
                            while (i24 < i23) {
                                long j11 = j10;
                                long j12 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i24++;
                                i21 = i21;
                                j7 = j7;
                                j10 = j11;
                            }
                            j3 = j10;
                            j4 = j7;
                            int i25 = i21;
                            int u02 = Y3.k.u0(jArr4);
                            int i26 = u02 - 1;
                            long j13 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[u02] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j14 = (jArr4[i28] >> i29) & j3;
                                if (j14 != 128 && j14 == 254) {
                                    Object obj2 = objArr2[i27];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e7 = e(i30);
                                    int i31 = i30 & i22;
                                    if (((e7 - i31) & i22) / i25 == ((i27 - i31) & i22) / i25) {
                                        long j15 = j13;
                                        jArr4[i28] = ((r7 & 127) << i29) | ((~(j3 << i29)) & jArr4[i28]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j15) | Long.MIN_VALUE;
                                        i27++;
                                        j13 = j15;
                                    } else {
                                        long j16 = j13;
                                        int i32 = e7 >> 3;
                                        long j17 = jArr4[i32];
                                        int i33 = (e7 & 7) << 3;
                                        if (((j17 >> i33) & j3) == 128) {
                                            i7 = i25;
                                            i6 = i22;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j3 << i33)) & j17) | ((r7 & 127) << i33);
                                            jArr4[i28] = (jArr4[i28] & (~(j3 << i29))) | (128 << i29);
                                            objArr[e7] = objArr[i27];
                                            objArr[i27] = null;
                                        } else {
                                            i6 = i22;
                                            objArr = objArr2;
                                            i7 = i25;
                                            jArr4[i32] = ((r7 & 127) << i33) | ((~(j3 << i33)) & j17);
                                            Object obj3 = objArr[e7];
                                            objArr[e7] = objArr[i27];
                                            objArr[i27] = obj3;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j16) | Long.MIN_VALUE;
                                        i27++;
                                        j13 = j16;
                                        i25 = i7;
                                        i22 = i6;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f12493e = V.a(this.f12491c) - this.f12492d;
                            e6 = e(i10);
                        }
                    }
                    j3 = 255;
                    j4 = j7;
                    j5 = 128;
                    int b5 = V.b(this.f12491c);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.f12490b;
                    int i34 = this.f12491c;
                    f(b5);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.f12490b;
                    int i35 = this.f12491c;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i36];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int e8 = e(i37 >>> 7);
                            long j18 = i37 & 127;
                            int i38 = e8 >> 3;
                            int i39 = (e8 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = (jArr6[i38] & (~(255 << i39))) | (j18 << i39);
                            jArr[i38] = j19;
                            jArr[(((e8 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            objArr4[e8] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e6 = e(i10);
                }
                this.f12492d++;
                int i40 = this.f12493e;
                long[] jArr7 = this.a;
                int i41 = e6 >> 3;
                long j20 = jArr7[i41];
                int i42 = (e6 & 7) << 3;
                this.f12493e = i40 - (((j20 >> i42) & j3) == j5 ? 1 : 0);
                int i43 = this.f12491c;
                long j21 = (j20 & (~(j3 << i42))) | (j4 << i42);
                jArr7[i41] = j21;
                jArr7[(((e6 - 7) & i43) + (i43 & 7)) >> 3] = j21;
                return e6;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i8 = i19;
        }
    }

    public final int e(int i6) {
        int i7 = this.f12491c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        if (n3.f12492d != this.f12492d) {
            return false;
        }
        Object[] objArr = this.f12490b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128 && !n3.c(objArr[(i6 << 3) + i8])) {
                            return false;
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        return true;
    }

    public final void f(int i6) {
        long[] jArr;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12491c = max;
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
        this.f12493e = V.a(this.f12491c) - this.f12492d;
        this.f12490b = max == 0 ? AbstractC1180a.f12635c : new Object[max];
    }

    public final boolean g() {
        return this.f12492d == 0;
    }

    public final boolean h() {
        return this.f12492d != 0;
    }

    public final int hashCode() {
        int i6 = (this.f12491c * 31) + this.f12492d;
        Object[] objArr = this.f12490b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j3 = jArr[i7];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i7 << 3) + i9];
                            if (!AbstractC1276k.b(obj, this)) {
                                i6 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i8 != 8) {
                        return i6;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f12491c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f12490b
            r11 = r11[r10]
            boolean r11 = m4.AbstractC1276k.b(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: k.N.i(java.lang.Object):void");
    }

    public final void j(Object obj) {
        this.f12490b[d(obj)] = obj;
    }

    public final void k(N n3) {
        AbstractC1276k.f(n3, "elements");
        Object[] objArr = n3.f12490b;
        long[] jArr = n3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j3) < 128) {
                        j(objArr[(i6 << 3) + i8]);
                    }
                    j3 >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f12491c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f12490b
            r15 = r15[r11]
            boolean r15 = m4.AbstractC1276k.b(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: k.N.l(java.lang.Object):boolean");
    }

    public final void m(int i6) {
        this.f12492d--;
        long[] jArr = this.a;
        int i7 = this.f12491c;
        int i8 = i6 >> 3;
        int i9 = (i6 & 7) << 3;
        long j3 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j3;
        jArr[(((i6 - 7) & i7) + (i7 & 7)) >> 3] = j3;
        this.f12490b[i6] = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f12490b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i6 << 3) + i9];
                            if (i7 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i7++;
                        }
                        j3 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ N() {
        this(6);
    }
}
