package w4;

import i4.AbstractC1117a;
import java.io.Serializable;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849a implements Comparable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final C1849a f15435f = new C1849a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public final long f15436c;

    /* renamed from: e, reason: collision with root package name */
    public final long f15437e;

    public C1849a(long j3, long j4) {
        this.f15436c = j3;
        this.f15437e = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1849a c1849a = (C1849a) obj;
        AbstractC1276k.f(c1849a, "other");
        long j3 = c1849a.f15436c;
        long j4 = this.f15436c;
        return j4 != j3 ? Long.compareUnsigned(j4, j3) : Long.compareUnsigned(this.f15437e, c1849a.f15437e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1849a)) {
            return false;
        }
        C1849a c1849a = (C1849a) obj;
        return this.f15436c == c1849a.f15436c && this.f15437e == c1849a.f15437e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15436c ^ this.f15437e);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC1117a.m(this.f15436c, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC1117a.m(this.f15436c, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC1117a.m(this.f15436c, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC1117a.m(this.f15437e, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC1117a.m(this.f15437e, bArr, 24, 2, 8);
        return new String(bArr, AbstractC1763a.a);
    }
}
