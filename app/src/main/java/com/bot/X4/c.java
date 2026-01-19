package X4;

import d5.AbstractC0942b;
import d5.C;
import d5.C0952l;
import java.io.IOException;
import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final C f9427c;

    /* renamed from: f, reason: collision with root package name */
    public int f9430f;

    /* renamed from: g, reason: collision with root package name */
    public int f9431g;
    public int a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9426b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0711b[] f9428d = new C0711b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f9429e = 7;

    public c(r rVar) {
        this.f9427c = AbstractC0942b.c(rVar);
    }

    public final int a(int i6) {
        int i7;
        int i8 = 0;
        if (i6 > 0) {
            int length = this.f9428d.length;
            while (true) {
                length--;
                i7 = this.f9429e;
                if (length < i7 || i6 <= 0) {
                    break;
                }
                C0711b c0711b = this.f9428d[length];
                AbstractC1276k.c(c0711b);
                int i9 = c0711b.f9425c;
                i6 -= i9;
                this.f9431g -= i9;
                this.f9430f--;
                i8++;
            }
            C0711b[] c0711bArr = this.f9428d;
            System.arraycopy(c0711bArr, i7 + 1, c0711bArr, i7 + 1 + i8, this.f9430f);
            this.f9429e += i8;
        }
        return i8;
    }

    public final C0952l b(int i6) {
        if (i6 >= 0) {
            C0711b[] c0711bArr = e.a;
            if (i6 <= c0711bArr.length - 1) {
                return c0711bArr[i6].a;
            }
        }
        int length = this.f9429e + 1 + (i6 - e.a.length);
        if (length >= 0) {
            C0711b[] c0711bArr2 = this.f9428d;
            if (length < c0711bArr2.length) {
                C0711b c0711b = c0711bArr2[length];
                AbstractC1276k.c(c0711b);
                return c0711b.a;
            }
        }
        throw new IOException("Header index too large " + (i6 + 1));
    }

    public final void c(C0711b c0711b) {
        this.f9426b.add(c0711b);
        int i6 = c0711b.f9425c;
        int i7 = this.a;
        if (i6 > i7) {
            Y3.k.o0(null, r7, 0, this.f9428d.length);
            this.f9429e = this.f9428d.length - 1;
            this.f9430f = 0;
            this.f9431g = 0;
            return;
        }
        a((this.f9431g + i6) - i7);
        int i8 = this.f9430f + 1;
        C0711b[] c0711bArr = this.f9428d;
        if (i8 > c0711bArr.length) {
            C0711b[] c0711bArr2 = new C0711b[c0711bArr.length * 2];
            System.arraycopy(c0711bArr, 0, c0711bArr2, c0711bArr.length, c0711bArr.length);
            this.f9429e = this.f9428d.length - 1;
            this.f9428d = c0711bArr2;
        }
        int i9 = this.f9429e;
        this.f9429e = i9 - 1;
        this.f9428d[i9] = c0711b;
        this.f9430f++;
        this.f9431g += i6;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [d5.i, java.lang.Object] */
    public final C0952l d() {
        C c6 = this.f9427c;
        byte readByte = c6.readByte();
        byte[] bArr = R4.b.a;
        int i6 = readByte & 255;
        int i7 = 0;
        boolean z5 = (readByte & 128) == 128;
        long e6 = e(i6, 127);
        if (!z5) {
            return c6.k(e6);
        }
        ?? obj = new Object();
        int[] iArr = y.a;
        AbstractC1276k.f(c6, "source");
        B3.s sVar = y.f9537c;
        B3.s sVar2 = sVar;
        int i8 = 0;
        for (long j3 = 0; j3 < e6; j3++) {
            byte readByte2 = c6.readByte();
            byte[] bArr2 = R4.b.a;
            i7 = (i7 << 8) | (readByte2 & 255);
            i8 += 8;
            while (i8 >= 8) {
                B3.s[] sVarArr = (B3.s[]) sVar2.f555f;
                AbstractC1276k.c(sVarArr);
                sVar2 = sVarArr[(i7 >>> (i8 - 8)) & 255];
                AbstractC1276k.c(sVar2);
                if (((B3.s[]) sVar2.f555f) == null) {
                    obj.S(sVar2.f553c);
                    i8 -= sVar2.f554e;
                    sVar2 = sVar;
                } else {
                    i8 -= 8;
                }
            }
        }
        while (i8 > 0) {
            B3.s[] sVarArr2 = (B3.s[]) sVar2.f555f;
            AbstractC1276k.c(sVarArr2);
            B3.s sVar3 = sVarArr2[(i7 << (8 - i8)) & 255];
            AbstractC1276k.c(sVar3);
            int i9 = sVar3.f554e;
            if (((B3.s[]) sVar3.f555f) != null || i9 > i8) {
                break;
            }
            obj.S(sVar3.f553c);
            i8 -= i9;
            sVar2 = sVar;
        }
        return obj.k(obj.f11482e);
    }

    public final int e(int i6, int i7) {
        int i8 = i6 & i7;
        if (i8 < i7) {
            return i8;
        }
        int i9 = 0;
        while (true) {
            byte readByte = this.f9427c.readByte();
            byte[] bArr = R4.b.a;
            int i10 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i7 + (i10 << i9);
            }
            i7 += (readByte & Byte.MAX_VALUE) << i9;
            i9 += 7;
        }
    }
}
