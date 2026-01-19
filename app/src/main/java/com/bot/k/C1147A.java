package k;

import l.AbstractC1180a;

/* renamed from: k.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147A extends AbstractC1167n {

    /* renamed from: f, reason: collision with root package name */
    public int f12436f;

    public C1147A(int i6) {
        this.a = V.a;
        this.f12558b = AbstractC1169p.a;
        this.f12559c = AbstractC1180a.f12635c;
        if (i6 >= 0) {
            f(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f12561e = 0;
        long[] jArr = this.a;
        if (jArr != V.a) {
            Y3.k.p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i6 = this.f12560d;
            int i7 = i6 >> 3;
            long j3 = 255 << ((i6 & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j3)) | j3;
        }
        Y3.k.o0(null, this.f12559c, 0, this.f12560d);
        this.f12436f = V.a(this.f12560d) - this.f12561e;
    }

    public final int d(int i6) {
        long j3;
        long j4;
        int i7;
        long j5;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i8;
        int i9 = -862048943;
        int hashCode = Integer.hashCode(i6) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f12560d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j6 = ((jArr3[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr3[i16] >>> i17);
            long j7 = i12;
            int i19 = i15;
            int i20 = 0;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i13;
                int i21 = i9;
                int i22 = i20;
                if (this.f12558b[numberOfTrailingZeros] == i6) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i9 = i21;
                i20 = i22;
            }
            int i23 = i9;
            int i24 = i20;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int e6 = e(i11);
                long j10 = 255;
                if (this.f12436f != 0 || ((this.a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j7;
                    i7 = 1;
                    j5 = 128;
                } else {
                    int i25 = this.f12560d;
                    if (i25 > 8) {
                        j5 = 128;
                        if (Long.compareUnsigned(this.f12561e * 32, i25 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i26 = this.f12560d;
                            int[] iArr2 = this.f12558b;
                            Object[] objArr2 = this.f12559c;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = i24;
                            while (i28 < i27) {
                                long j11 = j10;
                                long j12 = jArr4[i28] & (-9187201950435737472L);
                                jArr4[i28] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i28++;
                                j7 = j7;
                                j10 = j11;
                            }
                            j3 = j10;
                            j4 = j7;
                            int u02 = Y3.k.u0(jArr4);
                            int i29 = u02 - 1;
                            long j13 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[u02] = jArr4[i24];
                            int i30 = i24;
                            while (i30 != i26) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j14 = (jArr4[i31] >> i32) & j3;
                                if (j14 != 128 && j14 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i30]) * i23;
                                    int i33 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e7 = e(i33);
                                    int i34 = i33 & i26;
                                    if (((e7 - i34) & i26) / 8 == ((i30 - i34) & i26) / 8) {
                                        long j15 = j13;
                                        jArr4[i31] = ((r8 & 127) << i32) | ((~(j3 << i32)) & jArr4[i31]);
                                        jArr4[jArr4.length - i18] = (jArr4[i24] & j15) | Long.MIN_VALUE;
                                        i30++;
                                        j13 = j15;
                                    } else {
                                        long j16 = j13;
                                        int i35 = e7 >> 3;
                                        long j17 = jArr4[i35];
                                        int i36 = (e7 & 7) << 3;
                                        if (((j17 >> i36) & j3) == 128) {
                                            i8 = i18;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j3 << i36)) & j17) | ((r8 & 127) << i36);
                                            jArr4[i31] = (jArr4[i31] & (~(j3 << i32))) | (128 << i32);
                                            iArr[e7] = iArr[i30];
                                            iArr[i30] = i24;
                                            objArr[e7] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i8 = i18;
                                            jArr4[i35] = ((r8 & 127) << i36) | ((~(j3 << i36)) & j17);
                                            int i37 = iArr[e7];
                                            iArr[e7] = iArr[i30];
                                            iArr[i30] = i37;
                                            Object obj = objArr[e7];
                                            objArr[e7] = objArr[i30];
                                            objArr[i30] = obj;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i24] & j16) | Long.MIN_VALUE;
                                        i30++;
                                        j13 = j16;
                                        i18 = i8;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            i7 = i18;
                            this.f12436f = V.a(this.f12560d) - this.f12561e;
                            e6 = e(i11);
                        }
                    } else {
                        j5 = 128;
                    }
                    j3 = 255;
                    j4 = j7;
                    i7 = 1;
                    int b5 = V.b(this.f12560d);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.f12558b;
                    Object[] objArr3 = this.f12559c;
                    int i38 = this.f12560d;
                    f(b5);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.f12558b;
                    Object[] objArr4 = this.f12559c;
                    int i39 = this.f12560d;
                    int i40 = i24;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j5) {
                            int i41 = iArr3[i40];
                            int hashCode3 = Integer.hashCode(i41) * i23;
                            int i42 = hashCode3 ^ (hashCode3 << 16);
                            int e8 = e(i42 >>> 7);
                            long j18 = i42 & 127;
                            int i43 = e8 >> 3;
                            int i44 = (e8 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = (jArr6[i43] & (~(255 << i44))) | (j18 << i44);
                            jArr[i43] = j19;
                            jArr[(((e8 - 7) & i39) + (i39 & 7)) >> 3] = j19;
                            iArr4[e8] = i41;
                            objArr4[e8] = objArr3[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e6 = e(i11);
                }
                this.f12561e++;
                int i45 = this.f12436f;
                long[] jArr7 = this.a;
                int i46 = e6 >> 3;
                long j20 = jArr7[i46];
                int i47 = (e6 & 7) << 3;
                if (((j20 >> i47) & j3) != j5) {
                    i7 = i24;
                }
                this.f12436f = i45 - i7;
                int i48 = this.f12560d;
                long j21 = (j20 & (~(j3 << i47))) | (j4 << i47);
                jArr7[i46] = j21;
                jArr7[(((e6 - 7) & i48) + (i48 & 7)) >> 3] = j21;
                return e6;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i9 = i23;
        }
    }

    public final int e(int i6) {
        int i7 = this.f12560d;
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

    public final void f(int i6) {
        long[] jArr;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12560d = max;
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
        this.f12436f = V.a(this.f12560d) - this.f12561e;
        this.f12558b = new int[max];
        this.f12559c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f12560d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
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
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f12558b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.h(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1147A.g(int):java.lang.Object");
    }

    public final Object h(int i6) {
        this.f12561e--;
        long[] jArr = this.a;
        int i7 = this.f12560d;
        int i8 = i6 >> 3;
        int i9 = (i6 & 7) << 3;
        long j3 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j3;
        jArr[(((i6 - 7) & i7) + (i7 & 7)) >> 3] = j3;
        Object[] objArr = this.f12559c;
        Object obj = objArr[i6];
        objArr[i6] = null;
        return obj;
    }

    public final void i(int i6, Object obj) {
        int d6 = d(i6);
        this.f12558b[d6] = i6;
        this.f12559c[d6] = obj;
    }

    public /* synthetic */ C1147A() {
        this(6);
    }
}
