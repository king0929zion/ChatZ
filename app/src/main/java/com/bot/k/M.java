package k;

import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class M {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12485b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12486c;

    /* renamed from: d, reason: collision with root package name */
    public int f12487d;

    /* renamed from: e, reason: collision with root package name */
    public int f12488e;

    /* renamed from: f, reason: collision with root package name */
    public int f12489f;

    public M(int i6) {
        this.a = V.a;
        Object[] objArr = AbstractC1180a.f12635c;
        this.f12485b = objArr;
        this.f12486c = objArr;
        if (i6 >= 0) {
            h(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12488e = 0;
        long[] jArr = this.a;
        if (jArr != V.a) {
            Y3.k.p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i6 = this.f12487d;
            int i7 = i6 >> 3;
            long j3 = 255 << ((i6 & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j3)) | j3;
        }
        Y3.k.o0(null, this.f12486c, 0, this.f12487d);
        Y3.k.o0(null, this.f12485b, 0, this.f12487d);
        this.f12489f = V.a(this.f12487d) - this.f12488e;
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
    public final boolean b(java.lang.Object r18) {
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
            int r5 = r0.f12487d
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
            java.lang.Object[] r15 = r0.f12485b
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
        throw new UnsupportedOperationException("Method not decompiled: k.M.b(java.lang.Object):boolean");
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
            int r5 = r0.f12487d
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
            java.lang.Object[] r15 = r0.f12485b
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
        throw new UnsupportedOperationException("Method not decompiled: k.M.c(java.lang.Object):boolean");
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f12486c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128 && AbstractC1276k.b(obj, objArr[(i6 << 3) + i8])) {
                            return true;
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
        return false;
    }

    public final int e(int i6) {
        int i7 = this.f12487d;
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
        if (!(obj instanceof M)) {
            return false;
        }
        M m3 = (M) obj;
        if (m3.f12488e != this.f12488e) {
            return false;
        }
        Object[] objArr = this.f12485b;
        Object[] objArr2 = this.f12486c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            loop0: while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj2 = objArr[i9];
                            Object obj3 = objArr2[i9];
                            if (obj3 == null) {
                                if (m3.g(obj2) != null || !m3.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(m3.g(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        int i6;
        Object[] objArr;
        int i7 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f12487d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j7 = i10;
            int i16 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                int i17 = i7;
                if (AbstractC1276k.b(this.f12485b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i7 = i17;
            }
            int i18 = i7;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int e6 = e(i9);
                long j10 = 255;
                if (this.f12489f != 0 || ((this.a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j7;
                    j5 = 128;
                } else {
                    int i19 = this.f12487d;
                    if (i19 > 8) {
                        int i20 = 8;
                        if (Long.compareUnsigned(this.f12488e * 32, i19 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i21 = this.f12487d;
                            Object[] objArr2 = this.f12485b;
                            Object[] objArr3 = this.f12486c;
                            j5 = 128;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            while (i23 < i22) {
                                long j11 = j10;
                                long j12 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i23++;
                                i20 = i20;
                                j7 = j7;
                                j10 = j11;
                            }
                            j3 = j10;
                            j4 = j7;
                            int i24 = i20;
                            int u02 = Y3.k.u0(jArr4);
                            int i25 = u02 - 1;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[u02] = jArr4[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j13 = (jArr4[i27] >> i28) & j3;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr2[i26];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                    int i29 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e7 = e(i29);
                                    int i30 = i29 & i21;
                                    if (((e7 - i30) & i21) / i24 == ((i26 - i30) & i21) / i24) {
                                        jArr4[i27] = ((r8 & 127) << i28) | (jArr4[i27] & (~(j3 << i28)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i26++;
                                        i24 = i24;
                                    } else {
                                        int i31 = i24;
                                        int i32 = e7 >> 3;
                                        long j14 = jArr4[i32];
                                        int i33 = (e7 & 7) << 3;
                                        if (((j14 >> i33) & j3) == 128) {
                                            i6 = i21;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j3 << i33)) & j14) | ((r8 & 127) << i33);
                                            jArr4[i27] = (jArr4[i27] & (~(j3 << i28))) | (128 << i28);
                                            objArr[e7] = objArr[i26];
                                            objArr[i26] = null;
                                            objArr3[e7] = objArr3[i26];
                                            objArr3[i26] = null;
                                        } else {
                                            i6 = i21;
                                            objArr = objArr2;
                                            jArr4[i32] = ((r8 & 127) << i33) | ((~(j3 << i33)) & j14);
                                            Object obj3 = objArr[e7];
                                            objArr[e7] = objArr[i26];
                                            objArr[i26] = obj3;
                                            Object obj4 = objArr3[e7];
                                            objArr3[e7] = objArr3[i26];
                                            objArr3[i26] = obj4;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i26++;
                                        i24 = i31;
                                        i21 = i6;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            this.f12489f = V.a(this.f12487d) - this.f12488e;
                            e6 = e(i9);
                        }
                    }
                    j3 = 255;
                    j4 = j7;
                    j5 = 128;
                    int b5 = V.b(this.f12487d);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.f12485b;
                    Object[] objArr5 = this.f12486c;
                    int i34 = this.f12487d;
                    h(b5);
                    long[] jArr6 = this.a;
                    Object[] objArr6 = this.f12485b;
                    Object[] objArr7 = this.f12486c;
                    int i35 = this.f12487d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i36];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i18;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int e8 = e(i37 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i37 & 127;
                            int i38 = e8 >> 3;
                            int i39 = (e8 & 7) << 3;
                            long j16 = (jArr[i38] & (~(255 << i39))) | (j15 << i39);
                            jArr[i38] = j16;
                            jArr[(((e8 - 7) & i35) + (i35 & 7)) >> 3] = j16;
                            objArr6[e8] = obj5;
                            objArr7[e8] = objArr5[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e6 = e(i9);
                }
                this.f12488e++;
                int i40 = this.f12489f;
                long[] jArr7 = this.a;
                int i41 = e6 >> 3;
                long j17 = jArr7[i41];
                int i42 = (e6 & 7) << 3;
                this.f12489f = i40 - (((j17 >> i42) & j3) == j5 ? 1 : 0);
                int i43 = this.f12487d;
                long j18 = (j17 & (~(j3 << i42))) | (j4 << i42);
                jArr7[i41] = j18;
                jArr7[(((e6 - 7) & i43) + (i43 & 7)) >> 3] = j18;
                return ~e6;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r14) {
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
            int r3 = r13.f12487d
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
            java.lang.Object[] r11 = r13.f12485b
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.f12486c
            r14 = r14[r10]
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: k.M.g(java.lang.Object):java.lang.Object");
    }

    public final void h(int i6) {
        long[] jArr;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12487d = max;
        if (max == 0) {
            jArr = V.a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Y3.k.p0(jArr, -9187201950435737472L);
            int i7 = max >> 3;
            long j3 = 255 << ((max & 7) << 3);
            jArr[i7] = (jArr[i7] & (~j3)) | j3;
        }
        this.a = jArr;
        this.f12489f = V.a(this.f12487d) - this.f12488e;
        Object[] objArr = AbstractC1180a.f12635c;
        this.f12485b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f12486c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f12485b;
        Object[] objArr2 = this.f12486c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        int i10 = (i6 << 3) + i9;
                        Object obj = objArr[i10];
                        Object obj2 = objArr2[i10];
                        i7 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f12488e == 0;
    }

    public final boolean j() {
        return this.f12488e != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r14) {
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
            int r3 = r13.f12487d
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
            java.lang.Object[] r11 = r13.f12485b
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.l(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: k.M.k(java.lang.Object):java.lang.Object");
    }

    public final Object l(int i6) {
        this.f12488e--;
        long[] jArr = this.a;
        int i7 = this.f12487d;
        int i8 = i6 >> 3;
        int i9 = (i6 & 7) << 3;
        long j3 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j3;
        jArr[(((i6 - 7) & i7) + (i7 & 7)) >> 3] = j3;
        this.f12485b[i6] = null;
        Object[] objArr = this.f12486c;
        Object obj = objArr[i6];
        objArr[i6] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f6 = f(obj);
        if (f6 < 0) {
            f6 = ~f6;
        }
        this.f12485b[f6] = obj;
        this.f12486c[f6] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f12485b;
        Object[] objArr2 = this.f12486c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j3) < 128) {
                            int i10 = (i6 << 3) + i9;
                            Object obj = objArr[i10];
                            Object obj2 = objArr2[i10];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i7++;
                            if (i7 < this.f12488e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ M() {
        this(6);
    }
}
