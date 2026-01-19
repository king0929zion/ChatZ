package d5;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f11447b;

    /* renamed from: c, reason: collision with root package name */
    public int f11448c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11449d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11450e;

    /* renamed from: f, reason: collision with root package name */
    public D f11451f;

    /* renamed from: g, reason: collision with root package name */
    public D f11452g;

    public D() {
        this.a = new byte[8192];
        this.f11450e = true;
        this.f11449d = false;
    }

    public final D a() {
        D d6 = this.f11451f;
        if (d6 == this) {
            d6 = null;
        }
        D d7 = this.f11452g;
        AbstractC1276k.c(d7);
        d7.f11451f = this.f11451f;
        D d8 = this.f11451f;
        AbstractC1276k.c(d8);
        d8.f11452g = this.f11452g;
        this.f11451f = null;
        this.f11452g = null;
        return d6;
    }

    public final void b(D d6) {
        AbstractC1276k.f(d6, "segment");
        d6.f11452g = this;
        d6.f11451f = this.f11451f;
        D d7 = this.f11451f;
        AbstractC1276k.c(d7);
        d7.f11452g = d6;
        this.f11451f = d6;
    }

    public final D c() {
        this.f11449d = true;
        return new D(this.a, this.f11447b, this.f11448c, true, false);
    }

    public final void d(D d6, int i6) {
        AbstractC1276k.f(d6, "sink");
        byte[] bArr = d6.a;
        if (!d6.f11450e) {
            throw new IllegalStateException("only owner can write");
        }
        int i7 = d6.f11448c;
        int i8 = i7 + i6;
        if (i8 > 8192) {
            if (d6.f11449d) {
                throw new IllegalArgumentException();
            }
            int i9 = d6.f11447b;
            if (i8 - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            Y3.k.f0(0, i9, i7, bArr, bArr);
            d6.f11448c -= d6.f11447b;
            d6.f11447b = 0;
        }
        int i10 = d6.f11448c;
        int i11 = this.f11447b;
        Y3.k.f0(i10, i11, i11 + i6, this.a, bArr);
        d6.f11448c += i6;
        this.f11447b += i6;
    }

    public D(byte[] bArr, int i6, int i7, boolean z5, boolean z6) {
        AbstractC1276k.f(bArr, "data");
        this.a = bArr;
        this.f11447b = i6;
        this.f11448c = i7;
        this.f11449d = z5;
        this.f11450e = z6;
    }
}
