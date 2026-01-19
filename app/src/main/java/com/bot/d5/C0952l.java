package d5;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* renamed from: d5.l */
/* loaded from: classes.dex */
public class C0952l implements Serializable, Comparable {

    /* renamed from: g */
    public static final C0952l f11483g = new C0952l(new byte[0]);

    /* renamed from: c */
    public final byte[] f11484c;

    /* renamed from: e */
    public transient int f11485e;

    /* renamed from: f */
    public transient String f11486f;

    public C0952l(byte[] bArr) {
        AbstractC1276k.f(bArr, "data");
        this.f11484c = bArr;
    }

    public static int g(C0952l c0952l, C0952l c0952l2) {
        c0952l.getClass();
        AbstractC1276k.f(c0952l2, "other");
        return c0952l.f(c0952l2.h(), 0);
    }

    public static int k(C0952l c0952l, C0952l c0952l2) {
        c0952l.getClass();
        AbstractC1276k.f(c0952l2, "other");
        return c0952l.j(c0952l2.h());
    }

    public static /* synthetic */ C0952l o(C0952l c0952l, int i6, int i7, int i8) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = -1234567890;
        }
        return c0952l.n(i6, i7);
    }

    public String a() {
        byte[] bArr = AbstractC0941a.a;
        byte[] bArr2 = this.f11484c;
        AbstractC1276k.f(bArr2, "<this>");
        AbstractC1276k.f(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            byte b5 = bArr2[i6];
            int i8 = i6 + 2;
            byte b6 = bArr2[i6 + 1];
            i6 += 3;
            byte b7 = bArr2[i8];
            bArr3[i7] = bArr[(b5 & 255) >> 2];
            bArr3[i7 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i9 = i7 + 3;
            bArr3[i7 + 2] = bArr[((b6 & 15) << 2) | ((b7 & 255) >> 6)];
            i7 += 4;
            bArr3[i9] = bArr[b7 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b8 = bArr2[i6];
            bArr3[i7] = bArr[(b8 & 255) >> 2];
            bArr3[i7 + 1] = bArr[(b8 & 3) << 4];
            bArr3[i7 + 2] = 61;
            bArr3[i7 + 3] = 61;
        } else if (length2 == 2) {
            int i10 = i6 + 1;
            byte b9 = bArr2[i6];
            byte b10 = bArr2[i10];
            bArr3[i7] = bArr[(b9 & 255) >> 2];
            bArr3[i7 + 1] = bArr[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr3[i7 + 2] = bArr[(b10 & 15) << 2];
            bArr3[i7 + 3] = 61;
        }
        return new String(bArr3, AbstractC1763a.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(C0952l c0952l) {
        AbstractC1276k.f(c0952l, "other");
        int d6 = d();
        int d7 = c0952l.d();
        int min = Math.min(d6, d7);
        for (int i6 = 0; i6 < min; i6++) {
            int i7 = i(i6) & 255;
            int i8 = c0952l.i(i6) & 255;
            if (i7 != i8) {
                return i7 < i8 ? -1 : 1;
            }
        }
        if (d6 == d7) {
            return 0;
        }
        return d6 < d7 ? -1 : 1;
    }

    public C0952l c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f11484c, 0, d());
        byte[] digest = messageDigest.digest();
        AbstractC1276k.c(digest);
        return new C0952l(digest);
    }

    public int d() {
        return this.f11484c.length;
    }

    public String e() {
        byte[] bArr = this.f11484c;
        char[] cArr = new char[bArr.length * 2];
        int i6 = 0;
        for (byte b5 : bArr) {
            int i7 = i6 + 1;
            char[] cArr2 = e5.b.a;
            cArr[i6] = cArr2[(b5 >> 4) & 15];
            i6 += 2;
            cArr[i7] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0952l) {
            C0952l c0952l = (C0952l) obj;
            int d6 = c0952l.d();
            byte[] bArr = this.f11484c;
            if (d6 == bArr.length && c0952l.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] bArr, int i6) {
        AbstractC1276k.f(bArr, "other");
        byte[] bArr2 = this.f11484c;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i6, 0);
        if (max > length) {
            return -1;
        }
        while (!AbstractC0942b.a(max, 0, bArr.length, bArr2, bArr)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public byte[] h() {
        return this.f11484c;
    }

    public int hashCode() {
        int i6 = this.f11485e;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = Arrays.hashCode(this.f11484c);
        this.f11485e = hashCode;
        return hashCode;
    }

    public byte i(int i6) {
        return this.f11484c[i6];
    }

    public int j(byte[] bArr) {
        AbstractC1276k.f(bArr, "other");
        int d6 = d();
        byte[] bArr2 = this.f11484c;
        for (int min = Math.min(d6, bArr2.length - bArr.length); -1 < min; min--) {
            if (AbstractC0942b.a(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i6, C0952l c0952l, int i7) {
        AbstractC1276k.f(c0952l, "other");
        return c0952l.m(0, this.f11484c, i6, i7);
    }

    public boolean m(int i6, byte[] bArr, int i7, int i8) {
        AbstractC1276k.f(bArr, "other");
        if (i6 < 0) {
            return false;
        }
        byte[] bArr2 = this.f11484c;
        return i6 <= bArr2.length - i8 && i7 >= 0 && i7 <= bArr.length - i8 && AbstractC0942b.a(i6, i7, i8, bArr2, bArr);
    }

    public C0952l n(int i6, int i7) {
        if (i7 == -1234567890) {
            i7 = d();
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f11484c;
        if (i7 > bArr.length) {
            throw new IllegalArgumentException(B3.e.q(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i7 - i6 >= 0) {
            return (i6 == 0 && i7 == bArr.length) ? this : new C0952l(Y3.k.m0(bArr, i6, i7));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0952l p() {
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f11484c;
            if (i6 >= bArr.length) {
                return this;
            }
            byte b5 = bArr[i6];
            if (b5 >= 65 && b5 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1276k.e(copyOf, "copyOf(...)");
                copyOf[i6] = (byte) (b5 + 32);
                for (int i7 = i6 + 1; i7 < copyOf.length; i7++) {
                    byte b6 = copyOf[i7];
                    if (b6 >= 65 && b6 <= 90) {
                        copyOf[i7] = (byte) (b6 + 32);
                    }
                }
                return new C0952l(copyOf);
            }
            i6++;
        }
    }

    public final String q() {
        String str = this.f11486f;
        if (str != null) {
            return str;
        }
        byte[] h3 = h();
        AbstractC1276k.f(h3, "<this>");
        String str2 = new String(h3, AbstractC1763a.a);
        this.f11486f = str2;
        return str2;
    }

    public void r(C0949i c0949i, int i6) {
        c0949i.O(this.f11484c, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0130, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0134, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d6, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0173, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x017a, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x016c, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01aa, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ad, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b0, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0140, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b3, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0096, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0085, code lost:
    
        if (r6 == 64) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        if (r6 == 64) goto L427;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.C0952l.toString():java.lang.String");
    }
}
