package k;

import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class H {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f12461b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12462c;

    /* renamed from: d, reason: collision with root package name */
    public int f12463d;

    /* renamed from: e, reason: collision with root package name */
    public int f12464e;

    /* renamed from: f, reason: collision with root package name */
    public int f12465f;

    public H(int i6) {
        this.a = V.a;
        this.f12461b = AbstractC1180a.f12635c;
        this.f12462c = AbstractC1169p.a;
        if (i6 >= 0) {
            e(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f12464e = 0;
        long[] jArr = this.a;
        if (jArr != V.a) {
            Y3.k.p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i6 = this.f12463d;
            int i7 = i6 >> 3;
            long j3 = 255 << ((i6 & 7) << 3);
            jArr2[i7] = (jArr2[i7] & (~j3)) | j3;
        }
        Y3.k.o0(null, this.f12461b, 0, this.f12463d);
        this.f12465f = V.a(this.f12463d) - this.f12464e;
    }

    public final int b(int i6) {
        int i7 = this.f12463d;
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

    public final int c(Object obj) {
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
        int i11 = this.f12463d;
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
                if (AbstractC1276k.b(this.f12461b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i7 = i17;
            }
            int i18 = i7;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int b5 = b(i9);
                long j10 = 255;
                if (this.f12465f != 0 || ((this.a[b5 >> 3] >> ((b5 & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j7;
                    j5 = 128;
                } else {
                    int i19 = this.f12463d;
                    if (i19 > 8) {
                        int i20 = 8;
                        if (Long.compareUnsigned(this.f12464e * 32, i19 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i21 = this.f12463d;
                            Object[] objArr2 = this.f12461b;
                            int[] iArr = this.f12462c;
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
                            long j13 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[u02] = jArr4[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j14 = (jArr4[i27] >> i28) & j3;
                                if (j14 != 128 && j14 == 254) {
                                    Object obj2 = objArr2[i26];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                    int i29 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int b6 = b(i29);
                                    int i30 = i29 & i21;
                                    long j15 = j13;
                                    if (((b6 - i30) & i21) / 8 == ((i26 - i30) & i21) / i24) {
                                        jArr4[i27] = ((r8 & 127) << i28) | (jArr4[i27] & (~(j3 << i28)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j15) | Long.MIN_VALUE;
                                        i26++;
                                        i24 = i24;
                                        j13 = j15;
                                    } else {
                                        int i31 = i24;
                                        int i32 = b6 >> 3;
                                        long j16 = jArr4[i32];
                                        int i33 = (b6 & 7) << 3;
                                        if (((j16 >> i33) & j3) == 128) {
                                            i6 = i21;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j3 << i33)) & j16) | ((r8 & 127) << i33);
                                            jArr4[i27] = (jArr4[i27] & (~(j3 << i28))) | (128 << i28);
                                            objArr[b6] = objArr[i26];
                                            objArr[i26] = null;
                                            iArr[b6] = iArr[i26];
                                            iArr[i26] = 0;
                                        } else {
                                            i6 = i21;
                                            objArr = objArr2;
                                            jArr4[i32] = ((r8 & 127) << i33) | ((~(j3 << i33)) & j16);
                                            Object obj3 = objArr[b6];
                                            objArr[b6] = objArr[i26];
                                            objArr[i26] = obj3;
                                            int i34 = iArr[b6];
                                            iArr[b6] = iArr[i26];
                                            iArr[i26] = i34;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j15) | Long.MIN_VALUE;
                                        i26++;
                                        i21 = i6;
                                        i24 = i31;
                                        j13 = j15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            this.f12465f = V.a(this.f12463d) - this.f12464e;
                            b5 = b(i9);
                        }
                    }
                    j3 = 255;
                    j4 = j7;
                    j5 = 128;
                    int b7 = V.b(this.f12463d);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.f12461b;
                    int[] iArr2 = this.f12462c;
                    int i35 = this.f12463d;
                    e(b7);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.f12461b;
                    int[] iArr3 = this.f12462c;
                    int i36 = this.f12463d;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i37];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i18;
                            int i38 = hashCode3 ^ (hashCode3 << 16);
                            int b8 = b(i38 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = i38 & 127;
                            int i39 = b8 >> 3;
                            int i40 = (b8 & 7) << 3;
                            long j18 = (jArr[i39] & (~(255 << i40))) | (j17 << i40);
                            jArr[i39] = j18;
                            jArr[(((b8 - 7) & i36) + (i36 & 7)) >> 3] = j18;
                            objArr4[b8] = obj4;
                            iArr3[b8] = iArr2[i37];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b5 = b(i9);
                }
                this.f12464e++;
                int i41 = this.f12465f;
                long[] jArr7 = this.a;
                int i42 = b5 >> 3;
                long j19 = jArr7[i42];
                int i43 = (b5 & 7) << 3;
                this.f12465f = i41 - (((j19 >> i43) & j3) == j5 ? 1 : 0);
                int i44 = this.f12463d;
                long j20 = (j19 & (~(j3 << i43))) | (j4 << i43);
                jArr7[i42] = j20;
                jArr7[(((b5 - 7) & i44) + (i44 & 7)) >> 3] = j20;
                return ~b5;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = i18;
        }
    }

    public final int d(Object obj) {
        int i6 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = hashCode ^ (hashCode << 16);
        int i8 = i7 & 127;
        int i9 = this.f12463d;
        int i10 = i7 >>> 7;
        while (true) {
            int i11 = i10 & i9;
            long[] jArr = this.a;
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j3 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j4 = (i8 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i11) & i9;
                if (AbstractC1276k.b(this.f12461b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i10 = i11 + i6;
        }
    }

    public final void e(int i6) {
        long[] jArr;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12463d = max;
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
        this.f12465f = V.a(this.f12463d) - this.f12464e;
        this.f12461b = new Object[max];
        this.f12462c = new int[max];
    }

    public final boolean equals(Object obj) {
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        if (h3.f12464e != this.f12464e) {
            return false;
        }
        Object[] objArr = this.f12461b;
        int[] iArr = this.f12462c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        loop0: while (true) {
            long j3 = jArr[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j3) < 128) {
                        int i9 = (i6 << 3) + i8;
                        Object obj2 = objArr[i9];
                        int i10 = iArr[i9];
                        int d6 = h3.d(obj2);
                        if (d6 < 0) {
                            break loop0;
                        }
                        z6 = z7;
                        if (i10 != h3.f12462c[d6]) {
                            break loop0;
                        }
                    } else {
                        z6 = z7;
                    }
                    j3 >>= 8;
                    i8++;
                    z7 = z6;
                }
                z5 = z7;
                if (i7 != 8) {
                    return z5;
                }
            } else {
                z5 = z7;
            }
            if (i6 == length) {
                return z5;
            }
            i6++;
            z7 = z5;
        }
        return false;
    }

    public final void f(int i6) {
        this.f12464e--;
        long[] jArr = this.a;
        int i7 = this.f12463d;
        int i8 = i6 >> 3;
        int i9 = (i6 & 7) << 3;
        long j3 = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        jArr[i8] = j3;
        jArr[(((i6 - 7) & i7) + (i7 & 7)) >> 3] = j3;
        this.f12461b[i6] = null;
    }

    public final void g(int i6, Object obj) {
        int c6 = c(obj);
        if (c6 < 0) {
            c6 = ~c6;
        }
        this.f12461b[c6] = obj;
        this.f12462c[c6] = i6;
    }

    public final int hashCode() {
        Object[] objArr = this.f12461b;
        int[] iArr = this.f12462c;
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
                        i7 += Integer.hashCode(iArr[i10]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f12464e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f12461b;
        int[] iArr = this.f12462c;
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
                            int i11 = iArr[i10];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i11);
                            i7++;
                            if (i7 < this.f12464e) {
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

    public /* synthetic */ H() {
        this(6);
    }
}
