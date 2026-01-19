package d5;

import j1.AbstractC1135a;
import java.security.MessageDigest;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class F extends C0952l {

    /* renamed from: h, reason: collision with root package name */
    public final transient byte[][] f11455h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int[] f11456i;

    public F(byte[][] bArr, int[] iArr) {
        super(C0952l.f11483g.f11484c);
        this.f11455h = bArr;
        this.f11456i = iArr;
    }

    @Override // d5.C0952l
    public final String a() {
        throw null;
    }

    @Override // d5.C0952l
    public final C0952l c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f11455h;
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int[] iArr = this.f11456i;
            int i8 = iArr[length + i6];
            int i9 = iArr[i6];
            messageDigest.update(bArr[i6], i8, i9 - i7);
            i6++;
            i7 = i9;
        }
        byte[] digest = messageDigest.digest();
        AbstractC1276k.c(digest);
        return new C0952l(digest);
    }

    @Override // d5.C0952l
    public final int d() {
        return this.f11456i[this.f11455h.length - 1];
    }

    @Override // d5.C0952l
    public final String e() {
        return t().e();
    }

    @Override // d5.C0952l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0952l) {
            C0952l c0952l = (C0952l) obj;
            if (c0952l.d() == d() && l(0, c0952l, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // d5.C0952l
    public final int f(byte[] bArr, int i6) {
        AbstractC1276k.f(bArr, "other");
        return t().f(bArr, i6);
    }

    @Override // d5.C0952l
    public final byte[] h() {
        return s();
    }

    @Override // d5.C0952l
    public final int hashCode() {
        int i6 = this.f11485e;
        if (i6 != 0) {
            return i6;
        }
        byte[][] bArr = this.f11455h;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f11456i;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            byte[] bArr2 = bArr[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr2[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        this.f11485e = i8;
        return i8;
    }

    @Override // d5.C0952l
    public final byte i(int i6) {
        byte[][] bArr = this.f11455h;
        int length = bArr.length - 1;
        int[] iArr = this.f11456i;
        AbstractC0942b.e(iArr[length], i6, 1L);
        int g3 = e5.b.g(this, i6);
        return bArr[g3][(i6 - (g3 == 0 ? 0 : iArr[g3 - 1])) + iArr[bArr.length + g3]];
    }

    @Override // d5.C0952l
    public final int j(byte[] bArr) {
        AbstractC1276k.f(bArr, "other");
        return t().j(bArr);
    }

    @Override // d5.C0952l
    public final boolean l(int i6, C0952l c0952l, int i7) {
        AbstractC1276k.f(c0952l, "other");
        if (i6 >= 0 && i6 <= d() - i7) {
            int i8 = i7 + i6;
            int g3 = e5.b.g(this, i6);
            int i9 = 0;
            while (i6 < i8) {
                int[] iArr = this.f11456i;
                int i10 = g3 == 0 ? 0 : iArr[g3 - 1];
                int i11 = iArr[g3] - i10;
                byte[][] bArr = this.f11455h;
                int i12 = iArr[bArr.length + g3];
                int min = Math.min(i8, i11 + i10) - i6;
                if (c0952l.m(i9, bArr[g3], (i6 - i10) + i12, min)) {
                    i9 += min;
                    i6 += min;
                    g3++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // d5.C0952l
    public final boolean m(int i6, byte[] bArr, int i7, int i8) {
        AbstractC1276k.f(bArr, "other");
        if (i6 < 0 || i6 > d() - i8 || i7 < 0 || i7 > bArr.length - i8) {
            return false;
        }
        int i9 = i8 + i6;
        int g3 = e5.b.g(this, i6);
        while (i6 < i9) {
            int[] iArr = this.f11456i;
            int i10 = g3 == 0 ? 0 : iArr[g3 - 1];
            int i11 = iArr[g3] - i10;
            byte[][] bArr2 = this.f11455h;
            int i12 = iArr[bArr2.length + g3];
            int min = Math.min(i9, i11 + i10) - i6;
            if (!AbstractC0942b.a((i6 - i10) + i12, i7, min, bArr2[g3], bArr)) {
                return false;
            }
            i7 += min;
            i6 += min;
            g3++;
        }
        return true;
    }

    @Override // d5.C0952l
    public final C0952l n(int i6, int i7) {
        if (i7 == -1234567890) {
            i7 = d();
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("beginIndex=", i6, " < 0").toString());
        }
        if (i7 > d()) {
            StringBuilder k3 = AbstractC1135a.k("endIndex=", i7, " > length(");
            k3.append(d());
            k3.append(')');
            throw new IllegalArgumentException(k3.toString().toString());
        }
        int i8 = i7 - i6;
        if (i8 < 0) {
            throw new IllegalArgumentException(B3.e.k("endIndex=", i7, i6, " < beginIndex=").toString());
        }
        if (i6 == 0 && i7 == d()) {
            return this;
        }
        if (i6 == i7) {
            return C0952l.f11483g;
        }
        int g3 = e5.b.g(this, i6);
        int g6 = e5.b.g(this, i7 - 1);
        byte[][] bArr = this.f11455h;
        byte[][] bArr2 = (byte[][]) Y3.k.n0(bArr, g3, g6 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f11456i;
        if (g3 <= g6) {
            int i9 = g3;
            int i10 = 0;
            while (true) {
                iArr[i10] = Math.min(iArr2[i9] - i6, i8);
                int i11 = i10 + 1;
                iArr[i10 + bArr2.length] = iArr2[bArr.length + i9];
                if (i9 == g6) {
                    break;
                }
                i9++;
                i10 = i11;
            }
        }
        int i12 = g3 != 0 ? iArr2[g3 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i6 - i12) + iArr[length];
        return new F(bArr2, iArr);
    }

    @Override // d5.C0952l
    public final C0952l p() {
        return t().p();
    }

    @Override // d5.C0952l
    public final void r(C0949i c0949i, int i6) {
        int g3 = e5.b.g(this, 0);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr = this.f11456i;
            int i8 = g3 == 0 ? 0 : iArr[g3 - 1];
            int i9 = iArr[g3] - i8;
            byte[][] bArr = this.f11455h;
            int i10 = iArr[bArr.length + g3];
            int min = Math.min(i6, i9 + i8) - i7;
            int i11 = (i7 - i8) + i10;
            D d6 = new D(bArr[g3], i11, i11 + min, true, false);
            D d7 = c0949i.f11481c;
            if (d7 == null) {
                d6.f11452g = d6;
                d6.f11451f = d6;
                c0949i.f11481c = d6;
            } else {
                D d8 = d7.f11452g;
                AbstractC1276k.c(d8);
                d8.b(d6);
            }
            i7 += min;
            g3++;
        }
        c0949i.f11482e += i6;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f11455h;
        int length = bArr2.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int[] iArr = this.f11456i;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            int i11 = i10 - i7;
            Y3.k.f0(i8, i9, i9 + i11, bArr2[i6], bArr);
            i8 += i11;
            i6++;
            i7 = i10;
        }
        return bArr;
    }

    public final C0952l t() {
        return new C0952l(s());
    }

    @Override // d5.C0952l
    public final String toString() {
        return t().toString();
    }
}
