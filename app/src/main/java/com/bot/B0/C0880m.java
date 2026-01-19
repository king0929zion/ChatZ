package b0;

/* renamed from: b0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880m {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10999b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11000c;

    public C0880m(int i6, long[] jArr, Object[] objArr) {
        this.a = i6;
        this.f10999b = jArr;
        this.f11000c = objArr;
    }

    public final int a(long j3) {
        int i6 = this.a - 1;
        if (i6 != -1) {
            long[] jArr = this.f10999b;
            int i7 = 0;
            if (i6 != 0) {
                while (i7 <= i6) {
                    int i8 = (i7 + i6) >>> 1;
                    long j4 = jArr[i8] - j3;
                    if (j4 < 0) {
                        i7 = i8 + 1;
                    } else {
                        if (j4 <= 0) {
                            return i8;
                        }
                        i6 = i8 - 1;
                    }
                }
                return -(i7 + 1);
            }
            long j5 = jArr[0];
            if (j5 == j3) {
                return 0;
            }
            if (j5 > j3) {
                return -2;
            }
        }
        return -1;
    }

    public final C0880m b(long j3, Object obj) {
        long[] jArr;
        int i6;
        Object[] objArr = this.f11000c;
        int i7 = 0;
        int i8 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i8++;
            }
        }
        int i9 = i8 + 1;
        long[] jArr2 = new long[i9];
        Object[] objArr2 = new Object[i9];
        if (i9 > 1) {
            int i10 = 0;
            while (true) {
                jArr = this.f10999b;
                i6 = this.a;
                if (i7 >= i9 || i10 >= i6) {
                    break;
                }
                long j4 = jArr[i10];
                Object obj3 = objArr[i10];
                if (j4 > j3) {
                    jArr2[i7] = j3;
                    objArr2[i7] = obj;
                    i7++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i7] = j4;
                    objArr2[i7] = obj3;
                    i7++;
                }
                i10++;
            }
            if (i10 == i6) {
                jArr2[i8] = j3;
                objArr2[i8] = obj;
            } else {
                while (i7 < i9) {
                    long j5 = jArr[i10];
                    Object obj4 = objArr[i10];
                    if (obj4 != null) {
                        jArr2[i7] = j5;
                        objArr2[i7] = obj4;
                        i7++;
                    }
                    i10++;
                }
            }
        } else {
            jArr2[0] = j3;
            objArr2[0] = obj;
        }
        return new C0880m(i9, jArr2, objArr2);
    }
}
