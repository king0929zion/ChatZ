package k;

import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149C {
    public long[] a = V.a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f12441b = AbstractC1172t.a;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12442c = AbstractC1169p.a;

    /* renamed from: d, reason: collision with root package name */
    public int f12443d;

    /* renamed from: e, reason: collision with root package name */
    public int f12444e;

    /* renamed from: f, reason: collision with root package name */
    public int f12445f;

    public C1149C(int i6) {
        if (i6 >= 0) {
            d(V.d(i6));
        } else {
            AbstractC1180a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i6) {
        int i7 = this.f12443d;
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

    public final int b(long j3) {
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f12443d;
        int i9 = (i6 >>> 7) & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j4 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j5 = (i7 * 72340172838076673L) ^ j4;
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i8;
                if (this.f12441b[numberOfTrailingZeros] == j3) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final int c(long j3) {
        int b5 = b(j3);
        if (b5 >= 0) {
            return this.f12442c[b5];
        }
        AbstractC1180a.e("Cannot find value for key " + j3);
        throw null;
    }

    public final void d(int i6) {
        long[] jArr;
        int max = i6 > 0 ? Math.max(7, V.c(i6)) : 0;
        this.f12443d = max;
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
        this.f12445f = V.a(this.f12443d) - this.f12444e;
        this.f12441b = new long[max];
        this.f12442c = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r38.f12445f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (((r38.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r1 = r38.f12443d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (java.lang.Long.compareUnsigned(r38.f12444e * 32, r1 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        r1 = r38.a;
        r2 = r38.f12443d;
        r4 = r38.f12441b;
        r5 = r38.f12442c;
        r6 = (r2 + 7) >> 3;
        r25 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (r7 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        r29 = r10;
        r27 = r12;
        r11 = r13;
        r8 = 7;
        r6 = Y3.k.u0(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r27];
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
    
        if (r6 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0110, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0124, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0127, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = a(r10);
        r10 = r10 & r2;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0148, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016d, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017e, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0180, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d1, code lost:
    
        r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r28;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ac, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014a, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r28;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011f, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e9, code lost:
    
        r18 = r11;
        r38.f12445f = k.V.a(r38.f12443d) - r38.f12444e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027b, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027f, code lost:
    
        r38.f12444e++;
        r2 = r38.f12445f;
        r3 = r38.a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        if (((r5 >> r7) & r25) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029a, code lost:
    
        r18 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029c, code lost:
    
        r38.f12445f = r2 - r18;
        r2 = r38.f12443d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fa, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0208, code lost:
    
        r1 = k.V.b(r38.f12443d);
        r2 = r38.a;
        r4 = r38.f12441b;
        r5 = r38.f12442c;
        r6 = r38.f12443d;
        d(r1);
        r1 = r38.a;
        r7 = r38.f12441b;
        r8 = r38.f12442c;
        r9 = r38.f12443d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0223, code lost:
    
        if (r10 >= r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0232, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0234, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0275, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0272, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0205, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0099, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r39, int r41) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C1149C.e(long, int):void");
    }

    public final boolean equals(Object obj) {
        boolean z5;
        long[] jArr;
        boolean z6;
        long[] jArr2;
        boolean z7 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1149C)) {
            return false;
        }
        C1149C c1149c = (C1149C) obj;
        if (c1149c.f12444e != this.f12444e) {
            return false;
        }
        long[] jArr3 = this.f12441b;
        int[] iArr = this.f12442c;
        long[] jArr4 = this.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        loop0: while (true) {
            long j3 = jArr4[i6];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j3) < 128) {
                        int i9 = (i6 << 3) + i8;
                        z6 = z7;
                        jArr2 = jArr3;
                        long j4 = jArr2[i9];
                        int i10 = iArr[i9];
                        int b5 = c1149c.b(j4);
                        if (b5 < 0 || i10 != c1149c.f12442c[b5]) {
                            break loop0;
                        }
                    } else {
                        z6 = z7;
                        jArr2 = jArr3;
                    }
                    j3 >>= 8;
                    i8++;
                    z7 = z6;
                    jArr3 = jArr2;
                }
                z5 = z7;
                jArr = jArr3;
                if (i7 != 8) {
                    return z5;
                }
            } else {
                z5 = z7;
                jArr = jArr3;
            }
            if (i6 == length) {
                return z5;
            }
            i6++;
            z7 = z5;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f12441b;
        int[] iArr = this.f12442c;
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
                        i7 += Integer.hashCode(iArr[i10]) ^ Long.hashCode(j4);
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
        if (this.f12444e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f12441b;
        int[] iArr = this.f12442c;
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
                            int i13 = iArr[i12];
                            sb.append(j4);
                            sb.append("=");
                            sb.append(i13);
                            i9++;
                            if (i9 < this.f12444e) {
                                sb.append(", ");
                            }
                        } else {
                            i7 = i8;
                        }
                        j3 >>= 8;
                        i11++;
                        i8 = i7;
                    }
                    int i14 = i8;
                    if (i10 != 8) {
                        break;
                    }
                    i6 = i14;
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
}
