package k;

import com.vladsch.flexmark.util.format.TableCell;
import java.util.Arrays;
import java.util.Collection;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class J {
    public long[] a = V.a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12468b = AbstractC1180a.f12635c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f12469c = AbstractC1174v.f12576b;

    /* renamed from: d, reason: collision with root package name */
    public int f12470d = TableCell.NOT_TRACKED;

    /* renamed from: e, reason: collision with root package name */
    public int f12471e = TableCell.NOT_TRACKED;

    /* renamed from: f, reason: collision with root package name */
    public int f12472f;

    /* renamed from: g, reason: collision with root package name */
    public int f12473g;

    /* renamed from: h, reason: collision with root package name */
    public int f12474h;

    public J(int i6) {
        if (i6 >= 0) {
            f(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i6 = this.f12473g;
        int d6 = d(obj);
        this.f12468b[d6] = obj;
        long[] jArr = this.f12469c;
        int i7 = this.f12470d;
        jArr[d6] = (i7 & 2147483647L) | 4611686016279904256L;
        if (i7 != Integer.MAX_VALUE) {
            jArr[i7] = ((d6 & 2147483647L) << 31) | (jArr[i7] & (-4611686016279904257L));
        }
        this.f12470d = d6;
        if (this.f12471e == Integer.MAX_VALUE) {
            this.f12471e = d6;
        }
        return this.f12473g != i6;
    }

    public final void b() {
        this.f12473g = 0;
        long[] jArr = this.a;
        if (jArr != V.a) {
            Y3.k.p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i6 = this.f12472f;
            int i7 = i6 >> 3;
            long j3 = 255 << ((i6 & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j3)) | j3;
        }
        Y3.k.o0(null, this.f12468b, 0, this.f12472f);
        Y3.k.p0(this.f12469c, 4611686018427387903L);
        this.f12470d = TableCell.NOT_TRACKED;
        this.f12471e = TableCell.NOT_TRACKED;
        this.f12474h = V.a(this.f12472f) - this.f12473g;
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
            int r5 = r0.f12472f
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
            java.lang.Object[] r15 = r0.f12468b
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
        throw new UnsupportedOperationException("Method not decompiled: k.J.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i6;
        long j3;
        long j4;
        long j5;
        char c6;
        long[] jArr;
        long[] jArr2;
        long j6;
        int i7 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f12472f;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j7 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j8 = i10;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                int i16 = i7;
                if (AbstractC1276k.b(this.f12468b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j10 &= j10 - 1;
                i7 = i16;
            }
            int i17 = i7;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int e6 = e(i9);
                long j11 = 255;
                if (this.f12474h != 0 || ((this.a[e6 >> 3] >> ((e6 & 7) << 3)) & 255) == 254) {
                    i6 = 0;
                    j3 = j8;
                    j4 = 255;
                    j5 = 128;
                } else {
                    int i18 = this.f12472f;
                    if (i18 > 8) {
                        c6 = 31;
                        j5 = 128;
                        if (Long.compareUnsigned(this.f12473g * 32, i18 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            if (jArr4 == null) {
                                i6 = 0;
                                j3 = j8;
                                j4 = 255;
                            } else {
                                int i19 = this.f12472f;
                                Object[] objArr = this.f12468b;
                                long[] jArr5 = this.f12469c;
                                long[] jArr6 = new long[i19];
                                Arrays.fill(jArr6, 0, i19, 9223372034707292159L);
                                i6 = 0;
                                int i20 = (i19 + 7) >> 3;
                                int i21 = 0;
                                while (i21 < i20) {
                                    long j12 = j11;
                                    long j13 = jArr4[i21] & (-9187201950435737472L);
                                    int i22 = i21;
                                    jArr4[i22] = ((~j13) + (j13 >>> 7)) & (-72340172838076674L);
                                    i21 = i22 + 1;
                                    j11 = j12;
                                }
                                j4 = j11;
                                int length = jArr4.length;
                                int i23 = length - 1;
                                int i24 = length - 2;
                                jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i23] = jArr4[0];
                                int i25 = 0;
                                while (i25 != i19) {
                                    int i26 = i25 >> 3;
                                    int i27 = (i25 & 7) << 3;
                                    long j14 = (jArr4[i26] >> i27) & j4;
                                    if (j14 != 128 && j14 == 254) {
                                        Object obj2 = objArr[i25];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i17;
                                        int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e7 = e(i28);
                                        int i29 = i28 & i19;
                                        if (((e7 - i29) & i19) / 8 == ((i25 - i29) & i19) / 8) {
                                            int i30 = i19;
                                            Object[] objArr2 = objArr;
                                            jArr4[i26] = (jArr4[i26] & (~(j4 << i27))) | ((r17 & 127) << i27);
                                            if (jArr6[i25] == 9223372034707292159L) {
                                                long j15 = i25;
                                                jArr6[i25] = j15 | (j15 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i25++;
                                            i19 = i30;
                                            objArr = objArr2;
                                        } else {
                                            int i31 = i19;
                                            Object[] objArr3 = objArr;
                                            int i32 = e7 >> 3;
                                            long j16 = jArr4[i32];
                                            int i33 = (e7 & 7) << 3;
                                            if (((j16 >> i33) & j4) == 128) {
                                                jArr4[i32] = (j16 & (~(j4 << i33))) | ((r17 & 127) << i33);
                                                jArr4[i26] = (jArr4[i26] & (~(j4 << i27))) | (128 << i27);
                                                objArr3[e7] = objArr3[i25];
                                                objArr3[i25] = null;
                                                jArr5[e7] = jArr5[i25];
                                                jArr5[i25] = 4611686018427387903L;
                                                int i34 = (int) ((jArr6[i25] >> 32) & 4294967295L);
                                                int i35 = TableCell.NOT_TRACKED;
                                                if (i34 != Integer.MAX_VALUE) {
                                                    j6 = j8;
                                                    jArr6[i34] = e7 | (jArr6[i34] & (-4294967296L));
                                                    jArr6[i25] = (jArr6[i25] & 4294967295L) | (-4294967296L);
                                                    i35 = TableCell.NOT_TRACKED;
                                                } else {
                                                    j6 = j8;
                                                    jArr6[i25] = (TableCell.NOT_TRACKED << 32) | e7;
                                                }
                                                jArr6[e7] = (i25 << 32) | i35;
                                            } else {
                                                j6 = j8;
                                                jArr4[i32] = ((r17 & 127) << i33) | (j16 & (~(j4 << i33)));
                                                Object obj3 = objArr3[e7];
                                                objArr3[e7] = objArr3[i25];
                                                objArr3[i25] = obj3;
                                                long j17 = jArr5[e7];
                                                jArr5[e7] = jArr5[i25];
                                                jArr5[i25] = j17;
                                                int i36 = (int) ((jArr6[i25] >> 32) & 4294967295L);
                                                if (i36 != Integer.MAX_VALUE) {
                                                    long j18 = e7;
                                                    jArr6[i36] = (jArr6[i36] & (-4294967296L)) | j18;
                                                    jArr6[i25] = (jArr6[i25] & 4294967295L) | (j18 << 32);
                                                } else {
                                                    long j19 = e7;
                                                    jArr6[i25] = j19 | (j19 << 32);
                                                    i36 = i25;
                                                }
                                                jArr6[e7] = (i36 << 32) | i25;
                                                i25--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i25++;
                                            i19 = i31;
                                            objArr = objArr3;
                                            j8 = j6;
                                        }
                                    } else {
                                        i25++;
                                    }
                                }
                                j3 = j8;
                                this.f12474h = V.a(this.f12472f) - this.f12473g;
                                long[] jArr7 = this.f12469c;
                                int length2 = jArr7.length;
                                for (int i37 = 0; i37 < length2; i37++) {
                                    long j20 = jArr7[i37];
                                    jArr7[i37] = (((j20 & (-4611686018427387904L)) | (((int) ((j20 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j20 & 2147483647L)) == Integer.MAX_VALUE ? TableCell.NOT_TRACKED : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i38 = this.f12470d;
                                if (i38 != Integer.MAX_VALUE) {
                                    this.f12470d = (int) (jArr6[i38] & 4294967295L);
                                }
                                int i39 = this.f12471e;
                                if (i39 != Integer.MAX_VALUE) {
                                    this.f12471e = (int) (jArr6[i39] & 4294967295L);
                                }
                            }
                            e6 = e(i9);
                        }
                    } else {
                        c6 = 31;
                        j5 = 128;
                    }
                    i6 = 0;
                    j3 = j8;
                    j4 = 255;
                    int b5 = V.b(this.f12472f);
                    long[] jArr8 = this.a;
                    Object[] objArr4 = this.f12468b;
                    long[] jArr9 = this.f12469c;
                    int i40 = this.f12472f;
                    int[] iArr = new int[i40];
                    f(b5);
                    long[] jArr10 = this.a;
                    Object[] objArr5 = this.f12468b;
                    long[] jArr11 = this.f12469c;
                    int i41 = this.f12472f;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr8[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j5) {
                            Object obj4 = objArr4[i42];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i17;
                            int i43 = hashCode3 ^ (hashCode3 << 16);
                            int e8 = e(i43 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j21 = i43 & 127;
                            int i44 = e8 >> 3;
                            int i45 = (e8 & 7) << 3;
                            long j22 = (jArr[i44] & (~(255 << i45))) | (j21 << i45);
                            jArr[i44] = j22;
                            jArr[(((e8 - 7) & i41) + (i41 & 7)) >> 3] = j22;
                            objArr5[e8] = obj4;
                            jArr11[e8] = jArr9[i42];
                            iArr[i42] = e8;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i42++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f12469c;
                    int length3 = jArr12.length;
                    for (int i46 = 0; i46 < length3; i46++) {
                        long j23 = jArr12[i46];
                        jArr12[i46] = (((j23 & (-4611686018427387904L)) | (((int) ((j23 >> c6) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c6) | (((int) (j23 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i47 = this.f12470d;
                    if (i47 != Integer.MAX_VALUE) {
                        this.f12470d = iArr[i47];
                    }
                    int i48 = this.f12471e;
                    if (i48 != Integer.MAX_VALUE) {
                        this.f12471e = iArr[i48];
                    }
                    e6 = e(i9);
                }
                this.f12473g++;
                int i49 = this.f12474h;
                long[] jArr13 = this.a;
                int i50 = e6 >> 3;
                long j24 = jArr13[i50];
                int i51 = (e6 & 7) << 3;
                if (((j24 >> i51) & j4) == j5) {
                    i6 = 1;
                }
                this.f12474h = i49 - i6;
                int i52 = this.f12472f;
                long j25 = (j24 & (~(j4 << i51))) | (j3 << i51);
                jArr13[i50] = j25;
                jArr13[(((e6 - 7) & i52) + (i52 & 7)) >> 3] = j25;
                return e6;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i7 = i17;
        }
    }

    public final int e(int i6) {
        int i7 = this.f12472f;
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
        if (!(obj instanceof J)) {
            return false;
        }
        J j3 = (J) obj;
        if (j3.f12473g != this.f12473g) {
            return false;
        }
        Object[] objArr = this.f12468b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j4 = jArr[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j4) < 128 && !j3.c(objArr[(i6 << 3) + i8])) {
                            return false;
                        }
                        j4 >>= 8;
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
        long[] jArr2;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12472f = max;
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
        this.f12474h = V.a(this.f12472f) - this.f12473g;
        this.f12468b = max == 0 ? AbstractC1180a.f12635c : new Object[max];
        if (max == 0) {
            jArr2 = AbstractC1174v.f12576b;
        } else {
            jArr2 = new long[max];
            Y3.k.p0(jArr2, 4611686018427387903L);
        }
        this.f12469c = jArr2;
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
    public final boolean g(java.lang.Object r18) {
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
            int r5 = r0.f12472f
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
            java.lang.Object[] r15 = r0.f12468b
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
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: k.J.g(java.lang.Object):boolean");
    }

    public final void h(int i6) {
        this.f12473g--;
        long[] jArr = this.a;
        int i7 = this.f12472f;
        int i8 = i6 >> 3;
        int i9 = (i6 & 7) << 3;
        long j3 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j3;
        jArr[(((i6 - 7) & i7) + (i7 & 7)) >> 3] = j3;
        this.f12468b[i6] = null;
        long[] jArr2 = this.f12469c;
        long j4 = jArr2[i6];
        int i10 = (int) ((j4 >> 31) & 2147483647L);
        int i11 = (int) (j4 & 2147483647L);
        if (i10 != Integer.MAX_VALUE) {
            jArr2[i10] = (jArr2[i10] & (-2147483648L)) | (i11 & 2147483647L);
        } else {
            this.f12470d = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = ((i10 & 2147483647L) << 31) | (jArr2[i11] & (-4611686016279904257L));
        } else {
            this.f12471e = i10;
        }
        jArr2[i6] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i6 = (this.f12472f * 31) + this.f12473g;
        Object[] objArr = this.f12468b;
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

    public final boolean i(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        Object[] objArr = this.f12468b;
        int i6 = this.f12473g;
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
                            int i10 = (i7 << 3) + i9;
                            if (!Y3.m.j0(collection, objArr[i10])) {
                                h(i10);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return i6 != this.f12473g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f12468b;
        long[] jArr = this.f12469c;
        int i6 = this.f12471e;
        int i7 = 0;
        while (true) {
            if (i6 == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i8 = (int) ((jArr[i6] >> 31) & 2147483647L);
            Object obj = objArr[i6];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i7++;
            i6 = i8;
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
